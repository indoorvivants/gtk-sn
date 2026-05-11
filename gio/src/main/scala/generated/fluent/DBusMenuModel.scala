package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{DBusConnection, DBusMenuModel, MenuModel}
import sn.gnome.gio.internal.GDBusMenuModel
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.runtime.*

/** #GDBusMenuModel is an implementation of #GMenuModel that can be used as a
  * proxy for a menu model that is exported over D-Bus with
  * g_dbus_connection_export_menu_model().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusMenuModel private[gnome] (raw: Ptr[GDBusMenuModel])
    extends MenuModel(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DBusMenuModel

object DBusMenuModel:
  def applyUnsafe(ptr: Ptr[GDBusMenuModel])(using Runtime) =
    summon[Runtime].getOrCreate[DBusMenuModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusMenuModel(ptr)
    )

  /** Obtains a #GDBusMenuModel for the menu model which is exported at the
    * given @bus_name and @object_path.
    *
    * The thread default main context is taken at the time of this call. All
    * signals on the menu model (and any linked models) are reported with
    * respect to this context. All calls on the returned menu model (and linked
    * models) must also originate from this same context, with the thread
    * default main context unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(
      connection: sn.gnome.gio.fluent.DBusConnection /* Some(Ptr[GDBusConnection]) */,
      bus_name: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gio.fluent.DBusMenuModel /* Some(Ptr[GDBusMenuModel]) */ =
    sn.gnome.gio.fluent.DBusMenuModel.applyUnsafe(
      g_dbus_menu_model_get(
        connection.getUnsafeRawPointer().asInstanceOf,
        bus_name
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        toCString(object_path).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

end DBusMenuModel
