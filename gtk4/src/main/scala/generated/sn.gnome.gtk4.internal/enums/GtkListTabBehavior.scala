package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkListTabBehavior: _LIST_TAB_ALL: Cycle through all focusable items of the list _LIST_TAB_ITEM: Cycle through a single list element, then move focus out of the list. Moving focus between items needs to be done with the arrow keys. _LIST_TAB_CELL: Cycle only through a single cell, then move focus out of the list. Moving focus between cells needs to be done with the arrow keys. This is only relevant for cell-based widgets like #GtkColumnView, otherwise it behaves like `GTK_LIST_TAB_ITEM`.
*/
opaque type GtkListTabBehavior = CUnsignedInt
object GtkListTabBehavior extends _BindgenEnumCUnsignedInt[GtkListTabBehavior]:
  given _tag: Tag[GtkListTabBehavior] = Tag.UInt
  inline def define(inline a: Long): GtkListTabBehavior = a.toUInt
  val GTK_LIST_TAB_ALL = define(0)
  val GTK_LIST_TAB_ITEM = define(1)
  val GTK_LIST_TAB_CELL = define(2)
  def getName(value: GtkListTabBehavior): Option[String] =
    value match
      case `GTK_LIST_TAB_ALL` => Some("GTK_LIST_TAB_ALL")
      case `GTK_LIST_TAB_ITEM` => Some("GTK_LIST_TAB_ITEM")
      case `GTK_LIST_TAB_CELL` => Some("GTK_LIST_TAB_CELL")
      case _ => _root_.scala.None
  extension (a: GtkListTabBehavior)
    inline def &(b: GtkListTabBehavior): GtkListTabBehavior = a & b
    inline def |(b: GtkListTabBehavior): GtkListTabBehavior = a | b
    inline def is(b: GtkListTabBehavior): Boolean = (a & b) == b