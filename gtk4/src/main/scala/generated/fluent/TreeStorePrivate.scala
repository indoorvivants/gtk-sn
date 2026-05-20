package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTreeStorePrivate

class TreeStorePrivate private[gnome] (raw: Ptr[GtkTreeStorePrivate]):

  def getUnsafeRawPointer(): Ptr[GtkTreeStorePrivate] = this.raw
end TreeStorePrivate

object TreeStorePrivate:
  def fromRaw(ptr: Ptr[GtkTreeStorePrivate]): TreeStorePrivate =
    new TreeStorePrivate(ptr)
end TreeStorePrivate
