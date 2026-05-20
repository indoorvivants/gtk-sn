package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileOutputStreamPrivate

class FileOutputStreamPrivate private[gnome] (
    raw: Ptr[GFileOutputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GFileOutputStreamPrivate] = this.raw
end FileOutputStreamPrivate

object FileOutputStreamPrivate:
  def fromRaw(ptr: Ptr[GFileOutputStreamPrivate]): FileOutputStreamPrivate =
    new FileOutputStreamPrivate(ptr)
end FileOutputStreamPrivate
