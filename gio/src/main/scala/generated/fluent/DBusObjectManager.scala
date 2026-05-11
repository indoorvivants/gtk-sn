package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{DBusInterface, DBusObject}
import sn.gnome.glib.internal.gchar

trait DBusObjectManager:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the interface proxy for @interface_name at @object_path, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterface(
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      interface_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusInterface /* None */ =
    new DBusInterface.Abstract(
      g_dbus_object_manager_get_interface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManager]],
        toCString(object_path).asInstanceOf[Ptr[gchar]],
        toCString(interface_name).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getInterface

  /** Gets the #GDBusObject at @object_path, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObject(
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusObject /* None */ =
    new DBusObject.Abstract(
      g_dbus_object_manager_get_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManager]],
        toCString(object_path).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getObject

  /** Gets the object path that @manager is for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath()(using Zone): String /* None */ =
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
  @annotation.compileTimeOnly(
    "[method get_objects/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusObject))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getObjects__ = ???

end DBusObjectManager

object DBusObjectManager:
  class Abstract(raw: Ptr[Byte]) extends DBusObjectManager:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DBusObjectManager
