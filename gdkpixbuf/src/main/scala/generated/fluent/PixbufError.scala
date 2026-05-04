package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.GdkPixbufError

/** An error code in the `GDK_PIXBUF_ERROR` domain.
  *
  * Many gdk-pixbuf operations can cause errors in this domain, or in the
  * `G_FILE_ERROR` domain.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PixbufError(val raw: GdkPixbufError):
  /** An image file was broken somehow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CORRUPT_IMAGE
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_CORRUPT_IMAGE)

  /** Not enough memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INSUFFICIENT_MEMORY
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY)

  /** A bad option was passed to a pixbuf save module.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_OPTION
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_BAD_OPTION)

  /** Unknown image type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_TYPE
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_UNKNOWN_TYPE)

  /** Don't know how to perform the given operation on the type of image at
    * hand.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED_OPERATION
      extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION)

  /** Generic failure code, something went wrong.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends PixbufError(GdkPixbufError.GDK_PIXBUF_ERROR_FAILED)

  /** Only part of the animation was loaded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
