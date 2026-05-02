package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusInterfaceSkeleton
import sn.gnome.gio.fluent.DBusObject
import sn.gnome.gio.internal.GDBusObjectSkeleton
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GDBusObjectSkeleton instance is essentially a group of D-Bus interfaces.
  * The set of exported interfaces on the object may be dynamic and change at
  * runtime.
  *
  * This type is intended to be used with #GDBusObjectManager.
  */
class DBusObjectSkeleton(raw: Ptr[GDBusObjectSkeleton])
    extends Object(raw.asInstanceOf),
      DBusObject:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @interface_ to @object.
    *
    * If @object already contains a #GDBusInterfaceSkeleton with the same
    * interface name, it is removed before @interface_ is added.
    *
    * Note that @object takes its own reference on @interface_ and holds it
    * until removed.
    */
  def addInterface(
      `interface_`: DBusInterfaceSkeleton /* Some(Ptr[GDBusInterfaceSkeleton]) */
  ): Unit /* None */ = g_dbus_object_skeleton_add_interface(
    this.raw.asInstanceOf[Ptr[GDBusObjectSkeleton]],
    `interface_`.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This method simply calls g_dbus_interface_skeleton_flush() on all
    * interfaces belonging to @object. See that method for when flushing is
    * useful.
    */
  def flush(): Unit /* None */ = g_dbus_object_skeleton_flush(
    this.raw.asInstanceOf[Ptr[GDBusObjectSkeleton]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @interface_ from @object.
    */
  def removeInterface(
      `interface_`: DBusInterfaceSkeleton /* Some(Ptr[GDBusInterfaceSkeleton]) */
  ): Unit /* None */ = g_dbus_object_skeleton_remove_interface(
    this.raw.asInstanceOf[Ptr[GDBusObjectSkeleton]],
    `interface_`.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the #GDBusInterface with @interface_name from @object.
    *
    * If no D-Bus interface of the given interface exists, this function does
    * nothing.
    */
  def removeInterfaceByName(
      interface_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_dbus_object_skeleton_remove_interface_by_name(
      this.raw.asInstanceOf[Ptr[GDBusObjectSkeleton]],
      __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the object path for @object.
    */
  def setObjectPath(
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_dbus_object_skeleton_set_object_path(
    this.raw.asInstanceOf[Ptr[GDBusObjectSkeleton]],
    __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusObjectSkeleton

object DBusObjectSkeleton:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusObjectSkeleton.
    */
  def apply(
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusObjectSkeleton = new DBusObjectSkeleton(
    g_dbus_object_skeleton_new(
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
end DBusObjectSkeleton
