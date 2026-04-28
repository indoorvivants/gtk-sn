package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererText

class CellRendererText(raw: Ptr[GtkCellRendererText])
    extends CellRenderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setFixedHeightFromFont(number_of_rows: Int): Unit =
    gtk_cell_renderer_text_set_fixed_height_from_font(
      this.raw.asInstanceOf,
      number_of_rows
    )

end CellRendererText

object CellRendererText:
  def apply(): CellRendererText = new CellRendererText(
    gtk_cell_renderer_text_new().asInstanceOf
  )
end CellRendererText
