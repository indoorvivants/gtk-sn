package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileEnumeratorPrivate

class FileEnumeratorPrivate private[gnome] (raw: Ptr[GFileEnumeratorPrivate]):

  def getUnsafeRawPointer(): Ptr[GFileEnumeratorPrivate] = this.raw
end FileEnumeratorPrivate

object FileEnumeratorPrivate:
  def fromRaw(ptr: Ptr[GFileEnumeratorPrivate]): FileEnumeratorPrivate =
    new FileEnumeratorPrivate(ptr)
end FileEnumeratorPrivate
