package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutChildClass
import sn.gnome.gtk4.internal.GtkConstraintLayoutChildClass

class ConstraintLayoutChildClass private[gnome] (
    raw: Ptr[GtkConstraintLayoutChildClass]
):

  def getUnsafeRawPointer(): Ptr[GtkConstraintLayoutChildClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutChildClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutChildClass]
end ConstraintLayoutChildClass

object ConstraintLayoutChildClass:
  def fromRaw(
      ptr: Ptr[GtkConstraintLayoutChildClass]
  ): ConstraintLayoutChildClass = new ConstraintLayoutChildClass(ptr)
end ConstraintLayoutChildClass
