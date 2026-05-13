package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
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
class AlertDialog private[gnome] (raw: Ptr[GtkAlertDialog])
    extends Object(raw.asInstanceOf):

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
    "[method choose/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
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
  ): GResult[Int /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_alert_dialog_choose_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )
  end chooseFinish

  /** Returns the button labels for the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_buttons/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getButtons__ = ???

  /** Returns the index of the cancel button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCancelButton(): Int /* None */ =
    gtk_alert_dialog_get_cancel_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]]
    )
  end getCancelButton

  /** Returns the index of the default button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultButton(): Int /* None */ =
    gtk_alert_dialog_get_default_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]]
    )
  end getDefaultButton

  /** Returns the detail text that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDetail()(using Zone): String /* None */ =
    fromCString(
      gtk_alert_dialog_get_detail(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]]
      ).asInstanceOf
    )
  end getDetail

  /** Returns the message that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessage()(using Zone): String /* None */ =
    fromCString(
      gtk_alert_dialog_get_message(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]]
      ).asInstanceOf
    )
  end getMessage

  /** Returns whether the alert blocks interaction with the parent window while
    * it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_alert_dialog_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]]
    ).value.!=(0)
  end getModal

  /** Sets the button labels for the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_buttons/<method parameters>/labels]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))"
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
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]],
      button
    )
  end setCancelButton

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
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]],
      button
    )
  end setDefaultButton

  /** Sets the detail text that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDetail(
      detail: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_alert_dialog_set_detail(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]],
      toCString(detail)
    )
  end setDetail

  /** Sets the message that will be shown in the alert.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMessage(
      message: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_alert_dialog_set_message(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]],
      toCString(message)
    )
  end setMessage

  /** Sets whether the alert blocks interaction with the parent window while it
    * is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_alert_dialog_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

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
      parent: Option[sn.gnome.gtk4.fluent.Window /* Some(Ptr[GtkWindow]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_alert_dialog_show(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlertDialog]],
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    )
  end show

end AlertDialog

object AlertDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAlertDialog])(using Runtime) =
    summon[Runtime].getOrCreate[AlertDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AlertDialog(ptr)
    )

  /** Creates a new `GtkAlertDialog` object.
    *
    * The message will be set to the formatted string resulting from the
    * arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def apply(format: String /* Some(CString) */, args: Any*)(using
      Zone,
      Runtime
  ): AlertDialog =
    val raw: Ptr[Byte] =
      gtk_alert_dialog_new(toCString(format), args*).asInstanceOf
    summon[Runtime].getOrCreate[AlertDialog](
      raw,
      r => AlertDialog.applyUnsafe(r.asInstanceOf)
    )
  end apply
end AlertDialog
