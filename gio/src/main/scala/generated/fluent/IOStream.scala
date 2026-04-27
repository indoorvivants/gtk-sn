package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GIOStream
import sn.gnome.gio.internal.GIOStreamSpliceFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class IOStream(raw: Ptr[GIOStream]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearPending(): Unit = g_io_stream_clear_pending(this.raw.asInstanceOf)

  def close(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_io_stream_close(
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
  ): Unit = g_io_stream_close_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def closeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_io_stream_close_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def getInputStream(): InputStream = new InputStream(
    g_io_stream_get_input_stream(this.raw.asInstanceOf).asInstanceOf
  )

  def getOutputStream(): OutputStream = new OutputStream(
    g_io_stream_get_output_stream(this.raw.asInstanceOf).asInstanceOf
  )

  def hasPending(): Boolean =
    g_io_stream_has_pending(this.raw.asInstanceOf).value.!=(0)

  def isClosed(): Boolean =
    g_io_stream_is_closed(this.raw.asInstanceOf).value.!=(0)

  def setPending(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_io_stream_set_pending(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def spliceAsync(
      stream2: IOStream,
      flags: GIOStreamSpliceFlags,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_io_stream_splice_async(
    this.raw.asInstanceOf,
    stream2.getUnsafeRawPointer().asInstanceOf,
    flags,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

end IOStream
