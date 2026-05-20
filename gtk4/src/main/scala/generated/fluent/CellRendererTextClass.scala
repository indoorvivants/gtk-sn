package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.CellRendererClass
import sn.gnome.gtk4.internal.GtkCellRendererTextClass

class CellRendererTextClass private[gnome] (raw: Ptr[GtkCellRendererTextClass]):

  def getUnsafeRawPointer(): Ptr[GtkCellRendererTextClass] = this.raw

  def parentClass: sn.gnome.gtk4.CellRendererClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkCellRendererClass]
  @annotation.compileTimeOnly("[field edited]: Field is missing <type>")
  private def edited__ = ???

end CellRendererTextClass

object CellRendererTextClass:
  def fromRaw(ptr: Ptr[GtkCellRendererTextClass]): CellRendererTextClass =
    new CellRendererTextClass(ptr)
end CellRendererTextClass
