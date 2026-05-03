package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSortType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Determines the direction of a sort.
  */
enum SortType(val raw: GtkSortType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sorting is in ascending order.
    */
  case ASCENDING extends SortType(GtkSortType.GTK_SORT_ASCENDING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sorting is in descending order.
    */
  case DESCENDING extends SortType(GtkSortType.GTK_SORT_DESCENDING)
end SortType

object SortType:
  def fromRaw(raw: GtkSortType): SortType =
    raw match
      case GtkSortType.GTK_SORT_ASCENDING  => SortType.ASCENDING
      case GtkSortType.GTK_SORT_DESCENDING => SortType.DESCENDING
  end fromRaw
end SortType
