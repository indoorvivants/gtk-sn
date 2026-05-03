package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkFullscreenMode: _FULLSCREEN_ON_CURRENT_MONITOR: Fullscreen on current monitor only. _FULLSCREEN_ON_ALL_MONITORS: Span across all monitors when fullscreen.
*/
opaque type GdkFullscreenMode = CUnsignedInt
object GdkFullscreenMode extends _BindgenEnumCUnsignedInt[GdkFullscreenMode]:
  given _tag: Tag[GdkFullscreenMode] = Tag.UInt
  inline def define(inline a: Long): GdkFullscreenMode = a.toUInt
  val GDK_FULLSCREEN_ON_CURRENT_MONITOR = define(0)
  val GDK_FULLSCREEN_ON_ALL_MONITORS = define(1)
  def getName(value: GdkFullscreenMode): Option[String] =
    value match
      case `GDK_FULLSCREEN_ON_CURRENT_MONITOR` => Some("GDK_FULLSCREEN_ON_CURRENT_MONITOR")
      case `GDK_FULLSCREEN_ON_ALL_MONITORS` => Some("GDK_FULLSCREEN_ON_ALL_MONITORS")
      case _ => _root_.scala.None
  extension (a: GdkFullscreenMode)
    inline def &(b: GdkFullscreenMode): GdkFullscreenMode = a & b
    inline def |(b: GdkFullscreenMode): GdkFullscreenMode = a | b
    inline def is(b: GdkFullscreenMode): Boolean = (a & b) == b