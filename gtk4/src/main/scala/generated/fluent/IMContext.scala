package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkIMContext

class IMContext(raw: Ptr[GtkIMContext]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def deleteSurrounding(offset: Int, n_chars: Int): Boolean =
    gtk_im_context_delete_surrounding(
      this.raw.asInstanceOf,
      offset,
      n_chars
    ).value.!=(0)

  def filterKey(
      press: Boolean,
      surface: Surface,
      device: Device,
      time: UInt,
      keycode: UInt,
      state: GdkModifierType,
      group: Int
  ): Boolean = gtk_im_context_filter_key(
    this.raw.asInstanceOf,
    gboolean(gint((if press == true then 1 else 0))),
    surface.getUnsafeRawPointer().asInstanceOf,
    device.getUnsafeRawPointer().asInstanceOf,
    guint32(time),
    guint(keycode),
    state,
    group
  ).value.!=(0)

  def filterKeypress(event: Event): Boolean = gtk_im_context_filter_keypress(
    this.raw.asInstanceOf,
    event.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def focusIn(): Unit = gtk_im_context_focus_in(this.raw.asInstanceOf)

  def focusOut(): Unit = gtk_im_context_focus_out(this.raw.asInstanceOf)

  // Method get_preedit_string contains an OUT parameter, which is not supported yet

  // Method get_surrounding contains an OUT parameter, which is not supported yet

  // Method get_surrounding_with_selection contains an OUT parameter, which is not supported yet

  def reset(): Unit = gtk_im_context_reset(this.raw.asInstanceOf)

  def setClientWidget(widget: Widget): Unit = gtk_im_context_set_client_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def setCursorLocation(area: Ptr[GdkRectangle]): Unit =
    gtk_im_context_set_cursor_location(this.raw.asInstanceOf, area)

  def setSurrounding(text: String | CString, len: Int, cursor_index: Int)(using
      Zone
  ): Unit = gtk_im_context_set_surrounding(
    this.raw.asInstanceOf,
    __sn_extract_string(text),
    len,
    cursor_index
  )

  def setSurroundingWithSelection(
      text: String | CString,
      len: Int,
      cursor_index: Int,
      anchor_index: Int
  )(using Zone): Unit = gtk_im_context_set_surrounding_with_selection(
    this.raw.asInstanceOf,
    __sn_extract_string(text),
    len,
    cursor_index,
    anchor_index
  )

  def setUsePreedit(use_preedit: Boolean): Unit =
    gtk_im_context_set_use_preedit(
      this.raw.asInstanceOf,
      gboolean(gint((if use_preedit == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IMContext
