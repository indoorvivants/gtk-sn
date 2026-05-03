package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.GdkPixbufError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An error code in the `GDK_PIXBUF_ERROR` domain.
  *
  * Many gdk-pixbuf operations can cause errors in this domain, or in the
  * `G_FILE_ERROR` domain.
  */
enum PixbufError(val raw: GdkPixbufError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An image file was broken somehow.
    */
  case CORRUPT_IMAGE
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_CORRUPT_IMAGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Not enough memory.
    */
  case INSUFFICIENT_MEMORY
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A bad option was passed to a pixbuf save module.
    */
  case BAD_OPTION
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_BAD_OPTION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unknown image type.
    */
  case UNKNOWN_TYPE
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_UNKNOWN_TYPE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Don't know how to perform the given operation on the type of image at
    * hand.
    */
  case UNSUPPORTED_OPERATION
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Generic failure code, something went wrong.
    */
  case FAILED extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Only part of the animation was loaded.
    */
  case INCOMPLETE_ANIMATION
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION)
end PixbufError

object PixbufError:
  def fromRaw(raw: GdkPixbufError): PixbufError =
    raw match
      case GdkPixbufError.GDK_PIXBUF_ERROR_CORRUPT_IMAGE =>
        PixbufError.CORRUPT_IMAGE
      case GdkPixbufError.GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY =>
        PixbufError.INSUFFICIENT_MEMORY
      case GdkPixbufError.GDK_PIXBUF_ERROR_BAD_OPTION => PixbufError.BAD_OPTION
      case GdkPixbufError.GDK_PIXBUF_ERROR_UNKNOWN_TYPE =>
        PixbufError.UNKNOWN_TYPE
      case GdkPixbufError.GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION =>
        PixbufError.UNSUPPORTED_OPERATION
      case GdkPixbufError.GDK_PIXBUF_ERROR_FAILED => PixbufError.FAILED
      case GdkPixbufError.GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION =>
        PixbufError.INCOMPLETE_ANIMATION
  end fromRaw
end PixbufError
