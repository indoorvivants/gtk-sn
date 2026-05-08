package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{SocketConnection, SocketListener}
import sn.gnome.gio.internal.{GSocketConnection, GSocketService}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GObject,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A #GSocketService is an object that represents a service that is provided to
  * the network or over local sockets. When a new connection is made to the
  * service the #GSocketService::incoming signal is emitted.
  *
  * A #GSocketService is a subclass of #GSocketListener and you need to add the
  * addresses you want to accept connections on with the #GSocketListener APIs.
  *
  * There are two options for implementing a network service based on
  * #GSocketService. The first is to create the service using
  * g_socket_service_new() and to connect to the #GSocketService::incoming
  * signal. The second is to subclass #GSocketService and override the default
  * signal handler implementation.
  *
  * In either case, the handler must immediately return, or else it will block
  * additional incoming connections from being serviced. If you are interested
  * in writing connection handlers that contain blocking code then see
  * #GThreadedSocketService.
  *
  * The socket service runs on the main loop of the [thread-default
  * context][g-main-context-push-thread-default-context] of the thread it is
  * created in, and is not threadsafe in general. However, the calls to start
  * and stop the service are thread-safe so these can be used from threads that
  * handle incoming clients.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketService(raw: Ptr[GSocketService])
    extends SocketListener(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Check whether the service is active or not. An active service will accept
    * new clients that connect, while a non-active service will let connecting
    * clients queue up until the service is started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActive(): Boolean /* None */ = g_socket_service_is_active(
    this.raw.asInstanceOf[Ptr[GSocketService]]
  ).value.!=(0)

  /** Restarts the service, i.e. start accepting connections from the added
    * sockets when the mainloop runs. This only needs to be called after the
    * service has been stopped from g_socket_service_stop().
    *
    * This call is thread-safe, so it may be called from a thread handling an
    * incoming client request.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def start(): Unit /* None */ = g_socket_service_start(
    this.raw.asInstanceOf[Ptr[GSocketService]]
  )

  /** Stops the service, i.e. stops accepting connections from the added sockets
    * when the mainloop runs.
    *
    * This call is thread-safe, so it may be called from a thread handling an
    * incoming client request.
    *
    * Note that this only stops accepting new connections; it does not close the
    * listening sockets, and you can call g_socket_service_start() again later
    * to begin listening again. To close the listening sockets, call
    * g_socket_listener_close(). (This will happen automatically when the
    * #GSocketService is finalized.)
    *
    * This must be called before calling g_socket_listener_close() as the socket
    * service will start accepting connections immediately when a new socket is
    * added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stop(): Unit /* None */ = g_socket_service_stop(
    this.raw.asInstanceOf[Ptr[GSocketService]]
  )

  /** The ::incoming signal is emitted when a new incoming connection to @service
    * needs to be handled. The handler must initiate the handling of @connection,
    * but may not block; in essence, asynchronous operations must be used.
    *
    * @connection
    *   will be unreffed once the signal handler returns, so you need to ref it
    *   yourself if you are planning to use it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onIncoming(
      handler: ((connection: SocketConnection, sourceObject: Object)) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (connection: SocketConnection, sourceObject: Object),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GSocketService],
          connection: Ptr[GSocketConnection] /* param */,
          sourceObject: Ptr[GObject] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            connection = sr.runtime
              .get[SocketConnection](connection.asInstanceOf[Ptr[Byte]]),
            sourceObject =
              sr.runtime.get[Object](sourceObject.asInstanceOf[Ptr[Byte]])
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
    val signal = c"incoming"
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
  end onIncoming
end SocketService

object SocketService:
  /** Creates a new #GSocketService with no sockets to listen for. New listeners
    * can be added with e.g. g_socket_listener_add_address() or
    * g_socket_listener_add_inet_port().
    *
    * New services are created active, there is no need to call
    * g_socket_service_start(), unless g_socket_service_stop() has been called
    * before.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): SocketService =
    val raw: Ptr[Byte] = g_socket_service_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[SocketService](raw, r => new SocketService(r.asInstanceOf))
  end apply
end SocketService
