package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Drop, Event}
import sn.gnome.gdk4.internal.GdkDNDEvent

/** An event related to drag and drop operations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DNDEvent(raw: Ptr[GdkDNDEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the `GdkDrop` object from a DND event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrop(): Drop /* None */ = new Drop(
    gdk_dnd_event_get_drop(this.raw.asInstanceOf[Ptr[GdkEvent]]).asInstanceOf
  )

end DNDEvent
