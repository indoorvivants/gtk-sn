package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererSpinner

class CellRendererSpinner(raw: Ptr[GtkCellRendererSpinner])
    extends CellRenderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererSpinner

object CellRendererSpinner:
  def apply(): CellRendererSpinner = new CellRendererSpinner(
    gtk_cell_renderer_spinner_new().asInstanceOf
  )
end CellRendererSpinner
