package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.internal.GtkCellAreaContext

class CellAreaContext(raw: Ptr[GtkCellAreaContext])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def allocate(width: Int, height: Int): Unit =
    gtk_cell_area_context_allocate(this.raw.asInstanceOf, width, height)

  // Method get_allocation contains an OUT parameter, which is not supported yet

  def getArea(): CellArea = new CellArea(
    gtk_cell_area_context_get_area(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_preferred_height contains an OUT parameter, which is not supported yet

  // Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet

  // Method get_preferred_width contains an OUT parameter, which is not supported yet

  // Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet

  def pushPreferredHeight(minimum_height: Int, natural_height: Int): Unit =
    gtk_cell_area_context_push_preferred_height(
      this.raw.asInstanceOf,
      minimum_height,
      natural_height
    )

  def pushPreferredWidth(minimum_width: Int, natural_width: Int): Unit =
    gtk_cell_area_context_push_preferred_width(
      this.raw.asInstanceOf,
      minimum_width,
      natural_width
    )

  def reset(): Unit = gtk_cell_area_context_reset(this.raw.asInstanceOf)

end CellAreaContext
