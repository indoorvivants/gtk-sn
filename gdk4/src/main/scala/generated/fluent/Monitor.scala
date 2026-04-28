package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.internal.GdkMonitor
import sn.gnome.gdk4.internal.GdkSubpixelLayout
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class Monitor(raw: Ptr[GdkMonitor]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConnector()(using Zone): String = fromCString(
    gdk_monitor_get_connector(this.raw.asInstanceOf).asInstanceOf
  )

  def getDescription()(using Zone): String = fromCString(
    gdk_monitor_get_description(this.raw.asInstanceOf).asInstanceOf
  )

  def getDisplay(): Display = new Display(
    gdk_monitor_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_geometry contains an OUT parameter, which is not supported yet

  def getHeightMm(): Int = gdk_monitor_get_height_mm(this.raw.asInstanceOf)

  def getManufacturer()(using Zone): String = fromCString(
    gdk_monitor_get_manufacturer(this.raw.asInstanceOf).asInstanceOf
  )

  def getModel()(using Zone): String = fromCString(
    gdk_monitor_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getRefreshRate(): Int = gdk_monitor_get_refresh_rate(
    this.raw.asInstanceOf
  )

  def getScaleFactor(): Int = gdk_monitor_get_scale_factor(
    this.raw.asInstanceOf
  )

  def getSubpixelLayout(): GdkSubpixelLayout = gdk_monitor_get_subpixel_layout(
    this.raw.asInstanceOf
  )

  def getWidthMm(): Int = gdk_monitor_get_width_mm(this.raw.asInstanceOf)

  def isValid(): Boolean =
    gdk_monitor_is_valid(this.raw.asInstanceOf).value.!=(0)

end Monitor
