package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkConstraintGuideClass

class ConstraintGuideClass private[gnome] (raw: Ptr[GtkConstraintGuideClass]):

  def getUnsafeRawPointer(): Ptr[GtkConstraintGuideClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end ConstraintGuideClass

object ConstraintGuideClass:
  def fromRaw(ptr: Ptr[GtkConstraintGuideClass]): ConstraintGuideClass =
    new ConstraintGuideClass(ptr)
end ConstraintGuideClass
