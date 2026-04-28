package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkPadEvent
import sn.gnome.glib.internal.guint

class PadEvent(raw: Ptr[GdkPadEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_axis_value contains an OUT parameter, which is not supported yet

  def getButton(): UInt = gdk_pad_event_get_button(this.raw.asInstanceOf).value

  // Method get_group_mode contains an OUT parameter, which is not supported yet

end PadEvent
