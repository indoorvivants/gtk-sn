package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{
  DeviceTool,
  Display,
  InputSource,
  ModifierType,
  Seat
}
import sn.gnome.gdk4.internal.{GdkDevice, GdkDeviceTool}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint, guint32}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.fluent.Direction

/** The `GdkDevice` object represents an input device, such as a keyboard, a
  * mouse, or a touchpad.
  *
  * See the [class@Gdk.Seat] documentation for more information about the
  * various kinds of devices, and their relationships.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Device(raw: Ptr[GdkDevice]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves whether the Caps Lock modifier of the keyboard is locked.
    *
    * This is only relevant for keyboard devices.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCapsLockState(): Boolean /* None */ = gdk_device_get_caps_lock_state(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value.!=(0)

  /** Retrieves the current tool for @device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDeviceTool(): DeviceTool /* None */ = new DeviceTool(
    gdk_device_get_device_tool(
      this.raw.asInstanceOf[Ptr[GdkDevice]]
    ).asInstanceOf
  )

  /** Returns the direction of effective layout of the keyboard.
    *
    * This is only relevant for keyboard devices.
    *
    * The direction of a layout is the direction of the majority of its symbols.
    * See [func@Pango.unichar_direction].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDirection(): Direction /* None */ = Direction.fromRaw(
    gdk_device_get_direction(this.raw.asInstanceOf[Ptr[GdkDevice]])
  )

  /** Returns the `GdkDisplay` to which @device pertains.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_device_get_display(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** Determines whether the pointer follows device motion.
    *
    * This is not meaningful for keyboard devices, which don't have a pointer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasCursor(): Boolean /* None */ =
    gdk_device_get_has_cursor(this.raw.asInstanceOf[Ptr[GdkDevice]]).value.!=(0)

  /** Retrieves the current modifier state of the keyboard.
    *
    * This is only relevant for keyboard devices.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModifierState(): ModifierType /* None */ = ModifierType.fromRaw(
    gdk_device_get_modifier_state(this.raw.asInstanceOf[Ptr[GdkDevice]])
  )

  /** The name of the device, suitable for showing in a user interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ = fromCString(
    gdk_device_get_name(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** Retrieves whether the Num Lock modifier of the keyboard is locked.
    *
    * This is only relevant for keyboard devices.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumLockState(): Boolean /* None */ = gdk_device_get_num_lock_state(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value.!=(0)

  /** Retrieves the number of touch points associated to @device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumTouches(): UInt /* None */ = gdk_device_get_num_touches(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value

  /** Returns the product ID of this device.
    *
    * This ID is retrieved from the device, and does not change. See
    * [method@Gdk.Device.get_vendor_id] for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProductId()(using Zone): String /* None */ = fromCString(
    gdk_device_get_product_id(
      this.raw.asInstanceOf[Ptr[GdkDevice]]
    ).asInstanceOf
  )

  /** Retrieves whether the Scroll Lock modifier of the keyboard is locked.
    *
    * This is only relevant for keyboard devices.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScrollLockState(): Boolean /* None */ =
    gdk_device_get_scroll_lock_state(
      this.raw.asInstanceOf[Ptr[GdkDevice]]
    ).value.!=(0)

  /** Returns the `GdkSeat` the device belongs to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSeat(): Seat /* None */ = new Seat(
    gdk_device_get_seat(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** Determines the type of the device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSource(): InputSource /* None */ = InputSource.fromRaw(
    gdk_device_get_source(this.raw.asInstanceOf[Ptr[GdkDevice]])
  )

  /** Obtains the surface underneath @device, returning the location of the
    * device in @win_x and @win_y.
    *
    * Returns %NULL if the surface tree under @device is not known to GDK (for
    * example, belongs to another application).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_surface_at_position]: Method get_surface_at_position contains an OUT parameter, which is not supported yet"
  )
  private def getSurfaceAtPosition__ = ???

  /** Returns the timestamp of the last activity for this device.
    *
    * In practice, this means the timestamp of the last event that was received
    * from the OS for this device. (GTK may occasionally produce events for a
    * device that are not received from the OS, and will not update the
    * timestamp).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTimestamp(): UInt /* None */ = gdk_device_get_timestamp(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value

  /** Returns the vendor ID of this device.
    *
    * This ID is retrieved from the device, and does not change.
    *
    * This function, together with [method@Gdk.Device.get_product_id], can be
    * used to eg. compose `GSettings` paths to store settings for this device.
    *
    * ```c
    *  static GSettings *
    *  get_device_settings (GdkDevice *device)
    *  {
    *    const char *vendor, *product;
    *    GSettings *settings;
    *    GdkDevice *device;
    *    char *path;
    *
    *    vendor = gdk_device_get_vendor_id (device);
    *    product = gdk_device_get_product_id (device);
    *
    *    path = g_strdup_printf ("/org/example/app/devices/%s:%s/", vendor, product);
    *    settings = g_settings_new_with_path (DEVICE_SCHEMA, path);
    *    g_free (path);
    *
    *    return settings;
    *  }
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVendorId()(using Zone): String /* None */ = fromCString(
    gdk_device_get_vendor_id(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** Determines if layouts for both right-to-left and left-to-right languages
    * are in use on the keyboard.
    *
    * This is only relevant for keyboard devices.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasBidiLayouts(): Boolean /* None */ = gdk_device_has_bidi_layouts(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value.!=(0)

  /** Emitted either when the number of either axes or keys changes.
    *
    * On X11 this will normally happen when the physical device routing events
    * through the logical device changes (for example, user switches from the
    * USB mouse to a tablet); in that case the logical device will change to
    * reflect the axes and keys on the new physical device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkDevice],
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
    val signal = c"changed"
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
  end onChanged

  /** Emitted on pen/eraser devices whenever tools enter or leave proximity.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToolChanged(handler: ((tool: DeviceTool)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (tool: DeviceTool), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkDevice],
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
    val signal = c"tool-changed"
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
  end onToolChanged
end Device
