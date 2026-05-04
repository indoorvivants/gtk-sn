package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkFocusEvent
import sn.gnome.glib.internal.{gboolean, gint}

/** An event related to a keyboard focus change.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FocusEvent(raw: Ptr[GdkFocusEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts whether this event is about focus entering or leaving the
    * surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIn(): Boolean /* None */ =
    gdk_focus_event_get_in(this.raw.asInstanceOf[Ptr[GdkEvent]]).value.!=(0)

end FocusEvent
