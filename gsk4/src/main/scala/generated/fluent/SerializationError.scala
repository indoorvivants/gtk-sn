package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskSerializationError

/** Errors that can happen during (de)serialization.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SerializationError(val raw: GskSerializationError):
  /** The format can not be identified
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED_FORMAT
      extends SerializationError(
        GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_FORMAT
      )

  /** The version of the data is not understood
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED_VERSION
      extends SerializationError(
        GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_VERSION
      )

  /** The given data may not exist in a proper serialization
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
