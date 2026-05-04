package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  AsyncResult,
  Cancellable,
  IOStream,
  Socket,
  SocketAddress,
  SocketFamily,
  SocketType
}
import sn.gnome.gio.internal.GSocketConnection
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.internal.GType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GSocketConnection is a #GIOStream for a connected socket. They can be
  * created either by #GSocketClient when connecting to a host, or by
  * #GSocketListener when accepting a new client.
  *
  * The type of the #GSocketConnection object returned from these calls depends
  * on the type of the underlying socket that is in use. For instance, for a
  * TCP/IP connection it will be a #GTcpConnection.
  *
  * Choosing what type of object to construct is done with the socket connection
  * factory, and it is possible for 3rd parties to register custom socket
  * connection types for specific combination of socket family/type/protocol
  * using g_socket_connection_factory_register_type().
  *
  * To close a #GSocketConnection, use g_io_stream_close(). Closing both
  * substreams of the #GIOStream separately will not close the underlying
  * #GSocket.
  */
class SocketConnection(raw: Ptr[GSocketConnection])
    extends IOStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connect @connection to the specified remote address.
    */
  def connect(
      address: SocketAddress /* Some(Ptr[GSocketAddress]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_socket_connection_connect(
      this.raw.asInstanceOf[Ptr[GSocketConnection]],
      address.getUnsafeRawPointer().asInstanceOf,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously connect @connection to the specified remote address.
    *
    * This clears the #GSocket:blocking flag on @connection's underlying socket
    * if it is currently set.
    *
    * Use g_socket_connection_connect_finish() to retrieve the result.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def connectAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the result of a g_socket_connection_connect_async() call.
    */
  def connectFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_socket_connection_connect_finish(
      this.raw.asInstanceOf[Ptr[GSocketConnection]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Try to get the local address of a socket connection.
    */
  def getLocalAddress(): GResult[SocketAddress /* None */ ] =
    GResult.wrap(__errorPtr =>
      new SocketAddress(
        g_socket_connection_get_local_address(
          this.raw.asInstanceOf[Ptr[GSocketConnection]],
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Try to get the remote address of a socket connection.
    *
    * Since GLib 2.40, when used with g_socket_client_connect() or
    * g_socket_client_connect_async(), during emission of
    * %G_SOCKET_CLIENT_CONNECTING, this function will return the remote address
    * that will be used for the connection. This allows applications to print
    * e.g. "Connecting to example.com (10.42.77.3)...".
    */
  def getRemoteAddress(): GResult[SocketAddress /* None */ ] =
    GResult.wrap(__errorPtr =>
      new SocketAddress(
        g_socket_connection_get_remote_address(
          this.raw.asInstanceOf[Ptr[GSocketConnection]],
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the underlying #GSocket object of the connection. This can be useful
    * if you want to do something unusual on it not supported by the
    * #GSocketConnection APIs.
    */
  def getSocket(): Socket /* None */ = new Socket(
    g_socket_connection_get_socket(
      this.raw.asInstanceOf[Ptr[GSocketConnection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if @connection is connected. This is equivalent to calling
    * g_socket_is_connected() on @connection's underlying #GSocket.
    */
  def isConnected(): Boolean /* None */ = g_socket_connection_is_connected(
    this.raw.asInstanceOf[Ptr[GSocketConnection]]
  ).value.!=(0)

end SocketConnection

object SocketConnection:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the #GType to be used when creating socket connections on sockets
    * with the specified @family, @type and @protocol_id.
    *
    * If no type is registered, the #GSocketConnection base type is returned.
    */
  def factoryLookupType(
      family: SocketFamily /* Some(GSocketFamily) */,
      `type`: SocketType /* Some(GSocketType) */,
      protocol_id: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): GType /* Some(_root_.sn.gnome.gobject.internal.GType) */ =
    g_socket_connection_factory_lookup_type(
      family.raw,
      `type`.raw,
      gint(protocol_id)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the #GType to be used when creating socket connections on sockets
    * with the specified @family, @type and @protocol.
    *
    * If no type is registered, the #GSocketConnection base type is returned.
    */
  def factoryRegisterType(
      g_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      family: SocketFamily /* Some(GSocketFamily) */,
      `type`: SocketType /* Some(GSocketType) */,
      protocol: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* Some(Unit) */ = g_socket_connection_factory_register_type(
    g_type,
    family.raw,
    `type`.raw,
    gint(protocol)
  )

end SocketConnection
