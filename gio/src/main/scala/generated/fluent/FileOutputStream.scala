package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AsyncResult, Cancellable, FileInfo, OutputStream, Seekable}
import sn.gnome.gio.internal.GFileOutputStream
import sn.gnome.glib.GResult
import sn.gnome.gobject.runtime.*

/** GFileOutputStream provides output streams that write their content to a
  * file.
  *
  * GFileOutputStream implements #GSeekable, which allows the output stream to
  * jump to arbitrary positions in the file and to truncate the file, provided
  * the filesystem of the file supports these operations.
  *
  * To find the position of a file output stream, use g_seekable_tell(). To find
  * out if a file output stream supports seeking, use g_seekable_can_seek().To
  * position a file output stream, use g_seekable_seek(). To find out if a file
  * output stream supports truncating, use g_seekable_can_truncate(). To
  * truncate a file output stream, use g_seekable_truncate().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileOutputStream private[gnome] (raw: Ptr[GFileOutputStream])
    extends OutputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the entity tag for the file when it has been written. This must be
    * called after the stream has been written and closed, as the etag can
    * change while writing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEtag(): String /* None */ =
    fromCString(
      g_file_output_stream_get_etag(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileOutputStream]]
      ).asInstanceOf
    )
  end getEtag

  /** Queries a file output stream for the given @attributes. This function
    * blocks while querying the stream. For the asynchronous version of this
    * function, see g_file_output_stream_query_info_async(). While the stream is
    * blocked, the stream will set the pending flag internally, and any other
    * operations on the stream will fail with %G_IO_ERROR_PENDING.
    *
    * Can fail if the stream was already closed (with @error being set to
    * %G_IO_ERROR_CLOSED), the stream has pending operations (with @error being
    * set to %G_IO_ERROR_PENDING), or if querying info is not supported for the
    * stream's interface (with @error being set to %G_IO_ERROR_NOT_SUPPORTED).
    * In all cases of failure, %NULL will be returned.
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
      attributes: String /* Some(CString) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInfo.applyUnsafe(
        g_file_output_stream_query_info(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileOutputStream]],
          summon[Runtime].inZone(toCString(attributes)),
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryInfo

  /** Asynchronously queries the @stream for a #GFileInfo. When completed,
    * @callback
    *   will be called with a #GAsyncResult which can be used to finish the
    *   operation with g_file_output_stream_query_info_finish().
    *
    * For the synchronous version of this function, see
    * g_file_output_stream_query_info().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def queryInfoAsync__ = ???

  /** Finalizes the asynchronous query started by
    * g_file_output_stream_query_info_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryInfoFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInfo.applyUnsafe(
        g_file_output_stream_query_info_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileOutputStream]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryInfoFinish

end FileOutputStream

object FileOutputStream:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GFileOutputStream])(using Runtime) =
    summon[Runtime].getOrCreate[FileOutputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FileOutputStream(ptr)
    )

end FileOutputStream
