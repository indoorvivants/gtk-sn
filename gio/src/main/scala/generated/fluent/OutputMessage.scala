package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{OutputVector, SocketAddress}
import sn.gnome.gio.internal.GOutputMessage
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*

/** Structure used for scatter/gather data output when sending multiple messages
  * or packets in one go. You generally pass in an array of #GOutputVectors and
  * the operation will use all the buffers as if they were one buffer.
  *
  * If @address is %NULL then the message is sent to the default receiver (as
  * previously set by g_socket_connect()).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OutputMessage private[gnome] (raw: Ptr[GOutputMessage]):

  def getUnsafeRawPointer(): Ptr[GOutputMessage] = this.raw

  /** a #GSocketAddress, or %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def address(using Runtime): sn.gnome.gio.SocketAddress /* None */ =
    (!raw).address.asInstanceOf[Ptr[GSocketAddress]]

  /** a #GSocketAddress, or %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def address_=(
      value: sn.gnome.gio.SocketAddress /* None */
  )(using Runtime): Unit = (!raw).address_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GSocketAddress]]
  )

  /** pointer to an array of output vectors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def vectors: sn.gnome.gio.OutputVector /* None */ =
    (!raw).vectors.asInstanceOf[Ptr[GOutputVector]]

  /** pointer to an array of output vectors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def vectors_=(value: sn.gnome.gio.OutputVector /* None */ ): Unit =
    (!raw).vectors_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GOutputVector]]
    )

  /** the number of output vectors pointed to by @vectors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numVectors: UInt /* None */ =
    (!raw).num_vectors.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the number of output vectors pointed to by @vectors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numVectors_=(value: UInt /* None */ ): Unit = (!raw).num_vectors_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** initialize to 0. Will be set to the number of bytes that have been sent
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bytesSent: UInt /* None */ =
    (!raw).bytes_sent.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** initialize to 0. Will be set to the number of bytes that have been sent
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bytesSent_=(value: UInt /* None */ ): Unit = (!raw).bytes_sent_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** a pointer to an array of #GSocketControlMessages, or %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field control_messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(SocketControlMessage), @type -> DataRecord(GSocketControlMessage*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(5), @type -> DataRecord(GSocketControlMessage**)))"
  )
  private def controlMessages__ = ???

  /** number of elements in @control_messages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numControlMessages: UInt /* None */ = (!raw).num_control_messages
    .asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** number of elements in @control_messages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numControlMessages_=(value: UInt /* None */ ): Unit =
    (!raw).num_control_messages_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )
end OutputMessage

object OutputMessage:
  def fromRaw(ptr: Ptr[GOutputMessage]): OutputMessage = new OutputMessage(ptr)
end OutputMessage
