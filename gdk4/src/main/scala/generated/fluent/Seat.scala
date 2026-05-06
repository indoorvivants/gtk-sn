package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Device, DeviceTool, Display, SeatCapabilities}
import sn.gnome.gdk4.internal.{GdkDevice, GdkDeviceTool, GdkSeat}
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*

/** The `GdkSeat` object represents a collection of input devices that belong to
  * a user.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Seat(raw: Ptr[GdkSeat]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the capabilities this `GdkSeat` currently has.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCapabilities(): SeatCapabilities /* None */ = SeatCapabilities.fromRaw(
    gdk_seat_get_capabilities(this.raw.asInstanceOf[Ptr[GdkSeat]])
  )

  /** Returns the devices that match the given capabilities.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_devices/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Device))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getDevices__ = ???

  /** Returns the `GdkDisplay` this seat belongs to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_seat_get_display(this.raw.asInstanceOf[Ptr[GdkSeat]]).asInstanceOf
  )

  /** Returns the device that routes keyboard events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeyboard(): Device /* None */ = new Device(
    gdk_seat_get_keyboard(this.raw.asInstanceOf[Ptr[GdkSeat]]).asInstanceOf
  )

  /** Returns the device that routes pointer events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPointer(): Device /* None */ = new Device(
    gdk_seat_get_pointer(this.raw.asInstanceOf[Ptr[GdkSeat]]).asInstanceOf
  )

  /** Returns all `GdkDeviceTools` that are known to the application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tools/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DeviceTool))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getTools__ = ???

  /** Emitted when a new input device is related to this seat.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDeviceAdded(handler: ((device: Device)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (device: Device), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkSeat],
          device: Ptr[GdkDevice] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (device = sr.runtime.get[Device](device.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"device-added"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDeviceAdded

  /** Emitted when an input device is removed (e.g. unplugged).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDeviceRemoved(handler: ((device: Device)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (device: Device), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkSeat],
          device: Ptr[GdkDevice] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (device = sr.runtime.get[Device](device.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"device-removed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDeviceRemoved

  /** Emitted whenever a new tool is made known to the seat.
    *
    * The tool may later be assigned to a device (i.e. on proximity with a
    * tablet). The device will emit the [signal@Gdk.Device::tool-changed] signal
    * accordingly.
    *
    * A same tool may be used by several devices.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToolAdded(handler: ((tool: DeviceTool)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (tool: DeviceTool), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkSeat],
          tool: Ptr[GdkDeviceTool] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (tool = sr.runtime.get[DeviceTool](tool.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"tool-added"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onToolAdded

  /** Emitted whenever a tool is no longer known to this @seat.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToolRemoved(handler: ((tool: DeviceTool)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (tool: DeviceTool), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkSeat],
          tool: Ptr[GdkDeviceTool] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (tool = sr.runtime.get[DeviceTool](tool.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"tool-removed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onToolRemoved
end Seat
