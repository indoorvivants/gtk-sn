package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskSerializationError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Errors that can happen during (de)serialization.
  */
enum SerializationError(val raw: GskSerializationError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The format can not be identified
    */
  case UNSUPPORTED_FORMAT
      extends SerializationError(
        GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_FORMAT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The version of the data is not understood
    */
  case UNSUPPORTED_VERSION
      extends SerializationError(
        GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_VERSION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The given data may not exist in a proper serialization
    */
  case INVALID_DATA
      extends SerializationError(
        GskSerializationError.GSK_SERIALIZATION_INVALID_DATA
      )
end SerializationError

object SerializationError:
  def fromRaw(raw: GskSerializationError): SerializationError =
    raw match
      case GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_FORMAT =>
        SerializationError.UNSUPPORTED_FORMAT
      case GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_VERSION =>
        SerializationError.UNSUPPORTED_VERSION
      case GskSerializationError.GSK_SERIALIZATION_INVALID_DATA =>
        SerializationError.INVALID_DATA
  end fromRaw
end SerializationError
