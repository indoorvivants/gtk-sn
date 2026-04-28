package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererToggle

class CellRendererToggle(raw: Ptr[GtkCellRendererToggle])
    extends CellRenderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActivatable(): Boolean =
    gtk_cell_renderer_toggle_get_activatable(this.raw.asInstanceOf).value.!=(0)

  def getActive(): Boolean =
    gtk_cell_renderer_toggle_get_active(this.raw.asInstanceOf).value.!=(0)

  def getRadio(): Boolean =
    gtk_cell_renderer_toggle_get_radio(this.raw.asInstanceOf).value.!=(0)

  def setActivatable(setting: Boolean): Unit =
    gtk_cell_renderer_toggle_set_activatable(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setActive(setting: Boolean): Unit = gtk_cell_renderer_toggle_set_active(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setRadio(radio: Boolean): Unit = gtk_cell_renderer_toggle_set_radio(
    this.raw.asInstanceOf,
    gboolean(gint((if radio == true then 1 else 0)))
  )

end CellRendererToggle

object CellRendererToggle:
  def apply(): CellRendererToggle = new CellRendererToggle(
    gtk_cell_renderer_toggle_new().asInstanceOf
  )
end CellRendererToggle
