package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkWindowClass

class WindowClass private[gnome] (raw: Ptr[GtkWindowClass]):

  def getUnsafeRawPointer(): Ptr[GtkWindowClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field activate_focus]: Field is missing <type>")
  private def activateFocus__ = ???
  @annotation.compileTimeOnly(
    "[field activate_default]: Field is missing <type>"
  )
  private def activateDefault__ = ???
  @annotation.compileTimeOnly("[field keys_changed]: Field is missing <type>")
  private def keysChanged__ = ???
  @annotation.compileTimeOnly(
    "[field enable_debugging]: Field is missing <type>"
  )
  private def enableDebugging__ = ???
  @annotation.compileTimeOnly("[field close_request]: Field is missing <type>")
  private def closeRequest__ = ???

end WindowClass

object WindowClass:
  def fromRaw(ptr: Ptr[GtkWindowClass]): WindowClass = new WindowClass(ptr)
end WindowClass
