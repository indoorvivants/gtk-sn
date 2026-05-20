package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WindowClass
import sn.gnome.gtk4.internal.GtkDialogClass

class DialogClass private[gnome] (raw: Ptr[GtkDialogClass]):

  def getUnsafeRawPointer(): Ptr[GtkDialogClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WindowClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWindowClass]
  @annotation.compileTimeOnly("[field response]: Field is missing <type>")
  private def response__ = ???
  @annotation.compileTimeOnly("[field close]: Field is missing <type>")
  private def close__ = ???

end DialogClass

object DialogClass:
  def fromRaw(ptr: Ptr[GtkDialogClass]): DialogClass = new DialogClass(ptr)
end DialogClass
