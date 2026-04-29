package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GInputStream
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
  * #GInputStream has functions to read from a stream (g_input_stream_read()),
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
  */
class InputStream(raw: Ptr[GInputStream]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears the pending flag on @stream.
    */
  def clearPending(): Unit = g_input_stream_clear_pending(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Closes the stream, releasing resources related to it.
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
    */
  def close(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_input_stream_close(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requests an asynchronous closes of the stream, releasing resources related
    * to it. When the operation is finished @callback will be called. You can
    * then call g_input_stream_close_finish() to get the result of the
    * operation.
    *
    * For behaviour details see g_input_stream_close().
    *
    * The asynchronous methods have a default fallback that uses threads to
    * implement asynchronicity, so they are optional for inheriting classes.
    * However, if you override one you must override all.
    */
  def closeAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_close_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes closing a stream asynchronously, started from
    * g_input_stream_close_async().
    */
  def closeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_input_stream_close_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if an input stream has pending actions.
    */
  def hasPending(): Boolean =
    g_input_stream_has_pending(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if an input stream is closed.
    */
  def isClosed(): Boolean =
    g_input_stream_is_closed(this.raw.asInstanceOf).value.!=(0)

  @annotation.compileTimeOnly(
    "Method read contains an OUT parameter, which is not supported yet"
  )
  def read() = ???

  @annotation.compileTimeOnly(
    "Method read_all contains an OUT parameter, which is not supported yet"
  )
  def readAll() = ???

  @annotation.compileTimeOnly(
    "Method read_all_async contains an OUT parameter, which is not supported yet"
  )
  def readAllAsync() = ???

  @annotation.compileTimeOnly(
    "Method read_all_finish contains an OUT parameter, which is not supported yet"
  )
  def readAllFinish() = ???

  @annotation.compileTimeOnly(
    "Method read_async contains an OUT parameter, which is not supported yet"
  )
  def readAsync() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_input_stream_read(), this tries to read @count bytes from the
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
    */
  def readBytes(
      count: CUnsignedLongInt,
      cancellable: Cancellable
  ): GResult[Ptr[GBytes]] = GResult.wrap(__errorPtr =>
    g_input_stream_read_bytes(
      this.raw.asInstanceOf,
      gsize(count),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Request an asynchronous read of @count bytes from the stream into a new
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
    */
  def readBytesAsync(
      count: CUnsignedLongInt,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_read_bytes_async(
    this.raw.asInstanceOf,
    gsize(count),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous stream read-into-#GBytes operation.
    */
  def readBytesFinish(result: AsyncResult): GResult[Ptr[GBytes]] =
    GResult.wrap(__errorPtr =>
      g_input_stream_read_bytes_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous stream read operation.
    */
  def readFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_input_stream_read_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @stream to have actions pending. If the pending flag is already set
    * or @stream is closed, it will return %FALSE and set
    * @error.
    */
  def setPending(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_input_stream_set_pending(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to skip @count bytes from the stream. Will block during the
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
    */
  def skip(
      count: CUnsignedLongInt,
      cancellable: Cancellable
  ): GResult[CLongInt] = GResult.wrap(__errorPtr =>
    g_input_stream_skip(
      this.raw.asInstanceOf,
      gsize(count),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Request an asynchronous skip of @count bytes from the stream. When the
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
    */
  def skipAsync(
      count: CUnsignedLongInt,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_skip_async(
    this.raw.asInstanceOf,
    gsize(count),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes a stream skip operation.
    */
  def skipFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_input_stream_skip_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

end InputStream
