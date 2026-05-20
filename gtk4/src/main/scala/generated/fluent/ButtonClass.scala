package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkButtonClass

class ButtonClass private[gnome] (raw: Ptr[GtkButtonClass]):

  def getUnsafeRawPointer(): Ptr[GtkButtonClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field clicked]: Field is missing <type>")
  private def clicked__ = ???
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

end ButtonClass

object ButtonClass:
  def fromRaw(ptr: Ptr[GtkButtonClass]): ButtonClass = new ButtonClass(ptr)
end ButtonClass
