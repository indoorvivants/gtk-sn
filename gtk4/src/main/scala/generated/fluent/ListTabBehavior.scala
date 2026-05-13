package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkListTabBehavior

/** Used to configure the focus behavior in the `GTK_DIR_TAB_FORWARD` and
  * `GTK_DIR_TAB_BACKWARD` direction, like the <kbd>Tab</kbd> key in a
  * [class@Gtk.ListView].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ListTabBehavior(val raw: GtkListTabBehavior):
  /** Cycle through all focusable items of the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL extends ListTabBehavior(GtkListTabBehavior.GTK_LIST_TAB_ALL)

  /** Cycle through a single list element, then move focus out of the list.
    * Moving focus between items needs to be done with the arrow keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ITEM extends ListTabBehavior(GtkListTabBehavior.GTK_LIST_TAB_ITEM)

  /** Cycle only through a single cell, then move focus out of the list. Moving
    * focus between cells needs to be done with the arrow keys. This is only
    * relevant for cell-based widgets like #GtkColumnView, otherwise it behaves
    * like `GTK_LIST_TAB_ITEM`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CELL extends ListTabBehavior(GtkListTabBehavior.GTK_LIST_TAB_CELL)
end ListTabBehavior

object ListTabBehavior:
  def fromRaw(raw: GtkListTabBehavior): ListTabBehavior =
    raw match
      case GtkListTabBehavior.GTK_LIST_TAB_ALL  => ListTabBehavior.ALL
      case GtkListTabBehavior.GTK_LIST_TAB_ITEM => ListTabBehavior.ITEM
      case GtkListTabBehavior.GTK_LIST_TAB_CELL => ListTabBehavior.CELL
  end fromRaw
end ListTabBehavior
