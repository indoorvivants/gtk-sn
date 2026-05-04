package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoFontMask

/** The bits in a `PangoFontMask` correspond to the set fields in a
  * `PangoFontDescription`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontMask private (val raw: PangoFontMask):
  def is(kv: FontMask): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FontMask.KnownValue]
    FontMask.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FontMask(${sb.result().mkString(", ")})"
end FontMask

object FontMask:
  export KnownValue.*

  def fromRaw(raw: PangoFontMask) = new FontMask(raw)

  extension (af: FontMask)
    def &(other: FontMask) =
      FontMask(af.raw & other.raw)
    def |(other: FontMask) =
      FontMask(af.raw | other.raw)

  /** The bits in a `PangoFontMask` correspond to the set fields in a
    * `PangoFontDescription`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: PangoFontMask, name: String)
      extends FontMask(raw):
    override def toString(): String = this.name

    /** the font family is specified.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FAMILY
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_FAMILY, "FAMILY")

    /** the font style is specified.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STYLE extends KnownValue(PangoFontMask.PANGO_FONT_MASK_STYLE, "STYLE")

    /** the font variant is specified.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VARIANT
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_VARIANT, "VARIANT")

    /** the font weight is specified.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WEIGHT
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_WEIGHT, "WEIGHT")

    /** the font stretch is specified.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STRETCH
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_STRETCH, "STRETCH")

    /** the font size is specified.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SIZE extends KnownValue(PangoFontMask.PANGO_FONT_MASK_SIZE, "SIZE")

    /** the font gravity is specified (Since: 1.16.)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case GRAVITY
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_GRAVITY, "GRAVITY")

    /** OpenType font variations are specified (Since: 1.42)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VARIATIONS
        extends KnownValue(
          PangoFontMask.PANGO_FONT_MASK_VARIATIONS,
          "VARIATIONS"
        )
  end KnownValue
end FontMask
