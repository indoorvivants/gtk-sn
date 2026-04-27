package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMarkupError: _MARKUP_ERROR_BAD_UTF8: text being parsed was not valid UTF-8 _MARKUP_ERROR_EMPTY: document contained nothing, or only whitespace _MARKUP_ERROR_PARSE: document was ill-formed _MARKUP_ERROR_UNKNOWN_ELEMENT: error should be set by #GMarkupParser functions; element wasn't known _MARKUP_ERROR_UNKNOWN_ATTRIBUTE: error should be set by #GMarkupParser functions; attribute wasn't known _MARKUP_ERROR_INVALID_CONTENT: error should be set by #GMarkupParser functions; content was invalid _MARKUP_ERROR_MISSING_ATTRIBUTE: error should be set by #GMarkupParser functions; a required attribute was missing
*/
opaque type GMarkupError = CUnsignedInt
object GMarkupError extends _BindgenEnumCUnsignedInt[GMarkupError]:
  given _tag: Tag[GMarkupError] = Tag.UInt
  inline def define(inline a: Long): GMarkupError = a.toUInt
  val G_MARKUP_ERROR_BAD_UTF8 = define(0)
  val G_MARKUP_ERROR_EMPTY = define(1)
  val G_MARKUP_ERROR_PARSE = define(2)
  val G_MARKUP_ERROR_UNKNOWN_ELEMENT = define(3)
  val G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE = define(4)
  val G_MARKUP_ERROR_INVALID_CONTENT = define(5)
  val G_MARKUP_ERROR_MISSING_ATTRIBUTE = define(6)
  def getName(value: GMarkupError): Option[String] =
    value match
      case `G_MARKUP_ERROR_BAD_UTF8` => Some("G_MARKUP_ERROR_BAD_UTF8")
      case `G_MARKUP_ERROR_EMPTY` => Some("G_MARKUP_ERROR_EMPTY")
      case `G_MARKUP_ERROR_PARSE` => Some("G_MARKUP_ERROR_PARSE")
      case `G_MARKUP_ERROR_UNKNOWN_ELEMENT` => Some("G_MARKUP_ERROR_UNKNOWN_ELEMENT")
      case `G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE` => Some("G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE")
      case `G_MARKUP_ERROR_INVALID_CONTENT` => Some("G_MARKUP_ERROR_INVALID_CONTENT")
      case `G_MARKUP_ERROR_MISSING_ATTRIBUTE` => Some("G_MARKUP_ERROR_MISSING_ATTRIBUTE")
      case _ => _root_.scala.None
  extension (a: GMarkupError)
    inline def &(b: GMarkupError): GMarkupError = a & b
    inline def |(b: GMarkupError): GMarkupError = a | b
    inline def is(b: GMarkupError): Boolean = (a & b) == b