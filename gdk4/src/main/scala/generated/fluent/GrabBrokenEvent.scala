package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkGrabBrokenEvent
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to a broken windowing system grab.
  */
class GrabBrokenEvent(raw: Ptr[GdkGrabBrokenEvent])
    extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the grab surface from a grab broken event.
    */
  def getGrabSurface(): Surface = new Surface(
    gdk_grab_broken_event_get_grab_surface(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the grab broken event is for an implicit grab.
    */
  def getImplicit(): Boolean =
    gdk_grab_broken_event_get_implicit(this.raw.asInstanceOf).value.!=(0)

end GrabBrokenEvent
