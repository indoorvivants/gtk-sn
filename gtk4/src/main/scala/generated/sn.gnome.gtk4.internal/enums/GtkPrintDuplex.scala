package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintDuplex: _PRINT_DUPLEX_SIMPLEX: No duplex. _PRINT_DUPLEX_HORIZONTAL: Horizontal duplex. _PRINT_DUPLEX_VERTICAL: Vertical duplex.
*/
opaque type GtkPrintDuplex = CUnsignedInt
object GtkPrintDuplex extends _BindgenEnumCUnsignedInt[GtkPrintDuplex]:
  given _tag: Tag[GtkPrintDuplex] = Tag.UInt
  inline def define(inline a: Long): GtkPrintDuplex = a.toUInt
  val GTK_PRINT_DUPLEX_SIMPLEX = define(0)
  val GTK_PRINT_DUPLEX_HORIZONTAL = define(1)
  val GTK_PRINT_DUPLEX_VERTICAL = define(2)
  def getName(value: GtkPrintDuplex): Option[String] =
    value match
      case `GTK_PRINT_DUPLEX_SIMPLEX` => Some("GTK_PRINT_DUPLEX_SIMPLEX")
      case `GTK_PRINT_DUPLEX_HORIZONTAL` => Some("GTK_PRINT_DUPLEX_HORIZONTAL")
      case `GTK_PRINT_DUPLEX_VERTICAL` => Some("GTK_PRINT_DUPLEX_VERTICAL")
      case _ => _root_.scala.None
  extension (a: GtkPrintDuplex)
    inline def &(b: GtkPrintDuplex): GtkPrintDuplex = a & b
    inline def |(b: GtkPrintDuplex): GtkPrintDuplex = a | b
    inline def is(b: GtkPrintDuplex): Boolean = (a & b) == b