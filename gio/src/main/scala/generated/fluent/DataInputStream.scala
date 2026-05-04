package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  BufferedInputStream,
  Cancellable,
  DataStreamByteOrder,
  DataStreamNewlineType,
  InputStream,
  Seekable
}
import sn.gnome.gio.internal.GDataInputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{
  gint16,
  gint32,
  gint64,
  guint16,
  guint32,
  guint64
}

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Data input stream implements #GInputStream and includes functions for
  * reading structured data directly from a binary input stream.
  */
class DataInputStream(raw: Ptr[GDataInputStream])
    extends BufferedInputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the byte order for the data input stream.
    */
  def getByteOrder(): DataStreamByteOrder /* None */ =
    DataStreamByteOrder.fromRaw(
      g_data_input_stream_get_byte_order(
        this.raw.asInstanceOf[Ptr[GDataInputStream]]
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current newline type for the @stream.
    */
  def getNewlineType(): DataStreamNewlineType /* None */ =
    DataStreamNewlineType.fromRaw(
      g_data_input_stream_get_newline_type(
        this.raw.asInstanceOf[Ptr[GDataInputStream]]
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads an unsigned 8-bit/1-byte value from @stream.
    */
  @annotation.compileTimeOnly(
    "Method read_byte is weird: there are conflicting versions of it in DataInputStream and BufferedInputStream"
  )
  def readByte__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a 16-bit/2-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    */
  def readInt16(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CShort /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_int16(
      this.raw.asInstanceOf[Ptr[GDataInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a signed 32-bit/4-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    */
  def readInt32(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_int32(
      this.raw.asInstanceOf[Ptr[GDataInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a 64-bit/8-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    */
  def readInt64(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_int64(
      this.raw.asInstanceOf[Ptr[GDataInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a line from the data input stream. Note that no encoding checks or
    * conversion is performed; the input is not guaranteed to be UTF-8, and may
    * in fact have embedded NUL characters.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    */
  @annotation.compileTimeOnly(
    "Method read_line contains an OUT parameter, which is not supported yet"
  )
  def readLine__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The asynchronous version of g_data_input_stream_read_line(). It is an
    * error to have two outstanding calls to this function.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_data_input_stream_read_line_finish() to get the result of the
    * operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def readLineAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous call started by
    * g_data_input_stream_read_line_async(). Note the warning about string
    * encoding in g_data_input_stream_read_line() applies here as well.
    */
  @annotation.compileTimeOnly(
    "Method read_line_finish contains an OUT parameter, which is not supported yet"
  )
  def readLineFinish__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous call started by
    * g_data_input_stream_read_line_async().
    */
  @annotation.compileTimeOnly(
    "Method read_line_finish_utf8 contains an OUT parameter, which is not supported yet"
  )
  def readLineFinishUtf8__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a UTF-8 encoded line from the data input stream.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    */
  @annotation.compileTimeOnly(
    "Method read_line_utf8 contains an OUT parameter, which is not supported yet"
  )
  def readLineUtf8__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads an unsigned 16-bit/2-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    */
  def readUint16(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[UShort /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_uint16(
      this.raw.asInstanceOf[Ptr[GDataInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads an unsigned 32-bit/4-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    */
  def readUint32(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[UInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_uint32(
      this.raw.asInstanceOf[Ptr[GDataInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads an unsigned 64-bit/8-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    */
  def readUint64(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[CUnsignedLongInt /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_input_stream_read_uint64(
      this.raw.asInstanceOf[Ptr[GDataInputStream]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a string from the data input stream, up to the first occurrence of
    * any of the stop characters.
    *
    * Note that, in contrast to g_data_input_stream_read_until_async(), this
    * function consumes the stop character that it finds.
    *
    * Don't use this function in new code. Its functionality is inconsistent
    * with g_data_input_stream_read_until_async(). Both functions will be marked
    * as deprecated in a future release. Use g_data_input_stream_read_upto()
    * instead, but note that that function does not consume the stop character.
    */
  @annotation.compileTimeOnly(
    "Method read_until contains an OUT parameter, which is not supported yet"
  )
  def readUntil__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The asynchronous version of g_data_input_stream_read_until(). It is an
    * error to have two outstanding calls to this function.
    *
    * Note that, in contrast to g_data_input_stream_read_until(), this function
    * does not consume the stop character that it finds. You must read it for
    * yourself.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_data_input_stream_read_until_finish() to get the result of the
    * operation.
    *
    * Don't use this function in new code. Its functionality is inconsistent
    * with g_data_input_stream_read_until(). Both functions will be marked as
    * deprecated in a future release. Use g_data_input_stream_read_upto_async()
    * instead.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def readUntilAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous call started by
    * g_data_input_stream_read_until_async().
    */
  @annotation.compileTimeOnly(
    "Method read_until_finish contains an OUT parameter, which is not supported yet"
  )
  def readUntilFinish__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a string from the data input stream, up to the first occurrence of
    * any of the stop characters.
    *
    * In contrast to g_data_input_stream_read_until(), this function does not
    * consume the stop character. You have to use
    * g_data_input_stream_read_byte() to get it before calling
    * g_data_input_stream_read_upto() again.
    *
    * Note that @stop_chars may contain '\0' if @stop_chars_len is specified.
    *
    * The returned string will always be nul-terminated on success.
    */
  @annotation.compileTimeOnly(
    "Method read_upto contains an OUT parameter, which is not supported yet"
  )
  def readUpto__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The asynchronous version of g_data_input_stream_read_upto(). It is an
    * error to have two outstanding calls to this function.
    *
    * In contrast to g_data_input_stream_read_until(), this function does not
    * consume the stop character. You have to use
    * g_data_input_stream_read_byte() to get it before calling
    * g_data_input_stream_read_upto() again.
    *
    * Note that @stop_chars may contain '\0' if @stop_chars_len is specified.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_data_input_stream_read_upto_finish() to get the result of the
    * operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def readUptoAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous call started by
    * g_data_input_stream_read_upto_async().
    *
    * Note that this function does not consume the stop character. You have to
    * use g_data_input_stream_read_byte() to get it before calling
    * g_data_input_stream_read_upto_async() again.
    *
    * The returned string will always be nul-terminated on success.
    */
  @annotation.compileTimeOnly(
    "Method read_upto_finish contains an OUT parameter, which is not supported yet"
  )
  def readUptoFinish__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function sets the byte order for the given @stream. All subsequent
    * reads from the @stream will be read in the given @order.
    */
  def setByteOrder(
      order: DataStreamByteOrder /* Some(GDataStreamByteOrder) */
  ): Unit /* None */ = g_data_input_stream_set_byte_order(
    this.raw.asInstanceOf[Ptr[GDataInputStream]],
    order.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the newline type for the @stream.
    *
    * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a
    * read chunk ends in "CR" we must read an additional byte to know if this is
    * "CR" or "CR LF", and this might block if there is no more data available.
    */
  def setNewlineType(
      `type`: DataStreamNewlineType /* Some(GDataStreamNewlineType) */
  ): Unit /* None */ = g_data_input_stream_set_newline_type(
    this.raw.asInstanceOf[Ptr[GDataInputStream]],
    `type`.raw
  )

end DataInputStream

object DataInputStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new data input stream for the @base_stream.
    */
  def apply(
      base_stream: InputStream /* Some(Ptr[GInputStream]) */
  ): DataInputStream = new DataInputStream(
    g_data_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end DataInputStream
