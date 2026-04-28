package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererSpin

class CellRendererSpin(raw: Ptr[GtkCellRendererSpin])
    extends CellRendererText(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererSpin

object CellRendererSpin:
  def apply(): CellRendererSpin = new CellRendererSpin(
    gtk_cell_renderer_spin_new().asInstanceOf
  )
end CellRendererSpin
