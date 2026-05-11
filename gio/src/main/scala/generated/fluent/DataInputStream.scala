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
import sn.gnome.gobject.runtime.*

/** Data input stream implements #GInputStream and includes functions for
  * reading structured data directly from a binary input stream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DataInputStream private[gnome] (raw: Ptr[GDataInputStream])
    extends BufferedInputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the byte order for the data input stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getByteOrder(): DataStreamByteOrder /* None */ =
    DataStreamByteOrder.fromRaw(
      g_data_input_stream_get_byte_order(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]]
      )
    )
  end getByteOrder

  /** Gets the current newline type for the @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNewlineType(): DataStreamNewlineType /* None */ =
    DataStreamNewlineType.fromRaw(
      g_data_input_stream_get_newline_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]]
      )
    )
  end getNewlineType

  /** Reads an unsigned 8-bit/1-byte value from @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_byte]: Method read_byte is weird: there are conflicting versions of it in DataInputStream and BufferedInputStream"
  )
  private def readByte__ = ???

  /** Reads a 16-bit/2-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readInt16(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[CShort /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int16(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value
    )
  end readInt16

  /** Reads a signed 32-bit/4-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readInt32(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[CInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int32(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value
    )
  end readInt32

  /** Reads a 64-bit/8-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readInt64(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[CLongInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int64(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value
    )
  end readInt64

  /** Reads a line from the data input stream. Note that no encoding checks or
    * conversion is performed; the input is not guaranteed to be UTF-8, and may
    * in fact have embedded NUL characters.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_line]: Method read_line contains an OUT parameter, which is not supported yet"
  )
  private def readLine__ = ???

  /** The asynchronous version of g_data_input_stream_read_line(). It is an
    * error to have two outstanding calls to this function.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_data_input_stream_read_line_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_line_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def readLineAsync__ = ???

  /** Finish an asynchronous call started by
    * g_data_input_stream_read_line_async(). Note the warning about string
    * encoding in g_data_input_stream_read_line() applies here as well.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_line_finish]: Method read_line_finish contains an OUT parameter, which is not supported yet"
  )
  private def readLineFinish__ = ???

  /** Finish an asynchronous call started by
    * g_data_input_stream_read_line_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_line_finish_utf8]: Method read_line_finish_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def readLineFinishUtf8__ = ???

  /** Reads a UTF-8 encoded line from the data input stream.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_line_utf8]: Method read_line_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def readLineUtf8__ = ???

  /** Reads an unsigned 16-bit/2-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readUint16(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[UShort /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint16(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value
    )
  end readUint16

  /** Reads an unsigned 32-bit/4-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readUint32(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[UInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint32(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value
    )
  end readUint32

  /** Reads an unsigned 64-bit/8-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readUint64(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[CUnsignedLongInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint64(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value
    )
  end readUint64

  /** Reads a string from the data input stream, up to the first occurrence of
    * any of the stop characters.
    *
    * Note that, in contrast to g_data_input_stream_read_until_async(), this
    * function consumes the stop character that it finds.
    *
    * Don't use this function in new code. Its functionality is inconsistent
    * with g_data_input_stream_read_until_async(). Both functions will be marked
    * as deprecated in a future release. Use g_data_input_stream_read_upto()
    * instead, but note that that function does not consume the stop character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_until]: Method read_until contains an OUT parameter, which is not supported yet"
  )
  private def readUntil__ = ???

  /** The asynchronous version of g_data_input_stream_read_until(). It is an
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_until_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def readUntilAsync__ = ???

  /** Finish an asynchronous call started by
    * g_data_input_stream_read_until_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_until_finish]: Method read_until_finish contains an OUT parameter, which is not supported yet"
  )
  private def readUntilFinish__ = ???

  /** Reads a string from the data input stream, up to the first occurrence of
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_upto]: Method read_upto contains an OUT parameter, which is not supported yet"
  )
  private def readUpto__ = ???

  /** The asynchronous version of g_data_input_stream_read_upto(). It is an
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_upto_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def readUptoAsync__ = ???

  /** Finish an asynchronous call started by
    * g_data_input_stream_read_upto_async().
    *
    * Note that this function does not consume the stop character. You have to
    * use g_data_input_stream_read_byte() to get it before calling
    * g_data_input_stream_read_upto_async() again.
    *
    * The returned string will always be nul-terminated on success.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_upto_finish]: Method read_upto_finish contains an OUT parameter, which is not supported yet"
  )
  private def readUptoFinish__ = ???

  /** This function sets the byte order for the given @stream. All subsequent
    * reads from the @stream will be read in the given @order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setByteOrder(
      order: DataStreamByteOrder /* Some(GDataStreamByteOrder) */
  ): Unit /* None */ =
    g_data_input_stream_set_byte_order(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
      order.raw
    )
  end setByteOrder

  /** Sets the newline type for the @stream.
    *
    * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a
    * read chunk ends in "CR" we must read an additional byte to know if this is
    * "CR" or "CR LF", and this might block if there is no more data available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNewlineType(
      `type`: DataStreamNewlineType /* Some(GDataStreamNewlineType) */
  ): Unit /* None */ =
    g_data_input_stream_set_newline_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDataInputStream]],
      `type`.raw
    )
  end setNewlineType

end DataInputStream

object DataInputStream:
  def applyUnsafe(ptr: Ptr[GDataInputStream])(using Runtime) =
    summon[Runtime].getOrCreate[DataInputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DataInputStream(ptr)
    )

  /** Creates a new data input stream for the @base_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      base_stream: sn.gnome.gio.fluent.InputStream /* Some(Ptr[GInputStream]) */
  )(using Runtime): DataInputStream =
    val raw: Ptr[Byte] = g_data_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[DataInputStream](
      raw,
      r => DataInputStream.applyUnsafe(r.asInstanceOf)
    )
  end apply
end DataInputStream
