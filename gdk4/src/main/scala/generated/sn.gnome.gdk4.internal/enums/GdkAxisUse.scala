package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkAxisUse: _AXIS_IGNORE: the axis is ignored. _AXIS_X: the axis is used as the x axis. _AXIS_Y: the axis is used as the y axis. _AXIS_DELTA_X: the axis is used as the scroll x delta _AXIS_DELTA_Y: the axis is used as the scroll y delta _AXIS_PRESSURE: the axis is used for pressure information. _AXIS_XTILT: the axis is used for x tilt information. _AXIS_YTILT: the axis is used for y tilt information. _AXIS_WHEEL: the axis is used for wheel information. _AXIS_DISTANCE: the axis is used for pen/tablet distance information _AXIS_ROTATION: the axis is used for pen rotation information _AXIS_SLIDER: the axis is used for pen slider information _AXIS_LAST: a constant equal to the numerically highest axis value.
*/
opaque type GdkAxisUse = CUnsignedInt
object GdkAxisUse extends _BindgenEnumCUnsignedInt[GdkAxisUse]:
  given _tag: Tag[GdkAxisUse] = Tag.UInt
  inline def define(inline a: Long): GdkAxisUse = a.toUInt
  val GDK_AXIS_IGNORE = define(0)
  val GDK_AXIS_X = define(1)
  val GDK_AXIS_Y = define(2)
  val GDK_AXIS_DELTA_X = define(3)
  val GDK_AXIS_DELTA_Y = define(4)
  val GDK_AXIS_PRESSURE = define(5)
  val GDK_AXIS_XTILT = define(6)
  val GDK_AXIS_YTILT = define(7)
  val GDK_AXIS_WHEEL = define(8)
  val GDK_AXIS_DISTANCE = define(9)
  val GDK_AXIS_ROTATION = define(10)
  val GDK_AXIS_SLIDER = define(11)
  val GDK_AXIS_LAST = define(12)
  def getName(value: GdkAxisUse): Option[String] =
    value match
      case `GDK_AXIS_IGNORE` => Some("GDK_AXIS_IGNORE")
      case `GDK_AXIS_X` => Some("GDK_AXIS_X")
      case `GDK_AXIS_Y` => Some("GDK_AXIS_Y")
      case `GDK_AXIS_DELTA_X` => Some("GDK_AXIS_DELTA_X")
      case `GDK_AXIS_DELTA_Y` => Some("GDK_AXIS_DELTA_Y")
      case `GDK_AXIS_PRESSURE` => Some("GDK_AXIS_PRESSURE")
      case `GDK_AXIS_XTILT` => Some("GDK_AXIS_XTILT")
      case `GDK_AXIS_YTILT` => Some("GDK_AXIS_YTILT")
      case `GDK_AXIS_WHEEL` => Some("GDK_AXIS_WHEEL")
      case `GDK_AXIS_DISTANCE` => Some("GDK_AXIS_DISTANCE")
      case `GDK_AXIS_ROTATION` => Some("GDK_AXIS_ROTATION")
      case `GDK_AXIS_SLIDER` => Some("GDK_AXIS_SLIDER")
      case `GDK_AXIS_LAST` => Some("GDK_AXIS_LAST")
      case _ => _root_.scala.None
  extension (a: GdkAxisUse)
    inline def &(b: GdkAxisUse): GdkAxisUse = a & b
    inline def |(b: GdkAxisUse): GdkAxisUse = a | b
    inline def is(b: GdkAxisUse): Boolean = (a & b) == b