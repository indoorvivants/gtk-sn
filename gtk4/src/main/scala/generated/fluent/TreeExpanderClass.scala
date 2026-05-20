package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkTreeExpanderClass

class TreeExpanderClass private[gnome] (raw: Ptr[GtkTreeExpanderClass]):

  def getUnsafeRawPointer(): Ptr[GtkTreeExpanderClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end TreeExpanderClass

object TreeExpanderClass:
  def fromRaw(ptr: Ptr[GtkTreeExpanderClass]): TreeExpanderClass =
    new TreeExpanderClass(ptr)
end TreeExpanderClass
