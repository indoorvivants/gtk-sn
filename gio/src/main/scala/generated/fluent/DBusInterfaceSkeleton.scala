package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  DBusConnection,
  DBusInterface,
  DBusInterfaceSkeletonFlags
}
import sn.gnome.gio.internal.GDBusInterfaceSkeleton
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.fluent.Object

/** Abstract base class for D-Bus interfaces on the service side.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusInterfaceSkeleton(raw: Ptr[GDBusInterfaceSkeleton])
    extends Object(raw.asInstanceOf),
      DBusInterface:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Exports @interface_ at @object_path on @connection.
    *
    * This can be called multiple times to export the same @interface_ onto
    * multiple connections however the @object_path provided must be the same
    * for all connections.
    *
    * Use g_dbus_interface_skeleton_unexport() to unexport the object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `export`(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */,
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_dbus_interface_skeleton_export(
      this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
      connection.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  /** If @interface_ has outstanding changes, request for these changes to be
    * emitted immediately.
    *
    * For example, an exported D-Bus interface may queue up property changes and
    * emit the `org.freedesktop.DBus.Properties.PropertiesChanged` signal later
    * (e.g. in an idle handler). This technique is useful for collapsing
    * multiple property changes into one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flush(): Unit /* None */ = g_dbus_interface_skeleton_flush(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
  )

  /** Gets the first connection that @interface_ is exported on, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection(): DBusConnection /* None */ = new DBusConnection(
    g_dbus_interface_skeleton_get_connection(
      this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
    ).asInstanceOf
  )

  /** Gets a list of the connections that @interface_ is exported on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_connections/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusConnection))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getConnections__ = ???

  /** Gets the #GDBusInterfaceSkeletonFlags that describes what the behavior of @interface_
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): DBusInterfaceSkeletonFlags /* None */ =
    DBusInterfaceSkeletonFlags.fromRaw(
      g_dbus_interface_skeleton_get_flags(
        this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      )
    )

  /** Gets D-Bus introspection information for the D-Bus interface implemented
    * by @interface_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_info/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def getInfo__ = ???

  /** Gets the object path that @interface_ is exported on, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath()(using Zone): String /* None */ = fromCString(
    g_dbus_interface_skeleton_get_object_path(
      this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
    ).asInstanceOf
  )

  /** Gets all D-Bus properties for @interface_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_properties/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getProperties__ = ???

  /** Gets the interface vtable for the D-Bus interface implemented by
    * @interface_.
    *   The returned function pointers should expect @interface_ itself to be
    *   passed as @user_data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_vtable/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceVTable), @type -> DataRecord(GDBusInterfaceVTable*)))"
  )
  private def getVtable__ = ???

  /** Checks if @interface_ is exported on @connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasConnection(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */
  ): Boolean /* None */ = g_dbus_interface_skeleton_has_connection(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
    connection.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Sets flags describing what the behavior of @skeleton should be.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: DBusInterfaceSkeletonFlags /* Some(GDBusInterfaceSkeletonFlags) */
  ): Unit /* None */ = g_dbus_interface_skeleton_set_flags(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
    flags.raw
  )

  /** Stops exporting @interface_ on all connections it is exported on.
    *
    * To unexport @interface_ from only a single connection, use
    * g_dbus_interface_skeleton_unexport_from_connection()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexport(): Unit /* None */ = g_dbus_interface_skeleton_unexport(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
  )

  /** Stops exporting @interface_ on @connection.
    *
    * To stop exporting on all connections the interface is exported on, use
    * g_dbus_interface_skeleton_unexport().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexportFromConnection(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */
  ): Unit /* None */ = g_dbus_interface_skeleton_unexport_from_connection(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
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
