package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkShortcutType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GtkShortcutType specifies the kind of shortcut that is being described.
  *
  * More values may be added to this enumeration over time.
  */
enum ShortcutType(val raw: GtkShortcutType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a keyboard accelerator. The
    * GtkShortcutsShortcut:accelerator property will be used.
    */
  case ACCELERATOR
      extends ShortcutType(GtkShortcutType.GTK_SHORTCUT_ACCELERATOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a pinch gesture. GTK provides an icon and subtitle.
    */
  case GESTURE_PINCH
      extends ShortcutType(GtkShortcutType.GTK_SHORTCUT_GESTURE_PINCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a stretch gesture. GTK provides an icon and subtitle.
    */
  case GESTURE_STRETCH
      extends ShortcutType(GtkShortcutType.GTK_SHORTCUT_GESTURE_STRETCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a clockwise rotation gesture. GTK provides an icon and
    * subtitle.
    */
  case GESTURE_ROTATE_CLOCKWISE
      extends ShortcutType(
        GtkShortcutType.GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a counterclockwise rotation gesture. GTK provides an icon
    * and subtitle.
    */
  case GESTURE_ROTATE_COUNTERCLOCKWISE
      extends ShortcutType(
        GtkShortcutType.GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a two-finger swipe gesture. GTK provides an icon and
    * subtitle.
    */
  case GESTURE_TWO_FINGER_SWIPE_LEFT
      extends ShortcutType(
        GtkShortcutType.GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a two-finger swipe gesture. GTK provides an icon and
    * subtitle.
    */
  case GESTURE_TWO_FINGER_SWIPE_RIGHT
      extends ShortcutType(
        GtkShortcutType.GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a gesture. The GtkShortcutsShortcut:icon property will be
    * used.
    */
  case GESTURE extends ShortcutType(GtkShortcutType.GTK_SHORTCUT_GESTURE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
    */
  case GESTURE_SWIPE_LEFT
      extends ShortcutType(GtkShortcutType.GTK_SHORTCUT_GESTURE_SWIPE_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
    */
  case GESTURE_SWIPE_RIGHT
      extends ShortcutType(GtkShortcutType.GTK_SHORTCUT_GESTURE_SWIPE_RIGHT)
end ShortcutType

object ShortcutType:
  def fromRaw(raw: GtkShortcutType): ShortcutType =
    raw match
      case GtkShortcutType.GTK_SHORTCUT_ACCELERATOR => ShortcutType.ACCELERATOR
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_PINCH =>
        ShortcutType.GESTURE_PINCH
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_STRETCH =>
        ShortcutType.GESTURE_STRETCH
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE =>
        ShortcutType.GESTURE_ROTATE_CLOCKWISE
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE =>
        ShortcutType.GESTURE_ROTATE_COUNTERCLOCKWISE
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT =>
        ShortcutType.GESTURE_TWO_FINGER_SWIPE_LEFT
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT =>
        ShortcutType.GESTURE_TWO_FINGER_SWIPE_RIGHT
      case GtkShortcutType.GTK_SHORTCUT_GESTURE => ShortcutType.GESTURE
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_SWIPE_LEFT =>
        ShortcutType.GESTURE_SWIPE_LEFT
      case GtkShortcutType.GTK_SHORTCUT_GESTURE_SWIPE_RIGHT =>
        ShortcutType.GESTURE_SWIPE_RIGHT
  end fromRaw
end ShortcutType
