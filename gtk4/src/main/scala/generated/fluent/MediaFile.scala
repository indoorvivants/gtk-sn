package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Paintable
import sn.gnome.gio.{File, InputStream}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.MediaStream
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
class MediaFile private[gnome] (raw: Ptr[GtkMediaFile])
    extends MediaStream(raw.asInstanceOf),
      Paintable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Resets the media file to be empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    gtk_media_file_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaFile]]
    )
  end clear

  /** Returns the file that @self is currently playing from.
    *
    * When @self is not playing or not playing from a file, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): sn.gnome.gio.File /* None */ =
    new File.Abstract(
      gtk_media_file_get_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaFile]]
      ).asInstanceOf
    )
  end getFile

  /** Returns the stream that @self is currently playing from.
    *
    * When @self is not playing or not playing from a stream, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputStream()(using Runtime): sn.gnome.gio.InputStream /* None */ =
    sn.gnome.gio.InputStream.applyUnsafe(
      gtk_media_file_get_input_stream(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaFile]]
      ).asInstanceOf
    )
  end getInputStream

  /** Sets the `GtkMediaFile` to play the given file.
    *
    * If any file is still playing, stop playing it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFile(
      file: Option[
        sn.gnome.gio.File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
      ]
  ): Unit /* None */ =
    gtk_media_file_set_file(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaFile]],
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    )
  end setFile

  /** Sets the `GtkMediaFile to play the given file.
    *
    * This is a utility function that converts the given @filename to a `GFile`
    * and calls [method@Gtk.MediaFile.set_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFilename(filename: Option[scala.Predef.String /* Some(CString) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_media_file_set_filename(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaFile]],
      filename
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setFilename

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
        sn.gnome.gio.InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_media_file_set_input_stream(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaFile]],
      stream
        .map[Ptr[_root_.sn.gnome.gio.internal.GInputStream]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GInputStream]]
        )
    )
  end setInputStream

  /** Sets the `GtkMediaFile to play the given resource.
    *
    * This is a utility function that converts the given @resource_path to a
    * `GFile` and calls [method@Gtk.MediaFile.set_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResource(
      resource_path: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_media_file_set_resource(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaFile]],
      resource_path
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setResource

end MediaFile

object MediaFile:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMediaFile])(using Runtime) =
    summon[Runtime].getOrCreate[MediaFile](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MediaFile(ptr)
    )

  /** Creates a new empty media file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): MediaFile =
    val raw: Ptr[Byte] = gtk_media_file_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[MediaFile](raw, r => MediaFile.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new media file to play @file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forFile(
      file: sn.gnome.gio.File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  )(using Runtime): MediaFile =
    val raw: Ptr[Byte] = gtk_media_file_new_for_file(
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MediaFile](raw, r => MediaFile.applyUnsafe(r.asInstanceOf))
  end forFile

  /** Creates a new media file for the given filename.
    *
    * This is a utility function that converts the given @filename to a `GFile`
    * and calls [ctor@Gtk.MediaFile.new_for_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forFilename(filename: scala.Predef.String /* Some(CString) */ )(using
      Runtime
  ): MediaFile =
    val raw: Ptr[Byte] = gtk_media_file_new_for_filename(
      summon[Runtime].inZone(toCString(filename))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MediaFile](raw, r => MediaFile.applyUnsafe(r.asInstanceOf))
  end forFilename

  /** Creates a new media file to play @stream.
    *
    * If you want the resulting media to be seekable, the stream should
    * implement the `GSeekable` interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forInputStream(
      stream: sn.gnome.gio.InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */
  )(using Runtime): MediaFile =
    val raw: Ptr[Byte] = gtk_media_file_new_for_input_stream(
      stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MediaFile](raw, r => MediaFile.applyUnsafe(r.asInstanceOf))
  end forInputStream

  /** Creates a new new media file for the given resource.
    *
    * This is a utility function that converts the given @resource to a `GFile`
    * and calls [ctor@Gtk.MediaFile.new_for_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forResource(resource_path: scala.Predef.String /* Some(CString) */ )(using
      Runtime
  ): MediaFile =
    val raw: Ptr[Byte] = gtk_media_file_new_for_resource(
      summon[Runtime].inZone(toCString(resource_path))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MediaFile](raw, r => MediaFile.applyUnsafe(r.asInstanceOf))
  end forResource
end MediaFile
