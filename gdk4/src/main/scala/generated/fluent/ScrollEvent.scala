package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Event, ScrollDirection, ScrollUnit}
import sn.gnome.gdk4.internal.GdkScrollEvent
import sn.gnome.glib.internal.{gboolean, gint}

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to a scrolling motion.
  */
class ScrollEvent(raw: Ptr[GdkScrollEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the scroll deltas of a scroll event.
    *
    * The deltas will be zero unless the scroll direction is %GDK_SCROLL_SMOOTH.
    *
    * For the representation unit of these deltas, see
    * [method@Gdk.ScrollEvent.get_unit].
    */
  @annotation.compileTimeOnly(
    "Method get_deltas contains an OUT parameter, which is not supported yet"
  )
  def getDeltas__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the direction of a scroll event.
    */
  def getDirection(): ScrollDirection /* None */ = ScrollDirection.fromRaw(
    gdk_scroll_event_get_direction(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the scroll delta unit of a scroll event.
    *
    * The unit will always be %GDK_SCROLL_UNIT_WHEEL if the scroll direction is
    * not %GDK_SCROLL_SMOOTH.
    */
  def getUnit(): ScrollUnit /* None */ = ScrollUnit.fromRaw(
    gdk_scroll_event_get_unit(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check whether a scroll event is a stop scroll event.
    *
    * Scroll sequences with smooth scroll information may provide a stop scroll
    * event once the interaction with the device finishes, e.g. by lifting a
    * finger. This stop scroll event is the signal that a widget may trigger
    * kinetic scrolling based on the current velocity.
    *
    * Stop scroll events always have a delta of 0/0.
    */
  def isStop(): Boolean /* None */ =
    gdk_scroll_event_is_stop(this.raw.asInstanceOf[Ptr[GdkEvent]]).value.!=(0)

end ScrollEvent
