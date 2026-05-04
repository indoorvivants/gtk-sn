import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scala.util.boundary.Label
import scala.util.boundary

val StringExtractorName = "__sn_extract_string"

val stringExtractor =
  val f: () => RenderingContext ?=> Unit = () =>
    block(
      s"private inline def $StringExtractorName(str: String | CString)(using Zone): CString = ",
      s"end $StringExtractorName"
    ):
      block("str match", "end match"):
        line("case s: String => toCString(s)")
        line("case s: CString => s")
  StringExtractorName -> Effect.RequiresDefinition(f)
end stringExtractor

val decodeNullablePtrs =
  val name = "__decode_nullable_ptrs"
  val f: () => RenderingContext ?=> Unit = () =>
    block(
      s"private inline def $name[T](p: Ptr[Ptr[T]])(using ptag: Tag[T]): Array[Ptr[T]] = ",
      s"end $name"
    ):
      line("val ab = Array.newBuilder[Ptr[T]]")
      line("var offset = 0 ")
      line("val tg = Tag.materializePtrTag(ptag)")
      block("while(p(offset)(using tg) != null) do", "end while"):
        line("ab += p(offset)(using tg)")
        line("offset += 1 ")
      line("ab.result()")

  name -> Effect.RequiresDefinition(f)
end decodeNullablePtrs

enum TypePosition:
  case ParameterType, ReturnType

