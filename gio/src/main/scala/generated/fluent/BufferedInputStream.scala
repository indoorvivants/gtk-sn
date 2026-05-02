package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.FilterInputStream
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GBufferedInputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Buffered input stream implements #GFilterInputStream and provides for
  * buffered reads.
  *
  * By default, #GBufferedInputStream's buffer size is set at 4 kilobytes.
  *
  * To create a buffered input stream, use g_buffered_input_stream_new(), or
  * g_buffered_input_stream_new_sized() to specify the buffer's size at
  * construction.
  *
  * To get the size of a buffer within a buffered input stream, use
  * g_buffered_input_stream_get_buffer_size(). To change the size of a buffered
  * input stream's buffer, use g_buffered_input_stream_set_buffer_size(). Note
  * that the buffer's size cannot be reduced below the size of the data within
  * the buffer.
  */
class BufferedInputStream(raw: Ptr[GBufferedInputStream])
    extends FilterInputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to read @count bytes from the stream into the buffer. Will block
    * during this read.
    *
    * If @count is zero, returns zero and does nothing. A value of @count larger
    * than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
    *
    * On success, the number of bytes read into the buffer is returned. It is
    * not an error if this is not the same as the requested size, as it can
    * happen e.g. near the end of a file. Zero is returned on end of file (or if @count
    * is zero), but never otherwise.
    *
    * If @count is -1 then the attempted read size is equal to the number of
    * bytes that are required to fill the buffer.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
    * operation was partially finished when the operation was cancelled the
    * partial result will be returned, without an error.
    *
    * On error -1 is returned and @error is set accordingly.
    *
    * For the asynchronous, non-blocking, version of this function, see
    * g_buffered_input_stream_fill_async().
    */
  def fill(
      count: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_buffered_input_stream_fill(
      this.raw.asInstanceOf,
      gssize(count),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads data into @stream's buffer asynchronously, up to @count size.
    * @io_priority
    *   can be used to prioritize reads. For the synchronous version of this
    *   function, see g_buffered_input_stream_fill().
    *
    * If @count is -1 then the attempted read size is equal to the number of
    * bytes that are required to fill the buffer.
    */
  def fillAsync(
      count: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */,
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_buffered_input_stream_fill_async(
    this.raw.asInstanceOf,
    gssize(count),
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
    * Finishes an asynchronous read.
    */
  def fillFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_buffered_input_stream_fill_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the size of the available data within the stream.
    */
  def getAvailable(): CUnsignedLongInt /* None */ =
    g_buffered_input_stream_get_available(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the size of the input buffer.
    */
  def getBufferSize(): CUnsignedLongInt /* None */ =
    g_buffered_input_stream_get_buffer_size(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the buffer with the currently available bytes. The returned buffer
    * must not be modified and will become invalid when reading from the stream
    * or filling the buffer.
    */
  @annotation.compileTimeOnly(
    "Method peek_buffer contains an OUT parameter, which is not supported yet"
  )
  private def peekBuffer__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to read a single byte from the stream or the buffer. Will block
    * during this read.
    *
    * On success, the byte read from the stream is returned. On end of stream -1
    * is returned but it's not an exceptional error and @error is not set.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
    * operation was partially finished when the operation was cancelled the
    * partial result will be returned, without an error.
    *
    * On error -1 is returned and @error is set accordingly.
    */
  def readByte(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Int /* None */ ] = GResult.wrap(__errorPtr =>
    g_buffered_input_stream_read_byte(
      this.raw.asInstanceOf,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the size of the internal buffer of @stream to @size, or to the size
    * of the contents of the buffer. The buffer can never be resized smaller
    * than its current contents.
    */
  def setBufferSize(
      size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): Unit /* None */ =
    g_buffered_input_stream_set_buffer_size(this.raw.asInstanceOf, gsize(size))

end BufferedInputStream

object BufferedInputStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GInputStream from the given @base_stream, with a buffer set
    * to the default size (4 kilobytes).
    */
  def apply(
      base_stream: InputStream /* Some(Ptr[GInputStream]) */
  ): BufferedInputStream = new BufferedInputStream(
    g_buffered_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GBufferedInputStream from the given @base_stream, with a
    * buffer set to @size.
    */
  def sized(
      base_stream: InputStream /* Some(Ptr[GInputStream]) */,
      size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): BufferedInputStream = new BufferedInputStream(
    g_buffered_input_stream_new_sized(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      gsize(size)
    ).asInstanceOf
  )
end BufferedInputStream
