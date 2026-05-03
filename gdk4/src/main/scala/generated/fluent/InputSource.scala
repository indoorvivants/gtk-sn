package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkInputSource

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration describing the type of an input device in general terms.
  */
enum InputSource(val raw: GdkInputSource):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the device is a mouse. (This will be reported for the core pointer, even
    * if it is something else, such as a trackball.)
    */
  case MOUSE extends InputSource(GdkInputSource.GDK_SOURCE_MOUSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the device is a stylus of a graphics tablet or similar device.
    */
  case PEN extends InputSource(GdkInputSource.GDK_SOURCE_PEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the device is a keyboard.
    */
  case KEYBOARD extends InputSource(GdkInputSource.GDK_SOURCE_KEYBOARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the device is a direct-input touch device, such as a touchscreen or tablet
    */
  case TOUCHSCREEN extends InputSource(GdkInputSource.GDK_SOURCE_TOUCHSCREEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the device is an indirect touch device, such as a touchpad
    */
  case TOUCHPAD extends InputSource(GdkInputSource.GDK_SOURCE_TOUCHPAD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the device is a trackpoint
    */
  case TRACKPOINT extends InputSource(GdkInputSource.GDK_SOURCE_TRACKPOINT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the device is a "pad", a collection of buttons, rings and strips found in
    * drawing tablets
    */
  case TABLET_PAD extends InputSource(GdkInputSource.GDK_SOURCE_TABLET_PAD)
end InputSource

object InputSource:
  def fromRaw(raw: GdkInputSource): InputSource =
    raw match
      case GdkInputSource.GDK_SOURCE_MOUSE       => InputSource.MOUSE
      case GdkInputSource.GDK_SOURCE_PEN         => InputSource.PEN
      case GdkInputSource.GDK_SOURCE_KEYBOARD    => InputSource.KEYBOARD
      case GdkInputSource.GDK_SOURCE_TOUCHSCREEN => InputSource.TOUCHSCREEN
      case GdkInputSource.GDK_SOURCE_TOUCHPAD    => InputSource.TOUCHPAD
      case GdkInputSource.GDK_SOURCE_TRACKPOINT  => InputSource.TRACKPOINT
      case GdkInputSource.GDK_SOURCE_TABLET_PAD  => InputSource.TABLET_PAD
  end fromRaw
end InputSource
