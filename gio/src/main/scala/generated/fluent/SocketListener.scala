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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GSocketListener is an object that keeps track of a set of server sockets
  * and helps you accept sockets from any of the socket, either sync or async.
  *
  * Add addresses and ports to listen on using g_socket_listener_add_address()
  * and g_socket_listener_add_inet_port(). These will be listened on until
  * g_socket_listener_close() is called. Dropping your final reference to the
  * #GSocketListener will not cause g_socket_listener_close() to be called
  * implicitly, as some references to the #GSocketListener may be held
  * internally.
  *
  * If you want to implement a network server, also look at #GSocketService and
  * #GThreadedSocketService which are subclasses of #GSocketListener that make
  * this even easier.
  */
class SocketListener(raw: Ptr[GSocketListener])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  @annotation.compileTimeOnly(
    "Method accept contains an OUT parameter, which is not supported yet"
  )
  def accept() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the asynchronous version of g_socket_listener_accept().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_listener_accept_finish() to get the result of the operation.
    */
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

  @annotation.compileTimeOnly(
    "Method accept_finish contains an OUT parameter, which is not supported yet"
  )
  def acceptFinish() = ???

  @annotation.compileTimeOnly(
    "Method accept_socket contains an OUT parameter, which is not supported yet"
  )
  def acceptSocket() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the asynchronous version of g_socket_listener_accept_socket().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_listener_accept_socket_finish() to get the result of the
    * operation.
    */
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

  @annotation.compileTimeOnly(
    "Method accept_socket_finish contains an OUT parameter, which is not supported yet"
  )
  def acceptSocketFinish() = ???

  @annotation.compileTimeOnly(
    "Method add_address contains an OUT parameter, which is not supported yet"
  )
  def addAddress() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Listens for TCP connections on any available port number for both IPv6 and
    * IPv4 (if each is available).
    *
    * This is useful if you need to have a socket for incoming connections but
    * don't care about the specific port number.
    *
    * @source_object
    *   will be passed out in the various calls to accept to identify this
    *   particular source, which is useful if you're listening on multiple
    *   addresses and do different things depending on what address is connected
    *   to.
    */
  def addAnyInetPort(source_object: Object): GResult[UShort] =
    GResult.wrap(__errorPtr =>
      g_socket_listener_add_any_inet_port(
        this.raw.asInstanceOf,
        source_object.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Helper function for g_socket_listener_add_address() that creates a TCP/IP
    * socket listening on IPv4 and IPv6 (if supported) on the specified port on
    * all interfaces.
    *
    * @source_object
    *   will be passed out in the various calls to accept to identify this
    *   particular source, which is useful if you're listening on multiple
    *   addresses and do different things depending on what address is connected
    *   to.
    *
    * Call g_socket_listener_close() to stop listening on @port; this will not
    * be done automatically when you drop your final reference to @listener, as
    * references may be held internally.
    */
  def addInetPort(port: UShort, source_object: Object): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_socket_listener_add_inet_port(
        this.raw.asInstanceOf,
        guint16(port),
        source_object.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @socket to the set of sockets that we try to accept new clients from.
    * The socket must be bound to a local address and listened to.
    *
    * @source_object
    *   will be passed out in the various calls to accept to identify this
    *   particular source, which is useful if you're listening on multiple
    *   addresses and do different things depending on what address is connected
    *   to.
    *
    * The @socket will not be automatically closed when the @listener is
    * finalized unless the listener held the final reference to the socket.
    * Before GLib 2.42, the @socket was automatically closed on finalization of
    * the @listener, even if references to it were held elsewhere.
    */
  def addSocket(socket: Socket, source_object: Object): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_socket_listener_add_socket(
        this.raw.asInstanceOf,
        socket.getUnsafeRawPointer().asInstanceOf,
        source_object.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Closes all the sockets in the listener.
    */
  def close(): Unit = g_socket_listener_close(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the listen backlog on the sockets in the listener. This must be
    * called before adding any sockets, addresses or ports to the
    * #GSocketListener (for example, by calling
    * g_socket_listener_add_inet_port()) to be effective.
    *
    * See g_socket_set_listen_backlog() for details
    */
  def setBacklog(listen_backlog: Int): Unit =
    g_socket_listener_set_backlog(this.raw.asInstanceOf, listen_backlog)

end SocketListener

object SocketListener:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSocketListener with no sockets to listen for. New
    * listeners can be added with e.g. g_socket_listener_add_address() or
    * g_socket_listener_add_inet_port().
    */
  def apply(): SocketListener = new SocketListener(
    g_socket_listener_new().asInstanceOf
  )
end SocketListener
