package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.FilterOutputStream
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GDataOutputStream
import sn.gnome.gio.internal.GDataStreamByteOrder
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gint16
import sn.gnome.glib.internal.gint32
import sn.gnome.glib.internal.gint64
import sn.gnome.glib.internal.guchar
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.guint64

class DataOutputStream(raw: Ptr[GDataOutputStream])
    extends FilterOutputStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getByteOrder(): GDataStreamByteOrder =
    g_data_output_stream_get_byte_order(this.raw.asInstanceOf)

  def putByte(data: UByte, cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_data_output_stream_put_byte(
        this.raw.asInstanceOf,
        guchar(data),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def putInt16(data: CShort, cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_data_output_stream_put_int16(
        this.raw.asInstanceOf,
        gint16(data),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def putInt32(data: CInt, cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_data_output_stream_put_int32(
        this.raw.asInstanceOf,
        gint32(data),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def putInt64(data: CLongInt, cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_data_output_stream_put_int64(
        this.raw.asInstanceOf,
        gint64(data),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def putString(str: String | CString, cancellable: Cancellable)(using
      Zone
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_string(
      this.raw.asInstanceOf,
      __sn_extract_string(str),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def putUint16(data: UShort, cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_data_output_stream_put_uint16(
        this.raw.asInstanceOf,
        guint16(data),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def putUint32(data: UInt, cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_data_output_stream_put_uint32(
        this.raw.asInstanceOf,
        guint32(data),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def putUint64(
      data: CUnsignedLongInt,
      cancellable: Cancellable
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_uint64(
      this.raw.asInstanceOf,
      guint64(data),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def setByteOrder(order: GDataStreamByteOrder): Unit =
    g_data_output_stream_set_byte_order(this.raw.asInstanceOf, order)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DataOutputStream

object DataOutputStream:
  def apply(base_stream: OutputStream): DataOutputStream = new DataOutputStream(
    g_data_output_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end DataOutputStream
