package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkIconViewDropPosition: _ICON_VIEW_NO_DROP: no drop possible _ICON_VIEW_DROP_INTO: dropped item replaces the item _ICON_VIEW_DROP_LEFT: dropped item is inserted to the left _ICON_VIEW_DROP_RIGHT: dropped item is inserted to the right _ICON_VIEW_DROP_ABOVE: dropped item is inserted above _ICON_VIEW_DROP_BELOW: dropped item is inserted below
*/
opaque type GtkIconViewDropPosition = CUnsignedInt
object GtkIconViewDropPosition extends _BindgenEnumCUnsignedInt[GtkIconViewDropPosition]:
  given _tag: Tag[GtkIconViewDropPosition] = Tag.UInt
  inline def define(inline a: Long): GtkIconViewDropPosition = a.toUInt
  val GTK_ICON_VIEW_NO_DROP = define(0)
  val GTK_ICON_VIEW_DROP_INTO = define(1)
  val GTK_ICON_VIEW_DROP_LEFT = define(2)
  val GTK_ICON_VIEW_DROP_RIGHT = define(3)
  val GTK_ICON_VIEW_DROP_ABOVE = define(4)
  val GTK_ICON_VIEW_DROP_BELOW = define(5)
  def getName(value: GtkIconViewDropPosition): Option[String] =
    value match
      case `GTK_ICON_VIEW_NO_DROP` => Some("GTK_ICON_VIEW_NO_DROP")
      case `GTK_ICON_VIEW_DROP_INTO` => Some("GTK_ICON_VIEW_DROP_INTO")
      case `GTK_ICON_VIEW_DROP_LEFT` => Some("GTK_ICON_VIEW_DROP_LEFT")
      case `GTK_ICON_VIEW_DROP_RIGHT` => Some("GTK_ICON_VIEW_DROP_RIGHT")
      case `GTK_ICON_VIEW_DROP_ABOVE` => Some("GTK_ICON_VIEW_DROP_ABOVE")
      case `GTK_ICON_VIEW_DROP_BELOW` => Some("GTK_ICON_VIEW_DROP_BELOW")
      case _ => _root_.scala.None
  extension (a: GtkIconViewDropPosition)
    inline def &(b: GtkIconViewDropPosition): GtkIconViewDropPosition = a & b
    inline def |(b: GtkIconViewDropPosition): GtkIconViewDropPosition = a | b
    inline def is(b: GtkIconViewDropPosition): Boolean = (a & b) == b