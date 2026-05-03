package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkConstraintVflParserError: _CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL: Invalid or unknown symbol _CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE: Invalid or unknown attribute _CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW: Invalid or unknown view _CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC: Invalid or unknown metric _CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY: Invalid or unknown priority _CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION: Invalid or unknown relation
*/
opaque type GtkConstraintVflParserError = CUnsignedInt
object GtkConstraintVflParserError extends _BindgenEnumCUnsignedInt[GtkConstraintVflParserError]:
  given _tag: Tag[GtkConstraintVflParserError] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintVflParserError = a.toUInt
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL = define(0)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE = define(1)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW = define(2)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC = define(3)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY = define(4)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION = define(5)
  def getName(value: GtkConstraintVflParserError): Option[String] =
    value match
      case `GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL` => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL")
      case `GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE` => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE")
      case `GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW` => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW")
      case `GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC` => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC")
      case `GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY` => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY")
      case `GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION` => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION")
      case _ => _root_.scala.None
  extension (a: GtkConstraintVflParserError)
    inline def &(b: GtkConstraintVflParserError): GtkConstraintVflParserError = a & b
    inline def |(b: GtkConstraintVflParserError): GtkConstraintVflParserError = a | b
    inline def is(b: GtkConstraintVflParserError): Boolean = (a & b) == b