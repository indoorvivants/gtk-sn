package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkFontChooserLevel

/** Specifies the granularity of font selection that is desired in a
  * `GtkFontChooser`.
  *
  * This enumeration may be extended in the future; applications should ignore
  * unknown values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontChooserLevel private (val raw: GtkFontChooserLevel):
  def is(kv: FontChooserLevel): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[FontChooserLevel.KnownValue]
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

  /** Specifies the granularity of font selection that is desired in a
    * `GtkFontChooser`.
    *
    * This enumeration may be extended in the future; applications should ignore
    * unknown values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GtkFontChooserLevel,
      name: scala.Predef.String
  ) extends FontChooserLevel(raw):
    override def toString(): scala.Predef.String = this.name

    /** Allow selecting a font family
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FAMILY
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_FAMILY,
          "FAMILY"
        )

    /** Allow selecting a specific font face
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STYLE
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_STYLE,
          "STYLE"
        )

    /** Allow selecting a specific font size
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SIZE
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_SIZE,
          "SIZE"
        )

    /** Allow changing OpenType font variation axes
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VARIATIONS
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_VARIATIONS,
          "VARIATIONS"
        )

    /** Allow selecting specific OpenType font features
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FEATURES
        extends KnownValue(
          GtkFontChooserLevel.GTK_FONT_CHOOSER_LEVEL_FEATURES,
          "FEATURES"
        )
  end KnownValue
end FontChooserLevel
