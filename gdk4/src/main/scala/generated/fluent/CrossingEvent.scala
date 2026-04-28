package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkCrossingEvent
import sn.gnome.gdk4.internal.GdkCrossingMode
import sn.gnome.gdk4.internal.GdkNotifyType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class CrossingEvent(raw: Ptr[GdkCrossingEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDetail(): GdkNotifyType = gdk_crossing_event_get_detail(
    this.raw.asInstanceOf
  )

  def getFocus(): Boolean =
    gdk_crossing_event_get_focus(this.raw.asInstanceOf).value.!=(0)

  def getMode(): GdkCrossingMode = gdk_crossing_event_get_mode(
    this.raw.asInstanceOf
  )

end CrossingEvent
