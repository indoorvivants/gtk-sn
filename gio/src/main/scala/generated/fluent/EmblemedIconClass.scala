package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GEmblemedIconClass
import sn.gnome.gobject.ObjectClass

class EmblemedIconClass private[gnome] (raw: Ptr[GEmblemedIconClass]):

  def getUnsafeRawPointer(): Ptr[GEmblemedIconClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end EmblemedIconClass

object EmblemedIconClass:
  def fromRaw(ptr: Ptr[GEmblemedIconClass]): EmblemedIconClass =
    new EmblemedIconClass(ptr)
end EmblemedIconClass
