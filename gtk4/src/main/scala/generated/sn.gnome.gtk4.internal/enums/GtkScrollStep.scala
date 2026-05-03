package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkScrollStep: _SCROLL_STEPS: Scroll in steps. _SCROLL_PAGES: Scroll by pages. _SCROLL_ENDS: Scroll to ends. _SCROLL_HORIZONTAL_STEPS: Scroll in horizontal steps. _SCROLL_HORIZONTAL_PAGES: Scroll by horizontal pages. _SCROLL_HORIZONTAL_ENDS: Scroll to the horizontal ends.
*/
opaque type GtkScrollStep = CUnsignedInt
object GtkScrollStep extends _BindgenEnumCUnsignedInt[GtkScrollStep]:
  given _tag: Tag[GtkScrollStep] = Tag.UInt
  inline def define(inline a: Long): GtkScrollStep = a.toUInt
  val GTK_SCROLL_STEPS = define(0)
  val GTK_SCROLL_PAGES = define(1)
  val GTK_SCROLL_ENDS = define(2)
  val GTK_SCROLL_HORIZONTAL_STEPS = define(3)
  val GTK_SCROLL_HORIZONTAL_PAGES = define(4)
  val GTK_SCROLL_HORIZONTAL_ENDS = define(5)
  def getName(value: GtkScrollStep): Option[String] =
    value match
      case `GTK_SCROLL_STEPS` => Some("GTK_SCROLL_STEPS")
      case `GTK_SCROLL_PAGES` => Some("GTK_SCROLL_PAGES")
      case `GTK_SCROLL_ENDS` => Some("GTK_SCROLL_ENDS")
      case `GTK_SCROLL_HORIZONTAL_STEPS` => Some("GTK_SCROLL_HORIZONTAL_STEPS")
      case `GTK_SCROLL_HORIZONTAL_PAGES` => Some("GTK_SCROLL_HORIZONTAL_PAGES")
      case `GTK_SCROLL_HORIZONTAL_ENDS` => Some("GTK_SCROLL_HORIZONTAL_ENDS")
      case _ => _root_.scala.None
  extension (a: GtkScrollStep)
    inline def &(b: GtkScrollStep): GtkScrollStep = a & b
    inline def |(b: GtkScrollStep): GtkScrollStep = a | b
    inline def is(b: GtkScrollStep): Boolean = (a & b) == b