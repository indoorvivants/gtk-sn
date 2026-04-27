package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCssParserWarning: _CSS_PARSER_WARNING_DEPRECATED: The given construct is deprecated and will be removed in a future version _CSS_PARSER_WARNING_SYNTAX: A syntax construct was used that should be avoided _CSS_PARSER_WARNING_UNIMPLEMENTED: A feature is not implemented
*/
opaque type GtkCssParserWarning = CUnsignedInt
object GtkCssParserWarning extends _BindgenEnumCUnsignedInt[GtkCssParserWarning]:
  given _tag: Tag[GtkCssParserWarning] = Tag.UInt
  inline def define(inline a: Long): GtkCssParserWarning = a.toUInt
  val GTK_CSS_PARSER_WARNING_DEPRECATED = define(0)
  val GTK_CSS_PARSER_WARNING_SYNTAX = define(1)
  val GTK_CSS_PARSER_WARNING_UNIMPLEMENTED = define(2)
  def getName(value: GtkCssParserWarning): Option[String] =
    value match
      case `GTK_CSS_PARSER_WARNING_DEPRECATED` => Some("GTK_CSS_PARSER_WARNING_DEPRECATED")
      case `GTK_CSS_PARSER_WARNING_SYNTAX` => Some("GTK_CSS_PARSER_WARNING_SYNTAX")
      case `GTK_CSS_PARSER_WARNING_UNIMPLEMENTED` => Some("GTK_CSS_PARSER_WARNING_UNIMPLEMENTED")
      case _ => _root_.scala.None
  extension (a: GtkCssParserWarning)
    inline def &(b: GtkCssParserWarning): GtkCssParserWarning = a & b
    inline def |(b: GtkCssParserWarning): GtkCssParserWarning = a | b
    inline def is(b: GtkCssParserWarning): Boolean = (a & b) == b