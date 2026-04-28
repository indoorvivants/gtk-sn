package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.internal.GtkCellAreaBox

class CellAreaBox(raw: Ptr[GtkCellAreaBox])
    extends CellArea(raw.asInstanceOf),
      Buildable,
      CellLayout,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getSpacing(): Int = gtk_cell_area_box_get_spacing(this.raw.asInstanceOf)

  def packEnd(
      renderer: CellRenderer,
      expand: Boolean,
      align: Boolean,
      fixed: Boolean
  ): Unit = gtk_cell_area_box_pack_end(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0))),
    gboolean(gint((if align == true then 1 else 0))),
    gboolean(gint((if fixed == true then 1 else 0)))
  )

  def packStart(
      renderer: CellRenderer,
      expand: Boolean,
      align: Boolean,
      fixed: Boolean
  ): Unit = gtk_cell_area_box_pack_start(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0))),
    gboolean(gint((if align == true then 1 else 0))),
    gboolean(gint((if fixed == true then 1 else 0)))
  )

  def setSpacing(spacing: Int): Unit =
    gtk_cell_area_box_set_spacing(this.raw.asInstanceOf, spacing)

end CellAreaBox

object CellAreaBox:
  def apply(): CellAreaBox = new CellAreaBox(
    gtk_cell_area_box_new().asInstanceOf
  )
end CellAreaBox
