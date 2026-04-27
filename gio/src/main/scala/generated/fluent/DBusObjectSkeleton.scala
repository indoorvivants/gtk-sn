package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusInterfaceSkeleton
import sn.gnome.gio.fluent.DBusObject
import sn.gnome.gio.internal.GDBusObjectSkeleton
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class DBusObjectSkeleton(raw: Ptr[GDBusObjectSkeleton])
    extends Object(raw.asInstanceOf),
      DBusObject:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addInterface(`interface_`: DBusInterfaceSkeleton): Unit =
    g_dbus_object_skeleton_add_interface(
      this.raw.asInstanceOf,
      `interface_`.getUnsafeRawPointer().asInstanceOf
    )

  def flush(): Unit = g_dbus_object_skeleton_flush(this.raw.asInstanceOf)

  def removeInterface(`interface_`: DBusInterfaceSkeleton): Unit =
    g_dbus_object_skeleton_remove_interface(
      this.raw.asInstanceOf,
      `interface_`.getUnsafeRawPointer().asInstanceOf
    )

  def removeInterfaceByName(
      interface_name: String | CString
  )(using Zone): Unit = g_dbus_object_skeleton_remove_interface_by_name(
    this.raw.asInstanceOf,
    __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]]
  )

  def setObjectPath(object_path: String | CString)(using Zone): Unit =
    g_dbus_object_skeleton_set_object_path(
      this.raw.asInstanceOf,
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
  def apply(object_path: String | CString)(using Zone): DBusObjectSkeleton =
    new DBusObjectSkeleton(
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
