package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkTouchpadGesturePhase: _TOUCHPAD_GESTURE_PHASE_BEGIN: The gesture has begun. _TOUCHPAD_GESTURE_PHASE_UPDATE: The gesture has been updated. _TOUCHPAD_GESTURE_PHASE_END: The gesture was finished, changes should be permanently applied. _TOUCHPAD_GESTURE_PHASE_CANCEL: The gesture was cancelled, all changes should be undone.
*/
opaque type GdkTouchpadGesturePhase = CUnsignedInt
object GdkTouchpadGesturePhase extends _BindgenEnumCUnsignedInt[GdkTouchpadGesturePhase]:
  given _tag: Tag[GdkTouchpadGesturePhase] = Tag.UInt
  inline def define(inline a: Long): GdkTouchpadGesturePhase = a.toUInt
  val GDK_TOUCHPAD_GESTURE_PHASE_BEGIN = define(0)
  val GDK_TOUCHPAD_GESTURE_PHASE_UPDATE = define(1)
  val GDK_TOUCHPAD_GESTURE_PHASE_END = define(2)
  val GDK_TOUCHPAD_GESTURE_PHASE_CANCEL = define(3)
  def getName(value: GdkTouchpadGesturePhase): Option[String] =
    value match
      case `GDK_TOUCHPAD_GESTURE_PHASE_BEGIN` => Some("GDK_TOUCHPAD_GESTURE_PHASE_BEGIN")
      case `GDK_TOUCHPAD_GESTURE_PHASE_UPDATE` => Some("GDK_TOUCHPAD_GESTURE_PHASE_UPDATE")
      case `GDK_TOUCHPAD_GESTURE_PHASE_END` => Some("GDK_TOUCHPAD_GESTURE_PHASE_END")
      case `GDK_TOUCHPAD_GESTURE_PHASE_CANCEL` => Some("GDK_TOUCHPAD_GESTURE_PHASE_CANCEL")
      case _ => _root_.scala.None
  extension (a: GdkTouchpadGesturePhase)
    inline def &(b: GdkTouchpadGesturePhase): GdkTouchpadGesturePhase = a & b
    inline def |(b: GdkTouchpadGesturePhase): GdkTouchpadGesturePhase = a | b
    inline def is(b: GdkTouchpadGesturePhase): Boolean = (a & b) == b