package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCellRendererAccelMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The available modes for [property@Gtk.CellRendererAccel:accel-mode].
  */
enum CellRendererAccelMode(val raw: GtkCellRendererAccelMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * GTK accelerators mode
    */
  case GTK
      extends CellRendererAccelMode(
        GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_GTK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Other accelerator mode
    */
  case OTHER
      extends CellRendererAccelMode(
        GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_OTHER
      )
end CellRendererAccelMode

object CellRendererAccelMode:
  def fromRaw(raw: GtkCellRendererAccelMode): CellRendererAccelMode =
    raw match
      case GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_GTK =>
        CellRendererAccelMode.GTK
      case GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_OTHER =>
        CellRendererAccelMode.OTHER
  end fromRaw
end CellRendererAccelMode
