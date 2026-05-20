package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkDrawingAreaClass

class DrawingAreaClass private[gnome] (raw: Ptr[GtkDrawingAreaClass]):

  def getUnsafeRawPointer(): Ptr[GtkDrawingAreaClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field resize]: Field is missing <type>")
  private def resize__ = ???

end DrawingAreaClass

object DrawingAreaClass:
  def fromRaw(ptr: Ptr[GtkDrawingAreaClass]): DrawingAreaClass =
    new DrawingAreaClass(ptr)
end DrawingAreaClass
