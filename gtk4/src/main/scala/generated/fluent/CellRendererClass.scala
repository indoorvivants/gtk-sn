package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCellRendererClass

class CellRendererClass private[gnome] (raw: Ptr[GtkCellRendererClass]):

  def getUnsafeRawPointer(): Ptr[GtkCellRendererClass] = this.raw

  @annotation.compileTimeOnly(
    "[field get_request_mode]: Field is missing <type>"
  )
  private def getRequestMode__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_width]: Field is missing <type>"
  )
  private def getPreferredWidth__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_height_for_width]: Field is missing <type>"
  )
  private def getPreferredHeightForWidth__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_height]: Field is missing <type>"
  )
  private def getPreferredHeight__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_width_for_height]: Field is missing <type>"
  )
  private def getPreferredWidthForHeight__ = ???
  @annotation.compileTimeOnly(
    "[field get_aligned_area]: Field is missing <type>"
  )
  private def getAlignedArea__ = ???
  @annotation.compileTimeOnly("[field snapshot]: Field is missing <type>")
  private def snapshot__ = ???
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???
  @annotation.compileTimeOnly("[field start_editing]: Field is missing <type>")
  private def startEditing__ = ???
  @annotation.compileTimeOnly(
    "[field editing_canceled]: Field is missing <type>"
  )
  private def editingCanceled__ = ???
  @annotation.compileTimeOnly(
    "[field editing_started]: Field is missing <type>"
  )
  private def editingStarted__ = ???

end CellRendererClass

object CellRendererClass:
  def fromRaw(ptr: Ptr[GtkCellRendererClass]): CellRendererClass =
    new CellRendererClass(ptr)
end CellRendererClass
