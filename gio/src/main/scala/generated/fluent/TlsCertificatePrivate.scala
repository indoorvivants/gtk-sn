package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsCertificatePrivate

class TlsCertificatePrivate private[gnome] (raw: Ptr[GTlsCertificatePrivate]):

  def getUnsafeRawPointer(): Ptr[GTlsCertificatePrivate] = this.raw
end TlsCertificatePrivate

object TlsCertificatePrivate:
  def fromRaw(ptr: Ptr[GTlsCertificatePrivate]): TlsCertificatePrivate =
    new TlsCertificatePrivate(ptr)
end TlsCertificatePrivate
