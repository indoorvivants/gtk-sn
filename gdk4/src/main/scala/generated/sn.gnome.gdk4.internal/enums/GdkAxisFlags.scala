package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkAxisFlags: _AXIS_FLAG_X: X axis is present _AXIS_FLAG_Y: Y axis is present _AXIS_FLAG_DELTA_X: Scroll X delta axis is present _AXIS_FLAG_DELTA_Y: Scroll Y delta axis is present _AXIS_FLAG_PRESSURE: Pressure axis is present _AXIS_FLAG_XTILT: X tilt axis is present _AXIS_FLAG_YTILT: Y tilt axis is present _AXIS_FLAG_WHEEL: Wheel axis is present _AXIS_FLAG_DISTANCE: Distance axis is present _AXIS_FLAG_ROTATION: Z-axis rotation is present _AXIS_FLAG_SLIDER: Slider axis is present
*/
opaque type GdkAxisFlags = CUnsignedInt
object GdkAxisFlags extends _BindgenEnumCUnsignedInt[GdkAxisFlags]:
  given _tag: Tag[GdkAxisFlags] = Tag.UInt
  inline def define(inline a: Long): GdkAxisFlags = a.toUInt
  val GDK_AXIS_FLAG_X = define(2)
  val GDK_AXIS_FLAG_Y = define(4)
  val GDK_AXIS_FLAG_DELTA_X = define(8)
  val GDK_AXIS_FLAG_DELTA_Y = define(16)
  val GDK_AXIS_FLAG_PRESSURE = define(32)
  val GDK_AXIS_FLAG_XTILT = define(64)
  val GDK_AXIS_FLAG_YTILT = define(128)
  val GDK_AXIS_FLAG_WHEEL = define(256)
  val GDK_AXIS_FLAG_DISTANCE = define(512)
  val GDK_AXIS_FLAG_ROTATION = define(1024)
  val GDK_AXIS_FLAG_SLIDER = define(2048)
  def getName(value: GdkAxisFlags): Option[String] =
    value match
      case `GDK_AXIS_FLAG_X` => Some("GDK_AXIS_FLAG_X")
      case `GDK_AXIS_FLAG_Y` => Some("GDK_AXIS_FLAG_Y")
      case `GDK_AXIS_FLAG_DELTA_X` => Some("GDK_AXIS_FLAG_DELTA_X")
      case `GDK_AXIS_FLAG_DELTA_Y` => Some("GDK_AXIS_FLAG_DELTA_Y")
      case `GDK_AXIS_FLAG_PRESSURE` => Some("GDK_AXIS_FLAG_PRESSURE")
      case `GDK_AXIS_FLAG_XTILT` => Some("GDK_AXIS_FLAG_XTILT")
      case `GDK_AXIS_FLAG_YTILT` => Some("GDK_AXIS_FLAG_YTILT")
      case `GDK_AXIS_FLAG_WHEEL` => Some("GDK_AXIS_FLAG_WHEEL")
      case `GDK_AXIS_FLAG_DISTANCE` => Some("GDK_AXIS_FLAG_DISTANCE")
      case `GDK_AXIS_FLAG_ROTATION` => Some("GDK_AXIS_FLAG_ROTATION")
      case `GDK_AXIS_FLAG_SLIDER` => Some("GDK_AXIS_FLAG_SLIDER")
      case _ => _root_.scala.None
  extension (a: GdkAxisFlags)
    inline def &(b: GdkAxisFlags): GdkAxisFlags = a & b
    inline def |(b: GdkAxisFlags): GdkAxisFlags = a | b
    inline def is(b: GdkAxisFlags): Boolean = (a & b) == b