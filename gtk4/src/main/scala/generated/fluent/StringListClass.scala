package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkStringListClass

class StringListClass private[gnome] (raw: Ptr[GtkStringListClass]):

  def getUnsafeRawPointer(): Ptr[GtkStringListClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end StringListClass

object StringListClass:
  def fromRaw(ptr: Ptr[GtkStringListClass]): StringListClass =
    new StringListClass(ptr)
end StringListClass
