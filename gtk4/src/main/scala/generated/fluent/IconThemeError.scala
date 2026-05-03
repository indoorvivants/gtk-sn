package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkIconThemeError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes for `GtkIconTheme` operations.
  */
enum IconThemeError(val raw: GtkIconThemeError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The icon specified does not exist in the theme
    */
  case NOT_FOUND
      extends IconThemeError(GtkIconThemeError.GTK_ICON_THEME_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An unspecified error occurred.
    */
  case FAILED extends IconThemeError(GtkIconThemeError.GTK_ICON_THEME_FAILED)
end IconThemeError

object IconThemeError:
  def fromRaw(raw: GtkIconThemeError): IconThemeError =
    raw match
      case GtkIconThemeError.GTK_ICON_THEME_NOT_FOUND =>
        IconThemeError.NOT_FOUND
      case GtkIconThemeError.GTK_ICON_THEME_FAILED => IconThemeError.FAILED
  end fromRaw
end IconThemeError
