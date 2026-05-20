package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEventControllerLegacyClass

class EventControllerLegacyClass private[gnome] (
    raw: Ptr[GtkEventControllerLegacyClass]
):

  def getUnsafeRawPointer(): Ptr[GtkEventControllerLegacyClass] = this.raw
end EventControllerLegacyClass

object EventControllerLegacyClass:
  def fromRaw(
      ptr: Ptr[GtkEventControllerLegacyClass]
  ): EventControllerLegacyClass = new EventControllerLegacyClass(ptr)
end EventControllerLegacyClass
