package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPageOrientation: _PAGE_ORIENTATION_PORTRAIT: Portrait mode. _PAGE_ORIENTATION_LANDSCAPE: Landscape mode. _PAGE_ORIENTATION_REVERSE_PORTRAIT: Reverse portrait mode. _PAGE_ORIENTATION_REVERSE_LANDSCAPE: Reverse landscape mode.
*/
opaque type GtkPageOrientation = CUnsignedInt
object GtkPageOrientation extends _BindgenEnumCUnsignedInt[GtkPageOrientation]:
  given _tag: Tag[GtkPageOrientation] = Tag.UInt
  inline def define(inline a: Long): GtkPageOrientation = a.toUInt
  val GTK_PAGE_ORIENTATION_PORTRAIT = define(0)
  val GTK_PAGE_ORIENTATION_LANDSCAPE = define(1)
  val GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT = define(2)
  val GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE = define(3)
  def getName(value: GtkPageOrientation): Option[String] =
    value match
      case `GTK_PAGE_ORIENTATION_PORTRAIT` => Some("GTK_PAGE_ORIENTATION_PORTRAIT")
      case `GTK_PAGE_ORIENTATION_LANDSCAPE` => Some("GTK_PAGE_ORIENTATION_LANDSCAPE")
      case `GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT` => Some("GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT")
      case `GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE` => Some("GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE")
      case _ => _root_.scala.None
  extension (a: GtkPageOrientation)
    inline def &(b: GtkPageOrientation): GtkPageOrientation = a & b
    inline def |(b: GtkPageOrientation): GtkPageOrientation = a | b
    inline def is(b: GtkPageOrientation): Boolean = (a & b) == b