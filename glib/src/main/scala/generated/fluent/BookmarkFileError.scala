package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GBookmarkFileError

/** Error codes returned by bookmark file parsing.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BookmarkFileError(val raw: GBookmarkFileError):
  /** URI was ill-formed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_URI
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_URI
      )

  /** a requested field was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_VALUE
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_VALUE
      )

  /** a requested application did not register a bookmark
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APP_NOT_REGISTERED
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED
      )

  /** a requested URI was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case URI_NOT_FOUND
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND
      )

  /** document was ill formed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case READ
      extends BookmarkFileError(GBookmarkFileError.G_BOOKMARK_FILE_ERROR_READ)

  /** the text being parsed was in an unknown encoding
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_ENCODING
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING
      )

  /** an error occurred while writing
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WRITE
      extends BookmarkFileError(GBookmarkFileError.G_BOOKMARK_FILE_ERROR_WRITE)

  /** requested file was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILE_NOT_FOUND
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND
      )
end BookmarkFileError

object BookmarkFileError:
  def fromRaw(raw: GBookmarkFileError): BookmarkFileError =
    raw match
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_URI =>
        BookmarkFileError.INVALID_URI
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_VALUE =>
        BookmarkFileError.INVALID_VALUE
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED =>
        BookmarkFileError.APP_NOT_REGISTERED
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND =>
        BookmarkFileError.URI_NOT_FOUND
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_READ =>
        BookmarkFileError.READ
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING =>
        BookmarkFileError.UNKNOWN_ENCODING
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_WRITE =>
        BookmarkFileError.WRITE
      case GBookmarkFileError.G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND =>
        BookmarkFileError.FILE_NOT_FOUND
  end fromRaw
end BookmarkFileError
