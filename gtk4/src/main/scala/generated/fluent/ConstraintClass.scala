package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkConstraintClass

class ConstraintClass private[gnome] (raw: Ptr[GtkConstraintClass]):

  def getUnsafeRawPointer(): Ptr[GtkConstraintClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end ConstraintClass

object ConstraintClass:
  def fromRaw(ptr: Ptr[GtkConstraintClass]): ConstraintClass =
    new ConstraintClass(ptr)
end ConstraintClass
