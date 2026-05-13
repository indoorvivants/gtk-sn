package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Buildable,
  CellArea,
  CellLayout,
  CellRenderer,
  SortType,
  TreeViewColumnSizing,
  Widget
}
import sn.gnome.gtk4.internal.GtkTreeViewColumn
import sn.gnome.runtime.*

/** A visible column in a [class@Gtk.TreeView] widget
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeViewColumn private[gnome] (raw: Ptr[GtkTreeViewColumn])
    extends InitiallyUnowned(raw.asInstanceOf),
      Buildable,
      CellLayout:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds an attribute mapping to the list in @tree_column.
    *
    * The @column is the column of the model to get a value from, and the @attribute
    * is the parameter on @cell_renderer to be set from the value. So for
    * example if column 2 of the model contains strings, you could have the
    * “text” attribute of a `GtkCellRendererText` get its values from column 2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def addAttribute(
      cell_renderer: sn.gnome.gtk4.fluent.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      attribute: String /* Some(CString) */,
      column: Int /* Some(CInt) */
  )(using Zone, Runtime): Unit /* None */ =
    gtk_tree_view_column_add_attribute(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      cell_renderer.getUnsafeRawPointer().asInstanceOf,
      toCString(attribute),
      column
    )
  end addAttribute

  /** Obtains the horizontal position and size of a cell in a column.
    *
    * If the cell is not found in the column, @start_pos and @width are not
    * changed and %FALSE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method cell_get_position]: Method cell_get_position contains an OUT parameter, which is not supported yet"
  )
  private def cellGetPosition__ = ???

  /** Obtains the width and height needed to render the column. This is used
    * primarily by the `GtkTreeView`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method cell_get_size]: Method cell_get_size contains an OUT parameter, which is not supported yet"
  )
  private def cellGetSize__ = ???

  /** Returns %TRUE if any of the cells packed into the @tree_column are
    * visible. For this to be meaningful, you must first initialize the cells
    * with gtk_tree_view_column_cell_set_cell_data()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cellIsVisible(): Boolean /* None */ =
    gtk_tree_view_column_cell_is_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    ).value.!=(0)
  end cellIsVisible

  /** Sets the cell renderer based on the @tree_model and @iter. That is, for
    * every attribute mapping in @tree_column, it will get a value from the set
    * column on the @iter, and use that value to set the attribute on the cell
    * renderer. This is used primarily by the `GtkTreeView`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method cell_set_cell_data/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def cellSetCellData__ = ???

  /** Unsets all the mappings on all renderers on the @tree_column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def clear(): Unit /* None */ =
    gtk_tree_view_column_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end clear

  /** Clears all existing attributes previously set with
    * gtk_tree_view_column_set_attributes().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def clearAttributes(
      cell_renderer: sn.gnome.gtk4.fluent.CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  )(using Runtime): Unit /* None */ =
    gtk_tree_view_column_clear_attributes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      cell_renderer.getUnsafeRawPointer().asInstanceOf
    )
  end clearAttributes

  /** Emits the “clicked” signal on the column. This function will only work if
    * @tree_column
    *   is clickable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clicked(): Unit /* None */ =
    gtk_tree_view_column_clicked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end clicked

  /** Sets the current keyboard focus to be at @cell, if the column contains 2
    * or more editable and activatable cells.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def focusCell(
      cell: sn.gnome.gtk4.fluent.CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  )(using Runtime): Unit /* None */ =
    gtk_tree_view_column_focus_cell(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      cell.getUnsafeRawPointer().asInstanceOf
    )
  end focusCell

  /** Returns the current x alignment of @tree_column. This value can range
    * between 0.0 and 1.0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAlignment(): Float /* None */ =
    gtk_tree_view_column_get_alignment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getAlignment

  /** Returns the button used in the treeview column header
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getButton()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_tree_view_column_get_button(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
      ).asInstanceOf
    )
  end getButton

  /** Returns %TRUE if the user can click on the header for the column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClickable(): Boolean /* None */ =
    gtk_tree_view_column_get_clickable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    ).value.!=(0)
  end getClickable

  /** Returns %TRUE if the column expands to fill available space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpand(): Boolean /* None */ =
    gtk_tree_view_column_get_expand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    ).value.!=(0)
  end getExpand

  /** Gets the fixed width of the column. This may not be the actual displayed
    * width of the column; for that, use gtk_tree_view_column_get_width().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFixedWidth(): Int /* None */ =
    gtk_tree_view_column_get_fixed_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getFixedWidth

  /** Returns the maximum width in pixels of the @tree_column, or -1 if no
    * maximum width is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxWidth(): Int /* None */ =
    gtk_tree_view_column_get_max_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getMaxWidth

  /** Returns the minimum width in pixels of the @tree_column, or -1 if no
    * minimum width is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinWidth(): Int /* None */ =
    gtk_tree_view_column_get_min_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getMinWidth

  /** Returns %TRUE if the @tree_column can be reordered by the user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getReorderable(): Boolean /* None */ =
    gtk_tree_view_column_get_reorderable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    ).value.!=(0)
  end getReorderable

  /** Returns %TRUE if the @tree_column can be resized by the end user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResizable(): Boolean /* None */ =
    gtk_tree_view_column_get_resizable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    ).value.!=(0)
  end getResizable

  /** Returns the current type of @tree_column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSizing(): TreeViewColumnSizing /* None */ =
    TreeViewColumnSizing.fromRaw(
      gtk_tree_view_column_get_sizing(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
      )
    )
  end getSizing

  /** Gets the logical @sort_column_id that the model sorts on when this column
    * is selected for sorting.
    *
    * See [method@Gtk.TreeViewColumn.set_sort_column_id].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortColumnId(): Int /* None */ =
    gtk_tree_view_column_get_sort_column_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getSortColumnId

  /** Gets the value set by gtk_tree_view_column_set_sort_indicator().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortIndicator(): Boolean /* None */ =
    gtk_tree_view_column_get_sort_indicator(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    ).value.!=(0)
  end getSortIndicator

  /** Gets the value set by gtk_tree_view_column_set_sort_order().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortOrder(): SortType /* None */ =
    SortType.fromRaw(
      gtk_tree_view_column_get_sort_order(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
      )
    )
  end getSortOrder

  /** Returns the spacing of @tree_column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpacing(): Int /* None */ =
    gtk_tree_view_column_get_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getSpacing

  /** Returns the title of the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ =
    fromCString(
      gtk_tree_view_column_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
      ).asInstanceOf
    )
  end getTitle

  /** Returns the `GtkTreeView` wherein @tree_column has been inserted. If @column
    * is currently not inserted in any tree view, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTreeView()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_tree_view_column_get_tree_view(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
      ).asInstanceOf
    )
  end getTreeView

  /** Returns %TRUE if @tree_column is visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ =
    gtk_tree_view_column_get_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    ).value.!=(0)
  end getVisible

  /** Returns the `GtkWidget` in the button on the column header.
    *
    * If a custom widget has not been set then %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_tree_view_column_get_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
      ).asInstanceOf
    )
  end getWidget

  /** Returns the current size of @tree_column in pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ =
    gtk_tree_view_column_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getWidth

  /** Returns the current X offset of @tree_column in pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getXOffset(): Int /* None */ =
    gtk_tree_view_column_get_x_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end getXOffset

  /** Adds the @cell to end of the column. If @expand is %FALSE, then the @cell
    * is allocated no more space than it needs. Any unused space is divided
    * evenly between cells for which @expand is %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def packEnd(
      cell: sn.gnome.gtk4.fluent.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_tree_view_column_pack_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end packEnd

  /** Packs the @cell into the beginning of the column. If @expand is %FALSE,
    * then the @cell is allocated no more space than it needs. Any unused space
    * is divided evenly between cells for which @expand is %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def packStart(
      cell: sn.gnome.gtk4.fluent.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_tree_view_column_pack_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      cell.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end packStart

  /** Flags the column, and the cell renderers added to this column, to have
    * their sizes renegotiated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queueResize(): Unit /* None */ =
    gtk_tree_view_column_queue_resize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]]
    )
  end queueResize

  /** Sets the alignment of the title or custom widget inside the column header.
    * The alignment determines its location inside the button -- 0.0 for left,
    * 0.5 for center, 1.0 for right.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAlignment(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_tree_view_column_set_alignment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      xalign.asInstanceOf
    )
  end setAlignment

  /** Sets the attributes in the list as the attributes of @tree_column.
    *
    * The attributes should be in attribute/column order, as in
    * gtk_tree_view_column_add_attribute(). All existing attributes are removed,
    * and replaced with the new attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def setAttributes__ = ???

  /** Sets the `GtkTreeCellDataFunc` to use for the column.
    *
    * This function is used instead of the standard attributes mapping for
    * setting the column value, and should set the value of @tree_column's cell
    * renderer as appropriate. @func may be %NULL to remove an older one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_cell_data_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeCellDataFunc), @type -> DataRecord(GtkTreeCellDataFunc)))"
  )
  private def setCellDataFunc__ = ???

  /** Sets the header to be active if @clickable is %TRUE. When the header is
    * active, then it can take keyboard focus, and can be clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setClickable(
      clickable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_tree_view_column_set_clickable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      gboolean(gint((if clickable == true then 1 else 0)))
    )
  end setClickable

  /** Sets the column to take available extra space. This space is shared
    * equally amongst all columns that have the expand set to %TRUE. If no
    * column has this option set, then the last column gets all extra space. By
    * default, every column is created with this %FALSE.
    *
    * Along with “fixed-width”, the “expand” property changes when the column is
    * resized by the user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpand(
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_tree_view_column_set_expand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end setExpand

  /** If @fixed_width is not -1, sets the fixed width of @tree_column; otherwise
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFixedWidth(fixed_width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_column_set_fixed_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      fixed_width
    )
  end setFixedWidth

  /** Sets the maximum width of the @tree_column. If @max_width is -1, then the
    * maximum width is unset. Note, the column can actually be wider than max
    * width if it’s the last column in a view. In this case, the column expands
    * to fill any extra space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxWidth(max_width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_column_set_max_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      max_width
    )
  end setMaxWidth

  /** Sets the minimum width of the @tree_column. If @min_width is -1, then the
    * minimum width is unset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinWidth(min_width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_column_set_min_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      min_width
    )
  end setMinWidth

  /** If @reorderable is %TRUE, then the column can be reordered by the end user
    * dragging the header.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setReorderable(
      reorderable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_tree_view_column_set_reorderable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      gboolean(gint((if reorderable == true then 1 else 0)))
    )
  end setReorderable

  /** If @resizable is %TRUE, then the user can explicitly resize the column by
    * grabbing the outer edge of the column button.
    *
    * If resizable is %TRUE and sizing mode of the column is
    * %GTK_TREE_VIEW_COLUMN_AUTOSIZE, then the sizing mode is changed to
    * %GTK_TREE_VIEW_COLUMN_GROW_ONLY.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResizable(
      resizable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_tree_view_column_set_resizable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      gboolean(gint((if resizable == true then 1 else 0)))
    )
  end setResizable

  /** Sets the growth behavior of @tree_column to @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSizing(
      `type`: TreeViewColumnSizing /* Some(GtkTreeViewColumnSizing) */
  ): Unit /* None */ =
    gtk_tree_view_column_set_sizing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      `type`.raw
    )
  end setSizing

  /** Sets the logical @sort_column_id that this column sorts on when this
    * column is selected for sorting. Doing so makes the column header
    * clickable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortColumnId(sort_column_id: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_column_set_sort_column_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      sort_column_id
    )
  end setSortColumnId

  /** Call this function with a @setting of %TRUE to display an arrow in the
    * header button indicating the column is sorted. Call
    * gtk_tree_view_column_set_sort_order() to change the direction of the
    * arrow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortIndicator(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_tree_view_column_set_sort_indicator(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setSortIndicator

  /** Changes the appearance of the sort indicator.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortOrder(order: SortType /* Some(GtkSortType) */ ): Unit /* None */ =
    gtk_tree_view_column_set_sort_order(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      order.raw
    )
  end setSortOrder

  /** Sets the spacing field of @tree_column, which is the number of pixels to
    * place between cell renderers packed into it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSpacing(spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_view_column_set_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      spacing
    )
  end setSpacing

  /** Sets the title of the @tree_column. If a custom widget has been set, then
    * this value is ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_tree_view_column_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      toCString(title)
    )
  end setTitle

  /** Sets the visibility of @tree_column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_tree_view_column_set_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      gboolean(gint((if visible == true then 1 else 0)))
    )
  end setVisible

  /** Sets the widget in the header to be @widget. If widget is %NULL, then the
    * header button is set with a `GtkLabel` set to the title of @tree_column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWidget(
      widget: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_tree_view_column_set_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeViewColumn]],
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setWidget

  /** Emitted when the column's header has been clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClicked(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeViewColumn],
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
    val signal = c"clicked"
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
  end onClicked
end TreeViewColumn

object TreeViewColumn:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTreeViewColumn])(using Runtime) =
    summon[Runtime].getOrCreate[TreeViewColumn](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TreeViewColumn(ptr)
    )

  /** Creates a new `GtkTreeViewColumn`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): TreeViewColumn =
    val raw: Ptr[Byte] = gtk_tree_view_column_new().asInstanceOf
    summon[Runtime].getOrCreate[TreeViewColumn](
      raw,
      r => TreeViewColumn.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new `GtkTreeViewColumn` using @area to render its cells.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withArea(
      area: sn.gnome.gtk4.fluent.CellArea /* Some(Ptr[GtkCellArea]) */
  )(using Runtime): TreeViewColumn =
    val raw: Ptr[Byte] = gtk_tree_view_column_new_with_area(
      area.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[TreeViewColumn](
      raw,
      r => TreeViewColumn.applyUnsafe(r.asInstanceOf)
    )
  end withArea

  /**  Creates a new `GtkTreeViewColumn` with a number of default values.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  inline def withAttributes(
      title: String /* Some(CString) */,
      cell: sn.gnome.gtk4.fluent.CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      args: Any*
  )(using Zone, Runtime): TreeViewColumn =
    val raw: Ptr[Byte] = gtk_tree_view_column_new_with_attributes(
      toCString(title),
      cell.getUnsafeRawPointer().asInstanceOf,
      args*
    ).asInstanceOf
    summon[Runtime].getOrCreate[TreeViewColumn](
      raw,
      r => TreeViewColumn.applyUnsafe(r.asInstanceOf)
    )
  end withAttributes
end TreeViewColumn
