package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkScaleButtonClass

class ScaleButtonClass private[gnome] (raw: Ptr[GtkScaleButtonClass]):

  def getUnsafeRawPointer(): Ptr[GtkScaleButtonClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field value_changed]: Field is missing <type>")
  private def valueChanged__ = ???

end ScaleButtonClass

object ScaleButtonClass:
  def fromRaw(ptr: Ptr[GtkScaleButtonClass]): ScaleButtonClass =
    new ScaleButtonClass(ptr)
end ScaleButtonClass
