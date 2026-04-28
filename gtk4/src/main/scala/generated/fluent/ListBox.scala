package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.ListBoxRow
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkListBox
import sn.gnome.gtk4.internal.GtkListBoxCreateWidgetFunc
import sn.gnome.gtk4.internal.GtkListBoxFilterFunc
import sn.gnome.gtk4.internal.GtkListBoxForeachFunc
import sn.gnome.gtk4.internal.GtkListBoxSortFunc
import sn.gnome.gtk4.internal.GtkListBoxUpdateHeaderFunc
import sn.gnome.gtk4.internal.GtkSelectionMode

class ListBox(raw: Ptr[GtkListBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(child: Widget): Unit = gtk_list_box_append(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def bindModel(
      model: ListModel,
      create_widget_func: GtkListBoxCreateWidgetFunc,
      user_data: Ptr[Byte],
      user_data_free_func: GDestroyNotify
  ): Unit = gtk_list_box_bind_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf,
    create_widget_func,
    gpointer(user_data),
    user_data_free_func
  )

  def dragHighlightRow(row: ListBoxRow): Unit = gtk_list_box_drag_highlight_row(
    this.raw.asInstanceOf,
    row.getUnsafeRawPointer().asInstanceOf
  )

  def dragUnhighlightRow(): Unit = gtk_list_box_drag_unhighlight_row(
    this.raw.asInstanceOf
  )

  def getActivateOnSingleClick(): Boolean =
    gtk_list_box_get_activate_on_single_click(this.raw.asInstanceOf).value.!=(0)

  def getAdjustment(): Adjustment = new Adjustment(
    gtk_list_box_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  def getRowAtIndex(`index_`: Int): ListBoxRow = new ListBoxRow(
    gtk_list_box_get_row_at_index(this.raw.asInstanceOf, `index_`).asInstanceOf
  )

  def getRowAtY(y: Int): ListBoxRow = new ListBoxRow(
    gtk_list_box_get_row_at_y(this.raw.asInstanceOf, y).asInstanceOf
  )

  def getSelectedRow(): ListBoxRow = new ListBoxRow(
    gtk_list_box_get_selected_row(this.raw.asInstanceOf).asInstanceOf
  )

  def getSelectedRows(): Ptr[GList] = gtk_list_box_get_selected_rows(
    this.raw.asInstanceOf
  )

  def getSelectionMode(): GtkSelectionMode = gtk_list_box_get_selection_mode(
    this.raw.asInstanceOf
  )

  def getShowSeparators(): Boolean =
    gtk_list_box_get_show_separators(this.raw.asInstanceOf).value.!=(0)

  def insert(child: Widget, position: Int): Unit = gtk_list_box_insert(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    position
  )

  def invalidateFilter(): Unit = gtk_list_box_invalidate_filter(
    this.raw.asInstanceOf
  )

  def invalidateHeaders(): Unit = gtk_list_box_invalidate_headers(
    this.raw.asInstanceOf
  )

  def invalidateSort(): Unit = gtk_list_box_invalidate_sort(
    this.raw.asInstanceOf
  )

  def prepend(child: Widget): Unit = gtk_list_box_prepend(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def remove(child: Widget): Unit = gtk_list_box_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def removeAll(): Unit = gtk_list_box_remove_all(this.raw.asInstanceOf)

  def selectAll(): Unit = gtk_list_box_select_all(this.raw.asInstanceOf)

  def selectRow(row: ListBoxRow): Unit = gtk_list_box_select_row(
    this.raw.asInstanceOf,
    row.getUnsafeRawPointer().asInstanceOf
  )

  def selectedForeach(func: GtkListBoxForeachFunc, data: Ptr[Byte]): Unit =
    gtk_list_box_selected_foreach(this.raw.asInstanceOf, func, gpointer(data))

  def setActivateOnSingleClick(single: Boolean): Unit =
    gtk_list_box_set_activate_on_single_click(
      this.raw.asInstanceOf,
      gboolean(gint((if single == true then 1 else 0)))
    )

  def setAdjustment(adjustment: Adjustment): Unit = gtk_list_box_set_adjustment(
    this.raw.asInstanceOf,
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  def setFilterFunc(
      filter_func: GtkListBoxFilterFunc,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_list_box_set_filter_func(
    this.raw.asInstanceOf,
    filter_func,
    gpointer(user_data),
    destroy
  )

  def setHeaderFunc(
      update_header: GtkListBoxUpdateHeaderFunc,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_list_box_set_header_func(
    this.raw.asInstanceOf,
    update_header,
    gpointer(user_data),
    destroy
  )

  def setPlaceholder(placeholder: Widget): Unit = gtk_list_box_set_placeholder(
    this.raw.asInstanceOf,
    placeholder.getUnsafeRawPointer().asInstanceOf
  )

  def setSelectionMode(mode: GtkSelectionMode): Unit =
    gtk_list_box_set_selection_mode(this.raw.asInstanceOf, mode)

  def setShowSeparators(show_separators: Boolean): Unit =
    gtk_list_box_set_show_separators(
      this.raw.asInstanceOf,
      gboolean(gint((if show_separators == true then 1 else 0)))
    )

  def setSortFunc(
      sort_func: GtkListBoxSortFunc,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_list_box_set_sort_func(
    this.raw.asInstanceOf,
    sort_func,
    gpointer(user_data),
    destroy
  )

  def unselectAll(): Unit = gtk_list_box_unselect_all(this.raw.asInstanceOf)

  def unselectRow(row: ListBoxRow): Unit = gtk_list_box_unselect_row(
    this.raw.asInstanceOf,
    row.getUnsafeRawPointer().asInstanceOf
  )

end ListBox

object ListBox:
  def apply(): ListBox = new ListBox(gtk_list_box_new().asInstanceOf)
end ListBox
