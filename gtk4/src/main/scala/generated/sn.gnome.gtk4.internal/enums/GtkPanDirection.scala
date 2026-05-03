package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPanDirection: _PAN_DIRECTION_LEFT: panned towards the left _PAN_DIRECTION_RIGHT: panned towards the right _PAN_DIRECTION_UP: panned upwards _PAN_DIRECTION_DOWN: panned downwards
*/
opaque type GtkPanDirection = CUnsignedInt
object GtkPanDirection extends _BindgenEnumCUnsignedInt[GtkPanDirection]:
  given _tag: Tag[GtkPanDirection] = Tag.UInt
  inline def define(inline a: Long): GtkPanDirection = a.toUInt
  val GTK_PAN_DIRECTION_LEFT = define(0)
  val GTK_PAN_DIRECTION_RIGHT = define(1)
  val GTK_PAN_DIRECTION_UP = define(2)
  val GTK_PAN_DIRECTION_DOWN = define(3)
  def getName(value: GtkPanDirection): Option[String] =
    value match
      case `GTK_PAN_DIRECTION_LEFT` => Some("GTK_PAN_DIRECTION_LEFT")
      case `GTK_PAN_DIRECTION_RIGHT` => Some("GTK_PAN_DIRECTION_RIGHT")
      case `GTK_PAN_DIRECTION_UP` => Some("GTK_PAN_DIRECTION_UP")
      case `GTK_PAN_DIRECTION_DOWN` => Some("GTK_PAN_DIRECTION_DOWN")
      case _ => _root_.scala.None
  extension (a: GtkPanDirection)
    inline def &(b: GtkPanDirection): GtkPanDirection = a & b
    inline def |(b: GtkPanDirection): GtkPanDirection = a | b
    inline def is(b: GtkPanDirection): Boolean = (a & b) == b