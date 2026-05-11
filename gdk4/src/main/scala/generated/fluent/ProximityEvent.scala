package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkProximityEvent
import sn.gnome.gobject.runtime.*

/** An event related to the proximity of a tool to a device.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProximityEvent private[gnome] (raw: Ptr[GdkProximityEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ProximityEvent

object ProximityEvent:
  def applyUnsafe(ptr: Ptr[GdkProximityEvent])(using Runtime) =
    summon[Runtime].getOrCreate[ProximityEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ProximityEvent(ptr)
    )

end ProximityEvent
