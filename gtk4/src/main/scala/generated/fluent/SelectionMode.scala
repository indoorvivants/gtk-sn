package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSelectionMode

/** Used to control what selections users are allowed to make.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SelectionMode(val raw: GtkSelectionMode):
  /** No selection is possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends SelectionMode(GtkSelectionMode.GTK_SELECTION_NONE)

  /** Zero or one element may be selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SINGLE extends SelectionMode(GtkSelectionMode.GTK_SELECTION_SINGLE)

  /** Exactly one element is selected. In some circumstances, such as initially
    * or during a search operation, it’s possible for no element to be selected
    * with %GTK_SELECTION_BROWSE. What is really enforced is that the user can’t
    * deselect a currently selected element except by selecting another element.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BROWSE extends SelectionMode(GtkSelectionMode.GTK_SELECTION_BROWSE)

  /** Any number of elements may be selected. The Ctrl key may be used to
    * enlarge the selection, and Shift key to select between the focus and the
    * child pointed to. Some widgets may also allow Click-drag to select a range
    * of elements.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTIPLE extends SelectionMode(GtkSelectionMode.GTK_SELECTION_MULTIPLE)
end SelectionMode

object SelectionMode:
  def fromRaw(raw: GtkSelectionMode): SelectionMode =
    raw match
      case GtkSelectionMode.GTK_SELECTION_NONE     => SelectionMode.NONE
      case GtkSelectionMode.GTK_SELECTION_SINGLE   => SelectionMode.SINGLE
      case GtkSelectionMode.GTK_SELECTION_BROWSE   => SelectionMode.BROWSE
      case GtkSelectionMode.GTK_SELECTION_MULTIPLE => SelectionMode.MULTIPLE
  end fromRaw
end SelectionMode
