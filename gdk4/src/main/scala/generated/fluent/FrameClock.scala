package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import sn.gnome.gdk4.fluent.FrameClockPhase
import sn.gnome.gdk4.internal.GdkFrameClock
import sn.gnome.glib.internal.{gchar, gint64, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A `GdkFrameClock` tells the application when to update and repaint a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FrameClock private[gnome] (raw: Ptr[GdkFrameClock])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Starts updates for an animation.
    *
    * Until a matching call to [method@Gdk.FrameClock.end_updating] is made, the
    * frame clock will continually request a new frame with the
    * %GDK_FRAME_CLOCK_PHASE_UPDATE phase. This function may be called multiple
    * times and frames will be requested until gdk_frame_clock_end_updating() is
    * called the same number of times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def beginUpdating(): Unit /* None */ =
    gdk_frame_clock_begin_updating(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameClock]]
    )
  end beginUpdating

  /** Stops updates for an animation.
    *
    * See the documentation for [method@Gdk.FrameClock.begin_updating].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endUpdating(): Unit /* None */ =
    gdk_frame_clock_end_updating(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameClock]]
    )
  end endUpdating

  /** Gets the frame timings for the current frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_current_timings/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FrameTimings), @type -> DataRecord(GdkFrameTimings*)))"
  )
  private def getCurrentTimings__ = ???

  /** Calculates the current frames-per-second, based on the frame timings of @frame_clock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFps(): Double /* None */ =
    gdk_frame_clock_get_fps(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameClock]]
    )
  end getFps

  /** `GdkFrameClock` maintains a 64-bit counter that increments for each frame
    * drawn.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFrameCounter(): CLongInt /* None */ =
    gdk_frame_clock_get_frame_counter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameClock]]
    ).value
  end getFrameCounter

  /** Gets the time that should currently be used for animations.
    *
    * Inside the processing of a frame, it’s the time used to compute the
    * animation position of everything in a frame. Outside of a frame, it's the
    * time of the conceptual “previous frame,” which may be either the actual
    * previous frame time, or if that’s too old, an updated time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFrameTime(): CLongInt /* None */ =
    gdk_frame_clock_get_frame_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameClock]]
    ).value
  end getFrameTime

  /** Returns the frame counter for the oldest frame available in history.
    *
    * `GdkFrameClock` internally keeps a history of `GdkFrameTimings` objects
    * for recent frames that can be retrieved with
    * [method@Gdk.FrameClock.get_timings]. The set of stored frames is the set
    * from the counter values given by [method@Gdk.FrameClock.get_history_start]
    * and [method@Gdk.FrameClock.get_frame_counter], inclusive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHistoryStart(): CLongInt /* None */ =
    gdk_frame_clock_get_history_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameClock]]
    ).value
  end getHistoryStart

  /** Predicts a presentation time, based on history.
    *
    * Using the frame history stored in the frame clock, finds the last known
    * presentation time and refresh interval, and assuming that presentation
    * times are separated by the refresh interval, predicts a presentation time
    * that is a multiple of the refresh interval after the last presentation
    * time, and later than @base_time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_refresh_info]: Method get_refresh_info contains an OUT parameter, which is not supported yet"
  )
  private def getRefreshInfo__ = ???

  /** Retrieves a `GdkFrameTimings` object holding timing information for the
    * current frame or a recent frame.
    *
    * The `GdkFrameTimings` object may not yet be complete: see
    * [method@Gdk.FrameTimings.get_complete] and
    * [method@Gdk.FrameClock.get_history_start].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_timings/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FrameTimings), @type -> DataRecord(GdkFrameTimings*)))"
  )
  private def getTimings__ = ???

  /** Asks the frame clock to run a particular phase.
    *
    * The signal corresponding the requested phase will be emitted the next time
    * the frame clock processes. Multiple calls to
    * gdk_frame_clock_request_phase() will be combined together and only one
    * frame processed. If you are displaying animated content and want to
    * continually request the %GDK_FRAME_CLOCK_PHASE_UPDATE phase for a period
    * of time, you should use [method@Gdk.FrameClock.begin_updating] instead,
    * since this allows GTK to adjust system parameters to get maximally smooth
    * animations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def requestPhase(
      phase: FrameClockPhase /* Some(GdkFrameClockPhase) */
  ): Unit /* None */ =
    gdk_frame_clock_request_phase(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameClock]],
      phase.raw
    )
  end requestPhase

  /** This signal ends processing of the frame.
    *
    * Applications should generally not handle this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAfterPaint(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkFrameClock],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"after-paint"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAfterPaint

  /** Begins processing of the frame.
    *
    * Applications should generally not handle this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onBeforePaint(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkFrameClock],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"before-paint"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onBeforePaint

  /** Used to flush pending motion events that are being batched up and
    * compressed together.
    *
    * Applications should not handle this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onFlushEvents(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkFrameClock],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"flush-events"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onFlushEvents

  /** Emitted as the second step of toolkit and application processing of the
    * frame.
    *
    * Any work to update sizes and positions of application elements should be
    * performed. GTK normally handles this internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLayout(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkFrameClock],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"layout"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onLayout

  /** Emitted as the third step of toolkit and application processing of the
    * frame.
    *
    * The frame is repainted. GDK normally handles this internally and emits
    * [signal@Gdk.Surface::render] signals which are turned into
    * [signal@Gtk.Widget::snapshot] signals by GTK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPaint(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkFrameClock],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"paint"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onPaint

  /** Emitted after processing of the frame is finished.
    *
    * This signal is handled internally by GTK to resume normal event
    * processing. Applications should not handle this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onResumeEvents(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkFrameClock],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"resume-events"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onResumeEvents

  /** Emitted as the first step of toolkit and application processing of the
    * frame.
    *
    * Animations should be updated using [method@Gdk.FrameClock.get_frame_time].
    * Applications can connect directly to this signal, or use
    * [method@Gtk.Widget.add_tick_callback] as a more convenient interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onUpdate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkFrameClock],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"update"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onUpdate
end FrameClock

object FrameClock:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkFrameClock])(using Runtime) =
    summon[Runtime].getOrCreate[FrameClock](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FrameClock(ptr)
    )

end FrameClock
