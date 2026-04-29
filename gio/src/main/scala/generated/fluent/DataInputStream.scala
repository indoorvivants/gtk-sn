package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.BufferedInputStream
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GDataInputStream
import sn.gnome.gio.internal.GDataStreamByteOrder
import sn.gnome.gio.internal.GDataStreamNewlineType
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gint16
import sn.gnome.glib.internal.gint32
import sn.gnome.glib.internal.gint64
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gssize
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.guint64

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
  def getByteOrder(): GDataStreamByteOrder = g_data_input_stream_get_byte_order(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current newline type for the @stream.
    */
  def getNewlineType(): GDataStreamNewlineType =
    g_data_input_stream_get_newline_type(this.raw.asInstanceOf)

  @annotation.compileTimeOnly(
    "Method read_byte is weird: there are conflicting versions of it in DataInputStream and BufferedInputStream"
  )
  def readByte() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads a 16-bit/2-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    */
  def readInt16(cancellable: Cancellable): GResult[CShort] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int16(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
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
  def readInt32(cancellable: Cancellable): GResult[CInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int32(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
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
  def readInt64(cancellable: Cancellable): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int64(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  @annotation.compileTimeOnly(
    "Method read_line contains an OUT parameter, which is not supported yet"
  )
  def readLine() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The asynchronous version of g_data_input_stream_read_line(). It is an
    * error to have two outstanding calls to this function.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_data_input_stream_read_line_finish() to get the result of the
    * operation.
    */
  def readLineAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_data_input_stream_read_line_async(
    this.raw.asInstanceOf,
    gint(io_priority),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  @annotation.compileTimeOnly(
    "Method read_line_finish contains an OUT parameter, which is not supported yet"
  )
  def readLineFinish() = ???

  @annotation.compileTimeOnly(
    "Method read_line_finish_utf8 contains an OUT parameter, which is not supported yet"
  )
  def readLineFinishUtf8() = ???

  @annotation.compileTimeOnly(
    "Method read_line_utf8 contains an OUT parameter, which is not supported yet"
  )
  def readLineUtf8() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads an unsigned 16-bit/2-byte value from @stream.
    *
    * In order to get the correct byte order for this read operation, see
    * g_data_input_stream_get_byte_order() and
    * g_data_input_stream_set_byte_order().
    */
  def readUint16(cancellable: Cancellable): GResult[UShort] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint16(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
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
  def readUint32(cancellable: Cancellable): GResult[UInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint32(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
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
  def readUint64(cancellable: Cancellable): GResult[CUnsignedLongInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint64(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  @annotation.compileTimeOnly(
    "Method read_until contains an OUT parameter, which is not supported yet"
  )
  def readUntil() = ???

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
  def readUntilAsync(
      stop_chars: String | CString,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_data_input_stream_read_until_async(
    this.raw.asInstanceOf,
    __sn_extract_string(stop_chars).asInstanceOf[Ptr[gchar]],
    gint(io_priority),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  @annotation.compileTimeOnly(
    "Method read_until_finish contains an OUT parameter, which is not supported yet"
  )
  def readUntilFinish() = ???

  @annotation.compileTimeOnly(
    "Method read_upto contains an OUT parameter, which is not supported yet"
  )
  def readUpto() = ???

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
  def readUptoAsync(
      stop_chars: String | CString,
      stop_chars_len: CLongInt,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_data_input_stream_read_upto_async(
    this.raw.asInstanceOf,
    __sn_extract_string(stop_chars).asInstanceOf[Ptr[gchar]],
    gssize(stop_chars_len),
    gint(io_priority),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  @annotation.compileTimeOnly(
    "Method read_upto_finish contains an OUT parameter, which is not supported yet"
  )
  def readUptoFinish() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function sets the byte order for the given @stream. All subsequent
    * reads from the @stream will be read in the given @order.
    */
  def setByteOrder(order: GDataStreamByteOrder): Unit =
    g_data_input_stream_set_byte_order(this.raw.asInstanceOf, order)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the newline type for the @stream.
    *
    * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a
    * read chunk ends in "CR" we must read an additional byte to know if this is
    * "CR" or "CR LF", and this might block if there is no more data available.
    */
  def setNewlineType(`type`: GDataStreamNewlineType): Unit =
    g_data_input_stream_set_newline_type(this.raw.asInstanceOf, `type`)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DataInputStream

object DataInputStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new data input stream for the @base_stream.
    */
  def apply(base_stream: InputStream): DataInputStream = new DataInputStream(
    g_data_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end DataInputStream
