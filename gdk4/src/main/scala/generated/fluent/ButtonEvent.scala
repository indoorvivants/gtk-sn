package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.Event
import sn.gnome.gdk4.internal.GdkButtonEvent
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*

/** An event related to a button on a pointer device.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ButtonEvent private[gnome] (raw: Ptr[GdkButtonEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extract the button number from a button event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getButton(): UInt /* None */ =
    gdk_button_event_get_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    ).value
  end getButton

end ButtonEvent

object ButtonEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkButtonEvent])(using Runtime) =
    summon[Runtime].getOrCreate[ButtonEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ButtonEvent(ptr)
    )

end ButtonEvent
