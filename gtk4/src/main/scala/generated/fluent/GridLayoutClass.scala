package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkGridLayoutClass

class GridLayoutClass private[gnome] (raw: Ptr[GtkGridLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkGridLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end GridLayoutClass

object GridLayoutClass:
  def fromRaw(ptr: Ptr[GtkGridLayoutClass]): GridLayoutClass =
    new GridLayoutClass(ptr)
end GridLayoutClass
