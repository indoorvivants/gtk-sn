package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{AsyncResult, Cancellable}
import sn.gnome.gio.internal.GInputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, gsize, gssize}
import sn.gnome.gobject.fluent.Object

/** #GInputStream has functions to read from a stream (g_input_stream_read()),
  * to close a stream (g_input_stream_close()) and to skip some content
  * (g_input_stream_skip()).
  *
  * To copy the content of an input stream to an output stream without manually
  * handling the reads and writes, use g_output_stream_splice().
  *
  * See the documentation for #GIOStream for details of thread safety of
  * streaming APIs.
  *
  * All of these functions have async variants too.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InputStream(raw: Ptr[GInputStream]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Clears the pending flag on @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearPending(): Unit /* None */ = g_input_stream_clear_pending(
    this.raw.asInstanceOf[Ptr[GInputStream]]
  )

  /** Closes the stream, releasing resources related to it.
    *
    * Once the stream is closed, all other operations will return
    * %G_IO_ERROR_CLOSED. Closing a stream multiple times will not return an
    * error.
    *
    * Streams will be automatically closed when the last reference is dropped,
    * but you might want to call this function to make sure resources are
    * released as early as possible.
    *
    * Some streams might keep the backing store of the stream (e.g. a file
    * descriptor) open after the stream is closed. See the documentation for the
    * individual stream for details.
    *
    * On failure the first error that happened will be reported, but the close
    * operation will finish as much as possible. A stream that failed to close
    * will still return %G_IO_ERROR_CLOSED for all operations. Still, it is
    * important to check and report the error to the user.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    * Cancelling a close will still leave the stream closed, but some streams
    * can use a faster close that doesn't block to e.g. check errors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_input_stream_close(
      this.raw.asInstanceOf[Ptr[GInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Requests an asynchronous closes of the stream, releasing resources related
    * to it. When the operation is finished @callback will be called. You can
    * then call g_input_stream_close_finish() to get the result of the
    * operation.
    *
    * For behaviour details see g_input_stream_close().
    *
    * The asynchronous methods have a default fallback that uses threads to
    * implement asynchronicity, so they are optional for inheriting classes.
    * However, if you override one you must override all.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method close_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def closeAsync__ = ???

  /** Finishes closing a stream asynchronously, started from
    * g_input_stream_close_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def closeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_input_stream_close_finish(
      this.raw.asInstanceOf[Ptr[GInputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** Checks if an input stream has pending actions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasPending(): Boolean /* None */ = g_input_stream_has_pending(
    this.raw.asInstanceOf[Ptr[GInputStream]]
  ).value.!=(0)

  /** Checks if an input stream is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClosed(): Boolean /* None */ = g_input_stream_is_closed(
    this.raw.asInstanceOf[Ptr[GInputStream]]
  ).value.!=(0)

  /** Tries to read @count bytes from the stream into the buffer starting at
    * @buffer.
    *   Will block during this read.
    *
    * If count is zero returns zero and does nothing. A value of @count larger
    * than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
    *
    * On success, the number of bytes read into the buffer is returned. It is
    * not an error if this is not the same as the requested size, as it can
    * happen e.g. near the end of a file. Zero is returned on end of file (or if @count
    * is zero), but never otherwise.
    *
    * The returned @buffer is not a nul-terminated string, it can contain nul
    * bytes at any position, and this function doesn't nul-terminate the @buffer.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
    * operation was partially finished when the operation was cancelled the
    * partial result will be returned, without an error.
    *
    * On error -1 is returned and @error is set accordingly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read]: Method read contains an OUT parameter, which is not supported yet"
  )
  private def read__ = ???

  /** Tries to read @count bytes from the stream into the buffer starting at
    * @buffer.
    *   Will block during this read.
    *
    * This function is similar to g_input_stream_read(), except it tries to read
    * as many bytes as requested, only stopping on an error or end of stream.
    *
    * On a successful read of @count bytes, or if we reached the end of the
    * stream, %TRUE is returned, and @bytes_read is set to the number of bytes
    * read into @buffer.
    *
    * If there is an error during the operation %FALSE is returned and @error is
    * set to indicate the error status.
    *
    * As a special exception to the normal conventions for functions that use
    * #GError, if this function returns %FALSE (and sets @error) then
    * @bytes_read
    *   will be set to the number of bytes that were successfully read before
    *   the error was encountered. This functionality is only available from C.
    *   If you need it from another language then you must write your own loop
    *   around g_input_stream_read().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_all]: Method read_all contains an OUT parameter, which is not supported yet"
  )
  private def readAll__ = ???

  /** Request an asynchronous read of @count bytes from the stream into the
    * buffer starting at @buffer.
    *
    * This is the asynchronous equivalent of g_input_stream_read_all().
    *
    * Call g_input_stream_read_all_finish() to collect the result.
    *
    * Any outstanding I/O request with higher priority (lower numerical value)
    * will be executed before an outstanding request with lower priority.
    * Default priority is %G_PRIORITY_DEFAULT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_all_async]: Method read_all_async contains an OUT parameter, which is not supported yet"
  )
  private def readAllAsync__ = ???

  /** Finishes an asynchronous stream read operation started with
    * g_input_stream_read_all_async().
    *
    * As a special exception to the normal conventions for functions that use
    * #GError, if this function returns %FALSE (and sets @error) then
    * @bytes_read
    *   will be set to the number of bytes that were successfully read before
    *   the error was encountered. This functionality is only available from C.
    *   If you need it from another language then you must write your own loop
    *   around g_input_stream_read_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_all_finish]: Method read_all_finish contains an OUT parameter, which is not supported yet"
  )
  private def readAllFinish__ = ???

  /** Request an asynchronous read of @count bytes from the stream into the
    * buffer starting at @buffer. When the operation is finished @callback will
    * be called. You can then call g_input_stream_read_finish() to get the
    * result of the operation.
    *
    * During an async request no other sync and async calls are allowed on @stream,
    * and will result in %G_IO_ERROR_PENDING errors.
    *
    * A value of @count larger than %G_MAXSSIZE will cause a
    * %G_IO_ERROR_INVALID_ARGUMENT error.
    *
    * On success, the number of bytes read into the buffer will be passed to the
    * callback. It is not an error if this is not the same as the requested
    * size, as it can happen e.g. near the end of a file, but generally we try
    * to read as many bytes as requested. Zero is returned on end of file (or if @count
    * is zero), but never otherwise.
    *
    * Any outstanding i/o request with higher priority (lower numerical value)
    * will be executed before an outstanding request with lower priority.
    * Default priority is %G_PRIORITY_DEFAULT.
    *
    * The asynchronous methods have a default fallback that uses threads to
    * implement asynchronicity, so they are optional for inheriting classes.
    * However, if you override one you must override all.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_async]: Method read_async contains an OUT parameter, which is not supported yet"
  )
  private def readAsync__ = ???

  /** Like g_input_stream_read(), this tries to read @count bytes from the
    * stream in a blocking fashion. However, rather than reading into a
    * user-supplied buffer, this will create a new #GBytes containing the data
    * that was read. This may be easier to use from language bindings.
    *
    * If count is zero, returns a zero-length #GBytes and does nothing. A value
    * of @count larger than %G_MAXSSIZE will cause a
    * %G_IO_ERROR_INVALID_ARGUMENT error.
    *
    * On success, a new #GBytes is returned. It is not an error if the size of
    * this object is not the same as the requested size, as it can happen e.g.
    * near the end of a file. A zero-length #GBytes is returned on end of file
    * (or if @count is zero), but never otherwise.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
    * operation was partially finished when the operation was cancelled the
    * partial result will be returned, without an error.
    *
    * On error %NULL is returned and @error is set accordingly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_bytes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def readBytes__ = ???

  /** Request an asynchronous read of @count bytes from the stream into a new
    * #GBytes. When the operation is finished @callback will be called. You can
    * then call g_input_stream_read_bytes_finish() to get the result of the
    * operation.
    *
    * During an async request no other sync and async calls are allowed on @stream,
    * and will result in %G_IO_ERROR_PENDING errors.
    *
    * A value of @count larger than %G_MAXSSIZE will cause a
    * %G_IO_ERROR_INVALID_ARGUMENT error.
    *
    * On success, the new #GBytes will be passed to the callback. It is not an
    * error if this is smaller than the requested size, as it can happen e.g.
    * near the end of a file, but generally we try to read as many bytes as
    * requested. Zero is returned on end of file (or if
    * @count
    *   is zero), but never otherwise.
    *
    * Any outstanding I/O request with higher priority (lower numerical value)
    * will be executed before an outstanding request with lower priority.
    * Default priority is %G_PRIORITY_DEFAULT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_bytes_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def readBytesAsync__ = ???

  /** Finishes an asynchronous stream read-into-#GBytes operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_bytes_finish/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def readBytesFinish__ = ???

  /** Finishes an asynchronous stream read operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_input_stream_read_finish(
      this.raw.asInstanceOf[Ptr[GInputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  /** Sets @stream to have actions pending. If the pending flag is already set
    * or @stream is closed, it will return %FALSE and set
    * @error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPending(): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_input_stream_set_pending(
      this.raw.asInstanceOf[Ptr[GInputStream]],
      __errorPtr
    ).value.!=(0)
  )

  /** Tries to skip @count bytes from the stream. Will block during the
    * operation.
    *
    * This is identical to g_input_stream_read(), from a behaviour standpoint,
    * but the bytes that are skipped are not returned to the user. Some streams
    * have an implementation that is more efficient than reading the data.
    *
    * This function is optional for inherited classes, as the default
    * implementation emulates it using read.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
    * operation was partially finished when the operation was cancelled the
    * partial result will be returned, without an error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def skip(
      count: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_input_stream_skip(
      this.raw.asInstanceOf[Ptr[GInputStream]],
      gsize(count),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** Request an asynchronous skip of @count bytes from the stream. When the
    * operation is finished @callback will be called. You can then call
    * g_input_stream_skip_finish() to get the result of the operation.
    *
    * During an async request no other sync and async calls are allowed, and
    * will result in %G_IO_ERROR_PENDING errors.
    *
    * A value of @count larger than %G_MAXSSIZE will cause a
    * %G_IO_ERROR_INVALID_ARGUMENT error.
    *
    * On success, the number of bytes skipped will be passed to the callback. It
    * is not an error if this is not the same as the requested size, as it can
    * happen e.g. near the end of a file, but generally we try to skip as many
    * bytes as requested. Zero is returned on end of file (or if @count is
    * zero), but never otherwise.
    *
    * Any outstanding i/o request with higher priority (lower numerical value)
    * will be executed before an outstanding request with lower priority.
    * Default priority is %G_PRIORITY_DEFAULT.
    *
    * The asynchronous methods have a default fallback that uses threads to
    * implement asynchronicity, so they are optional for inheriting classes.
    * However, if you override one, you must override all.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method skip_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def skipAsync__ = ???

  /** Finishes a stream skip operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def skipFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_input_stream_skip_finish(
      this.raw.asInstanceOf[Ptr[GInputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

end InputStream
