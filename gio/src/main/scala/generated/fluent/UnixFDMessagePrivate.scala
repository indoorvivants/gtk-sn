package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixFDMessagePrivate

class UnixFDMessagePrivate private[gnome] (raw: Ptr[GUnixFDMessagePrivate]):

  def getUnsafeRawPointer(): Ptr[GUnixFDMessagePrivate] = this.raw

end UnixFDMessagePrivate
object UnixFDMessagePrivate:
  def fromRaw(ptr: Ptr[GUnixFDMessagePrivate]): UnixFDMessagePrivate =
    new UnixFDMessagePrivate(ptr)
end UnixFDMessagePrivate
