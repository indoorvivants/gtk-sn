package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkCenterLayoutClass

class CenterLayoutClass private[gnome] (raw: Ptr[GtkCenterLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkCenterLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end CenterLayoutClass

object CenterLayoutClass:
  def fromRaw(ptr: Ptr[GtkCenterLayoutClass]): CenterLayoutClass =
    new CenterLayoutClass(ptr)
end CenterLayoutClass
