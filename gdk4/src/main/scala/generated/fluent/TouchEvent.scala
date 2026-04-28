package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkTouchEvent
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class TouchEvent(raw: Ptr[GdkTouchEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEmulatingPointer(): Boolean =
    gdk_touch_event_get_emulating_pointer(this.raw.asInstanceOf).value.!=(0)

end TouchEvent
