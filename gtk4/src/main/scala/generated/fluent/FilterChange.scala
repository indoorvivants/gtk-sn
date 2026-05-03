package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFilterChange

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes changes in a filter in more detail and allows objects using the
  * filter to optimize refiltering items.
  *
  * If you are writing an implementation and are not sure which value to pass,
  * %GTK_FILTER_CHANGE_DIFFERENT is always a correct choice.
  */
enum FilterChange(val raw: GtkFilterChange):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The filter change cannot be described with any of the other enumeration
    * values.
    */
  case DIFFERENT
      extends FilterChange(GtkFilterChange.GTK_FILTER_CHANGE_DIFFERENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The filter is less strict than it was before: All items that it used to
    * return %TRUE for still return %TRUE, others now may, too.
    */
  case LESS_STRICT
      extends FilterChange(GtkFilterChange.GTK_FILTER_CHANGE_LESS_STRICT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The filter is more strict than it was before: All items that it used to
    * return %FALSE for still return %FALSE, others now may, too.
    */
  case MORE_STRICT
      extends FilterChange(GtkFilterChange.GTK_FILTER_CHANGE_MORE_STRICT)
end FilterChange

object FilterChange:
  def fromRaw(raw: GtkFilterChange): FilterChange =
    raw match
      case GtkFilterChange.GTK_FILTER_CHANGE_DIFFERENT => FilterChange.DIFFERENT
      case GtkFilterChange.GTK_FILTER_CHANGE_LESS_STRICT =>
        FilterChange.LESS_STRICT
      case GtkFilterChange.GTK_FILTER_CHANGE_MORE_STRICT =>
        FilterChange.MORE_STRICT
  end fromRaw
end FilterChange
