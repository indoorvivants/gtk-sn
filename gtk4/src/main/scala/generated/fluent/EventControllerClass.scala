package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEventControllerClass

class EventControllerClass private[gnome] (raw: Ptr[GtkEventControllerClass]):

  def getUnsafeRawPointer(): Ptr[GtkEventControllerClass] = this.raw
end EventControllerClass

object EventControllerClass:
  def fromRaw(ptr: Ptr[GtkEventControllerClass]): EventControllerClass =
    new EventControllerClass(ptr)
end EventControllerClass
