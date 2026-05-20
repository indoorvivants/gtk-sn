package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDataInputStreamPrivate

class DataInputStreamPrivate private[gnome] (raw: Ptr[GDataInputStreamPrivate]):

  def getUnsafeRawPointer(): Ptr[GDataInputStreamPrivate] = this.raw
end DataInputStreamPrivate

object DataInputStreamPrivate:
  def fromRaw(ptr: Ptr[GDataInputStreamPrivate]): DataInputStreamPrivate =
    new DataInputStreamPrivate(ptr)
end DataInputStreamPrivate
