package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCellLayoutIface

class CellLayoutIface private[gnome] (raw: Ptr[GtkCellLayoutIface]):

  def getUnsafeRawPointer(): Ptr[GtkCellLayoutIface] = this.raw

  @annotation.compileTimeOnly("[field pack_start]: Field is missing <type>")
  private def packStart__ = ???
  @annotation.compileTimeOnly("[field pack_end]: Field is missing <type>")
  private def packEnd__ = ???
  @annotation.compileTimeOnly("[field clear]: Field is missing <type>")
  private def clear__ = ???
  @annotation.compileTimeOnly("[field add_attribute]: Field is missing <type>")
  private def addAttribute__ = ???
  @annotation.compileTimeOnly(
    "[field set_cell_data_func]: Field is missing <type>"
  )
  private def setCellDataFunc__ = ???
  @annotation.compileTimeOnly(
    "[field clear_attributes]: Field is missing <type>"
  )
  private def clearAttributes__ = ???
  @annotation.compileTimeOnly("[field reorder]: Field is missing <type>")
  private def reorder__ = ???
  @annotation.compileTimeOnly("[field get_cells]: Field is missing <type>")
  private def getCells__ = ???
  @annotation.compileTimeOnly("[field get_area]: Field is missing <type>")
  private def getArea__ = ???
end CellLayoutIface

object CellLayoutIface:
  def fromRaw(ptr: Ptr[GtkCellLayoutIface]): CellLayoutIface =
    new CellLayoutIface(ptr)
end CellLayoutIface
