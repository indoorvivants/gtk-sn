package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import sn.gnome.gdk4.FrameTimings
import sn.gnome.gdk4.internal.GdkFrameTimings
import sn.gnome.glib.internal.{gboolean, gint, gint64}

/** A `GdkFrameTimings` object holds timing information for a single frame of
  * the application’s displays.
  *
  * To retrieve `GdkFrameTimings` objects, use
  * [method@Gdk.FrameClock.get_timings] or
  * [method@Gdk.FrameClock.get_current_timings]. The information in
  * `GdkFrameTimings` is useful for precise synchronization of video with the
  * event or audio streams, and for measuring quality metrics for the
  * application’s display, such as latency and jitter.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FrameTimings private[gnome] (raw: Ptr[GdkFrameTimings]):

  def getUnsafeRawPointer(): Ptr[GdkFrameTimings] = this.raw

  /** Returns whether @timings are complete.
    *
    * The timing information in a `GdkFrameTimings` is filled in incrementally
    * as the frame as drawn and passed off to the window system for processing
    * and display to the user. The accessor functions for `GdkFrameTimings` can
    * return 0 to indicate an unavailable value for two reasons: either because
    * the information is not yet available, or because it isn't available at
    * all.
    *
    * Once this function returns %TRUE for a frame, you can be certain that no
    * further values will become available and be stored in the
    * `GdkFrameTimings`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getComplete(): Boolean /* None */ =
    gdk_frame_timings_get_complete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
    ).value.!=(0)
  end getComplete

  /** Gets the frame counter value of the `GdkFrameClock` when this frame was
    * drawn.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFrameCounter(): CLongInt /* None */ =
    gdk_frame_timings_get_frame_counter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
    ).value
  end getFrameCounter

  /** Returns the frame time for the frame.
    *
    * This is the time value that is typically used to time animations for the
    * frame. See [method@Gdk.FrameClock.get_frame_time].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFrameTime(): CLongInt /* None */ =
    gdk_frame_timings_get_frame_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
    ).value
  end getFrameTime

  /** Gets the predicted time at which this frame will be displayed.
    *
    * Although no predicted time may be available, if one is available, it will
    * be available while the frame is being generated, in contrast to
    * [method@Gdk.FrameTimings.get_presentation_time], which is only available
    * after the frame has been presented.
    *
    * In general, if you are simply animating, you should use
    * [method@Gdk.FrameClock.get_frame_time] rather than this function, but this
    * function is useful for applications that want exact control over latency.
    * For example, a movie player may want this information for Audio/Video
    * synchronization.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPredictedPresentationTime(): CLongInt /* None */ =
    gdk_frame_timings_get_predicted_presentation_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
    ).value
  end getPredictedPresentationTime

  /** Reurns the presentation time.
    *
    * This is the time at which the frame became visible to the user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPresentationTime(): CLongInt /* None */ =
    gdk_frame_timings_get_presentation_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
    ).value
  end getPresentationTime

  /** Gets the natural interval between presentation times for the display that
    * this frame was displayed on.
    *
    * Frame presentation usually happens during the “vertical blanking
    * interval”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRefreshInterval(): CLongInt /* None */ =
    gdk_frame_timings_get_refresh_interval(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
    ).value
  end getRefreshInterval

  /** Increases the reference count of @timings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gdk4.FrameTimings /* None */ =
    sn.gnome.gdk4.FrameTimings.fromRaw(
      gdk_frame_timings_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
      )
    )
  end ref

  /** Decreases the reference count of @timings.
    *
    * If @timings is no longer referenced, it will be freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gdk_frame_timings_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkFrameTimings]]
    )
  end unref

end FrameTimings

object FrameTimings:
  def fromRaw(ptr: Ptr[GdkFrameTimings]): FrameTimings = new FrameTimings(ptr)
end FrameTimings
