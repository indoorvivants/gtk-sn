package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDesktopAppInfoClass

class DesktopAppInfoClass private[gnome] (raw: Ptr[GDesktopAppInfoClass]):

  def getUnsafeRawPointer(): Ptr[GDesktopAppInfoClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ =
    sn.gnome.gobject.ObjectClass.fromRaw((!raw).parent_class)
end DesktopAppInfoClass
object DesktopAppInfoClass:
  def fromRaw(ptr: Ptr[GDesktopAppInfoClass]): DesktopAppInfoClass =
    new DesktopAppInfoClass(ptr)
end DesktopAppInfoClass
