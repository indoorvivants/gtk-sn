package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCellRendererMode

/** Identifies how the user can interact with a particular cell.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum CellRendererMode(val raw: GtkCellRendererMode):
  /** The cell is just for display and cannot be interacted with. Note that this
    * doesn’t mean that eg. the row being drawn can’t be selected -- just that a
    * particular element of it cannot be individually modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INERT
      extends CellRendererMode(GtkCellRendererMode.GTK_CELL_RENDERER_MODE_INERT)

  /** The cell can be clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ACTIVATABLE
      extends CellRendererMode(
        GtkCellRendererMode.GTK_CELL_RENDERER_MODE_ACTIVATABLE
      )

  /** The cell can be edited or otherwise modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EDITABLE
      extends CellRendererMode(
        GtkCellRendererMode.GTK_CELL_RENDERER_MODE_EDITABLE
      )
end CellRendererMode

object CellRendererMode:
  def fromRaw(raw: GtkCellRendererMode): CellRendererMode =
    raw match
      case GtkCellRendererMode.GTK_CELL_RENDERER_MODE_INERT =>
        CellRendererMode.INERT
      case GtkCellRendererMode.GTK_CELL_RENDERER_MODE_ACTIVATABLE =>
        CellRendererMode.ACTIVATABLE
      case GtkCellRendererMode.GTK_CELL_RENDERER_MODE_EDITABLE =>
        CellRendererMode.EDITABLE
  end fromRaw
end CellRendererMode
