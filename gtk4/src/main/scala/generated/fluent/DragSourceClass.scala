package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkDragSourceClass

class DragSourceClass private[gnome] (raw: Ptr[GtkDragSourceClass]):

  def getUnsafeRawPointer(): Ptr[GtkDragSourceClass] = this.raw
end DragSourceClass

object DragSourceClass:
  def fromRaw(ptr: Ptr[GtkDragSourceClass]): DragSourceClass =
    new DragSourceClass(ptr)
end DragSourceClass
