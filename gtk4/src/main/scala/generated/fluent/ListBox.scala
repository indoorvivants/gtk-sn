package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Adjustment,
  Buildable,
  ConstraintTarget,
  ListBoxRow,
  SelectionMode,
  Widget
}
import sn.gnome.gtk4.internal.GtkListBox

/**  COMMENT FOR THE ORIGINAL C DEFINITION
  *
  *  `GtkListBox` is a vertical list.
  *
  *  A `GtkListBox` only contains `GtkListBoxRow` children. These rows can
  *  by dynamically sorted and filtered, and headers can be added dynamically
  *  depending on the row content. It also allows keyboard and mouse navigation
  *  and selection like a typical list.
  *
  *  Using `GtkListBox` is often an alternative to `GtkTreeView`, especially
  *  when the list contents has a more complicated layout than what is allowed
  *  by a `GtkCellRenderer`, or when the contents is interactive (i.e. has a
  *  button in it).
  *
  *  Although a `GtkListBox` must have only `GtkListBoxRow` children, you can
  *  add any kind of widget to it via [method@Gtk.ListBox.prepend],
  *  [method@Gtk.ListBox.append] and [method@Gtk.ListBox.insert] and a
  *  `GtkListBoxRow` widget will automatically be inserted between the list
  *  and the widget.
  *
  *  `GtkListBoxRows` can be marked as activatable or selectable. If a row is
  *  activatable, [signal@Gtk.ListBox::row-activated] will be emitted for it when
  *  the user tries to activate it. If it is selectable, the row will be marked
  *  as selected when the user tries to select it.
  *
  *  # GtkListBox as GtkBuildable
  *
  *  The `GtkListBox` implementation of the `GtkBuildable` interface supports
  *  setting a child as the placeholder by specifying “placeholder” as the “type”
  *  attribute of a `<child>` element. See [method@Gtk.ListBox.set_placeholder]
  *  for info.
  *
  *  # CSS nodes
  *
  *  |[<!-- language="plain" -->
  *  list[.separators][.rich-list][.navigation-sidebar][.boxed-list]
  *  ╰── row[.activatable]
  *  ]|
  *
  *  `GtkListBox` uses a single CSS node named list. It may carry the .separators
  *  style class, when the [property@Gtk.ListBox:show-separators] property is set.
  *  Each `GtkListBoxRow` uses a single CSS node named row. The row nodes get the
  *  .activatable style class added when appropriate.
  *
  *  It may also carry the .boxed-list style class. In this case, the list will be
  *  automatically surrounded by a frame and have separators.
  *
  *  The main list node may also carry style classes to select
  *  the style of [list presentation](section-list-widget.html#list-styles):
  *  .rich-list, .navigation-sidebar or .data-table.
  *
  *  # Accessibility
  *
  *  `GtkListBox` uses the %GTK_ACCESSIBLE_ROLE_LIST role and `GtkListBoxRow` uses
  *  the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
  */
