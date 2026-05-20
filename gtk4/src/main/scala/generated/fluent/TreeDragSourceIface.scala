package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTreeDragSourceIface

class TreeDragSourceIface private[gnome] (raw: Ptr[GtkTreeDragSourceIface]):

  def getUnsafeRawPointer(): Ptr[GtkTreeDragSourceIface] = this.raw

  @annotation.compileTimeOnly("[field row_draggable]: Field is missing <type>")
  private def rowDraggable__ = ???
  @annotation.compileTimeOnly("[field drag_data_get]: Field is missing <type>")
  private def dragDataGet__ = ???
  @annotation.compileTimeOnly(
    "[field drag_data_delete]: Field is missing <type>"
  )
  private def dragDataDelete__ = ???
end TreeDragSourceIface

object TreeDragSourceIface:
  def fromRaw(ptr: Ptr[GtkTreeDragSourceIface]): TreeDragSourceIface =
    new TreeDragSourceIface(ptr)
end TreeDragSourceIface
