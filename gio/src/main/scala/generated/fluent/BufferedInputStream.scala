package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  AsyncResult,
  Cancellable,
  FilterInputStream,
  InputStream,
  Seekable
}
import sn.gnome.gio.internal.GBufferedInputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gsize, gssize}
import sn.gnome.gobject.runtime.*

/** Buffered input stream implements #GFilterInputStream and provides for
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BufferedInputStream(raw: Ptr[GBufferedInputStream])
    extends FilterInputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Tries to read @count bytes from the stream into the buffer. Will block
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fill(
      count: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_buffered_input_stream_fill(
      this.raw.asInstanceOf[Ptr[GBufferedInputStream]],
      gssize(count),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** Reads data into @stream's buffer asynchronously, up to @count size.
    * @io_priority
    *   can be used to prioritize reads. For the synchronous version of this
    *   function, see g_buffered_input_stream_fill().
    *
    * If @count is -1 then the attempted read size is equal to the number of
    * bytes that are required to fill the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method fill_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def fillAsync__ = ???

  /** Finishes an asynchronous read.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fillFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_buffered_input_stream_fill_finish(
      this.raw.asInstanceOf[Ptr[GBufferedInputStream]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  /** Gets the size of the available data within the stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAvailable(): CUnsignedLongInt /* None */ =
    g_buffered_input_stream_get_available(
      this.raw.asInstanceOf[Ptr[GBufferedInputStream]]
    ).value

  /** Gets the size of the input buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBufferSize(): CUnsignedLongInt /* None */ =
    g_buffered_input_stream_get_buffer_size(
      this.raw.asInstanceOf[Ptr[GBufferedInputStream]]
    ).value

  /** Peeks in the buffer, copying data of size @count into @buffer, offset @offset
    * bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method peek/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(void*)))"
  )
  private def peek__ = ???

  /** Returns the buffer with the currently available bytes. The returned buffer
    * must not be modified and will become invalid when reading from the stream
    * or filling the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method peek_buffer]: Method peek_buffer contains an OUT parameter, which is not supported yet"
  )
  private def peekBuffer__ = ???

  /** Tries to read a single byte from the stream or the buffer. Will block
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readByte(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Int /* None */ ] = GResult.wrap(__errorPtr =>
    g_buffered_input_stream_read_byte(
      this.raw.asInstanceOf[Ptr[GBufferedInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** Sets the size of the internal buffer of @stream to @size, or to the size
    * of the contents of the buffer. The buffer can never be resized smaller
    * than its current contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBufferSize(
      size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): Unit /* None */ = g_buffered_input_stream_set_buffer_size(
    this.raw.asInstanceOf[Ptr[GBufferedInputStream]],
    gsize(size)
  )

end BufferedInputStream

object BufferedInputStream:
  /** Creates a new #GInputStream from the given @base_stream, with a buffer set
    * to the default size (4 kilobytes).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(base_stream: InputStream /* Some(Ptr[GInputStream]) */ )(using
      Runtime
  ): BufferedInputStream =
    val raw: Ptr[Byte] = g_buffered_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[BufferedInputStream](
      raw,
      r => new BufferedInputStream(r.asInstanceOf)
    )
  end apply

  /** Creates a new #GBufferedInputStream from the given @base_stream, with a
    * buffer set to @size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sized(
      base_stream: InputStream /* Some(Ptr[GInputStream]) */,
      size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  )(using Runtime): BufferedInputStream =
    val raw: Ptr[Byte] = g_buffered_input_stream_new_sized(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      gsize(size)
    ).asInstanceOf
    summon[Runtime].getOrCreate[BufferedInputStream](
      raw,
      r => new BufferedInputStream(r.asInstanceOf)
    )
  end sized
end BufferedInputStream
