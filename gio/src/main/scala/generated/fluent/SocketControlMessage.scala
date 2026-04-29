package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GSocketControlMessage
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GSocketControlMessage is a special-purpose utility message that can be
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
  */
class SocketControlMessage(raw: Ptr[GSocketControlMessage])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the "level" (i.e. the originating protocol) of the control
    * message. This is often SOL_SOCKET.
    */
  def getLevel(): Int = g_socket_control_message_get_level(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the protocol specific type of the control message. For instance,
    * for UNIX fd passing this would be SCM_RIGHTS.
    */
  def getMsgType(): Int = g_socket_control_message_get_msg_type(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the space required for the control message, not including headers
    * or alignment.
    */
  def getSize(): CUnsignedLongInt = g_socket_control_message_get_size(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts the data in the message to bytes placed in the message.
    *
    * @data
    *   is guaranteed to have enough space to fit the size returned by
    *   g_socket_control_message_get_size() on this object.
    */
  def serialize(data: Ptr[Byte]): Unit =
    g_socket_control_message_serialize(this.raw.asInstanceOf, gpointer(data))

end SocketControlMessage
