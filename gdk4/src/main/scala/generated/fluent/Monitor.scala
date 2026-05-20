package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Display, SubpixelLayout}
import sn.gnome.gdk4.internal.GdkMonitor
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** `GdkMonitor` objects represent the individual outputs that are associated
  * with a `GdkDisplay`.
  *
  * `GdkDisplay` keeps a `GListModel` to enumerate and monitor monitors with
  * [method@Gdk.Display.get_monitors]. You can use
  * [method@Gdk.Display.get_monitor_at_surface] to find a particular monitor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Monitor private[gnome] (raw: Ptr[GdkMonitor])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the name of the monitor's connector, if available.
    *
    * These are strings such as "eDP-1", or "HDMI-2". They depend on software
    * and hardware configuration, and should not be relied on as stable
    * identifiers of a specific monitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnector(): scala.Predef.String /* None */ =
    fromCString(
      gdk_monitor_get_connector(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
      ).asInstanceOf
    )
  end getConnector

  /** Gets a string describing the monitor, if available.
    *
    * This can be used to identify a monitor in the UI.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription(): scala.Predef.String /* None */ =
    fromCString(
      gdk_monitor_get_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
      ).asInstanceOf
    )
  end getDescription

  /** Gets the display that this monitor belongs to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gdk_monitor_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the size and position of the monitor within the display
    * coordinate space.
    *
    * The returned geometry is in ”application pixels”, not in ”device pixels”
    * (see [method@Gdk.Monitor.get_scale_factor]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_geometry]: Method get_geometry contains an OUT parameter, which is not supported yet"
  )
  private def getGeometry__ = ???

  /** Gets the height in millimeters of the monitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeightMm(): Int /* None */ =
    gdk_monitor_get_height_mm(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
    )
  end getHeightMm

  /** Gets the name or PNP ID of the monitor's manufacturer.
    *
    * Note that this value might also vary depending on actual display backend.
    *
    * The PNP ID registry is located at
    * [https://uefi.org/pnp_id_list](https://uefi.org/pnp_id_list).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getManufacturer(): scala.Predef.String /* None */ =
    fromCString(
      gdk_monitor_get_manufacturer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
      ).asInstanceOf
    )
  end getManufacturer

  /** Gets the string identifying the monitor model, if available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): scala.Predef.String /* None */ =
    fromCString(
      gdk_monitor_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
      ).asInstanceOf
    )
  end getModel

  /** Gets the refresh rate of the monitor, if available.
    *
    * The value is in milli-Hertz, so a refresh rate of 60Hz is returned as
    * 60000.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRefreshRate(): Int /* None */ =
    gdk_monitor_get_refresh_rate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
    )
  end getRefreshRate

  /** Gets the internal scale factor that maps from monitor coordinates to
    * device pixels.
    *
    * On traditional systems this is 1, but on very high density outputs it can
    * be a higher value (often 2).
    *
    * This can be used if you want to create pixel based data for a particular
    * monitor, but most of the time you’re drawing to a surface where it is
    * better to use [method@Gdk.Surface.get_scale_factor] instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScaleFactor(): Int /* None */ =
    gdk_monitor_get_scale_factor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
    )
  end getScaleFactor

  /** Gets information about the layout of red, green and blue primaries for
    * pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSubpixelLayout(): sn.gnome.gdk4.SubpixelLayout /* None */ =
    sn.gnome.gdk4.SubpixelLayout.fromRaw(
      gdk_monitor_get_subpixel_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
      )
    )
  end getSubpixelLayout

  /** Gets the width in millimeters of the monitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidthMm(): Int /* None */ =
    gdk_monitor_get_width_mm(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
    )
  end getWidthMm

  /** Returns %TRUE if the @monitor object corresponds to a physical monitor.
    *
    * The @monitor becomes invalid when the physical monitor is unplugged or
    * removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isValid(): Boolean /* None */ =
    gdk_monitor_is_valid(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkMonitor]]
    ).value.!=(0)
  end isValid

  /** Emitted when the output represented by @monitor gets disconnected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onInvalidate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkMonitor],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"invalidate"
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
  end onInvalidate
end Monitor

object Monitor:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkMonitor])(using Runtime) = summon[Runtime]
    .getOrCreate[Monitor](ptr.asInstanceOf[Ptr[Byte]], p => new Monitor(ptr))

end Monitor
