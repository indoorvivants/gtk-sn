package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gtk4.fluent.MediaStream
import sn.gnome.gtk4.internal.GtkMediaFile

class MediaFile(raw: Ptr[GtkMediaFile])
    extends MediaStream(raw.asInstanceOf),
      Paintable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clear(): Unit = gtk_media_file_clear(this.raw.asInstanceOf)

  def getFile(): File = new File.Abstract(
    gtk_media_file_get_file(this.raw.asInstanceOf).asInstanceOf
  )

  def getInputStream(): InputStream = new InputStream(
    gtk_media_file_get_input_stream(this.raw.asInstanceOf).asInstanceOf
  )

  def setFile(file: File): Unit = gtk_media_file_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  def setFilename(filename: String | CString)(using Zone): Unit =
    gtk_media_file_set_filename(
      this.raw.asInstanceOf,
      __sn_extract_string(filename)
    )

  def setInputStream(stream: InputStream): Unit =
    gtk_media_file_set_input_stream(
      this.raw.asInstanceOf,
      stream.getUnsafeRawPointer().asInstanceOf
    )

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
  def apply(): MediaFile = new MediaFile(gtk_media_file_new().asInstanceOf)
  def forFile(file: File): MediaFile = new MediaFile(
    gtk_media_file_new_for_file(
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def forFilename(filename: String | CString)(using Zone): MediaFile =
    new MediaFile(
      gtk_media_file_new_for_filename(
        __sn_extract_string(filename)
      ).asInstanceOf
    )
  def forInputStream(stream: InputStream): MediaFile = new MediaFile(
    gtk_media_file_new_for_input_stream(
      stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
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
