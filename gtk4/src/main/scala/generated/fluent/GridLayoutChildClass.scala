package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutChildClass
import sn.gnome.gtk4.internal.GtkGridLayoutChildClass

class GridLayoutChildClass private[gnome] (raw: Ptr[GtkGridLayoutChildClass]):

  def getUnsafeRawPointer(): Ptr[GtkGridLayoutChildClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutChildClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutChildClass]
end GridLayoutChildClass

object GridLayoutChildClass:
  def fromRaw(ptr: Ptr[GtkGridLayoutChildClass]): GridLayoutChildClass =
    new GridLayoutChildClass(ptr)
end GridLayoutChildClass
