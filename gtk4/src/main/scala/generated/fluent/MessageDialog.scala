package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
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
import sn.gnome.gtk4.internal.GtkMessageDialog

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
class MessageDialog(raw: Ptr[GtkMessageDialog])
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
  inline def formatSecondaryMarkup(
      message_format: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_message_dialog_format_secondary_markup(
    this.raw.asInstanceOf[Ptr[GtkMessageDialog]],
    __sn_extract_string(message_format),
    args*
  )

  /** Sets the secondary text of the message dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def formatSecondaryText(
      message_format: Option[String | CString /* Some(CString) */ ],
      args: Any*
  )(using Zone): Unit /* None */ = gtk_message_dialog_format_secondary_text(
    this.raw.asInstanceOf[Ptr[GtkMessageDialog]],
    message_format
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString]),
    args*
  )

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
  def getMessageArea(): Widget /* None */ = new Widget(
    gtk_message_dialog_get_message_area(
      this.raw.asInstanceOf[Ptr[GtkMessageDialog]]
    ).asInstanceOf
  )

  /** Sets the text of the message dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarkup(
      str: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_message_dialog_set_markup(
    this.raw.asInstanceOf[Ptr[GtkMessageDialog]],
    __sn_extract_string(str)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MessageDialog

object MessageDialog:
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
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      flags: DialogFlags /* Some(GtkDialogFlags) */,
      `type`: MessageType /* Some(GtkMessageType) */,
      buttons: ButtonsType /* Some(GtkButtonsType) */,
      message_format: Option[String | CString /* Some(CString) */ ],
      args: Any*
  )(using Zone)(using Runtime): MessageDialog =
    val raw: Ptr[Byte] = gtk_message_dialog_new(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      `type`.raw,
      buttons.raw,
      message_format
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MessageDialog](raw, r => new MessageDialog(r.asInstanceOf))
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
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      flags: DialogFlags /* Some(GtkDialogFlags) */,
      `type`: MessageType /* Some(GtkMessageType) */,
      buttons: ButtonsType /* Some(GtkButtonsType) */,
      message_format: Option[String | CString /* Some(CString) */ ],
      args: Any*
  )(using Zone)(using Runtime): MessageDialog =
    val raw: Ptr[Byte] = gtk_message_dialog_new_with_markup(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      `type`.raw,
      buttons.raw,
      message_format
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MessageDialog](raw, r => new MessageDialog(r.asInstanceOf))
  end withMarkup

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MessageDialog
