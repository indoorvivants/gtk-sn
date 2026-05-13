import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*
import FluentErrReason.*
import scala.util.boundary

def renderSignal(cls: AugmentedClass, signal: AugmentedSignal)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val signalName = namingPolicy.makeSignalName(signal.name)

    coll.addAll(Seq(Effect.needsRuntime, Effect.needsGobjectRuntime))

    val arguments = signal.parameters.collect:
      case p: Parameter =>
        val tpe = p.tpe.getOrElse(
          raiseWith(_.MethodParameterHasNoType(signal.name, p.name))
        )
        val name =
          p.name.getOrElse(raiseWith(_.Other("Signal parameter has no name")))

        val simpleTpe = tpe match
          case t: Type       => t
          case at: ArrayType =>
            raiseWith(_.Other("Array signal parameters not supported yet"))

        (
          name = camelify(name),
          tpe = renderSignalType(simpleTpe, TypePosition.ParameterType)
        )

    arguments.map(_.tpe).foreach(c => coll.addAll(c.effects))

    val paramsType =
      val args = arguments
        .map(tp => escape(tp.name) + ":" + tp.tpe.fluent)
        .mkString("(", ", ", ")")

      if arguments.isEmpty then "EmptyTuple.type" else args

    val returnType = signal.returnType
      .collect:
        case t: Type       => renderSignalType(t, TypePosition.ReturnType)
        case at: ArrayType =>
          raiseWith(
            _.Other(
              "Array signal parameters in return types not supported yet"
            )
          )
      .getOrElse(SignalTypeMapping("Unit", "Unit"))

    coll.addAll(returnType.effects)

    coll.add(Effect.RequiresImport("sn.gnome.gobject.runtime", "*"))
    coll.addAll(
      Effect.requiresImports(
        "sn.gnome.gobject.internal",
        "GClosure",
        "GConnectFlags",
        "GClosureNotify",
        "g_signal_connect_data"
      )
    )
    coll.addAll(
      Effect.requiresImports("sn.gnome.glib.internal", "gpointer", "gchar")
    )

    val functionType =
      if arguments.isEmpty then s"=> ${returnType.fluent}"
      else s"($paramsType) => ${returnType.fluent}"

    renderComment(signal.doc)
    block(
      s"def $signalName(handler: $functionType)(using Runtime) =",
      s"end $signalName"
    ):
      val funcArity = arguments.length + 2
      val signalRegParams = s"this.type, $paramsType, ${returnType.fluent}"
      line(s"type SignalRegType = SignalRegistration[$signalRegParams]")
      block(s"val c_handler = CFuncPtr${funcArity}.fromScalaFunction {", "}"):
        line("(")
        line(s"self: Ptr[${cls.cType}],")
        arguments.foreach: arg =>
          line(s"${escape(arg.name)}: ${arg.tpe.internal} /* param */, ")
        line(
          s"data: Ptr[SignalRegType]"
        )
        line(") => ")
        line("val sr = !data")

        val call =
          val params = arguments
            .map: arg =>
              s"${escape(arg.name)} = ${arg.tpe.intoFluent(escape(arg.name))}"
            .mkString(", ")
          s"sr.handler(($params))"

          if arguments.isEmpty then "sr.handler(EmptyTuple)"
          else s"sr.handler(($params))"

        line(s"${returnType.intoInternal(call)}")
      line(
        if arguments.isEmpty then "val f = (e: EmptyTuple.type) => handler"
        else "val f = handler"
      )
      line(s"val sr: SignalRegType = SignalRegistration(this, f)")
      line("val (ptr, mem) = Captured.unsafe(sr)")

      block("val destroy_data = CFuncPtr2.fromScalaFunction {", "}"):
        line("(data: gpointer, closure: Ptr[GClosure]) => ")
        line(
          s"val sr = !data.asInstanceOf[Ptr[SignalRegType]]"
        )
        line("GCRoots.removeRoot(sr)")

      line("val flags = GConnectFlags.G_CONNECT_DEFAULT")
      line(s"val signal = c\"${signal.name}\"")
      signalRegLines.foreach(line(_))

case class SignalTypeMapping(
    fluent: String,
    internal: String,
    massageIntoInternal: List[Massage] = Nil,
    massageIntoFluent: List[Massage] = Nil,
    effects: List[Effect] = Nil
):
  def withMassageIntoInternal(m: Massage*) =
    copy(massageIntoInternal = massageIntoInternal ++ m)
  def withMassageIntofluent(m: Massage*) =
    copy(massageIntoFluent = massageIntoFluent ++ m)
  def withEffect(eff: Effect*) = copy(effects = effects ++ eff)

  def intoFluent(ref: String) =
    massageIntoFluent.foldLeft(ref): (cur, m) =>
      m.render(cur)

  def intoInternal(ref: String) =
    massageIntoInternal.foldLeft(ref): (cur, m) =>
      m.render(cur)

