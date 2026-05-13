package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkPadEvent
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*

/** An event related to a pad-based device.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PadEvent private[gnome] (raw: Ptr[GdkPadEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts the information from a pad strip or ring event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_axis_value]: Method get_axis_value contains an OUT parameter, which is not supported yet"
  )
  private def getAxisValue__ = ???

  /** Extracts information about the pressed button from a pad event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getButton(): UInt /* None */ =
    gdk_pad_event_get_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    ).value
  end getButton

  /** Extracts group and mode information from a pad event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_group_mode]: Method get_group_mode contains an OUT parameter, which is not supported yet"
  )
  private def getGroupMode__ = ???

end PadEvent

object PadEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkPadEvent])(using Runtime) = summon[Runtime]
    .getOrCreate[PadEvent](ptr.asInstanceOf[Ptr[Byte]], p => new PadEvent(ptr))

end PadEvent
