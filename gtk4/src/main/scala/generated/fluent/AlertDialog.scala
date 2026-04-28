package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkAlertDialog

class AlertDialog(raw: Ptr[GtkAlertDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def choose(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_alert_dialog_choose(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def chooseFinish(result: AsyncResult): GResult[Int] =
    GResult.wrap(__errorPtr =>
      gtk_alert_dialog_choose_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  def getCancelButton(): Int = gtk_alert_dialog_get_cancel_button(
    this.raw.asInstanceOf
  )

  def getDefaultButton(): Int = gtk_alert_dialog_get_default_button(
    this.raw.asInstanceOf
  )

  def getDetail()(using Zone): String = fromCString(
    gtk_alert_dialog_get_detail(this.raw.asInstanceOf).asInstanceOf
  )

  def getMessage()(using Zone): String = fromCString(
    gtk_alert_dialog_get_message(this.raw.asInstanceOf).asInstanceOf
  )

  def getModal(): Boolean =
    gtk_alert_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  // Method set_buttons contains an array parameter, which is not supported yet

  def setCancelButton(button: Int): Unit =
    gtk_alert_dialog_set_cancel_button(this.raw.asInstanceOf, button)

  def setDefaultButton(button: Int): Unit =
    gtk_alert_dialog_set_default_button(this.raw.asInstanceOf, button)

  def setDetail(detail: String | CString)(using Zone): Unit =
    gtk_alert_dialog_set_detail(
      this.raw.asInstanceOf,
      __sn_extract_string(detail)
    )

  def setMessage(message: String | CString)(using Zone): Unit =
    gtk_alert_dialog_set_message(
      this.raw.asInstanceOf,
      __sn_extract_string(message)
    )

  def setModal(modal: Boolean): Unit = gtk_alert_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  def show(parent: Window): Unit = gtk_alert_dialog_show(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AlertDialog

object AlertDialog:
  inline def apply(format: String | CString, args: Any*)(using
      Zone
  ): AlertDialog = new AlertDialog(
    gtk_alert_dialog_new(__sn_extract_string(format), args*).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AlertDialog
