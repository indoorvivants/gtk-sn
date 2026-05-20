package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureStylusClass

class GestureStylusClass private[gnome] (raw: Ptr[GtkGestureStylusClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureStylusClass] = this.raw
end GestureStylusClass

object GestureStylusClass:
  def fromRaw(ptr: Ptr[GtkGestureStylusClass]): GestureStylusClass =
    new GestureStylusClass(ptr)
end GestureStylusClass
