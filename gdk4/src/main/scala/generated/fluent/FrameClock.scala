package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import sn.gnome.gdk4.internal.GdkFrameClock
import sn.gnome.gdk4.internal.GdkFrameClockPhase
import sn.gnome.gdk4.internal.GdkFrameTimings
import sn.gnome.glib.internal.gint64
import sn.gnome.gobject.fluent.Object

class FrameClock(raw: Ptr[GdkFrameClock]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def beginUpdating(): Unit = gdk_frame_clock_begin_updating(
    this.raw.asInstanceOf
  )

  def endUpdating(): Unit = gdk_frame_clock_end_updating(this.raw.asInstanceOf)

  def getCurrentTimings(): Ptr[GdkFrameTimings] =
    gdk_frame_clock_get_current_timings(this.raw.asInstanceOf)

  def getFps(): Double = gdk_frame_clock_get_fps(this.raw.asInstanceOf)

  def getFrameCounter(): CLongInt = gdk_frame_clock_get_frame_counter(
    this.raw.asInstanceOf
  ).value

  def getFrameTime(): CLongInt = gdk_frame_clock_get_frame_time(
    this.raw.asInstanceOf
  ).value

  def getHistoryStart(): CLongInt = gdk_frame_clock_get_history_start(
    this.raw.asInstanceOf
  ).value

  // Method get_refresh_info contains an OUT parameter, which is not supported yet

  def getTimings(frame_counter: CLongInt): Ptr[GdkFrameTimings] =
    gdk_frame_clock_get_timings(this.raw.asInstanceOf, gint64(frame_counter))

  def requestPhase(phase: GdkFrameClockPhase): Unit =
    gdk_frame_clock_request_phase(this.raw.asInstanceOf, phase)

end FrameClock
