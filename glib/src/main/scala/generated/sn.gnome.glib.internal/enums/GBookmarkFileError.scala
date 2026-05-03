package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBookmarkFileError: _BOOKMARK_FILE_ERROR_INVALID_URI: URI was ill-formed _BOOKMARK_FILE_ERROR_INVALID_VALUE: a requested field was not found _BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED: a requested application did not register a bookmark _BOOKMARK_FILE_ERROR_URI_NOT_FOUND: a requested URI was not found _BOOKMARK_FILE_ERROR_READ: document was ill formed _BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING: the text being parsed was in an unknown encoding _BOOKMARK_FILE_ERROR_WRITE: an error occurred while writing _BOOKMARK_FILE_ERROR_FILE_NOT_FOUND: requested file was not found
*/
opaque type GBookmarkFileError = CUnsignedInt
object GBookmarkFileError extends _BindgenEnumCUnsignedInt[GBookmarkFileError]:
  given _tag: Tag[GBookmarkFileError] = Tag.UInt
  inline def define(inline a: Long): GBookmarkFileError = a.toUInt
  val G_BOOKMARK_FILE_ERROR_INVALID_URI = define(0)
  val G_BOOKMARK_FILE_ERROR_INVALID_VALUE = define(1)
  val G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED = define(2)
  val G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND = define(3)
  val G_BOOKMARK_FILE_ERROR_READ = define(4)
  val G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING = define(5)
  val G_BOOKMARK_FILE_ERROR_WRITE = define(6)
  val G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND = define(7)
  def getName(value: GBookmarkFileError): Option[String] =
    value match
      case `G_BOOKMARK_FILE_ERROR_INVALID_URI` => Some("G_BOOKMARK_FILE_ERROR_INVALID_URI")
      case `G_BOOKMARK_FILE_ERROR_INVALID_VALUE` => Some("G_BOOKMARK_FILE_ERROR_INVALID_VALUE")
      case `G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED` => Some("G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED")
      case `G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND` => Some("G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND")
      case `G_BOOKMARK_FILE_ERROR_READ` => Some("G_BOOKMARK_FILE_ERROR_READ")
      case `G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING` => Some("G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING")
      case `G_BOOKMARK_FILE_ERROR_WRITE` => Some("G_BOOKMARK_FILE_ERROR_WRITE")
      case `G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND` => Some("G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND")
      case _ => _root_.scala.None
  extension (a: GBookmarkFileError)
    inline def &(b: GBookmarkFileError): GBookmarkFileError = a & b
    inline def |(b: GBookmarkFileError): GBookmarkFileError = a | b
    inline def is(b: GBookmarkFileError): Boolean = (a & b) == b