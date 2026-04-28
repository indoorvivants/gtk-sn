package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.internal.GdkAxisFlags
import sn.gnome.gdk4.internal.GdkDeviceTool
import sn.gnome.gdk4.internal.GdkDeviceToolType
import sn.gnome.glib.internal.guint64
import sn.gnome.gobject.fluent.Object

class DeviceTool(raw: Ptr[GdkDeviceTool]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAxes(): GdkAxisFlags = gdk_device_tool_get_axes(this.raw.asInstanceOf)

  def getHardwareId(): CUnsignedLongInt = gdk_device_tool_get_hardware_id(
    this.raw.asInstanceOf
  ).value

  def getSerial(): CUnsignedLongInt = gdk_device_tool_get_serial(
    this.raw.asInstanceOf
  ).value

  def getToolType(): GdkDeviceToolType = gdk_device_tool_get_tool_type(
    this.raw.asInstanceOf
  )

end DeviceTool
