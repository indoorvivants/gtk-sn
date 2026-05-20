package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutChildClass
import sn.gnome.gtk4.internal.GtkFixedLayoutChildClass

class FixedLayoutChildClass private[gnome] (raw: Ptr[GtkFixedLayoutChildClass]):

  def getUnsafeRawPointer(): Ptr[GtkFixedLayoutChildClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutChildClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutChildClass]
end FixedLayoutChildClass

object FixedLayoutChildClass:
  def fromRaw(ptr: Ptr[GtkFixedLayoutChildClass]): FixedLayoutChildClass =
    new FixedLayoutChildClass(ptr)
end FixedLayoutChildClass
