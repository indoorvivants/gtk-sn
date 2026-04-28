package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkShortcutType: _SHORTCUT_ACCELERATOR: The shortcut is a keyboard accelerator. The GtkShortcutsShortcut:accelerator property will be used. _SHORTCUT_GESTURE_PINCH: The shortcut is a pinch gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_STRETCH: The shortcut is a stretch gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_ROTATE_CLOCKWISE: The shortcut is a clockwise rotation gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE: The shortcut is a counterclockwise rotation gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT: The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT: The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE: The shortcut is a gesture. The GtkShortcutsShortcut:icon property will be used. _SHORTCUT_GESTURE_SWIPE_LEFT: The shortcut is a swipe gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_SWIPE_RIGHT: The shortcut is a swipe gesture. GTK provides an icon and subtitle.
*/
opaque type GtkShortcutType = CUnsignedInt
object GtkShortcutType extends _BindgenEnumCUnsignedInt[GtkShortcutType]:
  given _tag: Tag[GtkShortcutType] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutType = a.toUInt
  val GTK_SHORTCUT_ACCELERATOR = define(0)
  val GTK_SHORTCUT_GESTURE_PINCH = define(1)
  val GTK_SHORTCUT_GESTURE_STRETCH = define(2)
  val GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE = define(3)
  val GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE = define(4)
  val GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT = define(5)
  val GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT = define(6)
  val GTK_SHORTCUT_GESTURE = define(7)
  val GTK_SHORTCUT_GESTURE_SWIPE_LEFT = define(8)
  val GTK_SHORTCUT_GESTURE_SWIPE_RIGHT = define(9)
  def getName(value: GtkShortcutType): Option[String] =
    value match
      case `GTK_SHORTCUT_ACCELERATOR` => Some("GTK_SHORTCUT_ACCELERATOR")
      case `GTK_SHORTCUT_GESTURE_PINCH` => Some("GTK_SHORTCUT_GESTURE_PINCH")
      case `GTK_SHORTCUT_GESTURE_STRETCH` => Some("GTK_SHORTCUT_GESTURE_STRETCH")
      case `GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE` => Some("GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE")
      case `GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE` => Some("GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE")
      case `GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT` => Some("GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT")
      case `GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT` => Some("GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT")
      case `GTK_SHORTCUT_GESTURE` => Some("GTK_SHORTCUT_GESTURE")
      case `GTK_SHORTCUT_GESTURE_SWIPE_LEFT` => Some("GTK_SHORTCUT_GESTURE_SWIPE_LEFT")
      case `GTK_SHORTCUT_GESTURE_SWIPE_RIGHT` => Some("GTK_SHORTCUT_GESTURE_SWIPE_RIGHT")
      case _ => _root_.scala.None
  extension (a: GtkShortcutType)
    inline def &(b: GtkShortcutType): GtkShortcutType = a & b
    inline def |(b: GtkShortcutType): GtkShortcutType = a | b
    inline def is(b: GtkShortcutType): Boolean = (a & b) == b