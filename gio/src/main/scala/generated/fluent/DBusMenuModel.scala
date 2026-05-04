package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{DBusConnection, DBusMenuModel, MenuModel}
import sn.gnome.gio.internal.GDBusMenuModel
import sn.gnome.glib.internal.gchar

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

object DBusMenuModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains a #GDBusMenuModel for the menu model which is exported at the
    * given @bus_name and @object_path.
    *
    * The thread default main context is taken at the time of this call. All
    * signals on the menu model (and any linked models) are reported with
    * respect to this context. All calls on the returned menu model (and linked
    * models) must also originate from this same context, with the thread
    * default main context unchanged.
    */
  def get(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */,
      bus_name: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusMenuModel /* Some(Ptr[GDBusMenuModel]) */ =
    new DBusMenuModel(
      g_dbus_menu_model_get(
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
end DBusMenuModel
