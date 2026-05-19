package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{ResponseType, Window}
import sn.gnome.gtk4.internal.{GtkNativeDialog, GtkResponseType}
import sn.gnome.runtime.*

/** Native dialogs are platform dialogs that don't use `GtkDialog`.
  *
  * They are used in order to integrate better with a platform, by looking the
  * same as other native applications and supporting platform specific features.
  *
  * The [class@Gtk.Dialog] functions cannot be used on such objects, but we need
  * a similar API in order to drive them. The `GtkNativeDialog` object is an API
  * that allows you to do this. It allows you to set various common properties
  * on the dialog, as well as show and hide it and get a
  * [signal@Gtk.NativeDialog::response] signal when the user finished with the
  * dialog.
  *
  * Note that unlike `GtkDialog`, `GtkNativeDialog` objects are not toplevel
  * widgets, and GTK does not keep them alive. It is your responsibility to keep
  * a reference until you are done with the object.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NativeDialog private[gnome] (raw: Ptr[GtkNativeDialog])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Destroys a dialog.
    *
    * When a dialog is destroyed, it will break any references it holds to other
    * objects.
    *
    * If it is visible it will be hidden and any underlying window system
    * resources will be destroyed.
    *
    * Note that this does not release any reference to the object (as opposed to
    * destroying a `GtkWindow`) because there is no reference from the windowing
    * system to the `GtkNativeDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    gtk_native_dialog_destroy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]]
    )
  end destroy

  /** Returns whether the dialog is modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_native_dialog_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]]
    ).value.!=(0)
  end getModal

  /** Gets the title of the `GtkNativeDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle(): String /* None */ =
    fromCString(
      gtk_native_dialog_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]]
      ).asInstanceOf
    )
  end getTitle

  /** Fetches the transient parent for this window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransientFor()(using Runtime): sn.gnome.gtk4.Window /* None */ =
    sn.gnome.gtk4.Window.applyUnsafe(
      gtk_native_dialog_get_transient_for(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]]
      ).asInstanceOf
    )
  end getTransientFor

  /** Determines whether the dialog is visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ =
    gtk_native_dialog_get_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]]
    ).value.!=(0)
  end getVisible

  /** Hides the dialog if it is visible, aborting any interaction.
    *
    * Once this is called the [signal@Gtk.NativeDialog::response] signal will
    * *not* be emitted until after the next call to
    * [method@Gtk.NativeDialog.show].
    *
    * If the dialog is not visible this does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hide(): Unit /* None */ =
    gtk_native_dialog_hide(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]]
    )
  end hide

  /** Sets a dialog modal or non-modal.
    *
    * Modal dialogs prevent interaction with other windows in the same
    * application. To keep modal dialogs on top of main application windows, use
    * [method@Gtk.NativeDialog.set_transient_for] to make the dialog transient
    * for the parent; most window managers will then disallow lowering the
    * dialog below the parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_native_dialog_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets the title of the `GtkNativeDialog.`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_native_dialog_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]],
      summon[Runtime].inZone(toCString(title))
    )
  end setTitle

  /** Dialog windows should be set transient for the main application window
    * they were spawned from.
    *
    * This allows window managers to e.g. keep the dialog on top of the main
    * window, or center the dialog over the main window.
    *
    * Passing %NULL for @parent unsets the current transient window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransientFor(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_native_dialog_set_transient_for(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]],
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    )
  end setTransientFor

  /** Shows the dialog on the display.
    *
    * When the user accepts the state of the dialog the dialog will be
    * automatically hidden and the [signal@Gtk.NativeDialog::response] signal
    * will be emitted.
    *
    * Multiple calls while the dialog is visible will be ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def show(): Unit /* None */ =
    gtk_native_dialog_show(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNativeDialog]]
    )
  end show

  /** Emitted when the user responds to the dialog.
    *
    * When this is called the dialog has been hidden.
    *
    * If you call [method@Gtk.NativeDialog.hide] before the user responds to the
    * dialog this signal will not be emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onResponse(handler: ((responseId: ResponseType)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (responseId: ResponseType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkNativeDialog],
          responseId: GtkResponseType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((responseId = ResponseType.fromRaw(responseId)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"response"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onResponse
end NativeDialog

object NativeDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkNativeDialog])(using Runtime) =
    summon[Runtime].getOrCreate[NativeDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NativeDialog(ptr)
    )

end NativeDialog
