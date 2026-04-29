package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkButtonEvent
import sn.gnome.glib.internal.guint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to a button on a pointer device.
  */
class ButtonEvent(raw: Ptr[GdkButtonEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extract the button number from a button event.
    */
  def getButton(): UInt = gdk_button_event_get_button(
    this.raw.asInstanceOf
  ).value

end ButtonEvent
