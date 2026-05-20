package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInputStreamPrivate

class InputStreamPrivate private[gnome] (raw: Ptr[GInputStreamPrivate]):

  def getUnsafeRawPointer(): Ptr[GInputStreamPrivate] = this.raw
end InputStreamPrivate

object InputStreamPrivate:
  def fromRaw(ptr: Ptr[GInputStreamPrivate]): InputStreamPrivate =
    new InputStreamPrivate(ptr)
end InputStreamPrivate
