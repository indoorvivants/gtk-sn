package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoFontMask

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The bits in a `PangoFontMask` correspond to the set fields in a
  * `PangoFontDescription`.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The bits in a `PangoFontMask` correspond to the set fields in a
    * `PangoFontDescription`.
    */
  enum KnownValue(override val raw: PangoFontMask, name: String)
      extends FontMask(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the font family is specified.
      */
    case FAMILY
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_FAMILY, "FAMILY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the font style is specified.
      */
    case STYLE extends KnownValue(PangoFontMask.PANGO_FONT_MASK_STYLE, "STYLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the font variant is specified.
      */
    case VARIANT
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_VARIANT, "VARIANT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the font weight is specified.
      */
    case WEIGHT
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_WEIGHT, "WEIGHT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the font stretch is specified.
      */
    case STRETCH
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_STRETCH, "STRETCH")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the font size is specified.
      */
    case SIZE extends KnownValue(PangoFontMask.PANGO_FONT_MASK_SIZE, "SIZE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the font gravity is specified (Since: 1.16.)
      */
    case GRAVITY
        extends KnownValue(PangoFontMask.PANGO_FONT_MASK_GRAVITY, "GRAVITY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * OpenType font variations are specified (Since: 1.42)
      */
    case VARIATIONS
        extends KnownValue(
          PangoFontMask.PANGO_FONT_MASK_VARIATIONS,
          "VARIATIONS"
        )
  end KnownValue
end FontMask
