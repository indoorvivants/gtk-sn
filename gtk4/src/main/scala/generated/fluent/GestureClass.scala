package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureClass

class GestureClass private[gnome] (raw: Ptr[GtkGestureClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureClass] = this.raw
end GestureClass

object GestureClass:
  def fromRaw(ptr: Ptr[GtkGestureClass]): GestureClass = new GestureClass(ptr)
end GestureClass
