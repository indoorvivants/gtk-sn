package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.GdkPixbufRotation

/** The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
  *
  * To make them easier to use, their numerical values are the actual degrees.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PixbufRotation(val raw: GdkPixbufRotation):
  /** No rotation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends PixbufRotation(GdkPixbufRotation.GDK_PIXBUF_ROTATE_NONE)

  /** Rotate by 90 degrees.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COUNTERCLOCKWISE
      extends PixbufRotation(
        GdkPixbufRotation.GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE
      )

  /** Rotate by 180 degrees.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UPSIDEDOWN
      extends PixbufRotation(GdkPixbufRotation.GDK_PIXBUF_ROTATE_UPSIDEDOWN)

  /** Rotate by 270 degrees.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOCKWISE
      extends PixbufRotation(GdkPixbufRotation.GDK_PIXBUF_ROTATE_CLOCKWISE)
end PixbufRotation

object PixbufRotation:
  def fromRaw(raw: GdkPixbufRotation): PixbufRotation =
    raw match
      case GdkPixbufRotation.GDK_PIXBUF_ROTATE_NONE => PixbufRotation.NONE
      case GdkPixbufRotation.GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE =>
        PixbufRotation.COUNTERCLOCKWISE
      case GdkPixbufRotation.GDK_PIXBUF_ROTATE_UPSIDEDOWN =>
        PixbufRotation.UPSIDEDOWN
      case GdkPixbufRotation.GDK_PIXBUF_ROTATE_CLOCKWISE =>
        PixbufRotation.CLOCKWISE
  end fromRaw
end PixbufRotation
