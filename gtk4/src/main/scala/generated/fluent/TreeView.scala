package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  CellRenderer,
  ConstraintTarget,
  Editable,
  MovementStep,
  Scrollable,
  TreeModel,
  TreeSelection,
  TreeViewColumn,
  TreeViewGridLines,
  Widget
}
import sn.gnome.gtk4.internal.{GtkMovementStep, GtkTreeView}
import sn.gnome.runtime.*

/** A widget for displaying both trees and lists
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeView(raw: Ptr[GtkTreeView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends @column to the list of columns. If @tree_view has “fixed_height”
    * mode enabled, then @column must have its “sizing” property set to be
    * GTK_TREE_VIEW_COLUMN_FIXED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendColumn(
      column: TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */
  ): Int /* None */ = gtk_tree_view_append_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column.getUnsafeRawPointer().asInstanceOf
  )

  /** Recursively collapses all visible, expanded nodes in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def collapseAll(): Unit /* None */ = gtk_tree_view_collapse_all(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** Collapses a row (hides its child rows, if they exist).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method collapse_row/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def collapseRow__ = ???

  /** Resizes all columns to their optimal width. Only works after the treeview
    * has been realized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def columnsAutosize(): Unit /* None */ = gtk_tree_view_columns_autosize(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** Converts bin_window coordinates to coordinates for the tree (the full
    * scrollable area of the tree).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_bin_window_to_tree_coords]: Method convert_bin_window_to_tree_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertBinWindowToTreeCoords__ = ???

  /** Converts bin_window coordinates to widget relative coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_bin_window_to_widget_coords]: Method convert_bin_window_to_widget_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertBinWindowToWidgetCoords__ = ???

  /** Converts tree coordinates (coordinates in full scrollable area of the
    * tree) to bin_window coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_tree_to_bin_window_coords]: Method convert_tree_to_bin_window_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertTreeToBinWindowCoords__ = ???

  /** Converts tree coordinates (coordinates in full scrollable area of the
    * tree) to widget coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_tree_to_widget_coords]: Method convert_tree_to_widget_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertTreeToWidgetCoords__ = ???

  /** Converts widget coordinates to coordinates for the bin_window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_widget_to_bin_window_coords]: Method convert_widget_to_bin_window_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertWidgetToBinWindowCoords__ = ???

  /** Converts widget coordinates to coordinates for the tree (the full
    * scrollable area of the tree).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_widget_to_tree_coords]: Method convert_widget_to_tree_coords contains an OUT parameter, which is not supported yet"
  )
  private def convertWidgetToTreeCoords__ = ???

  /** Creates a `cairo_surface_t` representation of the row at @path. This image
    * is used for a drag icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method create_row_drag_icon/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def createRowDragIcon__ = ???

  /** Turns @tree_view into a drop destination for automatic DND. Calling this
    * method sets `GtkTreeView`:reorderable to %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method enable_model_drag_dest/<method parameters>/formats]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def enableModelDragDest__ = ???

  /** Turns @tree_view into a drag source for automatic DND. Calling this method
    * sets `GtkTreeView`:reorderable to %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method enable_model_drag_source/<method parameters>/formats]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def enableModelDragSource__ = ???

  /** Recursively expands all nodes in the @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def expandAll(): Unit /* None */ = gtk_tree_view_expand_all(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** Opens the row so its children are visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method expand_row/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def expandRow__ = ???

  /** Expands the row at @path. This will also expand all parent rows of
    * @path
    *   as necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method expand_to_path/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def expandToPath__ = ???

  /** Gets the setting set by gtk_tree_view_set_activate_on_single_click().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivateOnSingleClick(): Boolean /* None */ =
    gtk_tree_view_get_activate_on_single_click(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** Fills the bounding rectangle in bin_window coordinates for the cell at the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_background_area]: Method get_background_area contains an OUT parameter, which is not supported yet"
  )
  private def getBackgroundArea__ = ???

  /** Fills the bounding rectangle in bin_window coordinates for the cell at the
    * row specified by @path and the column specified by @column. If @path is
    * %NULL, or points to a path not currently displayed, the @y and @height
    * fields of the rectangle will be filled with 0. If @column is %NULL, the @x
    * and @width fields will be filled with 0. The sum of all cell rects does
    * not cover the entire tree; there are extra pixels in between rows, for
    * example. The returned rectangle is equivalent to the @cell_area passed to
    * gtk_cell_renderer_render(). This function is only valid if @tree_view is
    * realized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cell_area]: Method get_cell_area contains an OUT parameter, which is not supported yet"
  )
  private def getCellArea__ = ???

  /** Gets the `GtkTreeViewColumn` at the given position in the #tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumn(n: Int /* Some(CInt) */ ): TreeViewColumn /* None */ =
    new TreeViewColumn(
      gtk_tree_view_get_column(
        this.raw.asInstanceOf[Ptr[GtkTreeView]],
        n
      ).asInstanceOf
    )

  /** Returns a `GList` of all the `GtkTreeViewColumn`s currently in @tree_view.
    * The returned list must be freed with g_list_free ().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_columns/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(TreeViewColumn))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getColumns__ = ???

  /** Fills in @path and @focus_column with the current path and focus column.
    * If the cursor isn’t currently set, then *@path will be %NULL. If no column
    * currently has focus, then *@focus_column will be %NULL.
    *
    * The returned `GtkTreePath` must be freed with gtk_tree_path_free() when
    * you are done with it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cursor]: Method get_cursor contains an OUT parameter, which is not supported yet"
  )
  private def getCursor__ = ???

  /** Determines the destination row for a given position. @drag_x and
    * @drag_y
    *   are expected to be in widget coordinates. This function is only
    *   meaningful if @tree_view is realized. Therefore this function will
    *   always return %FALSE if @tree_view is not realized or does not have a
    *   model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_dest_row_at_pos]: Method get_dest_row_at_pos contains an OUT parameter, which is not supported yet"
  )
  private def getDestRowAtPos__ = ???

  /** Gets information about the row that is highlighted for feedback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_drag_dest_row]: Method get_drag_dest_row contains an OUT parameter, which is not supported yet"
  )
  private def getDragDestRow__ = ???

  /** Returns whether or not the tree allows to start interactive searching by
    * typing in text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableSearch(): Boolean /* None */ = gtk_tree_view_get_enable_search(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** Returns whether or not tree lines are drawn in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableTreeLines(): Boolean /* None */ =
    gtk_tree_view_get_enable_tree_lines(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** Returns the column that is the current expander column, or %NULL if none
    * has been set. This column has the expander arrow drawn next to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpanderColumn(): TreeViewColumn /* None */ = new TreeViewColumn(
    gtk_tree_view_get_expander_column(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** Returns whether fixed height mode is turned on for @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFixedHeightMode(): Boolean /* None */ =
    gtk_tree_view_get_fixed_height_mode(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** Returns which grid lines are enabled in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGridLines(): TreeViewGridLines /* None */ = TreeViewGridLines.fromRaw(
    gtk_tree_view_get_grid_lines(this.raw.asInstanceOf[Ptr[GtkTreeView]])
  )

  /** Returns whether all header columns are clickable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeadersClickable(): Boolean /* None */ =
    gtk_tree_view_get_headers_clickable(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** Returns %TRUE if the headers on the @tree_view are visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeadersVisible(): Boolean /* None */ =
    gtk_tree_view_get_headers_visible(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** Returns whether hover expansion mode is turned on for @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHoverExpand(): Boolean /* None */ = gtk_tree_view_get_hover_expand(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** Returns whether hover selection mode is turned on for @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHoverSelection(): Boolean /* None */ =
    gtk_tree_view_get_hover_selection(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** Returns the amount, in pixels, of extra indentation for child levels in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLevelIndentation(): Int /* None */ =
    gtk_tree_view_get_level_indentation(this.raw.asInstanceOf[Ptr[GtkTreeView]])

  /** Returns the model the `GtkTreeView` is based on. Returns %NULL if the
    * model is unset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): TreeModel /* None */ = new TreeModel.Abstract(
    gtk_tree_view_get_model(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** Queries the number of columns in the given @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNColumns(): UInt /* None */ = gtk_tree_view_get_n_columns(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value

  /** Finds the path at the point (@x, @y), relative to bin_window coordinates.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_path_at_pos]: Method get_path_at_pos contains an OUT parameter, which is not supported yet"
  )
  private def getPathAtPos__ = ???

  /** Retrieves whether the user can reorder the tree via drag-and-drop. See
    * gtk_tree_view_set_reorderable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getReorderable(): Boolean /* None */ = gtk_tree_view_get_reorderable(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** Returns the current row separator function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_row_separator_func/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))"
  )
  private def getRowSeparatorFunc__ = ???

  /** Returns whether rubber banding is turned on for @tree_view. If the
    * selection mode is %GTK_SELECTION_MULTIPLE, rubber banding will allow the
    * user to select multiple rows by dragging the mouse.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRubberBanding(): Boolean /* None */ = gtk_tree_view_get_rubber_banding(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** Gets the column searched on by the interactive search code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearchColumn(): Int /* None */ = gtk_tree_view_get_search_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** Returns the `GtkEntry` which is currently in use as interactive search
    * entry for @tree_view. In case the built-in entry is being used, %NULL will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearchEntry(): Editable /* None */ = new Editable.Abstract(
    gtk_tree_view_get_search_entry(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** Returns the compare function currently in use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_search_equal_func/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewSearchEqualFunc), @type -> DataRecord(GtkTreeViewSearchEqualFunc)))"
  )
  private def getSearchEqualFunc__ = ???

  /** Gets the `GtkTreeSelection` associated with @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelection(): TreeSelection /* None */ = new TreeSelection(
    gtk_tree_view_get_selection(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).asInstanceOf
  )

  /** Returns whether or not expanders are drawn in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowExpanders(): Boolean /* None */ = gtk_tree_view_get_show_expanders(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  ).value.!=(0)

  /** Returns the column of @tree_view’s model which is being used for
    * displaying tooltips on @tree_view’s rows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTooltipColumn(): Int /* None */ = gtk_tree_view_get_tooltip_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /**  This function is supposed to be used in a ::query-tooltip
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tooltip_context]: Method get_tooltip_context contains an OUT parameter, which is not supported yet"
  )
  private def getTooltipContext__ = ???

  /** Sets @start_path and @end_path to be the first and last visible path. Note
    * that there may be invisible paths in between.
    *
    * The paths should be freed with gtk_tree_path_free() after use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_visible_range]: Method get_visible_range contains an OUT parameter, which is not supported yet"
  )
  private def getVisibleRange__ = ???

  /** Fills @visible_rect with the currently-visible region of the buffer, in
    * tree coordinates. Convert to bin_window coordinates with
    * gtk_tree_view_convert_tree_to_bin_window_coords(). Tree coordinates start
    * at 0,0 for row 0 of the tree, and cover the entire scrollable area of the
    * tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_visible_rect]: Method get_visible_rect contains an OUT parameter, which is not supported yet"
  )
  private def getVisibleRect__ = ???

  /** This inserts the @column into the @tree_view at @position. If @position is
    * -1, then the column is inserted at the end. If @tree_view has
    * “fixed_height” mode enabled, then @column must have its “sizing” property
    * set to be GTK_TREE_VIEW_COLUMN_FIXED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertColumn(
      column: TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */,
      position: Int /* Some(CInt) */
  ): Int /* None */ = gtk_tree_view_insert_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column.getUnsafeRawPointer().asInstanceOf,
    position
  )

  /** Creates a new `GtkTreeViewColumn` and inserts it into the @tree_view at
    * @position.
    *   If @position is -1, then the newly created column is inserted at the
    *   end. The column is initialized with the attributes given. If @tree_view
    *   has “fixed_height” mode enabled, then the new column will have its
    *   sizing property set to be GTK_TREE_VIEW_COLUMN_FIXED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Convenience function that inserts a new column into the `GtkTreeView` with
    * the given cell renderer and a `GtkTreeCellDataFunc` to set cell renderer
    * attributes (normally using data from the model). See also
    * gtk_tree_view_column_set_cell_data_func(),
    * gtk_tree_view_column_pack_start(). If @tree_view has “fixed_height” mode
    * enabled, then the new column will have its “sizing” property set to be
    * GTK_TREE_VIEW_COLUMN_FIXED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_column_with_data_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeCellDataFunc), @type -> DataRecord(GtkTreeCellDataFunc)))"
  )
  private def insertColumnWithDataFunc__ = ???

  /** Determine whether the point (@x, @y) in @tree_view is blank, that is no
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method is_blank_at_pos]: Method is_blank_at_pos contains an OUT parameter, which is not supported yet"
  )
  private def isBlankAtPos__ = ???

  /** Returns whether a rubber banding operation is currently being done in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRubberBandingActive(): Boolean /* None */ =
    gtk_tree_view_is_rubber_banding_active(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    ).value.!=(0)

  /** Calls @func on all expanded rows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method map_expanded_rows/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewMappingFunc), @type -> DataRecord(GtkTreeViewMappingFunc)))"
  )
  private def mapExpandedRows__ = ???

  /** Moves @column to be after to @base_column. If @base_column is %NULL, then
    * @column
    *   is placed in the first position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Removes @column from @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeColumn(
      column: TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */
  ): Int /* None */ = gtk_tree_view_remove_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column.getUnsafeRawPointer().asInstanceOf
  )

  /** Activates the cell determined by @path and @column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method row_activated/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def rowActivated__ = ???

  /** Returns %TRUE if the node pointed to by @path is expanded in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method row_expanded/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def rowExpanded__ = ???

  /** Moves the alignments of @tree_view to the position specified by @column
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method scroll_to_cell/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def scrollToCell__ = ???

  /** Scrolls the tree view such that the top-left corner of the visible area is @tree_x, @tree_y,
    * where @tree_x and @tree_y are specified in tree coordinates. The @tree_view
    * must be realized before this function is called. If it isn't, you probably
    * want to be using gtk_tree_view_scroll_to_cell().
    *
    * If either @tree_x or @tree_y are -1, then that direction isn’t scrolled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scrollToPoint(
      tree_x: Int /* Some(CInt) */,
      tree_y: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_tree_view_scroll_to_point(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    tree_x,
    tree_y
  )

  /** Cause the `GtkTreeView`::row-activated signal to be emitted on a single
    * click instead of a double click.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivateOnSingleClick(
      single: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_activate_on_single_click(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if single == true then 1 else 0)))
  )

  /** Sets a user function for determining where a column may be dropped when
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_column_drag_function/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewColumnDropFunc), @type -> DataRecord(GtkTreeViewColumnDropFunc)))"
  )
  private def setColumnDragFunction__ = ???

  /** Sets the current keyboard focus to be at @path, and selects it. This is
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_cursor/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def setCursor__ = ???

  /** Sets the current keyboard focus to be at @path, and selects it. This is
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_cursor_on_cell/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def setCursorOnCell__ = ???

  /** Sets the row that is highlighted for feedback. If @path is %NULL, an
    * existing highlight is removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_drag_dest_row/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def setDragDestRow__ = ???

  /** If @enable_search is set, then the user can type in text to search through
    * the tree interactively (this is sometimes called "typeahead find").
    *
    * Note that even if this is %FALSE, the user can still initiate a search
    * using the “start-interactive-search” key binding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableSearch(
      enable_search: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_enable_search(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enable_search == true then 1 else 0)))
  )

  /** Sets whether to draw lines interconnecting the expanders in @tree_view.
    * This does not have any visible effects for lists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableTreeLines(
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_enable_tree_lines(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** Sets the column to draw the expander arrow at. It must be in @tree_view.
    * If @column is %NULL, then the expander arrow is always at the first
    * visible column.
    *
    * If you do not want expander arrow to appear in your tree, set the expander
    * column to a hidden column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpanderColumn(
      column: Option[TreeViewColumn /* Some(Ptr[GtkTreeViewColumn]) */ ]
  ): Unit /* None */ = gtk_tree_view_set_expander_column(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    column
      .map[Ptr[GtkTreeViewColumn]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeViewColumn]])
  )

  /** Enables or disables the fixed height mode of @tree_view. Fixed height mode
    * speeds up `GtkTreeView` by assuming that all rows have the same height.
    * Only enable this option if all rows are the same height and all columns
    * are of type %GTK_TREE_VIEW_COLUMN_FIXED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFixedHeightMode(
      enable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_fixed_height_mode(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enable == true then 1 else 0)))
  )

  /** Sets which grid lines to draw in @tree_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setGridLines(
      grid_lines: TreeViewGridLines /* Some(GtkTreeViewGridLines) */
  ): Unit /* None */ = gtk_tree_view_set_grid_lines(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    grid_lines.raw
  )

  /** Allow the column title buttons to be clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeadersClickable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_headers_clickable(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets the visibility state of the headers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeadersVisible(
      headers_visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_headers_visible(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if headers_visible == true then 1 else 0)))
  )

  /** Enables or disables the hover expansion mode of @tree_view. Hover
    * expansion makes rows expand or collapse if the pointer moves over them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHoverExpand(
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_hover_expand(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if expand == true then 1 else 0)))
  )

  /** Enables or disables the hover selection mode of @tree_view. Hover
    * selection makes the selected row follow the pointer. Currently, this works
    * only for the selection modes %GTK_SELECTION_SINGLE and
    * %GTK_SELECTION_BROWSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHoverSelection(
      hover: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_hover_selection(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if hover == true then 1 else 0)))
  )

  /** Sets the amount of extra indentation for child levels to use in @tree_view
    * in addition to the default indentation. The value should be specified in
    * pixels, a value of 0 disables this feature and in this case only the
    * default indentation will be used. This does not have any visible effects
    * for lists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLevelIndentation(indentation: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_set_level_indentation(
      this.raw.asInstanceOf[Ptr[GtkTreeView]],
      indentation
    )

  /** Sets the model for a `GtkTreeView`. If the @tree_view already has a model
    * set, it will remove it before setting the new model. If @model is %NULL,
    * then it will unset the old model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ = gtk_tree_view_set_model(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    model
      .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
  )

  /** This function is a convenience function to allow you to reorder models
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setReorderable(
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_reorderable(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if reorderable == true then 1 else 0)))
  )

  /** Sets the row separator function, which is used to determine whether a row
    * should be drawn as a separator. If the row separator function is %NULL, no
    * separators are drawn. This is the default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_row_separator_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))"
  )
  private def setRowSeparatorFunc__ = ???

  /** Enables or disables rubber banding in @tree_view. If the selection mode is
    * %GTK_SELECTION_MULTIPLE, rubber banding will allow the user to select
    * multiple rows by dragging the mouse.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRubberBanding(
      enable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_rubber_banding(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enable == true then 1 else 0)))
  )

  /** Sets @column as the column where the interactive search code should search
    * in for the current model.
    *
    * If the search column is set, users can use the “start-interactive-search”
    * key binding to bring up search popup. The enable-search property controls
    * whether simply typing text will also start an interactive search.
    *
    * Note that @column refers to a column of the current model. The search
    * column is reset to -1 when the model is changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSearchColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_set_search_column(
      this.raw.asInstanceOf[Ptr[GtkTreeView]],
      column
    )

  /** Sets the entry which the interactive search code will use for this
    * @tree_view.
    *   This is useful when you want to provide a search entry in our interface
    *   at all time at a fixed position. Passing %NULL for
    * @entry
    *   will make the interactive search code use the built-in popup entry
    *   again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSearchEntry(
      entry: Option[Editable /* Some(Ptr[GtkEditable]) */ ]
  ): Unit /* None */ = gtk_tree_view_set_search_entry(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    entry
      .map[Ptr[GtkEditable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkEditable]])
  )

  /** Sets the compare function for the interactive search capabilities; note
    * that somewhat like strcmp() returning 0 for equality
    * `GtkTreeView`SearchEqualFunc returns %FALSE on matches.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_search_equal_func/<method parameters>/search_equal_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewSearchEqualFunc), @type -> DataRecord(GtkTreeViewSearchEqualFunc)))"
  )
  private def setSearchEqualFunc__ = ???

  /** Sets whether to draw and enable expanders and indent child rows in
    * @tree_view.
    *   When disabled there will be no expanders visible in trees and there will
    *   be no way to expand and collapse rows by default. Also note that hiding
    *   the expanders will disable the default indentation. You can set a custom
    *   indentation in this case using gtk_tree_view_set_level_indentation().
    *   This does not have any visible effects for lists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowExpanders(
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_view_set_show_expanders(
    this.raw.asInstanceOf[Ptr[GtkTreeView]],
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** Sets the tip area of @tooltip to the area @path, @column and @cell have in
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_tooltip_cell/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def setTooltipCell__ = ???

  /** If you only plan to have simple (text-only) tooltips on full rows, you can
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTooltipColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_set_tooltip_column(
      this.raw.asInstanceOf[Ptr[GtkTreeView]],
      column
    )

  /** Sets the tip area of @tooltip to be the area covered by the row at @path.
    * See also gtk_tree_view_set_tooltip_column() for a simpler alternative. See
    * also gtk_tooltip_set_tip_area().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_tooltip_row/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def setTooltipRow__ = ???

  /** Undoes the effect of gtk_tree_view_enable_model_drag_dest(). Calling this
    * method sets `GtkTreeView`:reorderable to %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetRowsDragDest(): Unit /* None */ = gtk_tree_view_unset_rows_drag_dest(
    this.raw.asInstanceOf[Ptr[GtkTreeView]]
  )

  /** Undoes the effect of gtk_tree_view_enable_model_drag_source(). Calling
    * this method sets `GtkTreeView`:reorderable to %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetRowsDragSource(): Unit /* None */ =
    gtk_tree_view_unset_rows_drag_source(
      this.raw.asInstanceOf[Ptr[GtkTreeView]]
    )

  /** The number of columns of the treeview has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onColumnsChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"columns-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onColumnsChanged

  /** The position of the cursor (focused cell) has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCursorChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"cursor-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onCursorChanged
  def onExpandCollapseCursorRow(
      handler: ((`object`: Boolean, p0: Boolean, p1: Boolean)) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (`object`: Boolean, p0: Boolean, p1: Boolean),
      Boolean
    ]
    val c_handler = CFuncPtr5.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          `object`: Boolean /* param */,
          p0: Boolean /* param */,
          p1: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = `object`, p0 = p0, p1 = p1))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"expand-collapse-cursor-row"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onExpandCollapseCursorRow

  /** The `GtkTreeView`::move-cursor signal is a [keybinding
    * signal][class@Gtk.SignalAction] which gets emitted when the user presses
    * one of the cursor keys.
    *
    * Applications should not connect to it, but may emit it with
    * g_signal_emit_by_name() if they need to control the cursor
    * programmatically. In contrast to gtk_tree_view_set_cursor() and
    * gtk_tree_view_set_cursor_on_cell() when moving horizontally
    * `GtkTreeView`::move-cursor does not reset the current selection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveCursor(
      handler: (
          (step: MovementStep, direction: Int, extend: Boolean, modify: Boolean)
      ) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (step: MovementStep, direction: Int, extend: Boolean, modify: Boolean),
      Boolean
    ]
    val c_handler = CFuncPtr6.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          step: GtkMovementStep /* param */,
          direction: Int /* param */,
          extend: Boolean /* param */,
          modify: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            step = MovementStep.fromRaw(step),
            direction = direction,
            extend = extend,
            modify = modify
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"move-cursor"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMoveCursor

  /** The "row-activated" signal is emitted when the method
    * [method@Gtk.TreeView.row_activated] is called.
    *
    * This signal is emitted when the user double-clicks a treeview row with the
    * [property@Gtk.TreeView:activate-on-single-click] property set to %FALSE,
    * or when the user single-clicks a row when that property set to %TRUE.
    *
    * This signal is also emitted when a non-editable row is selected and one of
    * the keys: <kbd>Space</kbd>, <kbd>Shift</kbd>+<kbd>Space</kbd>,
    * <kbd>Return</kbd> or <kbd>Enter</kbd> is pressed.
    *
    * For selection handling refer to the [tree widget conceptual
    * overview](section-tree-widget.html) as well as `GtkTreeSelection`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal row-activated]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreePath)))"
  )
  private def onRowActivated = ???

  /** The given row has been collapsed (child nodes are hidden).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal row-collapsed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))"
  )
  private def onRowCollapsed = ???

  /** The given row has been expanded (child nodes are shown).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal row-expanded]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))"
  )
  private def onRowExpanded = ???

  def onSelectAll(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"select-all"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onSelectAll
  def onSelectCursorParent(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"select-cursor-parent"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onSelectCursorParent
  def onSelectCursorRow(handler: ((`object`: Boolean)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (`object`: Boolean), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          `object`: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = `object`))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"select-cursor-row"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onSelectCursorRow
  def onStartInteractiveSearch(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"start-interactive-search"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onStartInteractiveSearch

  /** The given row is about to be collapsed (hide its children nodes). Use this
    * signal if you need to control the collapsibility of individual rows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal test-collapse-row]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))"
  )
  private def onTestCollapseRow = ???

  /** The given row is about to be expanded (show its children nodes). Use this
    * signal if you need to control the expandability of individual rows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal test-expand-row]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))"
  )
  private def onTestExpandRow = ???

  def onToggleCursorRow(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"toggle-cursor-row"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onToggleCursorRow
  def onUnselectAll(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeView],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"unselect-all"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onUnselectAll

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
  /** Creates a new `GtkTreeView` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): TreeView =
    val raw: Ptr[Byte] = gtk_tree_view_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[TreeView](raw, r => new TreeView(r.asInstanceOf))
  end apply

  /** Creates a new `GtkTreeView` widget with the model initialized to @model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withModel(model: TreeModel /* Some(Ptr[GtkTreeModel]) */ )(using
      Runtime
  ): TreeView =
    val raw: Ptr[Byte] = gtk_tree_view_new_with_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[TreeView](raw, r => new TreeView(r.asInstanceOf))
  end withModel
end TreeView
