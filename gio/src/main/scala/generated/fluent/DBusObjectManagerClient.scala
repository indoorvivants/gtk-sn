package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncInitable
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusObjectManager
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.internal.GBusType
import sn.gnome.gio.internal.GDBusObjectManagerClient
import sn.gnome.gio.internal.GDBusObjectManagerClientFlags
import sn.gnome.gio.internal.GDBusProxyTypeFunc
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class DBusObjectManagerClient(raw: Ptr[GDBusObjectManagerClient])
    extends Object(raw.asInstanceOf),
      AsyncInitable,
      DBusObjectManager,
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_object_manager_client_get_connection(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getFlags(): GDBusObjectManagerClientFlags =
    g_dbus_object_manager_client_get_flags(this.raw.asInstanceOf)

  def getName()(using Zone): String = fromCString(
    g_dbus_object_manager_client_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getNameOwner()(using Zone): String = fromCString(
    g_dbus_object_manager_client_get_name_owner(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

end DBusObjectManagerClient

object DBusObjectManagerClient:
  def finish(res: AsyncResult): GResult[DBusObjectManagerClient] =
    GResult.wrap(__errorPtr =>
      new DBusObjectManagerClient(
        g_dbus_object_manager_client_new_finish(
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  def forBusFinish(res: AsyncResult): GResult[DBusObjectManagerClient] =
    GResult.wrap(__errorPtr =>
      new DBusObjectManagerClient(
        g_dbus_object_manager_client_new_for_bus_finish(
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  def forBusSync(
      bus_type: GBusType,
      flags: GDBusObjectManagerClientFlags,
      name: String | CString,
      object_path: String | CString,
      get_proxy_type_func: GDBusProxyTypeFunc,
      get_proxy_type_user_data: Ptr[Byte],
      get_proxy_type_destroy_notify: GDestroyNotify,
      cancellable: Cancellable
  )(using Zone): GResult[DBusObjectManagerClient] = GResult.wrap(__errorPtr =>
    new DBusObjectManagerClient(
      g_dbus_object_manager_client_new_for_bus_sync(
        bus_type,
        flags,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        get_proxy_type_func,
        gpointer(get_proxy_type_user_data),
        get_proxy_type_destroy_notify,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
  def sync(
      connection: DBusConnection,
      flags: GDBusObjectManagerClientFlags,
      name: String | CString,
      object_path: String | CString,
      get_proxy_type_func: GDBusProxyTypeFunc,
      get_proxy_type_user_data: Ptr[Byte],
      get_proxy_type_destroy_notify: GDestroyNotify,
      cancellable: Cancellable
  )(using Zone): GResult[DBusObjectManagerClient] = GResult.wrap(__errorPtr =>
    new DBusObjectManagerClient(
      g_dbus_object_manager_client_new_sync(
        connection.getUnsafeRawPointer().asInstanceOf,
        flags,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        get_proxy_type_func,
        gpointer(get_proxy_type_user_data),
        get_proxy_type_destroy_notify,
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
end DBusObjectManagerClient
