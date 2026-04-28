package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkInputSource: _SOURCE_MOUSE: the device is a mouse. (This will be reported for the core pointer, even if it is something else, such as a trackball.) _SOURCE_PEN: the device is a stylus of a graphics tablet or similar device. _SOURCE_KEYBOARD: the device is a keyboard. _SOURCE_TOUCHSCREEN: the device is a direct-input touch device, such as a touchscreen or tablet _SOURCE_TOUCHPAD: the device is an indirect touch device, such as a touchpad _SOURCE_TRACKPOINT: the device is a trackpoint _SOURCE_TABLET_PAD: the device is a "pad", a collection of buttons, rings and strips found in drawing tablets
*/
opaque type GdkInputSource = CUnsignedInt
object GdkInputSource extends _BindgenEnumCUnsignedInt[GdkInputSource]:
  given _tag: Tag[GdkInputSource] = Tag.UInt
  inline def define(inline a: Long): GdkInputSource = a.toUInt
  val GDK_SOURCE_MOUSE = define(0)
  val GDK_SOURCE_PEN = define(1)
  val GDK_SOURCE_KEYBOARD = define(2)
  val GDK_SOURCE_TOUCHSCREEN = define(3)
  val GDK_SOURCE_TOUCHPAD = define(4)
  val GDK_SOURCE_TRACKPOINT = define(5)
  val GDK_SOURCE_TABLET_PAD = define(6)
  def getName(value: GdkInputSource): Option[String] =
    value match
      case `GDK_SOURCE_MOUSE` => Some("GDK_SOURCE_MOUSE")
      case `GDK_SOURCE_PEN` => Some("GDK_SOURCE_PEN")
      case `GDK_SOURCE_KEYBOARD` => Some("GDK_SOURCE_KEYBOARD")
      case `GDK_SOURCE_TOUCHSCREEN` => Some("GDK_SOURCE_TOUCHSCREEN")
      case `GDK_SOURCE_TOUCHPAD` => Some("GDK_SOURCE_TOUCHPAD")
      case `GDK_SOURCE_TRACKPOINT` => Some("GDK_SOURCE_TRACKPOINT")
      case `GDK_SOURCE_TABLET_PAD` => Some("GDK_SOURCE_TABLET_PAD")
      case _ => _root_.scala.None
  extension (a: GdkInputSource)
    inline def &(b: GdkInputSource): GdkInputSource = a & b
    inline def |(b: GdkInputSource): GdkInputSource = a | b
    inline def is(b: GdkInputSource): Boolean = (a & b) == b