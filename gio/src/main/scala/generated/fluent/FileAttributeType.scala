package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileAttributeType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The data types for file attributes.
  */
enum FileAttributeType(val raw: GFileAttributeType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * indicates an invalid or uninitialized type.
    */
  case INVALID
      extends FileAttributeType(
        GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INVALID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a null terminated UTF8 string.
    */
  case STRING
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a zero terminated string of non-zero bytes.
    */
  case BYTE_STRING
      extends FileAttributeType(
        GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BYTE_STRING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a boolean value.
    */
  case BOOLEAN
      extends FileAttributeType(
        GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BOOLEAN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an unsigned 4-byte/32-bit integer.
    */
  case UINT32
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT32)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a signed 4-byte/32-bit integer.
    */
  case INT32
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT32)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an unsigned 8-byte/64-bit integer.
    */
  case UINT64
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT64)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a signed 8-byte/64-bit integer.
    */
  case INT64
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT64)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a #GObject.
    */
  case OBJECT
      extends FileAttributeType(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_OBJECT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a %NULL terminated char **. Since 2.22
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
