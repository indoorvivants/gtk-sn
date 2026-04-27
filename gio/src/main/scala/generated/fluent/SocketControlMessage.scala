package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GSocketControlMessage
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.gobject.fluent.Object

class SocketControlMessage(raw: Ptr[GSocketControlMessage])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getLevel(): Int = g_socket_control_message_get_level(
    this.raw.asInstanceOf
  )

  def getMsgType(): Int = g_socket_control_message_get_msg_type(
    this.raw.asInstanceOf
  )

  def getSize(): CUnsignedLongInt = g_socket_control_message_get_size(
    this.raw.asInstanceOf
  ).value

  def serialize(data: Ptr[Byte]): Unit =
    g_socket_control_message_serialize(this.raw.asInstanceOf, gpointer(data))

end SocketControlMessage
