package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkScrollUnit: _SCROLL_UNIT_WHEEL: The delta is in number of wheel clicks. _SCROLL_UNIT_SURFACE: The delta is in surface pixels to scroll directly on screen.
*/
opaque type GdkScrollUnit = CUnsignedInt
object GdkScrollUnit extends _BindgenEnumCUnsignedInt[GdkScrollUnit]:
  given _tag: Tag[GdkScrollUnit] = Tag.UInt
  inline def define(inline a: Long): GdkScrollUnit = a.toUInt
  val GDK_SCROLL_UNIT_WHEEL = define(0)
  val GDK_SCROLL_UNIT_SURFACE = define(1)
  def getName(value: GdkScrollUnit): Option[String] =
    value match
      case `GDK_SCROLL_UNIT_WHEEL` => Some("GDK_SCROLL_UNIT_WHEEL")
      case `GDK_SCROLL_UNIT_SURFACE` => Some("GDK_SCROLL_UNIT_SURFACE")
      case _ => _root_.scala.None
  extension (a: GdkScrollUnit)
    inline def &(b: GdkScrollUnit): GdkScrollUnit = a & b
    inline def |(b: GdkScrollUnit): GdkScrollUnit = a | b
    inline def is(b: GdkScrollUnit): Boolean = (a & b) == b