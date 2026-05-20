package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkListStorePrivate

class ListStorePrivate private[gnome] (raw: Ptr[GtkListStorePrivate]):

  def getUnsafeRawPointer(): Ptr[GtkListStorePrivate] = this.raw
end ListStorePrivate

object ListStorePrivate:
  def fromRaw(ptr: Ptr[GtkListStorePrivate]): ListStorePrivate =
    new ListStorePrivate(ptr)
end ListStorePrivate
