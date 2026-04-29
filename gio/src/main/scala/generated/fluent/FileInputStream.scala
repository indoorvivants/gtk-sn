package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GFileInputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gpointer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GFileInputStream provides input streams that take their content from a file.
  *
  * GFileInputStream implements #GSeekable, which allows the input stream to
  * jump to arbitrary positions in the file, provided the filesystem of the file
  * allows it. To find the position of a file input stream, use
  * g_seekable_tell(). To find out if a file input stream supports seeking, use
  * g_seekable_can_seek(). To position a file input stream, use
  * g_seekable_seek().
  */
class FileInputStream(raw: Ptr[GFileInputStream])
    extends InputStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries a file input stream the given @attributes. This function blocks
    * while querying the stream. For the asynchronous (non-blocking) version of
    * this function, see g_file_input_stream_query_info_async(). While the
    * stream is blocked, the stream will set the pending flag internally, and
    * any other operations on the stream will fail with %G_IO_ERROR_PENDING.
    */
  def queryInfo(attributes: String | CString, cancellable: Cancellable)(using
      Zone
  ): GResult[FileInfo] = GResult.wrap(__errorPtr =>
    new FileInfo(
      g_file_input_stream_query_info(
        this.raw.asInstanceOf,
        __sn_extract_string(attributes),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the stream information asynchronously. When the operation is
    * finished @callback will be called. You can then call
    * g_file_input_stream_query_info_finish() to get the result of the
    * operation.
    *
    * For the synchronous version of this function, see
    * g_file_input_stream_query_info().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be set
    */
  def queryInfoAsync(
      attributes: String | CString,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_file_input_stream_query_info_async(
    this.raw.asInstanceOf,
    __sn_extract_string(attributes),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous info query operation.
    */
  def queryInfoFinish(result: AsyncResult): GResult[FileInfo] =
    GResult.wrap(__errorPtr =>
      new FileInfo(
        g_file_input_stream_query_info_finish(
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
end FileInputStream
