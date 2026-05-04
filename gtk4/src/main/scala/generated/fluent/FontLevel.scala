package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFontLevel

/** The level of granularity for the font selection.
  *
  * Depending on this value, the `PangoFontDescription` that is returned by
  * [method@Gtk.FontDialogButton.get_font_desc] will have more or less fields
  * set.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FontLevel(val raw: GtkFontLevel):
  /** Select a font family
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAMILY extends FontLevel(GtkFontLevel.GTK_FONT_LEVEL_FAMILY)

  /** Select a font face (i.e. a family and a style)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FACE extends FontLevel(GtkFontLevel.GTK_FONT_LEVEL_FACE)

  /** Select a font (i.e. a face with a size, and possibly font variations)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FONT extends FontLevel(GtkFontLevel.GTK_FONT_LEVEL_FONT)

  /** Select a font and font features
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FEATURES extends FontLevel(GtkFontLevel.GTK_FONT_LEVEL_FEATURES)
end FontLevel

object FontLevel:
  def fromRaw(raw: GtkFontLevel): FontLevel =
    raw match
      case GtkFontLevel.GTK_FONT_LEVEL_FAMILY   => FontLevel.FAMILY
      case GtkFontLevel.GTK_FONT_LEVEL_FACE     => FontLevel.FACE
      case GtkFontLevel.GTK_FONT_LEVEL_FONT     => FontLevel.FONT
      case GtkFontLevel.GTK_FONT_LEVEL_FEATURES => FontLevel.FEATURES
  end fromRaw
end FontLevel
