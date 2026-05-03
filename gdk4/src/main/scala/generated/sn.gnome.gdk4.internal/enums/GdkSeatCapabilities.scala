package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkSeatCapabilities: _SEAT_CAPABILITY_NONE: No input capabilities _SEAT_CAPABILITY_POINTER: The seat has a pointer (e.g. mouse) _SEAT_CAPABILITY_TOUCH: The seat has touchscreen(s) attached _SEAT_CAPABILITY_TABLET_STYLUS: The seat has drawing tablet(s) attached _SEAT_CAPABILITY_KEYBOARD: The seat has keyboard(s) attached _SEAT_CAPABILITY_TABLET_PAD: The seat has drawing tablet pad(s) attached _SEAT_CAPABILITY_ALL_POINTING: The union of all pointing capabilities _SEAT_CAPABILITY_ALL: The union of all capabilities
*/
opaque type GdkSeatCapabilities = CUnsignedInt
object GdkSeatCapabilities extends _BindgenEnumCUnsignedInt[GdkSeatCapabilities]:
  given _tag: Tag[GdkSeatCapabilities] = Tag.UInt
  inline def define(inline a: Long): GdkSeatCapabilities = a.toUInt
  val GDK_SEAT_CAPABILITY_NONE = define(0)
  val GDK_SEAT_CAPABILITY_POINTER = define(1)
  val GDK_SEAT_CAPABILITY_TOUCH = define(2)
  val GDK_SEAT_CAPABILITY_TABLET_STYLUS = define(4)
  val GDK_SEAT_CAPABILITY_KEYBOARD = define(8)
  val GDK_SEAT_CAPABILITY_TABLET_PAD = define(16)
  val GDK_SEAT_CAPABILITY_ALL_POINTING = define(7)
  val GDK_SEAT_CAPABILITY_ALL = define(31)
  def getName(value: GdkSeatCapabilities): Option[String] =
    value match
      case `GDK_SEAT_CAPABILITY_NONE` => Some("GDK_SEAT_CAPABILITY_NONE")
      case `GDK_SEAT_CAPABILITY_POINTER` => Some("GDK_SEAT_CAPABILITY_POINTER")
      case `GDK_SEAT_CAPABILITY_TOUCH` => Some("GDK_SEAT_CAPABILITY_TOUCH")
      case `GDK_SEAT_CAPABILITY_TABLET_STYLUS` => Some("GDK_SEAT_CAPABILITY_TABLET_STYLUS")
      case `GDK_SEAT_CAPABILITY_KEYBOARD` => Some("GDK_SEAT_CAPABILITY_KEYBOARD")
      case `GDK_SEAT_CAPABILITY_TABLET_PAD` => Some("GDK_SEAT_CAPABILITY_TABLET_PAD")
      case `GDK_SEAT_CAPABILITY_ALL_POINTING` => Some("GDK_SEAT_CAPABILITY_ALL_POINTING")
      case `GDK_SEAT_CAPABILITY_ALL` => Some("GDK_SEAT_CAPABILITY_ALL")
      case _ => _root_.scala.None
  extension (a: GdkSeatCapabilities)
    inline def &(b: GdkSeatCapabilities): GdkSeatCapabilities = a & b
    inline def |(b: GdkSeatCapabilities): GdkSeatCapabilities = a | b
    inline def is(b: GdkSeatCapabilities): Boolean = (a & b) == b