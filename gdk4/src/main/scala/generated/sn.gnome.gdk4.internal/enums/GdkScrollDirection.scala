package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkScrollDirection: _SCROLL_UP: the surface is scrolled up. _SCROLL_DOWN: the surface is scrolled down. _SCROLL_LEFT: the surface is scrolled to the left. _SCROLL_RIGHT: the surface is scrolled to the right. _SCROLL_SMOOTH: the scrolling is determined by the delta values in scroll events. See gdk_scroll_event_get_deltas()
*/
opaque type GdkScrollDirection = CUnsignedInt
object GdkScrollDirection extends _BindgenEnumCUnsignedInt[GdkScrollDirection]:
  given _tag: Tag[GdkScrollDirection] = Tag.UInt
  inline def define(inline a: Long): GdkScrollDirection = a.toUInt
  val GDK_SCROLL_UP = define(0)
  val GDK_SCROLL_DOWN = define(1)
  val GDK_SCROLL_LEFT = define(2)
  val GDK_SCROLL_RIGHT = define(3)
  val GDK_SCROLL_SMOOTH = define(4)
  def getName(value: GdkScrollDirection): Option[String] =
    value match
      case `GDK_SCROLL_UP` => Some("GDK_SCROLL_UP")
      case `GDK_SCROLL_DOWN` => Some("GDK_SCROLL_DOWN")
      case `GDK_SCROLL_LEFT` => Some("GDK_SCROLL_LEFT")
      case `GDK_SCROLL_RIGHT` => Some("GDK_SCROLL_RIGHT")
      case `GDK_SCROLL_SMOOTH` => Some("GDK_SCROLL_SMOOTH")
      case _ => _root_.scala.None
  extension (a: GdkScrollDirection)
    inline def &(b: GdkScrollDirection): GdkScrollDirection = a & b
    inline def |(b: GdkScrollDirection): GdkScrollDirection = a | b
    inline def is(b: GdkScrollDirection): Boolean = (a & b) == b