package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{CellRenderer, Orientable}
import sn.gnome.gtk4.internal.GtkCellRendererProgress

/** Renders numbers as progress bars
  *
  * `GtkCellRendererProgress` renders a numeric value as a progress par in a
  * cell. Additionally, it can display a text on top of the progress bar.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellRendererProgress(raw: Ptr[GtkCellRendererProgress])
    extends CellRenderer(raw.asInstanceOf),
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererProgress

object CellRendererProgress:
  /** Creates a new `GtkCellRendererProgress`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): CellRendererProgress = new CellRendererProgress(
    gtk_cell_renderer_progress_new().asInstanceOf
  )
end CellRendererProgress
