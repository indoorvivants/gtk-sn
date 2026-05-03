package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCellRendererMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Identifies how the user can interact with a particular cell.
  */
enum CellRendererMode(val raw: GtkCellRendererMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The cell is just for display and cannot be interacted with. Note that this
    * doesn’t mean that eg. the row being drawn can’t be selected -- just that a
    * particular element of it cannot be individually modified.
    */
  case INERT
      extends CellRendererMode(GtkCellRendererMode.GTK_CELL_RENDERER_MODE_INERT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The cell can be clicked.
    */
  case ACTIVATABLE
      extends CellRendererMode(
        GtkCellRendererMode.GTK_CELL_RENDERER_MODE_ACTIVATABLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The cell can be edited or otherwise modified.
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
