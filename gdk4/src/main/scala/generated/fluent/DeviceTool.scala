package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.DeviceToolType
import sn.gnome.gdk4.internal.GdkAxisFlags
import sn.gnome.gdk4.internal.GdkDeviceTool
import sn.gnome.glib.internal.guint64
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A physical tool associated to a `GdkDevice`.
  */
class DeviceTool(raw: Ptr[GdkDeviceTool]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the axes of the tool.
    */
  def getAxes(): GdkAxisFlags /* None */ = gdk_device_tool_get_axes(
    this.raw.asInstanceOf[Ptr[GdkDeviceTool]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the hardware ID of this tool, or 0 if it's not known.
    *
    * When non-zero, the identifier is unique for the given tool model, meaning
    * that two identical tools will share the same @hardware_id, but will have
    * different serial numbers (see [method@Gdk.DeviceTool.get_serial]).
    *
    * This is a more concrete (and device specific) method to identify a
    * `GdkDeviceTool` than [method@Gdk.DeviceTool.get_tool_type], as a tablet
    * may support multiple devices with the same `GdkDeviceToolType`, but
    * different hardware identifiers.
    */
  def getHardwareId(): CUnsignedLongInt /* None */ =
    gdk_device_tool_get_hardware_id(
      this.raw.asInstanceOf[Ptr[GdkDeviceTool]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the serial number of this tool.
    *
    * This value can be used to identify a physical tool (eg. a tablet pen)
    * across program executions.
    */
  def getSerial(): CUnsignedLongInt /* None */ = gdk_device_tool_get_serial(
    this.raw.asInstanceOf[Ptr[GdkDeviceTool]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GdkDeviceToolType` of the tool.
    */
  def getToolType(): DeviceToolType /* None */ = DeviceToolType.fromRaw(
    gdk_device_tool_get_tool_type(this.raw.asInstanceOf[Ptr[GdkDeviceTool]])
  )

end DeviceTool
