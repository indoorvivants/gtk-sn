package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkDropTargetClass

class DropTargetClass private[gnome] (raw: Ptr[GtkDropTargetClass]):

  def getUnsafeRawPointer(): Ptr[GtkDropTargetClass] = this.raw
end DropTargetClass

object DropTargetClass:
  def fromRaw(ptr: Ptr[GtkDropTargetClass]): DropTargetClass =
    new DropTargetClass(ptr)
end DropTargetClass
