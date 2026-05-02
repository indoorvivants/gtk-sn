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
  def queryInfo(
      attributes: String | CString /* Some(CString) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[FileInfo /* None */ ] = GResult.wrap(__errorPtr =>
    new FileInfo(
      g_file_input_stream_query_info(
        this.raw.asInstanceOf[Ptr[GFileInputStream]],
        __sn_extract_string(attributes),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
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
      attributes: String | CString /* Some(CString) */,
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ = g_file_input_stream_query_info_async(
    this.raw.asInstanceOf[Ptr[GFileInputStream]],
    __sn_extract_string(attributes),
    io_priority,
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous info query operation.
    */
  def queryInfoFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[FileInfo /* None */ ] = GResult.wrap(__errorPtr =>
    new FileInfo(
      g_file_input_stream_query_info_finish(
        this.raw.asInstanceOf[Ptr[GFileInputStream]],
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
