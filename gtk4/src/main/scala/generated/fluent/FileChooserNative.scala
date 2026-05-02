package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.FileChooser
import sn.gnome.gtk4.fluent.NativeDialog
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkFileChooserAction
import sn.gnome.gtk4.internal.GtkFileChooserNative

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkFileChooserNative` is an abstraction of a dialog suitable for use with
  * “File Open” or “File Save as” commands.
  *
  * By default, this just uses a `GtkFileChooserDialog` to implement the actual
  * dialog. However, on some platforms, such as Windows and macOS, the native
  * platform file chooser is used instead. When the application is running in a
  * sandboxed environment without direct filesystem access (such as Flatpak),
  * `GtkFileChooserNative` may call the proper APIs (portals) to let the user
  * choose a file and make it available to the application.
  *
  * While the API of `GtkFileChooserNative` closely mirrors
  * `GtkFileChooserDialog`, the main difference is that there is no access to
  * any `GtkWindow` or `GtkWidget` for the dialog. This is required, as there
  * may not be one in the case of a platform native dialog.
  *
  * Showing, hiding and running the dialog is handled by the
  * [class@Gtk.NativeDialog] functions.
  *
  * Note that unlike `GtkFileChooserDialog`, `GtkFileChooserNative` objects are
  * not toplevel widgets, and GTK does not keep them alive. It is your
  * responsibility to keep a reference until you are done with the object.
  *
  * ## Typical usage
  *
  * In the simplest of cases, you can the following code to use
  * `GtkFileChooserNative` to select a file for opening:
  *
  * ```c
  * static void
  * on_response (GtkNativeDialog *native,
  *              int              response)
  * {
  *   if (response == GTK_RESPONSE_ACCEPT)
  *     {
  *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
  *       GFile *file = gtk_file_chooser_get_file (chooser);
  *
  *       open_file (file);
  *
  *       g_object_unref (file);
  *     }
  *
  *   g_object_unref (native);
  * }
  *
  *   // ...
  *   GtkFileChooserNative *native;
  *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
  *
  *   native = gtk_file_chooser_native_new ("Open File",
  *                                         parent_window,
  *                                         action,
  *                                         "_Open",
  *                                         "_Cancel");
  *
  *   g_signal_connect (native, "response", G_CALLBACK (on_response), NULL);
  *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
  * ```
  *
  * To use a `GtkFileChooserNative` for saving, you can use this:
  *
  * ```c
  * static void
  * on_response (GtkNativeDialog *native,
  *              int              response)
  * {
  *   if (response == GTK_RESPONSE_ACCEPT)
  *     {
  *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
  *       GFile *file = gtk_file_chooser_get_file (chooser);
  *
  *       save_to_file (file);
  *
  *       g_object_unref (file);
  *     }
  *
  *   g_object_unref (native);
  * }
  *
  *   // ...
  *   GtkFileChooserNative *native;
  *   GtkFileChooser *chooser;
  *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
  *
  *   native = gtk_file_chooser_native_new ("Save File",
  *                                         parent_window,
  *                                         action,
  *                                         "_Save",
  *                                         "_Cancel");
  *   chooser = GTK_FILE_CHOOSER (native);
  *
  *   if (user_edited_a_new_document)
  *     gtk_file_chooser_set_current_name (chooser, _("Untitled document"));
  *   else
  *     gtk_file_chooser_set_file (chooser, existing_file, NULL);
  *
  *   g_signal_connect (native, "response", G_CALLBACK (on_response), NULL);
  *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
  * ```
  *
  * For more information on how to best set up a file dialog, see the
  * [class@Gtk.FileChooserDialog] documentation.
  *
  * ## Response Codes
  *
  * `GtkFileChooserNative` inherits from [class@Gtk.NativeDialog], which means
  * it will return %GTK_RESPONSE_ACCEPT if the user accepted, and
  * %GTK_RESPONSE_CANCEL if he pressed cancel. It can also return
  * %GTK_RESPONSE_DELETE_EVENT if the window was unexpectedly closed.
  *
  * ## Differences from `GtkFileChooserDialog`
  *
  * There are a few things in the [iface@Gtk.FileChooser] interface that are not
  * possible to use with `GtkFileChooserNative`, as such use would prohibit the
  * use of a native dialog.
  *
  * No operations that change the dialog work while the dialog is visible. Set
  * all the properties that are required before showing the dialog.
  *
  * ## Win32 details
  *
  * On windows the `IFileDialog` implementation (added in Windows Vista) is
  * used. It supports many of the features that `GtkFileChooser` has, but there
  * are some things it does not handle:
  *
  * * Any [class@Gtk.FileFilter] added using a mimetype
  *
  * If any of these features are used the regular `GtkFileChooserDialog` will be
  * used in place of the native one.
  *
  * ## Portal details
  *
  * When the `org.freedesktop.portal.FileChooser` portal is available on the
  * session bus, it is used to bring up an out-of-process file chooser.
  * Depending on the kind of session the application is running in, this may or
  * may not be a GTK file chooser.
  *
  * ## macOS details
  *
  * On macOS the `NSSavePanel` and `NSOpenPanel` classes are used to provide
  * native file chooser dialogs. Some features provided by `GtkFileChooser` are
  * not supported:
  *
  * * Shortcut folders.
  */
class FileChooserNative(raw: Ptr[GtkFileChooserNative])
    extends NativeDialog(raw.asInstanceOf),
      FileChooser:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the custom label text for the accept button.
    */
  def getAcceptLabel()(using Zone): String /* None */ = fromCString(
    gtk_file_chooser_native_get_accept_label(
      this.raw.asInstanceOf[Ptr[GtkFileChooserNative]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the custom label text for the cancel button.
    */
  def getCancelLabel()(using Zone): String /* None */ = fromCString(
    gtk_file_chooser_native_get_cancel_label(
      this.raw.asInstanceOf[Ptr[GtkFileChooserNative]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the custom label text for the accept button.
    *
    * If characters in @label are preceded by an underscore, they are
    * underlined. If you need a literal underscore character in a label, use
    * “__” (two underscores). The first underlined character represents a
    * keyboard accelerator called a mnemonic.
    *
    * Pressing Alt and that key should activate the button.
    */
  def setAcceptLabel(
      accept_label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_file_chooser_native_set_accept_label(
    this.raw.asInstanceOf[Ptr[GtkFileChooserNative]],
    accept_label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the custom label text for the cancel button.
    *
    * If characters in @label are preceded by an underscore, they are
    * underlined. If you need a literal underscore character in a label, use
    * “__” (two underscores). The first underlined character represents a
    * keyboard accelerator called a mnemonic.
    *
    * Pressing Alt and that key should activate the button.
    */
  def setCancelLabel(
      cancel_label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_file_chooser_native_set_cancel_label(
    this.raw.asInstanceOf[Ptr[GtkFileChooserNative]],
    cancel_label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FileChooserNative

object FileChooserNative:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFileChooserNative`.
    */
  def apply(
      title: Option[String | CString /* Some(CString) */ ],
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      action: GtkFileChooserAction /* Some(GtkFileChooserAction) */,
      accept_label: Option[String | CString /* Some(CString) */ ],
      cancel_label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): FileChooserNative = new FileChooserNative(
    gtk_file_chooser_native_new(
      title
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      action,
      accept_label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      cancel_label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
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
end FileChooserNative
