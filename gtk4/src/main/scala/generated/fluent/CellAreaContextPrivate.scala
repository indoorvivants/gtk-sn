package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCellAreaContextPrivate

class CellAreaContextPrivate private[gnome] (
    raw: Ptr[GtkCellAreaContextPrivate]
):

  def getUnsafeRawPointer(): Ptr[GtkCellAreaContextPrivate] = this.raw
end CellAreaContextPrivate

object CellAreaContextPrivate:
  def fromRaw(ptr: Ptr[GtkCellAreaContextPrivate]): CellAreaContextPrivate =
    new CellAreaContextPrivate(ptr)
end CellAreaContextPrivate
