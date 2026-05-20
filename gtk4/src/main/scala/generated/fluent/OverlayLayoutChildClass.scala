package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutChildClass
import sn.gnome.gtk4.internal.GtkOverlayLayoutChildClass

class OverlayLayoutChildClass private[gnome] (
    raw: Ptr[GtkOverlayLayoutChildClass]
):

  def getUnsafeRawPointer(): Ptr[GtkOverlayLayoutChildClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutChildClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutChildClass]
end OverlayLayoutChildClass

object OverlayLayoutChildClass:
  def fromRaw(ptr: Ptr[GtkOverlayLayoutChildClass]): OverlayLayoutChildClass =
    new OverlayLayoutChildClass(ptr)
end OverlayLayoutChildClass
