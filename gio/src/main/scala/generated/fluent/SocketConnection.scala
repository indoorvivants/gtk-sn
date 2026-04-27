package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.Socket
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GSocketConnection
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer

class SocketConnection(raw: Ptr[GSocketConnection])
    extends IOStream(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def connect(
      address: SocketAddress,
      cancellable: Cancellable
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_connection_connect(
      this.raw.asInstanceOf,
      address.getUnsafeRawPointer().asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def connectAsync(
      address: SocketAddress,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_socket_connection_connect_async(
    this.raw.asInstanceOf,
    address.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def connectFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_socket_connection_connect_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def getLocalAddress(): GResult[SocketAddress] = GResult.wrap(__errorPtr =>
    new SocketAddress(
      g_socket_connection_get_local_address(
        this.raw.asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def getRemoteAddress(): GResult[SocketAddress] = GResult.wrap(__errorPtr =>
    new SocketAddress(
      g_socket_connection_get_remote_address(
        this.raw.asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def getSocket(): Socket = new Socket(
    g_socket_connection_get_socket(this.raw.asInstanceOf).asInstanceOf
  )

  def isConnected(): Boolean =
    g_socket_connection_is_connected(this.raw.asInstanceOf).value.!=(0)

end SocketConnection
