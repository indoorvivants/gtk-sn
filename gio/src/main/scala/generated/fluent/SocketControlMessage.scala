package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GSocketControlMessage
import sn.gnome.glib.internal.{gpointer, gsize}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** A #GSocketControlMessage is a special-purpose utility message that can be
  * sent to or received from a #GSocket. These types of messages are often
  * called "ancillary data".
  *
  * The message can represent some sort of special instruction to or information
  * from the socket or can represent a special kind of transfer to the peer (for
  * example, sending a file descriptor over a UNIX socket).
  *
  * These messages are sent with g_socket_send_message() and received with
  * g_socket_receive_message().
  *
  * To extend the set of control message that can be sent, subclass this class
  * and override the get_size, get_level, get_type and serialize methods.
  *
  * To extend the set of control messages that can be received, subclass this
  * class and implement the deserialize method. Also, make sure your class is
  * registered with the GType typesystem before calling
  * g_socket_receive_message() to read such a message.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketControlMessage private[gnome] (raw: Ptr[GSocketControlMessage])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the "level" (i.e. the originating protocol) of the control
    * message. This is often SOL_SOCKET.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLevel(): Int /* None */ =
    g_socket_control_message_get_level(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketControlMessage]]
    )
  end getLevel

  /** Returns the protocol specific type of the control message. For instance,
    * for UNIX fd passing this would be SCM_RIGHTS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMsgType(): Int /* None */ =
    g_socket_control_message_get_msg_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketControlMessage]]
    )
  end getMsgType

  /** Returns the space required for the control message, not including headers
    * or alignment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): CUnsignedLongInt /* None */ =
    g_socket_control_message_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketControlMessage]]
    ).value
  end getSize

  /** Converts the data in the message to bytes placed in the message.
    *
    * @data
    *   is guaranteed to have enough space to fit the size returned by
    *   g_socket_control_message_get_size() on this object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def serialize(
      data: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* None */ =
    g_socket_control_message_serialize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketControlMessage]],
      gpointer(data)
    )
  end serialize

end SocketControlMessage

object SocketControlMessage:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GSocketControlMessage])(using Runtime) =
    summon[Runtime].getOrCreate[SocketControlMessage](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SocketControlMessage(ptr)
    )

  /** Tries to deserialize a socket control message of a given
    * @level
    *   and @type. This will ask all known (to GType) subclasses of
    *   #GSocketControlMessage if they can understand this kind of message and
    *   if so deserialize it into a #GSocketControlMessage.
    *
    * If there is no implementation for this kind of control message, %NULL will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function deserialize/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(gpointer)))"
  )
  private def deserialize() = ???

end SocketControlMessage
