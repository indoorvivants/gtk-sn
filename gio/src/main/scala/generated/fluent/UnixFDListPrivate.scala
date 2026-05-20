package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixFDListPrivate

class UnixFDListPrivate private[gnome] (raw: Ptr[GUnixFDListPrivate]):

  def getUnsafeRawPointer(): Ptr[GUnixFDListPrivate] = this.raw
end UnixFDListPrivate

object UnixFDListPrivate:
  def fromRaw(ptr: Ptr[GUnixFDListPrivate]): UnixFDListPrivate =
    new UnixFDListPrivate(ptr)
end UnixFDListPrivate
