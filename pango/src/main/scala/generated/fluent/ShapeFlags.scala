package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoShapeFlags

/** Flags influencing the shaping process.
  *
  * `PangoShapeFlags` can be passed to [func@Pango.shape_with_flags].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShapeFlags private (val raw: PangoShapeFlags):
  def is(kv: ShapeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ShapeFlags.KnownValue]
    ShapeFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ShapeFlags(${sb.result().mkString(", ")})"
end ShapeFlags

object ShapeFlags:
  export KnownValue.*

  def fromRaw(raw: PangoShapeFlags) = new ShapeFlags(raw)

  extension (af: ShapeFlags)
    def &(other: ShapeFlags) =
      ShapeFlags(af.raw & other.raw)
    def |(other: ShapeFlags) =
      ShapeFlags(af.raw | other.raw)

  /** Flags influencing the shaping process.
    *
    * `PangoShapeFlags` can be passed to [func@Pango.shape_with_flags].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: PangoShapeFlags, name: String)
      extends ShapeFlags(raw):
    override def toString(): String = this.name

    /** Default value
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(PangoShapeFlags.PANGO_SHAPE_NONE, "NONE")

    /** Round glyph positions and widths to whole device units This option
      * should be set if the target renderer can't do subpixel positioning of
      * glyphs
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ROUND_POSITIONS
        extends KnownValue(
          PangoShapeFlags.PANGO_SHAPE_ROUND_POSITIONS,
          "ROUND_POSITIONS"
        )
  end KnownValue
end ShapeFlags
