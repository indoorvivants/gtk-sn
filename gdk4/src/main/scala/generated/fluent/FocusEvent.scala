package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkFocusEvent
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

/** An event related to a keyboard focus change.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FocusEvent private[gnome] (raw: Ptr[GdkFocusEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts whether this event is about focus entering or leaving the
    * surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIn(): Boolean /* None */ =
    gdk_focus_event_get_in(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    ).value.!=(0)
  end getIn

end FocusEvent

object FocusEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkFocusEvent])(using Runtime) =
    summon[Runtime].getOrCreate[FocusEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FocusEvent(ptr)
    )

end FocusEvent
