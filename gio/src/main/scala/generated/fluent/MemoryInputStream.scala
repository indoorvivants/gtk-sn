package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.PollableInputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GMemoryInputStream
import sn.gnome.glib.internal.GBytes

class MemoryInputStream(raw: Ptr[GMemoryInputStream])
    extends InputStream(raw.asInstanceOf),
      PollableInputStream,
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addBytes(bytes: Ptr[GBytes]): Unit =
    g_memory_input_stream_add_bytes(this.raw.asInstanceOf, bytes)

  // Method add_data contains an array parameter, which is not supported yet

end MemoryInputStream

object MemoryInputStream:
  def apply(): MemoryInputStream = new MemoryInputStream(
    g_memory_input_stream_new().asInstanceOf
  )
  def fromBytes(bytes: Ptr[GBytes]): MemoryInputStream = new MemoryInputStream(
    g_memory_input_stream_new_from_bytes(bytes).asInstanceOf
  )
end MemoryInputStream
