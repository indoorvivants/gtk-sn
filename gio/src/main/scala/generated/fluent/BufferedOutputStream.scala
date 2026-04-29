package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.FilterOutputStream
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.fluent.Seekable
import sn.gnome.gio.internal.GBufferedOutputStream
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gsize

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Buffered output stream implements #GFilterOutputStream and provides for
  * buffered writes.
  *
  * By default, #GBufferedOutputStream's buffer size is set at 4 kilobytes.
  *
  * To create a buffered output stream, use g_buffered_output_stream_new(), or
  * g_buffered_output_stream_new_sized() to specify the buffer's size at
  * construction.
  *
  * To get the size of a buffer within a buffered input stream, use
  * g_buffered_output_stream_get_buffer_size(). To change the size of a buffered
  * output stream's buffer, use g_buffered_output_stream_set_buffer_size(). Note
  * that the buffer's size cannot be reduced below the size of the data within
  * the buffer.
  */
class BufferedOutputStream(raw: Ptr[GBufferedOutputStream])
    extends FilterOutputStream(raw.asInstanceOf),
      Seekable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the buffer automatically grows as data is added.
    */
  def getAutoGrow(): Boolean =
    g_buffered_output_stream_get_auto_grow(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the size of the buffer in the @stream.
    */
  def getBufferSize(): CUnsignedLongInt =
    g_buffered_output_stream_get_buffer_size(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether or not the @stream's buffer should automatically grow. If @auto_grow
    * is true, then each write will just make the buffer larger, and you must
    * manually flush the buffer to actually write out the data to the underlying
    * stream.
    */
  def setAutoGrow(auto_grow: Boolean): Unit =
    g_buffered_output_stream_set_auto_grow(
      this.raw.asInstanceOf,
      gboolean(gint((if auto_grow == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the size of the internal buffer to @size.
    */
  def setBufferSize(size: CUnsignedLongInt): Unit =
    g_buffered_output_stream_set_buffer_size(this.raw.asInstanceOf, gsize(size))

end BufferedOutputStream

object BufferedOutputStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new buffered output stream for a base stream.
    */
  def apply(base_stream: OutputStream): BufferedOutputStream =
    new BufferedOutputStream(
      g_buffered_output_stream_new(
        base_stream.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new buffered output stream with a given buffer size.
    */
  def sized(
      base_stream: OutputStream,
      size: CUnsignedLongInt
  ): BufferedOutputStream = new BufferedOutputStream(
    g_buffered_output_stream_new_sized(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      gsize(size)
    ).asInstanceOf
  )
end BufferedOutputStream
