package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkFixedLayoutClass

class FixedLayoutClass private[gnome] (raw: Ptr[GtkFixedLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkFixedLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end FixedLayoutClass

object FixedLayoutClass:
  def fromRaw(ptr: Ptr[GtkFixedLayoutClass]): FixedLayoutClass =
    new FixedLayoutClass(ptr)
end FixedLayoutClass
