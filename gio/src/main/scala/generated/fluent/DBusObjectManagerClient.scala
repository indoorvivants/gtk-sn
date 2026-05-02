package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncInitable
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusObjectManager
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.internal.GBusType
import sn.gnome.gio.internal.GDBusObjectManagerClient
import sn.gnome.gio.internal.GDBusObjectManagerClientFlags
import sn.gnome.gio.internal.GDBusProxyTypeFunc
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDBusObjectManagerClient is used to create, monitor and delete object
  * proxies for remote objects exported by a #GDBusObjectManagerServer (or any
  * code implementing the
  * [org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
  * interface).
  *
  * Once an instance of this type has been created, you can connect to the
  * #GDBusObjectManager::object-added and #GDBusObjectManager::object-removed
  * signals and inspect the #GDBusObjectProxy objects returned by
  * g_dbus_object_manager_get_objects().
  *
  * If the name for a #GDBusObjectManagerClient is not owned by anyone at object
  * construction time, the default behavior is to request the message bus to
  * launch an owner for the name. This behavior can be disabled using the
  * %G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START flag. It's also worth
  * noting that this only works if the name of interest is activatable in the
  * first place. E.g. in some cases it is not possible to launch an owner for
  * the requested name. In this case, #GDBusObjectManagerClient object
  * construction still succeeds but there will be no object proxies (e.g.
  * g_dbus_object_manager_get_objects() returns the empty list) and the
  * #GDBusObjectManagerClient:name-owner property is %NULL.
  *
  * The owner of the requested name can come and go (for example consider a
  * system service being restarted) – #GDBusObjectManagerClient handles this
  * case too; simply connect to the #GObject::notify signal to watch for changes
  * on the #GDBusObjectManagerClient:name-owner property. When the name owner
  * vanishes, the behavior is that #GDBusObjectManagerClient:name-owner is set
  * to %NULL (this includes emission of the #GObject::notify signal) and then
  * #GDBusObjectManager::object-removed signals are synthesized for all
  * currently existing object proxies. Since
  * #GDBusObjectManagerClient:name-owner is %NULL when this happens, you can use
  * this information to disambiguate a synthesized signal from a genuine signal
  * caused by object removal on the remote #GDBusObjectManager. Similarly, when
  * a new name owner appears, #GDBusObjectManager::object-added signals are
  * synthesized while #GDBusObjectManagerClient:name-owner is still %NULL. Only
  * when all object proxies have been added, the
  * #GDBusObjectManagerClient:name-owner is set to the new name owner (this
  * includes emission of the #GObject::notify signal). Furthermore, you are
  * guaranteed that #GDBusObjectManagerClient:name-owner will alternate between
  * a name owner (e.g. `:1.42`) and %NULL even in the case where the name of
  * interest is atomically replaced
  *
  * Ultimately, #GDBusObjectManagerClient is used to obtain #GDBusProxy
  * instances. All signals (including the
  * org.freedesktop.DBus.Properties::PropertiesChanged signal) delivered to
  * #GDBusProxy instances are guaranteed to originate from the name owner. This
  * guarantee along with the behavior described above, means that certain race
  * conditions including the "half the proxy is from the old owner and the other
  * half is from the new owner" problem cannot happen.
  *
  * To avoid having the application connect to signals on the returned
  * #GDBusObjectProxy and #GDBusProxy objects, the
  * #GDBusObject::interface-added, #GDBusObject::interface-removed,
  * #GDBusProxy::g-properties-changed and #GDBusProxy::g-signal signals are also
  * emitted on the #GDBusObjectManagerClient instance managing these objects.
  * The signals emitted are #GDBusObjectManager::interface-added,
  * #GDBusObjectManager::interface-removed,
  * #GDBusObjectManagerClient::interface-proxy-properties-changed and
  * #GDBusObjectManagerClient::interface-proxy-signal.
  *
  * Note that all callbacks and signals are emitted in the [thread-default main
  * context][g-main-context-push-thread-default] that the
  * #GDBusObjectManagerClient object was constructed in. Additionally, the
  * #GDBusObjectProxy and #GDBusProxy objects originating from the
  * #GDBusObjectManagerClient object will be created in the same context and,
  * consequently, will deliver signals in the same main loop.
  */
class DBusObjectManagerClient(raw: Ptr[GDBusObjectManagerClient])
    extends Object(raw.asInstanceOf),
      AsyncInitable,
      DBusObjectManager,
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GDBusConnection used by @manager.
    */
  def getConnection(): DBusConnection /* None */ = new DBusConnection(
    g_dbus_object_manager_client_get_connection(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the flags that @manager was constructed with.
    */
  def getFlags(): GDBusObjectManagerClientFlags /* None */ =
    g_dbus_object_manager_client_get_flags(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name that @manager is for, or %NULL if not a message bus
    * connection.
    */
  def getName()(using Zone): String /* None */ = fromCString(
    g_dbus_object_manager_client_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The unique name that owns the name that @manager is for or %NULL if no-one
    * currently owns that name. You can connect to the #GObject::notify signal
    * to track changes to the #GDBusObjectManagerClient:name-owner property.
    */
  def getNameOwner()(using Zone): String /* None */ = fromCString(
    g_dbus_object_manager_client_get_name_owner(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

end DBusObjectManagerClient

object DBusObjectManagerClient:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an operation started with g_dbus_object_manager_client_new().
    */
  def finish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[DBusObjectManagerClient] = GResult.wrap(__errorPtr =>
    new DBusObjectManagerClient(
      g_dbus_object_manager_client_new_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an operation started with
    * g_dbus_object_manager_client_new_for_bus().
    */
  def forBusFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[DBusObjectManagerClient] = GResult.wrap(__errorPtr =>
    new DBusObjectManagerClient(
      g_dbus_object_manager_client_new_for_bus_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_object_manager_client_new_sync() but takes a #GBusType instead
    * of a #GDBusConnection.
    *
    * This is a synchronous failable constructor - the calling thread is blocked
    * until a reply is received. See g_dbus_object_manager_client_new_for_bus()
    * for the asynchronous version.
    */
  def forBusSync(
      bus_type: GBusType /* Some(GBusType) */,
      flags: GDBusObjectManagerClientFlags /* Some(GDBusObjectManagerClientFlags) */,
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      get_proxy_type_func: Option[
        GDBusProxyTypeFunc /* Some(GDBusProxyTypeFunc) */
      ],
      get_proxy_type_user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      get_proxy_type_destroy_notify: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ],
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[DBusObjectManagerClient] = GResult.wrap(__errorPtr =>
    new DBusObjectManagerClient(
      g_dbus_object_manager_client_new_for_bus_sync(
        bus_type,
        flags,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        get_proxy_type_func
          .map[GDBusProxyTypeFunc](o => o)
          .getOrElse(null.asInstanceOf[GDBusProxyTypeFunc]),
        get_proxy_type_user_data
          .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
        get_proxy_type_destroy_notify
          .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
          .getOrElse(
            null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
          ),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusObjectManagerClient object.
    *
    * This is a synchronous failable constructor - the calling thread is blocked
    * until a reply is received. See g_dbus_object_manager_client_new() for the
    * asynchronous version.
    */
  def sync(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */,
      flags: GDBusObjectManagerClientFlags /* Some(GDBusObjectManagerClientFlags) */,
      name: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      get_proxy_type_func: Option[
        GDBusProxyTypeFunc /* Some(GDBusProxyTypeFunc) */
      ],
      get_proxy_type_user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      get_proxy_type_destroy_notify: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ],
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[DBusObjectManagerClient] = GResult.wrap(__errorPtr =>
    new DBusObjectManagerClient(
      g_dbus_object_manager_client_new_sync(
        connection.getUnsafeRawPointer().asInstanceOf,
        flags,
        name
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        get_proxy_type_func
          .map[GDBusProxyTypeFunc](o => o)
          .getOrElse(null.asInstanceOf[GDBusProxyTypeFunc]),
        get_proxy_type_user_data
          .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
        get_proxy_type_destroy_notify
          .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
          .getOrElse(
            null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
          ),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf
    )
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusObjectManagerClient
