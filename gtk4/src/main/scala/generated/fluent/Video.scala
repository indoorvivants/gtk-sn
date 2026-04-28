package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.MediaStream
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkVideo

class Video(raw: Ptr[GtkVideo])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAutoplay(): Boolean =
    gtk_video_get_autoplay(this.raw.asInstanceOf).value.!=(0)

  def getFile(): File =
    new File.Abstract(gtk_video_get_file(this.raw.asInstanceOf).asInstanceOf)

  def getLoop(): Boolean = gtk_video_get_loop(this.raw.asInstanceOf).value.!=(0)

  def getMediaStream(): MediaStream = new MediaStream(
    gtk_video_get_media_stream(this.raw.asInstanceOf).asInstanceOf
  )

  def setAutoplay(autoplay: Boolean): Unit = gtk_video_set_autoplay(
    this.raw.asInstanceOf,
    gboolean(gint((if autoplay == true then 1 else 0)))
  )

  def setFile(file: File): Unit = gtk_video_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  def setFilename(filename: String | CString)(using Zone): Unit =
    gtk_video_set_filename(this.raw.asInstanceOf, __sn_extract_string(filename))

  def setLoop(loop: Boolean): Unit = gtk_video_set_loop(
    this.raw.asInstanceOf,
    gboolean(gint((if loop == true then 1 else 0)))
  )

  def setMediaStream(stream: MediaStream): Unit = gtk_video_set_media_stream(
    this.raw.asInstanceOf,
    stream.getUnsafeRawPointer().asInstanceOf
  )

  def setResource(resource_path: String | CString)(using Zone): Unit =
    gtk_video_set_resource(
      this.raw.asInstanceOf,
      __sn_extract_string(resource_path)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Video

object Video:
  def apply(): Video = new Video(gtk_video_new().asInstanceOf)
  def forFile(file: File): Video = new Video(
    gtk_video_new_for_file(file.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
  def forFilename(filename: String | CString)(using Zone): Video = new Video(
    gtk_video_new_for_filename(__sn_extract_string(filename)).asInstanceOf
  )
  def forMediaStream(stream: MediaStream): Video = new Video(
    gtk_video_new_for_media_stream(
      stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def forResource(resource_path: String | CString)(using Zone): Video =
    new Video(
      gtk_video_new_for_resource(
        __sn_extract_string(resource_path)
      ).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Video
