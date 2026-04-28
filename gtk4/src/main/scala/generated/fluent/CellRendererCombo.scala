package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererCombo

class CellRendererCombo(raw: Ptr[GtkCellRendererCombo])
    extends CellRendererText(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererCombo

object CellRendererCombo:
  def apply(): CellRendererCombo = new CellRendererCombo(
    gtk_cell_renderer_combo_new().asInstanceOf
  )
end CellRendererCombo
