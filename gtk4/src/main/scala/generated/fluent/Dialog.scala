package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Box
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.HeaderBar
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkDialog
import sn.gnome.gtk4.internal.GtkDialogFlags
import sn.gnome.gtk4.internal.GtkResponseType

class Dialog(raw: Ptr[GtkDialog])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addActionWidget(child: Widget, response_id: GtkResponseType): Unit =
    gtk_dialog_add_action_widget(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      response_id.value
    )

  def addButton(button_text: String | CString, response_id: GtkResponseType)(
      using Zone
  ): Widget = new Widget(
    gtk_dialog_add_button(
      this.raw.asInstanceOf,
      __sn_extract_string(button_text),
      response_id.value
    ).asInstanceOf
  )

  inline def addButtons(first_button_text: String | CString, args: Any*)(using
      Zone
  ): Unit = gtk_dialog_add_buttons(
    this.raw.asInstanceOf,
    __sn_extract_string(first_button_text),
    args*
  )

  def getContentArea(): Box = new Box(
    gtk_dialog_get_content_area(this.raw.asInstanceOf).asInstanceOf
  )

  def getHeaderBar(): HeaderBar = new HeaderBar(
    gtk_dialog_get_header_bar(this.raw.asInstanceOf).asInstanceOf
  )

  def getResponseForWidget(widget: Widget): Int =
    gtk_dialog_get_response_for_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  def getWidgetForResponse(response_id: GtkResponseType): Widget = new Widget(
    gtk_dialog_get_widget_for_response(
      this.raw.asInstanceOf,
      response_id.value
    ).asInstanceOf
  )

  def response(response_id: GtkResponseType): Unit =
    gtk_dialog_response(this.raw.asInstanceOf, response_id.value)

  def setDefaultResponse(response_id: GtkResponseType): Unit =
    gtk_dialog_set_default_response(this.raw.asInstanceOf, response_id.value)

  def setResponseSensitive(
      response_id: GtkResponseType,
      setting: Boolean
  ): Unit = gtk_dialog_set_response_sensitive(
    this.raw.asInstanceOf,
    response_id.value,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Dialog

object Dialog:
  def apply(): Dialog = new Dialog(gtk_dialog_new().asInstanceOf)
  inline def withButtons(
      title: String | CString,
      parent: Window,
      flags: GtkDialogFlags,
      first_button_text: String | CString,
      args: Any*
  )(using Zone): Dialog = new Dialog(
    gtk_dialog_new_with_buttons(
      __sn_extract_string(title),
      parent.getUnsafeRawPointer().asInstanceOf,
      flags,
      __sn_extract_string(first_button_text),
      args*
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Dialog
