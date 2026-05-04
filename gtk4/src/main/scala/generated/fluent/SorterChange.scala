package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSorterChange

/** Describes changes in a sorter in more detail and allows users to optimize
  * resorting.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SorterChange(val raw: GtkSorterChange):
  /** The sorter change cannot be described by any of the other enumeration
    * values
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIFFERENT
      extends SorterChange(GtkSorterChange.GTK_SORTER_CHANGE_DIFFERENT)

  /** The sort order was inverted. Comparisons that returned
    * %GTK_ORDERING_SMALLER now return %GTK_ORDERING_LARGER and vice versa.
    * Other comparisons return the same values as before.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVERTED extends SorterChange(GtkSorterChange.GTK_SORTER_CHANGE_INVERTED)

  /** The sorter is less strict: Comparisons may now return %GTK_ORDERING_EQUAL
    * that did not do so before.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LESS_STRICT
      extends SorterChange(GtkSorterChange.GTK_SORTER_CHANGE_LESS_STRICT)

  /** The sorter is more strict: Comparisons that did return %GTK_ORDERING_EQUAL
    * may not do so anymore.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MORE_STRICT
      extends SorterChange(GtkSorterChange.GTK_SORTER_CHANGE_MORE_STRICT)
end SorterChange

object SorterChange:
  def fromRaw(raw: GtkSorterChange): SorterChange =
    raw match
      case GtkSorterChange.GTK_SORTER_CHANGE_DIFFERENT => SorterChange.DIFFERENT
      case GtkSorterChange.GTK_SORTER_CHANGE_INVERTED  => SorterChange.INVERTED
      case GtkSorterChange.GTK_SORTER_CHANGE_LESS_STRICT =>
        SorterChange.LESS_STRICT
      case GtkSorterChange.GTK_SORTER_CHANGE_MORE_STRICT =>
        SorterChange.MORE_STRICT
  end fromRaw
end SorterChange
