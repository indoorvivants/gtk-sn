package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkWindowControlsClass

class WindowControlsClass private[gnome] (raw: Ptr[GtkWindowControlsClass]):

  def getUnsafeRawPointer(): Ptr[GtkWindowControlsClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end WindowControlsClass

object WindowControlsClass:
  def fromRaw(ptr: Ptr[GtkWindowControlsClass]): WindowControlsClass =
    new WindowControlsClass(ptr)
end WindowControlsClass
