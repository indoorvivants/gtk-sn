package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusObjectManager
import sn.gnome.gio.fluent.DBusObjectSkeleton
import sn.gnome.gio.internal.GDBusObjectManagerServer
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class DBusObjectManagerServer(raw: Ptr[GDBusObjectManagerServer])
    extends Object(raw.asInstanceOf),
      DBusObjectManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def `export`(`object`: DBusObjectSkeleton): Unit =
    g_dbus_object_manager_server_export(
      this.raw.asInstanceOf,
      `object`.getUnsafeRawPointer().asInstanceOf
    )

  def exportUniquely(`object`: DBusObjectSkeleton): Unit =
    g_dbus_object_manager_server_export_uniquely(
      this.raw.asInstanceOf,
      `object`.getUnsafeRawPointer().asInstanceOf
    )

  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_object_manager_server_get_connection(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def isExported(`object`: DBusObjectSkeleton): Boolean =
    g_dbus_object_manager_server_is_exported(
      this.raw.asInstanceOf,
      `object`.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def setConnection(connection: DBusConnection): Unit =
    g_dbus_object_manager_server_set_connection(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf
    )

  def unexport(object_path: String | CString)(using Zone): Boolean =
    g_dbus_object_manager_server_unexport(
      this.raw.asInstanceOf,
      __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusObjectManagerServer

object DBusObjectManagerServer:
  def apply(
      object_path: String | CString
  )(using Zone): DBusObjectManagerServer = new DBusObjectManagerServer(
    g_dbus_object_manager_server_new(
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
end DBusObjectManagerServer
