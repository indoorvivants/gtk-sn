package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsDatabasePrivate

class TlsDatabasePrivate private[gnome] (raw: Ptr[GTlsDatabasePrivate]):

  def getUnsafeRawPointer(): Ptr[GTlsDatabasePrivate] = this.raw
end TlsDatabasePrivate

object TlsDatabasePrivate:
  def fromRaw(ptr: Ptr[GTlsDatabasePrivate]): TlsDatabasePrivate =
    new TlsDatabasePrivate(ptr)
end TlsDatabasePrivate
