package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkTitlebarGesture: _TITLEBAR_GESTURE_DOUBLE_CLICK: _TITLEBAR_GESTURE_RIGHT_CLICK: _TITLEBAR_GESTURE_MIDDLE_CLICK:
*/
opaque type GdkTitlebarGesture = CUnsignedInt
object GdkTitlebarGesture extends _BindgenEnumCUnsignedInt[GdkTitlebarGesture]:
  given _tag: Tag[GdkTitlebarGesture] = Tag.UInt
  inline def define(inline a: Long): GdkTitlebarGesture = a.toUInt
  val GDK_TITLEBAR_GESTURE_DOUBLE_CLICK = define(1)
  val GDK_TITLEBAR_GESTURE_RIGHT_CLICK = define(2)
  val GDK_TITLEBAR_GESTURE_MIDDLE_CLICK = define(3)
  def getName(value: GdkTitlebarGesture): Option[String] =
    value match
      case `GDK_TITLEBAR_GESTURE_DOUBLE_CLICK` => Some("GDK_TITLEBAR_GESTURE_DOUBLE_CLICK")
      case `GDK_TITLEBAR_GESTURE_RIGHT_CLICK` => Some("GDK_TITLEBAR_GESTURE_RIGHT_CLICK")
      case `GDK_TITLEBAR_GESTURE_MIDDLE_CLICK` => Some("GDK_TITLEBAR_GESTURE_MIDDLE_CLICK")
      case _ => _root_.scala.None
  extension (a: GdkTitlebarGesture)
    inline def &(b: GdkTitlebarGesture): GdkTitlebarGesture = a & b
    inline def |(b: GdkTitlebarGesture): GdkTitlebarGesture = a | b
    inline def is(b: GdkTitlebarGesture): Boolean = (a & b) == b