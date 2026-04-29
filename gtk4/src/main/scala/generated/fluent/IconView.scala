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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkIconView` is a widget which displays data in a grid of icons.
  *
  * `GtkIconView` provides an alternative view on a `GtkTreeModel`. It displays
  * the model as a grid of icons with labels. Like [class@Gtk.TreeView], it
  * allows to select one or multiple items (depending on the selection mode, see
  * [method@Gtk.IconView.set_selection_mode]). In addition to selection with the
  * arrow keys, `GtkIconView` supports rubberband selection, which is controlled
  * by dragging the pointer.
  *
  * Note that if the tree model is backed by an actual tree store (as opposed to
  * a flat list where the mapping to icons is obvious), `GtkIconView` will only
  * display the first level of the tree and ignore the tree’s branches.
  *
  * ## CSS nodes
  *
  * ```
  * iconview.view
  * ╰── [rubberband]
  * ```
  *
  * `GtkIconView` has a single CSS node with name iconview and style class
  * .view. For rubberband selection, a subnode with name rubberband is used.
  */
class IconView(raw: Ptr[GtkIconView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellLayout,
      ConstraintTarget,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GdkPaintable` representation of the item at @path. This image
    * is used for a drag icon.
    */
  def createDragIcon(path: Ptr[GtkTreePath]): Paintable =
    new Paintable.Abstract(
      gtk_icon_view_create_drag_icon(this.raw.asInstanceOf, path).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns @icon_view into a drop destination for automatic DND. Calling this
    * method sets `GtkIconView`:reorderable to %FALSE.
    */
  def enableModelDragDest(
      formats: Ptr[GdkContentFormats],
      actions: GdkDragAction
  ): Unit = gtk_icon_view_enable_model_drag_dest(
    this.raw.asInstanceOf,
    formats,
    actions
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns @icon_view into a drag source for automatic DND. Calling this method
    * sets `GtkIconView`:reorderable to %FALSE.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
    */
  def getActivateOnSingleClick(): Boolean =
    gtk_icon_view_get_activate_on_single_click(this.raw.asInstanceOf).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills the bounding rectangle in widget coordinates for the cell specified
    * by
    * @path
    *   and @cell. If @cell is %NULL the main cell area is used.
    *
    * This function is only valid if @icon_view is realized.
    */
  @annotation.compileTimeOnly(
    "Method get_cell_rect contains an OUT parameter, which is not supported yet"
  )
  def getCellRect(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::column-spacing property.
    */
  def getColumnSpacing(): Int = gtk_icon_view_get_column_spacing(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::columns property.
    */
  def getColumns(): Int = gtk_icon_view_get_columns(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills in @path and @cell with the current cursor path and cell. If the
    * cursor isn’t currently set, then *@path will be %NULL. If no cell
    * currently has focus, then *@cell will be %NULL.
    *
    * The returned `GtkTreePath` must be freed with gtk_tree_path_free().
    */
  @annotation.compileTimeOnly(
    "Method get_cursor contains an OUT parameter, which is not supported yet"
  )
  def getCursor(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the destination item for a given position.
    */
  @annotation.compileTimeOnly(
    "Method get_dest_item_at_pos contains an OUT parameter, which is not supported yet"
  )
  def getDestItemAtPos(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets information about the item that is highlighted for feedback.
    */
  @annotation.compileTimeOnly(
    "Method get_drag_dest_item contains an OUT parameter, which is not supported yet"
  )
  def getDragDestItem(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the path and cell for the icon at the given position.
    */
  @annotation.compileTimeOnly(
    "Method get_item_at_pos contains an OUT parameter, which is not supported yet"
  )
  def getItemAtPos(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the column in which the item @path is currently displayed. Column
    * numbers start at 0.
    */
  def getItemColumn(path: Ptr[GtkTreePath]): Int =
    gtk_icon_view_get_item_column(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::item-orientation property which determines
    * whether the labels are drawn beside the icons instead of below.
    */
  def getItemOrientation(): GtkOrientation = gtk_icon_view_get_item_orientation(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::item-padding property.
    */
  def getItemPadding(): Int = gtk_icon_view_get_item_padding(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the row in which the item @path is currently displayed. Row numbers
    * start at 0.
    */
  def getItemRow(path: Ptr[GtkTreePath]): Int =
    gtk_icon_view_get_item_row(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::item-width property.
    */
  def getItemWidth(): Int = gtk_icon_view_get_item_width(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::margin property.
    */
  def getMargin(): Int = gtk_icon_view_get_margin(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column with markup text for @icon_view.
    */
  def getMarkupColumn(): Int = gtk_icon_view_get_markup_column(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model the `GtkIconView` is based on. Returns %NULL if the
    * model is unset.
    */
  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_icon_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the path for the icon at the given position.
    */
  def getPathAtPos(x: Int, y: Int): Ptr[GtkTreePath] =
    gtk_icon_view_get_path_at_pos(this.raw.asInstanceOf, x, y)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column with pixbufs for @icon_view.
    */
  def getPixbufColumn(): Int = gtk_icon_view_get_pixbuf_column(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the user can reorder the list via drag-and-drop. See
    * gtk_icon_view_set_reorderable().
    */
  def getReorderable(): Boolean =
    gtk_icon_view_get_reorderable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::row-spacing property.
    */
  def getRowSpacing(): Int = gtk_icon_view_get_row_spacing(
    this.raw.asInstanceOf
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a list of paths of all selected items. Additionally, if you are
    *  planning on modifying the model after calling this function, you may
    *  want to convert the returned list into a list of `GtkTreeRowReferences`.
    *  To do this, you can use gtk_tree_row_reference_new().
    *
    *  To free the return value, use `g_list_free_full`:
    *  |[<!-- language="C" -->
    *  GtkWidget *icon_view = gtk_icon_view_new ();
    *  // Use icon_view
    *
    *  GList *list = gtk_icon_view_get_selected_items (GTK_ICON_VIEW (icon_view));
    *
    *  // use list
    *
    *  g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
    *  ]|
    */
  def getSelectedItems(): Ptr[GList] = gtk_icon_view_get_selected_items(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selection mode of the @icon_view.
    */
  def getSelectionMode(): GtkSelectionMode = gtk_icon_view_get_selection_mode(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::spacing property.
    */
  def getSpacing(): Int = gtk_icon_view_get_spacing(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column with text for @icon_view.
    */
  def getTextColumn(): Int = gtk_icon_view_get_text_column(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column of @icon_view’s model which is being used for
    * displaying tooltips on @icon_view’s rows.
    */
  def getTooltipColumn(): Int = gtk_icon_view_get_tooltip_column(
    this.raw.asInstanceOf
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  This function is supposed to be used in a `GtkWidget::query-tooltip`
    *  signal handler for `GtkIconView`. The @x, @y and @keyboard_tip values
    *  which are received in the signal handler, should be passed to this
    *  function without modification.
    *
    *  The return value indicates whether there is an icon view item at the given
    *  coordinates (%TRUE) or not (%FALSE) for mouse tooltips. For keyboard
    *  tooltips the item returned will be the cursor item. When %TRUE, then any of
    *  @model, @path and @iter which have been provided will be set to point to
    *  that row and the corresponding model.
    */
  @annotation.compileTimeOnly(
    "Method get_tooltip_context contains an OUT parameter, which is not supported yet"
  )
  def getTooltipContext(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @start_path and @end_path to be the first and last visible path. Note
    * that there may be invisible paths in between.
    *
    * Both paths should be freed with gtk_tree_path_free() after use.
    */
  @annotation.compileTimeOnly(
    "Method get_visible_range contains an OUT parameter, which is not supported yet"
  )
  def getVisibleRange(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Activates the item determined by @path.
    */
  def itemActivated(path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_item_activated(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the icon pointed to by @path is currently selected. If @path
    * does not point to a valid location, %FALSE is returned.
    */
  def pathIsSelected(path: Ptr[GtkTreePath]): Boolean =
    gtk_icon_view_path_is_selected(this.raw.asInstanceOf, path).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the alignments of @icon_view to the position specified by @path.
    * @row_align
    *   determines where the row is placed, and @col_align determines where @column
    *   is placed. Both are expected to be between 0.0 and 1.0. 0.0 means
    *   left/top alignment, 1.0 means right/bottom alignment, 0.5 means center.
    *
    * If @use_align is %FALSE, then the alignment arguments are ignored, and the
    * tree does the minimum amount of work to scroll the item onto the screen.
    * This means that the item will be scrolled to the edge closest to its
    * current position. If the item is currently visible on the screen, nothing
    * is done.
    *
    * This function only works if the model is set, and @path is a valid row on
    * the model. If the model changes before the @icon_view is realized, the
    * centered path will be modified to reflect this change.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects all the icons. @icon_view must has its selection mode set to
    * %GTK_SELECTION_MULTIPLE.
    */
  def selectAll(): Unit = gtk_icon_view_select_all(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the row at @path.
    */
  def selectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_select_path(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls a function for each selected icon. Note that the model or selection
    * cannot be modified from within this function.
    */
  def selectedForeach(func: GtkIconViewForeachFunc, data: Ptr[Byte]): Unit =
    gtk_icon_view_selected_foreach(this.raw.asInstanceOf, func, gpointer(data))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes the `GtkIconView`::item-activated signal to be emitted on a single
    * click instead of a double click.
    */
  def setActivateOnSingleClick(single: Boolean): Unit =
    gtk_icon_view_set_activate_on_single_click(
      this.raw.asInstanceOf,
      gboolean(gint((if single == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::column-spacing property which specifies the space which is
    * inserted between the columns of the icon view.
    */
  def setColumnSpacing(column_spacing: Int): Unit =
    gtk_icon_view_set_column_spacing(this.raw.asInstanceOf, column_spacing)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::columns property which determines in how many columns the icons
    * are arranged. If @columns is -1, the number of columns will be chosen
    * automatically to fill the available area.
    */
  def setColumns(columns: Int): Unit =
    gtk_icon_view_set_columns(this.raw.asInstanceOf, columns)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current keyboard focus to be at @path, and selects it. This is
    * useful when you want to focus the user’s attention on a particular item.
    * If @cell is not %NULL, then focus is given to the cell specified by it.
    * Additionally, if @start_editing is %TRUE, then editing should be started
    * in the specified cell.
    *
    * This function is often followed by `gtk_widget_grab_focus (icon_view)` in
    * order to give keyboard focus to the widget. Please note that editing can
    * only happen when the widget is realized.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the item that is highlighted for feedback.
    */
  def setDragDestItem(
      path: Ptr[GtkTreePath],
      pos: GtkIconViewDropPosition
  ): Unit = gtk_icon_view_set_drag_dest_item(this.raw.asInstanceOf, path, pos)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::item-orientation property which determines whether the labels
    * are drawn beside the icons instead of below.
    */
  def setItemOrientation(orientation: GtkOrientation): Unit =
    gtk_icon_view_set_item_orientation(this.raw.asInstanceOf, orientation)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkIconView`:item-padding property which specifies the padding
    * around each of the icon view’s items.
    */
  def setItemPadding(item_padding: Int): Unit =
    gtk_icon_view_set_item_padding(this.raw.asInstanceOf, item_padding)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::item-width property which specifies the width to use for each
    * item. If it is set to -1, the icon view will automatically determine a
    * suitable item size.
    */
  def setItemWidth(item_width: Int): Unit =
    gtk_icon_view_set_item_width(this.raw.asInstanceOf, item_width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::margin property which specifies the space which is inserted at
    * the top, bottom, left and right of the icon view.
    */
  def setMargin(margin: Int): Unit =
    gtk_icon_view_set_margin(this.raw.asInstanceOf, margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column with markup information for @icon_view to be
    * @column.
    *   The markup column must be of type `G_TYPE_STRING`. If the markup column
    *   is set to something, it overrides the text column set by
    *   gtk_icon_view_set_text_column().
    */
  def setMarkupColumn(column: Int): Unit =
    gtk_icon_view_set_markup_column(this.raw.asInstanceOf, column)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model for a `GtkIconView`. If the @icon_view already has a model
    * set, it will remove it before setting the new model. If @model is %NULL,
    * then it will unset the old model.
    */
  def setModel(model: TreeModel): Unit = gtk_icon_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column with pixbufs for @icon_view to be @column. The pixbuf
    * column must be of type `GDK_TYPE_PIXBUF`
    */
  def setPixbufColumn(column: Int): Unit =
    gtk_icon_view_set_pixbuf_column(this.raw.asInstanceOf, column)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is a convenience function to allow you to reorder models
    * that support the `GtkTreeDragSourceIface` and the `GtkTreeDragDestIface`.
    * Both `GtkTreeStore` and `GtkListStore` support these. If @reorderable is
    * %TRUE, then the user can reorder the model by dragging and dropping rows.
    * The developer can listen to these changes by connecting to the model's
    * row_inserted and row_deleted signals. The reordering is implemented by
    * setting up the icon view as a drag source and destination. Therefore, drag
    * and drop can not be used in a reorderable view for any other purpose.
    *
    * This function does not give you any degree of control over the order --
    * any reordering is allowed. If more control is needed, you should probably
    * handle drag and drop manually.
    */
  def setReorderable(reorderable: Boolean): Unit =
    gtk_icon_view_set_reorderable(
      this.raw.asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::row-spacing property which specifies the space which is
    * inserted between the rows of the icon view.
    */
  def setRowSpacing(row_spacing: Int): Unit =
    gtk_icon_view_set_row_spacing(this.raw.asInstanceOf, row_spacing)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the selection mode of the @icon_view.
    */
  def setSelectionMode(mode: GtkSelectionMode): Unit =
    gtk_icon_view_set_selection_mode(this.raw.asInstanceOf, mode)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::spacing property which specifies the space which is inserted
    * between the cells (i.e. the icon and the text) of an item.
    */
  def setSpacing(spacing: Int): Unit =
    gtk_icon_view_set_spacing(this.raw.asInstanceOf, spacing)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column with text for @icon_view to be @column. The text column
    * must be of type `G_TYPE_STRING`.
    */
  def setTextColumn(column: Int): Unit =
    gtk_icon_view_set_text_column(this.raw.asInstanceOf, column)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tip area of @tooltip to the area which @cell occupies in the item
    * pointed to by @path. See also gtk_tooltip_set_tip_area().
    *
    * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If you only plan to have simple (text-only) tooltips on full items, you
    * can use this function to have `GtkIconView` handle these automatically for
    * you. @column should be set to the column in @icon_view’s model containing
    * the tooltip texts, or -1 to disable this feature.
    *
    * When enabled, `GtkWidget:has-tooltip` will be set to %TRUE and
    * @icon_view
    *   will connect a `GtkWidget::query-tooltip` signal handler.
    *
    * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
    * so &, <, etc have to be escaped in the text.
    */
  def setTooltipColumn(column: Int): Unit =
    gtk_icon_view_set_tooltip_column(this.raw.asInstanceOf, column)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tip area of @tooltip to be the area covered by the item at @path.
    * See also gtk_icon_view_set_tooltip_column() for a simpler alternative. See
    * also gtk_tooltip_set_tip_area().
    */
  def setTooltipItem(tooltip: Tooltip, path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_set_tooltip_item(
      this.raw.asInstanceOf,
      tooltip.getUnsafeRawPointer().asInstanceOf,
      path
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects all the icons.
    */
  def unselectAll(): Unit = gtk_icon_view_unselect_all(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects the row at @path.
    */
  def unselectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_icon_view_unselect_path(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
    * method sets `GtkIconView`:reorderable to %FALSE.
    */
  def unsetModelDragDest(): Unit = gtk_icon_view_unset_model_drag_dest(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling
    * this method sets `GtkIconView`:reorderable to %FALSE.
    */
  def unsetModelDragSource(): Unit = gtk_icon_view_unset_model_drag_source(
    this.raw.asInstanceOf
  )

end IconView

object IconView:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkIconView` widget
    */
  def apply(): IconView = new IconView(gtk_icon_view_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkIconView` widget using the specified @area to layout
    * cells inside the icons.
    */
  def withArea(area: CellArea): IconView = new IconView(
    gtk_icon_view_new_with_area(
      area.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkIconView` widget with the model @model.
    */
  def withModel(model: TreeModel): IconView = new IconView(
    gtk_icon_view_new_with_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end IconView
