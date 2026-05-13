package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileAttributeType

/** The data types for file attributes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FileAttributeType(val raw: GFileAttributeType):
  /** indicates an invalid or uninitialized type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends FileAttributeType(
        GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INVALID
      )

  /** a null terminated UTF8 string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRING
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRING)

  /** a zero terminated string of non-zero bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BYTE_STRING
      extends FileAttributeType(
        GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BYTE_STRING
      )

  /** a boolean value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOOLEAN
      extends FileAttributeType(
        GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BOOLEAN
      )

  /** an unsigned 4-byte/32-bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UINT32
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT32)

  /** a signed 4-byte/32-bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT32
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT32)

  /** an unsigned 8-byte/64-bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UINT64
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT64)

  /** a signed 8-byte/64-bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT64
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT64)

  /** a #GObject.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OBJECT
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_OBJECT)

  /** a %NULL terminated char **. Since 2.22
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRINGV
      extends FileAttributeType(
        GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRINGV
      )
end FileAttributeType

object FileAttributeType:
  def fromRaw(raw: GFileAttributeType): FileAttributeType =
    raw match
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INVALID =>
        FileAttributeType.INVALID
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRING =>
        FileAttributeType.STRING
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BYTE_STRING =>
        FileAttributeType.BYTE_STRING
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BOOLEAN =>
        FileAttributeType.BOOLEAN
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT32 =>
        FileAttributeType.UINT32
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT32 =>
        FileAttributeType.INT32
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT64 =>
        FileAttributeType.UINT64
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT64 =>
        FileAttributeType.INT64
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_OBJECT =>
        FileAttributeType.OBJECT
      case GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRINGV =>
        FileAttributeType.STRINGV
  end fromRaw
end FileAttributeType
