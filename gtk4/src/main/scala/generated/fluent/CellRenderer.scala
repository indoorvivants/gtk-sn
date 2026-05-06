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
  CellRendererState,
  SizeRequestMode,
  StateFlags,
  Widget
}
import sn.gnome.gtk4.internal.GtkCellRenderer

/** An object for rendering a single cell
  *
  * The `GtkCellRenderer` is a base class of a set of objects used for rendering
  * a cell to a `cairo_t`. These objects are used primarily by the `GtkTreeView`
  * widget, though they aren’t tied to them in any specific way. It is worth
  * noting that `GtkCellRenderer` is not a `GtkWidget` and cannot be treated as
  * such.
  *
  * The primary use of a `GtkCellRenderer` is for drawing a certain graphical
  * elements on a `cairo_t`. Typically, one cell renderer is used to draw many
  * cells on the screen. To this extent, it isn’t expected that a CellRenderer
  * keep any permanent state around. Instead, any state is set just prior to use
  * using `GObject`s property system. Then, the cell is measured using
  * gtk_cell_renderer_get_preferred_size(). Finally, the cell is rendered in the
  * correct location using gtk_cell_renderer_snapshot().
  *
  * There are a number of rules that must be followed when writing a new
  * `GtkCellRenderer`. First and foremost, it’s important that a certain set of
  * properties will always yield a cell renderer of the same size, barring a
  * style change. The `GtkCellRenderer` also has a number of generic properties
  * that are expected to be honored by all children.
  *
  * Beyond merely rendering a cell, cell renderers can optionally provide active
  * user interface elements. A cell renderer can be “activatable” like
  * `GtkCellRenderer`Toggle, which toggles when it gets activated by a mouse
  * click, or it can be “editable” like `GtkCellRenderer`Text, which allows the
  * user to edit the text using a widget implementing the `GtkCellEditable`
  * interface, e.g. `GtkEntry`. To make a cell renderer activatable or editable,
  * you have to implement the `GtkCellRenderer`Class.activate or
  * `GtkCellRenderer`Class.start_editing virtual functions, respectively.
  *
  * Many properties of `GtkCellRenderer` and its subclasses have a corresponding
  * “set” property, e.g. “cell-background-set” corresponds to “cell-background”.
  * These “set” properties reflect whether a property has been set or not. You
  * should not set them independently.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellRenderer(raw: Ptr[GtkCellRenderer])
    extends InitiallyUnowned(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Passes an activate event to the cell renderer for possible processing.
    * Some cell renderers may use events; for example, `GtkCellRendererToggle`
    * toggles when it gets a mouse click.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate/<method parameters>/background_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def activate__ = ???

  /** Gets the aligned area used by @cell inside @cell_area. Used for finding
    * the appropriate edit and focus rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_aligned_area]: Method get_aligned_area contains an OUT parameter, which is not supported yet"
  )
  private def getAlignedArea__ = ???

  /** Fills in @xalign and @yalign with the appropriate values of @cell.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_alignment]: Method get_alignment contains an OUT parameter, which is not supported yet"
  )
  private def getAlignment__ = ???

  /** Fills in @width and @height with the appropriate size of @cell.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_fixed_size]: Method get_fixed_size contains an OUT parameter, which is not supported yet"
  )
  private def getFixedSize__ = ???

  /** Checks whether the given `GtkCellRenderer` is expanded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsExpanded(): Boolean /* None */ = gtk_cell_renderer_get_is_expanded(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** Checks whether the given `GtkCellRenderer` is an expander.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsExpander(): Boolean /* None */ = gtk_cell_renderer_get_is_expander(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** Fills in @xpad and @ypad with the appropriate values of @cell.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_padding]: Method get_padding contains an OUT parameter, which is not supported yet"
  )
  private def getPadding__ = ???

  /** Retrieves a renderer’s natural size when rendered to @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_height]: Method get_preferred_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeight__ = ???

  /** Retrieves a cell renderers’s minimum and natural height if it were
    * rendered to
    * @widget
    *   with the specified @width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_height_for_width]: Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeightForWidth__ = ???

  /** Retrieves the minimum and natural size of a cell taking into account the
    * widget’s preference for height-for-width management.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_size]: Method get_preferred_size contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredSize__ = ???

  /** Retrieves a renderer’s natural size when rendered to @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_width]: Method get_preferred_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidth__ = ???

  /** Retrieves a cell renderers’s minimum and natural width if it were rendered
    * to
    * @widget
    *   with the specified @height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_width_for_height]: Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidthForHeight__ = ???

  /** Gets whether the cell renderer prefers a height-for-width layout or a
    * width-for-height layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRequestMode(): SizeRequestMode /* None */ = SizeRequestMode.fromRaw(
    gtk_cell_renderer_get_request_mode(
      this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
    )
  )

  /** Returns the cell renderer’s sensitivity.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSensitive(): Boolean /* None */ = gtk_cell_renderer_get_sensitive(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** Translates the cell renderer state to `GtkStateFlags`, based on the cell
    * renderer and widget sensitivity, and the given `GtkCellRenderer`State.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getState(
      widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ],
      cell_state: CellRendererState /* Some(GtkCellRendererState) */
  ): StateFlags /* None */ = StateFlags.fromRaw(
    gtk_cell_renderer_get_state(
      this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
      cell_state.raw
    )
  )

  /** Returns the cell renderer’s visibility.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ = gtk_cell_renderer_get_visible(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** Checks whether the cell renderer can do something when activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActivatable(): Boolean /* None */ = gtk_cell_renderer_is_activatable(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** Sets the renderer’s alignment within its available space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAlignment(
      xalign: Float /* Some(Float) */,
      yalign: Float /* Some(Float) */
  ): Unit /* None */ = gtk_cell_renderer_set_alignment(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    xalign.asInstanceOf,
    yalign.asInstanceOf
  )

  /** Sets the renderer size to be explicit, independent of the properties set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFixedSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_cell_renderer_set_fixed_size(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    width,
    height
  )

  /** Sets whether the given `GtkCellRenderer` is expanded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsExpanded(
      is_expanded: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_is_expanded(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if is_expanded == true then 1 else 0)))
  )

  /** Sets whether the given `GtkCellRenderer` is an expander.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsExpander(
      is_expander: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_is_expander(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if is_expander == true then 1 else 0)))
  )

  /** Sets the renderer’s padding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPadding(
      xpad: Int /* Some(CInt) */,
      ypad: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_cell_renderer_set_padding(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    xpad,
    ypad
  )

  /** Sets the cell renderer’s sensitivity.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSensitive(
      sensitive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_sensitive(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  /** Sets the cell renderer’s visibility.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_visible(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if visible == true then 1 else 0)))
  )

  /** Invokes the virtual render function of the `GtkCellRenderer`. The three
    * passed-in rectangles are areas in @cr. Most renderers will draw within
    * @cell_area;
    *   the xalign, yalign, xpad, and ypad fields of the `GtkCellRenderer`
    *   should be honored with respect to @cell_area. @background_area includes
    *   the blank space around the cell, and also the area containing the tree
    *   expander; so the @background_area rectangles for all cells tile to cover
    *   the entire
    * @window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method snapshot/<method parameters>/background_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def snapshot__ = ???

  /** Starts editing the contents of this @cell, through a new `GtkCellEditable`
    * widget created by the `GtkCellRenderer`Class.start_editing virtual
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method start_editing/<method parameters>/background_area]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  private def startEditing__ = ???

  /** Informs the cell renderer that the editing is stopped. If @canceled is
    * %TRUE, the cell renderer will emit the `GtkCellRenderer`::editing-canceled
    * signal.
    *
    * This function should be called by cell renderer implementations in
    * response to the `GtkCellEditable::editing-done` signal of
    * `GtkCellEditable`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stopEditing(
      canceled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_stop_editing(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if canceled == true then 1 else 0)))
  )

  /** This signal gets emitted when the user cancels the process of editing a
    * cell. For example, an editable cell renderer could be written to cancel
    * editing when the user presses Escape.
    *
    * See also: gtk_cell_renderer_stop_editing().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEditingCanceled(f: EmptyTuple.type => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCellRenderer],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"editing-canceled"
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
  end onEditingCanceled

  /**  This signal gets emitted when a cell starts to be edited.
    *  The intended use of this signal is to do special setup
    *  on @editable, e.g. adding a `GtkEntryCompletion` or setting
    *  up additional columns in a `GtkComboBox`.
    *
    *  See gtk_cell_editable_start_editing() for information on the lifecycle of
    *  the @editable and a way to do setup that doesn’t depend on the @renderer.
    *
    *  Note that GTK doesn't guarantee that cell renderers will
    *  continue to use the same kind of widget for editing in future
    *  releases, therefore you should check the type of @editable
    *  before doing any specific setup, as in the following example:
    *  |[<!-- language="C" -->
    *  static void
    *  text_editing_started (GtkCellRenderer *cell,
    *                        GtkCellEditable *editable,
    *                        const char      *path,
    *                        gpointer         data)
    *  {
    *    if (GTK_IS_ENTRY (editable))
    *      {
    *        GtkEntry *entry = GTK_ENTRY (editable);
    *
    *        // ... create a GtkEntryCompletion
    *
    *        gtk_entry_set_completion (entry, completion);
    *      }
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal editing-started]: Type Type(List(),ListMap(@name -> DataRecord(CellEditable))) has no @type attribute"
  )
  private def onEditingStarted = ???

end CellRenderer
