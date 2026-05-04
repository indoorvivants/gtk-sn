package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Display, SubpixelLayout}
import sn.gnome.gdk4.internal.GdkMonitor
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkMonitor` objects represent the individual outputs that are associated
  * with a `GdkDisplay`.
  *
  * `GdkDisplay` keeps a `GListModel` to enumerate and monitor monitors with
  * [method@Gdk.Display.get_monitors]. You can use
  * [method@Gdk.Display.get_monitor_at_surface] to find a particular monitor.
  */
class Monitor(raw: Ptr[GdkMonitor]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the monitor's connector, if available.
    *
    * These are strings such as "eDP-1", or "HDMI-2". They depend on software
    * and hardware configuration, and should not be relied on as stable
    * identifiers of a specific monitor.
    */
  def getConnector()(using Zone): String /* None */ = fromCString(
    gdk_monitor_get_connector(
      this.raw.asInstanceOf[Ptr[GdkMonitor]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a string describing the monitor, if available.
    *
    * This can be used to identify a monitor in the UI.
    */
  def getDescription()(using Zone): String /* None */ = fromCString(
    gdk_monitor_get_description(
      this.raw.asInstanceOf[Ptr[GdkMonitor]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the display that this monitor belongs to.
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_monitor_get_display(this.raw.asInstanceOf[Ptr[GdkMonitor]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the size and position of the monitor within the display
    * coordinate space.
    *
    * The returned geometry is in ”application pixels”, not in ”device pixels”
    * (see [method@Gdk.Monitor.get_scale_factor]).
    */
  @annotation.compileTimeOnly(
    "Method get_geometry contains an OUT parameter, which is not supported yet"
  )
  def getGeometry__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the height in millimeters of the monitor.
    */
  def getHeightMm(): Int /* None */ = gdk_monitor_get_height_mm(
    this.raw.asInstanceOf[Ptr[GdkMonitor]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name or PNP ID of the monitor's manufacturer.
    *
    * Note that this value might also vary depending on actual display backend.
    *
    * The PNP ID registry is located at
    * [https://uefi.org/pnp_id_list](https://uefi.org/pnp_id_list).
    */
  def getManufacturer()(using Zone): String /* None */ = fromCString(
    gdk_monitor_get_manufacturer(
      this.raw.asInstanceOf[Ptr[GdkMonitor]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the string identifying the monitor model, if available.
    */
  def getModel()(using Zone): String /* None */ = fromCString(
    gdk_monitor_get_model(this.raw.asInstanceOf[Ptr[GdkMonitor]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the refresh rate of the monitor, if available.
    *
    * The value is in milli-Hertz, so a refresh rate of 60Hz is returned as
    * 60000.
    */
  def getRefreshRate(): Int /* None */ = gdk_monitor_get_refresh_rate(
    this.raw.asInstanceOf[Ptr[GdkMonitor]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the internal scale factor that maps from monitor coordinates to
    * device pixels.
    *
    * On traditional systems this is 1, but on very high density outputs it can
    * be a higher value (often 2).
    *
    * This can be used if you want to create pixel based data for a particular
    * monitor, but most of the time you’re drawing to a surface where it is
    * better to use [method@Gdk.Surface.get_scale_factor] instead.
    */
  def getScaleFactor(): Int /* None */ = gdk_monitor_get_scale_factor(
    this.raw.asInstanceOf[Ptr[GdkMonitor]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets information about the layout of red, green and blue primaries for
    * pixels.
    */
  def getSubpixelLayout(): SubpixelLayout /* None */ = SubpixelLayout.fromRaw(
    gdk_monitor_get_subpixel_layout(this.raw.asInstanceOf[Ptr[GdkMonitor]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the width in millimeters of the monitor.
    */
  def getWidthMm(): Int /* None */ = gdk_monitor_get_width_mm(
    this.raw.asInstanceOf[Ptr[GdkMonitor]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the @monitor object corresponds to a physical monitor.
    *
    * The @monitor becomes invalid when the physical monitor is unplugged or
    * removed.
    */
  def isValid(): Boolean /* None */ =
    gdk_monitor_is_valid(this.raw.asInstanceOf[Ptr[GdkMonitor]]).value.!=(0)

end Monitor
