package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkAccessibleSort

/** The possible values for the %GTK_ACCESSIBLE_PROPERTY_SORT accessible
  * property.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AccessibleSort(val raw: GtkAccessibleSort):
  /** There is no defined sort applied to the column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends AccessibleSort(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_NONE)

  /** Items are sorted in ascending order by this column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ASCENDING
      extends AccessibleSort(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_ASCENDING)

  /** Items are sorted in descending order by this column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DESCENDING
      extends AccessibleSort(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_DESCENDING)

  /** A sort algorithm other than ascending or descending has been applied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
