package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GKeyFileError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by key file parsing.
  */
enum KeyFileError(val raw: GKeyFileError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the text being parsed was in an unknown encoding
    */
  case UNKNOWN_ENCODING
      extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_UNKNOWN_ENCODING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * document was ill-formed
    */
  case PARSE extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_PARSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the file was not found
    */
  case NOT_FOUND extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a requested key was not found
    */
  case KEY_NOT_FOUND
      extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_KEY_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a requested group was not found
    */
  case GROUP_NOT_FOUND
      extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_GROUP_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a value could not be parsed
    */
  case INVALID_VALUE
      extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_INVALID_VALUE)
end KeyFileError

object KeyFileError:
  def fromRaw(raw: GKeyFileError): KeyFileError =
    raw match
      case GKeyFileError.G_KEY_FILE_ERROR_UNKNOWN_ENCODING =>
        KeyFileError.UNKNOWN_ENCODING
      case GKeyFileError.G_KEY_FILE_ERROR_PARSE     => KeyFileError.PARSE
      case GKeyFileError.G_KEY_FILE_ERROR_NOT_FOUND => KeyFileError.NOT_FOUND
      case GKeyFileError.G_KEY_FILE_ERROR_KEY_NOT_FOUND =>
        KeyFileError.KEY_NOT_FOUND
      case GKeyFileError.G_KEY_FILE_ERROR_GROUP_NOT_FOUND =>
        KeyFileError.GROUP_NOT_FOUND
      case GKeyFileError.G_KEY_FILE_ERROR_INVALID_VALUE =>
        KeyFileError.INVALID_VALUE
  end fromRaw
end KeyFileError
