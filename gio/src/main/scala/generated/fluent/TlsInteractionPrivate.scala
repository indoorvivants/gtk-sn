package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsInteractionPrivate

class TlsInteractionPrivate private[gnome] (raw: Ptr[GTlsInteractionPrivate]):

  def getUnsafeRawPointer(): Ptr[GTlsInteractionPrivate] = this.raw
end TlsInteractionPrivate

object TlsInteractionPrivate:
  def fromRaw(ptr: Ptr[GTlsInteractionPrivate]): TlsInteractionPrivate =
    new TlsInteractionPrivate(ptr)
end TlsInteractionPrivate
