package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Socket
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GSocketListener
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.fluent.Object

class SocketListener(raw: Ptr[GSocketListener])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method accept contains an OUT parameter, which is not supported yet

  def acceptAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_socket_listener_accept_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  // Method accept_finish contains an OUT parameter, which is not supported yet

  // Method accept_socket contains an OUT parameter, which is not supported yet

  def acceptSocketAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_socket_listener_accept_socket_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  // Method accept_socket_finish contains an OUT parameter, which is not supported yet

  // Method add_address contains an OUT parameter, which is not supported yet

  def addAnyInetPort(source_object: Object): GResult[UShort] =
    GResult.wrap(__errorPtr =>
      g_socket_listener_add_any_inet_port(
        this.raw.asInstanceOf,
        source_object.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  def addInetPort(port: UShort, source_object: Object): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_socket_listener_add_inet_port(
        this.raw.asInstanceOf,
        guint16(port),
        source_object.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def addSocket(socket: Socket, source_object: Object): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_socket_listener_add_socket(
        this.raw.asInstanceOf,
        socket.getUnsafeRawPointer().asInstanceOf,
        source_object.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def close(): Unit = g_socket_listener_close(this.raw.asInstanceOf)

  def setBacklog(listen_backlog: Int): Unit =
    g_socket_listener_set_backlog(this.raw.asInstanceOf, listen_backlog)

end SocketListener

object SocketListener:
  def apply(): SocketListener = new SocketListener(
    g_socket_listener_new().asInstanceOf
  )
end SocketListener
