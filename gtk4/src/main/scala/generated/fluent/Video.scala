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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkVideo` is a widget to show a `GtkMediaStream` with media controls.
  *
  * ![An example GtkVideo](video.png)
  *
  * The controls are available separately as [class@Gtk.MediaControls]. If you
  * just want to display a video without controls, you can treat it like any
  * other paintable and for example put it into a [class@Gtk.Picture].
  *
  * `GtkVideo` aims to cover use cases such as previews, embedded animations,
  * etc. It supports autoplay, looping, and simple media controls. It does not
  * have support for video overlays, multichannel audio, device selection, or
  * input. If you are writing a full-fledged video player, you may want to use
  * the [iface@Gdk.Paintable] API and a media framework such as Gstreamer
  * directly.
  */
class Video(raw: Ptr[GtkVideo])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if videos have been set to loop.
    */
  def getAutoplay(): Boolean =
    gtk_video_get_autoplay(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file played by @self or %NULL if not playing back a file.
    */
  def getFile(): File =
    new File.Abstract(gtk_video_get_file(this.raw.asInstanceOf).asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if videos have been set to loop.
    */
  def getLoop(): Boolean = gtk_video_get_loop(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the media stream managed by @self or %NULL if none.
    */
  def getMediaStream(): MediaStream = new MediaStream(
    gtk_video_get_media_stream(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @self automatically starts playback when it becomes visible
    * or when a new file gets loaded.
    */
  def setAutoplay(autoplay: Boolean): Unit = gtk_video_set_autoplay(
    this.raw.asInstanceOf,
    gboolean(gint((if autoplay == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @self play the given @file.
    */
  def setFile(file: File): Unit = gtk_video_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @self play the given @filename.
    *
    * This is a utility function that calls gtk_video_set_file(),
    */
  def setFilename(filename: String | CString)(using Zone): Unit =
    gtk_video_set_filename(this.raw.asInstanceOf, __sn_extract_string(filename))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether new files loaded by @self should be set to loop.
    */
  def setLoop(loop: Boolean): Unit = gtk_video_set_loop(
    this.raw.asInstanceOf,
    gboolean(gint((if loop == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the media stream to be played back.
    *
    * @self
    *   will take full control of managing the media stream. If you want to
    *   manage a media stream yourself, consider using a [class@Gtk.Picture] for
    *   display.
    *
    * If you want to display a file, consider using [method@Gtk.Video.set_file]
    * instead.
    */
  def setMediaStream(stream: MediaStream): Unit = gtk_video_set_media_stream(
    this.raw.asInstanceOf,
    stream.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @self play the resource at the given @resource_path.
    *
    * This is a utility function that calls [method@Gtk.Video.set_file].
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty `GtkVideo`.
    */
  def apply(): Video = new Video(gtk_video_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkVideo` to play back the given @file.
    */
  def forFile(file: File): Video = new Video(
    gtk_video_new_for_file(file.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkVideo` to play back the given @filename.
    *
    * This is a utility function that calls [ctor@Gtk.Video.new_for_file], See
    * that function for details.
    */
  def forFilename(filename: String | CString)(using Zone): Video = new Video(
    gtk_video_new_for_filename(__sn_extract_string(filename)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkVideo` to play back the given @stream.
    */
  def forMediaStream(stream: MediaStream): Video = new Video(
    gtk_video_new_for_media_stream(
      stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkVideo` to play back the resource at the given @resource_path.
    *
    * This is a utility function that calls [ctor@Gtk.Video.new_for_file].
    */
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
