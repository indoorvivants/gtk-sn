package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkConstraintLayoutClass

class ConstraintLayoutClass private[gnome] (raw: Ptr[GtkConstraintLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkConstraintLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end ConstraintLayoutClass

object ConstraintLayoutClass:
  def fromRaw(ptr: Ptr[GtkConstraintLayoutClass]): ConstraintLayoutClass =
    new ConstraintLayoutClass(ptr)
end ConstraintLayoutClass
