package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkGridLayout

class GridLayout(raw: Ptr[GtkGridLayout])
    extends LayoutManager(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBaselineRow(): Int = gtk_grid_layout_get_baseline_row(
    this.raw.asInstanceOf
  )

  def getColumnHomogeneous(): Boolean =
    gtk_grid_layout_get_column_homogeneous(this.raw.asInstanceOf).value.!=(0)

  def getColumnSpacing(): UInt = gtk_grid_layout_get_column_spacing(
    this.raw.asInstanceOf
  ).value

  def getRowBaselinePosition(row: Int): GtkBaselinePosition =
    gtk_grid_layout_get_row_baseline_position(this.raw.asInstanceOf, row)

  def getRowHomogeneous(): Boolean =
    gtk_grid_layout_get_row_homogeneous(this.raw.asInstanceOf).value.!=(0)

  def getRowSpacing(): UInt = gtk_grid_layout_get_row_spacing(
    this.raw.asInstanceOf
  ).value

  def setBaselineRow(row: Int): Unit =
    gtk_grid_layout_set_baseline_row(this.raw.asInstanceOf, row)

  def setColumnHomogeneous(homogeneous: Boolean): Unit =
    gtk_grid_layout_set_column_homogeneous(
      this.raw.asInstanceOf,
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )

  def setColumnSpacing(spacing: UInt): Unit =
    gtk_grid_layout_set_column_spacing(this.raw.asInstanceOf, guint(spacing))

  def setRowBaselinePosition(row: Int, pos: GtkBaselinePosition): Unit =
    gtk_grid_layout_set_row_baseline_position(this.raw.asInstanceOf, row, pos)

  def setRowHomogeneous(homogeneous: Boolean): Unit =
    gtk_grid_layout_set_row_homogeneous(
      this.raw.asInstanceOf,
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )

  def setRowSpacing(spacing: UInt): Unit =
    gtk_grid_layout_set_row_spacing(this.raw.asInstanceOf, guint(spacing))

end GridLayout

object GridLayout:
  def apply(): GridLayout = new GridLayout(gtk_grid_layout_new().asInstanceOf)
end GridLayout
