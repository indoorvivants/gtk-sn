package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  ActionGroup,
  DBusActionGroup,
  DBusConnection,
  RemoteActionGroup
}
import sn.gnome.gio.internal.GDBusActionGroup
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GDBusActionGroup is an implementation of the #GActionGroup interface that
  * can be used as a proxy for an action group that is exported over D-Bus with
  * g_dbus_connection_export_action_group().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusActionGroup private[gnome] (raw: Ptr[GDBusActionGroup])
    extends Object(raw.asInstanceOf),
      ActionGroup,
      RemoteActionGroup:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DBusActionGroup

object DBusActionGroup:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusActionGroup])(using Runtime) =
    summon[Runtime].getOrCreate[DBusActionGroup](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusActionGroup(ptr)
    )

  /** Obtains a #GDBusActionGroup for the action group which is exported at the
    * given @bus_name and @object_path.
    *
    * The thread default main context is taken at the time of this call. All
    * signals on the menu model (and any linked models) are reported with
    * respect to this context. All calls on the returned menu model (and linked
    * models) must also originate from this same context, with the thread
    * default main context unchanged.
    *
    * This call is non-blocking. The returned action group may or may not
    * already be filled in. The correct thing to do is connect the signals for
    * the action group to monitor for changes and then to call
    * g_action_group_list_actions() to get the initial list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(
      connection: sn.gnome.gio.DBusConnection /* Some(Ptr[GDBusConnection]) */,
      bus_name: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using
      Runtime
  ): sn.gnome.gio.DBusActionGroup /* Some(Ptr[GDBusActionGroup]) */ =
    sn.gnome.gio.DBusActionGroup.applyUnsafe(
      g_dbus_action_group_get(
        connection.getUnsafeRawPointer().asInstanceOf,
        bus_name
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            summon[Runtime].inZone(toCString(o)).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

end DBusActionGroup
