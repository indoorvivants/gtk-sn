package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSimpleActionGroupPrivate

class SimpleActionGroupPrivate private[gnome] (
    raw: Ptr[GSimpleActionGroupPrivate]
):

  def getUnsafeRawPointer(): Ptr[GSimpleActionGroupPrivate] = this.raw
end SimpleActionGroupPrivate

object SimpleActionGroupPrivate:
  def fromRaw(ptr: Ptr[GSimpleActionGroupPrivate]): SimpleActionGroupPrivate =
    new SimpleActionGroupPrivate(ptr)
end SimpleActionGroupPrivate
