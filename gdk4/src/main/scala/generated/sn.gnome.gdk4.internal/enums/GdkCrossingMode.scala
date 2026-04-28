package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkCrossingMode: _CROSSING_NORMAL: crossing because of pointer motion. _CROSSING_GRAB: crossing because a grab is activated. _CROSSING_UNGRAB: crossing because a grab is deactivated. _CROSSING_GTK_GRAB: crossing because a GTK grab is activated. _CROSSING_GTK_UNGRAB: crossing because a GTK grab is deactivated. _CROSSING_STATE_CHANGED: crossing because a GTK widget changed state (e.g. sensitivity). _CROSSING_TOUCH_BEGIN: crossing because a touch sequence has begun, this event is synthetic as the pointer might have not left the surface. _CROSSING_TOUCH_END: crossing because a touch sequence has ended, this event is synthetic as the pointer might have not left the surface. _CROSSING_DEVICE_SWITCH: crossing because of a device switch (i.e. a mouse taking control of the pointer after a touch device), this event is synthetic as the pointer didn’t leave the surface.
*/
opaque type GdkCrossingMode = CUnsignedInt
object GdkCrossingMode extends _BindgenEnumCUnsignedInt[GdkCrossingMode]:
  given _tag: Tag[GdkCrossingMode] = Tag.UInt
  inline def define(inline a: Long): GdkCrossingMode = a.toUInt
  val GDK_CROSSING_NORMAL = define(0)
  val GDK_CROSSING_GRAB = define(1)
  val GDK_CROSSING_UNGRAB = define(2)
  val GDK_CROSSING_GTK_GRAB = define(3)
  val GDK_CROSSING_GTK_UNGRAB = define(4)
  val GDK_CROSSING_STATE_CHANGED = define(5)
  val GDK_CROSSING_TOUCH_BEGIN = define(6)
  val GDK_CROSSING_TOUCH_END = define(7)
  val GDK_CROSSING_DEVICE_SWITCH = define(8)
  def getName(value: GdkCrossingMode): Option[String] =
    value match
      case `GDK_CROSSING_NORMAL` => Some("GDK_CROSSING_NORMAL")
      case `GDK_CROSSING_GRAB` => Some("GDK_CROSSING_GRAB")
      case `GDK_CROSSING_UNGRAB` => Some("GDK_CROSSING_UNGRAB")
      case `GDK_CROSSING_GTK_GRAB` => Some("GDK_CROSSING_GTK_GRAB")
      case `GDK_CROSSING_GTK_UNGRAB` => Some("GDK_CROSSING_GTK_UNGRAB")
      case `GDK_CROSSING_STATE_CHANGED` => Some("GDK_CROSSING_STATE_CHANGED")
      case `GDK_CROSSING_TOUCH_BEGIN` => Some("GDK_CROSSING_TOUCH_BEGIN")
      case `GDK_CROSSING_TOUCH_END` => Some("GDK_CROSSING_TOUCH_END")
      case `GDK_CROSSING_DEVICE_SWITCH` => Some("GDK_CROSSING_DEVICE_SWITCH")
      case _ => _root_.scala.None
  extension (a: GdkCrossingMode)
    inline def &(b: GdkCrossingMode): GdkCrossingMode = a & b
    inline def |(b: GdkCrossingMode): GdkCrossingMode = a | b
    inline def is(b: GdkCrossingMode): Boolean = (a & b) == b