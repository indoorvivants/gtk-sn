package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Drop, Event}
import sn.gnome.gdk4.internal.GdkDNDEvent
import sn.gnome.gobject.runtime.*

/** An event related to drag and drop operations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DNDEvent private[gnome] (raw: Ptr[GdkDNDEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the `GdkDrop` object from a DND event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrop()(using Runtime): sn.gnome.gdk4.Drop /* None */ =
    sn.gnome.gdk4.Drop.applyUnsafe(
      gdk_dnd_event_get_drop(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
      ).asInstanceOf
    )
  end getDrop

end DNDEvent

object DNDEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkDNDEvent])(using Runtime) = summon[Runtime]
    .getOrCreate[DNDEvent](ptr.asInstanceOf[Ptr[Byte]], p => new DNDEvent(ptr))

end DNDEvent
