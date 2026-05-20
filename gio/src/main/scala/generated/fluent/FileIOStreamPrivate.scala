package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileIOStreamPrivate

class FileIOStreamPrivate private[gnome] (raw: Ptr[GFileIOStreamPrivate]):

  def getUnsafeRawPointer(): Ptr[GFileIOStreamPrivate] = this.raw
end FileIOStreamPrivate

object FileIOStreamPrivate:
  def fromRaw(ptr: Ptr[GFileIOStreamPrivate]): FileIOStreamPrivate =
    new FileIOStreamPrivate(ptr)
end FileIOStreamPrivate
