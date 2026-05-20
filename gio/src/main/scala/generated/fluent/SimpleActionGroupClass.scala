package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSimpleActionGroupClass

class SimpleActionGroupClass private[gnome] (raw: Ptr[GSimpleActionGroupClass]):

  def getUnsafeRawPointer(): Ptr[GSimpleActionGroupClass] = this.raw

end SimpleActionGroupClass

object SimpleActionGroupClass:
  def fromRaw(ptr: Ptr[GSimpleActionGroupClass]): SimpleActionGroupClass =
    new SimpleActionGroupClass(ptr)
end SimpleActionGroupClass
