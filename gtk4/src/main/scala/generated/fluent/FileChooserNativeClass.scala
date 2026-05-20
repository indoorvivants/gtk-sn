package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.NativeDialogClass
import sn.gnome.gtk4.internal.GtkFileChooserNativeClass

class FileChooserNativeClass private[gnome] (
    raw: Ptr[GtkFileChooserNativeClass]
):

  def getUnsafeRawPointer(): Ptr[GtkFileChooserNativeClass] = this.raw

  def parentClass: sn.gnome.gtk4.NativeDialogClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkNativeDialogClass]
end FileChooserNativeClass

object FileChooserNativeClass:
  def fromRaw(ptr: Ptr[GtkFileChooserNativeClass]): FileChooserNativeClass =
    new FileChooserNativeClass(ptr)
end FileChooserNativeClass
