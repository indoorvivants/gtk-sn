package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPageOrientation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * See also gtk_print_settings_set_orientation().
  */
enum PageOrientation(val raw: GtkPageOrientation):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Portrait mode.
    */
  case PORTRAIT
      extends PageOrientation(GtkPageOrientation.GTK_PAGE_ORIENTATION_PORTRAIT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Landscape mode.
    */
  case LANDSCAPE
      extends PageOrientation(GtkPageOrientation.GTK_PAGE_ORIENTATION_LANDSCAPE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reverse portrait mode.
    */
  case REVERSE_PORTRAIT
      extends PageOrientation(
        GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reverse landscape mode.
    */
  case REVERSE_LANDSCAPE
      extends PageOrientation(
        GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE
      )
end PageOrientation

object PageOrientation:
  def fromRaw(raw: GtkPageOrientation): PageOrientation =
    raw match
      case GtkPageOrientation.GTK_PAGE_ORIENTATION_PORTRAIT =>
        PageOrientation.PORTRAIT
      case GtkPageOrientation.GTK_PAGE_ORIENTATION_LANDSCAPE =>
        PageOrientation.LANDSCAPE
      case GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT =>
        PageOrientation.REVERSE_PORTRAIT
      case GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE =>
        PageOrientation.REVERSE_LANDSCAPE
  end fromRaw
end PageOrientation
