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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDBusObjectManagerServer is used to export #GDBusObject instances using the
  * standardized
  * [org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
  * interface. For example, remote D-Bus clients can get all objects and
  * properties in a single call. Additionally, any change in the object
  * hierarchy is broadcast using signals. This means that D-Bus clients can keep
  * caches up to date by only listening to D-Bus signals.
  *
  * The recommended path to export an object manager at is the path form of the
  * well-known name of a D-Bus service, or below. For example, if a D-Bus
  * service is available at the well-known name `net.example.ExampleService1`,
  * the object manager should typically be exported at
  * `/net/example/ExampleService1`, or below (to allow for multiple object
  * managers in a service).
  *
  * It is supported, but not recommended, to export an object manager at the
  * root path, `/`.
  *
  * See #GDBusObjectManagerClient for the client-side code that is intended to
  * be used with #GDBusObjectManagerServer or any D-Bus object implementing the
  * org.freedesktop.DBus.ObjectManager interface.
  */
class DBusObjectManagerServer(raw: Ptr[GDBusObjectManagerServer])
    extends Object(raw.asInstanceOf),
      DBusObjectManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Exports @object on @manager.
    *
    * If there is already a #GDBusObject exported at the object path, then the
    * old object is removed.
    *
    * The object path for @object must be in the hierarchy rooted by the object
    * path for @manager.
    *
    * Note that @manager will take a reference on @object for as long as it is
    * exported.
    */
  def `export`(`object`: DBusObjectSkeleton): Unit =
    g_dbus_object_manager_server_export(
      this.raw.asInstanceOf,
      `object`.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_object_manager_server_export() but appends a string of the
    * form _N (with N being a natural number) to @object's object path if an
    * object with the given path already exists. As such, the
    * #GDBusObjectProxy:g-object-path property of @object may be modified.
    */
  def exportUniquely(`object`: DBusObjectSkeleton): Unit =
    g_dbus_object_manager_server_export_uniquely(
      this.raw.asInstanceOf,
      `object`.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GDBusConnection used by @manager.
    */
  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_object_manager_server_get_connection(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @object is currently exported on @manager.
    */
  def isExported(`object`: DBusObjectSkeleton): Boolean =
    g_dbus_object_manager_server_is_exported(
      this.raw.asInstanceOf,
      `object`.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Exports all objects managed by @manager on @connection. If
    * @connection
    *   is %NULL, stops exporting objects.
    */
  def setConnection(connection: DBusConnection): Unit =
    g_dbus_object_manager_server_set_connection(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @manager has an object at @path, removes the object. Otherwise does
    * nothing.
    *
    * Note that @object_path must be in the hierarchy rooted by the object path
    * for @manager.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusObjectManagerServer object.
    *
    * The returned server isn't yet exported on any connection. To do so, use
    * g_dbus_object_manager_server_set_connection(). Normally you want to export
    * all of your objects before doing so to avoid
    * [InterfacesAdded](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
    * signals being emitted.
    */
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
