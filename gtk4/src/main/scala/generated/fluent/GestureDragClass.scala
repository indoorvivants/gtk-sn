package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureDragClass

class GestureDragClass private[gnome] (raw: Ptr[GtkGestureDragClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureDragClass] = this.raw
end GestureDragClass

object GestureDragClass:
  def fromRaw(ptr: Ptr[GtkGestureDragClass]): GestureDragClass =
    new GestureDragClass(ptr)
end GestureDragClass
