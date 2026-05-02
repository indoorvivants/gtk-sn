package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.PollableInputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GMemoryInputStream
import sn.gnome.glib.internal.GBytes

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMemoryInputStream is a class for using arbitrary memory chunks as input
  * for GIO streaming input operations.
  *
  * As of GLib 2.34, #GMemoryInputStream implements #GPollableInputStream.
  */
class MemoryInputStream(raw: Ptr[GMemoryInputStream])
    extends InputStream(raw.asInstanceOf),
      PollableInputStream,
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @bytes to data that can be read from the input stream.
    */
  def addBytes(
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  ): Unit /* None */ = g_memory_input_stream_add_bytes(
    this.raw.asInstanceOf[Ptr[GMemoryInputStream]],
    bytes
  )

end MemoryInputStream

object MemoryInputStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty #GMemoryInputStream.
    */
  def apply(): MemoryInputStream = new MemoryInputStream(
    g_memory_input_stream_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GMemoryInputStream with data from the given @bytes.
    */
  def fromBytes(
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  ): MemoryInputStream = new MemoryInputStream(
    g_memory_input_stream_new_from_bytes(bytes).asInstanceOf
  )
end MemoryInputStream
