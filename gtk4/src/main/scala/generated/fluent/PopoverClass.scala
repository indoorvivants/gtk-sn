package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkPopoverClass

class PopoverClass private[gnome] (raw: Ptr[GtkPopoverClass]):

  def getUnsafeRawPointer(): Ptr[GtkPopoverClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field closed]: Field is missing <type>")
  private def closed__ = ???
  @annotation.compileTimeOnly(
    "[field activate_default]: Field is missing <type>"
  )
  private def activateDefault__ = ???

end PopoverClass

object PopoverClass:
  def fromRaw(ptr: Ptr[GtkPopoverClass]): PopoverClass = new PopoverClass(ptr)
end PopoverClass
