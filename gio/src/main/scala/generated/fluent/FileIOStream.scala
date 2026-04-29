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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GFileIOStream provides io streams that both read and write to the same file
  * handle.
  *
  * GFileIOStream implements #GSeekable, which allows the io stream to jump to
  * arbitrary positions in the file and to truncate the file, provided the
  * filesystem of the file supports these operations.
  *
  * To find the position of a file io stream, use g_seekable_tell().
  *
  * To find out if a file io stream supports seeking, use g_seekable_can_seek().
  * To position a file io stream, use g_seekable_seek(). To find out if a file
  * io stream supports truncating, use g_seekable_can_truncate(). To truncate a
  * file io stream, use g_seekable_truncate().
  *
  * The default implementation of all the #GFileIOStream operations and the
  * implementation of #GSeekable just call into the same operations on the
  * output stream.
  */
class FileIOStream(raw: Ptr[GFileIOStream])
    extends IOStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the entity tag for the file when it has been written. This must be
    * called after the stream has been written and closed, as the etag can
    * change while writing.
    */
  def getEtag()(using Zone): String = fromCString(
    g_file_io_stream_get_etag(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries a file io stream for the given @attributes. This function blocks
    * while querying the stream. For the asynchronous version of this function,
    * see g_file_io_stream_query_info_async(). While the stream is blocked, the
    * stream will set the pending flag internally, and any other operations on
    * the stream will fail with %G_IO_ERROR_PENDING.
    *
    * Can fail if the stream was already closed (with @error being set to
    * %G_IO_ERROR_CLOSED), the stream has pending operations (with @error being
    * set to %G_IO_ERROR_PENDING), or if querying info is not supported for the
    * stream's interface (with @error being set to %G_IO_ERROR_NOT_SUPPORTED). I
    * all cases of failure, %NULL will be returned.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and %NULL will
    * be returned.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously queries the @stream for a #GFileInfo. When completed,
    * @callback
    *   will be called with a #GAsyncResult which can be used to finish the
    *   operation with g_file_io_stream_query_info_finish().
    *
    * For the synchronous version of this function, see
    * g_file_io_stream_query_info().
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finalizes the asynchronous query started by
    * g_file_io_stream_query_info_async().
    */
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
