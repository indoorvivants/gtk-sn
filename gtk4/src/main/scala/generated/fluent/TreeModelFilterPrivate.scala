package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTreeModelFilterPrivate

class TreeModelFilterPrivate private[gnome] (
    raw: Ptr[GtkTreeModelFilterPrivate]
):

  def getUnsafeRawPointer(): Ptr[GtkTreeModelFilterPrivate] = this.raw
end TreeModelFilterPrivate

object TreeModelFilterPrivate:
  def fromRaw(ptr: Ptr[GtkTreeModelFilterPrivate]): TreeModelFilterPrivate =
    new TreeModelFilterPrivate(ptr)
end TreeModelFilterPrivate
