package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkSubpixelLayout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This enumeration describes how the red, green and blue components of
  * physical pixels on an output device are laid out.
  */
enum SubpixelLayout(val raw: GdkSubpixelLayout):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The layout is not known
    */
  case UNKNOWN
      extends SubpixelLayout(GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Not organized in this way
    */
  case NONE extends SubpixelLayout(GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The layout is horizontal, the order is RGB
    */
  case HORIZONTAL_RGB
      extends SubpixelLayout(
        GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The layout is horizontal, the order is BGR
    */
  case HORIZONTAL_BGR
      extends SubpixelLayout(
        GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The layout is vertical, the order is RGB
    */
  case VERTICAL_RGB
      extends SubpixelLayout(GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The layout is vertical, the order is BGR
    */
  case VERTICAL_BGR
      extends SubpixelLayout(GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR)
end SubpixelLayout

object SubpixelLayout:
  def fromRaw(raw: GdkSubpixelLayout): SubpixelLayout =
    raw match
      case GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_UNKNOWN =>
        SubpixelLayout.UNKNOWN
      case GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_NONE => SubpixelLayout.NONE
      case GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB =>
        SubpixelLayout.HORIZONTAL_RGB
      case GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR =>
        SubpixelLayout.HORIZONTAL_BGR
      case GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB =>
        SubpixelLayout.VERTICAL_RGB
      case GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR =>
        SubpixelLayout.VERTICAL_BGR
  end fromRaw
end SubpixelLayout
