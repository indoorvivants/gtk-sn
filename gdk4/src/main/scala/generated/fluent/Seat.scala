package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.internal.GdkSeat
import sn.gnome.gdk4.internal.GdkSeatCapabilities
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GdkSeat` object represents a collection of input devices that belong to
  * a user.
  */
class Seat(raw: Ptr[GdkSeat]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the capabilities this `GdkSeat` currently has.
    */
  def getCapabilities(): GdkSeatCapabilities /* None */ =
    gdk_seat_get_capabilities(this.raw.asInstanceOf[Ptr[GdkSeat]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the devices that match the given capabilities.
    */
  def getDevices(
      capabilities: GdkSeatCapabilities /* Some(GdkSeatCapabilities) */
  ): Ptr[GList] /* None */ =
    gdk_seat_get_devices(this.raw.asInstanceOf[Ptr[GdkSeat]], capabilities)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDisplay` this seat belongs to.
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_seat_get_display(this.raw.asInstanceOf[Ptr[GdkSeat]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the device that routes keyboard events.
    */
  def getKeyboard(): Device /* None */ = new Device(
    gdk_seat_get_keyboard(this.raw.asInstanceOf[Ptr[GdkSeat]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the device that routes pointer events.
    */
  def getPointer(): Device /* None */ = new Device(
    gdk_seat_get_pointer(this.raw.asInstanceOf[Ptr[GdkSeat]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns all `GdkDeviceTools` that are known to the application.
    */
  def getTools(): Ptr[GList] /* None */ = gdk_seat_get_tools(
    this.raw.asInstanceOf[Ptr[GdkSeat]]
  )

end Seat
