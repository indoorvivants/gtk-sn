package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkGridClass

class GridClass private[gnome] (raw: Ptr[GtkGridClass]):

  def getUnsafeRawPointer(): Ptr[GtkGridClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]

end GridClass

object GridClass:
  def fromRaw(ptr: Ptr[GtkGridClass]): GridClass = new GridClass(ptr)
end GridClass
