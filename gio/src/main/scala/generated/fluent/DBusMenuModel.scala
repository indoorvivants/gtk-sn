package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GDBusMenuModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDBusMenuModel is an implementation of #GMenuModel that can be used as a
  * proxy for a menu model that is exported over D-Bus with
  * g_dbus_connection_export_menu_model().
  */
class DBusMenuModel(raw: Ptr[GDBusMenuModel])
    extends MenuModel(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DBusMenuModel
