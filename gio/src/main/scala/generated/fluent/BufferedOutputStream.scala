package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{FilterOutputStream, OutputStream, Seekable}
import sn.gnome.gio.internal.GBufferedOutputStream
import sn.gnome.glib.internal.{gboolean, gint, gsize}
import sn.gnome.gobject.runtime.*

/** Buffered output stream implements #GFilterOutputStream and provides for
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BufferedOutputStream private[gnome] (raw: Ptr[GBufferedOutputStream])
    extends FilterOutputStream(raw.asInstanceOf),
      Seekable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Checks if the buffer automatically grows as data is added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutoGrow(): Boolean /* None */ =
    g_buffered_output_stream_get_auto_grow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBufferedOutputStream]]
    ).value.!=(0)
  end getAutoGrow

  /** Gets the size of the buffer in the @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBufferSize(): CUnsignedLongInt /* None */ =
    g_buffered_output_stream_get_buffer_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBufferedOutputStream]]
    ).value
  end getBufferSize

  /** Sets whether or not the @stream's buffer should automatically grow. If @auto_grow
    * is true, then each write will just make the buffer larger, and you must
    * manually flush the buffer to actually write out the data to the underlying
    * stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutoGrow(
      auto_grow: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_buffered_output_stream_set_auto_grow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBufferedOutputStream]],
      gboolean(gint((if auto_grow == true then 1 else 0)))
    )
  end setAutoGrow

  /** Sets the size of the internal buffer to @size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBufferSize(
      size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): Unit /* None */ =
    g_buffered_output_stream_set_buffer_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBufferedOutputStream]],
      gsize(size)
    )
  end setBufferSize

end BufferedOutputStream

object BufferedOutputStream:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GBufferedOutputStream])(using Runtime) =
    summon[Runtime].getOrCreate[BufferedOutputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BufferedOutputStream(ptr)
    )

  /** Creates a new buffered output stream for a base stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      base_stream: sn.gnome.gio.fluent.OutputStream /* Some(Ptr[GOutputStream]) */
  )(using Runtime): BufferedOutputStream =
    val raw: Ptr[Byte] = g_buffered_output_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[BufferedOutputStream](
      raw,
      r => BufferedOutputStream.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new buffered output stream with a given buffer size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sized(
      base_stream: sn.gnome.gio.fluent.OutputStream /* Some(Ptr[GOutputStream]) */,
      size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  )(using Runtime): BufferedOutputStream =
    val raw: Ptr[Byte] = g_buffered_output_stream_new_sized(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      gsize(size)
    ).asInstanceOf
    summon[Runtime].getOrCreate[BufferedOutputStream](
      raw,
      r => BufferedOutputStream.applyUnsafe(r.asInstanceOf)
    )
  end sized
end BufferedOutputStream
