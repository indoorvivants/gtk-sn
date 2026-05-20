package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEventControllerKeyClass

class EventControllerKeyClass private[gnome] (
    raw: Ptr[GtkEventControllerKeyClass]
):

  def getUnsafeRawPointer(): Ptr[GtkEventControllerKeyClass] = this.raw
end EventControllerKeyClass

object EventControllerKeyClass:
  def fromRaw(ptr: Ptr[GtkEventControllerKeyClass]): EventControllerKeyClass =
    new EventControllerKeyClass(ptr)
end EventControllerKeyClass
