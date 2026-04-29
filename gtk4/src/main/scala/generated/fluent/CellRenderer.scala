package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.Snapshot
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererState
import sn.gnome.gtk4.internal.GtkSizeRequestMode
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
      event: Event,
      widget: Widget,
      path: String | CString,
      background_area: Ptr[GdkRectangle],
      cell_area: Ptr[GdkRectangle],
      flags: GtkCellRendererState
  )(using Zone): Boolean = gtk_cell_renderer_activate(
    this.raw.asInstanceOf,
    event.getUnsafeRawPointer().asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(path),
    background_area,
    cell_area,
    flags
  ).value.!=(0)

  @annotation.compileTimeOnly(
    "Method get_aligned_area contains an OUT parameter, which is not supported yet"
  )
  def getAlignedArea() = ???

  @annotation.compileTimeOnly(
    "Method get_alignment contains an OUT parameter, which is not supported yet"
  )
  def getAlignment() = ???

  @annotation.compileTimeOnly(
    "Method get_fixed_size contains an OUT parameter, which is not supported yet"
  )
  def getFixedSize() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the given `GtkCellRenderer` is expanded.
    */
  def getIsExpanded(): Boolean =
    gtk_cell_renderer_get_is_expanded(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the given `GtkCellRenderer` is an expander.
    */
  def getIsExpander(): Boolean =
    gtk_cell_renderer_get_is_expander(this.raw.asInstanceOf).value.!=(0)

  @annotation.compileTimeOnly(
    "Method get_padding contains an OUT parameter, which is not supported yet"
  )
  def getPadding() = ???

  @annotation.compileTimeOnly(
    "Method get_preferred_height contains an OUT parameter, which is not supported yet"
  )
  def getPreferredHeight() = ???

  @annotation.compileTimeOnly(
    "Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet"
  )
  def getPreferredHeightForWidth() = ???

  @annotation.compileTimeOnly(
    "Method get_preferred_size contains an OUT parameter, which is not supported yet"
  )
  def getPreferredSize() = ???

  @annotation.compileTimeOnly(
    "Method get_preferred_width contains an OUT parameter, which is not supported yet"
  )
  def getPreferredWidth() = ???

  @annotation.compileTimeOnly(
    "Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet"
  )
  def getPreferredWidthForHeight() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the cell renderer prefers a height-for-width layout or a
    * width-for-height layout.
    */
  def getRequestMode(): GtkSizeRequestMode = gtk_cell_renderer_get_request_mode(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the cell renderer’s sensitivity.
    */
  def getSensitive(): Boolean =
    gtk_cell_renderer_get_sensitive(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translates the cell renderer state to `GtkStateFlags`, based on the cell
    * renderer and widget sensitivity, and the given `GtkCellRenderer`State.
    */
  def getState(
      widget: Widget,
      cell_state: GtkCellRendererState
  ): GtkStateFlags = gtk_cell_renderer_get_state(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    cell_state
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the cell renderer’s visibility.
    */
  def getVisible(): Boolean =
    gtk_cell_renderer_get_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the cell renderer can do something when activated.
    */
  def isActivatable(): Boolean =
    gtk_cell_renderer_is_activatable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the renderer’s alignment within its available space.
    */
  def setAlignment(xalign: Float, yalign: Float): Unit =
    gtk_cell_renderer_set_alignment(
      this.raw.asInstanceOf,
      xalign.asInstanceOf,
      yalign.asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the renderer size to be explicit, independent of the properties set.
    */
  def setFixedSize(width: Int, height: Int): Unit =
    gtk_cell_renderer_set_fixed_size(this.raw.asInstanceOf, width, height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the given `GtkCellRenderer` is expanded.
    */
  def setIsExpanded(is_expanded: Boolean): Unit =
    gtk_cell_renderer_set_is_expanded(
      this.raw.asInstanceOf,
      gboolean(gint((if is_expanded == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the given `GtkCellRenderer` is an expander.
    */
  def setIsExpander(is_expander: Boolean): Unit =
    gtk_cell_renderer_set_is_expander(
      this.raw.asInstanceOf,
      gboolean(gint((if is_expander == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the renderer’s padding.
    */
  def setPadding(xpad: Int, ypad: Int): Unit =
    gtk_cell_renderer_set_padding(this.raw.asInstanceOf, xpad, ypad)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the cell renderer’s sensitivity.
    */
  def setSensitive(sensitive: Boolean): Unit = gtk_cell_renderer_set_sensitive(
    this.raw.asInstanceOf,
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the cell renderer’s visibility.
    */
  def setVisible(visible: Boolean): Unit = gtk_cell_renderer_set_visible(
    this.raw.asInstanceOf,
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
      snapshot: Snapshot,
      widget: Widget,
      background_area: Ptr[GdkRectangle],
      cell_area: Ptr[GdkRectangle],
      flags: GtkCellRendererState
  ): Unit = gtk_cell_renderer_snapshot(
    this.raw.asInstanceOf,
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
      event: Event,
      widget: Widget,
      path: String | CString,
      background_area: Ptr[GdkRectangle],
      cell_area: Ptr[GdkRectangle],
      flags: GtkCellRendererState
  )(using Zone): CellEditable = new CellEditable.Abstract(
    gtk_cell_renderer_start_editing(
      this.raw.asInstanceOf,
      event.getUnsafeRawPointer().asInstanceOf,
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
  def stopEditing(canceled: Boolean): Unit = gtk_cell_renderer_stop_editing(
    this.raw.asInstanceOf,
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
