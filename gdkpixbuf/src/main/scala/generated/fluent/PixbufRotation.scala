package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.GdkPixbufRotation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
  *
  * To make them easier to use, their numerical values are the actual degrees.
  */
enum PixbufRotation(val raw: GdkPixbufRotation):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No rotation.
    */
  case NONE extends PixbufRotation(GdkPixbufRotation.GDK_PIXBUF_ROTATE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rotate by 90 degrees.
    */
  case COUNTERCLOCKWISE
      extends PixbufRotation(
        GdkPixbufRotation.GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rotate by 180 degrees.
    */
  case UPSIDEDOWN
      extends PixbufRotation(GdkPixbufRotation.GDK_PIXBUF_ROTATE_UPSIDEDOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rotate by 270 degrees.
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
