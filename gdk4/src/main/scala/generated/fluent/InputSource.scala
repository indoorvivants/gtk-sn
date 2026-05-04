package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkInputSource

/** An enumeration describing the type of an input device in general terms.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum InputSource(val raw: GdkInputSource):
  /** the device is a mouse. (This will be reported for the core pointer, even
    * if it is something else, such as a trackball.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MOUSE extends InputSource(GdkInputSource.GDK_SOURCE_MOUSE)

  /** the device is a stylus of a graphics tablet or similar device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PEN extends InputSource(GdkInputSource.GDK_SOURCE_PEN)

  /** the device is a keyboard.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KEYBOARD extends InputSource(GdkInputSource.GDK_SOURCE_KEYBOARD)

  /** the device is a direct-input touch device, such as a touchscreen or tablet
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCHSCREEN extends InputSource(GdkInputSource.GDK_SOURCE_TOUCHSCREEN)

  /** the device is an indirect touch device, such as a touchpad
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCHPAD extends InputSource(GdkInputSource.GDK_SOURCE_TOUCHPAD)

  /** the device is a trackpoint
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TRACKPOINT extends InputSource(GdkInputSource.GDK_SOURCE_TRACKPOINT)

  /** the device is a "pad", a collection of buttons, rings and strips found in
    * drawing tablets
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
