package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusInterface
import sn.gnome.gio.internal.GDBusInterfaceInfo
import sn.gnome.gio.internal.GDBusInterfaceSkeleton
import sn.gnome.gio.internal.GDBusInterfaceSkeletonFlags
import sn.gnome.gio.internal.GDBusInterfaceVTable
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class DBusInterfaceSkeleton(raw: Ptr[GDBusInterfaceSkeleton])
    extends Object(raw.asInstanceOf),
      DBusInterface:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def `export`(connection: DBusConnection, object_path: String | CString)(using
      Zone
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_dbus_interface_skeleton_export(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  def flush(): Unit = g_dbus_interface_skeleton_flush(this.raw.asInstanceOf)

  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_interface_skeleton_get_connection(this.raw.asInstanceOf).asInstanceOf
  )

  def getConnections(): Ptr[GList] = g_dbus_interface_skeleton_get_connections(
    this.raw.asInstanceOf
  )

  def getFlags(): GDBusInterfaceSkeletonFlags =
    g_dbus_interface_skeleton_get_flags(this.raw.asInstanceOf)

  def getInfo(): Ptr[GDBusInterfaceInfo] = g_dbus_interface_skeleton_get_info(
    this.raw.asInstanceOf
  )

  def getObjectPath()(using Zone): String = fromCString(
    g_dbus_interface_skeleton_get_object_path(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getProperties(): Ptr[GVariant] = g_dbus_interface_skeleton_get_properties(
    this.raw.asInstanceOf
  )

  def getVtable(): Ptr[GDBusInterfaceVTable] =
    g_dbus_interface_skeleton_get_vtable(this.raw.asInstanceOf)

  def hasConnection(connection: DBusConnection): Boolean =
    g_dbus_interface_skeleton_has_connection(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def setFlags(flags: GDBusInterfaceSkeletonFlags): Unit =
    g_dbus_interface_skeleton_set_flags(this.raw.asInstanceOf, flags)

  def unexport(): Unit = g_dbus_interface_skeleton_unexport(
    this.raw.asInstanceOf
  )

  def unexportFromConnection(connection: DBusConnection): Unit =
    g_dbus_interface_skeleton_unexport_from_connection(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusInterfaceSkeleton
