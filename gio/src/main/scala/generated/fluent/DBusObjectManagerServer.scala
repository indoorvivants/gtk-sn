package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  DBusConnection,
  DBusObjectManager,
  DBusObjectSkeleton
}
import sn.gnome.gio.internal.GDBusObjectManagerServer
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** #GDBusObjectManagerServer is used to export #GDBusObject instances using the
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectManagerServer private[gnome] (
    raw: Ptr[GDBusObjectManagerServer]
) extends Object(raw.asInstanceOf),
      DBusObjectManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Exports @object on @manager.
    *
    * If there is already a #GDBusObject exported at the object path, then the
    * old object is removed.
    *
    * The object path for @object must be in the hierarchy rooted by the object
    * path for @manager.
    *
    * Note that @manager will take a reference on @object for as long as it is
    * exported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `export`(
      `object`: sn.gnome.gio.fluent.DBusObjectSkeleton /* Some(Ptr[GDBusObjectSkeleton]) */
  )(using Runtime): Unit /* None */ =
    g_dbus_object_manager_server_export(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerServer]],
      `object`.getUnsafeRawPointer().asInstanceOf
    )
  end `export`

  /** Like g_dbus_object_manager_server_export() but appends a string of the
    * form _N (with N being a natural number) to @object's object path if an
    * object with the given path already exists. As such, the
    * #GDBusObjectProxy:g-object-path property of @object may be modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def exportUniquely(
      `object`: sn.gnome.gio.fluent.DBusObjectSkeleton /* Some(Ptr[GDBusObjectSkeleton]) */
  )(using Runtime): Unit /* None */ =
    g_dbus_object_manager_server_export_uniquely(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerServer]],
      `object`.getUnsafeRawPointer().asInstanceOf
    )
  end exportUniquely

  /** Gets the #GDBusConnection used by @manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection()(using
      Runtime
  ): sn.gnome.gio.fluent.DBusConnection /* None */ =
    sn.gnome.gio.fluent.DBusConnection.applyUnsafe(
      g_dbus_object_manager_server_get_connection(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerServer]]
      ).asInstanceOf
    )
  end getConnection

  /** Returns whether @object is currently exported on @manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isExported(
      `object`: sn.gnome.gio.fluent.DBusObjectSkeleton /* Some(Ptr[GDBusObjectSkeleton]) */
  )(using Runtime): Boolean /* None */ =
    g_dbus_object_manager_server_is_exported(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerServer]],
      `object`.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isExported

  /** Exports all objects managed by @manager on @connection. If
    * @connection
    *   is %NULL, stops exporting objects.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setConnection(
      connection: Option[
        sn.gnome.gio.fluent.DBusConnection /* Some(Ptr[GDBusConnection]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_dbus_object_manager_server_set_connection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerServer]],
      connection
        .map[Ptr[GDBusConnection]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GDBusConnection]])
    )
  end setConnection

  /** If @manager has an object at @path, removes the object. Otherwise does
    * nothing.
    *
    * Note that @object_path must be in the hierarchy rooted by the object path
    * for @manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexport(
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    g_dbus_object_manager_server_unexport(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerServer]],
      toCString(object_path).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end unexport

end DBusObjectManagerServer

object DBusObjectManagerServer:
  def applyUnsafe(ptr: Ptr[GDBusObjectManagerServer])(using Runtime) =
    summon[Runtime].getOrCreate[DBusObjectManagerServer](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusObjectManagerServer(ptr)
    )

  /** Creates a new #GDBusObjectManagerServer object.
    *
    * The returned server isn't yet exported on any connection. To do so, use
    * g_dbus_object_manager_server_set_connection(). Normally you want to export
    * all of your objects before doing so to avoid
    * [InterfacesAdded](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
    * signals being emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): DBusObjectManagerServer =
    val raw: Ptr[Byte] = g_dbus_object_manager_server_new(
      toCString(object_path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[DBusObjectManagerServer](
      raw,
      r => DBusObjectManagerServer.applyUnsafe(r.asInstanceOf)
    )
  end apply
end DBusObjectManagerServer
