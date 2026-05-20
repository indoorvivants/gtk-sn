package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixConnectionPrivate

class UnixConnectionPrivate private[gnome] (raw: Ptr[GUnixConnectionPrivate]):

  def getUnsafeRawPointer(): Ptr[GUnixConnectionPrivate] = this.raw
end UnixConnectionPrivate

object UnixConnectionPrivate:
  def fromRaw(ptr: Ptr[GUnixConnectionPrivate]): UnixConnectionPrivate =
    new UnixConnectionPrivate(ptr)
end UnixConnectionPrivate
