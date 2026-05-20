package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCellEditableIface

class CellEditableIface private[gnome] (raw: Ptr[GtkCellEditableIface]):

  def getUnsafeRawPointer(): Ptr[GtkCellEditableIface] = this.raw

  @annotation.compileTimeOnly("[field editing_done]: Field is missing <type>")
  private def editingDone__ = ???
  @annotation.compileTimeOnly("[field remove_widget]: Field is missing <type>")
  private def removeWidget__ = ???
  @annotation.compileTimeOnly("[field start_editing]: Field is missing <type>")
  private def startEditing__ = ???
end CellEditableIface

object CellEditableIface:
  def fromRaw(ptr: Ptr[GtkCellEditableIface]): CellEditableIface =
    new CellEditableIface(ptr)
end CellEditableIface
