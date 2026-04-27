package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GKeyFileError = CUnsignedInt
object GKeyFileError extends _BindgenEnumCUnsignedInt[GKeyFileError]:
  given _tag: Tag[GKeyFileError] = Tag.UInt
  inline def define(inline a: Long): GKeyFileError = a.toUInt
  val G_KEY_FILE_ERROR_UNKNOWN_ENCODING = define(0)
  val G_KEY_FILE_ERROR_PARSE = define(1)
  val G_KEY_FILE_ERROR_NOT_FOUND = define(2)
  val G_KEY_FILE_ERROR_KEY_NOT_FOUND = define(3)
  val G_KEY_FILE_ERROR_GROUP_NOT_FOUND = define(4)
  val G_KEY_FILE_ERROR_INVALID_VALUE = define(5)
  def getName(value: GKeyFileError): Option[String] =
    value match
      case `G_KEY_FILE_ERROR_UNKNOWN_ENCODING` => Some("G_KEY_FILE_ERROR_UNKNOWN_ENCODING")
      case `G_KEY_FILE_ERROR_PARSE` => Some("G_KEY_FILE_ERROR_PARSE")
      case `G_KEY_FILE_ERROR_NOT_FOUND` => Some("G_KEY_FILE_ERROR_NOT_FOUND")
      case `G_KEY_FILE_ERROR_KEY_NOT_FOUND` => Some("G_KEY_FILE_ERROR_KEY_NOT_FOUND")
      case `G_KEY_FILE_ERROR_GROUP_NOT_FOUND` => Some("G_KEY_FILE_ERROR_GROUP_NOT_FOUND")
      case `G_KEY_FILE_ERROR_INVALID_VALUE` => Some("G_KEY_FILE_ERROR_INVALID_VALUE")
      case _ => _root_.scala.None
  extension (a: GKeyFileError)
    inline def &(b: GKeyFileError): GKeyFileError = a & b
    inline def |(b: GKeyFileError): GKeyFileError = a | b
    inline def is(b: GKeyFileError): Boolean = (a & b) == b