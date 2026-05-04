package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFontChooserLevel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the granularity of font selection that is desired in a
  * `GtkFontChooser`.
  *
  * This enumeration may be extended in the future; applications should ignore
  * unknown values.
  */
class FontChooserLevel private (val raw: GtkFontChooserLevel):
  def is(kv: FontChooserLevel): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FontChooserLevel.KnownValue]
    FontChooserLevel.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FontChooserLevel(${sb.result().mkString(", ")})"
end FontChooserLevel

object FontChooserLevel:
  export KnownValue.*

  def fromRaw(raw: GtkFontChooserLevel) = new FontChooserLevel(raw)

  extension (af: FontChooserLevel)
    def &(other: FontChooserLevel) =
      FontChooserLevel(af.raw & other.raw)
    def |(other: FontChooserLevel) =
      FontChooserLevel(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies the granularity of font selection that is desired in a
    * `GtkFontChooser`.
    *
    * This enumeration may be extended in the future; applications should ignore
    * unknown values.
    */
  enum KnownValue(override val raw: GtkFontChooserLevel, name: String)
      extends FontChooserLevel(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow selecting a font family
      */
    case FAMILY
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_FAMILY,
          "FAMILY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow selecting a specific font face
      */
    case STYLE
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_STYLE,
          "STYLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow selecting a specific font size
      */
    case SIZE
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_SIZE,
          "SIZE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow changing OpenType font variation axes
      */
    case VARIATIONS
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_VARIATIONS,
          "VARIATIONS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow selecting specific OpenType font features
      */
    case FEATURES
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_FEATURES,
          "FEATURES"
        )
  end KnownValue
end FontChooserLevel
