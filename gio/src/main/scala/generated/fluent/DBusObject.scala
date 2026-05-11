package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusInterface
import sn.gnome.glib.internal.gchar

trait DBusObject:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the D-Bus interface with name @interface_name associated with
    * @object,
    *   if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterface(
      interface_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusInterface /* None */ =
    new DBusInterface.Abstract(
      g_dbus_object_get_interface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObject]],
        toCString(interface_name).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getInterface

  /** Gets the D-Bus interfaces associated with @object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_interfaces/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusInterface))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getInterfaces__ = ???

  /** Gets the object path for @object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath()(using Zone): String /* None */ =
    fromCString(
      g_dbus_object_get_object_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObject]]
      ).asInstanceOf
    )
  end getObjectPath

end DBusObject

object DBusObject:
  class Abstract(raw: Ptr[Byte]) extends DBusObject:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DBusObject
