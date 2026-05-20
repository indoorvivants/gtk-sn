package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.Cancellable
import sn.gnome.glib.Source
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

trait PollableOutputStream:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Checks if @stream is actually pollable. Some classes may implement
    * #GPollableOutputStream but have only certain instances of that class be
    * pollable. If this method returns %FALSE, then the behavior of other
    * #GPollableOutputStream methods is undefined.
    *
    * For any given stream, the value returned by this method is constant; a
    * stream cannot switch from pollable to non-pollable or vice versa.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canPoll(): Boolean /* None */ =
    g_pollable_output_stream_can_poll(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPollableOutputStream]]
    ).value.!=(0)
  end canPoll

  /** Creates a #GSource that triggers when @stream can be written, or
    * @cancellable
    *   is triggered or an error occurs. The callback on the source is of the
    *   #GPollableSourceFunc type.
    *
    * As with g_pollable_output_stream_is_writable(), it is possible that the
    * stream may not actually be writable even after the source triggers, so you
    * should use g_pollable_output_stream_write_nonblocking() rather than
    * g_output_stream_write() from the callback.
    *
    * The behaviour of this method is undefined if
    * g_pollable_output_stream_can_poll() returns %FALSE for @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createSource(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): sn.gnome.glib.Source /* None */ =
    sn.gnome.glib.Source.fromRaw(
      g_pollable_output_stream_create_source(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GPollableOutputStream]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]])
      )
    )
  end createSource

  /** Checks if @stream can be written.
    *
    * Note that some stream types may not be able to implement this 100%
    * reliably, and it is possible that a call to g_output_stream_write() after
    * this returns %TRUE would still block. To guarantee non-blocking behavior,
    * you should always use g_pollable_output_stream_write_nonblocking(), which
    * will return a %G_IO_ERROR_WOULD_BLOCK error rather than blocking.
    *
    * The behaviour of this method is undefined if
    * g_pollable_output_stream_can_poll() returns %FALSE for @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWritable(): Boolean /* None */ =
    g_pollable_output_stream_is_writable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPollableOutputStream]]
    ).value.!=(0)
  end isWritable

  /** Attempts to write up to @count bytes from @buffer to @stream, as with
    * g_output_stream_write(). If @stream is not currently writable, this will
    * immediately return %G_IO_ERROR_WOULD_BLOCK, and you can use
    * g_pollable_output_stream_create_source() to create a #GSource that will be
    * triggered when @stream is writable.
    *
    * Note that since this method never blocks, you cannot actually use @cancellable
    * to cancel it. However, it will return an error if @cancellable has already
    * been cancelled when you call, which may happen if you call this method
    * after a source triggers due to having been cancelled.
    *
    * Also note that if %G_IO_ERROR_WOULD_BLOCK is returned some underlying
    * transports like D/TLS require that you re-send the same @buffer and
    * @count
    *   in the next write call.
    *
    * The behaviour of this method is undefined if
    * g_pollable_output_stream_can_poll() returns %FALSE for @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method write_nonblocking/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))"
  )
  private def writeNonblocking__ = ???

  /** Attempts to write the bytes contained in the @n_vectors @vectors to @stream,
    * as with g_output_stream_writev(). If @stream is not currently writable,
    * this will immediately return %@G_POLLABLE_RETURN_WOULD_BLOCK, and you can
    * use g_pollable_output_stream_create_source() to create a #GSource that
    * will be triggered when @stream is writable. @error will *not* be set in
    * that case.
    *
    * Note that since this method never blocks, you cannot actually use @cancellable
    * to cancel it. However, it will return an error if @cancellable has already
    * been cancelled when you call, which may happen if you call this method
    * after a source triggers due to having been cancelled.
    *
    * Also note that if %G_POLLABLE_RETURN_WOULD_BLOCK is returned some
    * underlying transports like D/TLS require that you re-send the same @vectors
    * and
    * @n_vectors
    *   in the next write call.
    *
    * The behaviour of this method is undefined if
    * g_pollable_output_stream_can_poll() returns %FALSE for @stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method writev_nonblocking]: Method writev_nonblocking contains an OUT parameter, which is not supported yet"
  )
  private def writevNonblocking__ = ???

end PollableOutputStream

object PollableOutputStream:
  class Abstract(raw: Ptr[Byte]) extends PollableOutputStream:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end PollableOutputStream
