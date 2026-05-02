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
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ],
      callback: Option[
        GAsyncReadyCallback /* Some(_root_.sn.gnome.gio.internal.GAsyncReadyCallback) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_alert_dialog_choose(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    cancellable
      .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
      ),
    callback
      .map[_root_.sn.gnome.gio.internal.GAsyncReadyCallback](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.gio.internal.GAsyncReadyCallback]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.AlertDialog.choose] call and returns the index of
    * the button that was clicked.
    */
  def chooseFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Int /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_alert_dialog_choose_finish(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the index of the cancel button.
    */
  def getCancelButton(): Int /* None */ = gtk_alert_dialog_get_cancel_button(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the index of the default button.
    */
  def getDefaultButton(): Int /* None */ = gtk_alert_dialog_get_default_button(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the detail text that will be shown in the alert.
    */
  def getDetail()(using Zone): String /* None */ = fromCString(
    gtk_alert_dialog_get_detail(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the message that will be shown in the alert.
    */
  def getMessage()(using Zone): String /* None */ = fromCString(
    gtk_alert_dialog_get_message(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the alert blocks interaction with the parent window while
    * it is presented.
    */
  def getModal(): Boolean /* None */ = gtk_alert_dialog_get_modal(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the button labels for the alert.
    */
  def setButtons(
      labels: Ptr[CString] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ = gtk_alert_dialog_set_buttons(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    labels
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the index of the cancel button.
    *
    * See [property@Gtk.AlertDialog:cancel-button] for details of how this value
    * is used.
    */
  def setCancelButton(button: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_alert_dialog_set_cancel_button(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
      button
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the index of the default button.
    *
    * See [property@Gtk.AlertDialog:default-button] for details of how this
    * value is used.
    */
  def setDefaultButton(button: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_alert_dialog_set_default_button(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
      button
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the detail text that will be shown in the alert.
    */
  def setDetail(
      detail: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_alert_dialog_set_detail(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    __sn_extract_string(detail)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the message that will be shown in the alert.
    */
  def setMessage(
      message: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_alert_dialog_set_message(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    __sn_extract_string(message)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the alert blocks interaction with the parent window while it
    * is presented.
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_alert_dialog_set_modal(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
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
  def show(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  ): Unit /* None */ = gtk_alert_dialog_show(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
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
  inline def apply(format: String | CString /* Some(CString) */, args: Any*)(
      using Zone
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
