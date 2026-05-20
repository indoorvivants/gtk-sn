package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkLayoutChildClass

class LayoutChildClass private[gnome] (raw: Ptr[GtkLayoutChildClass]):

  def getUnsafeRawPointer(): Ptr[GtkLayoutChildClass] = this.raw

end LayoutChildClass

object LayoutChildClass:
  def fromRaw(ptr: Ptr[GtkLayoutChildClass]): LayoutChildClass =
    new LayoutChildClass(ptr)
end LayoutChildClass
