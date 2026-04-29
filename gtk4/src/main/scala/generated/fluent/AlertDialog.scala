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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkAlertDialog` object collects the arguments that are needed to present
  * a message to the user.
  *
  * The message is shown with the [method@Gtk.AlertDialog.choose] function. This
  * API follows the GIO async pattern, and the result can be obtained by calling
  * [method@Gtk.AlertDialog.choose_finish].
  *
  * If you don't need to wait for a button to be clicked, you can use
  * [method@Gtk.AlertDialog.show].
  */
class AlertDialog(raw: Ptr[GtkAlertDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function shows the alert to the user.
    *
    * The @callback will be called when the alert is dismissed. It should call
    * [method@Gtk.AlertDialog.choose_finish] to obtain the result.
    *
    * It is ok to pass `NULL` for the callback if the alert does not have more
    * than one button. A simpler API for this case is
    * [method@Gtk.AlertDialog.show].
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.AlertDialog.choose] call and returns the index of
    * the button that was clicked.
    */
  def chooseFinish(result: AsyncResult): GResult[Int] =
    GResult.wrap(__errorPtr =>
      gtk_alert_dialog_choose_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the index of the cancel button.
    */
  def getCancelButton(): Int = gtk_alert_dialog_get_cancel_button(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the index of the default button.
    */
  def getDefaultButton(): Int = gtk_alert_dialog_get_default_button(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the detail text that will be shown in the alert.
    */
  def getDetail()(using Zone): String = fromCString(
    gtk_alert_dialog_get_detail(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the message that will be shown in the alert.
    */
  def getMessage()(using Zone): String = fromCString(
    gtk_alert_dialog_get_message(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the alert blocks interaction with the parent window while
    * it is presented.
    */
  def getModal(): Boolean =
    gtk_alert_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the button labels for the alert.
    */
  def setButtons(labels: Ptr[CString])(using Zone): Unit =
    gtk_alert_dialog_set_buttons(this.raw.asInstanceOf, labels)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the index of the cancel button.
    *
    * See [property@Gtk.AlertDialog:cancel-button] for details of how this value
    * is used.
    */
  def setCancelButton(button: Int): Unit =
    gtk_alert_dialog_set_cancel_button(this.raw.asInstanceOf, button)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the index of the default button.
    *
    * See [property@Gtk.AlertDialog:default-button] for details of how this
    * value is used.
    */
  def setDefaultButton(button: Int): Unit =
    gtk_alert_dialog_set_default_button(this.raw.asInstanceOf, button)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the detail text that will be shown in the alert.
    */
  def setDetail(detail: String | CString)(using Zone): Unit =
    gtk_alert_dialog_set_detail(
      this.raw.asInstanceOf,
      __sn_extract_string(detail)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the message that will be shown in the alert.
    */
  def setMessage(message: String | CString)(using Zone): Unit =
    gtk_alert_dialog_set_message(
      this.raw.asInstanceOf,
      __sn_extract_string(message)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the alert blocks interaction with the parent window while it
    * is presented.
    */
  def setModal(modal: Boolean): Unit = gtk_alert_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Show the alert to the user.
    *
    * This function is a simple version of [method@Gtk.AlertDialog.choose]
    * intended for dialogs with a single button. If you want to cancel the
    * dialog or if the alert has more than one button, you should use that
    * function instead and provide it with a #GCancellable or callback
    * respectively.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkAlertDialog` object.
    *
    * The message will be set to the formatted string resulting from the
    * arguments.
    */
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
