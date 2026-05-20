package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureClickClass

class GestureClickClass private[gnome] (raw: Ptr[GtkGestureClickClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureClickClass] = this.raw
end GestureClickClass

object GestureClickClass:
  def fromRaw(ptr: Ptr[GtkGestureClickClass]): GestureClickClass =
    new GestureClickClass(ptr)
end GestureClickClass
