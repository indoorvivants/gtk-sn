package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{AsyncResult, Cancellable, InputStream, OutputStream}
import sn.gnome.gio.internal.GIOStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** GIOStream represents an object that has both read and write streams.
  * Generally the two streams act as separate input and output streams, but they
  * share some common resources and state. For instance, for seekable streams,
  * both streams may use the same position.
  *
  * Examples of #GIOStream objects are #GSocketConnection, which represents a
  * two-way network connection; and #GFileIOStream, which represents a file
  * handle opened in read-write mode.
  *
  * To do the actual reading and writing you need to get the substreams with
  * g_io_stream_get_input_stream() and g_io_stream_get_output_stream().
  *
  * The #GIOStream object owns the input and the output streams, not the other
  * way around, so keeping the substreams alive will not keep the #GIOStream
  * object alive. If the #GIOStream object is freed it will be closed, thus
  * closing the substreams, so even if the substreams stay alive they will
  * always return %G_IO_ERROR_CLOSED for all operations.
  *
  * To close a stream use g_io_stream_close() which will close the common stream
  * object and also the individual substreams. You can also close the substreams
  * themselves. In most cases this only marks the substream as closed, so
  * further I/O on it fails but common state in the #GIOStream may still be
  * open. However, some streams may support "half-closed" states where one
  * direction of the stream is actually shut down.
  *
  * Operations on #GIOStreams cannot be started while another operation on the
  * #GIOStream or its substreams is in progress. Specifically, an application
  * can read from the #GInputStream and write to the #GOutputStream
  * simultaneously (either in separate threads, or as asynchronous operations in
  * the same thread), but an application cannot start any #GIOStream operation
  * while there is a #GIOStream, #GInputStream or #GOutputStream operation in
  * progress, and an application can’t start any #GInputStream or #GOutputStream
  * operation while there is a #GIOStream operation in progress.
  *
  * This is a product of individual stream operations being associated with a
  * given #GMainContext (the thread-default context at the time the operation
  * was started), rather than entire streams being associated with a single
  * #GMainContext.
  *
  * GIO may run operations on #GIOStreams from other (worker) threads, and this
  * may be exposed to application code in the behaviour of wrapper streams, such
  * as #GBufferedInputStream or #GTlsConnection. With such wrapper APIs,
  * application code may only run operations on the base (wrapped) stream when
  * the wrapper stream is idle. Note that the semantics of such operations may
  * not be well-defined due to the state the wrapper stream leaves the base
  * stream in (though they are guaranteed not to crash).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOStream(raw: Ptr[GIOStream]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Clears the pending flag on @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearPending(): Unit /* None */ = g_io_stream_clear_pending(
    this.raw.asInstanceOf[Ptr[GIOStream]]
  )

  /** Closes the stream, releasing resources related to it. This will also close
    * the individual input and output streams, if they are not already closed.
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
    * If @cancellable is not NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    * Cancelling a close will still leave the stream closed, but some streams
    * can use a faster close that doesn't block to e.g. check errors.
    *
    * The default implementation of this method just calls close on the
    * individual input/output streams.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_io_stream_close(
      this.raw.asInstanceOf[Ptr[GIOStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Requests an asynchronous close of the stream, releasing resources related
    * to it. When the operation is finished @callback will be called. You can
    * then call g_io_stream_close_finish() to get the result of the operation.
    *
    * For behaviour details see g_io_stream_close().
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

  /** Closes a stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def closeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_io_stream_close_finish(
      this.raw.asInstanceOf[Ptr[GIOStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** Gets the input stream for this object. This is used for reading.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputStream(): InputStream /* None */ = new InputStream(
    g_io_stream_get_input_stream(
      this.raw.asInstanceOf[Ptr[GIOStream]]
    ).asInstanceOf
  )

  /** Gets the output stream for this object. This is used for writing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOutputStream(): OutputStream /* None */ = new OutputStream(
    g_io_stream_get_output_stream(
      this.raw.asInstanceOf[Ptr[GIOStream]]
    ).asInstanceOf
  )

  /** Checks if a stream has pending actions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasPending(): Boolean /* None */ =
    g_io_stream_has_pending(this.raw.asInstanceOf[Ptr[GIOStream]]).value.!=(0)

  /** Checks if a stream is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClosed(): Boolean /* None */ =
    g_io_stream_is_closed(this.raw.asInstanceOf[Ptr[GIOStream]]).value.!=(0)

  /** Sets @stream to have actions pending. If the pending flag is already set
    * or @stream is closed, it will return %FALSE and set
    * @error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPending(): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_io_stream_set_pending(
      this.raw.asInstanceOf[Ptr[GIOStream]],
      __errorPtr
    ).value.!=(0)
  )

  /** Asynchronously splice the output stream of @stream1 to the input stream of
    * @stream2,
    *   and splice the output stream of @stream2 to the input stream of
    * @stream1.
    *
    * When the operation is finished @callback will be called. You can then call
    * g_io_stream_splice_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method splice_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def spliceAsync__ = ???

end IOStream

object IOStream:
  /** Finishes an asynchronous io stream splice operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def spliceFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      g_io_stream_splice_finish(
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

end IOStream
