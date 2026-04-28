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

class CellRenderer(raw: Ptr[GtkCellRenderer])
    extends InitiallyUnowned(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

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

  // Method get_aligned_area contains an OUT parameter, which is not supported yet

  // Method get_alignment contains an OUT parameter, which is not supported yet

  // Method get_fixed_size contains an OUT parameter, which is not supported yet

  def getIsExpanded(): Boolean =
    gtk_cell_renderer_get_is_expanded(this.raw.asInstanceOf).value.!=(0)

  def getIsExpander(): Boolean =
    gtk_cell_renderer_get_is_expander(this.raw.asInstanceOf).value.!=(0)

  // Method get_padding contains an OUT parameter, which is not supported yet

  // Method get_preferred_height contains an OUT parameter, which is not supported yet

  // Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet

  // Method get_preferred_size contains an OUT parameter, which is not supported yet

  // Method get_preferred_width contains an OUT parameter, which is not supported yet

  // Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet

  def getRequestMode(): GtkSizeRequestMode = gtk_cell_renderer_get_request_mode(
    this.raw.asInstanceOf
  )

  def getSensitive(): Boolean =
    gtk_cell_renderer_get_sensitive(this.raw.asInstanceOf).value.!=(0)

  def getState(
      widget: Widget,
      cell_state: GtkCellRendererState
  ): GtkStateFlags = gtk_cell_renderer_get_state(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    cell_state
  )

  def getVisible(): Boolean =
    gtk_cell_renderer_get_visible(this.raw.asInstanceOf).value.!=(0)

  def isActivatable(): Boolean =
    gtk_cell_renderer_is_activatable(this.raw.asInstanceOf).value.!=(0)

  def setAlignment(xalign: Float, yalign: Float): Unit =
    gtk_cell_renderer_set_alignment(
      this.raw.asInstanceOf,
      xalign.asInstanceOf,
      yalign.asInstanceOf
    )

  def setFixedSize(width: Int, height: Int): Unit =
    gtk_cell_renderer_set_fixed_size(this.raw.asInstanceOf, width, height)

  def setIsExpanded(is_expanded: Boolean): Unit =
    gtk_cell_renderer_set_is_expanded(
      this.raw.asInstanceOf,
      gboolean(gint((if is_expanded == true then 1 else 0)))
    )

  def setIsExpander(is_expander: Boolean): Unit =
    gtk_cell_renderer_set_is_expander(
      this.raw.asInstanceOf,
      gboolean(gint((if is_expander == true then 1 else 0)))
    )

  def setPadding(xpad: Int, ypad: Int): Unit =
    gtk_cell_renderer_set_padding(this.raw.asInstanceOf, xpad, ypad)

  def setSensitive(sensitive: Boolean): Unit = gtk_cell_renderer_set_sensitive(
    this.raw.asInstanceOf,
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  def setVisible(visible: Boolean): Unit = gtk_cell_renderer_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

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
