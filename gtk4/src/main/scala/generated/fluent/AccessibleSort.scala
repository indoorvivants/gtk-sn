package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleSort

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible values for the %GTK_ACCESSIBLE_PROPERTY_SORT accessible
  * property.
  */
enum AccessibleSort(val raw: GtkAccessibleSort):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * There is no defined sort applied to the column.
    */
  case NONE extends AccessibleSort(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Items are sorted in ascending order by this column.
    */
  case ASCENDING
      extends AccessibleSort(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_ASCENDING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Items are sorted in descending order by this column.
    */
  case DESCENDING
      extends AccessibleSort(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_DESCENDING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A sort algorithm other than ascending or descending has been applied.
    */
  case OTHER extends AccessibleSort(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_OTHER)
end AccessibleSort

object AccessibleSort:
  def fromRaw(raw: GtkAccessibleSort): AccessibleSort =
    raw match
      case GtkAccessibleSort.GTK_ACCESSIBLE_SORT_NONE => AccessibleSort.NONE
      case GtkAccessibleSort.GTK_ACCESSIBLE_SORT_ASCENDING =>
        AccessibleSort.ASCENDING
      case GtkAccessibleSort.GTK_ACCESSIBLE_SORT_DESCENDING =>
        AccessibleSort.DESCENDING
      case GtkAccessibleSort.GTK_ACCESSIBLE_SORT_OTHER => AccessibleSort.OTHER
  end fromRaw
end AccessibleSort
