package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.TextBuffer
import sn.gnome.gtk4.fluent.TextChildAnchor
import sn.gnome.gtk4.fluent.TextMark
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkInputHints
import sn.gnome.gtk4.internal.GtkInputPurpose
import sn.gnome.gtk4.internal.GtkJustification
import sn.gnome.gtk4.internal.GtkTextIter
import sn.gnome.gtk4.internal.GtkTextView
import sn.gnome.gtk4.internal.GtkTextWindowType
import sn.gnome.gtk4.internal.GtkWrapMode
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.internal.PangoTabArray

class TextView(raw: Ptr[GtkTextView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addChildAtAnchor(child: Widget, anchor: TextChildAnchor): Unit =
    gtk_text_view_add_child_at_anchor(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      anchor.getUnsafeRawPointer().asInstanceOf
    )

  def addOverlay(child: Widget, xpos: Int, ypos: Int): Unit =
    gtk_text_view_add_overlay(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      xpos,
      ypos
    )

  def backwardDisplayLine(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_backward_display_line(this.raw.asInstanceOf, iter).value.!=(0)

  def backwardDisplayLineStart(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_backward_display_line_start(this.raw.asInstanceOf, iter).value
      .!=(0)

  // Method buffer_to_window_coords contains an OUT parameter, which is not supported yet

  def forwardDisplayLine(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_forward_display_line(this.raw.asInstanceOf, iter).value.!=(0)

  def forwardDisplayLineEnd(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_forward_display_line_end(this.raw.asInstanceOf, iter).value
      .!=(0)

  def getAcceptsTab(): Boolean =
    gtk_text_view_get_accepts_tab(this.raw.asInstanceOf).value.!=(0)

  def getBottomMargin(): Int = gtk_text_view_get_bottom_margin(
    this.raw.asInstanceOf
  )

  def getBuffer(): TextBuffer = new TextBuffer(
    gtk_text_view_get_buffer(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_cursor_locations contains an OUT parameter, which is not supported yet

  def getCursorVisible(): Boolean =
    gtk_text_view_get_cursor_visible(this.raw.asInstanceOf).value.!=(0)

  def getEditable(): Boolean =
    gtk_text_view_get_editable(this.raw.asInstanceOf).value.!=(0)

  def getExtraMenu(): MenuModel = new MenuModel(
    gtk_text_view_get_extra_menu(this.raw.asInstanceOf).asInstanceOf
  )

  def getGutter(win: GtkTextWindowType): Widget = new Widget(
    gtk_text_view_get_gutter(this.raw.asInstanceOf, win).asInstanceOf
  )

  def getIndent(): Int = gtk_text_view_get_indent(this.raw.asInstanceOf)

  def getInputHints(): GtkInputHints = gtk_text_view_get_input_hints(
    this.raw.asInstanceOf
  )

  def getInputPurpose(): GtkInputPurpose = gtk_text_view_get_input_purpose(
    this.raw.asInstanceOf
  )

  // Method get_iter_at_location contains an OUT parameter, which is not supported yet

  // Method get_iter_at_position contains an OUT parameter, which is not supported yet

  // Method get_iter_location contains an OUT parameter, which is not supported yet

  def getJustification(): GtkJustification = gtk_text_view_get_justification(
    this.raw.asInstanceOf
  )

  def getLeftMargin(): Int = gtk_text_view_get_left_margin(
    this.raw.asInstanceOf
  )

  // Method get_line_at_y contains an OUT parameter, which is not supported yet

  // Method get_line_yrange contains an OUT parameter, which is not supported yet

  def getLtrContext(): Context = new Context(
    gtk_text_view_get_ltr_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getMonospace(): Boolean =
    gtk_text_view_get_monospace(this.raw.asInstanceOf).value.!=(0)

  def getOverwrite(): Boolean =
    gtk_text_view_get_overwrite(this.raw.asInstanceOf).value.!=(0)

  def getPixelsAboveLines(): Int = gtk_text_view_get_pixels_above_lines(
    this.raw.asInstanceOf
  )

  def getPixelsBelowLines(): Int = gtk_text_view_get_pixels_below_lines(
    this.raw.asInstanceOf
  )

  def getPixelsInsideWrap(): Int = gtk_text_view_get_pixels_inside_wrap(
    this.raw.asInstanceOf
  )

  def getRightMargin(): Int = gtk_text_view_get_right_margin(
    this.raw.asInstanceOf
  )

  def getRtlContext(): Context = new Context(
    gtk_text_view_get_rtl_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getTabs(): Ptr[PangoTabArray] = gtk_text_view_get_tabs(
    this.raw.asInstanceOf
  )

  def getTopMargin(): Int = gtk_text_view_get_top_margin(this.raw.asInstanceOf)

  // Method get_visible_rect contains an OUT parameter, which is not supported yet

  def getWrapMode(): GtkWrapMode = gtk_text_view_get_wrap_mode(
    this.raw.asInstanceOf
  )

  def imContextFilterKeypress(event: Event): Boolean =
    gtk_text_view_im_context_filter_keypress(
      this.raw.asInstanceOf,
      event.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def moveMarkOnscreen(mark: TextMark): Boolean =
    gtk_text_view_move_mark_onscreen(
      this.raw.asInstanceOf,
      mark.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def moveOverlay(child: Widget, xpos: Int, ypos: Int): Unit =
    gtk_text_view_move_overlay(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      xpos,
      ypos
    )

  def moveVisually(iter: Ptr[GtkTextIter], count: Int): Boolean =
    gtk_text_view_move_visually(this.raw.asInstanceOf, iter, count).value.!=(0)

  def placeCursorOnscreen(): Boolean =
    gtk_text_view_place_cursor_onscreen(this.raw.asInstanceOf).value.!=(0)

  def remove(child: Widget): Unit = gtk_text_view_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def resetCursorBlink(): Unit = gtk_text_view_reset_cursor_blink(
    this.raw.asInstanceOf
  )

  def resetImContext(): Unit = gtk_text_view_reset_im_context(
    this.raw.asInstanceOf
  )

  def scrollMarkOnscreen(mark: TextMark): Unit =
    gtk_text_view_scroll_mark_onscreen(
      this.raw.asInstanceOf,
      mark.getUnsafeRawPointer().asInstanceOf
    )

  def scrollToIter(
      iter: Ptr[GtkTextIter],
      within_margin: Double,
      use_align: Boolean,
      xalign: Double,
      yalign: Double
  ): Boolean = gtk_text_view_scroll_to_iter(
    this.raw.asInstanceOf,
    iter,
    within_margin,
    gboolean(gint((if use_align == true then 1 else 0))),
    xalign,
    yalign
  ).value.!=(0)

  def scrollToMark(
      mark: TextMark,
      within_margin: Double,
      use_align: Boolean,
      xalign: Double,
      yalign: Double
  ): Unit = gtk_text_view_scroll_to_mark(
    this.raw.asInstanceOf,
    mark.getUnsafeRawPointer().asInstanceOf,
    within_margin,
    gboolean(gint((if use_align == true then 1 else 0))),
    xalign,
    yalign
  )

  def setAcceptsTab(accepts_tab: Boolean): Unit = gtk_text_view_set_accepts_tab(
    this.raw.asInstanceOf,
    gboolean(gint((if accepts_tab == true then 1 else 0)))
  )

  def setBottomMargin(bottom_margin: Int): Unit =
    gtk_text_view_set_bottom_margin(this.raw.asInstanceOf, bottom_margin)

  def setBuffer(buffer: TextBuffer): Unit = gtk_text_view_set_buffer(
    this.raw.asInstanceOf,
    buffer.getUnsafeRawPointer().asInstanceOf
  )

  def setCursorVisible(setting: Boolean): Unit =
    gtk_text_view_set_cursor_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setEditable(setting: Boolean): Unit = gtk_text_view_set_editable(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setExtraMenu(model: MenuModel): Unit = gtk_text_view_set_extra_menu(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setGutter(win: GtkTextWindowType, widget: Widget): Unit =
    gtk_text_view_set_gutter(
      this.raw.asInstanceOf,
      win,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  def setIndent(indent: Int): Unit =
    gtk_text_view_set_indent(this.raw.asInstanceOf, indent)

  def setInputHints(hints: GtkInputHints): Unit =
    gtk_text_view_set_input_hints(this.raw.asInstanceOf, hints)

  def setInputPurpose(purpose: GtkInputPurpose): Unit =
    gtk_text_view_set_input_purpose(this.raw.asInstanceOf, purpose)

  def setJustification(justification: GtkJustification): Unit =
    gtk_text_view_set_justification(this.raw.asInstanceOf, justification)

  def setLeftMargin(left_margin: Int): Unit =
    gtk_text_view_set_left_margin(this.raw.asInstanceOf, left_margin)

  def setMonospace(monospace: Boolean): Unit = gtk_text_view_set_monospace(
    this.raw.asInstanceOf,
    gboolean(gint((if monospace == true then 1 else 0)))
  )

  def setOverwrite(overwrite: Boolean): Unit = gtk_text_view_set_overwrite(
    this.raw.asInstanceOf,
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  def setPixelsAboveLines(pixels_above_lines: Int): Unit =
    gtk_text_view_set_pixels_above_lines(
      this.raw.asInstanceOf,
      pixels_above_lines
    )

  def setPixelsBelowLines(pixels_below_lines: Int): Unit =
    gtk_text_view_set_pixels_below_lines(
      this.raw.asInstanceOf,
      pixels_below_lines
    )

  def setPixelsInsideWrap(pixels_inside_wrap: Int): Unit =
    gtk_text_view_set_pixels_inside_wrap(
      this.raw.asInstanceOf,
      pixels_inside_wrap
    )

  def setRightMargin(right_margin: Int): Unit =
    gtk_text_view_set_right_margin(this.raw.asInstanceOf, right_margin)

  def setTabs(tabs: Ptr[PangoTabArray]): Unit =
    gtk_text_view_set_tabs(this.raw.asInstanceOf, tabs)

  def setTopMargin(top_margin: Int): Unit =
    gtk_text_view_set_top_margin(this.raw.asInstanceOf, top_margin)

  def setWrapMode(wrap_mode: GtkWrapMode): Unit =
    gtk_text_view_set_wrap_mode(this.raw.asInstanceOf, wrap_mode)

  def startsDisplayLine(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_starts_display_line(this.raw.asInstanceOf, iter).value.!=(0)

  // Method window_to_buffer_coords contains an OUT parameter, which is not supported yet

end TextView

object TextView:
  def apply(): TextView = new TextView(gtk_text_view_new().asInstanceOf)
  def withBuffer(buffer: TextBuffer): TextView = new TextView(
    gtk_text_view_new_with_buffer(
      buffer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end TextView
