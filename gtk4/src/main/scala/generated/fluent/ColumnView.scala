package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ColumnViewColumn
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkColumnView
import sn.gnome.gtk4.internal.GtkListScrollFlags
import sn.gnome.gtk4.internal.GtkListTabBehavior
import sn.gnome.gtk4.internal.GtkScrollInfo
import sn.gnome.gtk4.internal.GtkSortType

class ColumnView(raw: Ptr[GtkColumnView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def appendColumn(column: ColumnViewColumn): Unit =
    gtk_column_view_append_column(
      this.raw.asInstanceOf,
      column.getUnsafeRawPointer().asInstanceOf
    )

  def getColumns(): ListModel = new ListModel.Abstract(
    gtk_column_view_get_columns(this.raw.asInstanceOf).asInstanceOf
  )

  def getEnableRubberband(): Boolean =
    gtk_column_view_get_enable_rubberband(this.raw.asInstanceOf).value.!=(0)

  def getHeaderFactory(): ListItemFactory = new ListItemFactory(
    gtk_column_view_get_header_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getModel(): SelectionModel = new SelectionModel.Abstract(
    gtk_column_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getReorderable(): Boolean =
    gtk_column_view_get_reorderable(this.raw.asInstanceOf).value.!=(0)

  def getRowFactory(): ListItemFactory = new ListItemFactory(
    gtk_column_view_get_row_factory(this.raw.asInstanceOf).asInstanceOf
  )

  def getShowColumnSeparators(): Boolean =
    gtk_column_view_get_show_column_separators(this.raw.asInstanceOf).value
      .!=(0)

  def getShowRowSeparators(): Boolean =
    gtk_column_view_get_show_row_separators(this.raw.asInstanceOf).value.!=(0)

  def getSingleClickActivate(): Boolean =
    gtk_column_view_get_single_click_activate(this.raw.asInstanceOf).value.!=(0)

  def getSorter(): Sorter = new Sorter(
    gtk_column_view_get_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  def getTabBehavior(): GtkListTabBehavior = gtk_column_view_get_tab_behavior(
    this.raw.asInstanceOf
  )

  def insertColumn(position: UInt, column: ColumnViewColumn): Unit =
    gtk_column_view_insert_column(
      this.raw.asInstanceOf,
      guint(position),
      column.getUnsafeRawPointer().asInstanceOf
    )

  def removeColumn(column: ColumnViewColumn): Unit =
    gtk_column_view_remove_column(
      this.raw.asInstanceOf,
      column.getUnsafeRawPointer().asInstanceOf
    )

  def scrollTo(
      pos: UInt,
      column: ColumnViewColumn,
      flags: GtkListScrollFlags,
      scroll: Ptr[GtkScrollInfo]
  ): Unit = gtk_column_view_scroll_to(
    this.raw.asInstanceOf,
    guint(pos),
    column.getUnsafeRawPointer().asInstanceOf,
    flags,
    scroll
  )

  def setEnableRubberband(enable_rubberband: Boolean): Unit =
    gtk_column_view_set_enable_rubberband(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_rubberband == true then 1 else 0)))
    )

  def setHeaderFactory(factory: ListItemFactory): Unit =
    gtk_column_view_set_header_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  def setModel(model: SelectionModel): Unit = gtk_column_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setReorderable(reorderable: Boolean): Unit =
    gtk_column_view_set_reorderable(
      this.raw.asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )

  def setRowFactory(factory: ListItemFactory): Unit =
    gtk_column_view_set_row_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  def setShowColumnSeparators(show_column_separators: Boolean): Unit =
    gtk_column_view_set_show_column_separators(
      this.raw.asInstanceOf,
      gboolean(gint((if show_column_separators == true then 1 else 0)))
    )

  def setShowRowSeparators(show_row_separators: Boolean): Unit =
    gtk_column_view_set_show_row_separators(
      this.raw.asInstanceOf,
      gboolean(gint((if show_row_separators == true then 1 else 0)))
    )

  def setSingleClickActivate(single_click_activate: Boolean): Unit =
    gtk_column_view_set_single_click_activate(
      this.raw.asInstanceOf,
      gboolean(gint((if single_click_activate == true then 1 else 0)))
    )

  def setTabBehavior(tab_behavior: GtkListTabBehavior): Unit =
    gtk_column_view_set_tab_behavior(this.raw.asInstanceOf, tab_behavior)

  def sortByColumn(column: ColumnViewColumn, direction: GtkSortType): Unit =
    gtk_column_view_sort_by_column(
      this.raw.asInstanceOf,
      column.getUnsafeRawPointer().asInstanceOf,
      direction
    )

end ColumnView

object ColumnView:
  def apply(model: SelectionModel): ColumnView = new ColumnView(
    gtk_column_view_new(model.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end ColumnView
