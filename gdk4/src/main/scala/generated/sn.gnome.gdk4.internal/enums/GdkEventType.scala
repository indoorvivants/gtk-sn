package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkEventType: _DELETE: the window manager has requested that the toplevel surface be hidden or destroyed, usually when the user clicks on a special icon in the title bar. _MOTION_NOTIFY: the pointer (usually a mouse) has moved. _BUTTON_PRESS: a mouse button has been pressed. _BUTTON_RELEASE: a mouse button has been released. _KEY_PRESS: a key has been pressed. _KEY_RELEASE: a key has been released. _ENTER_NOTIFY: the pointer has entered the surface. _LEAVE_NOTIFY: the pointer has left the surface. _FOCUS_CHANGE: the keyboard focus has entered or left the surface. _PROXIMITY_IN: an input device has moved into contact with a sensing surface (e.g. a touchscreen or graphics tablet). _PROXIMITY_OUT: an input device has moved out of contact with a sensing surface. _DRAG_ENTER: the mouse has entered the surface while a drag is in progress. _DRAG_LEAVE: the mouse has left the surface while a drag is in progress. _DRAG_MOTION: the mouse has moved in the surface while a drag is in progress. _DROP_START: a drop operation onto the surface has started. _SCROLL: the scroll wheel was turned _GRAB_BROKEN: a pointer or keyboard grab was broken. _TOUCH_BEGIN: A new touch event sequence has just started. _TOUCH_UPDATE: A touch event sequence has been updated. _TOUCH_END: A touch event sequence has finished. _TOUCH_CANCEL: A touch event sequence has been canceled. _TOUCHPAD_SWIPE: A touchpad swipe gesture event, the current state is determined by its phase field. _TOUCHPAD_PINCH: A touchpad pinch gesture event, the current state is determined by its phase field. _PAD_BUTTON_PRESS: A tablet pad button press event. _PAD_BUTTON_RELEASE: A tablet pad button release event. _PAD_RING: A tablet pad axis event from a "ring". _PAD_STRIP: A tablet pad axis event from a "strip". _PAD_GROUP_MODE: A tablet pad group mode change. _EVENT_LAST: marks the end of the GdkEventType enumeration.
*/
opaque type GdkEventType = CUnsignedInt
object GdkEventType extends _BindgenEnumCUnsignedInt[GdkEventType]:
  given _tag: Tag[GdkEventType] = Tag.UInt
  inline def define(inline a: Long): GdkEventType = a.toUInt
  val GDK_DELETE = define(0)
  val GDK_MOTION_NOTIFY = define(1)
  val GDK_BUTTON_PRESS = define(2)
  val GDK_BUTTON_RELEASE = define(3)
  val GDK_KEY_PRESS = define(4)
  val GDK_KEY_RELEASE = define(5)
  val GDK_ENTER_NOTIFY = define(6)
  val GDK_LEAVE_NOTIFY = define(7)
  val GDK_FOCUS_CHANGE = define(8)
  val GDK_PROXIMITY_IN = define(9)
  val GDK_PROXIMITY_OUT = define(10)
  val GDK_DRAG_ENTER = define(11)
  val GDK_DRAG_LEAVE = define(12)
  val GDK_DRAG_MOTION = define(13)
  val GDK_DROP_START = define(14)
  val GDK_SCROLL = define(15)
  val GDK_GRAB_BROKEN = define(16)
  val GDK_TOUCH_BEGIN = define(17)
  val GDK_TOUCH_UPDATE = define(18)
  val GDK_TOUCH_END = define(19)
  val GDK_TOUCH_CANCEL = define(20)
  val GDK_TOUCHPAD_SWIPE = define(21)
  val GDK_TOUCHPAD_PINCH = define(22)
  val GDK_PAD_BUTTON_PRESS = define(23)
  val GDK_PAD_BUTTON_RELEASE = define(24)
  val GDK_PAD_RING = define(25)
  val GDK_PAD_STRIP = define(26)
  val GDK_PAD_GROUP_MODE = define(27)
  val GDK_TOUCHPAD_HOLD = define(28)
  val GDK_EVENT_LAST = define(29)
  def getName(value: GdkEventType): Option[String] =
    value match
      case `GDK_DELETE` => Some("GDK_DELETE")
      case `GDK_MOTION_NOTIFY` => Some("GDK_MOTION_NOTIFY")
      case `GDK_BUTTON_PRESS` => Some("GDK_BUTTON_PRESS")
      case `GDK_BUTTON_RELEASE` => Some("GDK_BUTTON_RELEASE")
      case `GDK_KEY_PRESS` => Some("GDK_KEY_PRESS")
      case `GDK_KEY_RELEASE` => Some("GDK_KEY_RELEASE")
      case `GDK_ENTER_NOTIFY` => Some("GDK_ENTER_NOTIFY")
      case `GDK_LEAVE_NOTIFY` => Some("GDK_LEAVE_NOTIFY")
      case `GDK_FOCUS_CHANGE` => Some("GDK_FOCUS_CHANGE")
      case `GDK_PROXIMITY_IN` => Some("GDK_PROXIMITY_IN")
      case `GDK_PROXIMITY_OUT` => Some("GDK_PROXIMITY_OUT")
      case `GDK_DRAG_ENTER` => Some("GDK_DRAG_ENTER")
      case `GDK_DRAG_LEAVE` => Some("GDK_DRAG_LEAVE")
      case `GDK_DRAG_MOTION` => Some("GDK_DRAG_MOTION")
      case `GDK_DROP_START` => Some("GDK_DROP_START")
      case `GDK_SCROLL` => Some("GDK_SCROLL")
      case `GDK_GRAB_BROKEN` => Some("GDK_GRAB_BROKEN")
      case `GDK_TOUCH_BEGIN` => Some("GDK_TOUCH_BEGIN")
      case `GDK_TOUCH_UPDATE` => Some("GDK_TOUCH_UPDATE")
      case `GDK_TOUCH_END` => Some("GDK_TOUCH_END")
      case `GDK_TOUCH_CANCEL` => Some("GDK_TOUCH_CANCEL")
      case `GDK_TOUCHPAD_SWIPE` => Some("GDK_TOUCHPAD_SWIPE")
      case `GDK_TOUCHPAD_PINCH` => Some("GDK_TOUCHPAD_PINCH")
      case `GDK_PAD_BUTTON_PRESS` => Some("GDK_PAD_BUTTON_PRESS")
      case `GDK_PAD_BUTTON_RELEASE` => Some("GDK_PAD_BUTTON_RELEASE")
      case `GDK_PAD_RING` => Some("GDK_PAD_RING")
      case `GDK_PAD_STRIP` => Some("GDK_PAD_STRIP")
      case `GDK_PAD_GROUP_MODE` => Some("GDK_PAD_GROUP_MODE")
      case `GDK_TOUCHPAD_HOLD` => Some("GDK_TOUCHPAD_HOLD")
      case `GDK_EVENT_LAST` => Some("GDK_EVENT_LAST")
      case _ => _root_.scala.None
  extension (a: GdkEventType)
    inline def &(b: GdkEventType): GdkEventType = a & b
    inline def |(b: GdkEventType): GdkEventType = a | b
    inline def is(b: GdkEventType): Boolean = (a & b) == b