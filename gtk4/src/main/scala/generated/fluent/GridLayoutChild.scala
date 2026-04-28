package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkGridLayoutChild

class GridLayoutChild(raw: Ptr[GtkGridLayoutChild])
    extends LayoutChild(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getColumn(): Int = gtk_grid_layout_child_get_column(this.raw.asInstanceOf)

  def getColumnSpan(): Int = gtk_grid_layout_child_get_column_span(
    this.raw.asInstanceOf
  )

  def getRow(): Int = gtk_grid_layout_child_get_row(this.raw.asInstanceOf)

  def getRowSpan(): Int = gtk_grid_layout_child_get_row_span(
    this.raw.asInstanceOf
  )

  def setColumn(column: Int): Unit =
    gtk_grid_layout_child_set_column(this.raw.asInstanceOf, column)

  def setColumnSpan(span: Int): Unit =
    gtk_grid_layout_child_set_column_span(this.raw.asInstanceOf, span)

  def setRow(row: Int): Unit =
    gtk_grid_layout_child_set_row(this.raw.asInstanceOf, row)

  def setRowSpan(span: Int): Unit =
    gtk_grid_layout_child_set_row_span(this.raw.asInstanceOf, span)

end GridLayoutChild
