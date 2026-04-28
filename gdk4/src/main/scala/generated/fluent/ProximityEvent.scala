package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkProximityEvent

class ProximityEvent(raw: Ptr[GdkProximityEvent])
    extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ProximityEvent
