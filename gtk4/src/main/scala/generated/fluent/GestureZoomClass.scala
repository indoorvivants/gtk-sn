package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureZoomClass

class GestureZoomClass private[gnome] (raw: Ptr[GtkGestureZoomClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureZoomClass] = this.raw
end GestureZoomClass

object GestureZoomClass:
  def fromRaw(ptr: Ptr[GtkGestureZoomClass]): GestureZoomClass =
    new GestureZoomClass(ptr)
end GestureZoomClass
