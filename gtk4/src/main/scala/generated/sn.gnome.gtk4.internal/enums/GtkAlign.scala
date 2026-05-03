package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAlign: _ALIGN_FILL: stretch to fill all space if possible, center if no meaningful way to stretch _ALIGN_START: snap to left or top side, leaving space on right or bottom _ALIGN_END: snap to right or bottom side, leaving space on left or top _ALIGN_CENTER: center natural width of widget inside the allocation
*/
opaque type GtkAlign = CUnsignedInt
object GtkAlign extends _BindgenEnumCUnsignedInt[GtkAlign]:
  given _tag: Tag[GtkAlign] = Tag.UInt
  inline def define(inline a: Long): GtkAlign = a.toUInt
  val GTK_ALIGN_FILL = define(0)
  val GTK_ALIGN_START = define(1)
  val GTK_ALIGN_END = define(2)
  val GTK_ALIGN_CENTER = define(3)
  val GTK_ALIGN_BASELINE_FILL = define(4)
  val GTK_ALIGN_BASELINE = define(4)
  val GTK_ALIGN_BASELINE_CENTER = define(5)
  def getName(value: GtkAlign): Option[String] =
    value match
      case `GTK_ALIGN_FILL` => Some("GTK_ALIGN_FILL")
      case `GTK_ALIGN_START` => Some("GTK_ALIGN_START")
      case `GTK_ALIGN_END` => Some("GTK_ALIGN_END")
      case `GTK_ALIGN_CENTER` => Some("GTK_ALIGN_CENTER")
      case `GTK_ALIGN_BASELINE_FILL` => Some("GTK_ALIGN_BASELINE_FILL")
      case `GTK_ALIGN_BASELINE` => Some("GTK_ALIGN_BASELINE")
      case `GTK_ALIGN_BASELINE_CENTER` => Some("GTK_ALIGN_BASELINE_CENTER")
      case _ => _root_.scala.None
  extension (a: GtkAlign)
    inline def &(b: GtkAlign): GtkAlign = a & b
    inline def |(b: GtkAlign): GtkAlign = a | b
    inline def is(b: GtkAlign): Boolean = (a & b) == b