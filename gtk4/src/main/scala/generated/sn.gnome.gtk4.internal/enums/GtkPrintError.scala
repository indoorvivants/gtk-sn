package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintError: _PRINT_ERROR_GENERAL: An unspecified error occurred. _PRINT_ERROR_INTERNAL_ERROR: An internal error occurred. _PRINT_ERROR_NOMEM: A memory allocation failed. _PRINT_ERROR_INVALID_FILE: An error occurred while loading a page setup or paper size from a key file.
*/
opaque type GtkPrintError = CUnsignedInt
object GtkPrintError extends _BindgenEnumCUnsignedInt[GtkPrintError]:
  given _tag: Tag[GtkPrintError] = Tag.UInt
  inline def define(inline a: Long): GtkPrintError = a.toUInt
  val GTK_PRINT_ERROR_GENERAL = define(0)
  val GTK_PRINT_ERROR_INTERNAL_ERROR = define(1)
  val GTK_PRINT_ERROR_NOMEM = define(2)
  val GTK_PRINT_ERROR_INVALID_FILE = define(3)
  def getName(value: GtkPrintError): Option[String] =
    value match
      case `GTK_PRINT_ERROR_GENERAL` => Some("GTK_PRINT_ERROR_GENERAL")
      case `GTK_PRINT_ERROR_INTERNAL_ERROR` => Some("GTK_PRINT_ERROR_INTERNAL_ERROR")
      case `GTK_PRINT_ERROR_NOMEM` => Some("GTK_PRINT_ERROR_NOMEM")
      case `GTK_PRINT_ERROR_INVALID_FILE` => Some("GTK_PRINT_ERROR_INVALID_FILE")
      case _ => _root_.scala.None
  extension (a: GtkPrintError)
    inline def &(b: GtkPrintError): GtkPrintError = a & b
    inline def |(b: GtkPrintError): GtkPrintError = a | b
    inline def is(b: GtkPrintError): Boolean = (a & b) == b