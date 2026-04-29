package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusObject
import sn.gnome.gio.internal.GDBusObjectProxy
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GDBusObjectProxy is an object used to represent a remote object with one
  * or more D-Bus interfaces. Normally, you don't instantiate a
  * #GDBusObjectProxy yourself - typically #GDBusObjectManagerClient is used to
  * obtain it.
  */
class DBusObjectProxy(raw: Ptr[GDBusObjectProxy])
    extends Object(raw.asInstanceOf),
      DBusObject:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the connection that @proxy is for.
    */
  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_object_proxy_get_connection(this.raw.asInstanceOf).asInstanceOf
  )

end DBusObjectProxy

object DBusObjectProxy:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusObjectProxy for the given connection and object path.
    */
  def apply(connection: DBusConnection, object_path: String | CString)(using
      Zone
  ): DBusObjectProxy = new DBusObjectProxy(
    g_dbus_object_proxy_new(
      connection.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusObjectProxy
