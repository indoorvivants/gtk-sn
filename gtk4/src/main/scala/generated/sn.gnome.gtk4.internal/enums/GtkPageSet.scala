package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPageSet: _PAGE_SET_ALL: All pages. _PAGE_SET_EVEN: Even pages. _PAGE_SET_ODD: Odd pages.
*/
opaque type GtkPageSet = CUnsignedInt
object GtkPageSet extends _BindgenEnumCUnsignedInt[GtkPageSet]:
  given _tag: Tag[GtkPageSet] = Tag.UInt
  inline def define(inline a: Long): GtkPageSet = a.toUInt
  val GTK_PAGE_SET_ALL = define(0)
  val GTK_PAGE_SET_EVEN = define(1)
  val GTK_PAGE_SET_ODD = define(2)
  def getName(value: GtkPageSet): Option[String] =
    value match
      case `GTK_PAGE_SET_ALL` => Some("GTK_PAGE_SET_ALL")
      case `GTK_PAGE_SET_EVEN` => Some("GTK_PAGE_SET_EVEN")
      case `GTK_PAGE_SET_ODD` => Some("GTK_PAGE_SET_ODD")
      case _ => _root_.scala.None
  extension (a: GtkPageSet)
    inline def &(b: GtkPageSet): GtkPageSet = a & b
    inline def |(b: GtkPageSet): GtkPageSet = a | b
    inline def is(b: GtkPageSet): Boolean = (a & b) == b