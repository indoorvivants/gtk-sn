package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEventControllerMotionClass

class EventControllerMotionClass private[gnome] (
    raw: Ptr[GtkEventControllerMotionClass]
):

  def getUnsafeRawPointer(): Ptr[GtkEventControllerMotionClass] = this.raw
end EventControllerMotionClass

object EventControllerMotionClass:
  def fromRaw(
      ptr: Ptr[GtkEventControllerMotionClass]
  ): EventControllerMotionClass = new EventControllerMotionClass(ptr)
end EventControllerMotionClass
