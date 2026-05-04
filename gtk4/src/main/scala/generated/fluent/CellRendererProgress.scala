package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{CellRenderer, Orientable}
import sn.gnome.gtk4.internal.GtkCellRendererProgress

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders numbers as progress bars
  *
  * `GtkCellRendererProgress` renders a numeric value as a progress par in a
  * cell. Additionally, it can display a text on top of the progress bar.
  */
class CellRendererProgress(raw: Ptr[GtkCellRendererProgress])
    extends CellRenderer(raw.asInstanceOf),
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererProgress

object CellRendererProgress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellRendererProgress`.
    */
  def apply(): CellRendererProgress = new CellRendererProgress(
    gtk_cell_renderer_progress_new().asInstanceOf
  )
end CellRendererProgress
