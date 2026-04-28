package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.Tooltip
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkIconView
import sn.gnome.gtk4.internal.GtkIconViewDropPosition
import sn.gnome.gtk4.internal.GtkIconViewForeachFunc
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkSelectionMode
import sn.gnome.gtk4.internal.GtkTreePath

class IconView(raw: Ptr[GtkIconView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellLayout,
      ConstraintTarget,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def createDragIcon(path: Ptr[GtkTreePath]): Paintable =
    new Paintable.Abstract(
      gtk_icon_view_create_drag_icon(this.raw.asInstanceOf, path).asInstanceOf
    )

  def enableModelDragDest(
      formats: Ptr[GdkContentFormats],
      actions: GdkDragAction
  ): Unit = gtk_icon_view_enable_model_drag_dest(
    this.raw.asInstanceOf,
    formats,
    actions
  )

  def enableModelDragSource(
      start_button_mask: GdkModifierType,
      formats: Ptr[GdkContentFormats],
      actions: GdkDragAction
  ): Unit = gtk_icon_view_enable_model_drag_source(
    this.raw.asInstanceOf,
    start_button_mask,
    formats,
    actions
  )

  def getActivateOnSingleClick(): Boolean =
    gtk_icon_view_get_activate_on_single_click(this.raw.asInstanceOf).value
      .!=(0)

  // Method get_cell_rect contains an OUT parameter, which is not supported yet

  def getColumnSpacing(): Int = gtk_icon_view_get_column_spacing(
    this.raw.asInstanceOf
  )

  def getColumns(): Int = gtk_icon_view_get_columns(this.raw.asInstanceOf)

  // Method get_cursor contains an OUT parameter, which is not supported yet

  // Method get_dest_item_at_pos contains an OUT parameter, which is not supported yet

  // Method get_drag_dest_item contains an OUT parameter, which is not supported yet

  // Method get_item_at_pos contains an OUT parameter, which is not supported yet

  def getItemColumn(path: Ptr[GtkTreePath]): Int =
    gtk_icon_view_get_item_column(this.raw.asInstanceOf, path)

  def getItemOrientation(): GtkOrientation = gtk_icon_view_get_item_orientation(
    this.raw.asInstanceOf
  )

  def getItemPadding(): Int = gtk_icon_view_get_item_padding(
    this.raw.asInstanceOf
  )

  def getItemRow(path: Ptr[GtkTreePath]): Int =
    gtk_icon_view_get_item_row(this.raw.asInstanceOf, path)

  def getItemWidth(): Int = gtk_icon_view_get_item_width(this.raw.asInstanceOf)

  def getMargin(): Int = gtk_icon_view_get_margin(this.raw.asInstanceOf)

  def getMarkupColumn(): Int = gtk_icon_view_get_markup_column(
    this.raw.asInstanceOf
  )

  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_icon_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getPathAtPos(x: Int, y: Int): Ptr[GtkTreePath] =
    gtk_icon_view_get_path_at_pos(this.raw.asInstanceOf, x, y)

  def getPixbufColumn(): Int = gtk_icon_view_get_pixbuf_column(
    this.raw.asInstanceOf
  )

  def getReorderable(): Boolean =
    gtk_icon_view_get_reorderable(this.raw.asInstanceOf).value.!=(0)

  def getRowSpacing(): Int = gtk_icon_view_get_row_spacing(
    this.raw.asInstanceOf
  )

  def getSelectedItems(): Ptr[GList] = gtk_icon_view_get_selected_items(
    this.raw.asInstanceOf
  )

  def getSelectionMode(): GtkSelectionMode = gtk_icon_view_get_selection_mode(
    this.raw.asInstanceOf
  )

  def getSpacing(): Int = gtk_icon_view_get_spacing(this.raw.asInstanceOf)

  def getTextColumn(): Int = gtk_icon_view_get_text_column(
    this.raw.asInstanceOf
  )

  def getTooltipColumn(): Int = gtk_icon_view_get_tooltip_column(
    this.raw.asInstanceOf
  )

  // Method get_tooltip_context contains an OUT parameter, which is not supported yet

  // Method get_visible_range contains an OUT parameter, which is not supported yet

  def itemActivated(path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_item_activated(this.raw.asInstanceOf, path)

  def pathIsSelected(path: Ptr[GtkTreePath]): Boolean =
    gtk_icon_view_path_is_selected(this.raw.asInstanceOf, path).value.!=(0)

  def scrollToPath(
      path: Ptr[GtkTreePath],
      use_align: Boolean,
      row_align: Float,
      col_align: Float
  ): Unit = gtk_icon_view_scroll_to_path(
    this.raw.asInstanceOf,
    path,
    gboolean(gint((if use_align == true then 1 else 0))),
    row_align.asInstanceOf,
    col_align.asInstanceOf
  )

  def selectAll(): Unit = gtk_icon_view_select_all(this.raw.asInstanceOf)

  def selectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_select_path(this.raw.asInstanceOf, path)

  def selectedForeach(func: GtkIconViewForeachFunc, data: Ptr[Byte]): Unit =
    gtk_icon_view_selected_foreach(this.raw.asInstanceOf, func, gpointer(data))

  def setActivateOnSingleClick(single: Boolean): Unit =
    gtk_icon_view_set_activate_on_single_click(
      this.raw.asInstanceOf,
      gboolean(gint((if single == true then 1 else 0)))
    )

  def setColumnSpacing(column_spacing: Int): Unit =
    gtk_icon_view_set_column_spacing(this.raw.asInstanceOf, column_spacing)

  def setColumns(columns: Int): Unit =
    gtk_icon_view_set_columns(this.raw.asInstanceOf, columns)

  def setCursor(
      path: Ptr[GtkTreePath],
      cell: CellRenderer,
      start_editing: Boolean
  ): Unit = gtk_icon_view_set_cursor(
    this.raw.asInstanceOf,
    path,
    cell.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if start_editing == true then 1 else 0)))
  )

  def setDragDestItem(
      path: Ptr[GtkTreePath],
      pos: GtkIconViewDropPosition
  ): Unit = gtk_icon_view_set_drag_dest_item(this.raw.asInstanceOf, path, pos)

  def setItemOrientation(orientation: GtkOrientation): Unit =
    gtk_icon_view_set_item_orientation(this.raw.asInstanceOf, orientation)

  def setItemPadding(item_padding: Int): Unit =
    gtk_icon_view_set_item_padding(this.raw.asInstanceOf, item_padding)

  def setItemWidth(item_width: Int): Unit =
    gtk_icon_view_set_item_width(this.raw.asInstanceOf, item_width)

  def setMargin(margin: Int): Unit =
    gtk_icon_view_set_margin(this.raw.asInstanceOf, margin)

  def setMarkupColumn(column: Int): Unit =
    gtk_icon_view_set_markup_column(this.raw.asInstanceOf, column)

  def setModel(model: TreeModel): Unit = gtk_icon_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setPixbufColumn(column: Int): Unit =
    gtk_icon_view_set_pixbuf_column(this.raw.asInstanceOf, column)

  def setReorderable(reorderable: Boolean): Unit =
    gtk_icon_view_set_reorderable(
      this.raw.asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )

  def setRowSpacing(row_spacing: Int): Unit =
    gtk_icon_view_set_row_spacing(this.raw.asInstanceOf, row_spacing)

  def setSelectionMode(mode: GtkSelectionMode): Unit =
    gtk_icon_view_set_selection_mode(this.raw.asInstanceOf, mode)

  def setSpacing(spacing: Int): Unit =
    gtk_icon_view_set_spacing(this.raw.asInstanceOf, spacing)

  def setTextColumn(column: Int): Unit =
    gtk_icon_view_set_text_column(this.raw.asInstanceOf, column)

  def setTooltipCell(
      tooltip: Tooltip,
      path: Ptr[GtkTreePath],
      cell: CellRenderer
  ): Unit = gtk_icon_view_set_tooltip_cell(
    this.raw.asInstanceOf,
    tooltip.getUnsafeRawPointer().asInstanceOf,
    path,
    cell.getUnsafeRawPointer().asInstanceOf
  )

  def setTooltipColumn(column: Int): Unit =
    gtk_icon_view_set_tooltip_column(this.raw.asInstanceOf, column)

  def setTooltipItem(tooltip: Tooltip, path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_set_tooltip_item(
      this.raw.asInstanceOf,
      tooltip.getUnsafeRawPointer().asInstanceOf,
      path
    )

  def unselectAll(): Unit = gtk_icon_view_unselect_all(this.raw.asInstanceOf)

  def unselectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_unselect_path(this.raw.asInstanceOf, path)

  def unsetModelDragDest(): Unit = gtk_icon_view_unset_model_drag_dest(
    this.raw.asInstanceOf
  )

  def unsetModelDragSource(): Unit = gtk_icon_view_unset_model_drag_source(
    this.raw.asInstanceOf
  )

end IconView

object IconView:
  def apply(): IconView = new IconView(gtk_icon_view_new().asInstanceOf)
  def withArea(area: CellArea): IconView = new IconView(
    gtk_icon_view_new_with_area(
      area.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def withModel(model: TreeModel): IconView = new IconView(
    gtk_icon_view_new_with_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end IconView
