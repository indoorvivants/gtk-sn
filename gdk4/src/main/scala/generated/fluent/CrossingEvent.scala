package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.CrossingMode
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.fluent.NotifyType
import sn.gnome.gdk4.internal.GdkCrossingEvent
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event caused by a pointing device moving between surfaces.
  */
class CrossingEvent(raw: Ptr[GdkCrossingEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the notify detail from a crossing event.
    */
  def getDetail(): NotifyType /* None */ = NotifyType.fromRaw(
    gdk_crossing_event_get_detail(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the @event surface is the focus surface.
    */
  def getFocus(): Boolean /* None */ = gdk_crossing_event_get_focus(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the crossing mode from a crossing event.
    */
  def getMode(): CrossingMode /* None */ = CrossingMode.fromRaw(
    gdk_crossing_event_get_mode(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

end CrossingEvent
