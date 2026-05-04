package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoLayoutDeserializeFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags that influence the behavior of [func@Pango.Layout.deserialize].
  *
  * New members may be added to this enumeration over time.
  */
class LayoutDeserializeFlags private (val raw: PangoLayoutDeserializeFlags):
  def is(kv: LayoutDeserializeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[LayoutDeserializeFlags.KnownValue]
    LayoutDeserializeFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"LayoutDeserializeFlags(${sb.result().mkString(", ")})"
end LayoutDeserializeFlags

object LayoutDeserializeFlags:
  export KnownValue.*

  def fromRaw(raw: PangoLayoutDeserializeFlags) = new LayoutDeserializeFlags(
    raw
  )

  extension (af: LayoutDeserializeFlags)
    def &(other: LayoutDeserializeFlags) =
      LayoutDeserializeFlags(af.raw & other.raw)
    def |(other: LayoutDeserializeFlags) =
      LayoutDeserializeFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags that influence the behavior of [func@Pango.Layout.deserialize].
    *
    * New members may be added to this enumeration over time.
    */
  enum KnownValue(override val raw: PangoLayoutDeserializeFlags, name: String)
      extends LayoutDeserializeFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default behavior
      */
    case DEFAULT
        extends KnownValue(
          PangoLayoutDeserializeFlags.PANGO_LAYOUT_DESERIALIZE_DEFAULT,
          "DEFAULT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Apply context information from the serialization to the `PangoContext`
      */
    case CONTEXT
        extends KnownValue(
          PangoLayoutDeserializeFlags.PANGO_LAYOUT_DESERIALIZE_CONTEXT,
          "CONTEXT"
        )
  end KnownValue
end LayoutDeserializeFlags
