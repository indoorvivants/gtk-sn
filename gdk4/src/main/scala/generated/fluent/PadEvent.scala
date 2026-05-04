package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkPadEvent
import sn.gnome.glib.internal.guint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to a pad-based device.
  */
class PadEvent(raw: Ptr[GdkPadEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the information from a pad strip or ring event.
    */
  @annotation.compileTimeOnly(
    "Method get_axis_value contains an OUT parameter, which is not supported yet"
  )
  def getAxisValue__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts information about the pressed button from a pad event.
    */
  def getButton(): UInt /* None */ = gdk_pad_event_get_button(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts group and mode information from a pad event.
    */
  @annotation.compileTimeOnly(
    "Method get_group_mode contains an OUT parameter, which is not supported yet"
  )
  def getGroupMode__ = ???

end PadEvent
