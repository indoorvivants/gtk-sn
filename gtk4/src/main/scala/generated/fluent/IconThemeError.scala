package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkIconThemeError

/** Error codes for `GtkIconTheme` operations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum IconThemeError(val raw: GtkIconThemeError):
  /** The icon specified does not exist in the theme
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_FOUND
      extends IconThemeError(GtkIconThemeError.GTK_ICON_THEME_NOT_FOUND)

  /** An unspecified error occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
