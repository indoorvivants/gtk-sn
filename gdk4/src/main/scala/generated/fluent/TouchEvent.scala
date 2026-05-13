package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkTouchEvent
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

/** An event related to a touch-based device.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TouchEvent private[gnome] (raw: Ptr[GdkTouchEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts whether a touch event is emulating a pointer event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEmulatingPointer(): Boolean /* None */ =
    gdk_touch_event_get_emulating_pointer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    ).value.!=(0)
  end getEmulatingPointer

end TouchEvent

object TouchEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkTouchEvent])(using Runtime) =
    summon[Runtime].getOrCreate[TouchEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TouchEvent(ptr)
    )

end TouchEvent
