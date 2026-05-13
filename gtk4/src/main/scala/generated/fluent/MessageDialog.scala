package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ButtonsType,
  ConstraintTarget,
  Dialog,
  DialogFlags,
  MessageType,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{GtkMessageDialog, GtkNative, GtkRoot}

/** `GtkMessageDialog` presents a dialog with some message text.
  *
  * ![An example GtkMessageDialog](messagedialog.png)
  *
  * It’s simply a convenience widget; you could construct the equivalent of
  * `GtkMessageDialog` from `GtkDialog` without too much effort, but
  * `GtkMessageDialog` saves typing.
  *
  * The easiest way to do a modal message dialog is to use the %GTK_DIALOG_MODAL
  * flag, which will call [method@Gtk.Window.set_modal] internally. The dialog
  * will prevent interaction with the parent window until it's hidden or
  * destroyed. You can use the [signal@Gtk.Dialog::response] signal to know when
  * the user dismissed the dialog.
  *
  * An example for using a modal dialog:
  * ```c
  * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT | GTK_DIALOG_MODAL;
  * dialog = gtk_message_dialog_new (parent_window,
  *                                  flags,
  *                                  GTK_MESSAGE_ERROR,
  *                                  GTK_BUTTONS_CLOSE,
  *                                  "Error reading “%s”: %s",
  *                                  filename,
  *                                  g_strerror (errno));
  * // Destroy the dialog when the user responds to it
  * // (e.g. clicks a button)
  *
  * g_signal_connect (dialog, "response",
  *                   G_CALLBACK (gtk_window_destroy),
  *                   NULL);
  * ```
  *
  * You might do a non-modal `GtkMessageDialog` simply by omitting the
  * %GTK_DIALOG_MODAL flag:
  *
  * ```c
  * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
  * dialog = gtk_message_dialog_new (parent_window,
  *                                  flags,
  *                                  GTK_MESSAGE_ERROR,
  *                                  GTK_BUTTONS_CLOSE,
  *                                  "Error reading “%s”: %s",
  *                                  filename,
  *                                  g_strerror (errno));
  *
  * // Destroy the dialog when the user responds to it
  * // (e.g. clicks a button)
  * g_signal_connect (dialog, "response",
  *                   G_CALLBACK (gtk_window_destroy),
  *                   NULL);
  * ```
  *
  * # GtkMessageDialog as GtkBuildable
  *
  * The `GtkMessageDialog` implementation of the `GtkBuildable` interface
  * exposes the message area as an internal child with the name “message_area”.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MessageDialog private[gnome] (raw: Ptr[GtkMessageDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Sets the secondary text of the message dialog.
    *
    * The @message_format is assumed to contain Pango markup.
    *
    * Due to an oversight, this function does not escape special XML characters
    * like [ctor@Gtk.MessageDialog.new_with_markup] does. Thus, if the arguments
    * may contain special XML characters, you should use
    * g_markup_printf_escaped() to escape it.
    *
    * ```c
    * char *msg;
    *
    * msg = g_markup_printf_escaped (message_format, ...);
    * gtk_message_dialog_format_secondary_markup (message_dialog,
    *                                             "%s", msg);
    * g_free (msg);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method format_secondary_markup/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def formatSecondaryMarkup__ = ???

  /** Sets the secondary text of the message dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method format_secondary_text/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def formatSecondaryText__ = ???

  /** Returns the display that this `GtkRoot` is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_root_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the current focused widget within the root.
    *
    * Note that this is the widget that would have the focus if the root is
    * active; if the root is not focused then `gtk_widget_has_focus (widget)`
    * will be %FALSE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocus()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_root_get_focus(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getFocus

  /** Returns the message area of the dialog.
    *
    * This is the box where the dialog’s primary and secondary labels are
    * packed. You can add your own extra content to that box and it will appear
    * below those labels. See [method@Gtk.Dialog.get_content_area] for the
    * corresponding function in the parent [class@Gtk.Dialog].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessageArea()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_message_dialog_get_message_area(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMessageDialog]]
      ).asInstanceOf
    )
  end getMessageArea

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the root.
    *
    * If @focus is %NULL, unsets the focus widget for the root.
    *
    * To set the focus to a particular widget in the root, it is usually more
    * convenient to use [method@Gtk.Widget.grab_focus] instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocus(
      focus: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_root_set_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]],
      focus
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocus

  /** Sets the text of the message dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarkup(str: String /* Some(CString) */ )(using Zone): Unit /* None */ =
    gtk_message_dialog_set_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMessageDialog]],
      toCString(str)
    )
  end setMarkup

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

end MessageDialog

object MessageDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMessageDialog])(using Runtime) =
    summon[Runtime].getOrCreate[MessageDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MessageDialog(ptr)
    )

  /** Creates a new message dialog.
    *
    * This is a simple dialog with some text the user may want to see. When the
    * user clicks a button a “response” signal is emitted with response IDs from
    * [enum@Gtk.ResponseType]. See [class@Gtk.Dialog] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def apply(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      flags: DialogFlags /* Some(GtkDialogFlags) */,
      `type`: MessageType /* Some(GtkMessageType) */,
      buttons: ButtonsType /* Some(GtkButtonsType) */,
      message_format: Option[String /* Some(CString) */ ],
      args: Any*
  )(using Zone, Runtime): MessageDialog =
    val raw: Ptr[Byte] = gtk_message_dialog_new(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      `type`.raw,
      buttons.raw,
      message_format
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
    summon[Runtime].getOrCreate[MessageDialog](
      raw,
      r => MessageDialog.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new message dialog.
    *
    * This is a simple dialog with some text that is marked up with Pango
    * markup. When the user clicks a button a “response” signal is emitted with
    * response IDs from [enum@Gtk.ResponseType]. See [class@Gtk.Dialog] for more
    * details.
    *
    * Special XML characters in the printf() arguments passed to this function
    * will automatically be escaped as necessary. (See g_markup_printf_escaped()
    * for how this is implemented.) Usually this is what you want, but if you
    * have an existing Pango markup string that you want to use literally as the
    * label, then you need to use [method@Gtk.MessageDialog.set_markup] instead,
    * since you can’t pass the markup string either as the format (it might
    * contain “%” characters) or as a string argument.
    *
    * ```c
    * GtkWidget *dialog;
    * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
    * dialog = gtk_message_dialog_new (parent_window,
    *                                  flags,
    *                                  GTK_MESSAGE_ERROR,
    *                                  GTK_BUTTONS_CLOSE,
    *                                  NULL);
    * gtk_message_dialog_set_markup (GTK_MESSAGE_DIALOG (dialog),
    *                                markup);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def withMarkup(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      flags: DialogFlags /* Some(GtkDialogFlags) */,
      `type`: MessageType /* Some(GtkMessageType) */,
      buttons: ButtonsType /* Some(GtkButtonsType) */,
      message_format: Option[String /* Some(CString) */ ],
      args: Any*
  )(using Zone, Runtime): MessageDialog =
    val raw: Ptr[Byte] = gtk_message_dialog_new_with_markup(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      `type`.raw,
      buttons.raw,
      message_format
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
    summon[Runtime].getOrCreate[MessageDialog](
      raw,
      r => MessageDialog.applyUnsafe(r.asInstanceOf)
    )
  end withMarkup
end MessageDialog
