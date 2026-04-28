package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellAreaContext
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.fluent.Snapshot
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCellAllocCallback
import sn.gnome.gtk4.internal.GtkCellArea
import sn.gnome.gtk4.internal.GtkCellCallback
import sn.gnome.gtk4.internal.GtkCellRendererState
import sn.gnome.gtk4.internal.GtkDirectionType
import sn.gnome.gtk4.internal.GtkSizeRequestMode
import sn.gnome.gtk4.internal.GtkTreeIter

class CellArea(raw: Ptr[GtkCellArea])
    extends InitiallyUnowned(raw.asInstanceOf),
      Buildable,
      CellLayout:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def activate(
      context: CellAreaContext,
      widget: Widget,
      cell_area: Ptr[GdkRectangle],
      flags: GtkCellRendererState,
      edit_only: Boolean
  ): Boolean = gtk_cell_area_activate(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    cell_area,
    flags,
    gboolean(gint((if edit_only == true then 1 else 0)))
  ).value.!=(0)

  def activateCell(
      widget: Widget,
      renderer: CellRenderer,
      event: Event,
      cell_area: Ptr[GdkRectangle],
      flags: GtkCellRendererState
  ): Boolean = gtk_cell_area_activate_cell(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    event.getUnsafeRawPointer().asInstanceOf,
    cell_area,
    flags
  ).value.!=(0)

  def add(renderer: CellRenderer): Unit = gtk_cell_area_add(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf
  )

  def addFocusSibling(renderer: CellRenderer, sibling: CellRenderer): Unit =
    gtk_cell_area_add_focus_sibling(
      this.raw.asInstanceOf,
      renderer.getUnsafeRawPointer().asInstanceOf,
      sibling.getUnsafeRawPointer().asInstanceOf
    )

  inline def addWithProperties(
      renderer: CellRenderer,
      first_prop_name: String | CString,
      args: Any*
  )(using Zone): Unit = gtk_cell_area_add_with_properties(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_prop_name),
    args*
  )

  def applyAttributes(
      tree_model: TreeModel,
      iter: Ptr[GtkTreeIter],
      is_expander: Boolean,
      is_expanded: Boolean
  ): Unit = gtk_cell_area_apply_attributes(
    this.raw.asInstanceOf,
    tree_model.getUnsafeRawPointer().asInstanceOf,
    iter,
    gboolean(gint((if is_expander == true then 1 else 0))),
    gboolean(gint((if is_expanded == true then 1 else 0)))
  )

  def attributeConnect(
      renderer: CellRenderer,
      attribute: String | CString,
      column: Int
  )(using Zone): Unit = gtk_cell_area_attribute_connect(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute),
    column
  )

  def attributeDisconnect(renderer: CellRenderer, attribute: String | CString)(
      using Zone
  ): Unit = gtk_cell_area_attribute_disconnect(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute)
  )

  def attributeGetColumn(renderer: CellRenderer, attribute: String | CString)(
      using Zone
  ): Int = gtk_cell_area_attribute_get_column(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(attribute)
  )

  inline def cellGet(
      renderer: CellRenderer,
      first_prop_name: String | CString,
      args: Any*
  )(using Zone): Unit = gtk_cell_area_cell_get(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_prop_name),
    args*
  )

  def cellGetProperty(
      renderer: CellRenderer,
      property_name: String | CString,
      value: Ptr[GValue]
  )(using Zone): Unit = gtk_cell_area_cell_get_property(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(property_name),
    value
  )

  def cellGetValist(
      renderer: CellRenderer,
      first_property_name: String | CString,
      var_args: CVarArgList
  )(using Zone): Unit = gtk_cell_area_cell_get_valist(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_property_name),
    var_args
  )

  inline def cellSet(
      renderer: CellRenderer,
      first_prop_name: String | CString,
      args: Any*
  )(using Zone): Unit = gtk_cell_area_cell_set(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_prop_name),
    args*
  )

  def cellSetProperty(
      renderer: CellRenderer,
      property_name: String | CString,
      value: Ptr[GValue]
  )(using Zone): Unit = gtk_cell_area_cell_set_property(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(property_name),
    value
  )

  def cellSetValist(
      renderer: CellRenderer,
      first_property_name: String | CString,
      var_args: CVarArgList
  )(using Zone): Unit = gtk_cell_area_cell_set_valist(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(first_property_name),
    var_args
  )

  def copyContext(context: CellAreaContext): CellAreaContext =
    new CellAreaContext(
      gtk_cell_area_copy_context(
        this.raw.asInstanceOf,
        context.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def createContext(): CellAreaContext = new CellAreaContext(
    gtk_cell_area_create_context(this.raw.asInstanceOf).asInstanceOf
  )

  def event(
      context: CellAreaContext,
      widget: Widget,
      event: Event,
      cell_area: Ptr[GdkRectangle],
      flags: GtkCellRendererState
  ): Int = gtk_cell_area_event(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    event.getUnsafeRawPointer().asInstanceOf,
    cell_area,
    flags
  )

  def focus(direction: GtkDirectionType): Boolean =
    gtk_cell_area_focus(this.raw.asInstanceOf, direction).value.!=(0)

  def foreach(callback: GtkCellCallback, callback_data: Ptr[Byte]): Unit =
    gtk_cell_area_foreach(
      this.raw.asInstanceOf,
      callback,
      gpointer(callback_data)
    )

  def foreachAlloc(
      context: CellAreaContext,
      widget: Widget,
      cell_area: Ptr[GdkRectangle],
      background_area: Ptr[GdkRectangle],
      callback: GtkCellAllocCallback,
      callback_data: Ptr[Byte]
  ): Unit = gtk_cell_area_foreach_alloc(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    cell_area,
    background_area,
    callback,
    gpointer(callback_data)
  )

  // Method get_cell_allocation contains an OUT parameter, which is not supported yet

  // Method get_cell_at_position contains an OUT parameter, which is not supported yet

  def getCurrentPathString()(using Zone): String = fromCString(
    gtk_cell_area_get_current_path_string(this.raw.asInstanceOf).asInstanceOf
  )

  def getEditWidget(): CellEditable = new CellEditable.Abstract(
    gtk_cell_area_get_edit_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getEditedCell(): CellRenderer = new CellRenderer(
    gtk_cell_area_get_edited_cell(this.raw.asInstanceOf).asInstanceOf
  )

  def getFocusCell(): CellRenderer = new CellRenderer(
    gtk_cell_area_get_focus_cell(this.raw.asInstanceOf).asInstanceOf
  )

  def getFocusFromSibling(renderer: CellRenderer): CellRenderer =
    new CellRenderer(
      gtk_cell_area_get_focus_from_sibling(
        this.raw.asInstanceOf,
        renderer.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def getFocusSiblings(renderer: CellRenderer): Ptr[GList] =
    gtk_cell_area_get_focus_siblings(
      this.raw.asInstanceOf,
      renderer.getUnsafeRawPointer().asInstanceOf
    )

  // Method get_preferred_height contains an OUT parameter, which is not supported yet

  // Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet

  // Method get_preferred_width contains an OUT parameter, which is not supported yet

  // Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet

  def getRequestMode(): GtkSizeRequestMode = gtk_cell_area_get_request_mode(
    this.raw.asInstanceOf
  )

  def hasRenderer(renderer: CellRenderer): Boolean = gtk_cell_area_has_renderer(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  // Method inner_cell_area contains an OUT parameter, which is not supported yet

  def isActivatable(): Boolean =
    gtk_cell_area_is_activatable(this.raw.asInstanceOf).value.!=(0)

  def isFocusSibling(renderer: CellRenderer, sibling: CellRenderer): Boolean =
    gtk_cell_area_is_focus_sibling(
      this.raw.asInstanceOf,
      renderer.getUnsafeRawPointer().asInstanceOf,
      sibling.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def remove(renderer: CellRenderer): Unit = gtk_cell_area_remove(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf
  )

  def removeFocusSibling(renderer: CellRenderer, sibling: CellRenderer): Unit =
    gtk_cell_area_remove_focus_sibling(
      this.raw.asInstanceOf,
      renderer.getUnsafeRawPointer().asInstanceOf,
      sibling.getUnsafeRawPointer().asInstanceOf
    )

  // Method request_renderer contains an OUT parameter, which is not supported yet

  def setFocusCell(renderer: CellRenderer): Unit = gtk_cell_area_set_focus_cell(
    this.raw.asInstanceOf,
    renderer.getUnsafeRawPointer().asInstanceOf
  )

  def snapshot(
      context: CellAreaContext,
      widget: Widget,
      snapshot: Snapshot,
      background_area: Ptr[GdkRectangle],
      cell_area: Ptr[GdkRectangle],
      flags: GtkCellRendererState,
      paint_focus: Boolean
  ): Unit = gtk_cell_area_snapshot(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    snapshot.getUnsafeRawPointer().asInstanceOf,
    background_area,
    cell_area,
    flags,
    gboolean(gint((if paint_focus == true then 1 else 0)))
  )

  def stopEditing(canceled: Boolean): Unit = gtk_cell_area_stop_editing(
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
end CellArea
