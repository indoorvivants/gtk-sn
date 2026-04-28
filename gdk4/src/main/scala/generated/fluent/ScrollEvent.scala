package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkScrollDirection
import sn.gnome.gdk4.internal.GdkScrollEvent
import sn.gnome.gdk4.internal.GdkScrollUnit
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class ScrollEvent(raw: Ptr[GdkScrollEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_deltas contains an OUT parameter, which is not supported yet

  def getDirection(): GdkScrollDirection = gdk_scroll_event_get_direction(
    this.raw.asInstanceOf
  )

  def getUnit(): GdkScrollUnit = gdk_scroll_event_get_unit(
    this.raw.asInstanceOf
  )

  def isStop(): Boolean =
    gdk_scroll_event_is_stop(this.raw.asInstanceOf).value.!=(0)

end ScrollEvent
