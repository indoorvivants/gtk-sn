package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WindowClass
import sn.gnome.gtk4.internal.GtkApplicationWindowClass

class ApplicationWindowClass private[gnome] (
    raw: Ptr[GtkApplicationWindowClass]
):

  def getUnsafeRawPointer(): Ptr[GtkApplicationWindowClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WindowClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWindowClass]

end ApplicationWindowClass

object ApplicationWindowClass:
  def fromRaw(ptr: Ptr[GtkApplicationWindowClass]): ApplicationWindowClass =
    new ApplicationWindowClass(ptr)
end ApplicationWindowClass
