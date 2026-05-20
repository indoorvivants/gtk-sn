package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkOverlayLayoutClass

class OverlayLayoutClass private[gnome] (raw: Ptr[GtkOverlayLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkOverlayLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end OverlayLayoutClass

object OverlayLayoutClass:
  def fromRaw(ptr: Ptr[GtkOverlayLayoutClass]): OverlayLayoutClass =
    new OverlayLayoutClass(ptr)
end OverlayLayoutClass
