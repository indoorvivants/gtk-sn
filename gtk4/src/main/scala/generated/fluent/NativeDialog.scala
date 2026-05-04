package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkNativeDialog

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Native dialogs are platform dialogs that don't use `GtkDialog`.
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
  */
class NativeDialog(raw: Ptr[GtkNativeDialog]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Destroys a dialog.
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
    */
  def destroy(): Unit /* None */ = gtk_native_dialog_destroy(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the dialog is modal.
    */
  def getModal(): Boolean /* None */ = gtk_native_dialog_get_modal(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the title of the `GtkNativeDialog`.
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_native_dialog_get_title(
      this.raw.asInstanceOf[Ptr[GtkNativeDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the transient parent for this window.
    */
  def getTransientFor(): Window /* None */ = new Window(
    gtk_native_dialog_get_transient_for(
      this.raw.asInstanceOf[Ptr[GtkNativeDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether the dialog is visible.
    */
  def getVisible(): Boolean /* None */ = gtk_native_dialog_get_visible(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hides the dialog if it is visible, aborting any interaction.
    *
    * Once this is called the [signal@Gtk.NativeDialog::response] signal will
    * *not* be emitted until after the next call to
    * [method@Gtk.NativeDialog.show].
    *
    * If the dialog is not visible this does nothing.
    */
  def hide(): Unit /* None */ = gtk_native_dialog_hide(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a dialog modal or non-modal.
    *
    * Modal dialogs prevent interaction with other windows in the same
    * application. To keep modal dialogs on top of main application windows, use
    * [method@Gtk.NativeDialog.set_transient_for] to make the dialog transient
    * for the parent; most window managers will then disallow lowering the
    * dialog below the parent.
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_native_dialog_set_modal(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title of the `GtkNativeDialog.`
    */
  def setTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_native_dialog_set_title(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]],
    __sn_extract_string(title)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dialog windows should be set transient for the main application window
    * they were spawned from.
    *
    * This allows window managers to e.g. keep the dialog on top of the main
    * window, or center the dialog over the main window.
    *
    * Passing %NULL for @parent unsets the current transient window.
    */
  def setTransientFor(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  ): Unit /* None */ = gtk_native_dialog_set_transient_for(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shows the dialog on the display.
    *
    * When the user accepts the state of the dialog the dialog will be
    * automatically hidden and the [signal@Gtk.NativeDialog::response] signal
    * will be emitted.
    *
    * Multiple calls while the dialog is visible will be ignored.
    */
  def show(): Unit /* None */ = gtk_native_dialog_show(
    this.raw.asInstanceOf[Ptr[GtkNativeDialog]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end NativeDialog
