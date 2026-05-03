package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSorterOrder

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes the type of order that a `GtkSorter` may produce.
  */
enum SorterOrder(val raw: GtkSorterOrder):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A partial order. Any `GtkOrdering` is possible.
    */
  case PARTIAL extends SorterOrder(GtkSorterOrder.GTK_SORTER_ORDER_PARTIAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No order, all elements are considered equal. gtk_sorter_compare() will
    * only return %GTK_ORDERING_EQUAL.
    */
  case NONE extends SorterOrder(GtkSorterOrder.GTK_SORTER_ORDER_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A total order. gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL
    * if an item is compared with itself. Two different items will never cause
    * this value to be returned.
    */
  case TOTAL extends SorterOrder(GtkSorterOrder.GTK_SORTER_ORDER_TOTAL)
end SorterOrder

object SorterOrder:
  def fromRaw(raw: GtkSorterOrder): SorterOrder =
    raw match
      case GtkSorterOrder.GTK_SORTER_ORDER_PARTIAL => SorterOrder.PARTIAL
      case GtkSorterOrder.GTK_SORTER_ORDER_NONE    => SorterOrder.NONE
      case GtkSorterOrder.GTK_SORTER_ORDER_TOTAL   => SorterOrder.TOTAL
  end fromRaw
end SorterOrder
