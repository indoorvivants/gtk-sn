package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkDragIconClass

class DragIconClass private[gnome] (raw: Ptr[GtkDragIconClass]):

  def getUnsafeRawPointer(): Ptr[GtkDragIconClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end DragIconClass

object DragIconClass:
  def fromRaw(ptr: Ptr[GtkDragIconClass]): DragIconClass = new DragIconClass(
    ptr
  )
end DragIconClass
