package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkAlertDialogClass

class AlertDialogClass private[gnome] (raw: Ptr[GtkAlertDialogClass]):

  def getUnsafeRawPointer(): Ptr[GtkAlertDialogClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end AlertDialogClass

object AlertDialogClass:
  def fromRaw(ptr: Ptr[GtkAlertDialogClass]): AlertDialogClass =
    new AlertDialogClass(ptr)
end AlertDialogClass
