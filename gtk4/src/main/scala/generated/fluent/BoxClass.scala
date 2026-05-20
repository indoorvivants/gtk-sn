package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkBoxClass

class BoxClass private[gnome] (raw: Ptr[GtkBoxClass]):

  def getUnsafeRawPointer(): Ptr[GtkBoxClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]

end BoxClass

object BoxClass:
  def fromRaw(ptr: Ptr[GtkBoxClass]): BoxClass = new BoxClass(ptr)
end BoxClass
