package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkTouchEvent
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to a touch-based device.
  */
class TouchEvent(raw: Ptr[GdkTouchEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts whether a touch event is emulating a pointer event.
    */
  def getEmulatingPointer(): Boolean /* None */ =
    gdk_touch_event_get_emulating_pointer(this.raw.asInstanceOf).value.!=(0)

end TouchEvent
