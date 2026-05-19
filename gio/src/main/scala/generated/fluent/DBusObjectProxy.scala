package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{DBusConnection, DBusObject}
import sn.gnome.gio.internal.GDBusObjectProxy
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** A #GDBusObjectProxy is an object used to represent a remote object with one
  * or more D-Bus interfaces. Normally, you don't instantiate a
  * #GDBusObjectProxy yourself - typically #GDBusObjectManagerClient is used to
  * obtain it.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectProxy private[gnome] (raw: Ptr[GDBusObjectProxy])
    extends Object(raw.asInstanceOf),
      DBusObject:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the connection that @proxy is for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection()(using Runtime): sn.gnome.gio.DBusConnection /* None */ =
    sn.gnome.gio.DBusConnection.applyUnsafe(
      g_dbus_object_proxy_get_connection(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectProxy]]
      ).asInstanceOf
    )
  end getConnection

end DBusObjectProxy

object DBusObjectProxy:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusObjectProxy])(using Runtime) =
    summon[Runtime].getOrCreate[DBusObjectProxy](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusObjectProxy(ptr)
    )

  /** Creates a new #GDBusObjectProxy for the given connection and object path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      connection: sn.gnome.gio.DBusConnection /* Some(Ptr[GDBusConnection]) */,
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): DBusObjectProxy =
    val raw: Ptr[Byte] = g_dbus_object_proxy_new(
      connection.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[DBusObjectProxy](
      raw,
      r => DBusObjectProxy.applyUnsafe(r.asInstanceOf)
    )
  end apply
end DBusObjectProxy
