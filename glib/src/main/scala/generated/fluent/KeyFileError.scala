package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GKeyFileError

/** Error codes returned by key file parsing.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum KeyFileError(val raw: GKeyFileError):
  /** the text being parsed was in an unknown encoding
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_ENCODING
      extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_UNKNOWN_ENCODING)

  /** document was ill-formed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARSE extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_PARSE)

  /** the file was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_FOUND extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_NOT_FOUND)

  /** a requested key was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KEY_NOT_FOUND
      extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_KEY_NOT_FOUND)

  /** a requested group was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GROUP_NOT_FOUND
      extends KeyFileError(GKeyFileError.G_KEY_FILE_ERROR_GROUP_NOT_FOUND)

  /** a value could not be parsed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
