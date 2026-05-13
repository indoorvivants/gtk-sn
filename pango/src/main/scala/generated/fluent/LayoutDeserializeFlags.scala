package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoLayoutDeserializeFlags

/** Flags that influence the behavior of [func@Pango.Layout.deserialize].
  *
  * New members may be added to this enumeration over time.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags that influence the behavior of [func@Pango.Layout.deserialize].
    *
    * New members may be added to this enumeration over time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: PangoLayoutDeserializeFlags, name: String)
      extends LayoutDeserializeFlags(raw):
    override def toString(): String = this.name

    /** Default behavior
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(
          PangoLayoutDeserializeFlags.PANGO_LAYOUT_DESERIALIZE_DEFAULT,
          "DEFAULT"
        )

    /** Apply context information from the serialization to the `PangoContext`
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONTEXT
        extends KnownValue(
          PangoLayoutDeserializeFlags.PANGO_LAYOUT_DESERIALIZE_CONTEXT,
          "CONTEXT"
        )
  end KnownValue
end LayoutDeserializeFlags
