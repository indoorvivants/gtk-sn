package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileInputStreamPrivate

class FileInputStreamPrivate private[gnome] (raw: Ptr[GFileInputStreamPrivate]):

  def getUnsafeRawPointer(): Ptr[GFileInputStreamPrivate] = this.raw
end FileInputStreamPrivate

object FileInputStreamPrivate:
  def fromRaw(ptr: Ptr[GFileInputStreamPrivate]): FileInputStreamPrivate =
    new FileInputStreamPrivate(ptr)
end FileInputStreamPrivate
