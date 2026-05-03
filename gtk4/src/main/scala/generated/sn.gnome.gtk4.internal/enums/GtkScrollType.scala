package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkScrollType: _SCROLL_NONE: No scrolling. _SCROLL_JUMP: Jump to new location. _SCROLL_STEP_BACKWARD: Step backward. _SCROLL_STEP_FORWARD: Step forward. _SCROLL_PAGE_BACKWARD: Page backward. _SCROLL_PAGE_FORWARD: Page forward. _SCROLL_STEP_UP: Step up. _SCROLL_STEP_DOWN: Step down. _SCROLL_PAGE_UP: Page up. _SCROLL_PAGE_DOWN: Page down. _SCROLL_STEP_LEFT: Step to the left. _SCROLL_STEP_RIGHT: Step to the right. _SCROLL_PAGE_LEFT: Page to the left. _SCROLL_PAGE_RIGHT: Page to the right. _SCROLL_START: Scroll to start. _SCROLL_END: Scroll to end.
*/
opaque type GtkScrollType = CUnsignedInt
object GtkScrollType extends _BindgenEnumCUnsignedInt[GtkScrollType]:
  given _tag: Tag[GtkScrollType] = Tag.UInt
  inline def define(inline a: Long): GtkScrollType = a.toUInt
  val GTK_SCROLL_NONE = define(0)
  val GTK_SCROLL_JUMP = define(1)
  val GTK_SCROLL_STEP_BACKWARD = define(2)
  val GTK_SCROLL_STEP_FORWARD = define(3)
  val GTK_SCROLL_PAGE_BACKWARD = define(4)
  val GTK_SCROLL_PAGE_FORWARD = define(5)
  val GTK_SCROLL_STEP_UP = define(6)
  val GTK_SCROLL_STEP_DOWN = define(7)
  val GTK_SCROLL_PAGE_UP = define(8)
  val GTK_SCROLL_PAGE_DOWN = define(9)
  val GTK_SCROLL_STEP_LEFT = define(10)
  val GTK_SCROLL_STEP_RIGHT = define(11)
  val GTK_SCROLL_PAGE_LEFT = define(12)
  val GTK_SCROLL_PAGE_RIGHT = define(13)
  val GTK_SCROLL_START = define(14)
  val GTK_SCROLL_END = define(15)
  def getName(value: GtkScrollType): Option[String] =
    value match
      case `GTK_SCROLL_NONE` => Some("GTK_SCROLL_NONE")
      case `GTK_SCROLL_JUMP` => Some("GTK_SCROLL_JUMP")
      case `GTK_SCROLL_STEP_BACKWARD` => Some("GTK_SCROLL_STEP_BACKWARD")
      case `GTK_SCROLL_STEP_FORWARD` => Some("GTK_SCROLL_STEP_FORWARD")
      case `GTK_SCROLL_PAGE_BACKWARD` => Some("GTK_SCROLL_PAGE_BACKWARD")
      case `GTK_SCROLL_PAGE_FORWARD` => Some("GTK_SCROLL_PAGE_FORWARD")
      case `GTK_SCROLL_STEP_UP` => Some("GTK_SCROLL_STEP_UP")
      case `GTK_SCROLL_STEP_DOWN` => Some("GTK_SCROLL_STEP_DOWN")
      case `GTK_SCROLL_PAGE_UP` => Some("GTK_SCROLL_PAGE_UP")
      case `GTK_SCROLL_PAGE_DOWN` => Some("GTK_SCROLL_PAGE_DOWN")
      case `GTK_SCROLL_STEP_LEFT` => Some("GTK_SCROLL_STEP_LEFT")
      case `GTK_SCROLL_STEP_RIGHT` => Some("GTK_SCROLL_STEP_RIGHT")
      case `GTK_SCROLL_PAGE_LEFT` => Some("GTK_SCROLL_PAGE_LEFT")
      case `GTK_SCROLL_PAGE_RIGHT` => Some("GTK_SCROLL_PAGE_RIGHT")
      case `GTK_SCROLL_START` => Some("GTK_SCROLL_START")
      case `GTK_SCROLL_END` => Some("GTK_SCROLL_END")
      case _ => _root_.scala.None
  extension (a: GtkScrollType)
    inline def &(b: GtkScrollType): GtkScrollType = a & b
    inline def |(b: GtkScrollType): GtkScrollType = a | b
    inline def is(b: GtkScrollType): Boolean = (a & b) == b