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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A widget for displaying both trees and lists
  *
  * Widget that displays any object that implements the [iface@Gtk.TreeModel]
  * interface.
  *
  * Please refer to the [tree widget conceptual
  * overview](section-tree-widget.html) for an overview of all the objects and
  * data types related to the tree widget and how they work together.
  *
  * ## Coordinate systems in GtkTreeView API
  *
  * Several different coordinate systems are exposed in the `GtkTreeView` API.
  * These are:
  *
  * ![](tree-view-coordinates.png)
  *
  *   - Widget coordinates: Coordinates relative to the widget (usually
  *     `widget->window`).
  *   - Bin window coordinates: Coordinates relative to the window that
  *     GtkTreeView renders to.
  *   - Tree coordinates: Coordinates relative to the entire scrollable area of
  *     GtkTreeView. These coordinates start at (0, 0) for row 0 of the tree.
  *
  * Several functions are available for converting between the different
  * coordinate systems. The most common translations are between widget and bin
  * window coordinates and between bin window and tree coordinates. For the
  * former you can use [method@Gtk.TreeView.convert_widget_to_bin_window_coords]
  * (and vice versa), for the latter
  * [method@Gtk.TreeView.convert_bin_window_to_tree_coords] (and vice versa).
  *
  * ## `GtkTreeView` as `GtkBuildable`
  *
  * The `GtkTreeView` implementation of the `GtkBuildable` interface accepts
  * [class@Gtk.TreeViewColumn] objects as `<child>` elements and exposes the
  * internal [class@Gtk.TreeSelection] in UI definitions.
  *
  * An example of a UI definition fragment with `GtkTreeView`:
  *
  * ```xml
  * <object class="GtkTreeView" id="treeview">
  *   <property name="model">liststore1</property>
  *   <child>
  *     <object class="GtkTreeViewColumn" id="test-column">
  *       <property name="title">Test</property>
  *       <child>
  *         <object class="GtkCellRendererText" id="test-renderer"/>
  *         <attributes>
  *           <attribute name="text">1</attribute>
  *         </attributes>
  *       </child>
  *     </object>
  *   </child>
  *   <child internal-child="selection">
  *     <object class="GtkTreeSelection" id="selection">
  *       <signal name="changed" handler="on_treeview_selection_changed"/>
  *     </object>
  *   </child>
  * </object>
  * ```
  *
  * ## CSS nodes
  *
  * ```
  * treeview.view
  * ├── header
  * │   ├── button
  * │   │   ╰── [sort-indicator]
  * ┊   ┊
  * │   ╰── button
  * │       ╰── [sort-indicator]
  * │
  * ├── [rubberband]
  * ╰── [dndtarget]
  * ```
  *
  * `GtkTreeView` has a main CSS node with name `treeview` and style class
  * `.view`. It has a subnode with name `header`, which is the parent for all
  * the column header widgets' CSS nodes.
  *
  * Each column header consists of a `button`, which among other content, has a
  * child with name `sort-indicator`, which carries the `.ascending` or
  * `.descending` style classes when the column header should show a sort
  * indicator. The CSS is expected to provide a suitable image using the
  * `-gtk-icon-source` property.
  *
  * For rubberband selection, a subnode with name `rubberband` is used.
  *
  * For the drop target location during DND, a subnode with name `dndtarget` is
  * used.
  */
