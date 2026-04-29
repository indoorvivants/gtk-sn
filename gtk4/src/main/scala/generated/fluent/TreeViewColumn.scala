package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSortType
import sn.gnome.gtk4.internal.GtkTreeCellDataFunc
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreeViewColumn
import sn.gnome.gtk4.internal.GtkTreeViewColumnSizing

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A visible column in a [class@Gtk.TreeView] widget
  *
  * The `GtkTreeViewColumn` object represents a visible column in a
  * `GtkTreeView` widget. It allows to set properties of the column header, and
  * functions as a holding pen for the cell renderers which determine how the
  * data in the column is displayed.
  *
  * Please refer to the [tree widget conceptual
  * overview](section-tree-widget.html) for an overview of all the objects and
  * data types related to the tree widget and how they work together, and to the
  * [class@Gtk.TreeView] documentation for specifics about the CSS node
  * structure for treeviews and their headers.
  */
class TreeViewColumn(raw: Ptr[GtkTreeViewColumn])
    extends InitiallyUnowned(raw.asInstanceOf),
      Buildable,
      CellLayout:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds an attribute mapping to the list in @tree_column.
    *
    * The @column is the column of the model to get a value from, and the @attribute
    * is the parameter on @cell_renderer to be set from the value. So for
    * example if column 2 of the model contains strings, you could have the
    * “text” attribute of a `GtkCellRendererText` get its values from column 2.
    */
  def addAttribute(
      cell_renderer: CellRenderer,
      attribute: String | CString,
      column: Int
  )(using Zone): Unit = gtk_tree_view_column_add_attribute(
    this.raw.asInstanceOf,
    cell_renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute),
    column
  )

  @annotation.compileTimeOnly(
    "Method cell_get_position contains an OUT parameter, which is not supported yet"
  )
  def cellGetPosition() = ???

  @annotation.compileTimeOnly(
    "Method cell_get_size contains an OUT parameter, which is not supported yet"
  )
  def cellGetSize() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if any of the cells packed into the @tree_column are
    * visible. For this to be meaningful, you must first initialize the cells
    * with gtk_tree_view_column_cell_set_cell_data()
    */
  def cellIsVisible(): Boolean =
    gtk_tree_view_column_cell_is_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the cell renderer based on the @tree_model and @iter. That is, for
    * every attribute mapping in @tree_column, it will get a value from the set
    * column on the @iter, and use that value to set the attribute on the cell
    * renderer. This is used primarily by the `GtkTreeView`.
    */
  def cellSetCellData(
      tree_model: TreeModel,
      iter: Ptr[GtkTreeIter],
      is_expander: Boolean,
      is_expanded: Boolean
  ): Unit = gtk_tree_view_column_cell_set_cell_data(
    this.raw.asInstanceOf,
    tree_model.getUnsafeRawPointer().asInstanceOf,
    iter,
    gboolean(gint((if is_expander == true then 1 else 0))),
    gboolean(gint((if is_expanded == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unsets all the mappings on all renderers on the @tree_column.
    */
  def clear(): Unit = gtk_tree_view_column_clear(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears all existing attributes previously set with
    * gtk_tree_view_column_set_attributes().
    */
  def clearAttributes(cell_renderer: CellRenderer): Unit =
    gtk_tree_view_column_clear_attributes(
      this.raw.asInstanceOf,
      cell_renderer.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the “clicked” signal on the column. This function will only work if
    * @tree_column
    *   is clickable.
    */
  def clicked(): Unit = gtk_tree_view_column_clicked(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current keyboard focus to be at @cell, if the column contains 2
    * or more editable and activatable cells.
    */
  def focusCell(cell: CellRenderer): Unit = gtk_tree_view_column_focus_cell(
    this.raw.asInstanceOf,
    cell.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current x alignment of @tree_column. This value can range
    * between 0.0 and 1.0.
    */
  def getAlignment(): Float = gtk_tree_view_column_get_alignment(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the button used in the treeview column header
    */
  def getButton(): Widget = new Widget(
    gtk_tree_view_column_get_button(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the user can click on the header for the column.
    */
  def getClickable(): Boolean =
    gtk_tree_view_column_get_clickable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the column expands to fill available space.
    */
  def getExpand(): Boolean =
    gtk_tree_view_column_get_expand(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the fixed width of the column. This may not be the actual displayed
    * width of the column; for that, use gtk_tree_view_column_get_width().
    */
  def getFixedWidth(): Int = gtk_tree_view_column_get_fixed_width(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the maximum width in pixels of the @tree_column, or -1 if no
    * maximum width is set.
    */
  def getMaxWidth(): Int = gtk_tree_view_column_get_max_width(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the minimum width in pixels of the @tree_column, or -1 if no
    * minimum width is set.
    */
  def getMinWidth(): Int = gtk_tree_view_column_get_min_width(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the @tree_column can be reordered by the user.
    */
  def getReorderable(): Boolean =
    gtk_tree_view_column_get_reorderable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the @tree_column can be resized by the end user.
    */
  def getResizable(): Boolean =
    gtk_tree_view_column_get_resizable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current type of @tree_column.
    */
  def getSizing(): GtkTreeViewColumnSizing = gtk_tree_view_column_get_sizing(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the logical @sort_column_id that the model sorts on when this column
    * is selected for sorting.
    *
    * See [method@Gtk.TreeViewColumn.set_sort_column_id].
    */
  def getSortColumnId(): Int = gtk_tree_view_column_get_sort_column_id(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_tree_view_column_set_sort_indicator().
    */
  def getSortIndicator(): Boolean =
    gtk_tree_view_column_get_sort_indicator(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_tree_view_column_set_sort_order().
    */
  def getSortOrder(): GtkSortType = gtk_tree_view_column_get_sort_order(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the spacing of @tree_column.
    */
  def getSpacing(): Int = gtk_tree_view_column_get_spacing(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the title of the widget.
    */
  def getTitle()(using Zone): String = fromCString(
    gtk_tree_view_column_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkTreeView` wherein @tree_column has been inserted. If @column
    * is currently not inserted in any tree view, %NULL is returned.
    */
  def getTreeView(): Widget = new Widget(
    gtk_tree_view_column_get_tree_view(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if @tree_column is visible.
    */
  def getVisible(): Boolean =
    gtk_tree_view_column_get_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkWidget` in the button on the column header.
    *
    * If a custom widget has not been set then %NULL is returned.
    */
  def getWidget(): Widget = new Widget(
    gtk_tree_view_column_get_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current size of @tree_column in pixels.
    */
  def getWidth(): Int = gtk_tree_view_column_get_width(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current X offset of @tree_column in pixels.
    */
  def getXOffset(): Int = gtk_tree_view_column_get_x_offset(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds the @cell to end of the column. If @expand is %FALSE, then the @cell
    * is allocated no more space than it needs. Any unused space is divided
    * evenly between cells for which @expand is %TRUE.
    */
  def packEnd(cell: CellRenderer, expand: Boolean): Unit =
    gtk_tree_view_column_pack_end(
      this.raw.asInstanceOf,
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Packs the @cell into the beginning of the column. If @expand is %FALSE,
    * then the @cell is allocated no more space than it needs. Any unused space
    * is divided evenly between cells for which @expand is %TRUE.
    */
  def packStart(cell: CellRenderer, expand: Boolean): Unit =
    gtk_tree_view_column_pack_start(
      this.raw.asInstanceOf,
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags the column, and the cell renderers added to this column, to have
    * their sizes renegotiated.
    */
  def queueResize(): Unit = gtk_tree_view_column_queue_resize(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the alignment of the title or custom widget inside the column header.
    * The alignment determines its location inside the button -- 0.0 for left,
    * 0.5 for center, 1.0 for right.
    */
  def setAlignment(xalign: Float): Unit = gtk_tree_view_column_set_alignment(
    this.raw.asInstanceOf,
    xalign.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the attributes in the list as the attributes of @tree_column.
    *
    * The attributes should be in attribute/column order, as in
    * gtk_tree_view_column_add_attribute(). All existing attributes are removed,
    * and replaced with the new attributes.
    */
  inline def setAttributes(cell_renderer: CellRenderer, args: Any*): Unit =
    gtk_tree_view_column_set_attributes(
      this.raw.asInstanceOf,
      cell_renderer.getUnsafeRawPointer().asInstanceOf,
      args*
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkTreeCellDataFunc` to use for the column.
    *
    * This function is used instead of the standard attributes mapping for
    * setting the column value, and should set the value of @tree_column's cell
    * renderer as appropriate. @func may be %NULL to remove an older one.
    */
  def setCellDataFunc(
      cell_renderer: CellRenderer,
      func: GtkTreeCellDataFunc,
      func_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_tree_view_column_set_cell_data_func(
    this.raw.asInstanceOf,
    cell_renderer.getUnsafeRawPointer().asInstanceOf,
    func,
    gpointer(func_data),
    destroy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the header to be active if @clickable is %TRUE. When the header is
    * active, then it can take keyboard focus, and can be clicked.
    */
  def setClickable(clickable: Boolean): Unit =
    gtk_tree_view_column_set_clickable(
      this.raw.asInstanceOf,
      gboolean(gint((if clickable == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column to take available extra space. This space is shared
    * equally amongst all columns that have the expand set to %TRUE. If no
    * column has this option set, then the last column gets all extra space. By
    * default, every column is created with this %FALSE.
    *
    * Along with “fixed-width”, the “expand” property changes when the column is
    * resized by the user.
    */
  def setExpand(expand: Boolean): Unit = gtk_tree_view_column_set_expand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @fixed_width is not -1, sets the fixed width of @tree_column; otherwise
    * unsets it. The effective value of @fixed_width is clamped between the
    * minimum and maximum width of the column; however, the value stored in the
    * “fixed-width” property is not clamped. If the column sizing is
    * %GTK_TREE_VIEW_COLUMN_GROW_ONLY or %GTK_TREE_VIEW_COLUMN_AUTOSIZE, setting
    * a fixed width overrides the automatically calculated width. Note that
    * @fixed_width
    *   is only a hint to GTK; the width actually allocated to the column may be
    *   greater or less than requested.
    *
    * Along with “expand”, the “fixed-width” property changes when the column is
    * resized by the user.
    */
  def setFixedWidth(fixed_width: Int): Unit =
    gtk_tree_view_column_set_fixed_width(this.raw.asInstanceOf, fixed_width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum width of the @tree_column. If @max_width is -1, then the
    * maximum width is unset. Note, the column can actually be wider than max
    * width if it’s the last column in a view. In this case, the column expands
    * to fill any extra space.
    */
  def setMaxWidth(max_width: Int): Unit =
    gtk_tree_view_column_set_max_width(this.raw.asInstanceOf, max_width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum width of the @tree_column. If @min_width is -1, then the
    * minimum width is unset.
    */
  def setMinWidth(min_width: Int): Unit =
    gtk_tree_view_column_set_min_width(this.raw.asInstanceOf, min_width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @reorderable is %TRUE, then the column can be reordered by the end user
    * dragging the header.
    */
  def setReorderable(reorderable: Boolean): Unit =
    gtk_tree_view_column_set_reorderable(
      this.raw.asInstanceOf,
      gboolean(gint((if reorderable == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @resizable is %TRUE, then the user can explicitly resize the column by
    * grabbing the outer edge of the column button.
    *
    * If resizable is %TRUE and sizing mode of the column is
    * %GTK_TREE_VIEW_COLUMN_AUTOSIZE, then the sizing mode is changed to
    * %GTK_TREE_VIEW_COLUMN_GROW_ONLY.
    */
  def setResizable(resizable: Boolean): Unit =
    gtk_tree_view_column_set_resizable(
      this.raw.asInstanceOf,
      gboolean(gint((if resizable == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the growth behavior of @tree_column to @type.
    */
  def setSizing(`type`: GtkTreeViewColumnSizing): Unit =
    gtk_tree_view_column_set_sizing(this.raw.asInstanceOf, `type`)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the logical @sort_column_id that this column sorts on when this
    * column is selected for sorting. Doing so makes the column header
    * clickable.
    */
  def setSortColumnId(sort_column_id: Int): Unit =
    gtk_tree_view_column_set_sort_column_id(
      this.raw.asInstanceOf,
      sort_column_id
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Call this function with a @setting of %TRUE to display an arrow in the
    * header button indicating the column is sorted. Call
    * gtk_tree_view_column_set_sort_order() to change the direction of the
    * arrow.
    */
  def setSortIndicator(setting: Boolean): Unit =
    gtk_tree_view_column_set_sort_indicator(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the appearance of the sort indicator.
    *
    * This does not actually sort the model. Use
    * gtk_tree_view_column_set_sort_column_id() if you want automatic sorting
    * support. This function is primarily for custom sorting behavior, and
    * should be used in conjunction with gtk_tree_sortable_set_sort_column_id()
    * to do that. For custom models, the mechanism will vary.
    *
    * The sort indicator changes direction to indicate normal sort or reverse
    * sort. Note that you must have the sort indicator enabled to see anything
    * when calling this function; see gtk_tree_view_column_set_sort_indicator().
    */
  def setSortOrder(order: GtkSortType): Unit =
    gtk_tree_view_column_set_sort_order(this.raw.asInstanceOf, order)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the spacing field of @tree_column, which is the number of pixels to
    * place between cell renderers packed into it.
    */
  def setSpacing(spacing: Int): Unit =
    gtk_tree_view_column_set_spacing(this.raw.asInstanceOf, spacing)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title of the @tree_column. If a custom widget has been set, then
    * this value is ignored.
    */
  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_tree_view_column_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(title)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the visibility of @tree_column.
    */
  def setVisible(visible: Boolean): Unit = gtk_tree_view_column_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the widget in the header to be @widget. If widget is %NULL, then the
    * header button is set with a `GtkLabel` set to the title of @tree_column.
    */
  def setWidget(widget: Widget): Unit = gtk_tree_view_column_set_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TreeViewColumn

object TreeViewColumn:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTreeViewColumn`.
    */
  def apply(): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_column_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTreeViewColumn` using @area to render its cells.
    */
  def withArea(area: CellArea): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_column_new_with_area(
      area.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a new `GtkTreeViewColumn` with a number of default values.
    *  This is equivalent to calling gtk_tree_view_column_set_title(),
    *  gtk_tree_view_column_pack_start(), and
    *  gtk_tree_view_column_set_attributes() on the newly created `GtkTreeViewColumn`.
    *
    *  Here’s a simple example:
    *  |[<!-- language="C" -->
    *   enum { TEXT_COLUMN, COLOR_COLUMN, N_COLUMNS };
    *   // ...
    *   {
    *     GtkTreeViewColumn *column;
    *     GtkCellRenderer   *renderer = gtk_cell_renderer_text_new ();
    *
    *     column = gtk_tree_view_column_new_with_attributes ("Title",
    *                                                        renderer,
    *                                                        "text", TEXT_COLUMN,
    *                                                        "foreground", COLOR_COLUMN,
    *                                                        NULL);
    *   }
    *  ]|
    */
  inline def withAttributes(
      title: String | CString,
      cell: CellRenderer,
      args: Any*
  )(using Zone): TreeViewColumn = new TreeViewColumn(
    gtk_tree_view_column_new_with_attributes(
      __sn_extract_string(title),
      cell.getUnsafeRawPointer().asInstanceOf,
      args*
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TreeViewColumn
