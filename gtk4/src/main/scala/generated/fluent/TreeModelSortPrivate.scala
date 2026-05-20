package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTreeModelSortPrivate

class TreeModelSortPrivate private[gnome] (raw: Ptr[GtkTreeModelSortPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkTreeModelSortPrivate] = this.raw
end TreeModelSortPrivate

object TreeModelSortPrivate:
  def fromRaw(ptr: Ptr[GtkTreeModelSortPrivate]): TreeModelSortPrivate =
    new TreeModelSortPrivate(ptr)
end TreeModelSortPrivate
