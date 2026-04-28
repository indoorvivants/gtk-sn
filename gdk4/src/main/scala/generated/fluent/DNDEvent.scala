package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Drop
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkDNDEvent

class DNDEvent(raw: Ptr[GdkDNDEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDrop(): Drop = new Drop(
    gdk_dnd_event_get_drop(this.raw.asInstanceOf).asInstanceOf
  )

end DNDEvent
