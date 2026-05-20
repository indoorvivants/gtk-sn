package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCellAreaContextClass

class CellAreaContextClass private[gnome] (raw: Ptr[GtkCellAreaContextClass]):

  def getUnsafeRawPointer(): Ptr[GtkCellAreaContextClass] = this.raw

  @annotation.compileTimeOnly("[field allocate]: Field is missing <type>")
  private def allocate__ = ???
  @annotation.compileTimeOnly("[field reset]: Field is missing <type>")
  private def reset__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_height_for_width]: Field is missing <type>"
  )
  private def getPreferredHeightForWidth__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_width_for_height]: Field is missing <type>"
  )
  private def getPreferredWidthForHeight__ = ???

end CellAreaContextClass

object CellAreaContextClass:
  def fromRaw(ptr: Ptr[GtkCellAreaContextClass]): CellAreaContextClass =
    new CellAreaContextClass(ptr)
end CellAreaContextClass
