package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  BaselinePosition,
  Buildable,
  ConstraintTarget,
  Orientable,
  PositionType,
  Widget
}
import sn.gnome.gtk4.internal.GtkGrid

/** `GtkGrid` is a container which arranges its child widgets in rows and
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Grid private[gnome] (raw: Ptr[GtkGrid])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a widget to the grid.
    *
    * The position of @child is determined by @column and @row. The number of
    * “cells” that @child will occupy is determined by @width and @height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attach(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      column: Int /* Some(CInt) */,
      row: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_grid_attach(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      child.getUnsafeRawPointer().asInstanceOf,
      column,
      row,
      width,
      height
    )
  end attach

  /** Adds a widget to the grid.
    *
    * The widget is placed next to @sibling, on the side determined by
    * @side.
    *   When @sibling is %NULL, the widget is placed in row (for left or right
    *   placement) or column 0 (for top or bottom placement), at the end
    *   indicated by @side.
    *
    * Attaching widgets labeled `[1]`, `[2]`, `[3]` with `@sibling == %NULL` and
    * `@side == %GTK_POS_LEFT` yields a layout of `[3][2][1]`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attachNextTo(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      sibling: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ],
      side: PositionType /* Some(GtkPositionType) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_grid_attach_next_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      child.getUnsafeRawPointer().asInstanceOf,
      sibling
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
      side.raw,
      width,
      height
    )
  end attachNextTo

  /** Returns which row defines the global baseline of @grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaselineRow(): Int /* None */ =
    gtk_grid_get_baseline_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]]
    )
  end getBaselineRow

  /** Gets the child of @grid whose area covers the grid cell at @column, @row.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildAt(column: Int /* Some(CInt) */, row: Int /* Some(CInt) */ )(using
      Runtime
  ): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_grid_get_child_at(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
        column,
        row
      ).asInstanceOf
    )
  end getChildAt

  /** Returns whether all columns of @grid have the same width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnHomogeneous(): Boolean /* None */ =
    gtk_grid_get_column_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]]
    ).value.!=(0)
  end getColumnHomogeneous

  /** Returns the amount of space between the columns of @grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnSpacing(): UInt /* None */ =
    gtk_grid_get_column_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]]
    ).value
  end getColumnSpacing

  /** Returns the baseline position of @row.
    *
    * See [method@Gtk.Grid.set_row_baseline_position].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowBaselinePosition(
      row: Int /* Some(CInt) */
  ): BaselinePosition /* None */ =
    BaselinePosition.fromRaw(
      gtk_grid_get_row_baseline_position(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
        row
      )
    )
  end getRowBaselinePosition

  /** Returns whether all rows of @grid have the same height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowHomogeneous(): Boolean /* None */ =
    gtk_grid_get_row_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]]
    ).value.!=(0)
  end getRowHomogeneous

  /** Returns the amount of space between the rows of @grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowSpacing(): UInt /* None */ =
    gtk_grid_get_row_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]]
    ).value
  end getRowSpacing

  /** Inserts a column at the specified position.
    *
    * Children which are attached at or to the right of this position are moved
    * one column to the right. Children which span across this position are
    * grown to span the new column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertColumn(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_insert_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      position
    )
  end insertColumn

  /** Inserts a row or column at the specified position.
    *
    * The new row or column is placed next to @sibling, on the side determined
    * by @side. If @side is %GTK_POS_TOP or %GTK_POS_BOTTOM, a row is inserted.
    * If @side is %GTK_POS_LEFT of %GTK_POS_RIGHT, a column is inserted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertNextTo(
      sibling: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      side: PositionType /* Some(GtkPositionType) */
  )(using Runtime): Unit /* None */ =
    gtk_grid_insert_next_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      sibling.getUnsafeRawPointer().asInstanceOf,
      side.raw
    )
  end insertNextTo

  /** Inserts a row at the specified position.
    *
    * Children which are attached at or below this position are moved one row
    * down. Children which span across this position are grown to span the new
    * row.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertRow(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_insert_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      position
    )
  end insertRow

  /** Queries the attach points and spans of @child inside the given `GtkGrid`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_child]: Method query_child contains an OUT parameter, which is not supported yet"
  )
  private def queryChild__ = ???

  /** Removes a child from @grid.
    *
    * The child must have been added with [method@Gtk.Grid.attach] or
    * [method@Gtk.Grid.attach_next_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_grid_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Removes a column from the grid.
    *
    * Children that are placed in this column are removed, spanning children
    * that overlap this column have their width reduced by one, and children
    * after the column are moved to the left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeColumn(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_remove_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      position
    )
  end removeColumn

  /** Removes a row from the grid.
    *
    * Children that are placed in this row are removed, spanning children that
    * overlap this row have their height reduced by one, and children below the
    * row are moved up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeRow(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_remove_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      position
    )
  end removeRow

  /** Sets which row defines the global baseline for the entire grid.
    *
    * Each row in the grid can have its own local baseline, but only one of
    * those is global, meaning it will be the baseline in the parent of the @grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaselineRow(row: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_set_baseline_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      row
    )
  end setBaselineRow

  /** Sets whether all columns of @grid will have the same width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumnHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_grid_set_column_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )
  end setColumnHomogeneous

  /** Sets the amount of space between columns of @grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumnSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_grid_set_column_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      guint(spacing)
    )
  end setColumnSpacing

  /** Sets how the baseline should be positioned on @row of the grid, in case
    * that row is assigned more space than is requested.
    *
    * The default baseline position is %GTK_BASELINE_POSITION_CENTER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowBaselinePosition(
      row: Int /* Some(CInt) */,
      pos: BaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ =
    gtk_grid_set_row_baseline_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      row,
      pos.raw
    )
  end setRowBaselinePosition

  /** Sets whether all rows of @grid will have the same height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_grid_set_row_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )
  end setRowHomogeneous

  /** Sets the amount of space between rows of @grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_grid_set_row_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGrid]],
      guint(spacing)
    )
  end setRowSpacing

end Grid

object Grid:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGrid])(using Runtime) = summon[Runtime]
    .getOrCreate[Grid](ptr.asInstanceOf[Ptr[Byte]], p => new Grid(ptr))

  /** Creates a new grid widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Grid =
    val raw: Ptr[Byte] = gtk_grid_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Grid](raw, r => Grid.applyUnsafe(r.asInstanceOf))
  end apply
end Grid
