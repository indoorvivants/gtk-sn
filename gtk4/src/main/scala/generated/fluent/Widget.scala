package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.cairo.internal.cairo_font_options_t
import sn.gnome.gdk4.fluent.Clipboard
import sn.gnome.gdk4.fluent.Cursor
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.FrameClock
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gsk4.internal.GskTransform
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.Settings
import sn.gnome.gtk4.fluent.Snapshot
import sn.gnome.gtk4.fluent.StyleContext
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkAlign
import sn.gnome.gtk4.internal.GtkAllocation
import sn.gnome.gtk4.internal.GtkDirectionType
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkOverflow
import sn.gnome.gtk4.internal.GtkPickFlags
import sn.gnome.gtk4.internal.GtkSizeRequestMode
import sn.gnome.gtk4.internal.GtkStateFlags
import sn.gnome.gtk4.internal.GtkTextDirection
import sn.gnome.gtk4.internal.GtkTickCallback
import sn.gnome.gtk4.internal.GtkWidget
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.fluent.Layout

class Widget(raw: Ptr[GtkWidget])
    extends InitiallyUnowned(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def actionSetEnabled(action_name: String | CString, enabled: Boolean)(using
      Zone
  ): Unit = gtk_widget_action_set_enabled(
    this.raw.asInstanceOf,
    __sn_extract_string(action_name),
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  def activate(): Boolean =
    gtk_widget_activate(this.raw.asInstanceOf).value.!=(0)

  inline def activateAction(
      name: String | CString,
      format_string: String | CString,
      args: Any*
  )(using Zone): Boolean = gtk_widget_activate_action(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    __sn_extract_string(format_string),
    args*
  ).value.!=(0)

  def activateActionVariant(name: String | CString, args: Ptr[GVariant])(using
      Zone
  ): Boolean = gtk_widget_activate_action_variant(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    args
  ).value.!=(0)

  def activateDefault(): Unit = gtk_widget_activate_default(
    this.raw.asInstanceOf
  )

  def addController(controller: EventController): Unit =
    gtk_widget_add_controller(
      this.raw.asInstanceOf,
      controller.getUnsafeRawPointer().asInstanceOf
    )

  def addCssClass(css_class: String | CString)(using Zone): Unit =
    gtk_widget_add_css_class(
      this.raw.asInstanceOf,
      __sn_extract_string(css_class)
    )

  def addMnemonicLabel(label: Widget): Unit = gtk_widget_add_mnemonic_label(
    this.raw.asInstanceOf,
    label.getUnsafeRawPointer().asInstanceOf
  )

  def addTickCallback(
      callback: GtkTickCallback,
      user_data: Ptr[Byte],
      _notify: GDestroyNotify
  ): UInt = gtk_widget_add_tick_callback(
    this.raw.asInstanceOf,
    callback,
    gpointer(user_data),
    _notify
  ).value

  def allocate(
      width: Int,
      height: Int,
      baseline: Int,
      transform: Ptr[GskTransform]
  ): Unit = gtk_widget_allocate(
    this.raw.asInstanceOf,
    width,
    height,
    baseline,
    transform
  )

  def childFocus(direction: GtkDirectionType): Boolean =
    gtk_widget_child_focus(this.raw.asInstanceOf, direction).value.!=(0)

  // Method compute_bounds contains an OUT parameter, which is not supported yet

  def computeExpand(orientation: GtkOrientation): Boolean =
    gtk_widget_compute_expand(this.raw.asInstanceOf, orientation).value.!=(0)

  // Method compute_point contains an OUT parameter, which is not supported yet

  // Method compute_transform contains an OUT parameter, which is not supported yet

  def contains(x: Double, y: Double): Boolean =
    gtk_widget_contains(this.raw.asInstanceOf, x, y).value.!=(0)

  def createPangoContext(): Context = new Context(
    gtk_widget_create_pango_context(this.raw.asInstanceOf).asInstanceOf
  )

  def createPangoLayout(text: String | CString)(using Zone): Layout =
    new Layout(
      gtk_widget_create_pango_layout(
        this.raw.asInstanceOf,
        __sn_extract_string(text)
      ).asInstanceOf
    )

  def disposeTemplate(widget_type: GType): Unit =
    gtk_widget_dispose_template(this.raw.asInstanceOf, widget_type)

  def dragCheckThreshold(
      start_x: Int,
      start_y: Int,
      current_x: Int,
      current_y: Int
  ): Boolean = gtk_drag_check_threshold(
    this.raw.asInstanceOf,
    start_x,
    start_y,
    current_x,
    current_y
  ).value.!=(0)

  def errorBell(): Unit = gtk_widget_error_bell(this.raw.asInstanceOf)

  def getAllocatedBaseline(): Int = gtk_widget_get_allocated_baseline(
    this.raw.asInstanceOf
  )

  def getAllocatedHeight(): Int = gtk_widget_get_allocated_height(
    this.raw.asInstanceOf
  )

  def getAllocatedWidth(): Int = gtk_widget_get_allocated_width(
    this.raw.asInstanceOf
  )

  // Method get_allocation contains an OUT parameter, which is not supported yet

  def getAncestor(widget_type: GType): Widget = new Widget(
    gtk_widget_get_ancestor(this.raw.asInstanceOf, widget_type).asInstanceOf
  )

  def getBaseline(): Int = gtk_widget_get_baseline(this.raw.asInstanceOf)

  def getCanFocus(): Boolean =
    gtk_widget_get_can_focus(this.raw.asInstanceOf).value.!=(0)

  def getCanTarget(): Boolean =
    gtk_widget_get_can_target(this.raw.asInstanceOf).value.!=(0)

  def getChildVisible(): Boolean =
    gtk_widget_get_child_visible(this.raw.asInstanceOf).value.!=(0)

  def getClipboard(): Clipboard = new Clipboard(
    gtk_widget_get_clipboard(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_color contains an OUT parameter, which is not supported yet

  def getCssName()(using Zone): String = fromCString(
    gtk_widget_get_css_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getCursor(): Cursor = new Cursor(
    gtk_widget_get_cursor(this.raw.asInstanceOf).asInstanceOf
  )

  def getDirection(): GtkTextDirection = gtk_widget_get_direction(
    this.raw.asInstanceOf
  )

  def getDisplay(): Display = new Display(
    gtk_widget_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getFirstChild(): Widget = new Widget(
    gtk_widget_get_first_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getFocusChild(): Widget = new Widget(
    gtk_widget_get_focus_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getFocusOnClick(): Boolean =
    gtk_widget_get_focus_on_click(this.raw.asInstanceOf).value.!=(0)

  def getFocusable(): Boolean =
    gtk_widget_get_focusable(this.raw.asInstanceOf).value.!=(0)

  def getFontMap(): FontMap = new FontMap(
    gtk_widget_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  def getFontOptions(): Ptr[cairo_font_options_t] = gtk_widget_get_font_options(
    this.raw.asInstanceOf
  )

  def getFrameClock(): FrameClock = new FrameClock(
    gtk_widget_get_frame_clock(this.raw.asInstanceOf).asInstanceOf
  )

  def getHalign(): GtkAlign = gtk_widget_get_halign(this.raw.asInstanceOf)

  def getHasTooltip(): Boolean =
    gtk_widget_get_has_tooltip(this.raw.asInstanceOf).value.!=(0)

  def getHeight(): Int = gtk_widget_get_height(this.raw.asInstanceOf)

  def getHexpand(): Boolean =
    gtk_widget_get_hexpand(this.raw.asInstanceOf).value.!=(0)

  def getHexpandSet(): Boolean =
    gtk_widget_get_hexpand_set(this.raw.asInstanceOf).value.!=(0)

  def getLastChild(): Widget = new Widget(
    gtk_widget_get_last_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getLayoutManager(): LayoutManager = new LayoutManager(
    gtk_widget_get_layout_manager(this.raw.asInstanceOf).asInstanceOf
  )

  def getMapped(): Boolean =
    gtk_widget_get_mapped(this.raw.asInstanceOf).value.!=(0)

  def getMarginBottom(): Int = gtk_widget_get_margin_bottom(
    this.raw.asInstanceOf
  )

  def getMarginEnd(): Int = gtk_widget_get_margin_end(this.raw.asInstanceOf)

  def getMarginStart(): Int = gtk_widget_get_margin_start(this.raw.asInstanceOf)

  def getMarginTop(): Int = gtk_widget_get_margin_top(this.raw.asInstanceOf)

  def getName()(using Zone): String = fromCString(
    gtk_widget_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getNative(): Native = new Native.Abstract(
    gtk_widget_get_native(this.raw.asInstanceOf).asInstanceOf
  )

  def getNextSibling(): Widget = new Widget(
    gtk_widget_get_next_sibling(this.raw.asInstanceOf).asInstanceOf
  )

  def getOpacity(): Double = gtk_widget_get_opacity(this.raw.asInstanceOf)

  def getOverflow(): GtkOverflow = gtk_widget_get_overflow(
    this.raw.asInstanceOf
  )

  def getPangoContext(): Context = new Context(
    gtk_widget_get_pango_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getParent(): Widget = new Widget(
    gtk_widget_get_parent(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_preferred_size contains an OUT parameter, which is not supported yet

  def getPrevSibling(): Widget = new Widget(
    gtk_widget_get_prev_sibling(this.raw.asInstanceOf).asInstanceOf
  )

  def getPrimaryClipboard(): Clipboard = new Clipboard(
    gtk_widget_get_primary_clipboard(this.raw.asInstanceOf).asInstanceOf
  )

  def getRealized(): Boolean =
    gtk_widget_get_realized(this.raw.asInstanceOf).value.!=(0)

  def getReceivesDefault(): Boolean =
    gtk_widget_get_receives_default(this.raw.asInstanceOf).value.!=(0)

  def getRequestMode(): GtkSizeRequestMode = gtk_widget_get_request_mode(
    this.raw.asInstanceOf
  )

  def getRoot(): Root =
    new Root.Abstract(gtk_widget_get_root(this.raw.asInstanceOf).asInstanceOf)

  def getScaleFactor(): Int = gtk_widget_get_scale_factor(this.raw.asInstanceOf)

  def getSensitive(): Boolean =
    gtk_widget_get_sensitive(this.raw.asInstanceOf).value.!=(0)

  def getSettings(): Settings = new Settings(
    gtk_widget_get_settings(this.raw.asInstanceOf).asInstanceOf
  )

  def getSize(orientation: GtkOrientation): Int =
    gtk_widget_get_size(this.raw.asInstanceOf, orientation)

  // Method get_size_request contains an OUT parameter, which is not supported yet

  def getStateFlags(): GtkStateFlags = gtk_widget_get_state_flags(
    this.raw.asInstanceOf
  )

  def getStyleContext(): StyleContext = new StyleContext(
    gtk_widget_get_style_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getTemplateChild(widget_type: GType, name: String | CString)(using
      Zone
  ): Object = new Object(
    gtk_widget_get_template_child(
      this.raw.asInstanceOf,
      widget_type,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  def getTooltipMarkup()(using Zone): String = fromCString(
    gtk_widget_get_tooltip_markup(this.raw.asInstanceOf).asInstanceOf
  )

  def getTooltipText()(using Zone): String = fromCString(
    gtk_widget_get_tooltip_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getValign(): GtkAlign = gtk_widget_get_valign(this.raw.asInstanceOf)

  def getVexpand(): Boolean =
    gtk_widget_get_vexpand(this.raw.asInstanceOf).value.!=(0)

  def getVexpandSet(): Boolean =
    gtk_widget_get_vexpand_set(this.raw.asInstanceOf).value.!=(0)

  def getVisible(): Boolean =
    gtk_widget_get_visible(this.raw.asInstanceOf).value.!=(0)

  def getWidth(): Int = gtk_widget_get_width(this.raw.asInstanceOf)

  def grabFocus(): Boolean =
    gtk_widget_grab_focus(this.raw.asInstanceOf).value.!=(0)

  def hasCssClass(css_class: String | CString)(using Zone): Boolean =
    gtk_widget_has_css_class(
      this.raw.asInstanceOf,
      __sn_extract_string(css_class)
    ).value.!=(0)

  def hasDefault(): Boolean =
    gtk_widget_has_default(this.raw.asInstanceOf).value.!=(0)

  def hasFocus(): Boolean =
    gtk_widget_has_focus(this.raw.asInstanceOf).value.!=(0)

  def hasVisibleFocus(): Boolean =
    gtk_widget_has_visible_focus(this.raw.asInstanceOf).value.!=(0)

  def hide(): Unit = gtk_widget_hide(this.raw.asInstanceOf)

  def inDestruction(): Boolean =
    gtk_widget_in_destruction(this.raw.asInstanceOf).value.!=(0)

  def initTemplate(): Unit = gtk_widget_init_template(this.raw.asInstanceOf)

  def insertActionGroup(name: String | CString, group: ActionGroup)(using
      Zone
  ): Unit = gtk_widget_insert_action_group(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    group.getUnsafeRawPointer().asInstanceOf
  )

  def insertAfter(parent: Widget, previous_sibling: Widget): Unit =
    gtk_widget_insert_after(
      this.raw.asInstanceOf,
      parent.getUnsafeRawPointer().asInstanceOf,
      previous_sibling.getUnsafeRawPointer().asInstanceOf
    )

  def insertBefore(parent: Widget, next_sibling: Widget): Unit =
    gtk_widget_insert_before(
      this.raw.asInstanceOf,
      parent.getUnsafeRawPointer().asInstanceOf,
      next_sibling.getUnsafeRawPointer().asInstanceOf
    )

  def isAncestor(ancestor: Widget): Boolean = gtk_widget_is_ancestor(
    this.raw.asInstanceOf,
    ancestor.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def isDrawable(): Boolean =
    gtk_widget_is_drawable(this.raw.asInstanceOf).value.!=(0)

  def isFocus(): Boolean =
    gtk_widget_is_focus(this.raw.asInstanceOf).value.!=(0)

  def isSensitive(): Boolean =
    gtk_widget_is_sensitive(this.raw.asInstanceOf).value.!=(0)

  def isVisible(): Boolean =
    gtk_widget_is_visible(this.raw.asInstanceOf).value.!=(0)

  def keynavFailed(direction: GtkDirectionType): Boolean =
    gtk_widget_keynav_failed(this.raw.asInstanceOf, direction).value.!=(0)

  def listMnemonicLabels(): Ptr[GList] = gtk_widget_list_mnemonic_labels(
    this.raw.asInstanceOf
  )

  def map(): Unit = gtk_widget_map(this.raw.asInstanceOf)

  // Method measure contains an OUT parameter, which is not supported yet

  def mnemonicActivate(group_cycling: Boolean): Boolean =
    gtk_widget_mnemonic_activate(
      this.raw.asInstanceOf,
      gboolean(gint((if group_cycling == true then 1 else 0)))
    ).value.!=(0)

  def observeChildren(): ListModel = new ListModel.Abstract(
    gtk_widget_observe_children(this.raw.asInstanceOf).asInstanceOf
  )

  def observeControllers(): ListModel = new ListModel.Abstract(
    gtk_widget_observe_controllers(this.raw.asInstanceOf).asInstanceOf
  )

  def pick(x: Double, y: Double, flags: GtkPickFlags): Widget = new Widget(
    gtk_widget_pick(this.raw.asInstanceOf, x, y, flags).asInstanceOf
  )

  def queueAllocate(): Unit = gtk_widget_queue_allocate(this.raw.asInstanceOf)

  def queueDraw(): Unit = gtk_widget_queue_draw(this.raw.asInstanceOf)

  def queueResize(): Unit = gtk_widget_queue_resize(this.raw.asInstanceOf)

  def realize(): Unit = gtk_widget_realize(this.raw.asInstanceOf)

  def removeController(controller: EventController): Unit =
    gtk_widget_remove_controller(
      this.raw.asInstanceOf,
      controller.getUnsafeRawPointer().asInstanceOf
    )

  def removeCssClass(css_class: String | CString)(using Zone): Unit =
    gtk_widget_remove_css_class(
      this.raw.asInstanceOf,
      __sn_extract_string(css_class)
    )

  def removeMnemonicLabel(label: Widget): Unit =
    gtk_widget_remove_mnemonic_label(
      this.raw.asInstanceOf,
      label.getUnsafeRawPointer().asInstanceOf
    )

  def removeTickCallback(id: UInt): Unit =
    gtk_widget_remove_tick_callback(this.raw.asInstanceOf, guint(id))

  def setCanFocus(can_focus: Boolean): Unit = gtk_widget_set_can_focus(
    this.raw.asInstanceOf,
    gboolean(gint((if can_focus == true then 1 else 0)))
  )

  def setCanTarget(can_target: Boolean): Unit = gtk_widget_set_can_target(
    this.raw.asInstanceOf,
    gboolean(gint((if can_target == true then 1 else 0)))
  )

  def setChildVisible(child_visible: Boolean): Unit =
    gtk_widget_set_child_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if child_visible == true then 1 else 0)))
    )

  // Method set_css_classes contains an array parameter, which is not supported yet

  def setCursor(cursor: Cursor): Unit = gtk_widget_set_cursor(
    this.raw.asInstanceOf,
    cursor.getUnsafeRawPointer().asInstanceOf
  )

  def setCursorFromName(name: String | CString)(using Zone): Unit =
    gtk_widget_set_cursor_from_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def setDirection(dir: GtkTextDirection): Unit =
    gtk_widget_set_direction(this.raw.asInstanceOf, dir)

  def setFocusChild(child: Widget): Unit = gtk_widget_set_focus_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setFocusOnClick(focus_on_click: Boolean): Unit =
    gtk_widget_set_focus_on_click(
      this.raw.asInstanceOf,
      gboolean(gint((if focus_on_click == true then 1 else 0)))
    )

  def setFocusable(focusable: Boolean): Unit = gtk_widget_set_focusable(
    this.raw.asInstanceOf,
    gboolean(gint((if focusable == true then 1 else 0)))
  )

  def setFontMap(font_map: FontMap): Unit = gtk_widget_set_font_map(
    this.raw.asInstanceOf,
    font_map.getUnsafeRawPointer().asInstanceOf
  )

  def setFontOptions(options: Ptr[cairo_font_options_t]): Unit =
    gtk_widget_set_font_options(this.raw.asInstanceOf, options)

  def setHalign(align: GtkAlign): Unit =
    gtk_widget_set_halign(this.raw.asInstanceOf, align)

  def setHasTooltip(has_tooltip: Boolean): Unit = gtk_widget_set_has_tooltip(
    this.raw.asInstanceOf,
    gboolean(gint((if has_tooltip == true then 1 else 0)))
  )

  def setHexpand(expand: Boolean): Unit = gtk_widget_set_hexpand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  def setHexpandSet(set: Boolean): Unit = gtk_widget_set_hexpand_set(
    this.raw.asInstanceOf,
    gboolean(gint((if set == true then 1 else 0)))
  )

  def setLayoutManager(layout_manager: LayoutManager): Unit =
    gtk_widget_set_layout_manager(
      this.raw.asInstanceOf,
      layout_manager.getUnsafeRawPointer().asInstanceOf
    )

  def setMarginBottom(margin: Int): Unit =
    gtk_widget_set_margin_bottom(this.raw.asInstanceOf, margin)

  def setMarginEnd(margin: Int): Unit =
    gtk_widget_set_margin_end(this.raw.asInstanceOf, margin)

  def setMarginStart(margin: Int): Unit =
    gtk_widget_set_margin_start(this.raw.asInstanceOf, margin)

  def setMarginTop(margin: Int): Unit =
    gtk_widget_set_margin_top(this.raw.asInstanceOf, margin)

  def setName(name: String | CString)(using Zone): Unit =
    gtk_widget_set_name(this.raw.asInstanceOf, __sn_extract_string(name))

  def setOpacity(opacity: Double): Unit =
    gtk_widget_set_opacity(this.raw.asInstanceOf, opacity)

  def setOverflow(overflow: GtkOverflow): Unit =
    gtk_widget_set_overflow(this.raw.asInstanceOf, overflow)

  def setParent(parent: Widget): Unit = gtk_widget_set_parent(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf
  )

  def setReceivesDefault(receives_default: Boolean): Unit =
    gtk_widget_set_receives_default(
      this.raw.asInstanceOf,
      gboolean(gint((if receives_default == true then 1 else 0)))
    )

  def setSensitive(sensitive: Boolean): Unit = gtk_widget_set_sensitive(
    this.raw.asInstanceOf,
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  def setSizeRequest(width: Int, height: Int): Unit =
    gtk_widget_set_size_request(this.raw.asInstanceOf, width, height)

  def setStateFlags(flags: GtkStateFlags, clear: Boolean): Unit =
    gtk_widget_set_state_flags(
      this.raw.asInstanceOf,
      flags,
      gboolean(gint((if clear == true then 1 else 0)))
    )

  def setTooltipMarkup(markup: String | CString)(using Zone): Unit =
    gtk_widget_set_tooltip_markup(
      this.raw.asInstanceOf,
      __sn_extract_string(markup)
    )

  def setTooltipText(text: String | CString)(using Zone): Unit =
    gtk_widget_set_tooltip_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  def setValign(align: GtkAlign): Unit =
    gtk_widget_set_valign(this.raw.asInstanceOf, align)

  def setVexpand(expand: Boolean): Unit = gtk_widget_set_vexpand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  def setVexpandSet(set: Boolean): Unit = gtk_widget_set_vexpand_set(
    this.raw.asInstanceOf,
    gboolean(gint((if set == true then 1 else 0)))
  )

  def setVisible(visible: Boolean): Unit = gtk_widget_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  def shouldLayout(): Boolean =
    gtk_widget_should_layout(this.raw.asInstanceOf).value.!=(0)

  def show(): Unit = gtk_widget_show(this.raw.asInstanceOf)

  def sizeAllocate(allocation: Ptr[GtkAllocation], baseline: Int): Unit =
    gtk_widget_size_allocate(this.raw.asInstanceOf, allocation, baseline)

  def snapshotChild(child: Widget, snapshot: Snapshot): Unit =
    gtk_widget_snapshot_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      snapshot.getUnsafeRawPointer().asInstanceOf
    )

  // Method translate_coordinates contains an OUT parameter, which is not supported yet

  def triggerTooltipQuery(): Unit = gtk_widget_trigger_tooltip_query(
    this.raw.asInstanceOf
  )

  def unmap(): Unit = gtk_widget_unmap(this.raw.asInstanceOf)

  def unparent(): Unit = gtk_widget_unparent(this.raw.asInstanceOf)

  def unrealize(): Unit = gtk_widget_unrealize(this.raw.asInstanceOf)

  def unsetStateFlags(flags: GtkStateFlags): Unit =
    gtk_widget_unset_state_flags(this.raw.asInstanceOf, flags)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Widget
