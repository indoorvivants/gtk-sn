package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleRelation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible accessible relations of a [iface@Accessible].
  *
  * Accessible relations can be references to other widgets, integers or
  * strings.
  */
enum AccessibleRelation(val raw: GtkAccessibleRelation):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies the currently active element when focus is on a composite
    * widget, combobox, textbox, group, or application. Value type: reference
    */
  case ACTIVE_DESCENDANT
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the total number of columns in a table, grid, or treegrid. Value
    * type: integer
    */
  case COL_COUNT
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_COUNT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines an element's column index or position with respect to the total
    * number of columns within a table, grid, or treegrid. Value type: integer
    */
  case COL_INDEX
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_INDEX
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines a human readable text alternative of
    * %GTK_ACCESSIBLE_RELATION_COL_INDEX. Value type: string
    */
  case COL_INDEX_TEXT
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the number of columns spanned by a cell or gridcell within a
    * table, grid, or treegrid. Value type: integer
    */
  case COL_SPAN
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_SPAN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies the element (or elements) whose contents or presence are
    * controlled by the current element. Value type: reference
    */
  case CONTROLS
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_CONTROLS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies the element (or elements) that describes the object. Value
    * type: reference
    */
  case DESCRIBED_BY
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_DESCRIBED_BY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies the element (or elements) that provide additional information
    * related to the object. Value type: reference
    */
  case DETAILS
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_DETAILS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies the element that provides an error message for an object. Value
    * type: reference
    */
  case ERROR_MESSAGE
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies the next element (or elements) in an alternate reading order of
    * content which, at the user's discretion, allows assistive technology to
    * override the general default of reading in document source order. Value
    * type: reference
    */
  case FLOW_TO
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_FLOW_TO
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies the element (or elements) that labels the current element.
    * Value type: reference
    */
  case LABELLED_BY
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_LABELLED_BY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Identifies an element (or elements) in order to define a visual,
    * functional, or contextual parent/child relationship between elements where
    * the widget hierarchy cannot be used to represent the relationship. Value
    * type: reference
    */
  case OWNS
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_OWNS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines an element's number or position in the current set of listitems or
    * treeitems. Value type: integer
    */
  case POS_IN_SET
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_POS_IN_SET
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the total number of rows in a table, grid, or treegrid. Value
    * type: integer
    */
  case ROW_COUNT
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_COUNT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines an element's row index or position with respect to the total
    * number of rows within a table, grid, or treegrid. Value type: integer
    */
  case ROW_INDEX
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_INDEX
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines a human readable text alternative of aria-rowindex. Value type:
    * string
    */
  case ROW_INDEX_TEXT
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the number of rows spanned by a cell or gridcell within a table,
    * grid, or treegrid. Value type: integer
    */
  case ROW_SPAN
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_SPAN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the number of items in the current set of listitems or treeitems.
    * Value type: integer
    */
  case SET_SIZE
      extends AccessibleRelation(
        GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_SET_SIZE
      )
end AccessibleRelation

object AccessibleRelation:
  def fromRaw(raw: GtkAccessibleRelation): AccessibleRelation =
    raw match
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT =>
        AccessibleRelation.ACTIVE_DESCENDANT
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_COUNT =>
        AccessibleRelation.COL_COUNT
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_INDEX =>
        AccessibleRelation.COL_INDEX
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT =>
        AccessibleRelation.COL_INDEX_TEXT
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_SPAN =>
        AccessibleRelation.COL_SPAN
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_CONTROLS =>
        AccessibleRelation.CONTROLS
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_DESCRIBED_BY =>
        AccessibleRelation.DESCRIBED_BY
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_DETAILS =>
        AccessibleRelation.DETAILS
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE =>
        AccessibleRelation.ERROR_MESSAGE
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_FLOW_TO =>
        AccessibleRelation.FLOW_TO
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_LABELLED_BY =>
        AccessibleRelation.LABELLED_BY
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_OWNS =>
        AccessibleRelation.OWNS
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_POS_IN_SET =>
        AccessibleRelation.POS_IN_SET
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_COUNT =>
        AccessibleRelation.ROW_COUNT
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_INDEX =>
        AccessibleRelation.ROW_INDEX
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT =>
        AccessibleRelation.ROW_INDEX_TEXT
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_SPAN =>
        AccessibleRelation.ROW_SPAN
      case GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_SET_SIZE =>
        AccessibleRelation.SET_SIZE
  end fromRaw
end AccessibleRelation
