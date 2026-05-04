package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{CrossingMode, Event, NotifyType}
import sn.gnome.gdk4.internal.GdkCrossingEvent
import sn.gnome.glib.internal.{gboolean, gint}

/** An event caused by a pointing device moving between surfaces.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CrossingEvent(raw: Ptr[GdkCrossingEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts the notify detail from a crossing event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDetail(): NotifyType /* None */ = NotifyType.fromRaw(
    gdk_crossing_event_get_detail(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

  /** Checks if the @event surface is the focus surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocus(): Boolean /* None */ = gdk_crossing_event_get_focus(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value.!=(0)

  /** Extracts the crossing mode from a crossing event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMode(): CrossingMode /* None */ = CrossingMode.fromRaw(
    gdk_crossing_event_get_mode(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

end CrossingEvent
