package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  MediaStream,
  Widget
}
import sn.gnome.gtk4.internal.GtkVideo

/** `GtkVideo` is a widget to show a `GtkMediaStream` with media controls.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Video(raw: Ptr[GtkVideo])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns %TRUE if videos have been set to loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutoplay(): Boolean /* None */ =
    gtk_video_get_autoplay(this.raw.asInstanceOf[Ptr[GtkVideo]]).value.!=(0)

  /** Gets the file played by @self or %NULL if not playing back a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): File /* None */ = new File.Abstract(
    gtk_video_get_file(this.raw.asInstanceOf[Ptr[GtkVideo]]).asInstanceOf
  )

  /** Returns %TRUE if videos have been set to loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLoop(): Boolean /* None */ =
    gtk_video_get_loop(this.raw.asInstanceOf[Ptr[GtkVideo]]).value.!=(0)

  /** Gets the media stream managed by @self or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMediaStream(): MediaStream /* None */ = new MediaStream(
    gtk_video_get_media_stream(
      this.raw.asInstanceOf[Ptr[GtkVideo]]
    ).asInstanceOf
  )

  /** Sets whether @self automatically starts playback when it becomes visible
    * or when a new file gets loaded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutoplay(
      autoplay: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_video_set_autoplay(
    this.raw.asInstanceOf[Ptr[GtkVideo]],
    gboolean(gint((if autoplay == true then 1 else 0)))
  )

  /** Makes @self play the given @file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ = gtk_video_set_file(
    this.raw.asInstanceOf[Ptr[GtkVideo]],
    file
      .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
  )

  /** Makes @self play the given @filename.
    *
    * This is a utility function that calls gtk_video_set_file(),
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFilename(
      filename: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_video_set_filename(
    this.raw.asInstanceOf[Ptr[GtkVideo]],
    filename
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets whether new files loaded by @self should be set to loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLoop(
      loop: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_video_set_loop(
    this.raw.asInstanceOf[Ptr[GtkVideo]],
    gboolean(gint((if loop == true then 1 else 0)))
  )

  /** Sets the media stream to be played back.
    *
    * @self
    *   will take full control of managing the media stream. If you want to
    *   manage a media stream yourself, consider using a [class@Gtk.Picture] for
    *   display.
    *
    * If you want to display a file, consider using [method@Gtk.Video.set_file]
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMediaStream(
      stream: Option[MediaStream /* Some(Ptr[GtkMediaStream]) */ ]
  ): Unit /* None */ = gtk_video_set_media_stream(
    this.raw.asInstanceOf[Ptr[GtkVideo]],
    stream
      .map[Ptr[GtkMediaStream]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkMediaStream]])
  )

  /** Makes @self play the resource at the given @resource_path.
    *
    * This is a utility function that calls [method@Gtk.Video.set_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResource(
      resource_path: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_video_set_resource(
    this.raw.asInstanceOf[Ptr[GtkVideo]],
    resource_path
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
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
  /** Creates a new empty `GtkVideo`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Video =
    val raw: Ptr[Byte] = gtk_video_new().asInstanceOf
    summon[Runtime].getOrCreate[Video](raw, r => new Video(r.asInstanceOf))
  end apply

  /** Creates a `GtkVideo` to play back the given @file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  )(using Runtime): Video =
    val raw: Ptr[Byte] = gtk_video_new_for_file(
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[Video](raw, r => new Video(r.asInstanceOf))
  end forFile

  /** Creates a `GtkVideo` to play back the given @filename.
    *
    * This is a utility function that calls [ctor@Gtk.Video.new_for_file], See
    * that function for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forFilename(filename: Option[String | CString /* Some(CString) */ ])(using
      Zone
  )(using Runtime): Video =
    val raw: Ptr[Byte] = gtk_video_new_for_filename(
      filename
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime].getOrCreate[Video](raw, r => new Video(r.asInstanceOf))
  end forFilename

  /** Creates a `GtkVideo` to play back the given @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forMediaStream(
      stream: Option[MediaStream /* Some(Ptr[GtkMediaStream]) */ ]
  )(using Runtime): Video =
    val raw: Ptr[Byte] = gtk_video_new_for_media_stream(
      stream
        .map[Ptr[GtkMediaStream]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkMediaStream]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[Video](raw, r => new Video(r.asInstanceOf))
  end forMediaStream

  /** Creates a `GtkVideo` to play back the resource at the given @resource_path.
    *
    * This is a utility function that calls [ctor@Gtk.Video.new_for_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forResource(resource_path: Option[String | CString /* Some(CString) */ ])(
      using Zone
  )(using Runtime): Video =
    val raw: Ptr[Byte] = gtk_video_new_for_resource(
      resource_path
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime].getOrCreate[Video](raw, r => new Video(r.asInstanceOf))
  end forResource

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Video
