package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import sn.gnome.gdk4.{Paintable, Surface}
import sn.gnome.glib.Error
import sn.gnome.glib.internal.{gboolean, gint, gint64}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkMediaStream

/** `GtkMediaStream` is the integration point for media playback inside GTK.
  *
  * GTK provides an implementation of the `GtkMediaStream` interface that is
  * called [class@Gtk.MediaFile].
  *
  * Apart from application-facing API for stream playback, `GtkMediaStream` has
  * a number of APIs that are only useful for implementations and should not be
  * used in applications: [method@Gtk.MediaStream.prepared],
  * [method@Gtk.MediaStream.unprepared], [method@Gtk.MediaStream.update],
  * [method@Gtk.MediaStream.ended], [method@Gtk.MediaStream.seek_success],
  * [method@Gtk.MediaStream.seek_failed], [method@Gtk.MediaStream.gerror],
  * [method@Gtk.MediaStream.error], [method@Gtk.MediaStream.error_valist].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MediaStream private[gnome] (raw: Ptr[GtkMediaStream])
    extends Object(raw.asInstanceOf),
      Paintable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Pauses the media stream and marks it as ended.
    *
    * This is a hint only, calls to [method@Gtk.MediaStream.play] may still
    * happen.
    *
    * The media stream must be prepared when this function is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ended(): Unit /* None */ =
    gtk_media_stream_ended(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end ended

  /** Sets @self into an error state using a printf()-style format string.
    *
    * This is a utility function that calls [method@Gtk.MediaStream.gerror]. See
    * that function for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method error/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def error__ = ???

  /** Sets @self into an error state using a printf()-style format string.
    *
    * This is a utility function that calls [method@Gtk.MediaStream.gerror]. See
    * that function for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method error_valist/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def errorValist__ = ???

  /** Sets @self into an error state.
    *
    * This will pause the stream (you can check for an error via
    * [method@Gtk.MediaStream.get_error] in your GtkMediaStream.pause()
    * implementation), abort pending seeks and mark the stream as prepared.
    *
    * if the stream is already in an error state, this call will be ignored and
    * the existing error will be retained.
    *
    * To unset an error, the stream must be reset via a call to
    * [method@Gtk.MediaStream.unprepared].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gerror(
      error: sn.gnome.glib.Error /* Some(Ptr[_root_.sn.gnome.glib.internal.GError]) */
  ): Unit /* None */ =
    gtk_media_stream_gerror(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      error.getUnsafeRawPointer().asInstanceOf
    )
  end gerror

  /** Gets the duration of the stream.
    *
    * If the duration is not known, 0 will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDuration(): CLongInt /* None */ =
    gtk_media_stream_get_duration(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value
  end getDuration

  /** Returns whether the streams playback is finished.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnded(): Boolean /* None */ =
    gtk_media_stream_get_ended(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end getEnded

  /** If the stream is in an error state, returns the `GError` explaining that
    * state.
    *
    * Any type of error can be reported here depending on the implementation of
    * the media stream.
    *
    * A media stream in an error cannot be operated on, calls like
    * [method@Gtk.MediaStream.play] or [method@Gtk.MediaStream.seek] will not
    * have any effect.
    *
    * `GtkMediaStream` itself does not provide a way to unset an error, but
    * implementations may provide options. For example, a [class@Gtk.MediaFile]
    * will unset errors when a new source is set, e.g. with
    * [method@Gtk.MediaFile.set_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getError(): sn.gnome.glib.Error /* None */ =
    sn.gnome.glib.Error.fromRaw(
      gtk_media_stream_get_error(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
      )
    )
  end getError

  /** Returns whether the stream is set to loop.
    *
    * See [method@Gtk.MediaStream.set_loop] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLoop(): Boolean /* None */ =
    gtk_media_stream_get_loop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end getLoop

  /** Returns whether the audio for the stream is muted.
    *
    * See [method@Gtk.MediaStream.set_muted] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMuted(): Boolean /* None */ =
    gtk_media_stream_get_muted(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end getMuted

  /** Return whether the stream is currently playing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlaying(): Boolean /* None */ =
    gtk_media_stream_get_playing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end getPlaying

  /** Returns the current presentation timestamp in microseconds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTimestamp(): CLongInt /* None */ =
    gtk_media_stream_get_timestamp(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value
  end getTimestamp

  /** Returns the volume of the audio for the stream.
    *
    * See [method@Gtk.MediaStream.set_volume] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVolume(): Double /* None */ =
    gtk_media_stream_get_volume(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end getVolume

  /** Returns whether the stream has audio.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasAudio(): Boolean /* None */ =
    gtk_media_stream_has_audio(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end hasAudio

  /** Returns whether the stream has video.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasVideo(): Boolean /* None */ =
    gtk_media_stream_has_video(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end hasVideo

  /** Returns whether the stream has finished initializing.
    *
    * At this point the existence of audio and video is known.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isPrepared(): Boolean /* None */ =
    gtk_media_stream_is_prepared(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end isPrepared

  /** Checks if a stream may be seekable.
    *
    * This is meant to be a hint. Streams may not allow seeking even if this
    * function returns %TRUE. However, if this function returns %FALSE, streams
    * are guaranteed to not be seekable and user interfaces may hide controls
    * that allow seeking.
    *
    * It is allowed to call [method@Gtk.MediaStream.seek] on a non-seekable
    * stream, though it will not do anything.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSeekable(): Boolean /* None */ =
    gtk_media_stream_is_seekable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end isSeekable

  /** Checks if there is currently a seek operation going on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSeeking(): Boolean /* None */ =
    gtk_media_stream_is_seeking(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    ).value.!=(0)
  end isSeeking

  /** Pauses playback of the stream.
    *
    * If the stream is not playing, do nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pause(): Unit /* None */ =
    gtk_media_stream_pause(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end pause

  /** Starts playing the stream.
    *
    * If the stream is in error or already playing, do nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def play(): Unit /* None */ =
    gtk_media_stream_play(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end play

  /** Same as gtk_media_stream_stream_prepared().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepared(
      has_audio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      has_video: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      seekable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      duration: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ =
    gtk_media_stream_prepared(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      gboolean(gint((if has_audio == true then 1 else 0))),
      gboolean(gint((if has_video == true then 1 else 0))),
      gboolean(gint((if seekable == true then 1 else 0))),
      gint64(duration)
    )
  end prepared

  /** Called by users to attach the media stream to a `GdkSurface` they manage.
    *
    * The stream can then access the resources of @surface for its rendering
    * purposes. In particular, media streams might want to create a
    * `GdkGLContext` or sync to the `GdkFrameClock`.
    *
    * Whoever calls this function is responsible for calling
    * [method@Gtk.MediaStream.unrealize] before either the stream or @surface
    * get destroyed.
    *
    * Multiple calls to this function may happen from different users of the
    * video, even with the same @surface. Each of these calls must be followed
    * by its own call to [method@Gtk.MediaStream.unrealize].
    *
    * It is not required to call this function to make a media stream work.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def realize(
      surface: sn.gnome.gdk4.Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  )(using Runtime): Unit /* None */ =
    gtk_media_stream_realize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      surface.getUnsafeRawPointer().asInstanceOf
    )
  end realize

  /** Start a seek operation on @self to @timestamp.
    *
    * If @timestamp is out of range, it will be clamped.
    *
    * Seek operations may not finish instantly. While a seek operation is in
    * process, the [property@Gtk.MediaStream:seeking] property will be set.
    *
    * When calling gtk_media_stream_seek() during an ongoing seek operation, the
    * new seek will override any pending seek.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seek(
      timestamp: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ =
    gtk_media_stream_seek(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      gint64(timestamp)
    )
  end seek

  /** Ends a seek operation started via GtkMediaStream.seek() as a failure.
    *
    * This will not cause an error on the stream and will assume that playback
    * continues as if no seek had happened.
    *
    * See [method@Gtk.MediaStream.seek_success] for the other way of ending a
    * seek.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seekFailed(): Unit /* None */ =
    gtk_media_stream_seek_failed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end seekFailed

  /** Ends a seek operation started via GtkMediaStream.seek() successfully.
    *
    * This function will unset the GtkMediaStream:ended property if it was set.
    *
    * See [method@Gtk.MediaStream.seek_failed] for the other way of ending a
    * seek.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seekSuccess(): Unit /* None */ =
    gtk_media_stream_seek_success(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end seekSuccess

  /** Sets whether the stream should loop.
    *
    * In this case, it will attempt to restart playback from the beginning
    * instead of stopping at the end.
    *
    * Not all streams may support looping, in particular non-seekable streams.
    * Those streams will ignore the loop setting and just end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLoop(
      loop: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_media_stream_set_loop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      gboolean(gint((if loop == true then 1 else 0)))
    )
  end setLoop

  /** Sets whether the audio stream should be muted.
    *
    * Muting a stream will cause no audio to be played, but it does not modify
    * the volume. This means that muting and then unmuting the stream will
    * restore the volume settings.
    *
    * If the stream has no audio, calling this function will still work but it
    * will not have an audible effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMuted(
      muted: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_media_stream_set_muted(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      gboolean(gint((if muted == true then 1 else 0)))
    )
  end setMuted

  /** Starts or pauses playback of the stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPlaying(
      playing: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_media_stream_set_playing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      gboolean(gint((if playing == true then 1 else 0)))
    )
  end setPlaying

  /** Sets the volume of the audio stream.
    *
    * This function call will work even if the stream is muted.
    *
    * The given @volume should range from 0.0 for silence to 1.0 for as loud as
    * possible. Values outside of this range will be clamped to the nearest
    * value.
    *
    * If the stream has no audio or is muted, calling this function will still
    * work but it will not have an immediate audible effect. When the stream is
    * unmuted, the new volume setting will take effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVolume(volume: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_media_stream_set_volume(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      volume
    )
  end setVolume

  /** Pauses the media stream and marks it as ended.
    *
    * This is a hint only, calls to [method@Gtk.MediaStream.play] may still
    * happen.
    *
    * The media stream must be prepared when this function is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def streamEnded(): Unit /* None */ =
    gtk_media_stream_stream_ended(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end streamEnded

  /** Called by `GtkMediaStream` implementations to advertise the stream being
    * ready to play and providing details about the stream.
    *
    * Note that the arguments are hints. If the stream implementation cannot
    * determine the correct values, it is better to err on the side of caution
    * and return %TRUE. User interfaces will use those values to determine what
    * controls to show.
    *
    * This function may not be called again until the stream has been reset via
    * [method@Gtk.MediaStream.stream_unprepared].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def streamPrepared(
      has_audio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      has_video: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      seekable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      duration: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ =
    gtk_media_stream_stream_prepared(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      gboolean(gint((if has_audio == true then 1 else 0))),
      gboolean(gint((if has_video == true then 1 else 0))),
      gboolean(gint((if seekable == true then 1 else 0))),
      gint64(duration)
    )
  end streamPrepared

  /** Resets a given media stream implementation.
    *
    * [method@Gtk.MediaStream.stream_prepared] can then be called again.
    *
    * This function will also reset any error state the stream was in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def streamUnprepared(): Unit /* None */ =
    gtk_media_stream_stream_unprepared(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end streamUnprepared

  /** Same as gtk_media_stream_stream_unprepared().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unprepared(): Unit /* None */ =
    gtk_media_stream_unprepared(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]]
    )
  end unprepared

  /** Undoes a previous call to gtk_media_stream_realize().
    *
    * This causes the stream to release all resources it had allocated from @surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unrealize(
      surface: sn.gnome.gdk4.Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  )(using Runtime): Unit /* None */ =
    gtk_media_stream_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      surface.getUnsafeRawPointer().asInstanceOf
    )
  end unrealize

  /** Media stream implementations should regularly call this function to update
    * the timestamp reported by the stream.
    *
    * It is up to implementations to call this at the frequency they deem
    * appropriate.
    *
    * The media stream must be prepared when this function is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def update(
      timestamp: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ =
    gtk_media_stream_update(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaStream]],
      gint64(timestamp)
    )
  end update

end MediaStream

object MediaStream:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMediaStream])(using Runtime) =
    summon[Runtime].getOrCreate[MediaStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MediaStream(ptr)
    )

end MediaStream
