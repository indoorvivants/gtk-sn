package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.fluent.PollableOutputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GMemoryOutputStream
import sn.gnome.gio.internal.GReallocFunc
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize

class MemoryOutputStream(raw: Ptr[GMemoryOutputStream])
    extends OutputStream(raw.asInstanceOf),
      PollableOutputStream,
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getData(): Ptr[Byte] = g_memory_output_stream_get_data(
    this.raw.asInstanceOf
  ).value

  def getDataSize(): CUnsignedLongInt = g_memory_output_stream_get_data_size(
    this.raw.asInstanceOf
  ).value

  def getSize(): CUnsignedLongInt = g_memory_output_stream_get_size(
    this.raw.asInstanceOf
  ).value

  def stealAsBytes(): Ptr[GBytes] = g_memory_output_stream_steal_as_bytes(
    this.raw.asInstanceOf
  )

  def stealData(): Ptr[Byte] = g_memory_output_stream_steal_data(
    this.raw.asInstanceOf
  ).value

end MemoryOutputStream

object MemoryOutputStream:
  def apply(
      data: Ptr[Byte],
      size: CUnsignedLongInt,
      realloc_function: GReallocFunc,
      destroy_function: GDestroyNotify
  ): MemoryOutputStream = new MemoryOutputStream(
    g_memory_output_stream_new(
      gpointer(data),
      gsize(size),
      realloc_function,
      destroy_function
    ).asInstanceOf
  )
  def resizable(): MemoryOutputStream = new MemoryOutputStream(
    g_memory_output_stream_new_resizable().asInstanceOf
  )
end MemoryOutputStream
