package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMemoryOutputStreamPrivate

class MemoryOutputStreamPrivate private[gnome] (
    raw: Ptr[GMemoryOutputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GMemoryOutputStreamPrivate] = this.raw
end MemoryOutputStreamPrivate

object MemoryOutputStreamPrivate:
  def fromRaw(ptr: Ptr[GMemoryOutputStreamPrivate]): MemoryOutputStreamPrivate =
    new MemoryOutputStreamPrivate(ptr)
end MemoryOutputStreamPrivate
