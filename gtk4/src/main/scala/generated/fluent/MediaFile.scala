package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gtk4.fluent.MediaStream
import sn.gnome.gtk4.internal.GtkMediaFile

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkMediaFile` implements `GtkMediaStream` for files.
  *
  * This provides a simple way to play back video files with GTK.
  *
  * GTK provides a GIO extension point for `GtkMediaFile` implementations to
  * allow for external implementations using various media frameworks.
  *
  * GTK itself includes implementations using GStreamer and ffmpeg.
  */
class MediaFile(raw: Ptr[GtkMediaFile])
    extends MediaStream(raw.asInstanceOf),
      Paintable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Resets the media file to be empty.
    */
  def clear(): Unit = gtk_media_file_clear(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the file that @self is currently playing from.
    *
    * When @self is not playing or not playing from a file, %NULL is returned.
    */
  def getFile(): File = new File.Abstract(
    gtk_media_file_get_file(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the stream that @self is currently playing from.
    *
    * When @self is not playing or not playing from a stream, %NULL is returned.
    */
  def getInputStream(): InputStream = new InputStream(
    gtk_media_file_get_input_stream(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkMediaFile` to play the given file.
    *
    * If any file is still playing, stop playing it.
    */
  def setFile(file: File): Unit = gtk_media_file_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkMediaFile to play the given file.
    *
    * This is a utility function that converts the given @filename to a `GFile`
    * and calls [method@Gtk.MediaFile.set_file].
    */
  def setFilename(filename: String | CString)(using Zone): Unit =
    gtk_media_file_set_filename(
      this.raw.asInstanceOf,
      __sn_extract_string(filename)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkMediaFile` to play the given stream.
    *
    * If anything is still playing, stop playing it.
    *
    * Full control about the @stream is assumed for the duration of playback.
    * The stream will not be closed.
    */
  def setInputStream(stream: InputStream): Unit =
    gtk_media_file_set_input_stream(
      this.raw.asInstanceOf,
      stream.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkMediaFile to play the given resource.
    *
    * This is a utility function that converts the given @resource_path to a
    * `GFile` and calls [method@Gtk.MediaFile.set_file].
    */
  def setResource(resource_path: String | CString)(using Zone): Unit =
    gtk_media_file_set_resource(
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
end MediaFile

object MediaFile:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty media file.
    */
  def apply(): MediaFile = new MediaFile(gtk_media_file_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new media file to play @file.
    */
  def forFile(file: File): MediaFile = new MediaFile(
    gtk_media_file_new_for_file(
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new media file for the given filename.
    *
    * This is a utility function that converts the given @filename to a `GFile`
    * and calls [ctor@Gtk.MediaFile.new_for_file].
    */
  def forFilename(filename: String | CString)(using Zone): MediaFile =
    new MediaFile(
      gtk_media_file_new_for_filename(
        __sn_extract_string(filename)
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new media file to play @stream.
    *
    * If you want the resulting media to be seekable, the stream should
    * implement the `GSeekable` interface.
    */
  def forInputStream(stream: InputStream): MediaFile = new MediaFile(
    gtk_media_file_new_for_input_stream(
      stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new new media file for the given resource.
    *
    * This is a utility function that converts the given @resource to a `GFile`
    * and calls [ctor@Gtk.MediaFile.new_for_file].
    */
  def forResource(resource_path: String | CString)(using Zone): MediaFile =
    new MediaFile(
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
