package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.FlowBoxChild
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFlowBox
import sn.gnome.gtk4.internal.GtkFlowBoxCreateWidgetFunc
import sn.gnome.gtk4.internal.GtkFlowBoxFilterFunc
import sn.gnome.gtk4.internal.GtkFlowBoxForeachFunc
import sn.gnome.gtk4.internal.GtkFlowBoxSortFunc
import sn.gnome.gtk4.internal.GtkSelectionMode

class FlowBox(raw: Ptr[GtkFlowBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(child: Widget): Unit = gtk_flow_box_append(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def bindModel(
      model: ListModel,
      create_widget_func: GtkFlowBoxCreateWidgetFunc,
      user_data: Ptr[Byte],
      user_data_free_func: GDestroyNotify
  ): Unit = gtk_flow_box_bind_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf,
    create_widget_func,
    gpointer(user_data),
    user_data_free_func
  )

  def getActivateOnSingleClick(): Boolean =
    gtk_flow_box_get_activate_on_single_click(this.raw.asInstanceOf).value.!=(0)

  def getChildAtIndex(idx: Int): FlowBoxChild = new FlowBoxChild(
    gtk_flow_box_get_child_at_index(this.raw.asInstanceOf, idx).asInstanceOf
  )

  def getChildAtPos(x: Int, y: Int): FlowBoxChild = new FlowBoxChild(
    gtk_flow_box_get_child_at_pos(this.raw.asInstanceOf, x, y).asInstanceOf
  )

  def getColumnSpacing(): UInt = gtk_flow_box_get_column_spacing(
    this.raw.asInstanceOf
  ).value

  def getHomogeneous(): Boolean =
    gtk_flow_box_get_homogeneous(this.raw.asInstanceOf).value.!=(0)

  def getMaxChildrenPerLine(): UInt = gtk_flow_box_get_max_children_per_line(
    this.raw.asInstanceOf
  ).value

  def getMinChildrenPerLine(): UInt = gtk_flow_box_get_min_children_per_line(
    this.raw.asInstanceOf
  ).value

  def getRowSpacing(): UInt = gtk_flow_box_get_row_spacing(
    this.raw.asInstanceOf
  ).value

  def getSelectedChildren(): Ptr[GList] = gtk_flow_box_get_selected_children(
    this.raw.asInstanceOf
  )

  def getSelectionMode(): GtkSelectionMode = gtk_flow_box_get_selection_mode(
    this.raw.asInstanceOf
  )

  def insert(widget: Widget, position: Int): Unit = gtk_flow_box_insert(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    position
  )

  def invalidateFilter(): Unit = gtk_flow_box_invalidate_filter(
    this.raw.asInstanceOf
  )

  def invalidateSort(): Unit = gtk_flow_box_invalidate_sort(
    this.raw.asInstanceOf
  )

  def prepend(child: Widget): Unit = gtk_flow_box_prepend(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def remove(widget: Widget): Unit = gtk_flow_box_remove(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def removeAll(): Unit = gtk_flow_box_remove_all(this.raw.asInstanceOf)

  def selectAll(): Unit = gtk_flow_box_select_all(this.raw.asInstanceOf)

  def selectChild(child: FlowBoxChild): Unit = gtk_flow_box_select_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def selectedForeach(func: GtkFlowBoxForeachFunc, data: Ptr[Byte]): Unit =
    gtk_flow_box_selected_foreach(this.raw.asInstanceOf, func, gpointer(data))

  def setActivateOnSingleClick(single: Boolean): Unit =
    gtk_flow_box_set_activate_on_single_click(
      this.raw.asInstanceOf,
      gboolean(gint((if single == true then 1 else 0)))
    )

  def setColumnSpacing(spacing: UInt): Unit =
    gtk_flow_box_set_column_spacing(this.raw.asInstanceOf, guint(spacing))

  def setFilterFunc(
      filter_func: GtkFlowBoxFilterFunc,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_flow_box_set_filter_func(
    this.raw.asInstanceOf,
    filter_func,
    gpointer(user_data),
    destroy
  )

  def setHadjustment(adjustment: Adjustment): Unit =
    gtk_flow_box_set_hadjustment(
      this.raw.asInstanceOf,
      adjustment.getUnsafeRawPointer().asInstanceOf
    )

  def setHomogeneous(homogeneous: Boolean): Unit = gtk_flow_box_set_homogeneous(
    this.raw.asInstanceOf,
    gboolean(gint((if homogeneous == true then 1 else 0)))
  )

  def setMaxChildrenPerLine(n_children: UInt): Unit =
    gtk_flow_box_set_max_children_per_line(
      this.raw.asInstanceOf,
      guint(n_children)
    )

  def setMinChildrenPerLine(n_children: UInt): Unit =
    gtk_flow_box_set_min_children_per_line(
      this.raw.asInstanceOf,
      guint(n_children)
    )

  def setRowSpacing(spacing: UInt): Unit =
    gtk_flow_box_set_row_spacing(this.raw.asInstanceOf, guint(spacing))

  def setSelectionMode(mode: GtkSelectionMode): Unit =
    gtk_flow_box_set_selection_mode(this.raw.asInstanceOf, mode)

  def setSortFunc(
      sort_func: GtkFlowBoxSortFunc,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_flow_box_set_sort_func(
    this.raw.asInstanceOf,
    sort_func,
    gpointer(user_data),
    destroy
  )

  def setVadjustment(adjustment: Adjustment): Unit =
    gtk_flow_box_set_vadjustment(
      this.raw.asInstanceOf,
      adjustment.getUnsafeRawPointer().asInstanceOf
    )

  def unselectAll(): Unit = gtk_flow_box_unselect_all(this.raw.asInstanceOf)

  def unselectChild(child: FlowBoxChild): Unit = gtk_flow_box_unselect_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

end FlowBox

object FlowBox:
  def apply(): FlowBox = new FlowBox(gtk_flow_box_new().asInstanceOf)
end FlowBox
