package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GBufferedInputStreamPrivate

class BufferedInputStreamPrivate private[gnome] (
    raw: Ptr[GBufferedInputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GBufferedInputStreamPrivate] = this.raw
end BufferedInputStreamPrivate

object BufferedInputStreamPrivate:
  def fromRaw(
      ptr: Ptr[GBufferedInputStreamPrivate]
  ): BufferedInputStreamPrivate = new BufferedInputStreamPrivate(ptr)
end BufferedInputStreamPrivate