def renderType(
    tpe: Type | ArrayType,
    position: TypePosition = TypePosition.ParameterType,
    expectedRawType: Option[String] = None
)(using
    global: GlobalKnowledge,
    policy: NamingPolicy
)(using Label[FluentErr]): TypeMapping =
  val importUnsigned =
    Effect.RequiresImport("_root_.scala.scalanative.unsigned", "*")

  val importUnsafe =
    Effect.RequiresImport("_root_.scala.scalanative.unsafe", "*")

  def importGlib(name: String) =
    Effect.RequiresImport(policy.namespaceToInternalPackage("glib"), name)

  def importGio(name: String) =
    Effect.RequiresImport(policy.namespaceToInternalPackage("gio"), name)

  def importGtk(name: String) =
    Effect.RequiresImport(policy.namespaceToInternalPackage("gtk4"), name)

  def requiresStringExtractor(mapping: TypeMapping) =
    mapping
      .withEffect(stringExtractor._2)
      .withMassageIntoUnsafe(Massage.Apply(stringExtractor._1))

  def deconstructCType(name: String): Option[TypeMapping] =
    val original = name
    def go(name: String, level: Int): Option[TypeMapping] =
      name match
        case s"$rest*" =>
          go(rest, level + 1)
        case s"const $rest" =>
          go(rest, level)
        case other =>
          global.names
            .get(other)
            .map: name =>
              val newValue = ("Ptr[" * level) + name.short + ("]" * level)
              TypeMapping(newValue).withEffect(name.effects*)
            .orElse:
              val ct = getCType(None, other)
              ct.map: tm =>
                scribe.info(s"For $original I got $ct")
                val goodName = ("Ptr[" * level) + tm.scalaRepr + ("]" * level)
                val rawName = ("Ptr[" * level) + other + ("]" * level)
                val massage = Massage.Cast(rawName)

                TypeMapping(
                  goodName,
                  effects = tm.effects,
                  // massageIntoUnsafe = List(massage),
                  massageFromUnsafe = Nil
                )

      end match
    end go
    go(name, 0)

  end deconstructCType

  def getCType(typeName: Option[String], typeValue: String) =
    def whenTypeValue(cName: String)(result: String) =
      Option
        .when(typeValue.trim == cName)(
          TypeMapping(result)
        )

    def whenFull(name: String, cName: String)(result: String) =
      val found = Option
        .when(typeName.contains(name) && typeValue.trim == cName)(
          TypeMapping(result)
        )
      if typeName.contains(name) then
        if typeValue.trim == cName then Some(TypeMapping(result))
        else
          scribe.debug(
            s"whenFull($name) did not match cName: expected ${cName}, got ${typeValue}"
          )
          None
      else None
    end whenFull

    def unsignedAlias(glib: String, sn: String) =
      whenTypeValue(glib)(sn)
        .map(_.withEffect(importUnsigned))
        .map(_.withMassageFromUnsafe(Massage.Field("value")))
        .map(_.withMassageIntoUnsafe(Massage.Apply(glib)))
        .map(
          _.withEffect(
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              glib
            )
          )
        )

    def unsafeAlias(glib: String, sn: String) =
      whenTypeValue(glib)(sn)
        .map(_.withEffect(importUnsafe))
        .map(_.withMassageFromUnsafe(Massage.Field("value")))
        .map(_.withMassageIntoUnsafe(Massage.Apply(glib)))
        .map(
          _.withEffect(
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              glib
            )
          )
        )

    val (stringType, stringTypeWrap) =
      position match
        case TypePosition.ParameterType =>
          ("String | CString", requiresStringExtractor(_))
        case TypePosition.ReturnType =>
          (
            "String",
            (tm: TypeMapping) =>
              tm.withEffect(Effect.RequiresZone)
                .withMassageFromUnsafe(
                  Massage.InferredCast,
                  Massage.Apply("fromCString")
                )
          )

    def glibAlias(gName: String, c: String)(scalaName: String) =
      whenFull(gName, c)(scalaName).map(
        _.withMassageIntoUnsafe(Massage.Apply(gName))
          .withMassageFromUnsafe(Massage.Field("value"))
          .withEffect(importGlib(gName))
      )

    List(
      whenTypeValue("const char*")(stringType)
        .map(
          _.withEffect(Effect.RequiresZone)
        )
        .map(stringTypeWrap),
      whenTypeValue("const gchar*")(stringType)
        .map(stringTypeWrap)
        .map(
          _.withEffect(
            Effect.RequiresZone,
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              "gchar"
            )
          )
            .withMassageIntoUnsafe(
              Massage.Cast("Ptr[gchar]")
            )
        ),
      whenTypeValue("char*")(stringType)
        .map(
          _.withEffect(Effect.RequiresZone)
        )
        .map(stringTypeWrap),
      whenTypeValue("const guint8*")("Ptr[guint8]")
        .map(
          _.withEffect(importGlib("guint8"))
            .withMassageIntoUnsafe(
              Massage.Cast("Ptr[guint8]")
            )
        ),
      whenTypeValue("guchar*")("Ptr[UByte]")
        .map(
          _.withEffect(
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              "guchar"
            )
          )
            .withMassageIntoUnsafe(
              Massage.Cast("Ptr[guchar]")
            )
        )
        .map(stringTypeWrap),
      whenTypeValue("gchar*")(stringType)
        .map(stringTypeWrap)
        .map(
          _.withEffect(
            Effect.RequiresZone,
            Effect.RequiresImport(
              policy.namespaceToInternalPackage("glib"),
              "gchar"
            )
          )
            .withMassageIntoUnsafe(
              Massage.Cast("Ptr[gchar]")
            )
        ),
      whenTypeValue("char**")("Ptr[CString]"), // TODO
      whenTypeValue("const char*")(stringType)
        .map(
          _.withEffect(Effect.RequiresZone).withMassageIntoUnsafe(
            Massage.Apply("toCString")
          )
        )
        .map(stringTypeWrap),
      glibAlias("gint", "gint")("Int"),
      glibAlias("gdouble", "gdouble")("Double"),
      glibAlias("gfloat", "gfloat")("Float"),
      whenFull("gfloat", "float")("Float").map(
        _.withMassageIntoUnsafe(Massage.InferredCast)
      ),
      whenTypeValue("gint*")("Ptr[Int]").map(
        _.withMassageFromUnsafe(Massage.InferredCast).withMassageIntoUnsafe(
          Massage.InferredCast
        )
      ),
      whenTypeValue("guint*")("Ptr[guint]").map(
        _.withMassageFromUnsafe(Massage.InferredCast).withMassageIntoUnsafe(
          Massage.InferredCast
        ).withEffect(importGlib("guint"))
      ),
      whenTypeValue("int")("Int"),
      whenTypeValue("goffset")("gint64").map(
        _.withMassageFromUnsafe(Massage.InferredCast)
          .withMassageIntoUnsafe(
            Massage.Apply("goffset")
          )
          .withEffect(importGlib("goffset"))
      ),
      whenTypeValue("gboolean")("Boolean").map(
        _.withMassageFromUnsafe(Massage.Field("value.!=(0)"))
          .withMassageIntoUnsafe(
            Massage.Compare("true", "1", "0"),
            Massage.Apply("gint"),
            Massage.Apply("gboolean")
          )
          .withEffect(importGlib("gboolean"), importGlib("gint"))
      ),
      whenTypeValue("double")("Double"),
      whenTypeValue("va_list")("CVarArgList"),
      glibAlias("gpointer", "gpointer")("Ptr[Byte]"),
      whenTypeValue("gconstpointer")("Ptr[Byte]").map(
        _.withMassageFromUnsafe(
          Massage.Field("value")
        ).withMassageIntoUnsafe(Massage.Apply("gconstpointer"))
          .withEffect(importGlib("gconstpointer"))
      ),
      glibAlias("goffset", "goffset")("Long"),
      whenTypeValue("gunichar")("CUnsignedInt").map(
        _.withMassageFromUnsafe(Massage.Field("value"))
          .withMassageIntoUnsafe(
            Massage.Apply("guint32"),
            Massage.Apply("gunichar")
          )
          .withEffect(importGlib("gunichar"), importGlib("guint32"))
      ),
      whenTypeValue("gpointer")("Ptr[Byte]").map(
        _.withMassageIntoUnsafe(Massage.Apply("gpointer"))
          .withMassageFromUnsafe(Massage.Field("value"))
          .withEffect(importGlib("gpointer"))
      ),
      unsignedAlias("guint8", "UByte"),
      unsignedAlias("guchar", "UByte"),
      unsignedAlias("guint16", "UShort"),
      unsignedAlias("guint", "UInt"),
      whenTypeValue("unsigned")("UInt").map(
        _.withMassageFromUnsafe(Massage.InferredCast)
          .withMassageIntoUnsafe(Massage.Apply("guint"), Massage.InferredCast)
          .withEffect(importGlib("guint"))
          .withEffect(importUnsigned)
      ),
      unsignedAlias("guint32", "UInt"),
      unsignedAlias("guint64", "CUnsignedLongInt"),
      unsignedAlias("gint32", "CInt"),
      unsignedAlias("gint16", "CShort"),
      unsafeAlias("gint64", "CLongInt"),
      unsignedAlias("gulong", "CUnsignedLongInt"),
      unsignedAlias("gsize", "CUnsignedLongInt"),
      unsignedAlias("gssize", "CLongInt"),
      whenTypeValue("uid_t")("uid_t").map(
        _.withEffect(importGio("uid_t"))
      ),
      whenTypeValue("pid_t")("pid_t").map(
        _.withEffect(importGio("pid_t"))
      ),
      glibAlias("gchar", "char")("Byte").map(
        _.withMassageIntoUnsafe(Massage.InferredCast)
      ),
      whenFull("gchar", "gchar")("Byte").map(
        _.withMassageIntoUnsafe(Massage.Apply("gchar"))
          .withMassageFromUnsafe(Massage.Field("value"))
          .withEffect(importGlib("gchar"))
      ),
      glibAlias("gsize", "size_t")("CSize").map(
        _.withMassageIntoUnsafe(Massage.InferredCast)
      ),
      whenTypeValue("void")("Unit"),
      whenFull("ResponseType", "GtkResponseType")("BLA").map(
        _.withMassageIntoUnsafe(Massage.Field("int")).withEffect(
          importGtk("GtkResponseType")
        )
      ),
      whenFull("long double", "long double")("Double")
    ).reduce(_ orElse _)
  end getCType

  def safeGetTypeValue(tpe: Type)(using Label[FluentErr]) =
    try tpe.typeValue
    catch
      case exc: NoSuchElementException =>
        boundary.break(FluentErr.TypeMissingValue(tpe))

  val result = tpe match
    case tpe: Type =>
      lazy val typeValue = safeGetTypeValue(tpe)
      tpe.name
        .flatMap(global.names.get)
        .filterNot(n => n.tpe == NameType.Record || n.tpe == NameType.Callback)
        .map:
          case name if name.tpe == NameType.Interface =>
            TypeMapping(name.short)
              .withEffect(name.effects*)
              .withMassageIntoUnsafe(
                Massage.Field("getUnsafeRawPointer()"),
                Massage.InferredCast
              )
              .withMassageFromUnsafe(
                Massage.InferredCast,
                Massage.New(name.short + ".Abstract")
              )

          case name @ GlobalName(
                _,
                _,
                short,
                effects,
                NameType.Enumeration(typeValue)
              ) =>
            val enumName =
              if name.fluent == "Unit" then "GTKUnit" else name.fluent

            val nameEffects = name.effects.map:
              case Effect.RequiresImport(ns, "Unit") =>
                Effect.RequiresImport(ns, "GTKUnit")
              case other => other

            val base = TypeMapping(enumName)
              .withMassageIntoUnsafe(Massage.Field("raw"))
              .withMassageFromUnsafe(Massage.Apply(s"$enumName.fromRaw"))
              .withEffect(nameEffects*)

            if !expectedRawType.exists(_.endsWith(typeValue)) then
              base.withMassageIntoUnsafe(Massage.Field("value"))
            else base

          case name @ GlobalName(
                _,
                _,
                short,
                effects,
                NameType.Bitfield(typeValue)
              ) =>
            val nameEffects = name.effects

            val base = TypeMapping(name.fluent)
              .withMassageIntoUnsafe(Massage.Field("raw"))
              .withMassageFromUnsafe(Massage.Apply(s"${name.fluent}.fromRaw"))
              .withEffect(nameEffects*)

            if !expectedRawType.exists(_.endsWith(typeValue)) then
              base.withMassageIntoUnsafe(Massage.Field("value"))
            else base

          case name if name.tpe == NameType.Class =>
            val base =
              TypeMapping(name.short)
                .withMassageIntoUnsafe(
                  Massage.Field("getUnsafeRawPointer()"),
                  Massage.InferredCast
                )
                .withMassageFromUnsafe(
                  Massage.InferredCast,
                  Massage.New(name.short)
                )
                .withEffect(name.effects*)

            typeValue match
              case "gpointer" =>
                base
                  .withMassageIntoUnsafe(Massage.Cast("Ptr[Byte]"))
                  .withMassageIntoUnsafe(Massage.Apply("gpointer"))
                  .withEffect(importGlib("gpointer"))
              case "gconstpointer" =>
                base
                  .withMassageIntoUnsafe(Massage.Cast("Ptr[Byte]"))
                  .withMassageIntoUnsafe(Massage.Apply("gconstpointer"))
                  .withEffect(importGlib("gconstpointer"))
              case _ => base
            end match
          case other =>
            TypeMapping(other.short).withEffect(other.effects*)
        .orElse(getCType(tpe.name, typeValue))
        // .orElse(deconstructCType(typeValue))
        .getOrElse(
          boundary.break(FluentErr.CannotRenderType(tpe))
        )

    case ar: ArrayType =>
      val elementType = ar.AnyType.as[Type]
      lazy val typeValue = safeGetTypeValue(elementType)
      lazy val renderedElementType = renderType(elementType)

      ar.typeValue match
        case "char**" =>
          position match
            case TypePosition.ParameterType =>
              TypeMapping("Array[String]")
                .withEffect(stringExtractor._2)
                .withEffect(Effect.RequiresZone)
                .withMassageIntoUnsafe(
                  Massage.Field(s"map(${StringExtractorName})")
                )
                .withMassageIntoUnsafe(Massage.Field("atUnsafe(0)"))
            case TypePosition.ReturnType =>
              TypeMapping("Array[String]")
                .withEffect(decodeNullablePtrs._2)
                .withEffect(Effect.RequiresZone)
                .withMassageFromUnsafe(Massage.Apply(decodeNullablePtrs._1))
                .withMassageFromUnsafe(
                  Massage.Field(s"map(fromCString(_))")
                )

        case _ =>
          boundary.break(FluentErr.CannotRenderArrayType(ar))
          // if typeValue.endsWith("gchar*") then
          //   TypeMapping(s"Ptr[CString]", effects = renderedElementType.effects)
          //     .withMassageIntoUnsafe(Massage.InferredCast)
          // else if typeValue.endsWith("guchar") then
          //   TypeMapping(s"Ptr[UByte]", effects = renderedElementType.effects)
          //     .withMassageIntoUnsafe(Massage.InferredCast)
          //     .withMassageFromUnsafe(Massage.InferredCast)
          // else if typeValue.endsWith("guint8") then
          //   TypeMapping(s"Ptr[guint8]", effects = renderedElementType.effects)
          //     .withMassageIntoUnsafe(Massage.InferredCast)
          //     .withMassageFromUnsafe(Massage.InferredCast)
          // else if typeValue.endsWith("gint") then
          //   TypeMapping(s"Ptr[Int]", effects = renderedElementType.effects)
          //     .withMassageIntoUnsafe(Massage.InferredCast)
          //     .withMassageFromUnsafe(Massage.InferredCast)
          // else if typeValue.endsWith("char*") then
          //   TypeMapping(s"Ptr[CString]", effects = renderedElementType.effects)
          // else
          //   TypeMapping(
          //     s"Ptr[${renderedElementType.scalaRepr}]",
          //     effects = renderedElementType.effects
          //   )
          // end if
      end match

  result.copy(scalaRepr = s"${result.scalaRepr} /* ${expectedRawType} */")
end renderType
