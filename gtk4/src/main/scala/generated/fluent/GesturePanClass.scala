package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGesturePanClass

class GesturePanClass private[gnome] (raw: Ptr[GtkGesturePanClass]):

  def getUnsafeRawPointer(): Ptr[GtkGesturePanClass] = this.raw
end GesturePanClass

object GesturePanClass:
  def fromRaw(ptr: Ptr[GtkGesturePanClass]): GesturePanClass =
    new GesturePanClass(ptr)
end GesturePanClass
