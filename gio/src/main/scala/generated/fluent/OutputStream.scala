package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GOutputStream
import sn.gnome.gio.internal.GOutputStreamSpliceFlags
import sn.gnome.gio.internal.GOutputVector
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GOutputStream has functions to write to a stream (g_output_stream_write()),
  * to close a stream (g_output_stream_close()) and to flush pending writes
  * (g_output_stream_flush()).
  *
  * To copy the content of an input stream to an output stream without manually
  * handling the reads and writes, use g_output_stream_splice().
  *
  * See the documentation for #GIOStream for details of thread safety of
  * streaming APIs.
  *
  * All of these functions have async variants too.
  */
class OutputStream(raw: Ptr[GOutputStream]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears the pending flag on @stream.
    */
  def clearPending(): Unit /* None */ = g_output_stream_clear_pending(
    this.raw.asInstanceOf[Ptr[GOutputStream]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Closes the stream, releasing resources related to it.
    *
    * Once the stream is closed, all other operations will return
    * %G_IO_ERROR_CLOSED. Closing a stream multiple times will not return an
    * error.
    *
    * Closing a stream will automatically flush any outstanding buffers in the
    * stream.
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
    * important to check and report the error to the user, otherwise there might
    * be a loss of data as all data might not be written.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    * Cancelling a close will still leave the stream closed, but there some
    * streams can use a faster close that doesn't block to e.g. check errors. On
    * cancellation (as with any error) there is no guarantee that all written
    * data will reach the target.
    */
  def close(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_close(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requests an asynchronous close of the stream, releasing resources related
    * to it. When the operation is finished @callback will be called. You can
    * then call g_output_stream_close_finish() to get the result of the
    * operation.
    *
    * For behaviour details see g_output_stream_close().
    *
    * The asynchronous methods have a default fallback that uses threads to
    * implement asynchronicity, so they are optional for inheriting classes.
    * However, if you override one you must override all.
    */
  def closeAsync(
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_output_stream_close_async(
    this.raw.asInstanceOf[Ptr[GOutputStream]],
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
    * Closes an output stream.
    */
  def closeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_close_finish(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forces a write of all user-space buffered data for the given
    * @stream.
    *   Will block during the operation. Closing the stream will implicitly
    *   cause a flush.
    *
    * This function is optional for inherited classes.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    */
  def flush(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_flush(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forces an asynchronous write of all user-space buffered data for the given @stream.
    * For behaviour details see g_output_stream_flush().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_output_stream_flush_finish() to get the result of the operation.
    */
  def flushAsync(
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_output_stream_flush_async(
    this.raw.asInstanceOf[Ptr[GOutputStream]],
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
    * Finishes flushing an output stream.
    */
  def flushFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_flush_finish(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if an output stream has pending actions.
    */
  def hasPending(): Boolean /* None */ = g_output_stream_has_pending(
    this.raw.asInstanceOf[Ptr[GOutputStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if an output stream has already been closed.
    */
  def isClosed(): Boolean /* None */ = g_output_stream_is_closed(
    this.raw.asInstanceOf[Ptr[GOutputStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if an output stream is being closed. This can be used inside e.g. a
    * flush implementation to see if the flush (or other i/o operation) is
    * called from within the closing operation.
    */
  def isClosing(): Boolean /* None */ = g_output_stream_is_closing(
    this.raw.asInstanceOf[Ptr[GOutputStream]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is a utility function around g_output_stream_write_all(). It uses
    * g_strdup_vprintf() to turn @format and @... into a string that is then
    * written to @stream.
    *
    * See the documentation of g_output_stream_write_all() about the behavior of
    * the actual write operation.
    *
    * Note that partial writes cannot be properly checked with this function due
    * to the variable length of the written string, if you need precise control
    * over partial write failures, you need to create you own printf()-like
    * wrapper around g_output_stream_write() or g_output_stream_write_all().
    */
  @annotation.compileTimeOnly(
    "Method printf contains an OUT parameter, which is not supported yet"
  )
  private def printf__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @stream to have actions pending. If the pending flag is already set
    * or @stream is closed, it will return %FALSE and set
    * @error.
    */
  def setPending(): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_set_pending(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Splices an input stream into an output stream.
    */
  def splice(
      source: InputStream /* Some(Ptr[GInputStream]) */,
      flags: GOutputStreamSpliceFlags /* Some(GOutputStreamSpliceFlags) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_splice(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      source.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Splices a stream asynchronously. When the operation is finished @callback
    * will be called. You can then call g_output_stream_splice_finish() to get
    * the result of the operation.
    *
    * For the synchronous, blocking version of this function, see
    * g_output_stream_splice().
    */
  def spliceAsync(
      source: InputStream /* Some(Ptr[GInputStream]) */,
      flags: GOutputStreamSpliceFlags /* Some(GOutputStreamSpliceFlags) */,
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_output_stream_splice_async(
    this.raw.asInstanceOf[Ptr[GOutputStream]],
    source.getUnsafeRawPointer().asInstanceOf,
    flags,
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
    * Finishes an asynchronous stream splice operation.
    */
  def spliceFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_splice_finish(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is a utility function around g_output_stream_write_all(). It uses
    * g_strdup_vprintf() to turn @format and @args into a string that is then
    * written to @stream.
    *
    * See the documentation of g_output_stream_write_all() about the behavior of
    * the actual write operation.
    *
    * Note that partial writes cannot be properly checked with this function due
    * to the variable length of the written string, if you need precise control
    * over partial write failures, you need to create you own printf()-like
    * wrapper around g_output_stream_write() or g_output_stream_write_all().
    */
  @annotation.compileTimeOnly(
    "Method vprintf contains an OUT parameter, which is not supported yet"
  )
  private def vprintf__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to write @count bytes from @buffer into the stream. Will block
    * during the operation.
    *
    * This function is similar to g_output_stream_write(), except it tries to
    * write as many bytes as requested, only stopping on an error.
    *
    * On a successful write of @count bytes, %TRUE is returned, and @bytes_written
    * is set to @count.
    *
    * If there is an error during the operation %FALSE is returned and @error is
    * set to indicate the error status.
    *
    * As a special exception to the normal conventions for functions that use
    * #GError, if this function returns %FALSE (and sets @error) then
    * @bytes_written
    *   will be set to the number of bytes that were successfully written before
    *   the error was encountered. This functionality is only available from C.
    *   If you need it from another language then you must write your own loop
    *   around g_output_stream_write().
    */
  @annotation.compileTimeOnly(
    "Method write_all contains an OUT parameter, which is not supported yet"
  )
  private def writeAll__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous stream write operation started with
    * g_output_stream_write_all_async().
    *
    * As a special exception to the normal conventions for functions that use
    * #GError, if this function returns %FALSE (and sets @error) then
    * @bytes_written
    *   will be set to the number of bytes that were successfully written before
    *   the error was encountered. This functionality is only available from C.
    *   If you need it from another language then you must write your own loop
    *   around g_output_stream_write_async().
    */
  @annotation.compileTimeOnly(
    "Method write_all_finish contains an OUT parameter, which is not supported yet"
  )
  private def writeAllFinish__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A wrapper function for g_output_stream_write() which takes a #GBytes as
    * input. This can be more convenient for use by language bindings or in
    * other cases where the refcounted nature of #GBytes is helpful over a bare
    * pointer interface.
    *
    * However, note that this function may still perform partial writes, just
    * like g_output_stream_write(). If that occurs, to continue writing, you
    * will need to create a new #GBytes containing just the remaining bytes,
    * using g_bytes_new_from_bytes(). Passing the same #GBytes instance multiple
    * times potentially can result in duplicated data in the output stream.
    */
  def writeBytes(
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_write_bytes(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      bytes,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is similar to g_output_stream_write_async(), but takes a
    * #GBytes as input. Due to the refcounted nature of #GBytes, this allows the
    * stream to avoid taking a copy of the data.
    *
    * However, note that this function may still perform partial writes, just
    * like g_output_stream_write_async(). If that occurs, to continue writing,
    * you will need to create a new #GBytes containing just the remaining bytes,
    * using g_bytes_new_from_bytes(). Passing the same #GBytes instance multiple
    * times potentially can result in duplicated data in the output stream.
    *
    * For the synchronous, blocking version of this function, see
    * g_output_stream_write_bytes().
    */
  def writeBytesAsync(
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */,
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_output_stream_write_bytes_async(
    this.raw.asInstanceOf[Ptr[GOutputStream]],
    bytes,
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
    * Finishes a stream write-from-#GBytes operation.
    */
  def writeBytesFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_write_bytes_finish(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes a stream write operation.
    */
  def writeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_output_stream_write_finish(
      this.raw.asInstanceOf[Ptr[GOutputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to write the bytes contained in the @n_vectors @vectors into the
    * stream. Will block during the operation.
    *
    * If @n_vectors is 0 or the sum of all bytes in @vectors is 0, returns 0 and
    * does nothing.
    *
    * On success, the number of bytes written to the stream is returned. It is
    * not an error if this is not the same as the requested size, as it can
    * happen e.g. on a partial I/O error, or if there is not enough storage in
    * the stream. All writes block until at least one byte is written or an
    * error occurs; 0 is never returned (unless
    * @n_vectors
    *   is 0 or the sum of all bytes in @vectors is 0).
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
    * operation was partially finished when the operation was cancelled the
    * partial result will be returned, without an error.
    *
    * Some implementations of g_output_stream_writev() may have limitations on
    * the aggregate buffer size, and will return %G_IO_ERROR_INVALID_ARGUMENT if
    * these are exceeded. For example, when writing to a local file on UNIX
    * platforms, the aggregate buffer size must not exceed %G_MAXSSIZE bytes.
    */
  @annotation.compileTimeOnly(
    "Method writev contains an OUT parameter, which is not supported yet"
  )
  private def writev__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to write the bytes contained in the @n_vectors @vectors into the
    * stream. Will block during the operation.
    *
    * This function is similar to g_output_stream_writev(), except it tries to
    * write as many bytes as requested, only stopping on an error.
    *
    * On a successful write of all @n_vectors vectors, %TRUE is returned, and
    * @bytes_written
    *   is set to the sum of all the sizes of @vectors.
    *
    * If there is an error during the operation %FALSE is returned and @error is
    * set to indicate the error status.
    *
    * As a special exception to the normal conventions for functions that use
    * #GError, if this function returns %FALSE (and sets @error) then
    * @bytes_written
    *   will be set to the number of bytes that were successfully written before
    *   the error was encountered. This functionality is only available from C.
    *   If you need it from another language then you must write your own loop
    *   around g_output_stream_write().
    *
    * The content of the individual elements of @vectors might be changed by
    * this function.
    */
  @annotation.compileTimeOnly(
    "Method writev_all contains an OUT parameter, which is not supported yet"
  )
  private def writevAll__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Request an asynchronous write of the bytes contained in the @n_vectors @vectors
    * into the stream. When the operation is finished @callback will be called.
    * You can then call g_output_stream_writev_all_finish() to get the result of
    * the operation.
    *
    * This is the asynchronous version of g_output_stream_writev_all().
    *
    * Call g_output_stream_writev_all_finish() to collect the result.
    *
    * Any outstanding I/O request with higher priority (lower numerical value)
    * will be executed before an outstanding request with lower priority.
    * Default priority is %G_PRIORITY_DEFAULT.
    *
    * Note that no copy of @vectors will be made, so it must stay valid until @callback
    * is called. The content of the individual elements of @vectors might be
    * changed by this function.
    */
  def writevAllAsync(
      vectors: Ptr[GOutputVector /* None */ ] /* Some(Ptr[GOutputVector]) */,
      n_vectors: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */,
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_output_stream_writev_all_async(
    this.raw.asInstanceOf[Ptr[GOutputStream]],
    vectors,
    gsize(n_vectors),
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
    * Finishes an asynchronous stream write operation started with
    * g_output_stream_writev_all_async().
    *
    * As a special exception to the normal conventions for functions that use
    * #GError, if this function returns %FALSE (and sets @error) then
    * @bytes_written
    *   will be set to the number of bytes that were successfully written before
    *   the error was encountered. This functionality is only available from C.
    *   If you need it from another language then you must write your own loop
    *   around g_output_stream_writev_async().
    */
  @annotation.compileTimeOnly(
    "Method writev_all_finish contains an OUT parameter, which is not supported yet"
  )
  private def writevAllFinish__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Request an asynchronous write of the bytes contained in @n_vectors @vectors
    * into the stream. When the operation is finished @callback will be called.
    * You can then call g_output_stream_writev_finish() to get the result of the
    * operation.
    *
    * During an async request no other sync and async calls are allowed, and
    * will result in %G_IO_ERROR_PENDING errors.
    *
    * On success, the number of bytes written will be passed to the
    * @callback.
    *   It is not an error if this is not the same as the requested size, as it
    *   can happen e.g. on a partial I/O error, but generally we try to write as
    *   many bytes as requested.
    *
    * You are guaranteed that this method will never fail with
    * %G_IO_ERROR_WOULD_BLOCK — if @stream can't accept more data, the method
    * will just wait until this changes.
    *
    * Any outstanding I/O request with higher priority (lower numerical value)
    * will be executed before an outstanding request with lower priority.
    * Default priority is %G_PRIORITY_DEFAULT.
    *
    * The asynchronous methods have a default fallback that uses threads to
    * implement asynchronicity, so they are optional for inheriting classes.
    * However, if you override one you must override all.
    *
    * For the synchronous, blocking version of this function, see
    * g_output_stream_writev().
    *
    * Note that no copy of @vectors will be made, so it must stay valid until @callback
    * is called.
    */
  def writevAsync(
      vectors: Ptr[GOutputVector /* None */ ] /* Some(Ptr[GOutputVector]) */,
      n_vectors: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */,
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_output_stream_writev_async(
    this.raw.asInstanceOf[Ptr[GOutputStream]],
    vectors,
    gsize(n_vectors),
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
    * Finishes a stream writev operation.
    */
  @annotation.compileTimeOnly(
    "Method writev_finish contains an OUT parameter, which is not supported yet"
  )
  private def writevFinish__ = ???

end OutputStream
