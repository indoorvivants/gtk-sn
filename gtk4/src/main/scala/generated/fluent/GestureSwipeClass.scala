package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureSwipeClass

class GestureSwipeClass private[gnome] (raw: Ptr[GtkGestureSwipeClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureSwipeClass] = this.raw
end GestureSwipeClass

object GestureSwipeClass:
  def fromRaw(ptr: Ptr[GtkGestureSwipeClass]): GestureSwipeClass =
    new GestureSwipeClass(ptr)
end GestureSwipeClass
