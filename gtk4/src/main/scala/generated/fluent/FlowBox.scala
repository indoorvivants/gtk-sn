package sn.gnome.gtk4

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
import sn.gnome.gtk4.{
  Accessible,
  Adjustment,
  Buildable,
  ConstraintTarget,
  FlowBoxChild,
  MovementStep,
  Orientable,
  SelectionMode,
  Widget
}
import sn.gnome.gtk4.internal.{GtkFlowBox, GtkFlowBoxChild, GtkMovementStep}
import sn.gnome.runtime.*

/** A `GtkFlowBox` puts child widgets in reflowing grid.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FlowBox private[gnome] (raw: Ptr[GtkFlowBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds @child to the end of @self.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    *
    * See also: [method@Gtk.FlowBox.insert].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_append(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end append

  /** Binds @model to @box.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method bind_model/<method parameters>/create_widget_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxCreateWidgetFunc), @type -> DataRecord(GtkFlowBoxCreateWidgetFunc)))"
  )
  private def bindModel__ = ???

  /** Returns whether children activate on single clicks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivateOnSingleClick(): Boolean /* None */ =
    gtk_flow_box_get_activate_on_single_click(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    ).value.!=(0)
  end getActivateOnSingleClick

  /** Gets the nth child in the @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildAtIndex(
      idx: Int /* Some(CInt) */
  )(using Runtime): sn.gnome.gtk4.FlowBoxChild /* None */ =
    sn.gnome.gtk4.FlowBoxChild.applyUnsafe(
      gtk_flow_box_get_child_at_index(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
        idx
      ).asInstanceOf
    )
  end getChildAtIndex

  /** Gets the child in the (@x, @y) position.
    *
    * Both @x and @y are assumed to be relative to the origin of @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildAtPos(x: Int /* Some(CInt) */, y: Int /* Some(CInt) */ )(using
      Runtime
  ): sn.gnome.gtk4.FlowBoxChild /* None */ =
    sn.gnome.gtk4.FlowBoxChild.applyUnsafe(
      gtk_flow_box_get_child_at_pos(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
        x,
        y
      ).asInstanceOf
    )
  end getChildAtPos

  /** Gets the horizontal spacing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnSpacing(): UInt /* None */ =
    gtk_flow_box_get_column_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    ).value
  end getColumnSpacing

  /** Returns whether the box is homogeneous.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHomogeneous(): Boolean /* None */ =
    gtk_flow_box_get_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    ).value.!=(0)
  end getHomogeneous

  /** Gets the maximum number of children per line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxChildrenPerLine(): UInt /* None */ =
    gtk_flow_box_get_max_children_per_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    ).value
  end getMaxChildrenPerLine

  /** Gets the minimum number of children per line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinChildrenPerLine(): UInt /* None */ =
    gtk_flow_box_get_min_children_per_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    ).value
  end getMinChildrenPerLine

  /** Gets the vertical spacing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowSpacing(): UInt /* None */ =
    gtk_flow_box_get_row_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    ).value
  end getRowSpacing

  /** Creates a list of all selected children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_selected_children/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(FlowBoxChild))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getSelectedChildren__ = ???

  /** Gets the selection mode of @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectionMode(): SelectionMode /* None */ =
    SelectionMode.fromRaw(
      gtk_flow_box_get_selection_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
      )
    )
  end getSelectionMode

  /** Inserts the @widget into @box at @position.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    *
    * If @position is -1, or larger than the total number of children in the @box,
    * then the @widget will be appended to the end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      position: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      widget.getUnsafeRawPointer().asInstanceOf,
      position
    )
  end insert

  /** Updates the filtering for all children.
    *
    * Call this function when the result of the filter function on the @box is
    * changed due to an external factor. For instance, this would be used if the
    * filter function just looked for a specific search term, and the entry with
    * the string has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invalidateFilter(): Unit /* None */ =
    gtk_flow_box_invalidate_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    )
  end invalidateFilter

  /** Updates the sorting for all children.
    *
    * Call this when the result of the sort function on
    * @box
    *   is changed due to an external factor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invalidateSort(): Unit /* None */ =
    gtk_flow_box_invalidate_sort(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    )
  end invalidateSort

  /** Adds @child to the start of @self.
    *
    * If a sort function is set, the widget will actually be inserted at the
    * calculated position.
    *
    * See also: [method@Gtk.FlowBox.insert].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_prepend(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end prepend

  /** Removes a child from @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      widget.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Removes all children from @box.
    *
    * This function does nothing if @box is backed by a model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAll(): Unit /* None */ =
    gtk_flow_box_remove_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    )
  end removeAll

  /** Select all children of @box, if the selection mode allows it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectAll(): Unit /* None */ =
    gtk_flow_box_select_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    )
  end selectAll

  /** Selects a single child of @box, if the selection mode allows it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectChild(
      child: sn.gnome.gtk4.FlowBoxChild /* Some(Ptr[GtkFlowBoxChild]) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_select_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end selectChild

  /** Calls a function for each selected child.
    *
    * Note that the selection cannot be modified from within this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method selected_foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxForeachFunc), @type -> DataRecord(GtkFlowBoxForeachFunc)))"
  )
  private def selectedForeach__ = ???

  /** If @single is %TRUE, children will be activated when you click on them,
    * otherwise you need to double-click.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivateOnSingleClick(
      single: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_flow_box_set_activate_on_single_click(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      gboolean(gint((if single == true then 1 else 0)))
    )
  end setActivateOnSingleClick

  /** Sets the horizontal space to add between children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumnSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_flow_box_set_column_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      guint(spacing)
    )
  end setColumnSpacing

  /** By setting a filter function on the @box one can decide dynamically which
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_filter_func/<method parameters>/filter_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxFilterFunc), @type -> DataRecord(GtkFlowBoxFilterFunc)))"
  )
  private def setFilterFunc__ = ???

  /** Hooks up an adjustment to focus handling in @box.
    *
    * The adjustment is also used for autoscrolling during rubberband selection.
    * See [method@Gtk.ScrolledWindow.get_hadjustment] for a typical way of
    * obtaining the adjustment, and [method@Gtk.FlowBox.set_vadjustment] for
    * setting the vertical adjustment.
    *
    * The adjustments have to be in pixel units and in the same coordinate
    * system as the allocation for immediate children of the box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHadjustment(
      adjustment: sn.gnome.gtk4.Adjustment /* Some(Ptr[GtkAdjustment]) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_set_hadjustment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      adjustment.getUnsafeRawPointer().asInstanceOf
    )
  end setHadjustment

  /** Sets whether or not all children of @box are given equal space in the box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_flow_box_set_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )
  end setHomogeneous

  /** Sets the maximum number of children to request and allocate space for in @box’s
    * orientation.
    *
    * Setting the maximum number of children per line limits the overall natural
    * size request to be no more than @n_children children long in the given
    * orientation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxChildrenPerLine(
      n_children: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_flow_box_set_max_children_per_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      guint(n_children)
    )
  end setMaxChildrenPerLine

  /** Sets the minimum number of children to line up in @box’s orientation
    * before flowing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinChildrenPerLine(
      n_children: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_flow_box_set_min_children_per_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      guint(n_children)
    )
  end setMinChildrenPerLine

  /** Sets the vertical space to add between children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_flow_box_set_row_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      guint(spacing)
    )
  end setRowSpacing

  /** Sets how selection works in @box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelectionMode(
      mode: SelectionMode /* Some(GtkSelectionMode) */
  ): Unit /* None */ =
    gtk_flow_box_set_selection_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      mode.raw
    )
  end setSelectionMode

  /** By setting a sort function on the @box, one can dynamically reorder the
    * children of the box, based on the contents of the children.
    *
    * The @sort_func will be called for each child after the call, and will
    * continue to be called each time a child changes (via
    * [method@Gtk.FlowBoxChild.changed]) and when
    * [method@Gtk.FlowBox.invalidate_sort] is called.
    *
    * Note that using a sort function is incompatible with using a model (see
    * [method@Gtk.FlowBox.bind_model]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxSortFunc), @type -> DataRecord(GtkFlowBoxSortFunc)))"
  )
  private def setSortFunc__ = ???

  /** Hooks up an adjustment to focus handling in @box.
    *
    * The adjustment is also used for autoscrolling during rubberband selection.
    * See [method@Gtk.ScrolledWindow.get_vadjustment] for a typical way of
    * obtaining the adjustment, and [method@Gtk.FlowBox.set_hadjustment] for
    * setting the horizontal adjustment.
    *
    * The adjustments have to be in pixel units and in the same coordinate
    * system as the allocation for immediate children of the box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVadjustment(
      adjustment: sn.gnome.gtk4.Adjustment /* Some(Ptr[GtkAdjustment]) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_set_vadjustment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      adjustment.getUnsafeRawPointer().asInstanceOf
    )
  end setVadjustment

  /** Unselect all children of @box, if the selection mode allows it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unselectAll(): Unit /* None */ =
    gtk_flow_box_unselect_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]]
    )
  end unselectAll

  /** Unselects a single child of @box, if the selection mode allows it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unselectChild(
      child: sn.gnome.gtk4.FlowBoxChild /* Some(Ptr[GtkFlowBoxChild]) */
  )(using Runtime): Unit /* None */ =
    gtk_flow_box_unselect_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlowBox]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end unselectChild

  /** Emitted when the user activates the @box.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateCursorChild(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFlowBox],
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
    val signal = c"activate-cursor-child"
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
  end onActivateCursorChild

  /** Emitted when a child has been activated by the user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChildActivated(handler: ((child: FlowBoxChild)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (child: FlowBoxChild), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkFlowBox],
          child: Ptr[GtkFlowBoxChild] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (child = sr.runtime.get[FlowBoxChild](child.asInstanceOf[Ptr[Byte]]))
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
    val signal = c"child-activated"
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
  end onChildActivated

  /** Emitted when the user initiates a cursor movement.
    *
    * This is a [keybinding signal](class.SignalAction.html). Applications
    * should not connect to it, but may emit it with g_signal_emit_by_name() if
    * they need to control the cursor programmatically.
    *
    * The default bindings for this signal come in two variants, the variant
    * with the Shift modifier extends the selection, the variant without the
    * Shift modifier does not. There are too many key combinations to list them
    * all here.
    *
    *   - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd> move by
    *     individual children
    *   - <kbd>Home</kbd>, <kbd>End</kbd> move to the ends of the box
    *   - <kbd>PgUp</kbd>, <kbd>PgDn</kbd> move vertically by pages
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveCursor(
      handler: (
          (step: MovementStep, count: Int, extend: Boolean, modify: Boolean)
      ) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (step: MovementStep, count: Int, extend: Boolean, modify: Boolean),
      Boolean
    ]
    val c_handler = CFuncPtr6.fromScalaFunction {
      (
          self: Ptr[GtkFlowBox],
          step: GtkMovementStep /* param */,
          count: Int /* param */,
          extend: Boolean /* param */,
          modify: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            step = MovementStep.fromRaw(step),
            count = count,
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

  /** Emitted to select all children of the box, if the selection mode permits
    * it.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal is <kbd>Ctrl</kbd>-<kbd>a</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSelectAll(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFlowBox],
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

  /** Emitted when the set of selected children changes.
    *
    * Use [method@Gtk.FlowBox.selected_foreach] or
    * [method@Gtk.FlowBox.get_selected_children] to obtain the selected
    * children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSelectedChildrenChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFlowBox],
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
    val signal = c"selected-children-changed"
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
  end onSelectedChildrenChanged

  /** Emitted to toggle the selection of the child that has the focus.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>Ctrl</kbd>-<kbd>Space</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggleCursorChild(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFlowBox],
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
    val signal = c"toggle-cursor-child"
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
  end onToggleCursorChild

  /** Emitted to unselect all children of the box, if the selection mode permits
    * it.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal is
    * <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onUnselectAll(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFlowBox],
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
end FlowBox

object FlowBox:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFlowBox])(using Runtime) = summon[Runtime]
    .getOrCreate[FlowBox](ptr.asInstanceOf[Ptr[Byte]], p => new FlowBox(ptr))

  /** Creates a `GtkFlowBox`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FlowBox =
    val raw: Ptr[Byte] = gtk_flow_box_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[FlowBox](raw, r => FlowBox.applyUnsafe(r.asInstanceOf))
  end apply
end FlowBox
