package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureRotateClass

class GestureRotateClass private[gnome] (raw: Ptr[GtkGestureRotateClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureRotateClass] = this.raw
end GestureRotateClass

object GestureRotateClass:
  def fromRaw(ptr: Ptr[GtkGestureRotateClass]): GestureRotateClass =
    new GestureRotateClass(ptr)
end GestureRotateClass
