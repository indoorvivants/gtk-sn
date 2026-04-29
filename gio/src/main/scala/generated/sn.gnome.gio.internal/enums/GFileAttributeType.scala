package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileAttributeType: _FILE_ATTRIBUTE_TYPE_INVALID: indicates an invalid or uninitialized type. _FILE_ATTRIBUTE_TYPE_STRING: a null terminated UTF8 string. _FILE_ATTRIBUTE_TYPE_BYTE_STRING: a zero terminated string of non-zero bytes. _FILE_ATTRIBUTE_TYPE_BOOLEAN: a boolean value. _FILE_ATTRIBUTE_TYPE_UINT32: an unsigned 4-byte/32-bit integer. _FILE_ATTRIBUTE_TYPE_INT32: a signed 4-byte/32-bit integer. _FILE_ATTRIBUTE_TYPE_UINT64: an unsigned 8-byte/64-bit integer. _FILE_ATTRIBUTE_TYPE_INT64: a signed 8-byte/64-bit integer. _FILE_ATTRIBUTE_TYPE_OBJECT: a #GObject. _FILE_ATTRIBUTE_TYPE_STRINGV: a %NULL terminated char **. Since 2.22
*/
opaque type GFileAttributeType = CUnsignedInt
object GFileAttributeType extends _BindgenEnumCUnsignedInt[GFileAttributeType]:
  given _tag: Tag[GFileAttributeType] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeType = a.toUInt
  val G_FILE_ATTRIBUTE_TYPE_INVALID = define(0)
  val G_FILE_ATTRIBUTE_TYPE_STRING = define(1)
  val G_FILE_ATTRIBUTE_TYPE_BYTE_STRING = define(2)
  val G_FILE_ATTRIBUTE_TYPE_BOOLEAN = define(3)
  val G_FILE_ATTRIBUTE_TYPE_UINT32 = define(4)
  val G_FILE_ATTRIBUTE_TYPE_INT32 = define(5)
  val G_FILE_ATTRIBUTE_TYPE_UINT64 = define(6)
  val G_FILE_ATTRIBUTE_TYPE_INT64 = define(7)
  val G_FILE_ATTRIBUTE_TYPE_OBJECT = define(8)
  val G_FILE_ATTRIBUTE_TYPE_STRINGV = define(9)
  def getName(value: GFileAttributeType): Option[String] =
    value match
      case `G_FILE_ATTRIBUTE_TYPE_INVALID` => Some("G_FILE_ATTRIBUTE_TYPE_INVALID")
      case `G_FILE_ATTRIBUTE_TYPE_STRING` => Some("G_FILE_ATTRIBUTE_TYPE_STRING")
      case `G_FILE_ATTRIBUTE_TYPE_BYTE_STRING` => Some("G_FILE_ATTRIBUTE_TYPE_BYTE_STRING")
      case `G_FILE_ATTRIBUTE_TYPE_BOOLEAN` => Some("G_FILE_ATTRIBUTE_TYPE_BOOLEAN")
      case `G_FILE_ATTRIBUTE_TYPE_UINT32` => Some("G_FILE_ATTRIBUTE_TYPE_UINT32")
      case `G_FILE_ATTRIBUTE_TYPE_INT32` => Some("G_FILE_ATTRIBUTE_TYPE_INT32")
      case `G_FILE_ATTRIBUTE_TYPE_UINT64` => Some("G_FILE_ATTRIBUTE_TYPE_UINT64")
      case `G_FILE_ATTRIBUTE_TYPE_INT64` => Some("G_FILE_ATTRIBUTE_TYPE_INT64")
      case `G_FILE_ATTRIBUTE_TYPE_OBJECT` => Some("G_FILE_ATTRIBUTE_TYPE_OBJECT")
      case `G_FILE_ATTRIBUTE_TYPE_STRINGV` => Some("G_FILE_ATTRIBUTE_TYPE_STRINGV")
      case _ => _root_.scala.None
  extension (a: GFileAttributeType)
    inline def &(b: GFileAttributeType): GFileAttributeType = a & b
    inline def |(b: GFileAttributeType): GFileAttributeType = a | b
    inline def is(b: GFileAttributeType): Boolean = (a & b) == b