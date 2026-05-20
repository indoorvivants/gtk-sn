package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GBufferedOutputStreamPrivate

class BufferedOutputStreamPrivate private[gnome] (
    raw: Ptr[GBufferedOutputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GBufferedOutputStreamPrivate] = this.raw
end BufferedOutputStreamPrivate

object BufferedOutputStreamPrivate:
  def fromRaw(
      ptr: Ptr[GBufferedOutputStreamPrivate]
  ): BufferedOutputStreamPrivate = new BufferedOutputStreamPrivate(ptr)
end BufferedOutputStreamPrivate
