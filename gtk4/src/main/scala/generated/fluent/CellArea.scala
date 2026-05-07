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
  CellAreaContext,
  CellEditable,
  CellLayout,
  CellRenderer,
  DirectionType,
  SizeRequestMode
}
import sn.gnome.gtk4.internal.{GtkCellArea, GtkCellRenderer}
import sn.gnome.runtime.*

/** An abstract class for laying out `GtkCellRenderer`s
  *
  * The `GtkCellArea` is an abstract class for [iface@Gtk.CellLayout] widgets
  * (also referred to as "layouting widgets") to interface with an arbitrary
  * number of [class@Gtk.CellRenderer]s and interact with the user for a given
  * [iface@Gtk.TreeModel] row.
  *
  * The cell area handles events, focus navigation, drawing and size requests
  * and allocations for a given row of data.
  *
  * Usually users dont have to interact with the `GtkCellArea` directly unless
  * they are implementing a cell-layouting widget themselves.
  *
  * ## Requesting area sizes
  *
  * As outlined in [GtkWidget’s geometry management
  * section](class.Widget.html#height-for-width-geometry-management), GTK uses a
  * height-for-width geometry management system to compute the sizes of widgets
  * and user interfaces. `GtkCellArea` uses the same semantics to calculate the
  * size of an area for an arbitrary number of `GtkTreeModel` rows.
  *
  * When requesting the size of a cell area one needs to calculate the size for
  * a handful of rows, and this will be done differently by different layouting
  * widgets. For instance a [class@Gtk.TreeViewColumn] always lines up the areas
  * from top to bottom while a [class@Gtk.IconView] on the other hand might
  * enforce that all areas received the same width and wrap the areas around,
  * requesting height for more cell areas when allocated less width.
  *
  * It’s also important for areas to maintain some cell alignments with areas
  * rendered for adjacent rows (cells can appear “columnized” inside an area
  * even when the size of cells are different in each row). For this reason the
  * `GtkCellArea` uses a [class@Gtk.CellAreaContext] object to store the
  * alignments and sizes along the way (as well as the overall largest minimum
  * and natural size for all the rows which have been calculated with the said
  * context).
  *
  * The [class@Gtk.CellAreaContext] is an opaque object specific to the
  * `GtkCellArea` which created it (see [method@Gtk.CellArea.create_context]).
  *
  * The owning cell-layouting widget can create as many contexts as it wishes to
  * calculate sizes of rows which should receive the same size in at least one
  * orientation (horizontally or vertically), However, it’s important that the
  * same [class@Gtk.CellAreaContext] which was used to request the sizes for a
  * given `GtkTreeModel` row be used when rendering or processing events for
  * that row.
  *
  * In order to request the width of all the rows at the root level of a
  * `GtkTreeModel` one would do the following:
  *
  * ```c
  * GtkTreeIter iter;
  * int minimum_width;
  * int natural_width;
  *
  * valid = gtk_tree_model_get_iter_first (model, &iter);
  * while (valid)
  *   {
  *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
  *     gtk_cell_area_get_preferred_width (area, context, widget, NULL, NULL);
  *
  *     valid = gtk_tree_model_iter_next (model, &iter);
  *   }
  *
  * gtk_cell_area_context_get_preferred_width (context, &minimum_width, &natural_width);
  * ```
  *
  * Note that in this example it’s not important to observe the returned minimum
  * and natural width of the area for each row unless the cell-layouting object
  * is actually interested in the widths of individual rows. The overall width
  * is however stored in the accompanying `GtkCellAreaContext` object and can be
  * consulted at any time.
  *
  * This can be useful since `GtkCellLayout` widgets usually have to support
  * requesting and rendering rows in treemodels with an exceedingly large amount
  * of rows. The `GtkCellLayout` widget in that case would calculate the
  * required width of the rows in an idle or timeout source (see
  * [func@GLib.timeout_add]) and when the widget is requested its actual width
  * in [vfunc@Gtk.Widget.measure] it can simply consult the width accumulated so
  * far in the `GtkCellAreaContext` object.
  *
  * A simple example where rows are rendered from top to bottom and take up the
  * full width of the layouting widget would look like:
  *
  * ```c
  * static void
  * foo_get_preferred_width (GtkWidget *widget,
  *                          int       *minimum_size,
  *                          int       *natural_size)
  * {
  *   Foo *self = FOO (widget);
  *   FooPrivate *priv = foo_get_instance_private (self);
  *
  *   foo_ensure_at_least_one_handfull_of_rows_have_been_requested (self);
  *
  *   gtk_cell_area_context_get_preferred_width (priv->context, minimum_size, natural_size);
  * }
  * ```
  *
  * In the above example the `Foo` widget has to make sure that some row sizes
  * have been calculated (the amount of rows that `Foo` judged was appropriate
  * to request space for in a single timeout iteration) before simply returning
  * the amount of space required by the area via the `GtkCellAreaContext`.
  *
  * Requesting the height for width (or width for height) of an area is a
  * similar task except in this case the `GtkCellAreaContext` does not store the
  * data (actually, it does not know how much space the layouting widget plans
  * to allocate it for every row. It’s up to the layouting widget to render each
  * row of data with the appropriate height and width which was requested by the
  * `GtkCellArea`).
  *
  * In order to request the height for width of all the rows at the root level
  * of a `GtkTreeModel` one would do the following:
  *
  * ```c
  * GtkTreeIter iter;
  * int minimum_height;
  * int natural_height;
  * int full_minimum_height = 0;
  * int full_natural_height = 0;
  *
  * valid = gtk_tree_model_get_iter_first (model, &iter);
  * while (valid)
  *   {
  *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
  *     gtk_cell_area_get_preferred_height_for_width (area, context, widget,
  *                                                   width, &minimum_height, &natural_height);
  *
  *     if (width_is_for_allocation)
  *        cache_row_height (&iter, minimum_height, natural_height);
  *
  *     full_minimum_height += minimum_height;
  *     full_natural_height += natural_height;
  *
  *     valid = gtk_tree_model_iter_next (model, &iter);
  *   }
  * ```
  *
  * Note that in the above example we would need to cache the heights returned
  * for each row so that we would know what sizes to render the areas for each
  * row. However we would only want to really cache the heights if the request
  * is intended for the layouting widgets real allocation.
  *
  * In some cases the layouting widget is requested the height for an arbitrary
  * for_width, this is a special case for layouting widgets who need to request
  * size for tens of thousands of rows. For this case it’s only important that
  * the layouting widget calculate one reasonably sized chunk of rows and return
  * that height synchronously. The reasoning here is that any layouting widget
  * is at least capable of synchronously calculating enough height to fill the
  * screen height (or scrolled window height) in response to a single call to
  * [vfunc@Gtk.Widget.measure]. Returning a perfect height for width that is
  * larger than the screen area is inconsequential since after the layouting
  * receives an allocation from a scrolled window it simply continues to drive
  * the scrollbar values while more and more height is required for the row
  * heights that are calculated in the background.
  *
  * ## Rendering Areas
  *
  * Once area sizes have been acquired at least for the rows in the visible area
  * of the layouting widget they can be rendered at [vfunc@Gtk.Widget.snapshot]
  * time.
  *
  * A crude example of how to render all the rows at the root level runs as
  * follows:
  *
  * ```c
  * GtkAllocation allocation;
  * GdkRectangle cell_area = { 0, };
  * GtkTreeIter iter;
  * int minimum_width;
  * int natural_width;
  *
  * gtk_widget_get_allocation (widget, &allocation);
  * cell_area.width = allocation.width;
  *
  * valid = gtk_tree_model_get_iter_first (model, &iter);
  * while (valid)
  *   {
  *     cell_area.height = get_cached_height_for_row (&iter);
  *
  *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
  *     gtk_cell_area_render (area, context, widget, cr,
  *                           &cell_area, &cell_area, state_flags, FALSE);
  *
  *     cell_area.y += cell_area.height;
  *
  *     valid = gtk_tree_model_iter_next (model, &iter);
  *   }
  * ```
  *
  * Note that the cached height in this example really depends on how the
  * layouting widget works. The layouting widget might decide to give every row
  * its minimum or natural height or, if the model content is expected to fit
  * inside the layouting widget without scrolling, it would make sense to
  * calculate the allocation for each row at the time the widget is allocated
  * using [func@Gtk.distribute_natural_allocation].
  *
  * ## Handling Events and Driving Keyboard Focus
  *
  * Passing events to the area is as simple as handling events on any normal
  * widget and then passing them to the [method@Gtk.CellArea.event] API as they
  * come in. Usually `GtkCellArea` is only interested in button events, however
  * some customized derived areas can be implemented who are interested in
  * handling other events. Handling an event can trigger the
  * [signal@Gtk.CellArea::focus-changed] signal to fire; as well as
  * [signal@Gtk.CellArea::add-editable] in the case that an editable cell was
  * clicked and needs to start editing. You can call
  * [method@Gtk.CellArea.stop_editing] at any time to cancel any cell editing
  * that is currently in progress.
  *
  * The `GtkCellArea` drives keyboard focus from cell to cell in a way similar
  * to `GtkWidget`. For layouting widgets that support giving focus to cells
  * it’s important to remember to pass `GTK_CELL_RENDERER_FOCUSED` to the area
  * functions for the row that has focus and to tell the area to paint the focus
  * at render time.
  *
  * Layouting widgets that accept focus on cells should implement the
  * [vfunc@Gtk.Widget.focus] virtual method. The layouting widget is always
  * responsible for knowing where `GtkTreeModel` rows are rendered inside the
  * widget, so at [vfunc@Gtk.Widget.focus] time the layouting widget should use
  * the `GtkCellArea` methods to navigate focus inside the area and then observe
  * the [enum@Gtk.DirectionType] to pass the focus to adjacent rows and areas.
  *
  * A basic example of how the [vfunc@Gtk.Widget.focus] virtual method should be
  * implemented:
  *
  * ```
  * static gboolean
  * foo_focus (GtkWidget       *widget,
  *            GtkDirectionType direction)
  * {
  *   Foo *self = FOO (widget);
  *   FooPrivate *priv = foo_get_instance_private (self);
  *   int focus_row = priv->focus_row;
  *   gboolean have_focus = FALSE;
  *
  *   if (!gtk_widget_has_focus (widget))
  *     gtk_widget_grab_focus (widget);
  *
  *   valid = gtk_tree_model_iter_nth_child (priv->model, &iter, NULL, priv->focus_row);
  *   while (valid)
  *     {
  *       gtk_cell_area_apply_attributes (priv->area, priv->model, &iter, FALSE, FALSE);
  *
  *       if (gtk_cell_area_focus (priv->area, direction))
  *         {
  *            priv->focus_row = focus_row;
  *            have_focus = TRUE;
  *            break;
  *         }
  *       else
  *         {
  *           if (direction == GTK_DIR_RIGHT ||
  *               direction == GTK_DIR_LEFT)
  *             break;
  *           else if (direction == GTK_DIR_UP ||
  *                    direction == GTK_DIR_TAB_BACKWARD)
  *            {
  *               if (focus_row == 0)
  *                 break;
  *               else
  *                {
  *                   focus_row--;
  *                   valid = gtk_tree_model_iter_nth_child (priv->model, &iter, NULL, focus_row);
  *                }
  *             }
  *           else
  *             {
  *               if (focus_row == last_row)
  *                 break;
  *               else
  *                 {
  *                   focus_row++;
  *                   valid = gtk_tree_model_iter_next (priv->model, &iter);
  *                 }
  *             }
  *         }
  *     }
  *     return have_focus;
  * }
  * ```
  *
  * Note that the layouting widget is responsible for matching the
  * `GtkDirectionType` values to the way it lays out its cells.
  *
  * ## Cell Properties
  *
  * The `GtkCellArea` introduces cell properties for `GtkCellRenderer`s. This
  * provides some general interfaces for defining the relationship cell areas
  * have with their cells. For instance in a [class@Gtk.CellAreaBox] a cell
  * might “expand” and receive extra space when the area is allocated more than
  * its full natural request, or a cell might be configured to “align” with
  * adjacent rows which were requested and rendered with the same
  * `GtkCellAreaContext`.
  *
  * Use [method@Gtk.CellAreaClass.install_cell_property] to install cell
  * properties for a cell area class and
  * [method@Gtk.CellAreaClass.find_cell_property] or
  * [method@Gtk.CellAreaClass.list_cell_properties] to get information about
  * existing cell properties.
  *
  * To set the value of a cell property, use
  * [method@Gtk.CellArea.cell_set_property], [method@Gtk.CellArea.cell_set] or
  * [method@Gtk.CellArea.cell_set_valist]. To obtain the value of a cell
  * property, use [method@Gtk.CellArea.cell_get_property]
  * [method@Gtk.CellArea.cell_get] or [method@Gtk.CellArea.cell_get_valist].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellArea(raw: Ptr[GtkCellArea])
    extends InitiallyUnowned(raw.asInstanceOf),
      Buildable,
      CellLayout:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Activates @area, usually by activating the currently focused cell, however
    * some subclasses which embed widgets in the area can also activate a widget
    * if it currently has the focus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate/<method parameters>/cell_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def activate__ = ???

  /** This is used by `GtkCellArea` subclasses when handling events to activate
    * cells, the base `GtkCellArea` class activates cells for keyboard events
    * for free in its own GtkCellArea->activate() implementation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate_cell/<method parameters>/cell_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def activateCell__ = ???

  /** Adds @renderer to @area with the default child cell properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def add(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  ): Unit /* None */ = gtk_cell_area_add(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf
  )

  /** Adds @sibling to @renderer’s focusable area, focus will be drawn around @renderer
    * and all of its siblings if @renderer can focus for a given row.
    *
    * Events handled by focus siblings can also activate the given focusable @renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addFocusSibling(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      sibling: CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  ): Unit /* None */ = gtk_cell_area_add_focus_sibling(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    sibling.getUnsafeRawPointer().asInstanceOf
  )

  /** Adds @renderer to @area, setting cell properties at the same time. See
    * gtk_cell_area_add() and gtk_cell_area_cell_set() for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def addWithProperties(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      first_prop_name: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_cell_area_add_with_properties(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_prop_name),
    args*
  )

  /** Applies any connected attributes to the renderers in
    * @area
    *   by pulling the values from @tree_model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method apply_attributes/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def applyAttributes__ = ???

  /** Connects an @attribute to apply values from @column for the `GtkTreeModel`
    * in use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attributeConnect(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      attribute: String | CString /* Some(CString) */,
      column: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_cell_area_attribute_connect(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute),
    column
  )

  /** Disconnects @attribute for the @renderer in @area so that attribute will
    * no longer be updated with values from the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attributeDisconnect(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      attribute: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_cell_area_attribute_disconnect(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute)
  )

  /** Returns the model column that an attribute has been mapped to, or -1 if
    * the attribute is not mapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attributeGetColumn(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      attribute: String | CString /* Some(CString) */
  )(using Zone): Int /* None */ = gtk_cell_area_attribute_get_column(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute)
  )

  /** Gets the values of one or more cell properties for @renderer in @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def cellGet(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      first_prop_name: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_cell_area_cell_get(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_prop_name),
    args*
  )

  /** Gets the value of a cell property for @renderer in @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method cell_get_property/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  private def cellGetProperty__ = ???

  /** Gets the values of one or more cell properties for @renderer in @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cellGetValist(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      first_property_name: String | CString /* Some(CString) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ = gtk_cell_area_cell_get_valist(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_property_name),
    var_args
  )

  /** Sets one or more cell properties for @cell in @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def cellSet(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      first_prop_name: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_cell_area_cell_set(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_prop_name),
    args*
  )

  /** Sets a cell property for @renderer in @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method cell_set_property/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def cellSetProperty__ = ???

  /** Sets one or more cell properties for @renderer in @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cellSetValist(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      first_property_name: String | CString /* Some(CString) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ = gtk_cell_area_cell_set_valist(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_property_name),
    var_args
  )

  /** This is sometimes needed for cases where rows need to share alignments in
    * one orientation but may be separately grouped in the opposing orientation.
    *
    * For instance, `GtkIconView` creates all icons (rows) to have the same
    * width and the cells theirin to have the same horizontal alignments.
    * However each row of icons may have a separate collective height.
    * `GtkIconView` uses this to request the heights of each row based on a
    * context which was already used to request all the row widths that are to
    * be displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyContext(
      context: CellAreaContext /* Some(Ptr[GtkCellAreaContext]) */
  ): CellAreaContext /* None */ = new CellAreaContext(
    gtk_cell_area_copy_context(
      this.raw.asInstanceOf[Ptr[GtkCellArea]],
      context.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Creates a `GtkCellArea`Context to be used with @area for all purposes.
    * `GtkCellArea`Context stores geometry information for rows for which it was
    * operated on, it is important to use the same context for the same row of
    * data at all times (i.e. one should render and handle events with the same
    * `GtkCellArea`Context which was used to request the size of those rows of
    * data).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createContext(): CellAreaContext /* None */ = new CellAreaContext(
    gtk_cell_area_create_context(
      this.raw.asInstanceOf[Ptr[GtkCellArea]]
    ).asInstanceOf
  )

  /** Delegates event handling to a `GtkCellArea`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method event/<method parameters>/cell_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def event__ = ???

  /** This should be called by the @area’s owning layout widget when focus is to
    * be passed to @area, or moved within @area for a given @direction and row
    * data.
    *
    * Implementing `GtkCellArea` classes should implement this method to receive
    * and navigate focus in its own way particular to how it lays out cells.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def focus(
      direction: DirectionType /* Some(GtkDirectionType) */
  ): Boolean /* None */ = gtk_cell_area_focus(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    direction.raw
  ).value.!=(0)

  /** Calls @callback for every `GtkCellRenderer` in @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CellCallback), @type -> DataRecord(GtkCellCallback)))"
  )
  private def foreach__ = ???

  /** Calls @callback for every `GtkCellRenderer` in @area with the allocated
    * rectangle inside @cell_area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach_alloc/<method parameters>/cell_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def foreachAlloc__ = ???

  /** Derives the allocation of @renderer inside @area if @area were to be
    * rendered in @cell_area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cell_allocation]: Method get_cell_allocation contains an OUT parameter, which is not supported yet"
  )
  private def getCellAllocation__ = ???

  /** Gets the `GtkCellRenderer` at @x and @y coordinates inside @area and
    * optionally returns the full cell allocation for it inside @cell_area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cell_at_position]: Method get_cell_at_position contains an OUT parameter, which is not supported yet"
  )
  private def getCellAtPosition__ = ???

  /** Gets the current `GtkTreePath` string for the currently applied
    * `GtkTreeIter`, this is implicitly updated when
    * gtk_cell_area_apply_attributes() is called and can be used to interact
    * with renderers from `GtkCellArea` subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentPathString()(using Zone): String /* None */ = fromCString(
    gtk_cell_area_get_current_path_string(
      this.raw.asInstanceOf[Ptr[GtkCellArea]]
    ).asInstanceOf
  )

  /** Gets the `GtkCellEditable` widget currently used to edit the currently
    * edited cell.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEditWidget(): CellEditable /* None */ = new CellEditable.Abstract(
    gtk_cell_area_get_edit_widget(
      this.raw.asInstanceOf[Ptr[GtkCellArea]]
    ).asInstanceOf
  )

  /** Gets the `GtkCellRenderer` in @area that is currently being edited.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEditedCell(): CellRenderer /* None */ = new CellRenderer(
    gtk_cell_area_get_edited_cell(
      this.raw.asInstanceOf[Ptr[GtkCellArea]]
    ).asInstanceOf
  )

  /** Retrieves the currently focused cell for @area
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusCell(): CellRenderer /* None */ = new CellRenderer(
    gtk_cell_area_get_focus_cell(
      this.raw.asInstanceOf[Ptr[GtkCellArea]]
    ).asInstanceOf
  )

  /** Gets the `GtkCellRenderer` which is expected to be focusable for which @renderer
    * is, or may be a sibling.
    *
    * This is handy for `GtkCellArea` subclasses when handling events, after
    * determining the renderer at the event location it can then chose to
    * activate the focus cell for which the event cell may have been a sibling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusFromSibling(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  ): CellRenderer /* None */ = new CellRenderer(
    gtk_cell_area_get_focus_from_sibling(
      this.raw.asInstanceOf[Ptr[GtkCellArea]],
      renderer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Gets the focus sibling cell renderers for @renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_focus_siblings/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(CellRenderer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(const GList*)))"
  )
  private def getFocusSiblings__ = ???

  /** Retrieves a cell area’s initial minimum and natural height.
    *
    * @area
    *   will store some geometrical information in @context along the way; when
    *   requesting sizes over an arbitrary number of rows, it’s not important to
    *   check the @minimum_height and @natural_height of this call but rather to
    *   consult gtk_cell_area_context_get_preferred_height() after a series of
    *   requests.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_height]: Method get_preferred_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeight__ = ???

  /** Retrieves a cell area’s minimum and natural height if it would be given
    * the specified @width.
    *
    * @area
    *   stores some geometrical information in @context along the way while
    *   calling gtk_cell_area_get_preferred_width(). It’s important to perform a
    *   series of gtk_cell_area_get_preferred_width() requests with
    * @context
    *   first and then call gtk_cell_area_get_preferred_height_for_width() on
    *   each cell area individually to get the height for width of each fully
    *   requested row.
    *
    * If at some point, the width of a single row changes, it should be
    * requested with gtk_cell_area_get_preferred_width() again and then the full
    * width of the requested rows checked again with
    * gtk_cell_area_context_get_preferred_width().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_height_for_width]: Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeightForWidth__ = ???

  /** Retrieves a cell area’s initial minimum and natural width.
    *
    * @area
    *   will store some geometrical information in @context along the way; when
    *   requesting sizes over an arbitrary number of rows, it’s not important to
    *   check the @minimum_width and @natural_width of this call but rather to
    *   consult gtk_cell_area_context_get_preferred_width() after a series of
    *   requests.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_width]: Method get_preferred_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidth__ = ???

  /** Retrieves a cell area’s minimum and natural width if it would be given the
    * specified @height.
    *
    * @area
    *   stores some geometrical information in @context along the way while
    *   calling gtk_cell_area_get_preferred_height(). It’s important to perform
    *   a series of gtk_cell_area_get_preferred_height() requests with
    * @context
    *   first and then call gtk_cell_area_get_preferred_width_for_height() on
    *   each cell area individually to get the height for width of each fully
    *   requested row.
    *
    * If at some point, the height of a single row changes, it should be
    * requested with gtk_cell_area_get_preferred_height() again and then the
    * full height of the requested rows checked again with
    * gtk_cell_area_context_get_preferred_height().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_width_for_height]: Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidthForHeight__ = ???

  /** Gets whether the area prefers a height-for-width layout or a
    * width-for-height layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRequestMode(): SizeRequestMode /* None */ = SizeRequestMode.fromRaw(
    gtk_cell_area_get_request_mode(this.raw.asInstanceOf[Ptr[GtkCellArea]])
  )

  /** Checks if @area contains @renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasRenderer(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  ): Boolean /* None */ = gtk_cell_area_has_renderer(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** This is a convenience function for `GtkCellArea` implementations to get
    * the inner area where a given `GtkCellRenderer` will be rendered. It
    * removes any padding previously added by gtk_cell_area_request_renderer().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method inner_cell_area]: Method inner_cell_area contains an OUT parameter, which is not supported yet"
  )
  private def innerCellArea__ = ???

  /** Returns whether the area can do anything when activated, after applying
    * new attributes to @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActivatable(): Boolean /* None */ = gtk_cell_area_is_activatable(
    this.raw.asInstanceOf[Ptr[GtkCellArea]]
  ).value.!=(0)

  /** Returns whether @sibling is one of @renderer’s focus siblings (see
    * gtk_cell_area_add_focus_sibling()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFocusSibling(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      sibling: CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  ): Boolean /* None */ = gtk_cell_area_is_focus_sibling(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    sibling.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Removes @renderer from @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  ): Unit /* None */ = gtk_cell_area_remove(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf
  )

  /** Removes @sibling from @renderer’s focus sibling list (see
    * gtk_cell_area_add_focus_sibling()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeFocusSibling(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      sibling: CellRenderer /* Some(Ptr[GtkCellRenderer]) */
  ): Unit /* None */ = gtk_cell_area_remove_focus_sibling(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    sibling.getUnsafeRawPointer().asInstanceOf
  )

  /** This is a convenience function for `GtkCellArea` implementations to
    * request size for cell renderers. It’s important to use this function to
    * request size and then use gtk_cell_area_inner_cell_area() at render and
    * event time since this function will add padding around the cell for focus
    * painting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method request_renderer]: Method request_renderer contains an OUT parameter, which is not supported yet"
  )
  private def requestRenderer__ = ???

  /** Explicitly sets the currently focused cell to @renderer.
    *
    * This is generally called by implementations of `GtkCellAreaClass.focus()`
    * or `GtkCellAreaClass.event()`, however it can also be used to implement
    * functions such as gtk_tree_view_set_cursor_on_cell().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFocusCell(
      renderer: Option[CellRenderer /* Some(Ptr[GtkCellRenderer]) */ ]
  ): Unit /* None */ = gtk_cell_area_set_focus_cell(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    renderer
      .map[Ptr[GtkCellRenderer]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkCellRenderer]])
  )

  /** Snapshots @area’s cells according to @area’s layout onto at the given
    * coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method snapshot/<method parameters>/background_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def snapshot__ = ???

  /** Explicitly stops the editing of the currently edited cell.
    *
    * If @canceled is %TRUE, the currently edited cell renderer will emit the
    * ::editing-canceled signal, otherwise the the ::editing-done signal will be
    * emitted on the current edit widget.
    *
    * See gtk_cell_area_get_edited_cell() and gtk_cell_area_get_edit_widget().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stopEditing(
      canceled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_area_stop_editing(
    this.raw.asInstanceOf[Ptr[GtkCellArea]],
    gboolean(gint((if canceled == true then 1 else 0)))
  )

  /** Indicates that editing has started on @renderer and that @editable should
    * be added to the owning cell-layouting widget at @cell_area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal add-editable]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(CellEditable)))"
  )
  private def onAddEditable = ???

  /** This signal is emitted whenever applying attributes to @area from @model
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal apply-attributes]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeModel)))"
  )
  private def onApplyAttributes = ???

  /** Indicates that focus changed on this @area. This signal is emitted either
    * as a result of focus handling or event handling.
    *
    * It's possible that the signal is emitted even if the currently focused
    * renderer did not change, this is because focus may change to the same
    * renderer in the same cell area for a different row of data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onFocusChanged(handler: ((renderer: CellRenderer, path: String)) => Unit)(
      using Runtime
  ) =
    type SignalRegType = SignalRegistration[
      this.type,
      (renderer: CellRenderer, path: String),
      Unit
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkCellArea],
          renderer: Ptr[GtkCellRenderer] /* param */,
          path: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            renderer =
              sr.runtime.get[CellRenderer](renderer.asInstanceOf[Ptr[Byte]]),
            path = fromCString(path)
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
    val signal = c"focus-changed"
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
  end onFocusChanged

  /** Indicates that editing finished on @renderer and that @editable should be
    * removed from the owning cell-layouting widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal remove-editable]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(CellEditable)))"
  )
  private def onRemoveEditable = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CellArea
