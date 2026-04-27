package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSorterOrder: _SORTER_ORDER_PARTIAL: A partial order. Any `GtkOrdering` is possible. _SORTER_ORDER_NONE: No order, all elements are considered equal. gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL. _SORTER_ORDER_TOTAL: A total order. gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL if an item is compared with itself. Two different items will never cause this value to be returned.
*/
opaque type GtkSorterOrder = CUnsignedInt
object GtkSorterOrder extends _BindgenEnumCUnsignedInt[GtkSorterOrder]:
  given _tag: Tag[GtkSorterOrder] = Tag.UInt
  inline def define(inline a: Long): GtkSorterOrder = a.toUInt
  val GTK_SORTER_ORDER_PARTIAL = define(0)
  val GTK_SORTER_ORDER_NONE = define(1)
  val GTK_SORTER_ORDER_TOTAL = define(2)
  def getName(value: GtkSorterOrder): Option[String] =
    value match
      case `GTK_SORTER_ORDER_PARTIAL` => Some("GTK_SORTER_ORDER_PARTIAL")
      case `GTK_SORTER_ORDER_NONE` => Some("GTK_SORTER_ORDER_NONE")
      case `GTK_SORTER_ORDER_TOTAL` => Some("GTK_SORTER_ORDER_TOTAL")
      case _ => _root_.scala.None
  extension (a: GtkSorterOrder)
    inline def &(b: GtkSorterOrder): GtkSorterOrder = a & b
    inline def |(b: GtkSorterOrder): GtkSorterOrder = a | b
    inline def is(b: GtkSorterOrder): Boolean = (a & b) == b