package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkDeleteEvent

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to closing a top-level surface.
  */
class DeleteEvent(raw: Ptr[GdkDeleteEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DeleteEvent