end SignalTypeMapping

def renderSignalType(tpe: Type, pos: TypePosition)(using
    Label[FluentErr],
    GlobalKnowledge,
    NamingPolicy
): SignalTypeMapping =

  val typeName = tpe.name
  val typeValue =
    try Some(tpe.typeValue)
    catch
      case exc: NoSuchElementException =>
        None

  def whenIsClass(
      f: (cls: String, raw: String, effects: List[Effect]) => Option[
        SignalTypeMapping
      ]
  ) =
    typeName.flatMap: name =>
      globalKnowledge.names
        .get(name)
        .collect:
          case gn if gn.tpe.isInstanceOf[NameType.Class] =>
            val tv = gn.tpe.asInstanceOf[NameType.Class]
            f(
              gn.fluent,
              tv.typeValue,
              gn.effects :+ Effect
                .internalNamespaceImport(gn.namespace, tv.typeValue)
            )
        .flatten

  def whenIsEnum(
      f: (en: String, raw: String, effects: List[Effect]) => Option[
        SignalTypeMapping
      ]
  ) =
    typeName.flatMap: name =>
      globalKnowledge.names
        .get(name)
        .collect:
          case name @ GlobalName(
                _,
                _,
                short,
                effects,
                NameType.Enumeration(typeValue)
              ) =>
            f(
              name.fluent,
              typeValue,
              effects :+ Effect
                .internalNamespaceImport(name.namespace, typeValue)
            )
        .flatten

  def whenIsBitfield(
      f: (en: String, raw: String, effects: List[Effect]) => Option[
        SignalTypeMapping
      ]
  ) =
    typeName.flatMap: name =>
      globalKnowledge.names
        .get(name)
        .collect:
          case name @ GlobalName(
                _,
                _,
                short,
                effects,
                NameType.Bitfield(typeValue)
              ) =>
            f(
              name.fluent,
              typeValue,
              effects :+ Effect
                .internalNamespaceImport(name.namespace, typeValue)
            )
        .flatten

  def whenFull(
      name: String,
      cName: String
  )(fluent: String, internal: String) =
    Option
      .when(typeName.contains(name) && typeValue.contains(cName))(
        SignalTypeMapping(fluent, internal)
      )

  def whenTypeValue(cName: String)(fluent: String, internal: String) =
    Option
      .when(typeValue.contains(cName))(
        SignalTypeMapping(fluent, internal)
      )

  def whenTypeName(name: String)(fluent: String, internal: String) =
    Option
      .when(typeName.contains(name))(
        SignalTypeMapping(fluent, internal)
      )

  def whenParam(o: Option[SignalTypeMapping]) =
    Option.when(pos == TypePosition.ParameterType)(o).flatten

  Seq(
    whenIsClass((cls, raw, effects) =>
      Some(
        SignalTypeMapping(cls, s"Ptr[$raw]")
          .withEffect(effects*)
          .withMassageIntofluent(
            Massage.Cast("Ptr[Byte]"),
            Massage.Apply(s"sr.runtime.get[${cls}]")
          )
      )
    ),
    whenIsEnum((cls, raw, effects) =>
      Some(
        SignalTypeMapping(cls, raw)
          .withEffect(effects*)
          .withMassageIntofluent(Massage.Apply(s"$cls.fromRaw"))
      )
    ),
    whenIsBitfield((cls, raw, effects) =>
      Some(
        SignalTypeMapping(cls, raw)
          .withEffect(effects*)
          .withMassageIntofluent(Massage.Apply(s"$cls.fromRaw"))
      )
    ),
    whenFull("gint", "gint")("Int", "Int"),
    whenFull("none", "void")("Unit", "Unit"),
    whenFull("gboolean", "gboolean")("Boolean", "Boolean"),
    whenParam(
      whenFull("utf8", "gchar*")("String", "CString").map(
        _.withMassageIntofluent(Massage.Apply("fromCString"))
      )
    )
  ).reduce(_ orElse _)
    .getOrElse(
      raiseWith(_.Other(s"Signal param/return type cannot be serialised: $tpe"))
    )
end renderSignalType

private def signalRegLines =
  """
 |SignalHandleID(
 |  g_signal_connect_data(
 |    gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
 |    signal.asInstanceOf[Ptr[gchar]],
 |    c_handler.asGCallback,
 |    gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
 |    GClosureNotify(destroy_data), // destroy_data
 |    flags
 |  ).value
 |)
    """.trim.stripMargin.linesIterator

val importUnsigned =
  Effect.RequiresImport("_root_.scala.scalanative.unsigned", "*")

val importUnsafe =
  Effect.RequiresImport("_root_.scala.scalanative.unsafe", "*")

val importGlib = (nm: String) =>
  Effect.RequiresImport("sn.gnome.glib.internal", nm)
