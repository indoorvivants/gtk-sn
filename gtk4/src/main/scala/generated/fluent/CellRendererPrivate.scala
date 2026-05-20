package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCellRendererPrivate

class CellRendererPrivate private[gnome] (raw: Ptr[GtkCellRendererPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkCellRendererPrivate] = this.raw
end CellRendererPrivate

object CellRendererPrivate:
  def fromRaw(ptr: Ptr[GtkCellRendererPrivate]): CellRendererPrivate =
    new CellRendererPrivate(ptr)
end CellRendererPrivate
