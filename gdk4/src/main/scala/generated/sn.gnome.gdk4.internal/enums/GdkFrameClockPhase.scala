package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkFrameClockPhase: _FRAME_CLOCK_PHASE_NONE: no phase _FRAME_CLOCK_PHASE_FLUSH_EVENTS: corresponds to GdkFrameClock::flush-events. Should not be handled by applications. _FRAME_CLOCK_PHASE_BEFORE_PAINT: corresponds to GdkFrameClock::before-paint. Should not be handled by applications. _FRAME_CLOCK_PHASE_UPDATE: corresponds to GdkFrameClock::update. _FRAME_CLOCK_PHASE_LAYOUT: corresponds to GdkFrameClock::layout. Should not be handled by applications. _FRAME_CLOCK_PHASE_PAINT: corresponds to GdkFrameClock::paint. _FRAME_CLOCK_PHASE_RESUME_EVENTS: corresponds to GdkFrameClock::resume-events. Should not be handled by applications. _FRAME_CLOCK_PHASE_AFTER_PAINT: corresponds to GdkFrameClock::after-paint. Should not be handled by applications.
*/
opaque type GdkFrameClockPhase = CUnsignedInt
object GdkFrameClockPhase extends _BindgenEnumCUnsignedInt[GdkFrameClockPhase]:
  given _tag: Tag[GdkFrameClockPhase] = Tag.UInt
  inline def define(inline a: Long): GdkFrameClockPhase = a.toUInt
  val GDK_FRAME_CLOCK_PHASE_NONE = define(0)
  val GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS = define(1)
  val GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT = define(2)
  val GDK_FRAME_CLOCK_PHASE_UPDATE = define(4)
  val GDK_FRAME_CLOCK_PHASE_LAYOUT = define(8)
  val GDK_FRAME_CLOCK_PHASE_PAINT = define(16)
  val GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS = define(32)
  val GDK_FRAME_CLOCK_PHASE_AFTER_PAINT = define(64)
  def getName(value: GdkFrameClockPhase): Option[String] =
    value match
      case `GDK_FRAME_CLOCK_PHASE_NONE` => Some("GDK_FRAME_CLOCK_PHASE_NONE")
      case `GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS` => Some("GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS")
      case `GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT` => Some("GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT")
      case `GDK_FRAME_CLOCK_PHASE_UPDATE` => Some("GDK_FRAME_CLOCK_PHASE_UPDATE")
      case `GDK_FRAME_CLOCK_PHASE_LAYOUT` => Some("GDK_FRAME_CLOCK_PHASE_LAYOUT")
      case `GDK_FRAME_CLOCK_PHASE_PAINT` => Some("GDK_FRAME_CLOCK_PHASE_PAINT")
      case `GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS` => Some("GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS")
      case `GDK_FRAME_CLOCK_PHASE_AFTER_PAINT` => Some("GDK_FRAME_CLOCK_PHASE_AFTER_PAINT")
      case _ => _root_.scala.None
  extension (a: GdkFrameClockPhase)
    inline def &(b: GdkFrameClockPhase): GdkFrameClockPhase = a & b
    inline def |(b: GdkFrameClockPhase): GdkFrameClockPhase = a | b
    inline def is(b: GdkFrameClockPhase): Boolean = (a & b) == b