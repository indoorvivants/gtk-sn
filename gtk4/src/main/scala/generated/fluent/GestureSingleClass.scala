package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureSingleClass

class GestureSingleClass private[gnome] (raw: Ptr[GtkGestureSingleClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureSingleClass] = this.raw
end GestureSingleClass

object GestureSingleClass:
  def fromRaw(ptr: Ptr[GtkGestureSingleClass]): GestureSingleClass =
    new GestureSingleClass(ptr)
end GestureSingleClass
