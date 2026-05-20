package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDataOutputStreamPrivate

class DataOutputStreamPrivate private[gnome] (
    raw: Ptr[GDataOutputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GDataOutputStreamPrivate] = this.raw
end DataOutputStreamPrivate

object DataOutputStreamPrivate:
  def fromRaw(ptr: Ptr[GDataOutputStreamPrivate]): DataOutputStreamPrivate =
    new DataOutputStreamPrivate(ptr)
end DataOutputStreamPrivate
