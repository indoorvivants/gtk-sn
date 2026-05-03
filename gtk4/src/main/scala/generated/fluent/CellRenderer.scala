package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.SizeRequestMode
import sn.gnome.gtk4.fluent.Snapshot
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererState
import sn.gnome.gtk4.internal.GtkStateFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An object for rendering a single cell
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
  */
class CellRenderer(raw: Ptr[GtkCellRenderer])
    extends InitiallyUnowned(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Passes an activate event to the cell renderer for possible processing.
    * Some cell renderers may use events; for example, `GtkCellRendererToggle`
    * toggles when it gets a mouse click.
    */
  def activate(
      event: Event /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]) */,
      widget: Widget /* Some(Ptr[GtkWidget]) */,
      path: String | CString /* Some(CString) */,
      background_area: Ptr[
        GdkRectangle
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle]) */,
      cell_area: Ptr[
        GdkRectangle
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle]) */,
      flags: GtkCellRendererState /* Some(GtkCellRendererState) */
  )(using Zone): Boolean /* None */ = gtk_cell_renderer_activate(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    event.getUnsafeRawPointer().asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(path),
    background_area,
    cell_area,
    flags
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the aligned area used by @cell inside @cell_area. Used for finding
    * the appropriate edit and focus rectangle.
    */
  @annotation.compileTimeOnly(
    "Method get_aligned_area contains an OUT parameter, which is not supported yet"
  )
  private def getAlignedArea__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills in @xalign and @yalign with the appropriate values of @cell.
    */
  @annotation.compileTimeOnly(
    "Method get_alignment contains an OUT parameter, which is not supported yet"
  )
  private def getAlignment__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills in @width and @height with the appropriate size of @cell.
    */
  @annotation.compileTimeOnly(
    "Method get_fixed_size contains an OUT parameter, which is not supported yet"
  )
  private def getFixedSize__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the given `GtkCellRenderer` is expanded.
    */
  def getIsExpanded(): Boolean /* None */ = gtk_cell_renderer_get_is_expanded(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the given `GtkCellRenderer` is an expander.
    */
  def getIsExpander(): Boolean /* None */ = gtk_cell_renderer_get_is_expander(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills in @xpad and @ypad with the appropriate values of @cell.
    */
  @annotation.compileTimeOnly(
    "Method get_padding contains an OUT parameter, which is not supported yet"
  )
  private def getPadding__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a renderer’s natural size when rendered to @widget.
    */
  @annotation.compileTimeOnly(
    "Method get_preferred_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeight__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a cell renderers’s minimum and natural height if it were
    * rendered to
    * @widget
    *   with the specified @width.
    */
  @annotation.compileTimeOnly(
    "Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeightForWidth__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the minimum and natural size of a cell taking into account the
    * widget’s preference for height-for-width management.
    */
  @annotation.compileTimeOnly(
    "Method get_preferred_size contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredSize__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a renderer’s natural size when rendered to @widget.
    */
  @annotation.compileTimeOnly(
    "Method get_preferred_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidth__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a cell renderers’s minimum and natural width if it were rendered
    * to
    * @widget
    *   with the specified @height.
    */
  @annotation.compileTimeOnly(
    "Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidthForHeight__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the cell renderer prefers a height-for-width layout or a
    * width-for-height layout.
    */
  def getRequestMode(): SizeRequestMode /* None */ = SizeRequestMode.fromRaw(
    gtk_cell_renderer_get_request_mode(
      this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the cell renderer’s sensitivity.
    */
  def getSensitive(): Boolean /* None */ = gtk_cell_renderer_get_sensitive(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translates the cell renderer state to `GtkStateFlags`, based on the cell
    * renderer and widget sensitivity, and the given `GtkCellRenderer`State.
    */
  def getState(
      widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ],
      cell_state: GtkCellRendererState /* Some(GtkCellRendererState) */
  ): GtkStateFlags /* None */ = gtk_cell_renderer_get_state(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]]),
    cell_state
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the cell renderer’s visibility.
    */
  def getVisible(): Boolean /* None */ = gtk_cell_renderer_get_visible(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the cell renderer can do something when activated.
    */
  def isActivatable(): Boolean /* None */ = gtk_cell_renderer_is_activatable(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the renderer’s alignment within its available space.
    */
  def setAlignment(
      xalign: Float /* Some(Float) */,
      yalign: Float /* Some(Float) */
  ): Unit /* None */ = gtk_cell_renderer_set_alignment(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    xalign.asInstanceOf,
    yalign.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the renderer size to be explicit, independent of the properties set.
    */
  def setFixedSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_cell_renderer_set_fixed_size(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    width,
    height
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the given `GtkCellRenderer` is expanded.
    */
  def setIsExpanded(
      is_expanded: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_is_expanded(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if is_expanded == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the given `GtkCellRenderer` is an expander.
    */
  def setIsExpander(
      is_expander: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_is_expander(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if is_expander == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the renderer’s padding.
    */
  def setPadding(
      xpad: Int /* Some(CInt) */,
      ypad: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_cell_renderer_set_padding(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    xpad,
    ypad
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the cell renderer’s sensitivity.
    */
  def setSensitive(
      sensitive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_sensitive(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the cell renderer’s visibility.
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_set_visible(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if visible == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invokes the virtual render function of the `GtkCellRenderer`. The three
    * passed-in rectangles are areas in @cr. Most renderers will draw within
    * @cell_area;
    *   the xalign, yalign, xpad, and ypad fields of the `GtkCellRenderer`
    *   should be honored with respect to @cell_area. @background_area includes
    *   the blank space around the cell, and also the area containing the tree
    *   expander; so the @background_area rectangles for all cells tile to cover
    *   the entire
    * @window.
    */
  def snapshot(
      snapshot: Snapshot /* Some(Ptr[GtkSnapshot]) */,
      widget: Widget /* Some(Ptr[GtkWidget]) */,
      background_area: Ptr[
        GdkRectangle
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle]) */,
      cell_area: Ptr[
        GdkRectangle
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle]) */,
      flags: GtkCellRendererState /* Some(GtkCellRendererState) */
  ): Unit /* None */ = gtk_cell_renderer_snapshot(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    snapshot.getUnsafeRawPointer().asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    background_area,
    cell_area,
    flags
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts editing the contents of this @cell, through a new `GtkCellEditable`
    * widget created by the `GtkCellRenderer`Class.start_editing virtual
    * function.
    */
  def startEditing(
      event: Option[
        Event /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]) */
      ],
      widget: Widget /* Some(Ptr[GtkWidget]) */,
      path: String | CString /* Some(CString) */,
      background_area: Ptr[
        GdkRectangle
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle]) */,
      cell_area: Ptr[
        GdkRectangle
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle]) */,
      flags: GtkCellRendererState /* Some(GtkCellRendererState) */
  )(using Zone): CellEditable /* None */ = new CellEditable.Abstract(
    gtk_cell_renderer_start_editing(
      this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
      event
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]]
        ),
      widget.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(path),
      background_area,
      cell_area,
      flags
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Informs the cell renderer that the editing is stopped. If @canceled is
    * %TRUE, the cell renderer will emit the `GtkCellRenderer`::editing-canceled
    * signal.
    *
    * This function should be called by cell renderer implementations in
    * response to the `GtkCellEditable::editing-done` signal of
    * `GtkCellEditable`.
    */
  def stopEditing(
      canceled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_stop_editing(
    this.raw.asInstanceOf[Ptr[GtkCellRenderer]],
    gboolean(gint((if canceled == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CellRenderer
