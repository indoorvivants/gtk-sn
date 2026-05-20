package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuModelPrivate

class MenuModelPrivate private[gnome] (raw: Ptr[GMenuModelPrivate]):

  def getUnsafeRawPointer(): Ptr[GMenuModelPrivate] = this.raw
end MenuModelPrivate

object MenuModelPrivate:
  def fromRaw(ptr: Ptr[GMenuModelPrivate]): MenuModelPrivate =
    new MenuModelPrivate(ptr)
end MenuModelPrivate
