package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{InputStream, PollableInputStream, Seekable}
import sn.gnome.gio.internal.GMemoryInputStream

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def addBytes__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @data to data that can be read from the input stream
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))"
  )
  def addData__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def new_from_bytes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GMemoryInputStream with data in memory of a given size.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))"
  )
  def new_from_data() = ???

end MemoryInputStream
