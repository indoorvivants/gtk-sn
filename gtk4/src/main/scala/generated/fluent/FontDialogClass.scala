package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkFontDialogClass

class FontDialogClass private[gnome] (raw: Ptr[GtkFontDialogClass]):

  def getUnsafeRawPointer(): Ptr[GtkFontDialogClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end FontDialogClass

object FontDialogClass:
  def fromRaw(ptr: Ptr[GtkFontDialogClass]): FontDialogClass =
    new FontDialogClass(ptr)
end FontDialogClass