class TreeView(raw: Ptr[GtkTreeView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @column to the list of columns. If @tree_view has “fixed_height”
    * mode enabled, then @column must have its “sizing” property set to be
    * GTK_TREE_VIEW_COLUMN_FIXED.
    */
  def appendColumn(
      column: TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */
  ): Int /* None */ = gtk_tree_view_append_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Recursively collapses all visible, expanded nodes in @tree_view.
    */
  def collapseAll(): Unit /* None */ = gtk_tree_view_collapse_all(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Collapses a row (hides its child rows, if they exist).
    */
  def collapseRow(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Boolean /* None */ = gtk_tree_view_collapse_row(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Resizes all columns to their optimal width. Only works after the treeview
    * has been realized.
    */
  def columnsAutosize(): Unit /* None */ = gtk_tree_view_columns_autosize(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts bin_window coordinates to coordinates for the tree (the full
    * scrollable area of the tree).
    */
  @annotation.compileTimeOnly(
    "Method convert_bin_window_to_tree_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertBinWindowToTreeCoords__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts bin_window coordinates to widget relative coordinates.
    */
  @annotation.compileTimeOnly(
    "Method convert_bin_window_to_widget_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertBinWindowToWidgetCoords__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts tree coordinates (coordinates in full scrollable area of the
    * tree) to bin_window coordinates.
    */
  @annotation.compileTimeOnly(
    "Method convert_tree_to_bin_window_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertTreeToBinWindowCoords__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts tree coordinates (coordinates in full scrollable area of the
    * tree) to widget coordinates.
    */
  @annotation.compileTimeOnly(
    "Method convert_tree_to_widget_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertTreeToWidgetCoords__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts widget coordinates to coordinates for the bin_window.
    */
  @annotation.compileTimeOnly(
    "Method convert_widget_to_bin_window_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertWidgetToBinWindowCoords__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts widget coordinates to coordinates for the tree (the full
    * scrollable area of the tree).
    */
  @annotation.compileTimeOnly(
    "Method convert_widget_to_tree_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertWidgetToTreeCoords__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `cairo_surface_t` representation of the row at @path. This image
    * is used for a drag icon.
    */
  def createRowDragIcon(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Paintable /* None */ = new Paintable.Abstract(
    gtk_tree_view_create_row_drag_icon(
      this.raw.asInstanceOf[Ptr[GtkTreeView]],
      path
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns @tree_view into a drop destination for automatic DND. Calling this
    * method sets `GtkTreeView`:reorderable to %FALSE.
    */
  def enableModelDragDest(
      formats: Ptr[
        GdkContentFormats
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]) */,
      actions: GdkDragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  ): Unit /* None */ = gtk_tree_view_enable_model_drag_dest(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    formats,
    actions
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns @tree_view into a drag source for automatic DND. Calling this method
    * sets `GtkTreeView`:reorderable to %FALSE.
    */
  def enableModelDragSource(
      start_button_mask: GdkModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */,
      formats: Ptr[
        GdkContentFormats
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]) */,
      actions: GdkDragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  ): Unit /* None */ = gtk_tree_view_enable_model_drag_source(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    start_button_mask,
    formats,
    actions
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Recursively expands all nodes in the @tree_view.
    */
  def expandAll(): Unit /* None */ = gtk_tree_view_expand_all(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Opens the row so its children are visible.
    */
  def expandRow(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */,
      open_all: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ = gtk_tree_view_expand_row(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path,
    gboolean(gint((if open_all == true then 1 else 0)))
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Expands the row at @path. This will also expand all parent rows of
    * @path
    *   as necessary.
    */
  def expandToPath(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Unit /* None */ =
    gtk_tree_view_expand_to_path(this.raw.asInstanceOf[Ptr[GtkTreeView]], path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the setting set by gtk_tree_view_set_activate_on_single_click().
    */
  def getActivateOnSingleClick(): Boolean /* None */ =
    gtk_tree_view_get_activate_on_single_click(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills the bounding rectangle in bin_window coordinates for the cell at the
    * row specified by @path and the column specified by @column. If @path is
    * %NULL, or points to a node not found in the tree, the @y and @height
    * fields of the rectangle will be filled with 0. If @column is %NULL, the @x
    * and @width fields will be filled with 0. The returned rectangle is
    * equivalent to the
    * @background_area
    *   passed to gtk_cell_renderer_render(). These background areas tile to
    *   cover the entire bin window. Contrast with the @cell_area, returned by
    *   gtk_tree_view_get_cell_area(), which returns only the cell itself,
    *   excluding surrounding borders and the tree expander area.
    */
  @annotation.compileTimeOnly(
    "Method get_background_area contains an OUT parameter, which is not supported yet"
  )
  private def getBackgroundArea__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills the bounding rectangle in bin_window coordinates for the cell at the
    * row specified by @path and the column specified by @column. If @path is
    * %NULL, or points to a path not currently displayed, the @y and @height
    * fields of the rectangle will be filled with 0. If @column is %NULL, the @x
    * and @width fields will be filled with 0. The sum of all cell rects does
    * not cover the entire tree; there are extra pixels in between rows, for
    * example. The returned rectangle is equivalent to the @cell_area passed to
    * gtk_cell_renderer_render(). This function is only valid if @tree_view is
    * realized.
    */
  @annotation.compileTimeOnly(
    "Method get_cell_area contains an OUT parameter, which is not supported yet"
  )
  private def getCellArea__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkTreeViewColumn` at the given position in the #tree_view.
    */
  def getColumn(n: Int /* Some(CInt) */ ): TreeViewColumn /* None */ =
    new TreeViewColumn(
      gtk_tree_view_get_column(
        this.raw.asInstanceOf[Ptr[GtkTreeView]],
        n
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a `GList` of all the `GtkTreeViewColumn`s currently in @tree_view.
    * The returned list must be freed with g_list_free ().
    */
  def getColumns(): Ptr[GList] /* None */ = gtk_tree_view_get_columns(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills in @path and @focus_column with the current path and focus column.
    * If the cursor isn’t currently set, then *@path will be %NULL. If no column
    * currently has focus, then *@focus_column will be %NULL.
    *
    * The returned `GtkTreePath` must be freed with gtk_tree_path_free() when
    * you are done with it.
    */
  @annotation.compileTimeOnly(
    "Method get_cursor contains an OUT parameter, which is not supported yet"
  )
  private def getCursor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the destination row for a given position. @drag_x and
    * @drag_y
    *   are expected to be in widget coordinates. This function is only
    *   meaningful if @tree_view is realized. Therefore this function will
    *   always return %FALSE if @tree_view is not realized or does not have a
    *   model.
    */
  @annotation.compileTimeOnly(
    "Method get_dest_row_at_pos contains an OUT parameter, which is not supported yet"
  )
  private def getDestRowAtPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets information about the row that is highlighted for feedback.
    */
  @annotation.compileTimeOnly(
    "Method get_drag_dest_row contains an OUT parameter, which is not supported yet"
  )
  private def getDragDestRow__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether or not the tree allows to start interactive searching by
    * typing in text.
    */
  def getEnableSearch(): Boolean /* None */ = gtk_tree_view_get_enable_search(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether or not tree lines are drawn in @tree_view.
    */
  def getEnableTreeLines(): Boolean /* None */ =
    gtk_tree_view_get_enable_tree_lines(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column that is the current expander column, or %NULL if none
    * has been set. This column has the expander arrow drawn next to it.
    */
  def getExpanderColumn(): TreeViewColumn /* None */ = new TreeViewColumn(
    gtk_tree_view_get_expander_column(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether fixed height mode is turned on for @tree_view.
    */
  def getFixedHeightMode(): Boolean /* None */ =
    gtk_tree_view_get_fixed_height_mode(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns which grid lines are enabled in @tree_view.
    */
  def getGridLines(): GtkTreeViewGridLines /* None */ =
    gtk_tree_view_get_grid_lines(this.raw.asInstanceOf[Ptr[GtkTreeView]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether all header columns are clickable.
    */
  def getHeadersClickable(): Boolean /* None */ =
    gtk_tree_view_get_headers_clickable(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the headers on the @tree_view are visible.
    */
  def getHeadersVisible(): Boolean /* None */ =
    gtk_tree_view_get_headers_visible(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether hover expansion mode is turned on for @tree_view.
    */
  def getHoverExpand(): Boolean /* None */ = gtk_tree_view_get_hover_expand(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether hover selection mode is turned on for @tree_view.
    */
  def getHoverSelection(): Boolean /* None */ =
    gtk_tree_view_get_hover_selection(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the amount, in pixels, of extra indentation for child levels in @tree_view.
    */
  def getLevelIndentation(): Int /* None */ =
    gtk_tree_view_get_level_indentation(this.raw.asInstanceOf[Ptr[GtkTreeView]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model the `GtkTreeView` is based on. Returns %NULL if the
    * model is unset.
    */
  def getModel(): TreeModel /* None */ = new TreeModel.Abstract(
    gtk_tree_view_get_model(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the number of columns in the given @tree_view.
    */
  def getNColumns(): UInt /* None */ = gtk_tree_view_get_n_columns(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the path at the point (@x, @y), relative to bin_window coordinates.
    * That is, @x and @y are relative to an events coordinates. Widget-relative
    * coordinates must be converted using
    * gtk_tree_view_convert_widget_to_bin_window_coords(). It is primarily for
    * things like popup menus. If @path is non-%NULL, then it will be filled
    * with the `GtkTreePath` at that point. This path should be freed with
    * gtk_tree_path_free(). If @column is non-%NULL, then it will be filled with
    * the column at that point. @cell_x and @cell_y return the coordinates
    * relative to the cell background (i.e. the @background_area passed to
    * gtk_cell_renderer_render()). This function is only meaningful if
    * @tree_view
    *   is realized. Therefore this function will always return %FALSE if @tree_view
    *   is not realized or does not have a model.
    *
    * For converting widget coordinates (eg. the ones you get from
    * GtkWidget::query-tooltip), please see
    * gtk_tree_view_convert_widget_to_bin_window_coords().
    */
  @annotation.compileTimeOnly(
    "Method get_path_at_pos contains an OUT parameter, which is not supported yet"
  )
  private def getPathAtPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the user can reorder the tree via drag-and-drop. See
    * gtk_tree_view_set_reorderable().
    */
  def getReorderable(): Boolean /* None */ = gtk_tree_view_get_reorderable(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current row separator function.
    */
  def getRowSeparatorFunc(): GtkTreeViewRowSeparatorFunc /* None */ =
    gtk_tree_view_get_row_separator_func(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether rubber banding is turned on for @tree_view. If the
    * selection mode is %GTK_SELECTION_MULTIPLE, rubber banding will allow the
    * user to select multiple rows by dragging the mouse.
    */
  def getRubberBanding(): Boolean /* None */ = gtk_tree_view_get_rubber_banding(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the column searched on by the interactive search code.
    */
  def getSearchColumn(): Int /* None */ = gtk_tree_view_get_search_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkEntry` which is currently in use as interactive search
    * entry for @tree_view. In case the built-in entry is being used, %NULL will
    * be returned.
    */
  def getSearchEntry(): Editable /* None */ = new Editable.Abstract(
    gtk_tree_view_get_search_entry(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the compare function currently in use.
    */
  def getSearchEqualFunc(): GtkTreeViewSearchEqualFunc /* None */ =
    gtk_tree_view_get_search_equal_func(this.raw.asInstanceOf[Ptr[GtkTreeView]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkTreeSelection` associated with @tree_view.
    */
  def getSelection(): TreeSelection /* None */ = new TreeSelection(
    gtk_tree_view_get_selection(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether or not expanders are drawn in @tree_view.
    */
  def getShowExpanders(): Boolean /* None */ = gtk_tree_view_get_show_expanders(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column of @tree_view’s model which is being used for
    * displaying tooltips on @tree_view’s rows.
    */
  def getTooltipColumn(): Int /* None */ = gtk_tree_view_get_tooltip_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  This function is supposed to be used in a ::query-tooltip
    *  signal handler for `GtkTreeView`. The @x, @y and @keyboard_tip values
    *  which are received in the signal handler, should be passed to this
    *  function without modification.
    *
    *  The return value indicates whether there is a tree view row at the given
    *  coordinates (%TRUE) or not (%FALSE) for mouse tooltips. For keyboard
    *  tooltips the row returned will be the cursor row. When %TRUE, then any of
    *  @model, @path and @iter which have been provided will be set to point to
    *  that row and the corresponding model. @x and @y will always be converted
    *  to be relative to @tree_view’s bin_window if @keyboard_tooltip is %FALSE.
    */
  @annotation.compileTimeOnly(
    "Method get_tooltip_context contains an OUT parameter, which is not supported yet"
  )
  private def getTooltipContext__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @start_path and @end_path to be the first and last visible path. Note
    * that there may be invisible paths in between.
    *
    * The paths should be freed with gtk_tree_path_free() after use.
    */
  @annotation.compileTimeOnly(
    "Method get_visible_range contains an OUT parameter, which is not supported yet"
  )
  private def getVisibleRange__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills @visible_rect with the currently-visible region of the buffer, in
    * tree coordinates. Convert to bin_window coordinates with
    * gtk_tree_view_convert_tree_to_bin_window_coords(). Tree coordinates start
    * at 0,0 for row 0 of the tree, and cover the entire scrollable area of the
    * tree.
    */
  @annotation.compileTimeOnly(
    "Method get_visible_rect contains an OUT parameter, which is not supported yet"
  )
  private def getVisibleRect__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This inserts the @column into the @tree_view at @position. If @position is
    * -1, then the column is inserted at the end. If @tree_view has
    * “fixed_height” mode enabled, then @column must have its “sizing” property
    * set to be GTK_TREE_VIEW_COLUMN_FIXED.
    */
  def insertColumn(
      column: TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */,
      position: Int /* Some(CInt) */
  ): Int /* None */ = gtk_tree_view_insert_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column.getUnsafeRawPointer().asInstanceOf,
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTreeViewColumn` and inserts it into the @tree_view at
    * @position.
    *   If @position is -1, then the newly created column is inserted at the
    *   end. The column is initialized with the attributes given. If @tree_view
    *   has “fixed_height” mode enabled, then the new column will have its
    *   sizing property set to be GTK_TREE_VIEW_COLUMN_FIXED.
    */
  inline def insertColumnWithAttributes(
      position: Int /* Some(CInt) */,
      title: String | CString /* Some(CString) */,
      cell: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      args: Any*
  )(using Zone): Int /* None */ = gtk_tree_view_insert_column_with_attributes(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    position,
    __sn_extract_string(title),
    cell.getUnsafeRawPointer().asInstanceOf,
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function that inserts a new column into the `GtkTreeView` with
    * the given cell renderer and a `GtkTreeCellDataFunc` to set cell renderer
    * attributes (normally using data from the model). See also
    * gtk_tree_view_column_set_cell_data_func(),
    * gtk_tree_view_column_pack_start(). If @tree_view has “fixed_height” mode
    * enabled, then the new column will have its “sizing” property set to be
    * GTK_TREE_VIEW_COLUMN_FIXED.
    */
  def insertColumnWithDataFunc(
      position: Int /* Some(CInt) */,
      title: String | CString /* Some(CString) */,
      cell: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      func: GtkTreeCellDataFunc /* Some(GtkTreeCellDataFunc) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      dnotify: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  )(using Zone): Int /* None */ = gtk_tree_view_insert_column_with_data_func(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    position,
    __sn_extract_string(title),
    cell.getUnsafeRawPointer().asInstanceOf,
    func,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    dnotify
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determine whether the point (@x, @y) in @tree_view is blank, that is no
    * cell content nor an expander arrow is drawn at the location. If so, the
    * location can be considered as the background. You might wish to take
    * special action on clicks on the background, such as clearing a current
    * selection, having a custom context menu or starting rubber banding.
    *
    * The @x and @y coordinate that are provided must be relative to bin_window
    * coordinates. Widget-relative coordinates must be converted using
    * gtk_tree_view_convert_widget_to_bin_window_coords().
    *
    * For converting widget coordinates (eg. the ones you get from
    * GtkWidget::query-tooltip), please see
    * gtk_tree_view_convert_widget_to_bin_window_coords().
    *
    * The @path, @column, @cell_x and @cell_y arguments will be filled in
    * likewise as for gtk_tree_view_get_path_at_pos(). Please see
    * gtk_tree_view_get_path_at_pos() for more information.
    */
  @annotation.compileTimeOnly(
    "Method is_blank_at_pos contains an OUT parameter, which is not supported yet"
  )
  private def isBlankAtPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether a rubber banding operation is currently being done in @tree_view.
    */
  def isRubberBandingActive(): Boolean /* None */ =
    gtk_tree_view_is_rubber_banding_active(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls @func on all expanded rows.
    */
  def mapExpandedRows(
      func: GtkTreeViewMappingFunc /* Some(GtkTreeViewMappingFunc) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_tree_view_map_expanded_rows(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    func,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves @column to be after to @base_column. If @base_column is %NULL, then
    * @column
    *   is placed in the first position.
    */
  def moveColumnAfter(
      column: TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */,
      base_column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ]
  ): Unit /* None */ = gtk_tree_view_move_column_after(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column.getUnsafeRawPointer().asInstanceOf,
    base_column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @column from @tree_view.
    */
  def removeColumn(
      column: TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */
  ): Int /* None */ = gtk_tree_view_remove_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Activates the cell determined by @path and @column.
    */
  def rowActivated(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */,
      column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ]
  ): Unit /* None */ = gtk_tree_view_row_activated(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path,
    column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the node pointed to by @path is expanded in @tree_view.
    */
  def rowExpanded(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Boolean /* None */ = gtk_tree_view_row_expanded(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the alignments of @tree_view to the position specified by @column
    * and
    * @path.
    *   If @column is %NULL, then no horizontal scrolling occurs. Likewise, if @path
    *   is %NULL no vertical scrolling occurs. At a minimum, one of @column or @path
    *   need to be non-%NULL. @row_align determines where the row is placed, and @col_align
    *   determines where @column is placed. Both are expected to be between 0.0
    *   and 1.0. 0.0 means left/top alignment, 1.0 means right/bottom alignment,
    *   0.5 means center.
    *
    * If @use_align is %FALSE, then the alignment arguments are ignored, and the
    * tree does the minimum amount of work to scroll the cell onto the screen.
    * This means that the cell will be scrolled to the edge closest to its
    * current position. If the cell is currently visible on the screen, nothing
    * is done.
    *
    * This function only works if the model is set, and @path is a valid row on
    * the model. If the model changes before the @tree_view is realized, the
    * centered path will be modified to reflect this change.
    */
  def scrollToCell(
      path: Option[Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */ ],
      column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ],
      use_align: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      row_align: Float /* Some(Float) */,
      col_align: Float /* Some(Float) */
  ): Unit /* None */ = gtk_tree_view_scroll_to_cell(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path
      .map[Ptr[GtkTreePath]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreePath]]),
    column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]]),
    gboolean(gint((if use_align == true then 1 else 0))),
    row_align.asInstanceOf,
    col_align.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrolls the tree view such that the top-left corner of the visible area is @tree_x, @tree_y,
    * where @tree_x and @tree_y are specified in tree coordinates. The @tree_view
    * must be realized before this function is called. If it isn't, you probably
    * want to be using gtk_tree_view_scroll_to_cell().
    *
    * If either @tree_x or @tree_y are -1, then that direction isn’t scrolled.
    */
  def scrollToPoint(
      tree_x: Int /* Some(CInt) */,
      tree_y: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_tree_view_scroll_to_point(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    tree_x,
    tree_y
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cause the `GtkTreeView`::row-activated signal to be emitted on a single
    * click instead of a double click.
    */
  def setActivateOnSingleClick(
      single: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_activate_on_single_click(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if single == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a user function for determining where a column may be dropped when
    * dragged. This function is called on every column pair in turn at the
    * beginning of a column drag to determine where a drop can take place. The
    * arguments passed to @func are: the @tree_view, the `GtkTreeViewColumn`
    * being dragged, the two `GtkTreeViewColumn`s determining the drop spot, and
    * @user_data.
    *   If either of the `GtkTreeViewColumn` arguments for the drop spot are
    *   %NULL, then they indicate an edge. If @func is set to be %NULL, then
    * @tree_view
    *   reverts to the default behavior of allowing all columns to be dropped
    *   everywhere.
    */
  def setColumnDragFunction(
      func: Option[
        GtkTreeViewColumnDropFunc /* Some(GtkTreeViewColumnDropFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  ): Unit /* None */ = gtk_tree_view_set_column_drag_function(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    func
      .map[GtkTreeViewColumnDropFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkTreeViewColumnDropFunc]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current keyboard focus to be at @path, and selects it. This is
    * useful when you want to focus the user’s attention on a particular row. If
    * @focus_column
    *   is not %NULL, then focus is given to the column specified by it.
    *   Additionally, if @focus_column is specified, and @start_editing is
    *   %TRUE, then editing should be started in the specified cell. This
    *   function is often followed by @gtk_widget_grab_focus (@tree_view) in
    *   order to give keyboard focus to the widget. Please note that editing can
    *   only happen when the widget is realized.
    *
    * If @path is invalid for @model, the current cursor (if any) will be unset
    * and the function will return without failing.
    */
  def setCursor(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */,
      focus_column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ],
      start_editing: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_cursor(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path,
    focus_column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]]),
    gboolean(gint((if start_editing == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current keyboard focus to be at @path, and selects it. This is
    * useful when you want to focus the user’s attention on a particular row. If
    * @focus_column
    *   is not %NULL, then focus is given to the column specified by it. If @focus_column
    *   and @focus_cell are not %NULL, and @focus_column contains 2 or more
    *   editable or activatable cells, then focus is given to the cell specified
    *   by @focus_cell. Additionally, if @focus_column is specified, and @start_editing
    *   is %TRUE, then editing should be started in the specified cell. This
    *   function is often followed by
    * @gtk_widget_grab_focus
    *   (@tree_view) in order to give keyboard focus to the widget. Please note
    *   that editing can only happen when the widget is realized.
    *
    * If @path is invalid for @model, the current cursor (if any) will be unset
    * and the function will return without failing.
    */
  def setCursorOnCell(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */,
      focus_column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ],
      focus_cell: Option[CellRenderer /* Some(Ptr[GtkCellRenderer]) */ ],
      start_editing: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_cursor_on_cell(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path,
    focus_column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]]),
    focus_cell
      .map[Ptr[GtkCellRenderer]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkCellRenderer]]),
    gboolean(gint((if start_editing == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the row that is highlighted for feedback. If @path is %NULL, an
    * existing highlight is removed.
    */
  def setDragDestRow(
      path: Option[Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */ ],
      pos: GtkTreeViewDropPosition /* Some(GtkTreeViewDropPosition) */
  ): Unit /* None */ = gtk_tree_view_set_drag_dest_row(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    path
      .map[Ptr[GtkTreePath]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreePath]]),
    pos
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @enable_search is set, then the user can type in text to search through
    * the tree interactively (this is sometimes called "typeahead find").
    *
    * Note that even if this is %FALSE, the user can still initiate a search
    * using the “start-interactive-search” key binding.
    */
  def setEnableSearch(
      enable_search: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_enable_search(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enable_search == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to draw lines interconnecting the expanders in @tree_view.
    * This does not have any visible effects for lists.
    */
  def setEnableTreeLines(
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_enable_tree_lines(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column to draw the expander arrow at. It must be in @tree_view.
    * If @column is %NULL, then the expander arrow is always at the first
    * visible column.
    *
    * If you do not want expander arrow to appear in your tree, set the expander
    * column to a hidden column.
    */
  def setExpanderColumn(
      column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ]
  ): Unit /* None */ = gtk_tree_view_set_expander_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enables or disables the fixed height mode of @tree_view. Fixed height mode
    * speeds up `GtkTreeView` by assuming that all rows have the same height.
    * Only enable this option if all rows are the same height and all columns
    * are of type %GTK_TREE_VIEW_COLUMN_FIXED.
    */
  def setFixedHeightMode(
      enable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_fixed_height_mode(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets which grid lines to draw in @tree_view.
    */
  def setGridLines(
      grid_lines: GtkTreeViewGridLines /* Some(GtkTreeViewGridLines) */
  ): Unit /* None */ = gtk_tree_view_set_grid_lines(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    grid_lines
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow the column title buttons to be clicked.
    */
  def setHeadersClickable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_headers_clickable(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the visibility state of the headers.
    */
  def setHeadersVisible(
      headers_visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_headers_visible(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if headers_visible == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enables or disables the hover expansion mode of @tree_view. Hover
    * expansion makes rows expand or collapse if the pointer moves over them.
    */
  def setHoverExpand(
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_hover_expand(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if expand == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enables or disables the hover selection mode of @tree_view. Hover
    * selection makes the selected row follow the pointer. Currently, this works
    * only for the selection modes %GTK_SELECTION_SINGLE and
    * %GTK_SELECTION_BROWSE.
    */
  def setHoverSelection(
      hover: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_hover_selection(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if hover == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the amount of extra indentation for child levels to use in @tree_view
    * in addition to the default indentation. The value should be specified in
    * pixels, a value of 0 disables this feature and in this case only the
    * default indentation will be used. This does not have any visible effects
    * for lists.
    */
  def setLevelIndentation(indentation: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_set_level_indentation(
      this.raw.asInstanceOf[Ptr[GtkTreeView]],
      indentation
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model for a `GtkTreeView`. If the @tree_view already has a model
    * set, it will remove it before setting the new model. If @model is %NULL,
    * then it will unset the old model.
    */
  def setModel(
      model: Option[TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ = gtk_tree_view_set_model(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    model
      .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is a convenience function to allow you to reorder models
    * that support the `GtkTreeDragSourceIface` and the `GtkTreeDragDestIface`.
    * Both `GtkTreeStore` and `GtkListStore` support these. If @reorderable is
    * %TRUE, then the user can reorder the model by dragging and dropping rows.
    * The developer can listen to these changes by connecting to the model’s
    * `GtkTreeModel::row-inserted` and `GtkTreeModel::row-deleted` signals. The
    * reordering is implemented by setting up the tree view as a drag source and
    * destination. Therefore, drag and drop can not be used in a reorderable
    * view for any other purpose.
    *
    * This function does not give you any degree of control over the order --
    * any reordering is allowed. If more control is needed, you should probably
    * handle drag and drop manually.
    */
  def setReorderable(
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_reorderable(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if reorderable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the row separator function, which is used to determine whether a row
    * should be drawn as a separator. If the row separator function is %NULL, no
    * separators are drawn. This is the default value.
    */
  def setRowSeparatorFunc(
      func: Option[
        GtkTreeViewRowSeparatorFunc /* Some(GtkTreeViewRowSeparatorFunc) */
      ],
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  ): Unit /* None */ = gtk_tree_view_set_row_separator_func(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    func
      .map[GtkTreeViewRowSeparatorFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkTreeViewRowSeparatorFunc]),
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enables or disables rubber banding in @tree_view. If the selection mode is
    * %GTK_SELECTION_MULTIPLE, rubber banding will allow the user to select
    * multiple rows by dragging the mouse.
    */
  def setRubberBanding(
      enable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_rubber_banding(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @column as the column where the interactive search code should search
    * in for the current model.
    *
    * If the search column is set, users can use the “start-interactive-search”
    * key binding to bring up search popup. The enable-search property controls
    * whether simply typing text will also start an interactive search.
    *
    * Note that @column refers to a column of the current model. The search
    * column is reset to -1 when the model is changed.
    */
  def setSearchColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_set_search_column(
      this.raw.asInstanceOf[Ptr[GtkTreeView]],
      column
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the entry which the interactive search code will use for this
    * @tree_view.
    *   This is useful when you want to provide a search entry in our interface
    *   at all time at a fixed position. Passing %NULL for
    * @entry
    *   will make the interactive search code use the built-in popup entry
    *   again.
    */
  def setSearchEntry(
      entry: Option[Editable /* Some(Ptr[GtkEditable]) */ ]
  ): Unit /* None */ = gtk_tree_view_set_search_entry(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    entry
      .map[Ptr[GtkEditable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkEditable]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the compare function for the interactive search capabilities; note
    * that somewhat like strcmp() returning 0 for equality
    * `GtkTreeView`SearchEqualFunc returns %FALSE on matches.
    */
  def setSearchEqualFunc(
      search_equal_func: GtkTreeViewSearchEqualFunc /* Some(GtkTreeViewSearchEqualFunc) */,
      search_user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      search_destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  ): Unit /* None */ = gtk_tree_view_set_search_equal_func(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    search_equal_func,
    search_user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    search_destroy
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to draw and enable expanders and indent child rows in
    * @tree_view.
    *   When disabled there will be no expanders visible in trees and there will
    *   be no way to expand and collapse rows by default. Also note that hiding
    *   the expanders will disable the default indentation. You can set a custom
    *   indentation in this case using gtk_tree_view_set_level_indentation().
    *   This does not have any visible effects for lists.
    */
  def setShowExpanders(
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_show_expanders(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tip area of @tooltip to the area @path, @column and @cell have in
    * common. For example if @path is %NULL and @column is set, the tip area
    * will be set to the full area covered by @column. See also
    * gtk_tooltip_set_tip_area().
    *
    * Note that if @path is not specified and @cell is set and part of a column
    * containing the expander, the tooltip might not show and hide at the
    * correct position. In such cases @path must be set to the current node
    * under the mouse cursor for this function to operate correctly.
    *
    * See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
    */
  def setTooltipCell(
      tooltip: Tooltip /* Some(Ptr[GtkTooltip]) */,
      path: Option[Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */ ],
      column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ],
      cell: Option[CellRenderer /* Some(Ptr[GtkCellRenderer]) */ ]
  ): Unit /* None */ = gtk_tree_view_set_tooltip_cell(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    tooltip.getUnsafeRawPointer().asInstanceOf,
    path
      .map[Ptr[GtkTreePath]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreePath]]),
    column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]]),
    cell
      .map[Ptr[GtkCellRenderer]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkCellRenderer]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If you only plan to have simple (text-only) tooltips on full rows, you can
    * use this function to have `GtkTreeView` handle these automatically for
    * you. @column should be set to the column in @tree_view’s model containing
    * the tooltip texts, or -1 to disable this feature.
    *
    * When enabled, `GtkWidget:has-tooltip` will be set to %TRUE and
    * @tree_view
    *   will connect a `GtkWidget::query-tooltip` signal handler.
    *
    * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
    * so &, <, etc have to be escaped in the text.
    */
  def setTooltipColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_set_tooltip_column(
      this.raw.asInstanceOf[Ptr[GtkTreeView]],
      column
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tip area of @tooltip to be the area covered by the row at @path.
    * See also gtk_tree_view_set_tooltip_column() for a simpler alternative. See
    * also gtk_tooltip_set_tip_area().
    */
  def setTooltipRow(
      tooltip: Tooltip /* Some(Ptr[GtkTooltip]) */,
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Unit /* None */ = gtk_tree_view_set_tooltip_row(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    tooltip.getUnsafeRawPointer().asInstanceOf,
    path
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of gtk_tree_view_enable_model_drag_dest(). Calling this
    * method sets `GtkTreeView`:reorderable to %FALSE.
    */
  def unsetRowsDragDest(): Unit /* None */ = gtk_tree_view_unset_rows_drag_dest(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of gtk_tree_view_enable_model_drag_source(). Calling
    * this method sets `GtkTreeView`:reorderable to %FALSE.
    */
  def unsetRowsDragSource(): Unit /* None */ =
    gtk_tree_view_unset_rows_drag_source(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTreeView` widget.
    */
  def apply(): TreeView = new TreeView(gtk_tree_view_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTreeView` widget with the model initialized to @model.
    */
  def withModel(model: TreeModel /* Some(Ptr[GtkTreeModel]) */ ): TreeView =
    new TreeView(
      gtk_tree_view_new_with_model(
        model.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end TreeView
