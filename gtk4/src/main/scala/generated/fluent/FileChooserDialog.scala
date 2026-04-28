package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Dialog
import sn.gnome.gtk4.fluent.FileChooser
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkFileChooserAction
import sn.gnome.gtk4.internal.GtkFileChooserDialog

class FileChooserDialog(raw: Ptr[GtkFileChooserDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FileChooser,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end FileChooserDialog

object FileChooserDialog:
  inline def apply(
      title: String | CString,
      parent: Window,
      action: GtkFileChooserAction,
      first_button_text: String | CString,
      args: Any*
  )(using Zone): FileChooserDialog = new FileChooserDialog(
    gtk_file_chooser_dialog_new(
      __sn_extract_string(title),
      parent.getUnsafeRawPointer().asInstanceOf,
      action,
      __sn_extract_string(first_button_text),
      args*
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
end FileChooserDialog
