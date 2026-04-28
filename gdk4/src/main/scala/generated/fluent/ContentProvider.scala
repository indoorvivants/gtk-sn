package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkContentProvider
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

class ContentProvider(raw: Ptr[GdkContentProvider])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def contentChanged(): Unit = gdk_content_provider_content_changed(
    this.raw.asInstanceOf
  )

  // Method get_value contains an OUT parameter, which is not supported yet

  def refFormats(): Ptr[GdkContentFormats] = gdk_content_provider_ref_formats(
    this.raw.asInstanceOf
  )

  def refStorableFormats(): Ptr[GdkContentFormats] =
    gdk_content_provider_ref_storable_formats(this.raw.asInstanceOf)

  def writeMimeTypeAsync(
      mime_type: String | CString,
      stream: OutputStream,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = gdk_content_provider_write_mime_type_async(
    this.raw.asInstanceOf,
    __sn_extract_string(mime_type),
    stream.getUnsafeRawPointer().asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def writeMimeTypeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gdk_content_provider_write_mime_type_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ContentProvider

object ContentProvider:
  def forBytes(mime_type: String | CString, bytes: Ptr[GBytes])(using
      Zone
  ): ContentProvider = new ContentProvider(
    gdk_content_provider_new_for_bytes(
      __sn_extract_string(mime_type),
      bytes
    ).asInstanceOf
  )
  def forValue(value: Ptr[GValue]): ContentProvider = new ContentProvider(
    gdk_content_provider_new_for_value(value).asInstanceOf
  )
  inline def typed(`type`: GType, args: Any*): ContentProvider =
    new ContentProvider(
      gdk_content_provider_new_typed(`type`, args*).asInstanceOf
    )
  // constructor new_union contains an array parameter, which is not supported yet

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ContentProvider
