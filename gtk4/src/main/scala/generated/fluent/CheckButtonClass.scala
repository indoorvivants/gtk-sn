package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkCheckButtonClass

class CheckButtonClass private[gnome] (raw: Ptr[GtkCheckButtonClass]):

  def getUnsafeRawPointer(): Ptr[GtkCheckButtonClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field toggled]: Field is missing <type>")
  private def toggled__ = ???
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

end CheckButtonClass

object CheckButtonClass:
  def fromRaw(ptr: Ptr[GtkCheckButtonClass]): CheckButtonClass =
    new CheckButtonClass(ptr)
end CheckButtonClass
