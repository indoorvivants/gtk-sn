package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  ActionGroup,
  DBusActionGroup,
  DBusConnection,
  RemoteActionGroup
}
import sn.gnome.gio.internal.GDBusActionGroup
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDBusActionGroup is an implementation of the #GActionGroup interface that
  * can be used as a proxy for an action group that is exported over D-Bus with
  * g_dbus_connection_export_action_group().
  */
class DBusActionGroup(raw: Ptr[GDBusActionGroup])
    extends Object(raw.asInstanceOf),
      ActionGroup,
      RemoteActionGroup:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DBusActionGroup

object DBusActionGroup:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains a #GDBusActionGroup for the action group which is exported at the
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
    */
  def get(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */,
      bus_name: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusActionGroup /* Some(Ptr[GDBusActionGroup]) */ =
    new DBusActionGroup(
      g_dbus_action_group_get(
        connection.getUnsafeRawPointer().asInstanceOf,
        bus_name
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
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
end DBusActionGroup
