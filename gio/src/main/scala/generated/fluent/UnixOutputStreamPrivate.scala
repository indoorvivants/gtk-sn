package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixOutputStreamPrivate

class UnixOutputStreamPrivate private[gnome] (
    raw: Ptr[GUnixOutputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GUnixOutputStreamPrivate] = this.raw

end UnixOutputStreamPrivate
object UnixOutputStreamPrivate:
  def fromRaw(ptr: Ptr[GUnixOutputStreamPrivate]): UnixOutputStreamPrivate =
    new UnixOutputStreamPrivate(ptr)
end UnixOutputStreamPrivate
