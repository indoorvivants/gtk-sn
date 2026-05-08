package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{InputStream, PollableInputStream, Seekable}
import sn.gnome.gio.internal.GMemoryInputStream
import sn.gnome.gobject.runtime.*

/** #GMemoryInputStream is a class for using arbitrary memory chunks as input
  * for GIO streaming input operations.
  *
  * As of GLib 2.34, #GMemoryInputStream implements #GPollableInputStream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MemoryInputStream(raw: Ptr[GMemoryInputStream])
    extends InputStream(raw.asInstanceOf),
      PollableInputStream,
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends @bytes to data that can be read from the input stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_bytes/<method parameters>/bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def addBytes__ = ???

  /** Appends @data to data that can be read from the input stream
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_data/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))"
  )
  private def addData__ = ???

end MemoryInputStream

object MemoryInputStream:
  /** Creates a new empty #GMemoryInputStream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): MemoryInputStream =
    val raw: Ptr[Byte] = g_memory_input_stream_new().asInstanceOf
    summon[Runtime].getOrCreate[MemoryInputStream](
      raw,
      r => new MemoryInputStream(r.asInstanceOf)
    )
  end apply

  /** Creates a new #GMemoryInputStream with data from the given @bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def new_from_bytes() = ???

  /** Creates a new #GMemoryInputStream with data in memory of a given size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))"
  )
  private def new_from_data() = ???

end MemoryInputStream
