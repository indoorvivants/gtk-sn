package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkColorDialogClass

class ColorDialogClass private[gnome] (raw: Ptr[GtkColorDialogClass]):

  def getUnsafeRawPointer(): Ptr[GtkColorDialogClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end ColorDialogClass

object ColorDialogClass:
  def fromRaw(ptr: Ptr[GtkColorDialogClass]): ColorDialogClass =
    new ColorDialogClass(ptr)
end ColorDialogClass
