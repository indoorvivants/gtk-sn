package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGestureLongPressClass

class GestureLongPressClass private[gnome] (raw: Ptr[GtkGestureLongPressClass]):

  def getUnsafeRawPointer(): Ptr[GtkGestureLongPressClass] = this.raw
end GestureLongPressClass

object GestureLongPressClass:
  def fromRaw(ptr: Ptr[GtkGestureLongPressClass]): GestureLongPressClass =
    new GestureLongPressClass(ptr)
end GestureLongPressClass
