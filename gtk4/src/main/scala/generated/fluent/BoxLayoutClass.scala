package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkBoxLayoutClass

class BoxLayoutClass private[gnome] (raw: Ptr[GtkBoxLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkBoxLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end BoxLayoutClass

object BoxLayoutClass:
  def fromRaw(ptr: Ptr[GtkBoxLayoutClass]): BoxLayoutClass = new BoxLayoutClass(
    ptr
  )
end BoxLayoutClass
