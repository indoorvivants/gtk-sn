package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoLayoutSerializeFlags

/** Flags that influence the behavior of [method@Pango.Layout.serialize].
  *
  * New members may be added to this enumeration over time.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LayoutSerializeFlags private (val raw: PangoLayoutSerializeFlags):
  def is(kv: LayoutSerializeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[LayoutSerializeFlags.KnownValue]
    LayoutSerializeFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"LayoutSerializeFlags(${sb.result().mkString(", ")})"
end LayoutSerializeFlags

object LayoutSerializeFlags:
  export KnownValue.*

  def fromRaw(raw: PangoLayoutSerializeFlags) = new LayoutSerializeFlags(raw)

  extension (af: LayoutSerializeFlags)
    def &(other: LayoutSerializeFlags) =
      LayoutSerializeFlags(af.raw & other.raw)
    def |(other: LayoutSerializeFlags) =
      LayoutSerializeFlags(af.raw | other.raw)

  /** Flags that influence the behavior of [method@Pango.Layout.serialize].
    *
    * New members may be added to this enumeration over time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: PangoLayoutSerializeFlags,
      name: scala.Predef.String
  ) extends LayoutSerializeFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** Default behavior
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(
          PangoLayoutSerializeFlags.PANGO_LAYOUT_SERIALIZE_DEFAULT,
          "DEFAULT"
        )

    /** Include context information
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONTEXT
        extends KnownValue(
          PangoLayoutSerializeFlags.PANGO_LAYOUT_SERIALIZE_CONTEXT,
          "CONTEXT"
        )

    /** Include information about the formatted output
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case OUTPUT
        extends KnownValue(
          PangoLayoutSerializeFlags.PANGO_LAYOUT_SERIALIZE_OUTPUT,
          "OUTPUT"
        )
  end KnownValue
end LayoutSerializeFlags
