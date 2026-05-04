package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoShapeFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags influencing the shaping process.
  *
  * `PangoShapeFlags` can be passed to [func@Pango.shape_with_flags].
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags influencing the shaping process.
    *
    * `PangoShapeFlags` can be passed to [func@Pango.shape_with_flags].
    */
  enum KnownValue(override val raw: PangoShapeFlags, name: String)
      extends ShapeFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default value
      */
    case NONE extends KnownValue(PangoShapeFlags.PANGO_SHAPE_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Round glyph positions and widths to whole device units This option
      * should be set if the target renderer can't do subpixel positioning of
      * glyphs
      */
    case ROUND_POSITIONS
        extends KnownValue(
          PangoShapeFlags.PANGO_SHAPE_ROUND_POSITIONS,
          "ROUND_POSITIONS"
        )
  end KnownValue
end ShapeFlags
