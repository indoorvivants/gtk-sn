package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkToplevelState: _TOPLEVEL_STATE_MINIMIZED: the surface is minimized _TOPLEVEL_STATE_MAXIMIZED: the surface is maximized _TOPLEVEL_STATE_STICKY: the surface is sticky _TOPLEVEL_STATE_FULLSCREEN: the surface is maximized without decorations _TOPLEVEL_STATE_ABOVE: the surface is kept above other surfaces _TOPLEVEL_STATE_BELOW: the surface is kept below other surfaces _TOPLEVEL_STATE_FOCUSED: the surface is presented as focused (with active decorations) _TOPLEVEL_STATE_TILED: the surface is in a tiled state _TOPLEVEL_STATE_TOP_TILED: whether the top edge is tiled _TOPLEVEL_STATE_TOP_RESIZABLE: whether the top edge is resizable _TOPLEVEL_STATE_RIGHT_TILED: whether the right edge is tiled _TOPLEVEL_STATE_RIGHT_RESIZABLE: whether the right edge is resizable _TOPLEVEL_STATE_BOTTOM_TILED: whether the bottom edge is tiled _TOPLEVEL_STATE_BOTTOM_RESIZABLE: whether the bottom edge is resizable _TOPLEVEL_STATE_LEFT_TILED: whether the left edge is tiled _TOPLEVEL_STATE_LEFT_RESIZABLE: whether the left edge is resizable _TOPLEVEL_STATE_SUSPENDED: the surface is not visible to the user
*/
opaque type GdkToplevelState = CUnsignedInt
object GdkToplevelState extends _BindgenEnumCUnsignedInt[GdkToplevelState]:
  given _tag: Tag[GdkToplevelState] = Tag.UInt
  inline def define(inline a: Long): GdkToplevelState = a.toUInt
  val GDK_TOPLEVEL_STATE_MINIMIZED = define(1)
  val GDK_TOPLEVEL_STATE_MAXIMIZED = define(2)
  val GDK_TOPLEVEL_STATE_STICKY = define(4)
  val GDK_TOPLEVEL_STATE_FULLSCREEN = define(8)
  val GDK_TOPLEVEL_STATE_ABOVE = define(16)
  val GDK_TOPLEVEL_STATE_BELOW = define(32)
  val GDK_TOPLEVEL_STATE_FOCUSED = define(64)
  val GDK_TOPLEVEL_STATE_TILED = define(128)
  val GDK_TOPLEVEL_STATE_TOP_TILED = define(256)
  val GDK_TOPLEVEL_STATE_TOP_RESIZABLE = define(512)
  val GDK_TOPLEVEL_STATE_RIGHT_TILED = define(1024)
  val GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE = define(2048)
  val GDK_TOPLEVEL_STATE_BOTTOM_TILED = define(4096)
  val GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE = define(8192)
  val GDK_TOPLEVEL_STATE_LEFT_TILED = define(16384)
  val GDK_TOPLEVEL_STATE_LEFT_RESIZABLE = define(32768)
  val GDK_TOPLEVEL_STATE_SUSPENDED = define(65536)
  def getName(value: GdkToplevelState): Option[String] =
    value match
      case `GDK_TOPLEVEL_STATE_MINIMIZED` => Some("GDK_TOPLEVEL_STATE_MINIMIZED")
      case `GDK_TOPLEVEL_STATE_MAXIMIZED` => Some("GDK_TOPLEVEL_STATE_MAXIMIZED")
      case `GDK_TOPLEVEL_STATE_STICKY` => Some("GDK_TOPLEVEL_STATE_STICKY")
      case `GDK_TOPLEVEL_STATE_FULLSCREEN` => Some("GDK_TOPLEVEL_STATE_FULLSCREEN")
      case `GDK_TOPLEVEL_STATE_ABOVE` => Some("GDK_TOPLEVEL_STATE_ABOVE")
      case `GDK_TOPLEVEL_STATE_BELOW` => Some("GDK_TOPLEVEL_STATE_BELOW")
      case `GDK_TOPLEVEL_STATE_FOCUSED` => Some("GDK_TOPLEVEL_STATE_FOCUSED")
      case `GDK_TOPLEVEL_STATE_TILED` => Some("GDK_TOPLEVEL_STATE_TILED")
      case `GDK_TOPLEVEL_STATE_TOP_TILED` => Some("GDK_TOPLEVEL_STATE_TOP_TILED")
      case `GDK_TOPLEVEL_STATE_TOP_RESIZABLE` => Some("GDK_TOPLEVEL_STATE_TOP_RESIZABLE")
      case `GDK_TOPLEVEL_STATE_RIGHT_TILED` => Some("GDK_TOPLEVEL_STATE_RIGHT_TILED")
      case `GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE` => Some("GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE")
      case `GDK_TOPLEVEL_STATE_BOTTOM_TILED` => Some("GDK_TOPLEVEL_STATE_BOTTOM_TILED")
      case `GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE` => Some("GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE")
      case `GDK_TOPLEVEL_STATE_LEFT_TILED` => Some("GDK_TOPLEVEL_STATE_LEFT_TILED")
      case `GDK_TOPLEVEL_STATE_LEFT_RESIZABLE` => Some("GDK_TOPLEVEL_STATE_LEFT_RESIZABLE")
      case `GDK_TOPLEVEL_STATE_SUSPENDED` => Some("GDK_TOPLEVEL_STATE_SUSPENDED")
      case _ => _root_.scala.None
  extension (a: GdkToplevelState)
    inline def &(b: GdkToplevelState): GdkToplevelState = a & b
    inline def |(b: GdkToplevelState): GdkToplevelState = a | b
    inline def is(b: GdkToplevelState): Boolean = (a & b) == b