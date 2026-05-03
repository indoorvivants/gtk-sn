package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFontLevel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The level of granularity for the font selection.
  *
  * Depending on this value, the `PangoFontDescription` that is returned by
  * [method@Gtk.FontDialogButton.get_font_desc] will have more or less fields
  * set.
  */
enum FontLevel(val raw: GtkFontLevel):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select a font family
    */
  case FAMILY extends FontLevel(GtkFontLevel.GTK_FONT_LEVEL_FAMILY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select a font face (i.e. a family and a style)
    */
  case FACE extends FontLevel(GtkFontLevel.GTK_FONT_LEVEL_FACE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select a font (i.e. a face with a size, and possibly font variations)
    */
  case FONT extends FontLevel(GtkFontLevel.GTK_FONT_LEVEL_FONT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select a font and font features
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
