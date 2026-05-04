package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  CellArea,
  CellLayout,
  ConstraintTarget,
  Orientation,
  Scrollable,
  SelectionMode,
  TreeModel,
  Widget
}
import sn.gnome.gtk4.internal.GtkIconView

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def createDragIcon__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns @icon_view into a drop destination for automatic DND. Calling this
    * method sets `GtkIconView`:reorderable to %FALSE.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  def enableModelDragDest__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns @icon_view into a drag source for automatic DND. Calling this method
    * sets `GtkIconView`:reorderable to %FALSE.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  def enableModelDragSource__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
    */
  def getActivateOnSingleClick(): Boolean /* None */ =
    gtk_icon_view_get_activate_on_single_click(
      this.raw.asInstanceOf[Ptr[GtkIconView]]
    ).value.!=(0)

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
  def getCellRect__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::column-spacing property.
    */
  def getColumnSpacing(): Int /* None */ = gtk_icon_view_get_column_spacing(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::columns property.
    */
  def getColumns(): Int /* None */ = gtk_icon_view_get_columns(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

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
  def getCursor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the destination item for a given position.
    */
  @annotation.compileTimeOnly(
    "Method get_dest_item_at_pos contains an OUT parameter, which is not supported yet"
  )
  def getDestItemAtPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets information about the item that is highlighted for feedback.
    */
  @annotation.compileTimeOnly(
    "Method get_drag_dest_item contains an OUT parameter, which is not supported yet"
  )
  def getDragDestItem__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the path and cell for the icon at the given position.
    */
  @annotation.compileTimeOnly(
    "Method get_item_at_pos contains an OUT parameter, which is not supported yet"
  )
  def getItemAtPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the column in which the item @path is currently displayed. Column
    * numbers start at 0.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def getItemColumn__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::item-orientation property which determines
    * whether the labels are drawn beside the icons instead of below.
    */
  def getItemOrientation(): Orientation /* None */ = Orientation.fromRaw(
    gtk_icon_view_get_item_orientation(this.raw.asInstanceOf[Ptr[GtkIconView]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::item-padding property.
    */
  def getItemPadding(): Int /* None */ = gtk_icon_view_get_item_padding(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the row in which the item @path is currently displayed. Row numbers
    * start at 0.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def getItemRow__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::item-width property.
    */
  def getItemWidth(): Int /* None */ = gtk_icon_view_get_item_width(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::margin property.
    */
  def getMargin(): Int /* None */ = gtk_icon_view_get_margin(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column with markup text for @icon_view.
    */
  def getMarkupColumn(): Int /* None */ = gtk_icon_view_get_markup_column(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model the `GtkIconView` is based on. Returns %NULL if the
    * model is unset.
    */
  def getModel(): TreeModel /* None */ = new TreeModel.Abstract(
    gtk_icon_view_get_model(
      this.raw.asInstanceOf[Ptr[GtkIconView]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the path for the icon at the given position.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def getPathAtPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column with pixbufs for @icon_view.
    */
  def getPixbufColumn(): Int /* None */ = gtk_icon_view_get_pixbuf_column(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the user can reorder the list via drag-and-drop. See
    * gtk_icon_view_set_reorderable().
    */
  def getReorderable(): Boolean /* None */ = gtk_icon_view_get_reorderable(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::row-spacing property.
    */
  def getRowSpacing(): Int /* None */ = gtk_icon_view_get_row_spacing(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(TreePath))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def getSelectedItems__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selection mode of the @icon_view.
    */
  def getSelectionMode(): SelectionMode /* None */ = SelectionMode.fromRaw(
    gtk_icon_view_get_selection_mode(this.raw.asInstanceOf[Ptr[GtkIconView]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the ::spacing property.
    */
  def getSpacing(): Int /* None */ = gtk_icon_view_get_spacing(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column with text for @icon_view.
    */
  def getTextColumn(): Int /* None */ = gtk_icon_view_get_text_column(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column of @icon_view’s model which is being used for
    * displaying tooltips on @icon_view’s rows.
    */
  def getTooltipColumn(): Int /* None */ = gtk_icon_view_get_tooltip_column(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
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
  def getTooltipContext__ = ???

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
  def getVisibleRange__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Activates the item determined by @path.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def itemActivated__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the icon pointed to by @path is currently selected. If @path
    * does not point to a valid location, %FALSE is returned.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def pathIsSelected__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def scrollToPath__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects all the icons. @icon_view must has its selection mode set to
    * %GTK_SELECTION_MULTIPLE.
    */
  def selectAll(): Unit /* None */ = gtk_icon_view_select_all(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the row at @path.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def selectPath__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls a function for each selected icon. Note that the model or selection
    * cannot be modified from within this function.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(IconViewForeachFunc), @type -> DataRecord(GtkIconViewForeachFunc)))"
  )
  def selectedForeach__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes the `GtkIconView`::item-activated signal to be emitted on a single
    * click instead of a double click.
    */
  def setActivateOnSingleClick(
      single: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_icon_view_set_activate_on_single_click(
    this.raw.asInstanceOf[Ptr[GtkIconView]],
    gboolean(gint((if single == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::column-spacing property which specifies the space which is
    * inserted between the columns of the icon view.
    */
  def setColumnSpacing(column_spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_column_spacing(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      column_spacing
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::columns property which determines in how many columns the icons
    * are arranged. If @columns is -1, the number of columns will be chosen
    * automatically to fill the available area.
    */
  def setColumns(columns: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_columns(this.raw.asInstanceOf[Ptr[GtkIconView]], columns)

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def setCursor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the item that is highlighted for feedback.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def setDragDestItem__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::item-orientation property which determines whether the labels
    * are drawn beside the icons instead of below.
    */
  def setItemOrientation(
      orientation: Orientation /* Some(GtkOrientation) */
  ): Unit /* None */ = gtk_icon_view_set_item_orientation(
    this.raw.asInstanceOf[Ptr[GtkIconView]],
    orientation.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkIconView`:item-padding property which specifies the padding
    * around each of the icon view’s items.
    */
  def setItemPadding(item_padding: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_item_padding(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      item_padding
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::item-width property which specifies the width to use for each
    * item. If it is set to -1, the icon view will automatically determine a
    * suitable item size.
    */
  def setItemWidth(item_width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_item_width(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      item_width
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::margin property which specifies the space which is inserted at
    * the top, bottom, left and right of the icon view.
    */
  def setMargin(margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_margin(this.raw.asInstanceOf[Ptr[GtkIconView]], margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column with markup information for @icon_view to be
    * @column.
    *   The markup column must be of type `G_TYPE_STRING`. If the markup column
    *   is set to something, it overrides the text column set by
    *   gtk_icon_view_set_text_column().
    */
  def setMarkupColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_markup_column(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      column
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model for a `GtkIconView`. If the @icon_view already has a model
    * set, it will remove it before setting the new model. If @model is %NULL,
    * then it will unset the old model.
    */
  def setModel(
      model: Option[TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ = gtk_icon_view_set_model(
    this.raw.asInstanceOf[Ptr[GtkIconView]],
    model
      .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column with pixbufs for @icon_view to be @column. The pixbuf
    * column must be of type `GDK_TYPE_PIXBUF`
    */
  def setPixbufColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_pixbuf_column(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      column
    )

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
  def setReorderable(
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_icon_view_set_reorderable(
    this.raw.asInstanceOf[Ptr[GtkIconView]],
    gboolean(gint((if reorderable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::row-spacing property which specifies the space which is
    * inserted between the rows of the icon view.
    */
  def setRowSpacing(row_spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_row_spacing(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      row_spacing
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the selection mode of the @icon_view.
    */
  def setSelectionMode(
      mode: SelectionMode /* Some(GtkSelectionMode) */
  ): Unit /* None */ = gtk_icon_view_set_selection_mode(
    this.raw.asInstanceOf[Ptr[GtkIconView]],
    mode.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the ::spacing property which specifies the space which is inserted
    * between the cells (i.e. the icon and the text) of an item.
    */
  def setSpacing(spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_spacing(this.raw.asInstanceOf[Ptr[GtkIconView]], spacing)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column with text for @icon_view to be @column. The text column
    * must be of type `G_TYPE_STRING`.
    */
  def setTextColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_text_column(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      column
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tip area of @tooltip to the area which @cell occupies in the item
    * pointed to by @path. See also gtk_tooltip_set_tip_area().
    *
    * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def setTooltipCell__ = ???

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
  def setTooltipColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_icon_view_set_tooltip_column(
      this.raw.asInstanceOf[Ptr[GtkIconView]],
      column
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tip area of @tooltip to be the area covered by the item at @path.
    * See also gtk_icon_view_set_tooltip_column() for a simpler alternative. See
    * also gtk_tooltip_set_tip_area().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def setTooltipItem__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects all the icons.
    */
  def unselectAll(): Unit /* None */ = gtk_icon_view_unselect_all(
    this.raw.asInstanceOf[Ptr[GtkIconView]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects the row at @path.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def unselectPath__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
    * method sets `GtkIconView`:reorderable to %FALSE.
    */
  def unsetModelDragDest(): Unit /* None */ =
    gtk_icon_view_unset_model_drag_dest(this.raw.asInstanceOf[Ptr[GtkIconView]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling
    * this method sets `GtkIconView`:reorderable to %FALSE.
    */
  def unsetModelDragSource(): Unit /* None */ =
    gtk_icon_view_unset_model_drag_source(
      this.raw.asInstanceOf[Ptr[GtkIconView]]
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
  def withArea(area: CellArea /* Some(Ptr[GtkCellArea]) */ ): IconView =
    new IconView(
      gtk_icon_view_new_with_area(
        area.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkIconView` widget with the model @model.
    */
  def withModel(model: TreeModel /* Some(Ptr[GtkTreeModel]) */ ): IconView =
    new IconView(
      gtk_icon_view_new_with_model(
        model.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end IconView
