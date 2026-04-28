package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkDeviceToolType: _DEVICE_TOOL_TYPE_UNKNOWN: Tool is of an unknown type. _DEVICE_TOOL_TYPE_PEN: Tool is a standard tablet stylus. _DEVICE_TOOL_TYPE_ERASER: Tool is standard tablet eraser. _DEVICE_TOOL_TYPE_BRUSH: Tool is a brush stylus. _DEVICE_TOOL_TYPE_PENCIL: Tool is a pencil stylus. _DEVICE_TOOL_TYPE_AIRBRUSH: Tool is an airbrush stylus. _DEVICE_TOOL_TYPE_MOUSE: Tool is a mouse. _DEVICE_TOOL_TYPE_LENS: Tool is a lens cursor.
*/
opaque type GdkDeviceToolType = CUnsignedInt
object GdkDeviceToolType extends _BindgenEnumCUnsignedInt[GdkDeviceToolType]:
  given _tag: Tag[GdkDeviceToolType] = Tag.UInt
  inline def define(inline a: Long): GdkDeviceToolType = a.toUInt
  val GDK_DEVICE_TOOL_TYPE_UNKNOWN = define(0)
  val GDK_DEVICE_TOOL_TYPE_PEN = define(1)
  val GDK_DEVICE_TOOL_TYPE_ERASER = define(2)
  val GDK_DEVICE_TOOL_TYPE_BRUSH = define(3)
  val GDK_DEVICE_TOOL_TYPE_PENCIL = define(4)
  val GDK_DEVICE_TOOL_TYPE_AIRBRUSH = define(5)
  val GDK_DEVICE_TOOL_TYPE_MOUSE = define(6)
  val GDK_DEVICE_TOOL_TYPE_LENS = define(7)
  def getName(value: GdkDeviceToolType): Option[String] =
    value match
      case `GDK_DEVICE_TOOL_TYPE_UNKNOWN` => Some("GDK_DEVICE_TOOL_TYPE_UNKNOWN")
      case `GDK_DEVICE_TOOL_TYPE_PEN` => Some("GDK_DEVICE_TOOL_TYPE_PEN")
      case `GDK_DEVICE_TOOL_TYPE_ERASER` => Some("GDK_DEVICE_TOOL_TYPE_ERASER")
      case `GDK_DEVICE_TOOL_TYPE_BRUSH` => Some("GDK_DEVICE_TOOL_TYPE_BRUSH")
      case `GDK_DEVICE_TOOL_TYPE_PENCIL` => Some("GDK_DEVICE_TOOL_TYPE_PENCIL")
      case `GDK_DEVICE_TOOL_TYPE_AIRBRUSH` => Some("GDK_DEVICE_TOOL_TYPE_AIRBRUSH")
      case `GDK_DEVICE_TOOL_TYPE_MOUSE` => Some("GDK_DEVICE_TOOL_TYPE_MOUSE")
      case `GDK_DEVICE_TOOL_TYPE_LENS` => Some("GDK_DEVICE_TOOL_TYPE_LENS")
      case _ => _root_.scala.None
  extension (a: GdkDeviceToolType)
    inline def &(b: GdkDeviceToolType): GdkDeviceToolType = a & b
    inline def |(b: GdkDeviceToolType): GdkDeviceToolType = a | b
    inline def is(b: GdkDeviceToolType): Boolean = (a & b) == b