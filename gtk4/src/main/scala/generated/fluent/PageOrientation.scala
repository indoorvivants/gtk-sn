package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPageOrientation

/** See also gtk_print_settings_set_orientation().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PageOrientation(val raw: GtkPageOrientation):
  /** Portrait mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PORTRAIT
      extends PageOrientation(GtkPageOrientation.GTK_PAGE_ORIENTATION_PORTRAIT)

  /** Landscape mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LANDSCAPE
      extends PageOrientation(GtkPageOrientation.GTK_PAGE_ORIENTATION_LANDSCAPE)

  /** Reverse portrait mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REVERSE_PORTRAIT
      extends PageOrientation(
        GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT
      )

  /** Reverse landscape mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
