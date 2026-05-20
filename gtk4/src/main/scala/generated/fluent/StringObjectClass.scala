package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkStringObjectClass

class StringObjectClass private[gnome] (raw: Ptr[GtkStringObjectClass]):

  def getUnsafeRawPointer(): Ptr[GtkStringObjectClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end StringObjectClass

object StringObjectClass:
  def fromRaw(ptr: Ptr[GtkStringObjectClass]): StringObjectClass =
    new StringObjectClass(ptr)
end StringObjectClass
