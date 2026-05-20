import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*
import FluentErrReason.*

def renderConstant(const: AugmentedConstant)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val tpe = const.tpe.getOrElse(
      raiseWith(_.Other(s"Constant ${const.name} has no type"))
    )

    val constType = renderConstantType(tpe, const.raw.valueAttribute)

    coll.addAll(constType.typeMapping.effects)

    renderComment(const.doc)
    line(
      s"final val ${const.name} : ${constType.typeMapping.scalaRepr} = ${constType.typeMapping.fromUnsafeForm(constType.constValue)}"
    )

case class ConstantRepr(constValue: String, typeMapping: TypeMapping)

def renderConstantType(tpe: Type, rawValue: String)(using
    Label[FluentErr]
): ConstantRepr =

  val (typeName, typeValue) =
    // There's a bug in GIR generator which reports  0xFFFFFFFFu as gint, but it doesn't fit there
    if rawValue == "4294967295" && tpe.name.contains("gint") && tpe.typeValue
        .contains("gint")
    then Some("guint") -> "guint"
    else tpe.name -> safeGetTypeValue(tpe)

  def whenFull(
      name: String,
      cName: String
  )(typeRepr: String, valueRepr: String) =
    Option
      .when(typeName.contains(name) && typeValue.trim == cName)(
        ConstantRepr(valueRepr, TypeMapping(typeRepr))
      )

  def whenTypeValue(cName: String)(typeRepr: String, valueRepr: String) =
    Option
      .when(typeValue.trim == cName)(
        ConstantRepr(valueRepr, TypeMapping(typeRepr))
      )

  def whenTypeName(name: String)(typeRepr: String, valueRepr: String) =
    Option
      .when(typeName.contains(name))(
        ConstantRepr(valueRepr, TypeMapping(typeRepr))
      )

  val importUnsigned =
    Effect.RequiresImport("_root_.scala.scalanative.unsigned", "*")

  val importUnsafe =
    Effect.RequiresImport("_root_.scala.scalanative.unsafe", "*")

  Seq(
    whenTypeName("utf8")("scala.Predef.String", s"\"$rawValue\""),
    whenFull("gint", "gint")("Int", rawValue),
    whenFull("gdouble", "gdouble")("Double", rawValue),
    whenFull("gboolean", "gboolean")("Boolean", rawValue),
    whenFull("guint", "guint")("UInt", rawValue + "L").map(cr =>
      cr.copy(typeMapping =
        cr.typeMapping
          .withEffect(importUnsigned)
          .withMassageFromUnsafe(Massage.Field("toUInt"))
      )
    )
  )
    .reduce(_ orElse _)
    .getOrElse(
      raiseWith(
        _.Other(
          s"Cannot represent constant type $tpe with raw value `$rawValue`"
        )
      )
    )
end renderConstantType
