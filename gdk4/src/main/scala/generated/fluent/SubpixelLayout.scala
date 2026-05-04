package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkSubpixelLayout

/** This enumeration describes how the red, green and blue components of
  * physical pixels on an output device are laid out.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SubpixelLayout(val raw: GdkSubpixelLayout):
  /** The layout is not known
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN
      extends SubpixelLayout(GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_UNKNOWN)

  /** Not organized in this way
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends SubpixelLayout(GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_NONE)

  /** The layout is horizontal, the order is RGB
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL_RGB
      extends SubpixelLayout(
        GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB
      )

  /** The layout is horizontal, the order is BGR
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL_BGR
      extends SubpixelLayout(
        GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR
      )

  /** The layout is vertical, the order is RGB
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VERTICAL_RGB
      extends SubpixelLayout(GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB)

  /** The layout is vertical, the order is BGR
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
