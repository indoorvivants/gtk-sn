package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  Cancellable,
  DBusAuthObserver,
  DBusConnection,
  DBusServerFlags,
  Initable
}
import sn.gnome.gio.internal.{GDBusConnection, GDBusServer}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** #GDBusServer is a helper for listening to and accepting D-Bus connections.
  * This can be used to create a new D-Bus server, allowing two peers to use the
  * D-Bus protocol for their own specialized communication. A server instance
  * provided in this way will not perform message routing or implement the
  * org.freedesktop.DBus interface.
  *
  * To just export an object on a well-known name on a message bus, such as the
  * session or system bus, you should instead use g_bus_own_name().
  *
  * An example of peer-to-peer communication with GDBus can be found in
  * [gdbus-example-peer.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-peer.c).
  *
  * Note that a minimal #GDBusServer will accept connections from any peer. In
  * many use-cases it will be necessary to add a #GDBusAuthObserver that only
  * accepts connections that have successfully authenticated as the same user
  * that is running the #GDBusServer. Since GLib 2.68 this can be achieved more
  * simply by passing the %G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER
  * flag to the server.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusServer private[gnome] (raw: Ptr[GDBusServer])
    extends Object(raw.asInstanceOf),
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets a [D-Bus
    * address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses)
    * string that can be used by clients to connect to @server.
    *
    * This is valid and non-empty if initializing the #GDBusServer succeeded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClientAddress()(using Zone): String /* None */ =
    fromCString(
      g_dbus_server_get_client_address(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusServer]]
      ).asInstanceOf
    )
  end getClientAddress

  /** Gets the flags for @server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): DBusServerFlags /* None */ =
    DBusServerFlags.fromRaw(
      g_dbus_server_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusServer]]
      )
    )
  end getFlags

  /** Gets the GUID for @server, as provided to g_dbus_server_new_sync().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGuid()(using Zone): String /* None */ =
    fromCString(
      g_dbus_server_get_guid(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusServer]]
      ).asInstanceOf
    )
  end getGuid

  /** Gets whether @server is active.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActive(): Boolean /* None */ =
    g_dbus_server_is_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusServer]]
    ).value.!=(0)
  end isActive

  /** Starts @server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def start(): Unit /* None */ =
    g_dbus_server_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusServer]]
    )
  end start

  /** Stops @server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stop(): Unit /* None */ =
    g_dbus_server_stop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusServer]]
    )
  end stop

  /** Emitted when a new authenticated connection has been made. Use
    * g_dbus_connection_get_peer_credentials() to figure out what identity (if
    * any), was authenticated.
    *
    * If you want to accept the connection, take a reference to the
    * @connection
    *   object and return %TRUE. When you are done with the connection call
    *   g_dbus_connection_close() and give up your reference. Note that the
    *   other peer may disconnect at any time - a typical thing to do when
    *   accepting a connection is to listen to the #GDBusConnection::closed
    *   signal.
    *
    * If #GDBusServer:flags contains %G_DBUS_SERVER_FLAGS_RUN_IN_THREAD then the
    * signal is emitted in a new thread dedicated to the connection. Otherwise
    * the signal is emitted in the [thread-default main
    * context][g-main-context-push-thread-default] of the thread that @server
    * was constructed in.
    *
    * You are guaranteed that signal handlers for this signal runs before
    * incoming messages on @connection are processed. This means that it's
    * suitable to call g_dbus_connection_register_object() or similar from the
    * signal handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onNewConnection(handler: ((connection: DBusConnection)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (connection: DBusConnection), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GDBusServer],
          connection: Ptr[GDBusConnection] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (connection =
            sr.runtime.get[DBusConnection](connection.asInstanceOf[Ptr[Byte]])
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
    val signal = c"new-connection"
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
  end onNewConnection
end DBusServer

object DBusServer:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusServer])(using Runtime) =
    summon[Runtime].getOrCreate[DBusServer](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusServer(ptr)
    )

  /** Creates a new D-Bus server that listens on the first address in
    * @address
    *   that works.
    *
    * Once constructed, you can use g_dbus_server_get_client_address() to get a
    * D-Bus address string that clients can use to connect.
    *
    * To have control over the available authentication mechanisms and the users
    * that are authorized to connect, it is strongly recommended to provide a
    * non-%NULL #GDBusAuthObserver.
    *
    * Connect to the #GDBusServer::new-connection signal to handle incoming
    * connections.
    *
    * The returned #GDBusServer isn't active - you have to start it with
    * g_dbus_server_start().
    *
    * #GDBusServer is used in this [example][gdbus-peer-to-peer].
    *
    * This is a synchronous failable constructor. There is currently no
    * asynchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sync(
      address: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: DBusServerFlags /* Some(GDBusServerFlags) */,
      guid: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      observer: Option[
        sn.gnome.gio.fluent.DBusAuthObserver /* Some(Ptr[GDBusAuthObserver]) */
      ],
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Zone, Runtime): GResult[DBusServer] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_dbus_server_new_sync(
        toCString(address).asInstanceOf[Ptr[gchar]],
        flags.raw,
        toCString(guid).asInstanceOf[Ptr[gchar]],
        observer
          .map[Ptr[GDBusAuthObserver]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[GDBusAuthObserver]]),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[DBusServer](
          raw,
          r => DBusServer.applyUnsafe(r.asInstanceOf)
        )

  end sync
end DBusServer
