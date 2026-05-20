package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEventControllerScrollClass

class EventControllerScrollClass private[gnome] (
    raw: Ptr[GtkEventControllerScrollClass]
):

  def getUnsafeRawPointer(): Ptr[GtkEventControllerScrollClass] = this.raw
end EventControllerScrollClass

object EventControllerScrollClass:
  def fromRaw(
      ptr: Ptr[GtkEventControllerScrollClass]
  ): EventControllerScrollClass = new EventControllerScrollClass(ptr)
end EventControllerScrollClass
