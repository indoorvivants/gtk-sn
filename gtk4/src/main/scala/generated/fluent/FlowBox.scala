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
import sn.gnome.gtk4.fluent.SelectionMode
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFlowBox
import sn.gnome.gtk4.internal.GtkFlowBoxCreateWidgetFunc
import sn.gnome.gtk4.internal.GtkFlowBoxFilterFunc
import sn.gnome.gtk4.internal.GtkFlowBoxForeachFunc
import sn.gnome.gtk4.internal.GtkFlowBoxSortFunc

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkFlowBox` puts child widgets in reflowing grid.
  *
  * For instance, with the horizontal orientation, the widgets will be arranged
  * from left to right, starting a new row under the previous row when
  * necessary. Reducing the width in this case will require more rows, so a
  * larger height will be requested.
  *
  * Likewise, with the vertical orientation, the widgets will be arranged from
  * top to bottom, starting a new column to the right when necessary. Reducing
  * the height will require more columns, so a larger width will be requested.
  *
  * The size request of a `GtkFlowBox` alone may not be what you expect; if you
  * need to be able to shrink it along both axes and dynamically reflow its
  * children, you may have to wrap it in a `GtkScrolledWindow` to enable that.
  *
  * The children of a `GtkFlowBox` can be dynamically sorted and filtered.
  *
  * Although a `GtkFlowBox` must have only `GtkFlowBoxChild` children, you can
  * add any kind of widget to it via [method@Gtk.FlowBox.insert], and a
  * `GtkFlowBoxChild` widget will automatically be inserted between the box and
  * the widget.
  *
  * Also see [class@Gtk.ListBox].
  *
  * # CSS nodes
  *
  * ```
  * flowbox
  * ├── flowboxchild
  * │   ╰── <child>
  * ├── flowboxchild
  * │   ╰── <child>
  * ┊
  * ╰── [rubberband]
  * ```
  *
  * `GtkFlowBox` uses a single CSS node with name flowbox. `GtkFlowBoxChild`
  * uses a single CSS node with name flowboxchild. For rubberband selection, a
  * subnode with name rubberband is used.
  *
  * # Accessibility
  *
  * `GtkFlowBox` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and `GtkFlowBoxChild`
  * uses the %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
  */
class FlowBox(raw: Ptr[GtkFlowBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @child to the end of @self.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    *
    * See also: [method@Gtk.FlowBox.insert].
    */
  def append(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_flow_box_append(
      this.raw.asInstanceOf[Ptr[GtkFlowBox]],
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
    * [method@Gtk.FlowBox.insert]) while @box is bound to a model.
    *
    * Note that using a model is incompatible with the filtering and sorting
    * functionality in `GtkFlowBox`. When using a model, filtering and sorting
    * should be implemented by the model.
    */
  def bindModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ],
      create_widget_func: GtkFlowBoxCreateWidgetFunc /* Some(GtkFlowBoxCreateWidgetFunc) */,
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_data_free_func: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_flow_box_bind_model(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
      ),
    create_widget_func,
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    user_data_free_func
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether children activate on single clicks.
    */
  def getActivateOnSingleClick(): Boolean /* None */ =
    gtk_flow_box_get_activate_on_single_click(
      this.raw.asInstanceOf[Ptr[GtkFlowBox]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the nth child in the @box.
    */
  def getChildAtIndex(idx: Int /* Some(CInt) */ ): FlowBoxChild /* None */ =
    new FlowBoxChild(
      gtk_flow_box_get_child_at_index(
        this.raw.asInstanceOf[Ptr[GtkFlowBox]],
        idx
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child in the (@x, @y) position.
    *
    * Both @x and @y are assumed to be relative to the origin of @box.
    */
  def getChildAtPos(
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  ): FlowBoxChild /* None */ = new FlowBoxChild(
    gtk_flow_box_get_child_at_pos(
      this.raw.asInstanceOf[Ptr[GtkFlowBox]],
      x,
      y
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the horizontal spacing.
    */
  def getColumnSpacing(): UInt /* None */ = gtk_flow_box_get_column_spacing(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the box is homogeneous.
    */
  def getHomogeneous(): Boolean /* None */ = gtk_flow_box_get_homogeneous(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the maximum number of children per line.
    */
  def getMaxChildrenPerLine(): UInt /* None */ =
    gtk_flow_box_get_max_children_per_line(
      this.raw.asInstanceOf[Ptr[GtkFlowBox]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the minimum number of children per line.
    */
  def getMinChildrenPerLine(): UInt /* None */ =
    gtk_flow_box_get_min_children_per_line(
      this.raw.asInstanceOf[Ptr[GtkFlowBox]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the vertical spacing.
    */
  def getRowSpacing(): UInt /* None */ = gtk_flow_box_get_row_spacing(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a list of all selected children.
    */
  def getSelectedChildren(): Ptr[GList] /* None */ =
    gtk_flow_box_get_selected_children(this.raw.asInstanceOf[Ptr[GtkFlowBox]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selection mode of @box.
    */
  def getSelectionMode(): SelectionMode /* None */ = SelectionMode.fromRaw(
    gtk_flow_box_get_selection_mode(this.raw.asInstanceOf[Ptr[GtkFlowBox]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts the @widget into @box at @position.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    *
    * If @position is -1, or larger than the total number of children in the @box,
    * then the @widget will be appended to the end.
    */
  def insert(
      widget: Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_flow_box_insert(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    widget.getUnsafeRawPointer().asInstanceOf,
    position
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Updates the filtering for all children.
    *
    * Call this function when the result of the filter function on the @box is
    * changed due to an external factor. For instance, this would be used if the
    * filter function just looked for a specific search term, and the entry with
    * the string has changed.
    */
  def invalidateFilter(): Unit /* None */ = gtk_flow_box_invalidate_filter(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Updates the sorting for all children.
    *
    * Call this when the result of the sort function on
    * @box
    *   is changed due to an external factor.
    */
  def invalidateSort(): Unit /* None */ = gtk_flow_box_invalidate_sort(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @child to the start of @self.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    *
    * See also: [method@Gtk.FlowBox.insert].
    */
  def prepend(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_flow_box_prepend(
      this.raw.asInstanceOf[Ptr[GtkFlowBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a child from @box.
    */
  def remove(widget: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_flow_box_remove(
      this.raw.asInstanceOf[Ptr[GtkFlowBox]],
      widget.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all children from @box.
    *
    * This function does nothing if @box is backed by a model.
    */
  def removeAll(): Unit /* None */ = gtk_flow_box_remove_all(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select all children of @box, if the selection mode allows it.
    */
  def selectAll(): Unit /* None */ = gtk_flow_box_select_all(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects a single child of @box, if the selection mode allows it.
    */
  def selectChild(
      child: FlowBoxChild /* Some(Ptr[GtkFlowBoxChild]) */
  ): Unit /* None */ = gtk_flow_box_select_child(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls a function for each selected child.
    *
    * Note that the selection cannot be modified from within this function.
    */
  def selectedForeach(
      func: GtkFlowBoxForeachFunc /* Some(GtkFlowBoxForeachFunc) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_flow_box_selected_foreach(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    func,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @single is %TRUE, children will be activated when you click on them,
    * otherwise you need to double-click.
    */
  def setActivateOnSingleClick(
      single: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_flow_box_set_activate_on_single_click(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    gboolean(gint((if single == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the horizontal space to add between children.
    */
  def setColumnSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_flow_box_set_column_spacing(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    guint(spacing)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * By setting a filter function on the @box one can decide dynamically which
    * of the children to show.
    *
    * For instance, to implement a search function that only shows the children
    * matching the search terms.
    *
    * The @filter_func will be called for each child after the call, and it will
    * continue to be called each time a child changes (via
    * [method@Gtk.FlowBoxChild.changed]) or when
    * [method@Gtk.FlowBox.invalidate_filter] is called.
    *
    * Note that using a filter function is incompatible with using a model (see
    * [method@Gtk.FlowBox.bind_model]).
    */
  def setFilterFunc(
      filter_func: Option[
        GtkFlowBoxFilterFunc /* Some(GtkFlowBoxFilterFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_flow_box_set_filter_func(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    filter_func
      .map[GtkFlowBoxFilterFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkFlowBoxFilterFunc]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hooks up an adjustment to focus handling in @box.
    *
    * The adjustment is also used for autoscrolling during rubberband selection.
    * See [method@Gtk.ScrolledWindow.get_hadjustment] for a typical way of
    * obtaining the adjustment, and [method@Gtk.FlowBox.set_vadjustment] for
    * setting the vertical adjustment.
    *
    * The adjustments have to be in pixel units and in the same coordinate
    * system as the allocation for immediate children of the box.
    */
  def setHadjustment(
      adjustment: Adjustment /* Some(Ptr[GtkAdjustment]) */
  ): Unit /* None */ = gtk_flow_box_set_hadjustment(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether or not all children of @box are given equal space in the box.
    */
  def setHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_flow_box_set_homogeneous(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    gboolean(gint((if homogeneous == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum number of children to request and allocate space for in @box’s
    * orientation.
    *
    * Setting the maximum number of children per line limits the overall natural
    * size request to be no more than @n_children children long in the given
    * orientation.
    */
  def setMaxChildrenPerLine(
      n_children: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_flow_box_set_max_children_per_line(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    guint(n_children)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum number of children to line up in @box’s orientation
    * before flowing.
    */
  def setMinChildrenPerLine(
      n_children: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_flow_box_set_min_children_per_line(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    guint(n_children)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the vertical space to add between children.
    */
  def setRowSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_flow_box_set_row_spacing(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    guint(spacing)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets how selection works in @box.
    */
  def setSelectionMode(
      mode: SelectionMode /* Some(GtkSelectionMode) */
  ): Unit /* None */ = gtk_flow_box_set_selection_mode(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    mode.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * By setting a sort function on the @box, one can dynamically reorder the
    * children of the box, based on the contents of the children.
    *
    * The @sort_func will be called for each child after the call, and will
    * continue to be called each time a child changes (via
    * [method@Gtk.FlowBoxChild.changed]) and when
    * [method@Gtk.FlowBox.invalidate_sort] is called.
    *
    * Note that using a sort function is incompatible with using a model (see
    * [method@Gtk.FlowBox.bind_model]).
    */
  def setSortFunc(
      sort_func: Option[GtkFlowBoxSortFunc /* Some(GtkFlowBoxSortFunc) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_flow_box_set_sort_func(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    sort_func
      .map[GtkFlowBoxSortFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkFlowBoxSortFunc]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hooks up an adjustment to focus handling in @box.
    *
    * The adjustment is also used for autoscrolling during rubberband selection.
    * See [method@Gtk.ScrolledWindow.get_vadjustment] for a typical way of
    * obtaining the adjustment, and [method@Gtk.FlowBox.set_hadjustment] for
    * setting the horizontal adjustment.
    *
    * The adjustments have to be in pixel units and in the same coordinate
    * system as the allocation for immediate children of the box.
    */
  def setVadjustment(
      adjustment: Adjustment /* Some(Ptr[GtkAdjustment]) */
  ): Unit /* None */ = gtk_flow_box_set_vadjustment(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselect all children of @box, if the selection mode allows it.
    */
  def unselectAll(): Unit /* None */ = gtk_flow_box_unselect_all(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects a single child of @box, if the selection mode allows it.
    */
  def unselectChild(
      child: FlowBoxChild /* Some(Ptr[GtkFlowBoxChild]) */
  ): Unit /* None */ = gtk_flow_box_unselect_child(
    this.raw.asInstanceOf[Ptr[GtkFlowBox]],
    child.getUnsafeRawPointer().asInstanceOf
  )

end FlowBox

object FlowBox:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkFlowBox`.
    */
  def apply(): FlowBox = new FlowBox(gtk_flow_box_new().asInstanceOf)
end FlowBox
