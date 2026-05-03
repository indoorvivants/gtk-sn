package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCssParserError: _CSS_PARSER_ERROR_FAILED: Unknown failure. _CSS_PARSER_ERROR_SYNTAX: The given text does not form valid syntax _CSS_PARSER_ERROR_IMPORT: Failed to import a resource _CSS_PARSER_ERROR_NAME: The given name has not been defined _CSS_PARSER_ERROR_UNKNOWN_VALUE: The given value is not correct
*/
opaque type GtkCssParserError = CUnsignedInt
object GtkCssParserError extends _BindgenEnumCUnsignedInt[GtkCssParserError]:
  given _tag: Tag[GtkCssParserError] = Tag.UInt
  inline def define(inline a: Long): GtkCssParserError = a.toUInt
  val GTK_CSS_PARSER_ERROR_FAILED = define(0)
  val GTK_CSS_PARSER_ERROR_SYNTAX = define(1)
  val GTK_CSS_PARSER_ERROR_IMPORT = define(2)
  val GTK_CSS_PARSER_ERROR_NAME = define(3)
  val GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE = define(4)
  def getName(value: GtkCssParserError): Option[String] =
    value match
      case `GTK_CSS_PARSER_ERROR_FAILED` => Some("GTK_CSS_PARSER_ERROR_FAILED")
      case `GTK_CSS_PARSER_ERROR_SYNTAX` => Some("GTK_CSS_PARSER_ERROR_SYNTAX")
      case `GTK_CSS_PARSER_ERROR_IMPORT` => Some("GTK_CSS_PARSER_ERROR_IMPORT")
      case `GTK_CSS_PARSER_ERROR_NAME` => Some("GTK_CSS_PARSER_ERROR_NAME")
      case `GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE` => Some("GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE")
      case _ => _root_.scala.None
  extension (a: GtkCssParserError)
    inline def &(b: GtkCssParserError): GtkCssParserError = a & b
    inline def |(b: GtkCssParserError): GtkCssParserError = a | b
    inline def is(b: GtkCssParserError): Boolean = (a & b) == b