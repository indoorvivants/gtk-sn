package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.DBusAuthObserver
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.internal.GDBusServer
import sn.gnome.gio.internal.GDBusServerFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDBusServer is a helper for listening to and accepting D-Bus connections.
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
  */
class DBusServer(raw: Ptr[GDBusServer])
    extends Object(raw.asInstanceOf),
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a [D-Bus
    * address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses)
    * string that can be used by clients to connect to @server.
    *
    * This is valid and non-empty if initializing the #GDBusServer succeeded.
    */
  def getClientAddress()(using Zone): String /* None */ = fromCString(
    g_dbus_server_get_client_address(
      this.raw.asInstanceOf[Ptr[GDBusServer]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the flags for @server.
    */
  def getFlags(): GDBusServerFlags /* None */ = g_dbus_server_get_flags(
    this.raw.asInstanceOf[Ptr[GDBusServer]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the GUID for @server, as provided to g_dbus_server_new_sync().
    */
  def getGuid()(using Zone): String /* None */ = fromCString(
    g_dbus_server_get_guid(this.raw.asInstanceOf[Ptr[GDBusServer]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @server is active.
    */
  def isActive(): Boolean /* None */ =
    g_dbus_server_is_active(this.raw.asInstanceOf[Ptr[GDBusServer]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts @server.
    */
  def start(): Unit /* None */ = g_dbus_server_start(
    this.raw.asInstanceOf[Ptr[GDBusServer]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stops @server.
    */
  def stop(): Unit /* None */ = g_dbus_server_stop(
    this.raw.asInstanceOf[Ptr[GDBusServer]]
  )

end DBusServer

object DBusServer:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new D-Bus server that listens on the first address in
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
    */
  def sync(
      address: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: GDBusServerFlags /* Some(GDBusServerFlags) */,
      guid: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      observer: Option[DBusAuthObserver /* Some(Ptr[GDBusAuthObserver]) */ ],
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[DBusServer] = GResult.wrap(__errorPtr =>
    new DBusServer(
      g_dbus_server_new_sync(
        __sn_extract_string(address).asInstanceOf[Ptr[gchar]],
        flags,
        __sn_extract_string(guid).asInstanceOf[Ptr[gchar]],
        observer
          .map[Ptr[GDBusAuthObserver]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[GDBusAuthObserver]]),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf
    )
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusServer
