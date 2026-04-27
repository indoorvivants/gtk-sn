package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GInputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object

class InputStream(raw: Ptr[GInputStream]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearPending(): Unit = g_input_stream_clear_pending(this.raw.asInstanceOf)

  def close(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_input_stream_close(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def closeAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_close_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def closeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_input_stream_close_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def hasPending(): Boolean =
    g_input_stream_has_pending(this.raw.asInstanceOf).value.!=(0)

  def isClosed(): Boolean =
    g_input_stream_is_closed(this.raw.asInstanceOf).value.!=(0)

  // Method read contains an array parameter, which is not supported yet

  // Method read_all contains an array parameter, which is not supported yet

  // Method read_all_async contains an array parameter, which is not supported yet

  // Method read_all_finish contains an OUT parameter, which is not supported yet

  // Method read_async contains an array parameter, which is not supported yet

  def readBytes(
      count: CUnsignedLongInt,
      cancellable: Cancellable
  ): GResult[Ptr[GBytes]] = GResult.wrap(__errorPtr =>
    g_input_stream_read_bytes(
      this.raw.asInstanceOf,
      gsize(count),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def readBytesAsync(
      count: CUnsignedLongInt,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_read_bytes_async(
    this.raw.asInstanceOf,
    gsize(count),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readBytesFinish(result: AsyncResult): GResult[Ptr[GBytes]] =
    GResult.wrap(__errorPtr =>
      g_input_stream_read_bytes_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  def readFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_input_stream_read_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def setPending(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_input_stream_set_pending(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def skip(
      count: CUnsignedLongInt,
      cancellable: Cancellable
  ): GResult[CLongInt] = GResult.wrap(__errorPtr =>
    g_input_stream_skip(
      this.raw.asInstanceOf,
      gsize(count),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  def skipAsync(
      count: CUnsignedLongInt,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_input_stream_skip_async(
    this.raw.asInstanceOf,
    gsize(count),
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def skipFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_input_stream_skip_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

end InputStream
