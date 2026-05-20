package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{DBusInterface, DBusObject}
import sn.gnome.glib.List
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.runtime.*

trait DBusObjectManager:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the interface proxy for @interface_name at @object_path, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterface(
      object_path: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      interface_name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): sn.gnome.gio.DBusInterface /* None */ =
    new DBusInterface.Abstract(
      g_dbus_object_manager_get_interface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManager]],
        summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]],
        summon[Runtime]
          .inZone(toCString(interface_name))
          .asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getInterface

  /** Gets the #GDBusObject at @object_path, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObject(
      object_path: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): sn.gnome.gio.DBusObject /* None */ =
    new DBusObject.Abstract(
      g_dbus_object_manager_get_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManager]],
        summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getObject

  /** Gets the object path that @manager is for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath(): scala.Predef.String /* None */ =
    fromCString(
      g_dbus_object_manager_get_object_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManager]]
      ).asInstanceOf
    )
  end getObjectPath

  /** Gets all #GDBusObject objects known to @manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjects(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_dbus_object_manager_get_objects(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManager]]
      )
    )
  end getObjects

end DBusObjectManager

object DBusObjectManager:
  class Abstract(raw: Ptr[Byte]) extends DBusObjectManager:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DBusObjectManager
