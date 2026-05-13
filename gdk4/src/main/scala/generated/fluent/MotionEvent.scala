package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkMotionEvent
import sn.gnome.gobject.runtime.*

/** An event related to a pointer or touch device motion.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MotionEvent private[gnome] (raw: Ptr[GdkMotionEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MotionEvent

object MotionEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkMotionEvent])(using Runtime) =
    summon[Runtime].getOrCreate[MotionEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MotionEvent(ptr)
    )

end MotionEvent
