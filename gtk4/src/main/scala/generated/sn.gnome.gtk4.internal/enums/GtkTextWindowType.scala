package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextWindowType: _TEXT_WINDOW_WIDGET: Window that floats over scrolling areas. _TEXT_WINDOW_TEXT: Scrollable text window. _TEXT_WINDOW_LEFT: Left side border window. _TEXT_WINDOW_RIGHT: Right side border window. _TEXT_WINDOW_TOP: Top border window. _TEXT_WINDOW_BOTTOM: Bottom border window.
*/
opaque type GtkTextWindowType = CUnsignedInt
object GtkTextWindowType extends _BindgenEnumCUnsignedInt[GtkTextWindowType]:
  given _tag: Tag[GtkTextWindowType] = Tag.UInt
  inline def define(inline a: Long): GtkTextWindowType = a.toUInt
  val GTK_TEXT_WINDOW_WIDGET = define(1)
  val GTK_TEXT_WINDOW_TEXT = define(2)
  val GTK_TEXT_WINDOW_LEFT = define(3)
  val GTK_TEXT_WINDOW_RIGHT = define(4)
  val GTK_TEXT_WINDOW_TOP = define(5)
  val GTK_TEXT_WINDOW_BOTTOM = define(6)
  def getName(value: GtkTextWindowType): Option[String] =
    value match
      case `GTK_TEXT_WINDOW_WIDGET` => Some("GTK_TEXT_WINDOW_WIDGET")
      case `GTK_TEXT_WINDOW_TEXT` => Some("GTK_TEXT_WINDOW_TEXT")
      case `GTK_TEXT_WINDOW_LEFT` => Some("GTK_TEXT_WINDOW_LEFT")
      case `GTK_TEXT_WINDOW_RIGHT` => Some("GTK_TEXT_WINDOW_RIGHT")
      case `GTK_TEXT_WINDOW_TOP` => Some("GTK_TEXT_WINDOW_TOP")
      case `GTK_TEXT_WINDOW_BOTTOM` => Some("GTK_TEXT_WINDOW_BOTTOM")
      case _ => _root_.scala.None
  extension (a: GtkTextWindowType)
    inline def &(b: GtkTextWindowType): GtkTextWindowType = a & b
    inline def |(b: GtkTextWindowType): GtkTextWindowType = a | b
    inline def is(b: GtkTextWindowType): Boolean = (a & b) == b