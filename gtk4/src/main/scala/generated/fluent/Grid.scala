package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkGrid
import sn.gnome.gtk4.internal.GtkPositionType

class Grid(raw: Ptr[GtkGrid])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def attach(
      child: Widget,
      column: Int,
      row: Int,
      width: Int,
      height: Int
  ): Unit = gtk_grid_attach(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    column,
    row,
    width,
    height
  )

  def attachNextTo(
      child: Widget,
      sibling: Widget,
      side: GtkPositionType,
      width: Int,
      height: Int
  ): Unit = gtk_grid_attach_next_to(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    sibling.getUnsafeRawPointer().asInstanceOf,
    side,
    width,
    height
  )

  def getBaselineRow(): Int = gtk_grid_get_baseline_row(this.raw.asInstanceOf)

  def getChildAt(column: Int, row: Int): Widget = new Widget(
    gtk_grid_get_child_at(this.raw.asInstanceOf, column, row).asInstanceOf
  )

  def getColumnHomogeneous(): Boolean =
    gtk_grid_get_column_homogeneous(this.raw.asInstanceOf).value.!=(0)

  def getColumnSpacing(): UInt = gtk_grid_get_column_spacing(
    this.raw.asInstanceOf
  ).value

  def getRowBaselinePosition(row: Int): GtkBaselinePosition =
    gtk_grid_get_row_baseline_position(this.raw.asInstanceOf, row)

  def getRowHomogeneous(): Boolean =
    gtk_grid_get_row_homogeneous(this.raw.asInstanceOf).value.!=(0)

  def getRowSpacing(): UInt = gtk_grid_get_row_spacing(
    this.raw.asInstanceOf
  ).value

  def insertColumn(position: Int): Unit =
    gtk_grid_insert_column(this.raw.asInstanceOf, position)

  def insertNextTo(sibling: Widget, side: GtkPositionType): Unit =
    gtk_grid_insert_next_to(
      this.raw.asInstanceOf,
      sibling.getUnsafeRawPointer().asInstanceOf,
      side
    )

  def insertRow(position: Int): Unit =
    gtk_grid_insert_row(this.raw.asInstanceOf, position)

  // Method query_child contains an OUT parameter, which is not supported yet

  def remove(child: Widget): Unit = gtk_grid_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def removeColumn(position: Int): Unit =
    gtk_grid_remove_column(this.raw.asInstanceOf, position)

  def removeRow(position: Int): Unit =
    gtk_grid_remove_row(this.raw.asInstanceOf, position)

  def setBaselineRow(row: Int): Unit =
    gtk_grid_set_baseline_row(this.raw.asInstanceOf, row)

  def setColumnHomogeneous(homogeneous: Boolean): Unit =
    gtk_grid_set_column_homogeneous(
      this.raw.asInstanceOf,
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )

  def setColumnSpacing(spacing: UInt): Unit =
    gtk_grid_set_column_spacing(this.raw.asInstanceOf, guint(spacing))

  def setRowBaselinePosition(row: Int, pos: GtkBaselinePosition): Unit =
    gtk_grid_set_row_baseline_position(this.raw.asInstanceOf, row, pos)

  def setRowHomogeneous(homogeneous: Boolean): Unit =
    gtk_grid_set_row_homogeneous(
      this.raw.asInstanceOf,
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )

  def setRowSpacing(spacing: UInt): Unit =
    gtk_grid_set_row_spacing(this.raw.asInstanceOf, guint(spacing))

end Grid

object Grid:
  def apply(): Grid = new Grid(gtk_grid_new().asInstanceOf)
end Grid
