package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMarkupParseFlags: _MARKUP_DEFAULT_FLAGS: No special behaviour. Since: 2.74 _MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG: flag you should not use _MARKUP_TREAT_CDATA_AS_TEXT: When this flag is set, CDATA marked sections are not passed literally to the function of the parser. Instead, the content of the section (without the `<![CDATA[` and `]]>`) is passed to the
*/
opaque type GMarkupParseFlags = CUnsignedInt
object GMarkupParseFlags extends _BindgenEnumCUnsignedInt[GMarkupParseFlags]:
  given _tag: Tag[GMarkupParseFlags] = Tag.UInt
  inline def define(inline a: Long): GMarkupParseFlags = a.toUInt
  val G_MARKUP_DEFAULT_FLAGS = define(0)
  val G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG = define(1)
  val G_MARKUP_TREAT_CDATA_AS_TEXT = define(2)
  val G_MARKUP_PREFIX_ERROR_POSITION = define(4)
  val G_MARKUP_IGNORE_QUALIFIED = define(8)
  def getName(value: GMarkupParseFlags): Option[String] =
    value match
      case `G_MARKUP_DEFAULT_FLAGS` => Some("G_MARKUP_DEFAULT_FLAGS")
      case `G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG` => Some("G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG")
      case `G_MARKUP_TREAT_CDATA_AS_TEXT` => Some("G_MARKUP_TREAT_CDATA_AS_TEXT")
      case `G_MARKUP_PREFIX_ERROR_POSITION` => Some("G_MARKUP_PREFIX_ERROR_POSITION")
      case `G_MARKUP_IGNORE_QUALIFIED` => Some("G_MARKUP_IGNORE_QUALIFIED")
      case _ => _root_.scala.None
  extension (a: GMarkupParseFlags)
    inline def &(b: GMarkupParseFlags): GMarkupParseFlags = a & b
    inline def |(b: GMarkupParseFlags): GMarkupParseFlags = a | b
    inline def is(b: GMarkupParseFlags): Boolean = (a & b) == b