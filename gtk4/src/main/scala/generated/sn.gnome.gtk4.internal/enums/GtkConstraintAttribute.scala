package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkConstraintAttribute: _CONSTRAINT_ATTRIBUTE_NONE: No attribute, used for constant relations _CONSTRAINT_ATTRIBUTE_LEFT: The left edge of a widget, regardless of text direction _CONSTRAINT_ATTRIBUTE_RIGHT: The right edge of a widget, regardless of text direction _CONSTRAINT_ATTRIBUTE_TOP: The top edge of a widget _CONSTRAINT_ATTRIBUTE_BOTTOM: The bottom edge of a widget _CONSTRAINT_ATTRIBUTE_START: The leading edge of a widget, depending on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_LEFT for LTR languages, and %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for RTL ones _CONSTRAINT_ATTRIBUTE_END: The trailing edge of a widget, depending on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for LTR languages, and %GTK_CONSTRAINT_ATTRIBUTE_LEFT for RTL ones _CONSTRAINT_ATTRIBUTE_WIDTH: The width of a widget _CONSTRAINT_ATTRIBUTE_HEIGHT: The height of a widget _CONSTRAINT_ATTRIBUTE_CENTER_X: The center of a widget, on the horizontal axis _CONSTRAINT_ATTRIBUTE_CENTER_Y: The center of a widget, on the vertical axis _CONSTRAINT_ATTRIBUTE_BASELINE: The baseline of a widget
*/
opaque type GtkConstraintAttribute = CUnsignedInt
object GtkConstraintAttribute extends _BindgenEnumCUnsignedInt[GtkConstraintAttribute]:
  given _tag: Tag[GtkConstraintAttribute] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintAttribute = a.toUInt
  val GTK_CONSTRAINT_ATTRIBUTE_NONE = define(0)
  val GTK_CONSTRAINT_ATTRIBUTE_LEFT = define(1)
  val GTK_CONSTRAINT_ATTRIBUTE_RIGHT = define(2)
  val GTK_CONSTRAINT_ATTRIBUTE_TOP = define(3)
  val GTK_CONSTRAINT_ATTRIBUTE_BOTTOM = define(4)
  val GTK_CONSTRAINT_ATTRIBUTE_START = define(5)
  val GTK_CONSTRAINT_ATTRIBUTE_END = define(6)
  val GTK_CONSTRAINT_ATTRIBUTE_WIDTH = define(7)
  val GTK_CONSTRAINT_ATTRIBUTE_HEIGHT = define(8)
  val GTK_CONSTRAINT_ATTRIBUTE_CENTER_X = define(9)
  val GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y = define(10)
  val GTK_CONSTRAINT_ATTRIBUTE_BASELINE = define(11)
  def getName(value: GtkConstraintAttribute): Option[String] =
    value match
      case `GTK_CONSTRAINT_ATTRIBUTE_NONE` => Some("GTK_CONSTRAINT_ATTRIBUTE_NONE")
      case `GTK_CONSTRAINT_ATTRIBUTE_LEFT` => Some("GTK_CONSTRAINT_ATTRIBUTE_LEFT")
      case `GTK_CONSTRAINT_ATTRIBUTE_RIGHT` => Some("GTK_CONSTRAINT_ATTRIBUTE_RIGHT")
      case `GTK_CONSTRAINT_ATTRIBUTE_TOP` => Some("GTK_CONSTRAINT_ATTRIBUTE_TOP")
      case `GTK_CONSTRAINT_ATTRIBUTE_BOTTOM` => Some("GTK_CONSTRAINT_ATTRIBUTE_BOTTOM")
      case `GTK_CONSTRAINT_ATTRIBUTE_START` => Some("GTK_CONSTRAINT_ATTRIBUTE_START")
      case `GTK_CONSTRAINT_ATTRIBUTE_END` => Some("GTK_CONSTRAINT_ATTRIBUTE_END")
      case `GTK_CONSTRAINT_ATTRIBUTE_WIDTH` => Some("GTK_CONSTRAINT_ATTRIBUTE_WIDTH")
      case `GTK_CONSTRAINT_ATTRIBUTE_HEIGHT` => Some("GTK_CONSTRAINT_ATTRIBUTE_HEIGHT")
      case `GTK_CONSTRAINT_ATTRIBUTE_CENTER_X` => Some("GTK_CONSTRAINT_ATTRIBUTE_CENTER_X")
      case `GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y` => Some("GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y")
      case `GTK_CONSTRAINT_ATTRIBUTE_BASELINE` => Some("GTK_CONSTRAINT_ATTRIBUTE_BASELINE")
      case _ => _root_.scala.None
  extension (a: GtkConstraintAttribute)
    inline def &(b: GtkConstraintAttribute): GtkConstraintAttribute = a & b
    inline def |(b: GtkConstraintAttribute): GtkConstraintAttribute = a | b
    inline def is(b: GtkConstraintAttribute): Boolean = (a & b) == b