package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsConnectionPrivate

class TlsConnectionPrivate private[gnome] (raw: Ptr[GTlsConnectionPrivate]):

  def getUnsafeRawPointer(): Ptr[GTlsConnectionPrivate] = this.raw
end TlsConnectionPrivate

object TlsConnectionPrivate:
  def fromRaw(ptr: Ptr[GTlsConnectionPrivate]): TlsConnectionPrivate =
    new TlsConnectionPrivate(ptr)
end TlsConnectionPrivate
