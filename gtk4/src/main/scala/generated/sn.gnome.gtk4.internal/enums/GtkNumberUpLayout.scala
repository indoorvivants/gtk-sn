package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkNumberUpLayout: _NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM: ![](layout-lrtb.png) _NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP: ![](layout-lrbt.png) _NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM: ![](layout-rltb.png) _NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP: ![](layout-rlbt.png) _NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT: ![](layout-tblr.png) _NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT: ![](layout-tbrl.png) _NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT: ![](layout-btlr.png) _NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT: ![](layout-btrl.png)
*/
opaque type GtkNumberUpLayout = CUnsignedInt
object GtkNumberUpLayout extends _BindgenEnumCUnsignedInt[GtkNumberUpLayout]:
  given _tag: Tag[GtkNumberUpLayout] = Tag.UInt
  inline def define(inline a: Long): GtkNumberUpLayout = a.toUInt
  val GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM = define(0)
  val GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP = define(1)
  val GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM = define(2)
  val GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP = define(3)
  val GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT = define(4)
  val GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT = define(5)
  val GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT = define(6)
  val GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT = define(7)
  def getName(value: GtkNumberUpLayout): Option[String] =
    value match
      case `GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM` => Some("GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM")
      case `GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP` => Some("GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP")
      case `GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM` => Some("GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM")
      case `GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP` => Some("GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP")
      case `GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT` => Some("GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT")
      case `GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT` => Some("GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT")
      case `GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT` => Some("GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT")
      case `GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT` => Some("GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT")
      case _ => _root_.scala.None
  extension (a: GtkNumberUpLayout)
    inline def &(b: GtkNumberUpLayout): GtkNumberUpLayout = a & b
    inline def |(b: GtkNumberUpLayout): GtkNumberUpLayout = a | b
    inline def is(b: GtkNumberUpLayout): Boolean = (a & b) == b