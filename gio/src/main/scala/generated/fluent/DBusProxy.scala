package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncInitable
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusInterface
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.fluent.UnixFDList
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GBusType
import sn.gnome.gio.internal.GDBusCallFlags
import sn.gnome.gio.internal.GDBusInterfaceInfo
import sn.gnome.gio.internal.GDBusProxy
import sn.gnome.gio.internal.GDBusProxyFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class DBusProxy(raw: Ptr[GDBusProxy])
    extends Object(raw.asInstanceOf),
      AsyncInitable,
      DBusInterface,
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def call(
      method_name: String | CString,
      parameters: Ptr[GVariant],
      flags: GDBusCallFlags,
      timeout_msec: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_dbus_proxy_call(
    this.raw.asInstanceOf,
    __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]],
    parameters,
    flags,
    gint(timeout_msec),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def callFinish(res: AsyncResult): GResult[Ptr[GVariant]] =
    GResult.wrap(__errorPtr =>
      g_dbus_proxy_call_finish(
        this.raw.asInstanceOf,
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  def callSync(
      method_name: String | CString,
      parameters: Ptr[GVariant],
      flags: GDBusCallFlags,
      timeout_msec: Int,
      cancellable: Cancellable
  )(using Zone): GResult[Ptr[GVariant]] = GResult.wrap(__errorPtr =>
    g_dbus_proxy_call_sync(
      this.raw.asInstanceOf,
      __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]],
      parameters,
      flags,
      gint(timeout_msec),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def callWithUnixFdList(
      method_name: String | CString,
      parameters: Ptr[GVariant],
      flags: GDBusCallFlags,
      timeout_msec: Int,
      fd_list: UnixFDList,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_dbus_proxy_call_with_unix_fd_list(
    this.raw.asInstanceOf,
    __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]],
    parameters,
    flags,
    gint(timeout_msec),
    fd_list.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  // Method call_with_unix_fd_list_finish contains an OUT parameter, which is not supported yet

  // Method call_with_unix_fd_list_sync contains an OUT parameter, which is not supported yet

  def getCachedProperty(
      property_name: String | CString
  )(using Zone): Ptr[GVariant] = g_dbus_proxy_get_cached_property(
    this.raw.asInstanceOf,
    __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]]
  )

  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_proxy_get_connection(this.raw.asInstanceOf).asInstanceOf
  )

  def getDefaultTimeout(): Int = g_dbus_proxy_get_default_timeout(
    this.raw.asInstanceOf
  ).value

  def getFlags(): GDBusProxyFlags = g_dbus_proxy_get_flags(
    this.raw.asInstanceOf
  )

  def getInterfaceInfo(): Ptr[GDBusInterfaceInfo] =
    g_dbus_proxy_get_interface_info(this.raw.asInstanceOf)

  def getInterfaceName()(using Zone): String = fromCString(
    g_dbus_proxy_get_interface_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getName()(using Zone): String = fromCString(
    g_dbus_proxy_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getNameOwner()(using Zone): String = fromCString(
    g_dbus_proxy_get_name_owner(this.raw.asInstanceOf).asInstanceOf
  )

  def getObjectPath()(using Zone): String = fromCString(
    g_dbus_proxy_get_object_path(this.raw.asInstanceOf).asInstanceOf
  )

  def setCachedProperty(property_name: String | CString, value: Ptr[GVariant])(
      using Zone
  ): Unit = g_dbus_proxy_set_cached_property(
    this.raw.asInstanceOf,
    __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]],
    value
  )

  def setDefaultTimeout(timeout_msec: Int): Unit =
    g_dbus_proxy_set_default_timeout(this.raw.asInstanceOf, gint(timeout_msec))

  def setInterfaceInfo(info: Ptr[GDBusInterfaceInfo]): Unit =
    g_dbus_proxy_set_interface_info(this.raw.asInstanceOf, info)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusProxy

object DBusProxy:
  def finish(res: AsyncResult): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
  def forBusFinish(res: AsyncResult): GResult[DBusProxy] =
    GResult.wrap(__errorPtr =>
      new DBusProxy(
        g_dbus_proxy_new_for_bus_finish(
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  def forBusSync(
      bus_type: GBusType,
      flags: GDBusProxyFlags,
      info: Ptr[GDBusInterfaceInfo],
      name: String | CString,
      object_path: String | CString,
      interface_name: String | CString,
      cancellable: Cancellable
  )(using Zone): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_for_bus_sync(
        bus_type,
        flags,
        info,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]],
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
  def sync(
      connection: DBusConnection,
      flags: GDBusProxyFlags,
      info: Ptr[GDBusInterfaceInfo],
      name: String | CString,
      object_path: String | CString,
      interface_name: String | CString,
      cancellable: Cancellable
  )(using Zone): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_sync(
        connection.getUnsafeRawPointer().asInstanceOf,
        flags,
        info,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]],
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
end DBusProxy
