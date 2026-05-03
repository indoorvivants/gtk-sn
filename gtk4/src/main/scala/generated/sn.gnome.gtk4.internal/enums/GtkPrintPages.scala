package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintPages: _PRINT_PAGES_ALL: All pages. _PRINT_PAGES_CURRENT: Current page. _PRINT_PAGES_RANGES: Range of pages. _PRINT_PAGES_SELECTION: Selected pages.
*/
opaque type GtkPrintPages = CUnsignedInt
object GtkPrintPages extends _BindgenEnumCUnsignedInt[GtkPrintPages]:
  given _tag: Tag[GtkPrintPages] = Tag.UInt
  inline def define(inline a: Long): GtkPrintPages = a.toUInt
  val GTK_PRINT_PAGES_ALL = define(0)
  val GTK_PRINT_PAGES_CURRENT = define(1)
  val GTK_PRINT_PAGES_RANGES = define(2)
  val GTK_PRINT_PAGES_SELECTION = define(3)
  def getName(value: GtkPrintPages): Option[String] =
    value match
      case `GTK_PRINT_PAGES_ALL` => Some("GTK_PRINT_PAGES_ALL")
      case `GTK_PRINT_PAGES_CURRENT` => Some("GTK_PRINT_PAGES_CURRENT")
      case `GTK_PRINT_PAGES_RANGES` => Some("GTK_PRINT_PAGES_RANGES")
      case `GTK_PRINT_PAGES_SELECTION` => Some("GTK_PRINT_PAGES_SELECTION")
      case _ => _root_.scala.None
  extension (a: GtkPrintPages)
    inline def &(b: GtkPrintPages): GtkPrintPages = a & b
    inline def |(b: GtkPrintPages): GtkPrintPages = a | b
    inline def is(b: GtkPrintPages): Boolean = (a & b) == b