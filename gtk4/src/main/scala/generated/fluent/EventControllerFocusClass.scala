package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEventControllerFocusClass

class EventControllerFocusClass private[gnome] (
    raw: Ptr[GtkEventControllerFocusClass]
):

  def getUnsafeRawPointer(): Ptr[GtkEventControllerFocusClass] = this.raw
end EventControllerFocusClass

object EventControllerFocusClass:
  def fromRaw(
      ptr: Ptr[GtkEventControllerFocusClass]
  ): EventControllerFocusClass = new EventControllerFocusClass(ptr)
end EventControllerFocusClass
