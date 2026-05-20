package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTreeDragDestIface

class TreeDragDestIface private[gnome] (raw: Ptr[GtkTreeDragDestIface]):

  def getUnsafeRawPointer(): Ptr[GtkTreeDragDestIface] = this.raw

  @annotation.compileTimeOnly(
    "[field drag_data_received]: Field is missing <type>"
  )
  private def dragDataReceived__ = ???
  @annotation.compileTimeOnly(
    "[field row_drop_possible]: Field is missing <type>"
  )
  private def rowDropPossible__ = ???
end TreeDragDestIface

object TreeDragDestIface:
  def fromRaw(ptr: Ptr[GtkTreeDragDestIface]): TreeDragDestIface =
    new TreeDragDestIface(ptr)
end TreeDragDestIface
