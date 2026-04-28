package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkListScrollFlags: _LIST_SCROLL_NONE: Don't do anything extra _LIST_SCROLL_FOCUS: Focus the target item _LIST_SCROLL_SELECT: Select the target item and unselect all other items.
*/
opaque type GtkListScrollFlags = CUnsignedInt
object GtkListScrollFlags extends _BindgenEnumCUnsignedInt[GtkListScrollFlags]:
  given _tag: Tag[GtkListScrollFlags] = Tag.UInt
  inline def define(inline a: Long): GtkListScrollFlags = a.toUInt
  val GTK_LIST_SCROLL_NONE = define(0)
  val GTK_LIST_SCROLL_FOCUS = define(1)
  val GTK_LIST_SCROLL_SELECT = define(2)
  def getName(value: GtkListScrollFlags): Option[String] =
    value match
      case `GTK_LIST_SCROLL_NONE` => Some("GTK_LIST_SCROLL_NONE")
      case `GTK_LIST_SCROLL_FOCUS` => Some("GTK_LIST_SCROLL_FOCUS")
      case `GTK_LIST_SCROLL_SELECT` => Some("GTK_LIST_SCROLL_SELECT")
      case _ => _root_.scala.None
  extension (a: GtkListScrollFlags)
    inline def &(b: GtkListScrollFlags): GtkListScrollFlags = a & b
    inline def |(b: GtkListScrollFlags): GtkListScrollFlags = a | b
    inline def is(b: GtkListScrollFlags): Boolean = (a & b) == b