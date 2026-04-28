package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Dialog
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkButtonsType
import sn.gnome.gtk4.internal.GtkDialogFlags
import sn.gnome.gtk4.internal.GtkMessageDialog
import sn.gnome.gtk4.internal.GtkMessageType

class MessageDialog(raw: Ptr[GtkMessageDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  inline def formatSecondaryMarkup(
      message_format: String | CString,
      args: Any*
  )(using Zone): Unit = gtk_message_dialog_format_secondary_markup(
    this.raw.asInstanceOf,
    __sn_extract_string(message_format),
    args*
  )

  inline def formatSecondaryText(message_format: String | CString, args: Any*)(
      using Zone
  ): Unit = gtk_message_dialog_format_secondary_text(
    this.raw.asInstanceOf,
    __sn_extract_string(message_format),
    args*
  )

  def getMessageArea(): Widget = new Widget(
    gtk_message_dialog_get_message_area(this.raw.asInstanceOf).asInstanceOf
  )

  def setMarkup(str: String | CString)(using Zone): Unit =
    gtk_message_dialog_set_markup(
      this.raw.asInstanceOf,
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
  inline def apply(
      parent: Window,
      flags: GtkDialogFlags,
      `type`: GtkMessageType,
      buttons: GtkButtonsType,
      message_format: String | CString,
      args: Any*
  )(using Zone): MessageDialog = new MessageDialog(
    gtk_message_dialog_new(
      parent.getUnsafeRawPointer().asInstanceOf,
      flags,
      `type`,
      buttons,
      __sn_extract_string(message_format),
      args*
    ).asInstanceOf
  )
  inline def withMarkup(
      parent: Window,
      flags: GtkDialogFlags,
      `type`: GtkMessageType,
      buttons: GtkButtonsType,
      message_format: String | CString,
      args: Any*
  )(using Zone): MessageDialog = new MessageDialog(
    gtk_message_dialog_new_with_markup(
      parent.getUnsafeRawPointer().asInstanceOf,
      flags,
      `type`,
      buttons,
      __sn_extract_string(message_format),
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
end MessageDialog
