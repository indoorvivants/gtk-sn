package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererAccel

class CellRendererAccel(raw: Ptr[GtkCellRendererAccel])
    extends CellRendererText(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererAccel

object CellRendererAccel:
  def apply(): CellRendererAccel = new CellRendererAccel(
    gtk_cell_renderer_accel_new().asInstanceOf
  )
end CellRendererAccel
