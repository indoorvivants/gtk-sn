package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import sn.gnome.gdk4.internal.GdkFrameClock
import sn.gnome.gdk4.internal.GdkFrameClockPhase
import sn.gnome.gdk4.internal.GdkFrameTimings
import sn.gnome.glib.internal.gint64
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GdkFrameClock` tells the application when to update and repaint a
  * surface.
  *
  * This may be synced to the vertical refresh rate of the monitor, for example.
  * Even when the frame clock uses a simple timer rather than a hardware-based
  * vertical sync, the frame clock helps because it ensures everything paints at
  * the same time (reducing the total number of frames).
  *
  * The frame clock can also automatically stop painting when it knows the
  * frames will not be visible, or scale back animation framerates.
  *
  * `GdkFrameClock` is designed to be compatible with an OpenGL-based
  * implementation or with mozRequestAnimationFrame in Firefox, for example.
  *
  * A frame clock is idle until someone requests a frame with
  * [method@Gdk.FrameClock.request_phase]. At some later point that makes sense
  * for the synchronization being implemented, the clock will process a frame
  * and emit signals for each phase that has been requested. (See the signals of
  * the `GdkFrameClock` class for documentation of the phases.
  * %GDK_FRAME_CLOCK_PHASE_UPDATE and the [signal@Gdk.FrameClock::update] signal
  * are most interesting for application writers, and are used to update the
  * animations, using the frame time given by
  * [method@Gdk.FrameClock.get_frame_time].
  *
  * The frame time is reported in microseconds and generally in the same
  * timescale as g_get_monotonic_time(), however, it is not the same as
  * g_get_monotonic_time(). The frame time does not advance during the time a
  * frame is being painted, and outside of a frame, an attempt is made so that
  * all calls to [method@Gdk.FrameClock.get_frame_time] that are called at a
  * “similar” time get the same value. This means that if different animations
  * are timed by looking at the difference in time between an initial value from
  * [method@Gdk.FrameClock.get_frame_time] and the value inside the
  * [signal@Gdk.FrameClock::update] signal of the clock, they will stay exactly
  * synchronized.
  */
class FrameClock(raw: Ptr[GdkFrameClock]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts updates for an animation.
    *
    * Until a matching call to [method@Gdk.FrameClock.end_updating] is made, the
    * frame clock will continually request a new frame with the
    * %GDK_FRAME_CLOCK_PHASE_UPDATE phase. This function may be called multiple
    * times and frames will be requested until gdk_frame_clock_end_updating() is
    * called the same number of times.
    */
  def beginUpdating(): Unit /* None */ = gdk_frame_clock_begin_updating(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stops updates for an animation.
    *
    * See the documentation for [method@Gdk.FrameClock.begin_updating].
    */
  def endUpdating(): Unit /* None */ = gdk_frame_clock_end_updating(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the frame timings for the current frame.
    */
  def getCurrentTimings(): Ptr[GdkFrameTimings] /* None */ =
    gdk_frame_clock_get_current_timings(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calculates the current frames-per-second, based on the frame timings of @frame_clock.
    */
  def getFps(): Double /* None */ = gdk_frame_clock_get_fps(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `GdkFrameClock` maintains a 64-bit counter that increments for each frame
    * drawn.
    */
  def getFrameCounter(): CLongInt /* None */ =
    gdk_frame_clock_get_frame_counter(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the time that should currently be used for animations.
    *
    * Inside the processing of a frame, it’s the time used to compute the
    * animation position of everything in a frame. Outside of a frame, it's the
    * time of the conceptual “previous frame,” which may be either the actual
    * previous frame time, or if that’s too old, an updated time.
    */
  def getFrameTime(): CLongInt /* None */ = gdk_frame_clock_get_frame_time(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the frame counter for the oldest frame available in history.
    *
    * `GdkFrameClock` internally keeps a history of `GdkFrameTimings` objects
    * for recent frames that can be retrieved with
    * [method@Gdk.FrameClock.get_timings]. The set of stored frames is the set
    * from the counter values given by [method@Gdk.FrameClock.get_history_start]
    * and [method@Gdk.FrameClock.get_frame_counter], inclusive.
    */
  def getHistoryStart(): CLongInt /* None */ =
    gdk_frame_clock_get_history_start(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Predicts a presentation time, based on history.
    *
    * Using the frame history stored in the frame clock, finds the last known
    * presentation time and refresh interval, and assuming that presentation
    * times are separated by the refresh interval, predicts a presentation time
    * that is a multiple of the refresh interval after the last presentation
    * time, and later than @base_time.
    */
  @annotation.compileTimeOnly(
    "Method get_refresh_info contains an OUT parameter, which is not supported yet"
  )
  private def getRefreshInfo__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a `GdkFrameTimings` object holding timing information for the
    * current frame or a recent frame.
    *
    * The `GdkFrameTimings` object may not yet be complete: see
    * [method@Gdk.FrameTimings.get_complete] and
    * [method@Gdk.FrameClock.get_history_start].
    */
  def getTimings(
      frame_counter: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Ptr[GdkFrameTimings] /* None */ =
    gdk_frame_clock_get_timings(this.raw.asInstanceOf, gint64(frame_counter))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks the frame clock to run a particular phase.
    *
    * The signal corresponding the requested phase will be emitted the next time
    * the frame clock processes. Multiple calls to
    * gdk_frame_clock_request_phase() will be combined together and only one
    * frame processed. If you are displaying animated content and want to
    * continually request the %GDK_FRAME_CLOCK_PHASE_UPDATE phase for a period
    * of time, you should use [method@Gdk.FrameClock.begin_updating] instead,
    * since this allows GTK to adjust system parameters to get maximally smooth
    * animations.
    */
  def requestPhase(
      phase: GdkFrameClockPhase /* Some(GdkFrameClockPhase) */
  ): Unit /* None */ =
    gdk_frame_clock_request_phase(this.raw.asInstanceOf, phase)

end FrameClock
