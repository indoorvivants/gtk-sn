package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GFileIOStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gpointer

class FileIOStream(raw: Ptr[GFileIOStream])
    extends IOStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEtag()(using Zone): String = fromCString(
    g_file_io_stream_get_etag(this.raw.asInstanceOf).asInstanceOf
  )

  def queryInfo(attributes: String | CString, cancellable: Cancellable)(using
      Zone
  ): GResult[FileInfo] = GResult.wrap(__errorPtr =>
    new FileInfo(
      g_file_io_stream_query_info(
        this.raw.asInstanceOf,
        __sn_extract_string(attributes),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def queryInfoAsync(
      attributes: String | CString,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_file_io_stream_query_info_async(
    this.raw.asInstanceOf,
    __sn_extract_string(attributes),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def queryInfoFinish(result: AsyncResult): GResult[FileInfo] =
    GResult.wrap(__errorPtr =>
      new FileInfo(
        g_file_io_stream_query_info_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FileIOStream
