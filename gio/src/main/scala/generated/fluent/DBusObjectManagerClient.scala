package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  AsyncInitable,
  AsyncResult,
  DBusConnection,
  DBusObjectManager,
  DBusObjectManagerClientFlags,
  Initable
}
import sn.gnome.gio.internal.GDBusObjectManagerClient
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GDBusObjectManagerClient is used to create, monitor and delete object
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectManagerClient private[gnome] (
    raw: Ptr[GDBusObjectManagerClient]
) extends Object(raw.asInstanceOf),
      AsyncInitable,
      DBusObjectManager,
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GDBusConnection used by @manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection()(using Runtime): sn.gnome.gio.DBusConnection /* None */ =
    sn.gnome.gio.DBusConnection.applyUnsafe(
      g_dbus_object_manager_client_get_connection(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerClient]]
      ).asInstanceOf
    )
  end getConnection

  /** Gets the flags that @manager was constructed with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): DBusObjectManagerClientFlags /* None */ =
    DBusObjectManagerClientFlags.fromRaw(
      g_dbus_object_manager_client_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerClient]]
      )
    )
  end getFlags

  /** Gets the name that @manager is for, or %NULL if not a message bus
    * connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): String /* None */ =
    fromCString(
      g_dbus_object_manager_client_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerClient]]
      ).asInstanceOf
    )
  end getName

  /** The unique name that owns the name that @manager is for or %NULL if no-one
    * currently owns that name. You can connect to the #GObject::notify signal
    * to track changes to the #GDBusObjectManagerClient:name-owner property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNameOwner()(using Zone): String /* None */ =
    fromCString(
      g_dbus_object_manager_client_get_name_owner(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectManagerClient]]
      ).asInstanceOf
    )
  end getNameOwner

  /** Emitted when one or more D-Bus properties on proxy changes. The local
    * cache has already been updated when this signal fires. Note that both @changed_properties
    * and @invalidated_properties are guaranteed to never be %NULL (either may
    * be empty though).
    *
    * This signal exists purely as a convenience to avoid having to connect
    * signals to all interface proxies managed by @manager.
    *
    * This signal is emitted in the [thread-default main
    * context][g-main-context-push-thread-default] that @manager was constructed
    * in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal interface-proxy-properties-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))"
  )
  private def onInterfaceProxyPropertiesChanged = ???

  /** Emitted when a D-Bus signal is received on @interface_proxy.
    *
    * This signal exists purely as a convenience to avoid having to connect
    * signals to all interface proxies managed by @manager.
    *
    * This signal is emitted in the [thread-default main
    * context][g-main-context-push-thread-default] that @manager was constructed
    * in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal interface-proxy-signal]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))"
  )
  private def onInterfaceProxySignal = ???

end DBusObjectManagerClient

object DBusObjectManagerClient:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusObjectManagerClient])(using Runtime) =
    summon[Runtime].getOrCreate[DBusObjectManagerClient](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusObjectManagerClient(ptr)
    )

  /** Finishes an operation started with g_dbus_object_manager_client_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def finish(res: AsyncResult /* Some(Ptr[GAsyncResult]) */ )(using
      Runtime
  ): GResult[DBusObjectManagerClient] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_dbus_object_manager_client_new_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[DBusObjectManagerClient](
          raw,
          r => DBusObjectManagerClient.applyUnsafe(r.asInstanceOf)
        )

  end finish

  /** Finishes an operation started with
    * g_dbus_object_manager_client_new_for_bus().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forBusFinish(res: AsyncResult /* Some(Ptr[GAsyncResult]) */ )(using
      Runtime
  ): GResult[DBusObjectManagerClient] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_dbus_object_manager_client_new_for_bus_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[DBusObjectManagerClient](
          raw,
          r => DBusObjectManagerClient.applyUnsafe(r.asInstanceOf)
        )

  end forBusFinish

  /** Like g_dbus_object_manager_client_new_sync() but takes a #GBusType instead
    * of a #GDBusConnection.
    *
    * This is a synchronous failable constructor - the calling thread is blocked
    * until a reply is received. See g_dbus_object_manager_client_new_for_bus()
    * for the asynchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_for_bus_sync/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))"
  )
  private def forBusSync() = ???

  /** Creates a new #GDBusObjectManagerClient object.
    *
    * This is a synchronous failable constructor - the calling thread is blocked
    * until a reply is received. See g_dbus_object_manager_client_new() for the
    * asynchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_sync/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))"
  )
  private def sync() = ???

  /** Asynchronously creates a new #GDBusObjectManagerClient object.
    *
    * This is an asynchronous failable constructor. When the result is ready, @callback
    * will be invoked in the [thread-default main
    * context][g-main-context-push-thread-default] of the thread you are calling
    * this method from. You can then call
    * g_dbus_object_manager_client_new_finish() to get the result. See
    * g_dbus_object_manager_client_new_sync() for the synchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function new/<function parameters>/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))"
  )
  private def `new`() = ???

  /** Like g_dbus_object_manager_client_new() but takes a #GBusType instead of a
    * #GDBusConnection.
    *
    * This is an asynchronous failable constructor. When the result is ready, @callback
    * will be invoked in the [thread-default main
    * loop][g-main-context-push-thread-default] of the thread you are calling
    * this method from. You can then call
    * g_dbus_object_manager_client_new_for_bus_finish() to get the result. See
    * g_dbus_object_manager_client_new_for_bus_sync() for the synchronous
    * version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function new_for_bus/<function parameters>/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))"
  )
  private def newForBus() = ???

end DBusObjectManagerClient
