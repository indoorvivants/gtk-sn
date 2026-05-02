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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Abstract base class for D-Bus interfaces on the service side.
  */
class DBusInterfaceSkeleton(raw: Ptr[GDBusInterfaceSkeleton])
    extends Object(raw.asInstanceOf),
      DBusInterface:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Exports @interface_ at @object_path on @connection.
    *
    * This can be called multiple times to export the same @interface_ onto
    * multiple connections however the @object_path provided must be the same
    * for all connections.
    *
    * Use g_dbus_interface_skeleton_unexport() to unexport the object.
    */
  def `export`(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */,
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_dbus_interface_skeleton_export(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @interface_ has outstanding changes, request for these changes to be
    * emitted immediately.
    *
    * For example, an exported D-Bus interface may queue up property changes and
    * emit the `org.freedesktop.DBus.Properties.PropertiesChanged` signal later
    * (e.g. in an idle handler). This technique is useful for collapsing
    * multiple property changes into one.
    */
  def flush(): Unit /* None */ = g_dbus_interface_skeleton_flush(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the first connection that @interface_ is exported on, if any.
    */
  def getConnection(): DBusConnection /* None */ = new DBusConnection(
    g_dbus_interface_skeleton_get_connection(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a list of the connections that @interface_ is exported on.
    */
  def getConnections(): Ptr[GList] /* None */ =
    g_dbus_interface_skeleton_get_connections(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GDBusInterfaceSkeletonFlags that describes what the behavior of @interface_
    */
  def getFlags(): GDBusInterfaceSkeletonFlags /* None */ =
    g_dbus_interface_skeleton_get_flags(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets D-Bus introspection information for the D-Bus interface implemented
    * by @interface_.
    */
  def getInfo(): Ptr[GDBusInterfaceInfo] /* None */ =
    g_dbus_interface_skeleton_get_info(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the object path that @interface_ is exported on, if any.
    */
  def getObjectPath()(using Zone): String /* None */ = fromCString(
    g_dbus_interface_skeleton_get_object_path(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets all D-Bus properties for @interface_.
    */
  def getProperties(): Ptr[GVariant] /* None */ =
    g_dbus_interface_skeleton_get_properties(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the interface vtable for the D-Bus interface implemented by
    * @interface_.
    *   The returned function pointers should expect @interface_ itself to be
    *   passed as @user_data.
    */
  def getVtable(): Ptr[GDBusInterfaceVTable] /* None */ =
    g_dbus_interface_skeleton_get_vtable(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if @interface_ is exported on @connection.
    */
  def hasConnection(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */
  ): Boolean /* None */ = g_dbus_interface_skeleton_has_connection(
    this.raw.asInstanceOf,
    connection.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets flags describing what the behavior of @skeleton should be.
    */
  def setFlags(
      flags: GDBusInterfaceSkeletonFlags /* Some(GDBusInterfaceSkeletonFlags) */
  ): Unit /* None */ =
    g_dbus_interface_skeleton_set_flags(this.raw.asInstanceOf, flags)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stops exporting @interface_ on all connections it is exported on.
    *
    * To unexport @interface_ from only a single connection, use
    * g_dbus_interface_skeleton_unexport_from_connection()
    */
  def unexport(): Unit /* None */ = g_dbus_interface_skeleton_unexport(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stops exporting @interface_ on @connection.
    *
    * To stop exporting on all connections the interface is exported on, use
    * g_dbus_interface_skeleton_unexport().
    */
  def unexportFromConnection(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */
  ): Unit /* None */ = g_dbus_interface_skeleton_unexport_from_connection(
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
