package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{Socket, SocketListenerEvent}
import sn.gnome.gio.internal.{GSocket, GSocketListener, GSocketListenerEvent}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint16}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A #GSocketListener is an object that keeps track of a set of server sockets
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketListener(raw: Ptr[GSocketListener])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Blocks waiting for a client to connect to any of the sockets added to the
    * listener. Returns a #GSocketConnection for the socket that was accepted.
    *
    * If @source_object is not %NULL it will be filled out with the source
    * object specified when the corresponding socket or address was added to the
    * listener.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method accept]: Method accept contains an OUT parameter, which is not supported yet"
  )
  private def accept__ = ???

  /** This is the asynchronous version of g_socket_listener_accept().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_listener_accept_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method accept_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def acceptAsync__ = ???

  /** Finishes an async accept operation. See g_socket_listener_accept_async()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method accept_finish]: Method accept_finish contains an OUT parameter, which is not supported yet"
  )
  private def acceptFinish__ = ???

  /** Blocks waiting for a client to connect to any of the sockets added to the
    * listener. Returns the #GSocket that was accepted.
    *
    * If you want to accept the high-level #GSocketConnection, not a #GSocket,
    * which is often the case, then you should use g_socket_listener_accept()
    * instead.
    *
    * If @source_object is not %NULL it will be filled out with the source
    * object specified when the corresponding socket or address was added to the
    * listener.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method accept_socket]: Method accept_socket contains an OUT parameter, which is not supported yet"
  )
  private def acceptSocket__ = ???

  /** This is the asynchronous version of g_socket_listener_accept_socket().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_listener_accept_socket_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method accept_socket_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def acceptSocketAsync__ = ???

  /** Finishes an async accept operation. See
    * g_socket_listener_accept_socket_async()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method accept_socket_finish]: Method accept_socket_finish contains an OUT parameter, which is not supported yet"
  )
  private def acceptSocketFinish__ = ???

  /** Creates a socket of type @type and protocol @protocol, binds it to @address
    * and adds it to the set of sockets we're accepting sockets from.
    *
    * Note that adding an IPv6 address, depending on the platform, may or may
    * not result in a listener that also accepts IPv4 connections. For more
    * deterministic behavior, see g_socket_listener_add_inet_port().
    *
    * @source_object
    *   will be passed out in the various calls to accept to identify this
    *   particular source, which is useful if you're listening on multiple
    *   addresses and do different things depending on what address is connected
    *   to.
    *
    * If successful and @effective_address is non-%NULL then it will be set to
    * the address that the binding actually occurred at. This is helpful for
    * determining the port number that was used for when requesting a binding to
    * port 0 (ie: "any port"). This address, if requested, belongs to the caller
    * and must be freed.
    *
    * Call g_socket_listener_close() to stop listening on @address; this will
    * not be done automatically when you drop your final reference to @listener,
    * as references may be held internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_address]: Method add_address contains an OUT parameter, which is not supported yet"
  )
  private def addAddress__ = ???

  /** Listens for TCP connections on any available port number for both IPv6 and
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addAnyInetPort(
      source_object: Option[
        Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
      ]
  ): GResult[UShort /* None */ ] = GResult.wrap(__errorPtr =>
    g_socket_listener_add_any_inet_port(
      this.raw.asInstanceOf[Ptr[GSocketListener]],
      source_object
        .map[Ptr[_root_.sn.gnome.gobject.internal.GObject]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
        ),
      __errorPtr
    ).value
  )

  /** Helper function for g_socket_listener_add_address() that creates a TCP/IP
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addInetPort(
      port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      source_object: Option[
        Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
      ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_socket_listener_add_inet_port(
      this.raw.asInstanceOf[Ptr[GSocketListener]],
      guint16(port),
      source_object
        .map[Ptr[_root_.sn.gnome.gobject.internal.GObject]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
        ),
      __errorPtr
    ).value.!=(0)
  )

  /** Adds @socket to the set of sockets that we try to accept new clients from.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSocket(
      socket: Socket /* Some(Ptr[GSocket]) */,
      source_object: Option[
        Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
      ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_socket_listener_add_socket(
      this.raw.asInstanceOf[Ptr[GSocketListener]],
      socket.getUnsafeRawPointer().asInstanceOf,
      source_object
        .map[Ptr[_root_.sn.gnome.gobject.internal.GObject]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
        ),
      __errorPtr
    ).value.!=(0)
  )

  /** Closes all the sockets in the listener.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ = g_socket_listener_close(
    this.raw.asInstanceOf[Ptr[GSocketListener]]
  )

  /** Sets the listen backlog on the sockets in the listener. This must be
    * called before adding any sockets, addresses or ports to the
    * #GSocketListener (for example, by calling
    * g_socket_listener_add_inet_port()) to be effective.
    *
    * See g_socket_set_listen_backlog() for details
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBacklog(listen_backlog: Int /* Some(CInt) */ ): Unit /* None */ =
    g_socket_listener_set_backlog(
      this.raw.asInstanceOf[Ptr[GSocketListener]],
      listen_backlog
    )

  /** Emitted when @listener's activity on @socket changes state. Note that when @listener
    * is used to listen on both IPv4 and IPv6, a separate set of signals will be
    * emitted for each, and the order they happen in is undefined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEvent(handler: ((event: SocketListenerEvent, socket: Socket)) => Unit)(
      using Runtime
  ) =
    type SignalRegType = SignalRegistration[
      this.type,
      (event: SocketListenerEvent, socket: Socket),
      Unit
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GSocketListener],
          event: GSocketListenerEvent /* param */,
          socket: Ptr[GSocket] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            event = SocketListenerEvent.fromRaw(event),
            socket = sr.runtime.get[Socket](socket.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"event"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEvent
end SocketListener

object SocketListener:
  /** Creates a new #GSocketListener with no sockets to listen for. New
    * listeners can be added with e.g. g_socket_listener_add_address() or
    * g_socket_listener_add_inet_port().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): SocketListener = new SocketListener(
    g_socket_listener_new().asInstanceOf
  )
end SocketListener
