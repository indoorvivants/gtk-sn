package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.ButtonClass
import sn.gnome.gtk4.internal.GtkToggleButtonClass

class ToggleButtonClass private[gnome] (raw: Ptr[GtkToggleButtonClass]):

  def getUnsafeRawPointer(): Ptr[GtkToggleButtonClass] = this.raw

  def parentClass: sn.gnome.gtk4.ButtonClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkButtonClass]
  @annotation.compileTimeOnly("[field toggled]: Field is missing <type>")
  private def toggled__ = ???

end ToggleButtonClass

object ToggleButtonClass:
  def fromRaw(ptr: Ptr[GtkToggleButtonClass]): ToggleButtonClass =
    new ToggleButtonClass(ptr)
end ToggleButtonClass
