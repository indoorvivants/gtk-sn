package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkGravity: _GRAVITY_NORTH_WEST: the reference point is at the top left corner. _GRAVITY_NORTH: the reference point is in the middle of the top edge. _GRAVITY_NORTH_EAST: the reference point is at the top right corner. _GRAVITY_WEST: the reference point is at the middle of the left edge. _GRAVITY_CENTER: the reference point is at the center of the surface. _GRAVITY_EAST: the reference point is at the middle of the right edge. _GRAVITY_SOUTH_WEST: the reference point is at the lower left corner. _GRAVITY_SOUTH: the reference point is at the middle of the lower edge. _GRAVITY_SOUTH_EAST: the reference point is at the lower right corner. _GRAVITY_STATIC: the reference point is at the top left corner of the surface itself, ignoring window manager decorations.
*/
opaque type GdkGravity = CUnsignedInt
object GdkGravity extends _BindgenEnumCUnsignedInt[GdkGravity]:
  given _tag: Tag[GdkGravity] = Tag.UInt
  inline def define(inline a: Long): GdkGravity = a.toUInt
  val GDK_GRAVITY_NORTH_WEST = define(1)
  val GDK_GRAVITY_NORTH = define(2)
  val GDK_GRAVITY_NORTH_EAST = define(3)
  val GDK_GRAVITY_WEST = define(4)
  val GDK_GRAVITY_CENTER = define(5)
  val GDK_GRAVITY_EAST = define(6)
  val GDK_GRAVITY_SOUTH_WEST = define(7)
  val GDK_GRAVITY_SOUTH = define(8)
  val GDK_GRAVITY_SOUTH_EAST = define(9)
  val GDK_GRAVITY_STATIC = define(10)
  def getName(value: GdkGravity): Option[String] =
    value match
      case `GDK_GRAVITY_NORTH_WEST` => Some("GDK_GRAVITY_NORTH_WEST")
      case `GDK_GRAVITY_NORTH` => Some("GDK_GRAVITY_NORTH")
      case `GDK_GRAVITY_NORTH_EAST` => Some("GDK_GRAVITY_NORTH_EAST")
      case `GDK_GRAVITY_WEST` => Some("GDK_GRAVITY_WEST")
      case `GDK_GRAVITY_CENTER` => Some("GDK_GRAVITY_CENTER")
      case `GDK_GRAVITY_EAST` => Some("GDK_GRAVITY_EAST")
      case `GDK_GRAVITY_SOUTH_WEST` => Some("GDK_GRAVITY_SOUTH_WEST")
      case `GDK_GRAVITY_SOUTH` => Some("GDK_GRAVITY_SOUTH")
      case `GDK_GRAVITY_SOUTH_EAST` => Some("GDK_GRAVITY_SOUTH_EAST")
      case `GDK_GRAVITY_STATIC` => Some("GDK_GRAVITY_STATIC")
      case _ => _root_.scala.None
  extension (a: GdkGravity)
    inline def &(b: GdkGravity): GdkGravity = a & b
    inline def |(b: GdkGravity): GdkGravity = a | b
    inline def is(b: GdkGravity): Boolean = (a & b) == b