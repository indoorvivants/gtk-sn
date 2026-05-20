package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkWindowHandleClass

class WindowHandleClass private[gnome] (raw: Ptr[GtkWindowHandleClass]):

  def getUnsafeRawPointer(): Ptr[GtkWindowHandleClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end WindowHandleClass

object WindowHandleClass:
  def fromRaw(ptr: Ptr[GtkWindowHandleClass]): WindowHandleClass =
    new WindowHandleClass(ptr)
end WindowHandleClass
