package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusObject
import sn.gnome.gio.internal.GDBusObjectProxy
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class DBusObjectProxy(raw: Ptr[GDBusObjectProxy])
    extends Object(raw.asInstanceOf),
      DBusObject:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_object_proxy_get_connection(this.raw.asInstanceOf).asInstanceOf
  )

end DBusObjectProxy

object DBusObjectProxy:
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
