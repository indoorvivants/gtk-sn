package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.glib.fluent.{GResult, IOCondition}
import sn.gnome.glib.internal.{gboolean, gint, gint64}
import sn.gnome.gobject.runtime.*

trait DatagramBased:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Checks on the readiness of @datagram_based to perform operations. The
    * operations specified in @condition are checked for and masked against the
    * currently-satisfied conditions on @datagram_based. The result is returned.
    *
    * %G_IO_IN will be set in the return value if data is available to read with
    * g_datagram_based_receive_messages(), or if the connection is closed
    * remotely (EOS); and if the datagram_based has not been closed locally
    * using some implementation-specific method (such as g_socket_close() or
    * g_socket_shutdown() with @shutdown_read set, if it’s a #GSocket).
    *
    * If the connection is shut down or closed (by calling g_socket_close() or
    * g_socket_shutdown() with @shutdown_read set, if it’s a #GSocket, for
    * example), all calls to this function will return %G_IO_ERROR_CLOSED.
    *
    * %G_IO_OUT will be set if it is expected that at least one byte can be sent
    * using g_datagram_based_send_messages() without blocking. It will not be
    * set if the datagram_based has been closed locally.
    *
    * %G_IO_HUP will be set if the connection has been closed locally.
    *
    * %G_IO_ERR will be set if there was an asynchronous error in transmitting
    * data previously enqueued using g_datagram_based_send_messages().
    *
    * Note that on Windows, it is possible for an operation to return
    * %G_IO_ERROR_WOULD_BLOCK even immediately after
    * g_datagram_based_condition_check() has claimed that the #GDatagramBased is
    * ready for writing. Rather than calling g_datagram_based_condition_check()
    * and then writing to the #GDatagramBased if it succeeds, it is generally
    * better to simply try writing right away, and try again later if the
    * initial attempt returns %G_IO_ERROR_WOULD_BLOCK.
    *
    * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in @condition; these
    * conditions will always be set in the output if they are true. Apart from
    * these flags, the output is guaranteed to be masked by @condition.
    *
    * This call never blocks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def conditionCheck(
      condition: IOCondition /* Some(_root_.sn.gnome.glib.internal.GIOCondition) */
  ): IOCondition /* None */ =
    IOCondition.fromRaw(
      g_datagram_based_condition_check(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDatagramBased]],
        condition.raw
      )
    )
  end conditionCheck

  /** Waits for up to @timeout microseconds for condition to become true on
    * @datagram_based.
    *   If the condition is met, %TRUE is returned.
    *
    * If @cancellable is cancelled before the condition is met, or if @timeout
    * is reached before the condition is met, then %FALSE is returned and @error
    * is set appropriately (%G_IO_ERROR_CANCELLED or %G_IO_ERROR_TIMED_OUT).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def conditionWait(
      condition: IOCondition /* Some(_root_.sn.gnome.glib.internal.GIOCondition) */,
      timeout: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_datagram_based_condition_wait(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDatagramBased]],
        condition.raw,
        gint64(timeout),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end conditionWait

  /** Creates a #GSource that can be attached to a #GMainContext to monitor for
    * the availability of the specified @condition on the #GDatagramBased. The
    * #GSource keeps a reference to the @datagram_based.
    *
    * The callback on the source is of the #GDatagramBasedSourceFunc type.
    *
    * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in @condition; these
    * conditions will always be reported in the callback if they are true.
    *
    * If non-%NULL, @cancellable can be used to cancel the source, which will
    * cause the source to trigger, reporting the current condition (which is
    * likely 0 unless cancellation happened at the same time as a condition
    * change). You can check for this in the callback using
    * g_cancellable_is_cancelled().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method create_source/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  private def createSource__ = ???

  /** Receive one or more data messages from @datagram_based in one go.
    *
    * @messages
    *   must point to an array of #GInputMessage structs and
    * @num_messages
    *   must be the length of this array. Each #GInputMessage contains a pointer
    *   to an array of #GInputVector structs describing the buffers that the
    *   data received in each message will be written to.
    *
    * @flags
    *   modify how all messages are received. The commonly available arguments
    *   for this are available in the #GSocketMsgFlags enum, but the values
    *   there are the same as the system values, and the flags are passed in
    *   as-is, so you can pass in system-specific flags too. These flags affect
    *   the overall receive operation. Flags affecting individual messages are
    *   returned in #GInputMessage.flags.
    *
    * The other members of #GInputMessage are treated as described in its
    * documentation.
    *
    * If @timeout is negative the call will block until @num_messages have been
    * received, the connection is closed remotely (EOS), @cancellable is
    * cancelled, or an error occurs.
    *
    * If @timeout is 0 the call will return up to @num_messages without
    * blocking, or %G_IO_ERROR_WOULD_BLOCK if no messages are queued in the
    * operating system to be received.
    *
    * If @timeout is positive the call will block on the same conditions as if
    * @timeout
    *   were negative. If the timeout is reached before any messages are
    *   received, %G_IO_ERROR_TIMED_OUT is returned, otherwise it will return
    *   the number of messages received before timing out. (Note: This is
    *   effectively the behaviour of `MSG_WAITFORONE` with recvmmsg().)
    *
    * To be notified when messages are available, wait for the %G_IO_IN
    * condition. Note though that you may still receive %G_IO_ERROR_WOULD_BLOCK
    * from g_datagram_based_receive_messages() even if you were previously
    * notified of a %G_IO_IN condition.
    *
    * If the remote peer closes the connection, any messages queued in the
    * underlying receive buffer will be returned, and subsequent calls to
    * g_datagram_based_receive_messages() will return 0 (with no error set).
    *
    * If the connection is shut down or closed (by calling g_socket_close() or
    * g_socket_shutdown() with @shutdown_read set, if it’s a #GSocket, for
    * example), all calls to this function will return %G_IO_ERROR_CLOSED.
    *
    * On error -1 is returned and @error is set accordingly. An error will only
    * be returned if zero messages could be received; otherwise the number of
    * messages successfully received before the error will be returned. If
    * @cancellable
    *   is cancelled, %G_IO_ERROR_CANCELLED is returned as with any other error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method receive_messages/<method parameters>/messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InputMessage), @type -> DataRecord(GInputMessage)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GInputMessage*)))"
  )
  private def receiveMessages__ = ???

  /** Send one or more data messages from @datagram_based in one go.
    *
    * @messages
    *   must point to an array of #GOutputMessage structs and
    * @num_messages
    *   must be the length of this array. Each #GOutputMessage contains an
    *   address to send the data to, and a pointer to an array of #GOutputVector
    *   structs to describe the buffers that the data to be sent for each
    *   message will be gathered from.
    *
    * @flags
    *   modify how the message is sent. The commonly available arguments for
    *   this are available in the #GSocketMsgFlags enum, but the values there
    *   are the same as the system values, and the flags are passed in as-is, so
    *   you can pass in system-specific flags too.
    *
    * The other members of #GOutputMessage are treated as described in its
    * documentation.
    *
    * If @timeout is negative the call will block until @num_messages have been
    * sent, @cancellable is cancelled, or an error occurs.
    *
    * If @timeout is 0 the call will send up to @num_messages without blocking,
    * or will return %G_IO_ERROR_WOULD_BLOCK if there is no space to send
    * messages.
    *
    * If @timeout is positive the call will block on the same conditions as if
    * @timeout
    *   were negative. If the timeout is reached before any messages are sent,
    *   %G_IO_ERROR_TIMED_OUT is returned, otherwise it will return the number
    *   of messages sent before timing out.
    *
    * To be notified when messages can be sent, wait for the %G_IO_OUT
    * condition. Note though that you may still receive %G_IO_ERROR_WOULD_BLOCK
    * from g_datagram_based_send_messages() even if you were previously notified
    * of a %G_IO_OUT condition. (On Windows in particular, this is very common
    * due to the way the underlying APIs work.)
    *
    * If the connection is shut down or closed (by calling g_socket_close() or
    * g_socket_shutdown() with @shutdown_write set, if it’s a #GSocket, for
    * example), all calls to this function will return %G_IO_ERROR_CLOSED.
    *
    * On error -1 is returned and @error is set accordingly. An error will only
    * be returned if zero messages could be sent; otherwise the number of
    * messages successfully sent before the error will be returned. If @cancellable
    * is cancelled, %G_IO_ERROR_CANCELLED is returned as with any other error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method send_messages/<method parameters>/messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(OutputMessage), @type -> DataRecord(GOutputMessage)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GOutputMessage*)))"
  )
  private def sendMessages__ = ???

end DatagramBased

object DatagramBased:
  class Abstract(raw: Ptr[Byte]) extends DatagramBased:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DatagramBased
