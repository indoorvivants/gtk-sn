package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GOutputStream
import sn.gnome.gio.internal.GOutputStreamSpliceFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object

class OutputStream(raw: Ptr[GOutputStream]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearPending(): Unit = g_output_stream_clear_pending(
    this.raw.asInstanceOf
  )

  def close(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_output_stream_close(
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
  ): Unit = g_output_stream_close_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def closeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_output_stream_close_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def flush(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_output_stream_flush(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def flushAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_output_stream_flush_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def flushFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_output_stream_flush_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def hasPending(): Boolean =
    g_output_stream_has_pending(this.raw.asInstanceOf).value.!=(0)

  def isClosed(): Boolean =
    g_output_stream_is_closed(this.raw.asInstanceOf).value.!=(0)

  def isClosing(): Boolean =
    g_output_stream_is_closing(this.raw.asInstanceOf).value.!=(0)

  // Method printf contains an OUT parameter, which is not supported yet

  def setPending(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_output_stream_set_pending(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def splice(
      source: InputStream,
      flags: GOutputStreamSpliceFlags,
      cancellable: Cancellable
  ): GResult[CLongInt] = GResult.wrap(__errorPtr =>
    g_output_stream_splice(
      this.raw.asInstanceOf,
      source.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  def spliceAsync(
      source: InputStream,
      flags: GOutputStreamSpliceFlags,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_output_stream_splice_async(
    this.raw.asInstanceOf,
    source.getUnsafeRawPointer().asInstanceOf,
    flags,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def spliceFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_output_stream_splice_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  // Method vprintf contains an OUT parameter, which is not supported yet

  // Method write contains an array parameter, which is not supported yet

  // Method write_all contains an array parameter, which is not supported yet

  // Method write_all_async contains an array parameter, which is not supported yet

  // Method write_all_finish contains an OUT parameter, which is not supported yet

  // Method write_async contains an array parameter, which is not supported yet

  def writeBytes(
      bytes: Ptr[GBytes],
      cancellable: Cancellable
  ): GResult[CLongInt] = GResult.wrap(__errorPtr =>
    g_output_stream_write_bytes(
      this.raw.asInstanceOf,
      bytes,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value
  )

  def writeBytesAsync(
      bytes: Ptr[GBytes],
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_output_stream_write_bytes_async(
    this.raw.asInstanceOf,
    bytes,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def writeBytesFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_output_stream_write_bytes_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def writeFinish(result: AsyncResult): GResult[CLongInt] =
    GResult.wrap(__errorPtr =>
      g_output_stream_write_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  // Method writev contains an array parameter, which is not supported yet

  // Method writev_all contains an array parameter, which is not supported yet

  // Method writev_all_async contains an array parameter, which is not supported yet

  // Method writev_all_finish contains an OUT parameter, which is not supported yet

  // Method writev_async contains an array parameter, which is not supported yet

  // Method writev_finish contains an OUT parameter, which is not supported yet

end OutputStream
