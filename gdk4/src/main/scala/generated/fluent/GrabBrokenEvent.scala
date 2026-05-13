package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Event, Surface}
import sn.gnome.gdk4.internal.GdkGrabBrokenEvent
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

/** An event related to a broken windowing system grab.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GrabBrokenEvent private[gnome] (raw: Ptr[GdkGrabBrokenEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts the grab surface from a grab broken event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGrabSurface()(using Runtime): sn.gnome.gdk4.fluent.Surface /* None */ =
    sn.gnome.gdk4.fluent.Surface.applyUnsafe(
      gdk_grab_broken_event_get_grab_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
      ).asInstanceOf
    )
  end getGrabSurface

  /** Checks whether the grab broken event is for an implicit grab.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getImplicit(): Boolean /* None */ =
    gdk_grab_broken_event_get_implicit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    ).value.!=(0)
  end getImplicit

end GrabBrokenEvent

object GrabBrokenEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkGrabBrokenEvent])(using Runtime) =
    summon[Runtime].getOrCreate[GrabBrokenEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GrabBrokenEvent(ptr)
    )

end GrabBrokenEvent
