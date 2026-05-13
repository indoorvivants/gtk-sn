package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{AxisFlags, DeviceToolType}
import sn.gnome.gdk4.internal.GdkDeviceTool
import sn.gnome.glib.internal.guint64
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** A physical tool associated to a `GdkDevice`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DeviceTool private[gnome] (raw: Ptr[GdkDeviceTool])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the axes of the tool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAxes(): AxisFlags /* None */ =
    AxisFlags.fromRaw(
      gdk_device_tool_get_axes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDeviceTool]]
      )
    )
  end getAxes

  /** Gets the hardware ID of this tool, or 0 if it's not known.
    *
    * When non-zero, the identifier is unique for the given tool model, meaning
    * that two identical tools will share the same @hardware_id, but will have
    * different serial numbers (see [method@Gdk.DeviceTool.get_serial]).
    *
    * This is a more concrete (and device specific) method to identify a
    * `GdkDeviceTool` than [method@Gdk.DeviceTool.get_tool_type], as a tablet
    * may support multiple devices with the same `GdkDeviceToolType`, but
    * different hardware identifiers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHardwareId(): CUnsignedLongInt /* None */ =
    gdk_device_tool_get_hardware_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDeviceTool]]
    ).value
  end getHardwareId

  /** Gets the serial number of this tool.
    *
    * This value can be used to identify a physical tool (eg. a tablet pen)
    * across program executions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSerial(): CUnsignedLongInt /* None */ =
    gdk_device_tool_get_serial(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDeviceTool]]
    ).value
  end getSerial

  /** Gets the `GdkDeviceToolType` of the tool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getToolType(): DeviceToolType /* None */ =
    DeviceToolType.fromRaw(
      gdk_device_tool_get_tool_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDeviceTool]]
      )
    )
  end getToolType

end DeviceTool

object DeviceTool:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkDeviceTool])(using Runtime) =
    summon[Runtime].getOrCreate[DeviceTool](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DeviceTool(ptr)
    )

end DeviceTool
