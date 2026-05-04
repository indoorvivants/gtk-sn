package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSortType

/** Determines the direction of a sort.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SortType(val raw: GtkSortType):
  /** Sorting is in ascending order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ASCENDING extends SortType(GtkSortType.GTK_SORT_ASCENDING)

  /** Sorting is in descending order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
