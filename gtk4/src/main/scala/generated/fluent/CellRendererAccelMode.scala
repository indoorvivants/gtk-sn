package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCellRendererAccelMode

/** The available modes for [property@Gtk.CellRendererAccel:accel-mode].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum CellRendererAccelMode(val raw: GtkCellRendererAccelMode):
  /** GTK accelerators mode
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GTK
      extends CellRendererAccelMode(
        GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_GTK
      )

  /** Other accelerator mode
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
