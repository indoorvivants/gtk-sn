package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.Tooltip
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.TreeSelection
import sn.gnome.gtk4.fluent.TreeViewColumn
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkTreeCellDataFunc
import sn.gnome.gtk4.internal.GtkTreePath
import sn.gnome.gtk4.internal.GtkTreeView
import sn.gnome.gtk4.internal.GtkTreeViewColumnDropFunc
import sn.gnome.gtk4.internal.GtkTreeViewDropPosition
import sn.gnome.gtk4.internal.GtkTreeViewGridLines
import sn.gnome.gtk4.internal.GtkTreeViewMappingFunc
import sn.gnome.gtk4.internal.GtkTreeViewRowSeparatorFunc
import sn.gnome.gtk4.internal.GtkTreeViewSearchEqualFunc

class TreeView(raw: Ptr[GtkTreeView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def appendColumn(column: TreeViewColumn): Int = gtk_tree_view_append_column(
    this.raw.asInstanceOf,
    column.getUnsafeRawPointer().asInstanceOf
  )

  def collapseAll(): Unit = gtk_tree_view_collapse_all(this.raw.asInstanceOf)

  def collapseRow(path: Ptr[GtkTreePath]): Boolean =
    gtk_tree_view_collapse_row(this.raw.asInstanceOf, path).value.!=(0)

  def columnsAutosize(): Unit = gtk_tree_view_columns_autosize(
    this.raw.asInstanceOf
  )

  // Method convert_bin_window_to_tree_coords contains an OUT parameter, which is not supported yet

  // Method convert_bin_window_to_widget_coords contains an OUT parameter, which is not supported yet

  // Method convert_tree_to_bin_window_coords contains an OUT parameter, which is not supported yet

  // Method convert_tree_to_widget_coords contains an OUT parameter, which is not supported yet

  // Method convert_widget_to_bin_window_coords contains an OUT parameter, which is not supported yet

  // Method convert_widget_to_tree_coords contains an OUT parameter, which is not supported yet

  def createRowDragIcon(path: Ptr[GtkTreePath]): Paintable =
    new Paintable.Abstract(
      gtk_tree_view_create_row_drag_icon(
        this.raw.asInstanceOf,
        path
      ).asInstanceOf
    )

  def enableModelDragDest(
      formats: Ptr[GdkContentFormats],
      actions: GdkDragAction
  ): Unit = gtk_tree_view_enable_model_drag_dest(
    this.raw.asInstanceOf,
    formats,
    actions
  )

  def enableModelDragSource(
      start_button_mask: GdkModifierType,
      formats: Ptr[GdkContentFormats],
      actions: GdkDragAction
  ): Unit = gtk_tree_view_enable_model_drag_source(
    this.raw.asInstanceOf,
    start_button_mask,
    formats,
    actions
  )

  def expandAll(): Unit = gtk_tree_view_expand_all(this.raw.asInstanceOf)

  def expandRow(path: Ptr[GtkTreePath], open_all: Boolean): Boolean =
    gtk_tree_view_expand_row(
      this.raw.asInstanceOf,
      path,
      gboolean(gint((if open_all == true then 1 else 0)))
    ).value.!=(0)

  def expandToPath(path: Ptr[GtkTreePath]): Unit =
    gtk_tree_view_expand_to_path(this.raw.asInstanceOf, path)

  def getActivateOnSingleClick(): Boolean =
    gtk_tree_view_get_activate_on_single_click(this.raw.asInstanceOf).value
      .!=(0)

  // Method get_background_area contains an OUT parameter, which is not supported yet

  // Method get_cell_area contains an OUT parameter, which is not supported yet

  def getColumn(n: Int): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_get_column(this.raw.asInstanceOf, n).asInstanceOf
  )

  def getColumns(): Ptr[GList] = gtk_tree_view_get_columns(
    this.raw.asInstanceOf
  )

  // Method get_cursor contains an OUT parameter, which is not supported yet

  // Method get_dest_row_at_pos contains an OUT parameter, which is not supported yet

  // Method get_drag_dest_row contains an OUT parameter, which is not supported yet

  def getEnableSearch(): Boolean =
    gtk_tree_view_get_enable_search(this.raw.asInstanceOf).value.!=(0)

  def getEnableTreeLines(): Boolean =
    gtk_tree_view_get_enable_tree_lines(this.raw.asInstanceOf).value.!=(0)

  def getExpanderColumn(): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_get_expander_column(this.raw.asInstanceOf).asInstanceOf
  )

  def getFixedHeightMode(): Boolean =
    gtk_tree_view_get_fixed_height_mode(this.raw.asInstanceOf).value.!=(0)

  def getGridLines(): GtkTreeViewGridLines = gtk_tree_view_get_grid_lines(
    this.raw.asInstanceOf
  )

  def getHeadersClickable(): Boolean =
    gtk_tree_view_get_headers_clickable(this.raw.asInstanceOf).value.!=(0)

  def getHeadersVisible(): Boolean =
    gtk_tree_view_get_headers_visible(this.raw.asInstanceOf).value.!=(0)

  def getHoverExpand(): Boolean =
    gtk_tree_view_get_hover_expand(this.raw.asInstanceOf).value.!=(0)

  def getHoverSelection(): Boolean =
    gtk_tree_view_get_hover_selection(this.raw.asInstanceOf).value.!=(0)

  def getLevelIndentation(): Int = gtk_tree_view_get_level_indentation(
    this.raw.asInstanceOf
  )

  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_tree_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getNColumns(): UInt = gtk_tree_view_get_n_columns(
    this.raw.asInstanceOf
  ).value

  // Method get_path_at_pos contains an OUT parameter, which is not supported yet

  def getReorderable(): Boolean =
    gtk_tree_view_get_reorderable(this.raw.asInstanceOf).value.!=(0)

  def getRowSeparatorFunc(): GtkTreeViewRowSeparatorFunc =
    gtk_tree_view_get_row_separator_func(this.raw.asInstanceOf)

  def getRubberBanding(): Boolean =
    gtk_tree_view_get_rubber_banding(this.raw.asInstanceOf).value.!=(0)

  def getSearchColumn(): Int = gtk_tree_view_get_search_column(
    this.raw.asInstanceOf
  )

  def getSearchEntry(): Editable = new Editable.Abstract(
    gtk_tree_view_get_search_entry(this.raw.asInstanceOf).asInstanceOf
  )

  def getSearchEqualFunc(): GtkTreeViewSearchEqualFunc =
    gtk_tree_view_get_search_equal_func(this.raw.asInstanceOf)

  def getSelection(): TreeSelection = new TreeSelection(
    gtk_tree_view_get_selection(this.raw.asInstanceOf).asInstanceOf
  )

  def getShowExpanders(): Boolean =
    gtk_tree_view_get_show_expanders(this.raw.asInstanceOf).value.!=(0)

  def getTooltipColumn(): Int = gtk_tree_view_get_tooltip_column(
    this.raw.asInstanceOf
  )

  // Method get_tooltip_context contains an OUT parameter, which is not supported yet

  // Method get_visible_range contains an OUT parameter, which is not supported yet

  // Method get_visible_rect contains an OUT parameter, which is not supported yet

  def insertColumn(column: TreeViewColumn, position: Int): Int =
    gtk_tree_view_insert_column(
      this.raw.asInstanceOf,
      column.getUnsafeRawPointer().asInstanceOf,
      position
    )

  inline def insertColumnWithAttributes(
      position: Int,
      title: String | CString,
      cell: CellRenderer,
      args: Any*
  )(using Zone): Int = gtk_tree_view_insert_column_with_attributes(
    this.raw.asInstanceOf,
    position,
    __sn_extract_string(title),
    cell.getUnsafeRawPointer().asInstanceOf,
    args*
  )

  def insertColumnWithDataFunc(
      position: Int,
      title: String | CString,
      cell: CellRenderer,
      func: GtkTreeCellDataFunc,
      data: Ptr[Byte],
      dnotify: GDestroyNotify
  )(using Zone): Int = gtk_tree_view_insert_column_with_data_func(
    this.raw.asInstanceOf,
    position,
    __sn_extract_string(title),
    cell.getUnsafeRawPointer().asInstanceOf,
    func,
    gpointer(data),
    dnotify
  )

  // Method is_blank_at_pos contains an OUT parameter, which is not supported yet

  def isRubberBandingActive(): Boolean =
    gtk_tree_view_is_rubber_banding_active(this.raw.asInstanceOf).value.!=(0)

  def mapExpandedRows(func: GtkTreeViewMappingFunc, data: Ptr[Byte]): Unit =
    gtk_tree_view_map_expanded_rows(this.raw.asInstanceOf, func, gpointer(data))

  def moveColumnAfter(
      column: TreeViewColumn,
      base_column: TreeViewColumn
  ): Unit = gtk_tree_view_move_column_after(
    this.raw.asInstanceOf,
    column.getUnsafeRawPointer().asInstanceOf,
    base_column.getUnsafeRawPointer().asInstanceOf
  )

  def removeColumn(column: TreeViewColumn): Int = gtk_tree_view_remove_column(
    this.raw.asInstanceOf,
    column.getUnsafeRawPointer().asInstanceOf
  )

  def rowActivated(path: Ptr[GtkTreePath], column: TreeViewColumn): Unit =
    gtk_tree_view_row_activated(
      this.raw.asInstanceOf,
      path,
      column.getUnsafeRawPointer().asInstanceOf
    )

  def rowExpanded(path: Ptr[GtkTreePath]): Boolean =
    gtk_tree_view_row_expanded(this.raw.asInstanceOf, path).value.!=(0)

  def scrollToCell(
      path: Ptr[GtkTreePath],
      column: TreeViewColumn,
      use_align: Boolean,
      row_align: Float,
      col_align: Float
  ): Unit = gtk_tree_view_scroll_to_cell(
    this.raw.asInstanceOf,
    path,
    column.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if use_align == true then 1 else 0))),
    row_align.asInstanceOf,
    col_align.asInstanceOf
  )

  def scrollToPoint(tree_x: Int, tree_y: Int): Unit =
    gtk_tree_view_scroll_to_point(this.raw.asInstanceOf, tree_x, tree_y)

  def setActivateOnSingleClick(single: Boolean): Unit =
    gtk_tree_view_set_activate_on_single_click(
      this.raw.asInstanceOf,
      gboolean(gint((if single == true then 1 else 0)))
    )

  def setColumnDragFunction(
      func: GtkTreeViewColumnDropFunc,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_tree_view_set_column_drag_function(
    this.raw.asInstanceOf,
    func,
    gpointer(user_data),
    destroy
  )

  def setCursor(
      path: Ptr[GtkTreePath],
      focus_column: TreeViewColumn,
      start_editing: Boolean
  ): Unit = gtk_tree_view_set_cursor(
    this.raw.asInstanceOf,
    path,
    focus_column.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if start_editing == true then 1 else 0)))
  )

  def setCursorOnCell(
      path: Ptr[GtkTreePath],
      focus_column: TreeViewColumn,
      focus_cell: CellRenderer,
      start_editing: Boolean
  ): Unit = gtk_tree_view_set_cursor_on_cell(
    this.raw.asInstanceOf,
    path,
    focus_column.getUnsafeRawPointer().asInstanceOf,
    focus_cell.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if start_editing == true then 1 else 0)))
  )

  def setDragDestRow(
      path: Ptr[GtkTreePath],
      pos: GtkTreeViewDropPosition
  ): Unit = gtk_tree_view_set_drag_dest_row(this.raw.asInstanceOf, path, pos)

  def setEnableSearch(enable_search: Boolean): Unit =
    gtk_tree_view_set_enable_search(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_search == true then 1 else 0)))
    )

  def setEnableTreeLines(enabled: Boolean): Unit =
    gtk_tree_view_set_enable_tree_lines(
      this.raw.asInstanceOf,
      gboolean(gint((if enabled == true then 1 else 0)))
    )

  def setExpanderColumn(column: TreeViewColumn): Unit =
    gtk_tree_view_set_expander_column(
      this.raw.asInstanceOf,
      column.getUnsafeRawPointer().asInstanceOf
    )

  def setFixedHeightMode(enable: Boolean): Unit =
    gtk_tree_view_set_fixed_height_mode(
      this.raw.asInstanceOf,
      gboolean(gint((if enable == true then 1 else 0)))
    )

  def setGridLines(grid_lines: GtkTreeViewGridLines): Unit =
    gtk_tree_view_set_grid_lines(this.raw.asInstanceOf, grid_lines)

  def setHeadersClickable(setting: Boolean): Unit =
    gtk_tree_view_set_headers_clickable(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setHeadersVisible(headers_visible: Boolean): Unit =
    gtk_tree_view_set_headers_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if headers_visible == true then 1 else 0)))
    )

  def setHoverExpand(expand: Boolean): Unit = gtk_tree_view_set_hover_expand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  def setHoverSelection(hover: Boolean): Unit =
    gtk_tree_view_set_hover_selection(
      this.raw.asInstanceOf,
      gboolean(gint((if hover == true then 1 else 0)))
    )

  def setLevelIndentation(indentation: Int): Unit =
    gtk_tree_view_set_level_indentation(this.raw.asInstanceOf, indentation)

  def setModel(model: TreeModel): Unit = gtk_tree_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setReorderable(reorderable: Boolean): Unit =
    gtk_tree_view_set_reorderable(
      this.raw.asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )

  def setRowSeparatorFunc(
      func: GtkTreeViewRowSeparatorFunc,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_tree_view_set_row_separator_func(
    this.raw.asInstanceOf,
    func,
    gpointer(data),
    destroy
  )

  def setRubberBanding(enable: Boolean): Unit =
    gtk_tree_view_set_rubber_banding(
      this.raw.asInstanceOf,
      gboolean(gint((if enable == true then 1 else 0)))
    )

  def setSearchColumn(column: Int): Unit =
    gtk_tree_view_set_search_column(this.raw.asInstanceOf, column)

  def setSearchEntry(entry: Editable): Unit = gtk_tree_view_set_search_entry(
    this.raw.asInstanceOf,
    entry.getUnsafeRawPointer().asInstanceOf
  )

  def setSearchEqualFunc(
      search_equal_func: GtkTreeViewSearchEqualFunc,
      search_user_data: Ptr[Byte],
      search_destroy: GDestroyNotify
  ): Unit = gtk_tree_view_set_search_equal_func(
    this.raw.asInstanceOf,
    search_equal_func,
    gpointer(search_user_data),
    search_destroy
  )

  def setShowExpanders(enabled: Boolean): Unit =
    gtk_tree_view_set_show_expanders(
      this.raw.asInstanceOf,
      gboolean(gint((if enabled == true then 1 else 0)))
    )

  def setTooltipCell(
      tooltip: Tooltip,
      path: Ptr[GtkTreePath],
      column: TreeViewColumn,
      cell: CellRenderer
  ): Unit = gtk_tree_view_set_tooltip_cell(
    this.raw.asInstanceOf,
    tooltip.getUnsafeRawPointer().asInstanceOf,
    path,
    column.getUnsafeRawPointer().asInstanceOf,
    cell.getUnsafeRawPointer().asInstanceOf
  )

  def setTooltipColumn(column: Int): Unit =
    gtk_tree_view_set_tooltip_column(this.raw.asInstanceOf, column)

  def setTooltipRow(tooltip: Tooltip, path: Ptr[GtkTreePath]): Unit =
    gtk_tree_view_set_tooltip_row(
      this.raw.asInstanceOf,
      tooltip.getUnsafeRawPointer().asInstanceOf,
      path
    )

  def unsetRowsDragDest(): Unit = gtk_tree_view_unset_rows_drag_dest(
    this.raw.asInstanceOf
  )

  def unsetRowsDragSource(): Unit = gtk_tree_view_unset_rows_drag_source(
    this.raw.asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TreeView

object TreeView:
  def apply(): TreeView = new TreeView(gtk_tree_view_new().asInstanceOf)
  def withModel(model: TreeModel): TreeView = new TreeView(
    gtk_tree_view_new_with_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end TreeView
