package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  AsyncResult,
  IOStream,
  Socket,
  SocketAddress,
  SocketFamily,
  SocketType
}
import sn.gnome.gio.internal.GSocketConnection
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*

/** #GSocketConnection is a #GIOStream for a connected socket. They can be
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketConnection private[gnome] (raw: Ptr[GSocketConnection])
    extends IOStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Connect @connection to the specified remote address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject"
  )
  private def connect__ = ???

  /** Asynchronously connect @connection to the specified remote address.
    *
    * This clears the #GSocket:blocking flag on @connection's underlying socket
    * if it is currently set.
    *
    * Use g_socket_connection_connect_finish() to retrieve the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def connectAsync__ = ???

  /** Gets the result of a g_socket_connection_connect_async() call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectFinish(
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_socket_connection_connect_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnection]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end connectFinish

  /** Try to get the local address of a socket connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLocalAddress()(using
      Runtime
  ): GResult[sn.gnome.gio.SocketAddress /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketAddress.applyUnsafe(
        g_socket_connection_get_local_address(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnection]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end getLocalAddress

  /** Try to get the remote address of a socket connection.
    *
    * Since GLib 2.40, when used with g_socket_client_connect() or
    * g_socket_client_connect_async(), during emission of
    * %G_SOCKET_CLIENT_CONNECTING, this function will return the remote address
    * that will be used for the connection. This allows applications to print
    * e.g. "Connecting to example.com (10.42.77.3)...".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRemoteAddress()(using
      Runtime
  ): GResult[sn.gnome.gio.SocketAddress /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketAddress.applyUnsafe(
        g_socket_connection_get_remote_address(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnection]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end getRemoteAddress

  /** Gets the underlying #GSocket object of the connection. This can be useful
    * if you want to do something unusual on it not supported by the
    * #GSocketConnection APIs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSocket()(using Runtime): sn.gnome.gio.Socket /* None */ =
    sn.gnome.gio.Socket.applyUnsafe(
      g_socket_connection_get_socket(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnection]]
      ).asInstanceOf
    )
  end getSocket

  /** Checks if @connection is connected. This is equivalent to calling
    * g_socket_is_connected() on @connection's underlying #GSocket.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isConnected(): Boolean /* None */ =
    g_socket_connection_is_connected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnection]]
    ).value.!=(0)
  end isConnected

end SocketConnection

object SocketConnection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GSocketConnection])(using Runtime) =
    summon[Runtime].getOrCreate[SocketConnection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SocketConnection(ptr)
    )

  /** Looks up the #GType to be used when creating socket connections on sockets
    * with the specified @family, @type and @protocol_id.
    *
    * If no type is registered, the #GSocketConnection base type is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def factoryLookupType(
      family: sn.gnome.gio.SocketFamily /* Some(GSocketFamily) */,
      `type`: sn.gnome.gio.SocketType /* Some(GSocketType) */,
      protocol_id: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): GType /* Some(_root_.sn.gnome.gobject.internal.GType) */ =
    g_socket_connection_factory_lookup_type(
      family.raw,
      `type`.raw,
      gint(protocol_id)
    )

  /** Looks up the #GType to be used when creating socket connections on sockets
    * with the specified @family, @type and @protocol.
    *
    * If no type is registered, the #GSocketConnection base type is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def factoryRegisterType(
      g_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      family: sn.gnome.gio.SocketFamily /* Some(GSocketFamily) */,
      `type`: sn.gnome.gio.SocketType /* Some(GSocketType) */,
      protocol: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* Some(Unit) */ = g_socket_connection_factory_register_type(
    g_type,
    family.raw,
    `type`.raw,
    gint(protocol)
  )

end SocketConnection
