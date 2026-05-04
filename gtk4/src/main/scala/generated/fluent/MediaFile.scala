package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gio.fluent.{File, InputStream}
import sn.gnome.gtk4.fluent.MediaStream
import sn.gnome.gtk4.internal.GtkMediaFile

/** `GtkMediaFile` implements `GtkMediaStream` for files.
  *
  * This provides a simple way to play back video files with GTK.
  *
  * GTK provides a GIO extension point for `GtkMediaFile` implementations to
  * allow for external implementations using various media frameworks.
  *
  * GTK itself includes implementations using GStreamer and ffmpeg.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MediaFile(raw: Ptr[GtkMediaFile])
    extends MediaStream(raw.asInstanceOf),
      Paintable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Resets the media file to be empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ = gtk_media_file_clear(
    this.raw.asInstanceOf[Ptr[GtkMediaFile]]
  )

  /** Returns the file that @self is currently playing from.
    *
    * When @self is not playing or not playing from a file, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): File /* None */ = new File.Abstract(
    gtk_media_file_get_file(
      this.raw.asInstanceOf[Ptr[GtkMediaFile]]
    ).asInstanceOf
  )

  /** Returns the stream that @self is currently playing from.
    *
    * When @self is not playing or not playing from a stream, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputStream(): InputStream /* None */ = new InputStream(
    gtk_media_file_get_input_stream(
      this.raw.asInstanceOf[Ptr[GtkMediaFile]]
    ).asInstanceOf
  )

  /** Sets the `GtkMediaFile` to play the given file.
    *
    * If any file is still playing, stop playing it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ = gtk_media_file_set_file(
    this.raw.asInstanceOf[Ptr[GtkMediaFile]],
    file
      .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
  )

  /** Sets the `GtkMediaFile to play the given file.
    *
    * This is a utility function that converts the given @filename to a `GFile`
    * and calls [method@Gtk.MediaFile.set_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFilename(
      filename: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_media_file_set_filename(
    this.raw.asInstanceOf[Ptr[GtkMediaFile]],
    filename
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the `GtkMediaFile` to play the given stream.
    *
    * If anything is still playing, stop playing it.
    *
    * Full control about the @stream is assumed for the duration of playback.
    * The stream will not be closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInputStream(
      stream: Option[
        InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */
      ]
  ): Unit /* None */ = gtk_media_file_set_input_stream(
    this.raw.asInstanceOf[Ptr[GtkMediaFile]],
    stream
      .map[Ptr[_root_.sn.gnome.gio.internal.GInputStream]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GInputStream]]
      )
  )

  /** Sets the `GtkMediaFile to play the given resource.
    *
    * This is a utility function that converts the given @resource_path to a
    * `GFile` and calls [method@Gtk.MediaFile.set_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResource(
      resource_path: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_media_file_set_resource(
    this.raw.asInstanceOf[Ptr[GtkMediaFile]],
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
end MediaFile

object MediaFile:
  /** Creates a new empty media file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): MediaFile = new MediaFile(gtk_media_file_new().asInstanceOf)

  /** Creates a new media file to play @file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forFile(
      file: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  ): MediaFile = new MediaFile(
    gtk_media_file_new_for_file(
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Creates a new media file for the given filename.
    *
    * This is a utility function that converts the given @filename to a `GFile`
    * and calls [ctor@Gtk.MediaFile.new_for_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forFilename(
      filename: String | CString /* Some(CString) */
  )(using Zone): MediaFile = new MediaFile(
    gtk_media_file_new_for_filename(__sn_extract_string(filename)).asInstanceOf
  )

  /** Creates a new media file to play @stream.
    *
    * If you want the resulting media to be seekable, the stream should
    * implement the `GSeekable` interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forInputStream(
      stream: InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */
  ): MediaFile = new MediaFile(
    gtk_media_file_new_for_input_stream(
      stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Creates a new new media file for the given resource.
    *
    * This is a utility function that converts the given @resource to a `GFile`
    * and calls [ctor@Gtk.MediaFile.new_for_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forResource(
      resource_path: String | CString /* Some(CString) */
  )(using Zone): MediaFile = new MediaFile(
    gtk_media_file_new_for_resource(
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
end MediaFile
