package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkFocusEvent
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class FocusEvent(raw: Ptr[GdkFocusEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getIn(): Boolean =
    gdk_focus_event_get_in(this.raw.asInstanceOf).value.!=(0)

end FocusEvent
