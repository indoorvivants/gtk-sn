package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkFileDialogClass

class FileDialogClass private[gnome] (raw: Ptr[GtkFileDialogClass]):

  def getUnsafeRawPointer(): Ptr[GtkFileDialogClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end FileDialogClass

object FileDialogClass:
  def fromRaw(ptr: Ptr[GtkFileDialogClass]): FileDialogClass =
    new FileDialogClass(ptr)
end FileDialogClass
