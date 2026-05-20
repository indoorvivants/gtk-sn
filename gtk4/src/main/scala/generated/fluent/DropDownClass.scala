package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkDropDownClass

class DropDownClass private[gnome] (raw: Ptr[GtkDropDownClass]):

  def getUnsafeRawPointer(): Ptr[GtkDropDownClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end DropDownClass

object DropDownClass:
  def fromRaw(ptr: Ptr[GtkDropDownClass]): DropDownClass = new DropDownClass(
    ptr
  )
end DropDownClass
