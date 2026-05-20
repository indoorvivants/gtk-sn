package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCellRendererClassPrivate

class CellRendererClassPrivate private[gnome] (
    raw: Ptr[GtkCellRendererClassPrivate]
):

  def getUnsafeRawPointer(): Ptr[GtkCellRendererClassPrivate] = this.raw
end CellRendererClassPrivate

object CellRendererClassPrivate:
  def fromRaw(ptr: Ptr[GtkCellRendererClassPrivate]): CellRendererClassPrivate =
    new CellRendererClassPrivate(ptr)
end CellRendererClassPrivate
