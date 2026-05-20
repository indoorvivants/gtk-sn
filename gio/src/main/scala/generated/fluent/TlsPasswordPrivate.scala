package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsPasswordPrivate

class TlsPasswordPrivate private[gnome] (raw: Ptr[GTlsPasswordPrivate]):

  def getUnsafeRawPointer(): Ptr[GTlsPasswordPrivate] = this.raw
end TlsPasswordPrivate

object TlsPasswordPrivate:
  def fromRaw(ptr: Ptr[GTlsPasswordPrivate]): TlsPasswordPrivate =
    new TlsPasswordPrivate(ptr)
end TlsPasswordPrivate
