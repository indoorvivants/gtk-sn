package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.internal.GtkCellRendererProgress

class CellRendererProgress(raw: Ptr[GtkCellRendererProgress])
    extends CellRenderer(raw.asInstanceOf),
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererProgress

object CellRendererProgress:
  def apply(): CellRendererProgress = new CellRendererProgress(
    gtk_cell_renderer_progress_new().asInstanceOf
  )
end CellRendererProgress
