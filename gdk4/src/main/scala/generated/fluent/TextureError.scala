package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkTextureError

/** Possible errors that can be returned by `GdkTexture` constructors.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TextureError(val raw: GdkTextureError):
  /** Not enough memory to handle this image
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_LARGE
      extends TextureError(GdkTextureError.GDK_TEXTURE_ERROR_TOO_LARGE)

  /** The image data appears corrupted
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CORRUPT_IMAGE
      extends TextureError(GdkTextureError.GDK_TEXTURE_ERROR_CORRUPT_IMAGE)

  /** The image contains features that cannot be loaded
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED_CONTENT
      extends TextureError(
        GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT
      )

  /** The image format is not supported
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED_FORMAT
      extends TextureError(GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT)
end TextureError

object TextureError:
  def fromRaw(raw: GdkTextureError): TextureError =
    raw match
      case GdkTextureError.GDK_TEXTURE_ERROR_TOO_LARGE => TextureError.TOO_LARGE
      case GdkTextureError.GDK_TEXTURE_ERROR_CORRUPT_IMAGE =>
        TextureError.CORRUPT_IMAGE
      case GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT =>
        TextureError.UNSUPPORTED_CONTENT
      case GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT =>
        TextureError.UNSUPPORTED_FORMAT
  end fromRaw
end TextureError
