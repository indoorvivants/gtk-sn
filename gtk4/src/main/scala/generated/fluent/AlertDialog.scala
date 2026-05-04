package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkAlertDialog

/** A `GtkAlertDialog` object collects the arguments that are needed to present
  * a message to the user.
  *
  * The message is shown with the [method@Gtk.AlertDialog.choose] function. This
  * API follows the GIO async pattern, and the result can be obtained by calling
  * [method@Gtk.AlertDialog.choose_finish].
  *
  * If you don't need to wait for a button to be clicked, you can use
  * [method@Gtk.AlertDialog.show].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AlertDialog(raw: Ptr[GtkAlertDialog]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** This function shows the alert to the user.
    *
    * The @callback will be called when the alert is dismissed. It should call
    * [method@Gtk.AlertDialog.choose_finish] to obtain the result.
    *
    * It is ok to pass `NULL` for the callback if the alert does not have more
    * than one button. A simpler API for this case is
    * [method@Gtk.AlertDialog.show].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[choose/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def choose__ = ???

  /** Finishes the [method@Gtk.AlertDialog.choose] call and returns the index of
    * the button that was clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Returns the button labels for the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_buttons/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getButtons__ = ???

  /** Returns the index of the cancel button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCancelButton(): Int /* None */ = gtk_alert_dialog_get_cancel_button(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
  )

  /** Returns the index of the default button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultButton(): Int /* None */ = gtk_alert_dialog_get_default_button(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
  )

  /** Returns the detail text that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDetail()(using Zone): String /* None */ = fromCString(
    gtk_alert_dialog_get_detail(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
    ).asInstanceOf
  )

  /** Returns the message that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessage()(using Zone): String /* None */ = fromCString(
    gtk_alert_dialog_get_message(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
    ).asInstanceOf
  )

  /** Returns whether the alert blocks interaction with the parent window while
    * it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ = gtk_alert_dialog_get_modal(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]]
  ).value.!=(0)

  /** Sets the button labels for the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_buttons/<method parameters>/labels]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def setButtons__ = ???

  /** Sets the index of the cancel button.
    *
    * See [property@Gtk.AlertDialog:cancel-button] for details of how this value
    * is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCancelButton(button: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_alert_dialog_set_cancel_button(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
      button
    )

  /** Sets the index of the default button.
    *
    * See [property@Gtk.AlertDialog:default-button] for details of how this
    * value is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultButton(button: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_alert_dialog_set_default_button(
      this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
      button
    )

  /** Sets the detail text that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDetail(
      detail: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_alert_dialog_set_detail(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    __sn_extract_string(detail)
  )

  /** Sets the message that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMessage(
      message: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_alert_dialog_set_message(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    __sn_extract_string(message)
  )

  /** Sets whether the alert blocks interaction with the parent window while it
    * is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_alert_dialog_set_modal(
    this.raw.asInstanceOf[Ptr[GtkAlertDialog]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** Show the alert to the user.
    *
    * This function is a simple version of [method@Gtk.AlertDialog.choose]
    * intended for dialogs with a single button. If you want to cancel the
    * dialog or if the alert has more than one button, you should use that
    * function instead and provide it with a #GCancellable or callback
    * respectively.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
  /** Creates a new `GtkAlertDialog` object.
    *
    * The message will be set to the formatted string resulting from the
    * arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
