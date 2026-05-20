package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkSelectionFilterModelClass

class SelectionFilterModelClass private[gnome] (
    raw: Ptr[GtkSelectionFilterModelClass]
):

  def getUnsafeRawPointer(): Ptr[GtkSelectionFilterModelClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end SelectionFilterModelClass

object SelectionFilterModelClass:
  def fromRaw(
      ptr: Ptr[GtkSelectionFilterModelClass]
  ): SelectionFilterModelClass = new SelectionFilterModelClass(ptr)
end SelectionFilterModelClass
