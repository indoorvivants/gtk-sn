package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSorterChange

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes changes in a sorter in more detail and allows users to optimize
  * resorting.
  */
enum SorterChange(val raw: GtkSorterChange):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The sorter change cannot be described by any of the other enumeration
    * values
    */
  case DIFFERENT
      extends SorterChange(GtkSorterChange.GTK_SORTER_CHANGE_DIFFERENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The sort order was inverted. Comparisons that returned
    * %GTK_ORDERING_SMALLER now return %GTK_ORDERING_LARGER and vice versa.
    * Other comparisons return the same values as before.
    */
  case INVERTED extends SorterChange(GtkSorterChange.GTK_SORTER_CHANGE_INVERTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The sorter is less strict: Comparisons may now return %GTK_ORDERING_EQUAL
    * that did not do so before.
    */
  case LESS_STRICT
      extends SorterChange(GtkSorterChange.GTK_SORTER_CHANGE_LESS_STRICT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The sorter is more strict: Comparisons that did return %GTK_ORDERING_EQUAL
    * may not do so anymore.
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
