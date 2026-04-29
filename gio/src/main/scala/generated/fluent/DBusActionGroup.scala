package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.RemoteActionGroup
import sn.gnome.gio.internal.GDBusActionGroup
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
