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
  def ended(): Unit /* None */ = gtk_media_stream_ended(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @self into an error state using a printf()-style format string.
    *
    * This is a utility function that calls [method@Gtk.MediaStream.gerror]. See
    * that function for details.
    */
  inline def error(
      domain: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */,
      code: Int /* Some(CInt) */,
      format: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_media_stream_error(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
      domain: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */,
      code: Int /* Some(CInt) */,
      format: String | CString /* Some(CString) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ = gtk_media_stream_error_valist(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
  def gerror(
      error: Ptr[GError] /* Some(Ptr[_root_.sn.gnome.glib.internal.GError]) */
  ): Unit /* None */ =
    gtk_media_stream_gerror(this.raw.asInstanceOf[Ptr[GtkMediaStream]], error)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the duration of the stream.
    *
    * If the duration is not known, 0 will be returned.
    */
  def getDuration(): CLongInt /* None */ = gtk_media_stream_get_duration(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the streams playback is finished.
    */
  def getEnded(): Boolean /* None */ = gtk_media_stream_get_ended(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

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
  def getError(): Ptr[GError] /* None */ = gtk_media_stream_get_error(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream is set to loop.
    *
    * See [method@Gtk.MediaStream.set_loop] for details.
    */
  def getLoop(): Boolean /* None */ = gtk_media_stream_get_loop(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the audio for the stream is muted.
    *
    * See [method@Gtk.MediaStream.set_muted] for details.
    */
  def getMuted(): Boolean /* None */ = gtk_media_stream_get_muted(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return whether the stream is currently playing.
    */
  def getPlaying(): Boolean /* None */ = gtk_media_stream_get_playing(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current presentation timestamp in microseconds.
    */
  def getTimestamp(): CLongInt /* None */ = gtk_media_stream_get_timestamp(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the volume of the audio for the stream.
    *
    * See [method@Gtk.MediaStream.set_volume] for details.
    */
  def getVolume(): Double /* None */ = gtk_media_stream_get_volume(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream has audio.
    */
  def hasAudio(): Boolean /* None */ = gtk_media_stream_has_audio(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream has video.
    */
  def hasVideo(): Boolean /* None */ = gtk_media_stream_has_video(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the stream has finished initializing.
    *
    * At this point the existence of audio and video is known.
    */
  def isPrepared(): Boolean /* None */ = gtk_media_stream_is_prepared(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

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
  def isSeekable(): Boolean /* None */ = gtk_media_stream_is_seekable(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if there is currently a seek operation going on.
    */
  def isSeeking(): Boolean /* None */ = gtk_media_stream_is_seeking(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pauses playback of the stream.
    *
    * If the stream is not playing, do nothing.
    */
  def pause(): Unit /* None */ = gtk_media_stream_pause(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts playing the stream.
    *
    * If the stream is in error or already playing, do nothing.
    */
  def play(): Unit /* None */ = gtk_media_stream_play(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Same as gtk_media_stream_stream_prepared().
    */
  def prepared(
      has_audio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      has_video: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      seekable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      duration: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ = gtk_media_stream_prepared(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
  def realize(
      surface: Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  ): Unit /* None */ = gtk_media_stream_realize(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
  def seek(
      timestamp: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ = gtk_media_stream_seek(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
    gint64(timestamp)
  )

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
  def seekFailed(): Unit /* None */ = gtk_media_stream_seek_failed(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ends a seek operation started via GtkMediaStream.seek() successfully.
    *
    * This function will unset the GtkMediaStream:ended property if it was set.
    *
    * See [method@Gtk.MediaStream.seek_failed] for the other way of ending a
    * seek.
    */
  def seekSuccess(): Unit /* None */ = gtk_media_stream_seek_success(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

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
  def setLoop(
      loop: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_media_stream_set_loop(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
  def setMuted(
      muted: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_media_stream_set_muted(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
    gboolean(gint((if muted == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts or pauses playback of the stream.
    */
  def setPlaying(
      playing: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_media_stream_set_playing(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
  def setVolume(volume: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_media_stream_set_volume(
      this.raw.asInstanceOf[Ptr[GtkMediaStream]],
      volume
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pauses the media stream and marks it as ended.
    *
    * This is a hint only, calls to [method@Gtk.MediaStream.play] may still
    * happen.
    *
    * The media stream must be prepared when this function is called.
    */
  def streamEnded(): Unit /* None */ = gtk_media_stream_stream_ended(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

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
      has_audio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      has_video: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      seekable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      duration: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ = gtk_media_stream_stream_prepared(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
  def streamUnprepared(): Unit /* None */ = gtk_media_stream_stream_unprepared(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Same as gtk_media_stream_stream_unprepared().
    */
  def unprepared(): Unit /* None */ = gtk_media_stream_unprepared(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes a previous call to gtk_media_stream_realize().
    *
    * This causes the stream to release all resources it had allocated from @surface.
    */
  def unrealize(
      surface: Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  ): Unit /* None */ = gtk_media_stream_unrealize(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
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
  def update(
      timestamp: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ = gtk_media_stream_update(
    this.raw.asInstanceOf[Ptr[GtkMediaStream]],
    gint64(timestamp)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MediaStream
