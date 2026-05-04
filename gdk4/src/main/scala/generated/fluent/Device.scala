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
import sn.gnome.gdk4.internal.GdkDevice
import sn.gnome.glib.internal.{gboolean, gint, guint, guint32}
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Direction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GdkDevice` object represents an input device, such as a keyboard, a
  * mouse, or a touchpad.
  *
  * See the [class@Gdk.Seat] documentation for more information about the
  * various kinds of devices, and their relationships.
  */
class Device(raw: Ptr[GdkDevice]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the Caps Lock modifier of the keyboard is locked.
    *
    * This is only relevant for keyboard devices.
    */
  def getCapsLockState(): Boolean /* None */ = gdk_device_get_caps_lock_state(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current tool for @device.
    */
  def getDeviceTool(): DeviceTool /* None */ = new DeviceTool(
    gdk_device_get_device_tool(
      this.raw.asInstanceOf[Ptr[GdkDevice]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the direction of effective layout of the keyboard.
    *
    * This is only relevant for keyboard devices.
    *
    * The direction of a layout is the direction of the majority of its symbols.
    * See [func@Pango.unichar_direction].
    */
  def getDirection(): Direction /* None */ = Direction.fromRaw(
    gdk_device_get_direction(this.raw.asInstanceOf[Ptr[GdkDevice]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDisplay` to which @device pertains.
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_device_get_display(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether the pointer follows device motion.
    *
    * This is not meaningful for keyboard devices, which don't have a pointer.
    */
  def getHasCursor(): Boolean /* None */ =
    gdk_device_get_has_cursor(this.raw.asInstanceOf[Ptr[GdkDevice]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current modifier state of the keyboard.
    *
    * This is only relevant for keyboard devices.
    */
  def getModifierState(): ModifierType /* None */ = ModifierType.fromRaw(
    gdk_device_get_modifier_state(this.raw.asInstanceOf[Ptr[GdkDevice]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The name of the device, suitable for showing in a user interface.
    */
  def getName()(using Zone): String /* None */ = fromCString(
    gdk_device_get_name(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the Num Lock modifier of the keyboard is locked.
    *
    * This is only relevant for keyboard devices.
    */
  def getNumLockState(): Boolean /* None */ = gdk_device_get_num_lock_state(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of touch points associated to @device.
    */
  def getNumTouches(): UInt /* None */ = gdk_device_get_num_touches(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the product ID of this device.
    *
    * This ID is retrieved from the device, and does not change. See
    * [method@Gdk.Device.get_vendor_id] for more information.
    */
  def getProductId()(using Zone): String /* None */ = fromCString(
    gdk_device_get_product_id(
      this.raw.asInstanceOf[Ptr[GdkDevice]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
    *
    * This is only relevant for keyboard devices.
    */
  def getScrollLockState(): Boolean /* None */ =
    gdk_device_get_scroll_lock_state(
      this.raw.asInstanceOf[Ptr[GdkDevice]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkSeat` the device belongs to.
    */
  def getSeat(): Seat /* None */ = new Seat(
    gdk_device_get_seat(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the type of the device.
    */
  def getSource(): InputSource /* None */ = InputSource.fromRaw(
    gdk_device_get_source(this.raw.asInstanceOf[Ptr[GdkDevice]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the surface underneath @device, returning the location of the
    * device in @win_x and @win_y.
    *
    * Returns %NULL if the surface tree under @device is not known to GDK (for
    * example, belongs to another application).
    */
  @annotation.compileTimeOnly(
    "Method get_surface_at_position contains an OUT parameter, which is not supported yet"
  )
  def getSurfaceAtPosition__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the timestamp of the last activity for this device.
    *
    * In practice, this means the timestamp of the last event that was received
    * from the OS for this device. (GTK may occasionally produce events for a
    * device that are not received from the OS, and will not update the
    * timestamp).
    */
  def getTimestamp(): UInt /* None */ = gdk_device_get_timestamp(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the vendor ID of this device.
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
    */
  def getVendorId()(using Zone): String /* None */ = fromCString(
    gdk_device_get_vendor_id(this.raw.asInstanceOf[Ptr[GdkDevice]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines if layouts for both right-to-left and left-to-right languages
    * are in use on the keyboard.
    *
    * This is only relevant for keyboard devices.
    */
  def hasBidiLayouts(): Boolean /* None */ = gdk_device_has_bidi_layouts(
    this.raw.asInstanceOf[Ptr[GdkDevice]]
  ).value.!=(0)

end Device
