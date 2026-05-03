package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCornerType: _CORNER_TOP_LEFT: Place the scrollbars on the right and bottom of the widget (default behaviour). _CORNER_BOTTOM_LEFT: Place the scrollbars on the top and right of the widget. _CORNER_TOP_RIGHT: Place the scrollbars on the left and bottom of the widget. _CORNER_BOTTOM_RIGHT: Place the scrollbars on the top and left of the widget.
*/
opaque type GtkCornerType = CUnsignedInt
object GtkCornerType extends _BindgenEnumCUnsignedInt[GtkCornerType]:
  given _tag: Tag[GtkCornerType] = Tag.UInt
  inline def define(inline a: Long): GtkCornerType = a.toUInt
  val GTK_CORNER_TOP_LEFT = define(0)
  val GTK_CORNER_BOTTOM_LEFT = define(1)
  val GTK_CORNER_TOP_RIGHT = define(2)
  val GTK_CORNER_BOTTOM_RIGHT = define(3)
  def getName(value: GtkCornerType): Option[String] =
    value match
      case `GTK_CORNER_TOP_LEFT` => Some("GTK_CORNER_TOP_LEFT")
      case `GTK_CORNER_BOTTOM_LEFT` => Some("GTK_CORNER_BOTTOM_LEFT")
      case `GTK_CORNER_TOP_RIGHT` => Some("GTK_CORNER_TOP_RIGHT")
      case `GTK_CORNER_BOTTOM_RIGHT` => Some("GTK_CORNER_BOTTOM_RIGHT")
      case _ => _root_.scala.None
  extension (a: GtkCornerType)
    inline def &(b: GtkCornerType): GtkCornerType = a & b
    inline def |(b: GtkCornerType): GtkCornerType = a | b
    inline def is(b: GtkCornerType): Boolean = (a & b) == b