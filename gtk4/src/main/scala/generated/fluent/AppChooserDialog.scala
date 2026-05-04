package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gtk4.fluent.{
  Accessible,
  AppChooser,
  Buildable,
  ConstraintTarget,
  Dialog,
  DialogFlags,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.GtkAppChooserDialog

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkAppChooserDialog` shows a `GtkAppChooserWidget` inside a `GtkDialog`.
  *
  * ![An example GtkAppChooserDialog](appchooserdialog.png)
  *
  * Note that `GtkAppChooserDialog` does not have any interesting methods of its
  * own. Instead, you should get the embedded `GtkAppChooserWidget` using
  * [method@Gtk.AppChooserDialog.get_widget] and call its methods if the generic
  * [iface@Gtk.AppChooser] interface is not sufficient for your needs.
  *
  * To set the heading that is shown above the `GtkAppChooserWidget`, use
  * [method@Gtk.AppChooserDialog.set_heading].
  *
  * ## CSS nodes
  *
  * `GtkAppChooserDialog` has a single CSS node with the name `window` and style
  * class `.appchooser`.
  */
class AppChooserDialog(raw: Ptr[GtkAppChooserDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the text to display at the top of the dialog.
    */
  def getHeading()(using Zone): String /* None */ = fromCString(
    gtk_app_chooser_dialog_get_heading(
      this.raw.asInstanceOf[Ptr[GtkAppChooserDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkAppChooserWidget` of this dialog.
    */
  def getWidget(): Widget /* None */ = new Widget(
    gtk_app_chooser_dialog_get_widget(
      this.raw.asInstanceOf[Ptr[GtkAppChooserDialog]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text to display at the top of the dialog.
    *
    * If the heading is not set, the dialog displays a default text.
    */
  def setHeading(
      heading: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_app_chooser_dialog_set_heading(
    this.raw.asInstanceOf[Ptr[GtkAppChooserDialog]],
    __sn_extract_string(heading)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AppChooserDialog

object AppChooserDialog:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkAppChooserDialog` for the provided `GFile`.
    *
    * The dialog will show applications that can open the file.
    */
  def apply(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      flags: DialogFlags /* Some(GtkDialogFlags) */,
      file: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  ): AppChooserDialog = new AppChooserDialog(
    gtk_app_chooser_dialog_new(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkAppChooserDialog` for the provided content type.
    *
    * The dialog will show applications that can open the content type.
    */
  def forContentType(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      flags: DialogFlags /* Some(GtkDialogFlags) */,
      content_type: String | CString /* Some(CString) */
  )(using Zone): AppChooserDialog = new AppChooserDialog(
    gtk_app_chooser_dialog_new_for_content_type(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      __sn_extract_string(content_type)
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
end AppChooserDialog
