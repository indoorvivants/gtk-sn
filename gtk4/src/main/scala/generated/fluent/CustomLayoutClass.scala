package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkCustomLayoutClass

class CustomLayoutClass private[gnome] (raw: Ptr[GtkCustomLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkCustomLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end CustomLayoutClass

object CustomLayoutClass:
  def fromRaw(ptr: Ptr[GtkCustomLayoutClass]): CustomLayoutClass =
    new CustomLayoutClass(ptr)
end CustomLayoutClass
