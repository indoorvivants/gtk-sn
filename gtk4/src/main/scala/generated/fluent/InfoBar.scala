package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Button
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkInfoBar
import sn.gnome.gtk4.internal.GtkMessageType
import sn.gnome.gtk4.internal.GtkResponseType

class InfoBar(raw: Ptr[GtkInfoBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addActionWidget(child: Widget, response_id: GtkResponseType): Unit =
    gtk_info_bar_add_action_widget(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      response_id.value
    )

  def addButton(button_text: String | CString, response_id: GtkResponseType)(
      using Zone
  ): Button = new Button(
    gtk_info_bar_add_button(
      this.raw.asInstanceOf,
      __sn_extract_string(button_text),
      response_id.value
    ).asInstanceOf
  )

  inline def addButtons(first_button_text: String | CString, args: Any*)(using
      Zone
  ): Unit = gtk_info_bar_add_buttons(
    this.raw.asInstanceOf,
    __sn_extract_string(first_button_text),
    args*
  )

  def addChild(widget: Widget): Unit = gtk_info_bar_add_child(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def getMessageType(): GtkMessageType = gtk_info_bar_get_message_type(
    this.raw.asInstanceOf
  )

  def getRevealed(): Boolean =
    gtk_info_bar_get_revealed(this.raw.asInstanceOf).value.!=(0)

  def getShowCloseButton(): Boolean =
    gtk_info_bar_get_show_close_button(this.raw.asInstanceOf).value.!=(0)

  def removeActionWidget(widget: Widget): Unit =
    gtk_info_bar_remove_action_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  def removeChild(widget: Widget): Unit = gtk_info_bar_remove_child(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def response(response_id: GtkResponseType): Unit =
    gtk_info_bar_response(this.raw.asInstanceOf, response_id.value)

  def setDefaultResponse(response_id: GtkResponseType): Unit =
    gtk_info_bar_set_default_response(this.raw.asInstanceOf, response_id.value)

  def setMessageType(message_type: GtkMessageType): Unit =
    gtk_info_bar_set_message_type(this.raw.asInstanceOf, message_type)

  def setResponseSensitive(
      response_id: GtkResponseType,
      setting: Boolean
  ): Unit = gtk_info_bar_set_response_sensitive(
    this.raw.asInstanceOf,
    response_id.value,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setRevealed(revealed: Boolean): Unit = gtk_info_bar_set_revealed(
    this.raw.asInstanceOf,
    gboolean(gint((if revealed == true then 1 else 0)))
  )

  def setShowCloseButton(setting: Boolean): Unit =
    gtk_info_bar_set_show_close_button(
      this.raw.asInstanceOf,
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
end InfoBar

object InfoBar:
  def apply(): InfoBar = new InfoBar(gtk_info_bar_new().asInstanceOf)
  inline def withButtons(first_button_text: String | CString, args: Any*)(using
      Zone
  ): InfoBar = new InfoBar(
    gtk_info_bar_new_with_buttons(
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
end InfoBar
