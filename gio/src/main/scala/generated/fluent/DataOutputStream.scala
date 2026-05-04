package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  Cancellable,
  DataStreamByteOrder,
  FilterOutputStream,
  OutputStream,
  Seekable
}
import sn.gnome.gio.internal.GDataOutputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{
  gboolean,
  gint,
  gint16,
  gint32,
  gint64,
  guchar,
  guint16,
  guint32,
  guint64
}

/** Data output stream implements #GOutputStream and includes functions for
  * writing data directly to an output stream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DataOutputStream(raw: Ptr[GDataOutputStream])
    extends FilterOutputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the byte order for the stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getByteOrder(): DataStreamByteOrder /* None */ =
    DataStreamByteOrder.fromRaw(
      g_data_output_stream_get_byte_order(
        this.raw.asInstanceOf[Ptr[GDataOutputStream]]
      )
    )

  /** Puts a byte into the output stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putByte(
      data: UByte /* Some(_root_.sn.gnome.glib.internal.guchar) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_byte(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      guchar(data),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Puts a signed 16-bit integer into the output stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putInt16(
      data: CShort /* Some(_root_.sn.gnome.glib.internal.gint16) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_int16(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      gint16(data),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Puts a signed 32-bit integer into the output stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putInt32(
      data: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_int32(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      gint32(data),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Puts a signed 64-bit integer into the stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putInt64(
      data: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_int64(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      gint64(data),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Puts a string into the output stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putString(
      str: String | CString /* Some(CString) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_string(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      __sn_extract_string(str),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Puts an unsigned 16-bit integer into the output stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putUint16(
      data: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_uint16(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      guint16(data),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Puts an unsigned 32-bit integer into the stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putUint32(
      data: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_uint32(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      guint32(data),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Puts an unsigned 64-bit integer into the stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putUint64(
      data: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_data_output_stream_put_uint64(
      this.raw.asInstanceOf[Ptr[GDataOutputStream]],
      guint64(data),
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Sets the byte order of the data output stream to @order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setByteOrder(
      order: DataStreamByteOrder /* Some(GDataStreamByteOrder) */
  ): Unit /* None */ = g_data_output_stream_set_byte_order(
    this.raw.asInstanceOf[Ptr[GDataOutputStream]],
    order.raw
  )

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
  /** Creates a new data output stream for @base_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      base_stream: OutputStream /* Some(Ptr[GOutputStream]) */
  ): DataOutputStream = new DataOutputStream(
    g_data_output_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end DataOutputStream
