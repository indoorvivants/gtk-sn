package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixInputStreamPrivate

class UnixInputStreamPrivate private[gnome] (raw: Ptr[GUnixInputStreamPrivate]):

  def getUnsafeRawPointer(): Ptr[GUnixInputStreamPrivate] = this.raw

end UnixInputStreamPrivate
object UnixInputStreamPrivate:
  def fromRaw(ptr: Ptr[GUnixInputStreamPrivate]): UnixInputStreamPrivate =
    new UnixInputStreamPrivate(ptr)
end UnixInputStreamPrivate
