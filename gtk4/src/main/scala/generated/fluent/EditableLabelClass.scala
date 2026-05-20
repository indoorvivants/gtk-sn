package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkEditableLabelClass

class EditableLabelClass private[gnome] (raw: Ptr[GtkEditableLabelClass]):

  def getUnsafeRawPointer(): Ptr[GtkEditableLabelClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end EditableLabelClass

object EditableLabelClass:
  def fromRaw(ptr: Ptr[GtkEditableLabelClass]): EditableLabelClass =
    new EditableLabelClass(ptr)
end EditableLabelClass
