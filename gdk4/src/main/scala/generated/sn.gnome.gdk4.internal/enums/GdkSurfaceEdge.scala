package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkSurfaceEdge: _SURFACE_EDGE_NORTH_WEST: the top left corner. _SURFACE_EDGE_NORTH: the top edge. _SURFACE_EDGE_NORTH_EAST: the top right corner. _SURFACE_EDGE_WEST: the left edge. _SURFACE_EDGE_EAST: the right edge. _SURFACE_EDGE_SOUTH_WEST: the lower left corner. _SURFACE_EDGE_SOUTH: the lower edge. _SURFACE_EDGE_SOUTH_EAST: the lower right corner.
*/
opaque type GdkSurfaceEdge = CUnsignedInt
object GdkSurfaceEdge extends _BindgenEnumCUnsignedInt[GdkSurfaceEdge]:
  given _tag: Tag[GdkSurfaceEdge] = Tag.UInt
  inline def define(inline a: Long): GdkSurfaceEdge = a.toUInt
  val GDK_SURFACE_EDGE_NORTH_WEST = define(0)
  val GDK_SURFACE_EDGE_NORTH = define(1)
  val GDK_SURFACE_EDGE_NORTH_EAST = define(2)
  val GDK_SURFACE_EDGE_WEST = define(3)
  val GDK_SURFACE_EDGE_EAST = define(4)
  val GDK_SURFACE_EDGE_SOUTH_WEST = define(5)
  val GDK_SURFACE_EDGE_SOUTH = define(6)
  val GDK_SURFACE_EDGE_SOUTH_EAST = define(7)
  def getName(value: GdkSurfaceEdge): Option[String] =
    value match
      case `GDK_SURFACE_EDGE_NORTH_WEST` => Some("GDK_SURFACE_EDGE_NORTH_WEST")
      case `GDK_SURFACE_EDGE_NORTH` => Some("GDK_SURFACE_EDGE_NORTH")
      case `GDK_SURFACE_EDGE_NORTH_EAST` => Some("GDK_SURFACE_EDGE_NORTH_EAST")
      case `GDK_SURFACE_EDGE_WEST` => Some("GDK_SURFACE_EDGE_WEST")
      case `GDK_SURFACE_EDGE_EAST` => Some("GDK_SURFACE_EDGE_EAST")
      case `GDK_SURFACE_EDGE_SOUTH_WEST` => Some("GDK_SURFACE_EDGE_SOUTH_WEST")
      case `GDK_SURFACE_EDGE_SOUTH` => Some("GDK_SURFACE_EDGE_SOUTH")
      case `GDK_SURFACE_EDGE_SOUTH_EAST` => Some("GDK_SURFACE_EDGE_SOUTH_EAST")
      case _ => _root_.scala.None
  extension (a: GdkSurfaceEdge)
    inline def &(b: GdkSurfaceEdge): GdkSurfaceEdge = a & b
    inline def |(b: GdkSurfaceEdge): GdkSurfaceEdge = a | b
    inline def is(b: GdkSurfaceEdge): Boolean = (a & b) == b