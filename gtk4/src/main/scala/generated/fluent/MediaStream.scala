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

class MediaStream(raw: Ptr[GtkMediaStream])
    extends Object(raw.asInstanceOf),
      Paintable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def ended(): Unit = gtk_media_stream_ended(this.raw.asInstanceOf)

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

  def gerror(error: Ptr[GError]): Unit =
    gtk_media_stream_gerror(this.raw.asInstanceOf, error)

  def getDuration(): CLongInt = gtk_media_stream_get_duration(
    this.raw.asInstanceOf
  ).value

  def getEnded(): Boolean =
    gtk_media_stream_get_ended(this.raw.asInstanceOf).value.!=(0)

  def getError(): Ptr[GError] = gtk_media_stream_get_error(
    this.raw.asInstanceOf
  )

  def getLoop(): Boolean =
    gtk_media_stream_get_loop(this.raw.asInstanceOf).value.!=(0)

  def getMuted(): Boolean =
    gtk_media_stream_get_muted(this.raw.asInstanceOf).value.!=(0)

  def getPlaying(): Boolean =
    gtk_media_stream_get_playing(this.raw.asInstanceOf).value.!=(0)

  def getTimestamp(): CLongInt = gtk_media_stream_get_timestamp(
    this.raw.asInstanceOf
  ).value

  def getVolume(): Double = gtk_media_stream_get_volume(this.raw.asInstanceOf)

  def hasAudio(): Boolean =
    gtk_media_stream_has_audio(this.raw.asInstanceOf).value.!=(0)

  def hasVideo(): Boolean =
    gtk_media_stream_has_video(this.raw.asInstanceOf).value.!=(0)

  def isPrepared(): Boolean =
    gtk_media_stream_is_prepared(this.raw.asInstanceOf).value.!=(0)

  def isSeekable(): Boolean =
    gtk_media_stream_is_seekable(this.raw.asInstanceOf).value.!=(0)

  def isSeeking(): Boolean =
    gtk_media_stream_is_seeking(this.raw.asInstanceOf).value.!=(0)

  def pause(): Unit = gtk_media_stream_pause(this.raw.asInstanceOf)

  def play(): Unit = gtk_media_stream_play(this.raw.asInstanceOf)

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

  def realize(surface: Surface): Unit = gtk_media_stream_realize(
    this.raw.asInstanceOf,
    surface.getUnsafeRawPointer().asInstanceOf
  )

  def seek(timestamp: CLongInt): Unit =
    gtk_media_stream_seek(this.raw.asInstanceOf, gint64(timestamp))

  def seekFailed(): Unit = gtk_media_stream_seek_failed(this.raw.asInstanceOf)

  def seekSuccess(): Unit = gtk_media_stream_seek_success(this.raw.asInstanceOf)

  def setLoop(loop: Boolean): Unit = gtk_media_stream_set_loop(
    this.raw.asInstanceOf,
    gboolean(gint((if loop == true then 1 else 0)))
  )

  def setMuted(muted: Boolean): Unit = gtk_media_stream_set_muted(
    this.raw.asInstanceOf,
    gboolean(gint((if muted == true then 1 else 0)))
  )

  def setPlaying(playing: Boolean): Unit = gtk_media_stream_set_playing(
    this.raw.asInstanceOf,
    gboolean(gint((if playing == true then 1 else 0)))
  )

  def setVolume(volume: Double): Unit =
    gtk_media_stream_set_volume(this.raw.asInstanceOf, volume)

  def streamEnded(): Unit = gtk_media_stream_stream_ended(this.raw.asInstanceOf)

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

  def streamUnprepared(): Unit = gtk_media_stream_stream_unprepared(
    this.raw.asInstanceOf
  )

  def unprepared(): Unit = gtk_media_stream_unprepared(this.raw.asInstanceOf)

  def unrealize(surface: Surface): Unit = gtk_media_stream_unrealize(
    this.raw.asInstanceOf,
    surface.getUnsafeRawPointer().asInstanceOf
  )

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