class ListBox(raw: Ptr[GtkListBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Append a widget to the list.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    */
  def append(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_list_box_append(
      this.raw.asInstanceOf[Ptr[GtkListBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Binds @model to @box.
    *
    * If @box was already bound to a model, that previous binding is destroyed.
    *
    * The contents of @box are cleared and then filled with widgets that
    * represent items from @model. @box is updated whenever @model changes. If @model
    * is %NULL, @box is left empty.
    *
    * It is undefined to add or remove widgets directly (for example, with
    * [method@Gtk.ListBox.insert]) while @box is bound to a model.
    *
    * Note that using a model is incompatible with the filtering and sorting
    * functionality in `GtkListBox`. When using a model, filtering and sorting
    * should be implemented by the model.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxCreateWidgetFunc), @type -> DataRecord(GtkListBoxCreateWidgetFunc)))"
  )
  def bindModel__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add a drag highlight to a row.
    *
    * This is a helper function for implementing DnD onto a `GtkListBox`. The
    * passed in @row will be highlighted by setting the
    * %GTK_STATE_FLAG_DROP_ACTIVE state and any previously highlighted row will
    * be unhighlighted.
    *
    * The row will also be unhighlighted when the widget gets a drag leave
    * event.
    */
  def dragHighlightRow(
      row: ListBoxRow /* Some(Ptr[GtkListBoxRow]) */
  ): Unit /* None */ = gtk_list_box_drag_highlight_row(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    row.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If a row has previously been highlighted via
    * gtk_list_box_drag_highlight_row(), it will have the highlight removed.
    */
  def dragUnhighlightRow(): Unit /* None */ = gtk_list_box_drag_unhighlight_row(
    this.raw.asInstanceOf[Ptr[GtkListBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether rows activate on single clicks.
    */
  def getActivateOnSingleClick(): Boolean /* None */ =
    gtk_list_box_get_activate_on_single_click(
      this.raw.asInstanceOf[Ptr[GtkListBox]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the adjustment (if any) that the widget uses to for vertical
    * scrolling.
    */
  def getAdjustment(): Adjustment /* None */ = new Adjustment(
    gtk_list_box_get_adjustment(
      this.raw.asInstanceOf[Ptr[GtkListBox]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the n-th child in the list (not counting headers).
    *
    * If @index_ is negative or larger than the number of items in the list,
    * %NULL is returned.
    */
  def getRowAtIndex(`index_`: Int /* Some(CInt) */ ): ListBoxRow /* None */ =
    new ListBoxRow(
      gtk_list_box_get_row_at_index(
        this.raw.asInstanceOf[Ptr[GtkListBox]],
        `index_`
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the row at the @y position.
    */
  def getRowAtY(y: Int /* Some(CInt) */ ): ListBoxRow /* None */ =
    new ListBoxRow(
      gtk_list_box_get_row_at_y(
        this.raw.asInstanceOf[Ptr[GtkListBox]],
        y
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selected row, or %NULL if no rows are selected.
    *
    * Note that the box may allow multiple selection, in which case you should
    * use [method@Gtk.ListBox.selected_foreach] to find all selected rows.
    */
  def getSelectedRow(): ListBoxRow /* None */ = new ListBoxRow(
    gtk_list_box_get_selected_row(
      this.raw.asInstanceOf[Ptr[GtkListBox]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a list of all selected children.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ListBoxRow))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def getSelectedRows__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selection mode of the listbox.
    */
  def getSelectionMode(): SelectionMode /* None */ = SelectionMode.fromRaw(
    gtk_list_box_get_selection_mode(this.raw.asInstanceOf[Ptr[GtkListBox]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the list box should show separators between rows.
    */
  def getShowSeparators(): Boolean /* None */ =
    gtk_list_box_get_show_separators(
      this.raw.asInstanceOf[Ptr[GtkListBox]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Insert the @child into the @box at @position.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    *
    * If @position is -1, or larger than the total number of items in the
    * @box,
    *   then the @child will be appended to the end.
    */
  def insert(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_list_box_insert(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    child.getUnsafeRawPointer().asInstanceOf,
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Update the filtering for all rows.
    *
    * Call this when result of the filter function on the @box is changed due to
    * an external factor. For instance, this would be used if the filter
    * function just looked for a specific search string and the entry with the
    * search string has changed.
    */
  def invalidateFilter(): Unit /* None */ = gtk_list_box_invalidate_filter(
    this.raw.asInstanceOf[Ptr[GtkListBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Update the separators for all rows.
    *
    * Call this when result of the header function on the @box is changed due to
    * an external factor.
    */
  def invalidateHeaders(): Unit /* None */ = gtk_list_box_invalidate_headers(
    this.raw.asInstanceOf[Ptr[GtkListBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Update the sorting for all rows.
    *
    * Call this when result of the sort function on the @box is changed due to
    * an external factor.
    */
  def invalidateSort(): Unit /* None */ = gtk_list_box_invalidate_sort(
    this.raw.asInstanceOf[Ptr[GtkListBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prepend a widget to the list.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    */
  def prepend(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_list_box_prepend(
      this.raw.asInstanceOf[Ptr[GtkListBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a child from @box.
    */
  def remove(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_list_box_remove(
      this.raw.asInstanceOf[Ptr[GtkListBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all rows from @box.
    *
    * This function does nothing if @box is backed by a model.
    */
  def removeAll(): Unit /* None */ = gtk_list_box_remove_all(
    this.raw.asInstanceOf[Ptr[GtkListBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select all children of @box, if the selection mode allows it.
    */
  def selectAll(): Unit /* None */ = gtk_list_box_select_all(
    this.raw.asInstanceOf[Ptr[GtkListBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Make @row the currently selected row.
    */
  def selectRow(
      row: Option[ListBoxRow /* Some(Ptr[GtkListBoxRow]) */ ]
  ): Unit /* None */ = gtk_list_box_select_row(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    row
      .map[Ptr[GtkListBoxRow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkListBoxRow]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls a function for each selected child.
    *
    * Note that the selection cannot be modified from within this function.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxForeachFunc), @type -> DataRecord(GtkListBoxForeachFunc)))"
  )
  def selectedForeach__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @single is %TRUE, rows will be activated when you click on them,
    * otherwise you need to double-click.
    */
  def setActivateOnSingleClick(
      single: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_box_set_activate_on_single_click(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    gboolean(gint((if single == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the adjustment (if any) that the widget uses to for vertical
    * scrolling.
    *
    * For instance, this is used to get the page size for PageUp/Down key
    * handling.
    *
    * In the normal case when the @box is packed inside a `GtkScrolledWindow`
    * the adjustment from that will be picked up automatically, so there is no
    * need to manually do that.
    */
  def setAdjustment(
      adjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ]
  ): Unit /* None */ = gtk_list_box_set_adjustment(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    adjustment
      .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * By setting a filter function on the @box one can decide dynamically which
    * of the rows to show.
    *
    * For instance, to implement a search function on a list that filters the
    * original list to only show the matching rows.
    *
    * The @filter_func will be called for each row after the call, and it will
    * continue to be called each time a row changes (via
    * [method@Gtk.ListBoxRow.changed]) or when
    * [method@Gtk.ListBox.invalidate_filter] is called.
    *
    * Note that using a filter function is incompatible with using a model (see
    * [method@Gtk.ListBox.bind_model]).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxFilterFunc), @type -> DataRecord(GtkListBoxFilterFunc)))"
  )
  def setFilterFunc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a header function.
    *
    * By setting a header function on the @box one can dynamically add headers
    * in front of rows, depending on the contents of the row and its position in
    * the list.
    *
    * For instance, one could use it to add headers in front of the first item
    * of a new kind, in a list sorted by the kind.
    *
    * The @update_header can look at the current header widget using
    * [method@Gtk.ListBoxRow.get_header] and either update the state of the
    * widget as needed, or set a new one using
    * [method@Gtk.ListBoxRow.set_header]. If no header is needed, set the header
    * to %NULL.
    *
    * Note that you may get many calls @update_header to this for a particular
    * row when e.g. changing things that don’t affect the header. In this case
    * it is important for performance to not blindly replace an existing header
    * with an identical one.
    *
    * The @update_header function will be called for each row after the call,
    * and it will continue to be called each time a row changes (via
    * [method@Gtk.ListBoxRow.changed]) and when the row before changes (either
    * by [method@Gtk.ListBoxRow.changed] on the previous row, or when the
    * previous row becomes a different row). It is also called for all rows when
    * [method@Gtk.ListBox.invalidate_headers] is called.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxUpdateHeaderFunc), @type -> DataRecord(GtkListBoxUpdateHeaderFunc)))"
  )
  def setHeaderFunc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the placeholder widget that is shown in the list when it doesn't
    * display any visible children.
    */
  def setPlaceholder(
      placeholder: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_list_box_set_placeholder(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    placeholder
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets how selection works in the listbox.
    */
  def setSelectionMode(
      mode: SelectionMode /* Some(GtkSelectionMode) */
  ): Unit /* None */ = gtk_list_box_set_selection_mode(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    mode.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the list box should show separators between rows.
    */
  def setShowSeparators(
      show_separators: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_box_set_show_separators(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    gboolean(gint((if show_separators == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a sort function.
    *
    * By setting a sort function on the @box one can dynamically reorder the
    * rows of the list, based on the contents of the rows.
    *
    * The @sort_func will be called for each row after the call, and will
    * continue to be called each time a row changes (via
    * [method@Gtk.ListBoxRow.changed]) and when
    * [method@Gtk.ListBox.invalidate_sort] is called.
    *
    * Note that using a sort function is incompatible with using a model (see
    * [method@Gtk.ListBox.bind_model]).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxSortFunc), @type -> DataRecord(GtkListBoxSortFunc)))"
  )
  def setSortFunc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselect all children of @box, if the selection mode allows it.
    */
  def unselectAll(): Unit /* None */ = gtk_list_box_unselect_all(
    this.raw.asInstanceOf[Ptr[GtkListBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects a single row of @box, if the selection mode allows it.
    */
  def unselectRow(
      row: ListBoxRow /* Some(Ptr[GtkListBoxRow]) */
  ): Unit /* None */ = gtk_list_box_unselect_row(
    this.raw.asInstanceOf[Ptr[GtkListBox]],
    row.getUnsafeRawPointer().asInstanceOf
  )

end ListBox

object ListBox:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkListBox` container.
    */
  def apply(): ListBox = new ListBox(gtk_list_box_new().asInstanceOf)
end ListBox
