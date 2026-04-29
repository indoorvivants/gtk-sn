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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGrid` is a container which arranges its child widgets in rows and
  * columns.
  *
  * ![An example GtkGrid](grid.png)
  *
  * It supports arbitrary positions and horizontal/vertical spans.
  *
  * Children are added using [method@Gtk.Grid.attach]. They can span multiple
  * rows or columns. It is also possible to add a child next to an existing
  * child, using [method@Gtk.Grid.attach_next_to]. To remove a child from the
  * grid, use [method@Gtk.Grid.remove].
  *
  * The behaviour of `GtkGrid` when several children occupy the same grid cell
  * is undefined.
  *
  * # GtkGrid as GtkBuildable
  *
  * Every child in a `GtkGrid` has access to a custom [iface@Gtk.Buildable]
  * element, called `<layout>`. It can by used to specify a position in the grid
  * and optionally spans. All properties that can be used in the `<layout>`
  * element are implemented by [class@Gtk.GridLayoutChild].
  *
  * It is implemented by `GtkWidget` using [class@Gtk.LayoutManager].
  *
  * To showcase it, here is a simple example:
  *
  * ```xml
  * <object class="GtkGrid" id="my_grid">
  *   <child>
  *     <object class="GtkButton" id="button1">
  *       <property name="label">Button 1</property>
  *       <layout>
  *         <property name="column">0</property>
  *         <property name="row">0</property>
  *       </layout>
  *     </object>
  *   </child>
  *   <child>
  *     <object class="GtkButton" id="button2">
  *       <property name="label">Button 2</property>
  *       <layout>
  *         <property name="column">1</property>
  *         <property name="row">0</property>
  *       </layout>
  *     </object>
  *   </child>
  *   <child>
  *     <object class="GtkButton" id="button3">
  *       <property name="label">Button 3</property>
  *       <layout>
  *         <property name="column">2</property>
  *         <property name="row">0</property>
  *         <property name="row-span">2</property>
  *       </layout>
  *     </object>
  *   </child>
  *   <child>
  *     <object class="GtkButton" id="button4">
  *       <property name="label">Button 4</property>
  *       <layout>
  *         <property name="column">0</property>
  *         <property name="row">1</property>
  *         <property name="column-span">2</property>
  *       </layout>
  *     </object>
  *   </child>
  * </object>
  * ```
  *
  * It organizes the first two buttons side-by-side in one cell each. The third
  * button is in the last column but spans across two rows. This is defined by
  * the `row-span` property. The last button is located in the second row and
  * spans across two columns, which is defined by the `column-span` property.
  *
  * # CSS nodes
  *
  * `GtkGrid` uses a single CSS node with name `grid`.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkGrid` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkGrid` uses the `GTK_ACCESSIBLE_ROLE_GENERIC`
  * role.
  */
class Grid(raw: Ptr[GtkGrid])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a widget to the grid.
    *
    * The position of @child is determined by @column and @row. The number of
    * “cells” that @child will occupy is determined by @width and @height.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a widget to the grid.
    *
    * The widget is placed next to @sibling, on the side determined by
    * @side.
    *   When @sibling is %NULL, the widget is placed in row (for left or right
    *   placement) or column 0 (for top or bottom placement), at the end
    *   indicated by @side.
    *
    * Attaching widgets labeled `[1]`, `[2]`, `[3]` with `@sibling == %NULL` and
    * `@side == %GTK_POS_LEFT` yields a layout of `[3][2][1]`.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns which row defines the global baseline of @grid.
    */
  def getBaselineRow(): Int = gtk_grid_get_baseline_row(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child of @grid whose area covers the grid cell at @column, @row.
    */
  def getChildAt(column: Int, row: Int): Widget = new Widget(
    gtk_grid_get_child_at(this.raw.asInstanceOf, column, row).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether all columns of @grid have the same width.
    */
  def getColumnHomogeneous(): Boolean =
    gtk_grid_get_column_homogeneous(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the amount of space between the columns of @grid.
    */
  def getColumnSpacing(): UInt = gtk_grid_get_column_spacing(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the baseline position of @row.
    *
    * See [method@Gtk.Grid.set_row_baseline_position].
    */
  def getRowBaselinePosition(row: Int): GtkBaselinePosition =
    gtk_grid_get_row_baseline_position(this.raw.asInstanceOf, row)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether all rows of @grid have the same height.
    */
  def getRowHomogeneous(): Boolean =
    gtk_grid_get_row_homogeneous(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the amount of space between the rows of @grid.
    */
  def getRowSpacing(): UInt = gtk_grid_get_row_spacing(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a column at the specified position.
    *
    * Children which are attached at or to the right of this position are moved
    * one column to the right. Children which span across this position are
    * grown to span the new column.
    */
  def insertColumn(position: Int): Unit =
    gtk_grid_insert_column(this.raw.asInstanceOf, position)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a row or column at the specified position.
    *
    * The new row or column is placed next to @sibling, on the side determined
    * by @side. If @side is %GTK_POS_TOP or %GTK_POS_BOTTOM, a row is inserted.
    * If @side is %GTK_POS_LEFT of %GTK_POS_RIGHT, a column is inserted.
    */
  def insertNextTo(sibling: Widget, side: GtkPositionType): Unit =
    gtk_grid_insert_next_to(
      this.raw.asInstanceOf,
      sibling.getUnsafeRawPointer().asInstanceOf,
      side
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a row at the specified position.
    *
    * Children which are attached at or below this position are moved one row
    * down. Children which span across this position are grown to span the new
    * row.
    */
  def insertRow(position: Int): Unit =
    gtk_grid_insert_row(this.raw.asInstanceOf, position)

  @annotation.compileTimeOnly(
    "Method query_child contains an OUT parameter, which is not supported yet"
  )
  def queryChild(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a child from @grid.
    *
    * The child must have been added with [method@Gtk.Grid.attach] or
    * [method@Gtk.Grid.attach_next_to].
    */
  def remove(child: Widget): Unit = gtk_grid_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a column from the grid.
    *
    * Children that are placed in this column are removed, spanning children
    * that overlap this column have their width reduced by one, and children
    * after the column are moved to the left.
    */
  def removeColumn(position: Int): Unit =
    gtk_grid_remove_column(this.raw.asInstanceOf, position)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a row from the grid.
    *
    * Children that are placed in this row are removed, spanning children that
    * overlap this row have their height reduced by one, and children below the
    * row are moved up.
    */
  def removeRow(position: Int): Unit =
    gtk_grid_remove_row(this.raw.asInstanceOf, position)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets which row defines the global baseline for the entire grid.
    *
    * Each row in the grid can have its own local baseline, but only one of
    * those is global, meaning it will be the baseline in the parent of the @grid.
    */
  def setBaselineRow(row: Int): Unit =
    gtk_grid_set_baseline_row(this.raw.asInstanceOf, row)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether all columns of @grid will have the same width.
    */
  def setColumnHomogeneous(homogeneous: Boolean): Unit =
    gtk_grid_set_column_homogeneous(
      this.raw.asInstanceOf,
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the amount of space between columns of @grid.
    */
  def setColumnSpacing(spacing: UInt): Unit =
    gtk_grid_set_column_spacing(this.raw.asInstanceOf, guint(spacing))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets how the baseline should be positioned on @row of the grid, in case
    * that row is assigned more space than is requested.
    *
    * The default baseline position is %GTK_BASELINE_POSITION_CENTER.
    */
  def setRowBaselinePosition(row: Int, pos: GtkBaselinePosition): Unit =
    gtk_grid_set_row_baseline_position(this.raw.asInstanceOf, row, pos)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether all rows of @grid will have the same height.
    */
  def setRowHomogeneous(homogeneous: Boolean): Unit =
    gtk_grid_set_row_homogeneous(
      this.raw.asInstanceOf,
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the amount of space between rows of @grid.
    */
  def setRowSpacing(spacing: UInt): Unit =
    gtk_grid_set_row_spacing(this.raw.asInstanceOf, guint(spacing))

end Grid

object Grid:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new grid widget.
    */
  def apply(): Grid = new Grid(gtk_grid_new().asInstanceOf)
end Grid
