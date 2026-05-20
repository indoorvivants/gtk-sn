package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkListBoxRowClass

class ListBoxRowClass private[gnome] (raw: Ptr[GtkListBoxRowClass]):

  def getUnsafeRawPointer(): Ptr[GtkListBoxRowClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

end ListBoxRowClass

object ListBoxRowClass:
  def fromRaw(ptr: Ptr[GtkListBoxRowClass]): ListBoxRowClass =
    new ListBoxRowClass(ptr)
end ListBoxRowClass
