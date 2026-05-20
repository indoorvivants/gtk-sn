package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkDropTargetAsyncClass

class DropTargetAsyncClass private[gnome] (raw: Ptr[GtkDropTargetAsyncClass]):

  def getUnsafeRawPointer(): Ptr[GtkDropTargetAsyncClass] = this.raw
end DropTargetAsyncClass

object DropTargetAsyncClass:
  def fromRaw(ptr: Ptr[GtkDropTargetAsyncClass]): DropTargetAsyncClass =
    new DropTargetAsyncClass(ptr)
end DropTargetAsyncClass
