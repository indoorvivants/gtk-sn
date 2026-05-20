package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.SocketAddress
import sn.gnome.gio.internal.GInputMessage
import sn.gnome.glib.internal.{gint, gsize, guint}
import sn.gnome.gobject.runtime.*

/** Structure used for scatter/gather data input when receiving multiple
  * messages or packets in one go. You generally pass in an array of empty
  * #GInputVectors and the operation will use all the buffers as if they were
  * one buffer, and will set @bytes_received to the total number of bytes
  * received across all #GInputVectors.
  *
  * This structure closely mirrors `struct mmsghdr` and `struct msghdr` from the
  * POSIX sockets API (see `man 2 recvmmsg`).
  *
  * If @address is non-%NULL then it is set to the source address the message
  * was received from, and the caller must free it afterwards.
  *
  * If @control_messages is non-%NULL then it is set to an array of control
  * messages received with the message (if any), and the caller must free it
  * afterwards. @num_control_messages is set to the number of elements in this
  * array, which may be zero.
  *
  * Flags relevant to this message will be returned in @flags. For example,
  * `MSG_EOR` or `MSG_TRUNC`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InputMessage private[gnome] (raw: Ptr[GInputMessage]):

  def getUnsafeRawPointer(): Ptr[GInputMessage] = this.raw

  /** return location for a #GSocketAddress, or %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def address(using Runtime): sn.gnome.gio.SocketAddress /* None */ =
    (!raw).address.asInstanceOf[Ptr[Ptr[GSocketAddress]]]

  /** return location for a #GSocketAddress, or %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def address_=(
      value: sn.gnome.gio.SocketAddress /* None */
  )(using Runtime): Unit = (!raw).address_=(
    value
      .getUnsafeRawPointer()
      .asInstanceOf
      .asInstanceOf[Ptr[Ptr[GSocketAddress]]]
  )

  /** pointer to an array of input vectors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field vectors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InputVector), @type -> DataRecord(GInputVector)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(GInputVector*)))"
  )
  private def vectors__ = ???

  /** the number of input vectors pointed to by @vectors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numVectors: UInt /* None */ =
    (!raw).num_vectors.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the number of input vectors pointed to by @vectors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numVectors_=(value: UInt /* None */ ): Unit = (!raw).num_vectors_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** will be set to the number of bytes that have been received
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bytesReceived: CUnsignedLongInt /* None */ =
    (!raw).bytes_received.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** will be set to the number of bytes that have been received
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bytesReceived_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).bytes_received_=(
      gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
    )

  /** collection of #GSocketMsgFlags for the received message, outputted by the
    * call
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: Int /* None */ =
    (!raw).flags.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** collection of #GSocketMsgFlags for the received message, outputted by the
    * call
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: Int /* None */ ): Unit =
    (!raw).flags_=(gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint])

  /** return location for a caller-allocated array of #GSocketControlMessages,
    * or %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field control_messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(SocketControlMessage), @type -> DataRecord(GSocketControlMessage**)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(6), @type -> DataRecord(GSocketControlMessage***)))"
  )
  private def controlMessages__ = ???

  /** return location for the number of elements in @control_messages
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numControlMessages: Ptr[guint] /* None */ = (!raw).num_control_messages
    .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]

  /** return location for the number of elements in @control_messages
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numControlMessages_=(value: Ptr[guint] /* None */ ): Unit =
    (!raw).num_control_messages_=(
      value.asInstanceOf.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
    )
end InputMessage

object InputMessage:
  def fromRaw(ptr: Ptr[GInputMessage]): InputMessage = new InputMessage(ptr)
end InputMessage
