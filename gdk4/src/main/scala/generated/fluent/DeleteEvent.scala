package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkDeleteEvent
import sn.gnome.gobject.runtime.*

/** An event related to closing a top-level surface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DeleteEvent private[gnome] (raw: Ptr[GdkDeleteEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DeleteEvent

object DeleteEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkDeleteEvent])(using Runtime) =
    summon[Runtime].getOrCreate[DeleteEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DeleteEvent(ptr)
    )

end DeleteEvent
