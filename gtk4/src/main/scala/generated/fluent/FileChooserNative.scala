package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.FileChooser
import sn.gnome.gtk4.fluent.NativeDialog
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkFileChooserAction
import sn.gnome.gtk4.internal.GtkFileChooserNative

class FileChooserNative(raw: Ptr[GtkFileChooserNative])
    extends NativeDialog(raw.asInstanceOf),
      FileChooser:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAcceptLabel()(using Zone): String = fromCString(
    gtk_file_chooser_native_get_accept_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getCancelLabel()(using Zone): String = fromCString(
    gtk_file_chooser_native_get_cancel_label(this.raw.asInstanceOf).asInstanceOf
  )

  def setAcceptLabel(accept_label: String | CString)(using Zone): Unit =
    gtk_file_chooser_native_set_accept_label(
      this.raw.asInstanceOf,
      __sn_extract_string(accept_label)
    )

  def setCancelLabel(cancel_label: String | CString)(using Zone): Unit =
    gtk_file_chooser_native_set_cancel_label(
      this.raw.asInstanceOf,
      __sn_extract_string(cancel_label)
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
  def apply(
      title: String | CString,
      parent: Window,
      action: GtkFileChooserAction,
      accept_label: String | CString,
      cancel_label: String | CString
  )(using Zone): FileChooserNative = new FileChooserNative(
    gtk_file_chooser_native_new(
      __sn_extract_string(title),
      parent.getUnsafeRawPointer().asInstanceOf,
      action,
      __sn_extract_string(accept_label),
      __sn_extract_string(cancel_label)
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
