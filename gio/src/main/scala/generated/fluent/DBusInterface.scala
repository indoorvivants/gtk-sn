package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{DBusInterfaceInfo, DBusObject}

trait DBusInterface:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the #GDBusObject that @interface_ belongs to, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupObject(): sn.gnome.gio.DBusObject /* None */ =
    new DBusObject.Abstract(
      g_dbus_interface_dup_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterface]]
      ).asInstanceOf
    )
  end dupObject

  /** Gets D-Bus introspection information for the D-Bus interface implemented
    * by @interface_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInfo(): sn.gnome.gio.DBusInterfaceInfo /* None */ =
    sn.gnome.gio.DBusInterfaceInfo.fromRaw(
      g_dbus_interface_get_info(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterface]]
      )
    )
  end getInfo

  /** Gets the #GDBusObject that @interface_ belongs to, if any.
    *
    * It is not safe to use the returned object if @interface_ or the returned
    * object is being used from other threads. See g_dbus_interface_dup_object()
    * for a thread-safe alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObject(): sn.gnome.gio.DBusObject /* None */ =
    new DBusObject.Abstract(
      g_dbus_interface_get_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterface]]
      ).asInstanceOf
    )
  end getObject

  /** Sets the #GDBusObject for @interface_ to @object.
    *
    * Note that @interface_ will hold a weak reference to @object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setObject(
      `object`: Option[sn.gnome.gio.DBusObject /* Some(Ptr[GDBusObject]) */ ]
  ): Unit /* None */ =
    g_dbus_interface_set_object(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterface]],
      `object`
        .map[Ptr[GDBusObject]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GDBusObject]])
    )
  end setObject

end DBusInterface

object DBusInterface:
  class Abstract(raw: Ptr[Byte]) extends DBusInterface:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DBusInterface
