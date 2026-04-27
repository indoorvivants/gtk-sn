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

class DBusServer(raw: Ptr[GDBusServer])
    extends Object(raw.asInstanceOf),
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getClientAddress()(using Zone): String = fromCString(
    g_dbus_server_get_client_address(this.raw.asInstanceOf).asInstanceOf
  )

  def getFlags(): GDBusServerFlags = g_dbus_server_get_flags(
    this.raw.asInstanceOf
  )

  def getGuid()(using Zone): String = fromCString(
    g_dbus_server_get_guid(this.raw.asInstanceOf).asInstanceOf
  )

  def isActive(): Boolean =
    g_dbus_server_is_active(this.raw.asInstanceOf).value.!=(0)

  def start(): Unit = g_dbus_server_start(this.raw.asInstanceOf)

  def stop(): Unit = g_dbus_server_stop(this.raw.asInstanceOf)

end DBusServer

object DBusServer:
  def sync(
      address: String | CString,
      flags: GDBusServerFlags,
      guid: String | CString,
      observer: DBusAuthObserver,
      cancellable: Cancellable
  )(using Zone): GResult[DBusServer] = GResult.wrap(__errorPtr =>
    new DBusServer(
      g_dbus_server_new_sync(
        __sn_extract_string(address).asInstanceOf[Ptr[gchar]],
        flags,
        __sn_extract_string(guid).asInstanceOf[Ptr[gchar]],
        observer.getUnsafeRawPointer().asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
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
