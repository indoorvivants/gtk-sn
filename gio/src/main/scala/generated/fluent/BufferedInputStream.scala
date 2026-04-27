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

class BufferedInputStream(raw: Ptr[GBufferedInputStream])
    extends FilterInputStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def fill(count: CLongInt, cancellable: Cancellable): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_buffered_input_stream_fill(
        this.raw.asInstanceOf,
        gssize(count),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def fillAsync(
      count: CLongInt,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_buffered_input_stream_fill_async(
    this.raw.asInstanceOf,
    gssize(count),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def fillFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_buffered_input_stream_fill_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def getAvailable(): CUnsignedLongInt = g_buffered_input_stream_get_available(
    this.raw.asInstanceOf
  ).value

  def getBufferSize(): CUnsignedLongInt =
    g_buffered_input_stream_get_buffer_size(this.raw.asInstanceOf).value

  // Method peek contains an array parameter, which is not supported yet

  // Method peek_buffer contains an OUT parameter, which is not supported yet

  def readByte(cancellable: Cancellable): GResult[Int] =
    GResult.wrap(__errorPtr =>
      g_buffered_input_stream_read_byte(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  def setBufferSize(size: CUnsignedLongInt): Unit =
    g_buffered_input_stream_set_buffer_size(this.raw.asInstanceOf, gsize(size))

end BufferedInputStream

object BufferedInputStream:
  def apply(base_stream: InputStream): BufferedInputStream =
    new BufferedInputStream(
      g_buffered_input_stream_new(
        base_stream.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  def sized(
      base_stream: InputStream,
      size: CUnsignedLongInt
  ): BufferedInputStream = new BufferedInputStream(
    g_buffered_input_stream_new_sized(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      gsize(size)
    ).asInstanceOf
  )
end BufferedInputStream
