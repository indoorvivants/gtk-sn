package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkTextureError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Possible errors that can be returned by `GdkTexture` constructors.
  */
enum TextureError(val raw: GdkTextureError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Not enough memory to handle this image
    */
  case TOO_LARGE
      extends TextureError(GdkTextureError.GDK_TEXTURE_ERROR_TOO_LARGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The image data appears corrupted
    */
  case CORRUPT_IMAGE
      extends TextureError(GdkTextureError.GDK_TEXTURE_ERROR_CORRUPT_IMAGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The image contains features that cannot be loaded
    */
  case UNSUPPORTED_CONTENT
      extends TextureError(
        GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The image format is not supported
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
