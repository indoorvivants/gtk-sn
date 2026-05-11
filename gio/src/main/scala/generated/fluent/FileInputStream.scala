package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  AsyncResult,
  Cancellable,
  FileInfo,
  InputStream,
  Seekable
}
import sn.gnome.gio.internal.GFileInputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.gobject.runtime.*

/** GFileInputStream provides input streams that take their content from a file.
  *
  * GFileInputStream implements #GSeekable, which allows the input stream to
  * jump to arbitrary positions in the file, provided the filesystem of the file
  * allows it. To find the position of a file input stream, use
  * g_seekable_tell(). To find out if a file input stream supports seeking, use
  * g_seekable_can_seek(). To position a file input stream, use
  * g_seekable_seek().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileInputStream private[gnome] (raw: Ptr[GFileInputStream])
    extends InputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Queries a file input stream the given @attributes. This function blocks
    * while querying the stream. For the asynchronous (non-blocking) version of
    * this function, see g_file_input_stream_query_info_async(). While the
    * stream is blocked, the stream will set the pending flag internally, and
    * any other operations on the stream will fail with %G_IO_ERROR_PENDING.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryInfo(
      attributes: String /* Some(CString) */,
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Zone, Runtime): GResult[sn.gnome.gio.fluent.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.fluent.FileInfo.applyUnsafe(
        g_file_input_stream_query_info(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInputStream]],
          toCString(attributes),
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryInfo

  /** Queries the stream information asynchronously. When the operation is
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def queryInfoAsync__ = ???

  /** Finishes an asynchronous info query operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryInfoFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.fluent.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.fluent.FileInfo.applyUnsafe(
        g_file_input_stream_query_info_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInputStream]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryInfoFinish

end FileInputStream

object FileInputStream:
  def applyUnsafe(ptr: Ptr[GFileInputStream])(using Runtime) =
    summon[Runtime].getOrCreate[FileInputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FileInputStream(ptr)
    )

end FileInputStream
