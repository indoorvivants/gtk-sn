package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMemoryInputStreamPrivate

class MemoryInputStreamPrivate private[gnome] (
    raw: Ptr[GMemoryInputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GMemoryInputStreamPrivate] = this.raw
end MemoryInputStreamPrivate

object MemoryInputStreamPrivate:
  def fromRaw(ptr: Ptr[GMemoryInputStreamPrivate]): MemoryInputStreamPrivate =
    new MemoryInputStreamPrivate(ptr)
end MemoryInputStreamPrivate
