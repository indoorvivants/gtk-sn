package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  AsyncResult,
  Cancellable,
  FileInfo,
  IOStream,
  Seekable
}
import sn.gnome.gio.internal.GFileIOStream
import sn.gnome.glib.fluent.GResult

/** GFileIOStream provides io streams that both read and write to the same file
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileIOStream(raw: Ptr[GFileIOStream])
    extends IOStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the entity tag for the file when it has been written. This must be
    * called after the stream has been written and closed, as the etag can
    * change while writing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEtag()(using Zone): String /* None */ = fromCString(
    g_file_io_stream_get_etag(
      this.raw.asInstanceOf[Ptr[GFileIOStream]]
    ).asInstanceOf
  )

  /** Queries a file io stream for the given @attributes. This function blocks
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryInfo(
      attributes: String | CString /* Some(CString) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[FileInfo /* None */ ] = GResult.wrap(__errorPtr =>
    new FileInfo(
      g_file_io_stream_query_info(
        this.raw.asInstanceOf[Ptr[GFileIOStream]],
        __sn_extract_string(attributes),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Asynchronously queries the @stream for a #GFileInfo. When completed,
    * @callback
    *   will be called with a #GAsyncResult which can be used to finish the
    *   operation with g_file_io_stream_query_info_finish().
    *
    * For the synchronous version of this function, see
    * g_file_io_stream_query_info().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def queryInfoAsync__ = ???

  /** Finalizes the asynchronous query started by
    * g_file_io_stream_query_info_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryInfoFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[FileInfo /* None */ ] = GResult.wrap(__errorPtr =>
    new FileInfo(
      g_file_io_stream_query_info_finish(
        this.raw.asInstanceOf[Ptr[GFileIOStream]],
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
