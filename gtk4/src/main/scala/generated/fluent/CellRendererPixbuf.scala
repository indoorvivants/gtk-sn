package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererPixbuf

class CellRendererPixbuf(raw: Ptr[GtkCellRendererPixbuf])
    extends CellRenderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererPixbuf

object CellRendererPixbuf:
  def apply(): CellRendererPixbuf = new CellRendererPixbuf(
    gtk_cell_renderer_pixbuf_new().asInstanceOf
  )
end CellRendererPixbuf
