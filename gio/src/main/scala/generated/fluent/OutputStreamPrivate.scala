package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GOutputStreamPrivate

class OutputStreamPrivate private[gnome] (raw: Ptr[GOutputStreamPrivate]):

  def getUnsafeRawPointer(): Ptr[GOutputStreamPrivate] = this.raw
end OutputStreamPrivate

object OutputStreamPrivate:
  def fromRaw(ptr: Ptr[GOutputStreamPrivate]): OutputStreamPrivate =
    new OutputStreamPrivate(ptr)
end OutputStreamPrivate
