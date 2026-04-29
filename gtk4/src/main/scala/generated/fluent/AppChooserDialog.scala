package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AppChooser
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Dialog
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkAppChooserDialog
import sn.gnome.gtk4.internal.GtkDialogFlags

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
  def getHeading()(using Zone): String = fromCString(
    gtk_app_chooser_dialog_get_heading(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkAppChooserWidget` of this dialog.
    */
  def getWidget(): Widget = new Widget(
    gtk_app_chooser_dialog_get_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text to display at the top of the dialog.
    *
    * If the heading is not set, the dialog displays a default text.
    */
  def setHeading(heading: String | CString)(using Zone): Unit =
    gtk_app_chooser_dialog_set_heading(
      this.raw.asInstanceOf,
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
      parent: Window,
      flags: GtkDialogFlags,
      file: File
  ): AppChooserDialog = new AppChooserDialog(
    gtk_app_chooser_dialog_new(
      parent.getUnsafeRawPointer().asInstanceOf,
      flags,
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
      parent: Window,
      flags: GtkDialogFlags,
      content_type: String | CString
  )(using Zone): AppChooserDialog = new AppChooserDialog(
    gtk_app_chooser_dialog_new_for_content_type(
      parent.getUnsafeRawPointer().asInstanceOf,
      flags,
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
