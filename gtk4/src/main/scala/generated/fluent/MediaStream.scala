package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.GQuark
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gint64
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkMediaStream

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkMediaStream` is the integration point for media playback inside GTK.
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
  */
class MediaStream(raw: Ptr[GtkMediaStream])
    extends Object(raw.asInstanceOf),
      Paintable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pauses the media stream and marks it as ended.
    *
    * This is a hint only, calls to [method@Gtk.MediaStream.play] may still
    * happen.
    *
    * The media stream must be prepared when this function is called.
    */
  def ended(): Unit = gtk_media_stream_ended(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @self into an error state using a printf()-style format string.
    *
    * This is a utility function that calls [method@Gtk.MediaStream.gerror]. See
    * that function for details.
    */
  inline def error(
      domain: GQuark,
      code: Int,
      format: String | CString,
      args: Any*
  )(using Zone): Unit = gtk_media_stream_error(
    this.raw.asInstanceOf,
    domain,
    code,
    __sn_extract_string(format),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @self into an error state using a printf()-style format string.
    *
    * This is a utility function that calls [method@Gtk.MediaStream.gerror]. See
    * that function for details.
    */
  def errorValist(
      domain: GQuark,
      code: Int,
      format: String | CString,
      args: CVarArgList
  )(using Zone): Unit = gtk_media_stream_error_valist(
    this.raw.asInstanceOf,
    domain,
    code,
    __sn_extract_string(format),
    args
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @self into an error state.
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
    */
  def gerror(error: Ptr[GError]): Unit =
    gtk_media_stream_gerror(this.raw.asInstanceOf, error)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the duration of the stream.
    *
    * If the duration is not known, 0 will be returned.
    */
  def getDuration(): CLongInt = gtk_media_stream_get_duration(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the streams playback is finished.
    */
  def getEnded(): Boolean =
    gtk_media_stream_get_ended(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If the stream is in an error state, returns the `GError` explaining that
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
    */
  def getError(): Ptr[GError] = gtk_media_stream_get_error(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream is set to loop.
    *
    * See [method@Gtk.MediaStream.set_loop] for details.
    */
  def getLoop(): Boolean =
    gtk_media_stream_get_loop(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the audio for the stream is muted.
    *
    * See [method@Gtk.MediaStream.set_muted] for details.
    */
  def getMuted(): Boolean =
    gtk_media_stream_get_muted(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return whether the stream is currently playing.
    */
  def getPlaying(): Boolean =
    gtk_media_stream_get_playing(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current presentation timestamp in microseconds.
    */
  def getTimestamp(): CLongInt = gtk_media_stream_get_timestamp(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the volume of the audio for the stream.
    *
    * See [method@Gtk.MediaStream.set_volume] for details.
    */
  def getVolume(): Double = gtk_media_stream_get_volume(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream has audio.
    */
  def hasAudio(): Boolean =
    gtk_media_stream_has_audio(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream has video.
    */
  def hasVideo(): Boolean =
    gtk_media_stream_has_video(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream has finished initializing.
    *
    * At this point the existence of audio and video is known.
    */
  def isPrepared(): Boolean =
    gtk_media_stream_is_prepared(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a stream may be seekable.
    *
    * This is meant to be a hint. Streams may not allow seeking even if this
    * function returns %TRUE. However, if this function returns %FALSE, streams
    * are guaranteed to not be seekable and user interfaces may hide controls
    * that allow seeking.
    *
    * It is allowed to call [method@Gtk.MediaStream.seek] on a non-seekable
    * stream, though it will not do anything.
    */
  def isSeekable(): Boolean =
    gtk_media_stream_is_seekable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if there is currently a seek operation going on.
    */
  def isSeeking(): Boolean =
    gtk_media_stream_is_seeking(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pauses playback of the stream.
    *
    * If the stream is not playing, do nothing.
    */
  def pause(): Unit = gtk_media_stream_pause(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts playing the stream.
    *
    * If the stream is in error or already playing, do nothing.
    */
  def play(): Unit = gtk_media_stream_play(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Same as gtk_media_stream_stream_prepared().
    */
  def prepared(
      has_audio: Boolean,
      has_video: Boolean,
      seekable: Boolean,
      duration: CLongInt
  ): Unit = gtk_media_stream_prepared(
    this.raw.asInstanceOf,
    gboolean(gint((if has_audio == true then 1 else 0))),
    gboolean(gint((if has_video == true then 1 else 0))),
    gboolean(gint((if seekable == true then 1 else 0))),
    gint64(duration)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Called by users to attach the media stream to a `GdkSurface` they manage.
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
    */
  def realize(surface: Surface): Unit = gtk_media_stream_realize(
    this.raw.asInstanceOf,
    surface.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Start a seek operation on @self to @timestamp.
    *
    * If @timestamp is out of range, it will be clamped.
    *
    * Seek operations may not finish instantly. While a seek operation is in
    * process, the [property@Gtk.MediaStream:seeking] property will be set.
    *
    * When calling gtk_media_stream_seek() during an ongoing seek operation, the
    * new seek will override any pending seek.
    */
  def seek(timestamp: CLongInt): Unit =
    gtk_media_stream_seek(this.raw.asInstanceOf, gint64(timestamp))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ends a seek operation started via GtkMediaStream.seek() as a failure.
    *
    * This will not cause an error on the stream and will assume that playback
    * continues as if no seek had happened.
    *
    * See [method@Gtk.MediaStream.seek_success] for the other way of ending a
    * seek.
    */
  def seekFailed(): Unit = gtk_media_stream_seek_failed(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ends a seek operation started via GtkMediaStream.seek() successfully.
    *
    * This function will unset the GtkMediaStream:ended property if it was set.
    *
    * See [method@Gtk.MediaStream.seek_failed] for the other way of ending a
    * seek.
    */
  def seekSuccess(): Unit = gtk_media_stream_seek_success(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the stream should loop.
    *
    * In this case, it will attempt to restart playback from the beginning
    * instead of stopping at the end.
    *
    * Not all streams may support looping, in particular non-seekable streams.
    * Those streams will ignore the loop setting and just end.
    */
  def setLoop(loop: Boolean): Unit = gtk_media_stream_set_loop(
    this.raw.asInstanceOf,
    gboolean(gint((if loop == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the audio stream should be muted.
    *
    * Muting a stream will cause no audio to be played, but it does not modify
    * the volume. This means that muting and then unmuting the stream will
    * restore the volume settings.
    *
    * If the stream has no audio, calling this function will still work but it
    * will not have an audible effect.
    */
  def setMuted(muted: Boolean): Unit = gtk_media_stream_set_muted(
    this.raw.asInstanceOf,
    gboolean(gint((if muted == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts or pauses playback of the stream.
    */
  def setPlaying(playing: Boolean): Unit = gtk_media_stream_set_playing(
    this.raw.asInstanceOf,
    gboolean(gint((if playing == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the volume of the audio stream.
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
    */
  def setVolume(volume: Double): Unit =
    gtk_media_stream_set_volume(this.raw.asInstanceOf, volume)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pauses the media stream and marks it as ended.
    *
    * This is a hint only, calls to [method@Gtk.MediaStream.play] may still
    * happen.
    *
    * The media stream must be prepared when this function is called.
    */
  def streamEnded(): Unit = gtk_media_stream_stream_ended(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Called by `GtkMediaStream` implementations to advertise the stream being
    * ready to play and providing details about the stream.
    *
    * Note that the arguments are hints. If the stream implementation cannot
    * determine the correct values, it is better to err on the side of caution
    * and return %TRUE. User interfaces will use those values to determine what
    * controls to show.
    *
    * This function may not be called again until the stream has been reset via
    * [method@Gtk.MediaStream.stream_unprepared].
    */
  def streamPrepared(
      has_audio: Boolean,
      has_video: Boolean,
      seekable: Boolean,
      duration: CLongInt
  ): Unit = gtk_media_stream_stream_prepared(
    this.raw.asInstanceOf,
    gboolean(gint((if has_audio == true then 1 else 0))),
    gboolean(gint((if has_video == true then 1 else 0))),
    gboolean(gint((if seekable == true then 1 else 0))),
    gint64(duration)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Resets a given media stream implementation.
    *
    * [method@Gtk.MediaStream.stream_prepared] can then be called again.
    *
    * This function will also reset any error state the stream was in.
    */
  def streamUnprepared(): Unit = gtk_media_stream_stream_unprepared(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Same as gtk_media_stream_stream_unprepared().
    */
  def unprepared(): Unit = gtk_media_stream_unprepared(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes a previous call to gtk_media_stream_realize().
    *
    * This causes the stream to release all resources it had allocated from @surface.
    */
  def unrealize(surface: Surface): Unit = gtk_media_stream_unrealize(
    this.raw.asInstanceOf,
    surface.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Media stream implementations should regularly call this function to update
    * the timestamp reported by the stream.
    *
    * It is up to implementations to call this at the frequency they deem
    * appropriate.
    *
    * The media stream must be prepared when this function is called.
    */
  def update(timestamp: CLongInt): Unit =
    gtk_media_stream_update(this.raw.asInstanceOf, gint64(timestamp))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MediaStream
