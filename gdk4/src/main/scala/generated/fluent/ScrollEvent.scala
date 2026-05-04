package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Event, ScrollDirection, ScrollUnit}
import sn.gnome.gdk4.internal.GdkScrollEvent
import sn.gnome.glib.internal.{gboolean, gint}

/** An event related to a scrolling motion.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ScrollEvent(raw: Ptr[GdkScrollEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts the scroll deltas of a scroll event.
    *
    * The deltas will be zero unless the scroll direction is %GDK_SCROLL_SMOOTH.
    *
    * For the representation unit of these deltas, see
    * [method@Gdk.ScrollEvent.get_unit].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_deltas]: Method get_deltas contains an OUT parameter, which is not supported yet"
  )
  private def getDeltas__ = ???

  /** Extracts the direction of a scroll event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDirection(): ScrollDirection /* None */ = ScrollDirection.fromRaw(
    gdk_scroll_event_get_direction(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

  /** Extracts the scroll delta unit of a scroll event.
    *
    * The unit will always be %GDK_SCROLL_UNIT_WHEEL if the scroll direction is
    * not %GDK_SCROLL_SMOOTH.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnit(): ScrollUnit /* None */ = ScrollUnit.fromRaw(
    gdk_scroll_event_get_unit(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

  /** Check whether a scroll event is a stop scroll event.
    *
    * Scroll sequences with smooth scroll information may provide a stop scroll
    * event once the interaction with the device finishes, e.g. by lifting a
    * finger. This stop scroll event is the signal that a widget may trigger
    * kinetic scrolling based on the current velocity.
    *
    * Stop scroll events always have a delta of 0/0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isStop(): Boolean /* None */ =
    gdk_scroll_event_is_stop(this.raw.asInstanceOf[Ptr[GdkEvent]]).value.!=(0)

end ScrollEvent
