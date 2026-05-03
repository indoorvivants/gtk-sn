package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GBookmarkFileError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by bookmark file parsing.
  */
enum BookmarkFileError(val raw: GBookmarkFileError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * URI was ill-formed
    */
  case INVALID_URI
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_URI
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a requested field was not found
    */
  case INVALID_VALUE
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_VALUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a requested application did not register a bookmark
    */
  case APP_NOT_REGISTERED
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a requested URI was not found
    */
  case URI_NOT_FOUND
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * document was ill formed
    */
  case READ
      extends BookmarkFileError(GBookmarkFileError.G_BOOKMARK_FILE_ERROR_READ)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the text being parsed was in an unknown encoding
    */
  case UNKNOWN_ENCODING
      extends BookmarkFileError(
        GBookmarkFileError.G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an error occurred while writing
    */
  case WRITE
      extends BookmarkFileError(GBookmarkFileError.G_BOOKMARK_FILE_ERROR_WRITE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * requested file was not found
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
