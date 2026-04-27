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

class DataInputStream(raw: Ptr[GDataInputStream])
    extends BufferedInputStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getByteOrder(): GDataStreamByteOrder = g_data_input_stream_get_byte_order(
    this.raw.asInstanceOf
  )

  def getNewlineType(): GDataStreamNewlineType =
    g_data_input_stream_get_newline_type(this.raw.asInstanceOf)

  // Method read_byte is not rendered – there are conflicting versions of it in DataInputStream and BufferedInputStream

  def readInt16(cancellable: Cancellable): GResult[CShort] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int16(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readInt32(cancellable: Cancellable): GResult[CInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int32(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readInt64(cancellable: Cancellable): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_int64(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  // Method read_line contains an OUT parameter, which is not supported yet

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

  // Method read_line_finish contains an OUT parameter, which is not supported yet

  // Method read_line_finish_utf8 contains an OUT parameter, which is not supported yet

  // Method read_line_utf8 contains an OUT parameter, which is not supported yet

  def readUint16(cancellable: Cancellable): GResult[UShort] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint16(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readUint32(cancellable: Cancellable): GResult[UInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint32(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def readUint64(cancellable: Cancellable): GResult[CUnsignedLongInt] =
    GResult.wrap(__errorPtr =>
      g_data_input_stream_read_uint64(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  // Method read_until contains an OUT parameter, which is not supported yet

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

  // Method read_until_finish contains an OUT parameter, which is not supported yet

  // Method read_upto contains an OUT parameter, which is not supported yet

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

  // Method read_upto_finish contains an OUT parameter, which is not supported yet

  def setByteOrder(order: GDataStreamByteOrder): Unit =
    g_data_input_stream_set_byte_order(this.raw.asInstanceOf, order)

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
  def apply(base_stream: InputStream): DataInputStream = new DataInputStream(
    g_data_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end DataInputStream
