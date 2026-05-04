package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoLayoutSerializeFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags that influence the behavior of [method@Pango.Layout.serialize].
  *
  * New members may be added to this enumeration over time.
  */
class LayoutSerializeFlags private (val raw: PangoLayoutSerializeFlags):
  def is(kv: LayoutSerializeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[LayoutSerializeFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags that influence the behavior of [method@Pango.Layout.serialize].
    *
    * New members may be added to this enumeration over time.
    */
  enum KnownValue(override val raw: PangoLayoutSerializeFlags, name: String)
      extends LayoutSerializeFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default behavior
      */
    case DEFAULT
        extends KnownValue(
          PangoLayoutSerializeFlags.PANGO_LAYOUT_SERIALIZE_DEFAULT,
          "DEFAULT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Include context information
      */
    case CONTEXT
        extends KnownValue(
          PangoLayoutSerializeFlags.PANGO_LAYOUT_SERIALIZE_CONTEXT,
          "CONTEXT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Include information about the formatted output
      */
    case OUTPUT
        extends KnownValue(
          PangoLayoutSerializeFlags.PANGO_LAYOUT_SERIALIZE_OUTPUT,
          "OUTPUT"
        )
  end KnownValue
end LayoutSerializeFlags
