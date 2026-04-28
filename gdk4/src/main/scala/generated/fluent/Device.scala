package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.DeviceTool
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Seat
import sn.gnome.gdk4.internal.GdkDevice
import sn.gnome.gdk4.internal.GdkInputSource
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.internal.PangoDirection

class Device(raw: Ptr[GdkDevice]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCapsLockState(): Boolean =
    gdk_device_get_caps_lock_state(this.raw.asInstanceOf).value.!=(0)

  def getDeviceTool(): DeviceTool = new DeviceTool(
    gdk_device_get_device_tool(this.raw.asInstanceOf).asInstanceOf
  )

  def getDirection(): PangoDirection = gdk_device_get_direction(
    this.raw.asInstanceOf
  )

  def getDisplay(): Display = new Display(
    gdk_device_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getHasCursor(): Boolean =
    gdk_device_get_has_cursor(this.raw.asInstanceOf).value.!=(0)

  def getModifierState(): GdkModifierType = gdk_device_get_modifier_state(
    this.raw.asInstanceOf
  )

  def getName()(using Zone): String = fromCString(
    gdk_device_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getNumLockState(): Boolean =
    gdk_device_get_num_lock_state(this.raw.asInstanceOf).value.!=(0)

  def getNumTouches(): UInt = gdk_device_get_num_touches(
    this.raw.asInstanceOf
  ).value

  def getProductId()(using Zone): String = fromCString(
    gdk_device_get_product_id(this.raw.asInstanceOf).asInstanceOf
  )

  def getScrollLockState(): Boolean =
    gdk_device_get_scroll_lock_state(this.raw.asInstanceOf).value.!=(0)

  def getSeat(): Seat = new Seat(
    gdk_device_get_seat(this.raw.asInstanceOf).asInstanceOf
  )

  def getSource(): GdkInputSource = gdk_device_get_source(this.raw.asInstanceOf)

  // Method get_surface_at_position contains an OUT parameter, which is not supported yet

  def getTimestamp(): UInt = gdk_device_get_timestamp(
    this.raw.asInstanceOf
  ).value

  def getVendorId()(using Zone): String = fromCString(
    gdk_device_get_vendor_id(this.raw.asInstanceOf).asInstanceOf
  )

  def hasBidiLayouts(): Boolean =
    gdk_device_has_bidi_layouts(this.raw.asInstanceOf).value.!=(0)

end Device
