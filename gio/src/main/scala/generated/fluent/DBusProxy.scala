package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncInitable
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusInterface
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.fluent.UnixFDList
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GBusType
import sn.gnome.gio.internal.GDBusCallFlags
import sn.gnome.gio.internal.GDBusInterfaceInfo
import sn.gnome.gio.internal.GDBusProxy
import sn.gnome.gio.internal.GDBusProxyFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDBusProxy is a base class used for proxies to access a D-Bus interface on
  * a remote object. A #GDBusProxy can be constructed for both well-known and
  * unique names.
  *
  * By default, #GDBusProxy will cache all properties (and listen to changes) of
  * the remote object, and proxy all signals that get emitted. This behaviour
  * can be changed by passing suitable #GDBusProxyFlags when the proxy is
  * created. If the proxy is for a well-known name, the property cache is
  * flushed when the name owner vanishes and reloaded when a name owner appears.
  *
  * The unique name owner of the proxy's name is tracked and can be read from
  * #GDBusProxy:g-name-owner. Connect to the #GObject::notify signal to get
  * notified of changes. Additionally, only signals and property changes emitted
  * from the current name owner are considered and calls are always sent to the
  * current name owner. This avoids a number of race conditions when the name is
  * lost by one owner and claimed by another. However, if no name owner
  * currently exists, then calls will be sent to the well-known name which may
  * result in the message bus launching an owner (unless
  * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is set).
  *
  * If the proxy is for a stateless D-Bus service, where the name owner may be
  * started and stopped between calls, the #GDBusProxy:g-name-owner tracking of
  * #GDBusProxy will cause the proxy to drop signal and property changes from
  * the service after it has restarted for the first time. When interacting with
  * a stateless D-Bus service, do not use #GDBusProxy — use direct D-Bus method
  * calls and signal connections.
  *
  * The generic #GDBusProxy::g-properties-changed and #GDBusProxy::g-signal
  * signals are not very convenient to work with. Therefore, the recommended way
  * of working with proxies is to subclass #GDBusProxy, and have more natural
  * properties and signals in your derived class. This
  * [example][gdbus-example-gdbus-codegen] shows how this can easily be done
  * using the [gdbus-codegen][gdbus-codegen] tool.
  *
  * A #GDBusProxy instance can be used from multiple threads but note that all
  * signals (e.g. #GDBusProxy::g-signal, #GDBusProxy::g-properties-changed and
  * #GObject::notify) are emitted in the [thread-default main
  * context][g-main-context-push-thread-default] of the thread where the
  * instance was constructed.
  *
  * An example using a proxy for a well-known name can be found in
  * [gdbus-example-watch-proxy.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-watch-proxy.c)
  */
class DBusProxy(raw: Ptr[GDBusProxy])
    extends Object(raw.asInstanceOf),
      AsyncInitable,
      DBusInterface,
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Asynchronously invokes the @method_name method on @proxy.
    *
    *  If @method_name contains any dots, then @name is split into interface and
    *  method name parts. This allows using @proxy for invoking methods on
    *  other interfaces.
    *
    *  If the #GDBusConnection associated with @proxy is closed then
    *  the operation will fail with %G_IO_ERROR_CLOSED. If
    *  @cancellable is canceled, the operation will fail with
    *  %G_IO_ERROR_CANCELLED. If @parameters contains a value not
    *  compatible with the D-Bus protocol, the operation fails with
    *  %G_IO_ERROR_INVALID_ARGUMENT.
    *
    *  If the @parameters #GVariant is floating, it is consumed. This allows
    *  convenient 'inline' use of g_variant_new(), e.g.:
    *  |[<!-- language="C" -->
    *   g_dbus_proxy_call (proxy,
    *                      "TwoStrings",
    *                      g_variant_new ("(ss)",
    *                                     "Thing One",
    *                                     "Thing Two"),
    *                      G_DBUS_CALL_FLAGS_NONE,
    *                      -1,
    *                      NULL,
    *                      (GAsyncReadyCallback) two_strings_done,
    *                      &data);
    *  ]|
    *
    *  If @proxy has an expected interface (see
    *  #GDBusProxy:g-interface-info) and @method_name is referenced by it,
    *  then the return value is checked against the return type.
    *
    *  This is an asynchronous method. When the operation is finished,
    *  @callback will be invoked in the
    *  [thread-default main context][g-main-context-push-thread-default]
    *  of the thread you are calling this method from.
    *  You can then call g_dbus_proxy_call_finish() to get the result of
    *  the operation. See g_dbus_proxy_call_sync() for the synchronous
    *  version of this method.
    *
    *  If @callback is %NULL then the D-Bus method call message will be sent with
    *  the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
    */
  def call(
      method_name: String | CString,
      parameters: Ptr[GVariant],
      flags: GDBusCallFlags,
      timeout_msec: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_dbus_proxy_call(
    this.raw.asInstanceOf,
    __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]],
    parameters,
    flags,
    gint(timeout_msec),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an operation started with g_dbus_proxy_call().
    */
  def callFinish(res: AsyncResult): GResult[Ptr[GVariant]] =
    GResult.wrap(__errorPtr =>
      g_dbus_proxy_call_finish(
        this.raw.asInstanceOf,
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Synchronously invokes the @method_name method on @proxy.
    *
    *  If @method_name contains any dots, then @name is split into interface and
    *  method name parts. This allows using @proxy for invoking methods on
    *  other interfaces.
    *
    *  If the #GDBusConnection associated with @proxy is disconnected then
    *  the operation will fail with %G_IO_ERROR_CLOSED. If
    *  @cancellable is canceled, the operation will fail with
    *  %G_IO_ERROR_CANCELLED. If @parameters contains a value not
    *  compatible with the D-Bus protocol, the operation fails with
    *  %G_IO_ERROR_INVALID_ARGUMENT.
    *
    *  If the @parameters #GVariant is floating, it is consumed. This allows
    *  convenient 'inline' use of g_variant_new(), e.g.:
    *  |[<!-- language="C" -->
    *   g_dbus_proxy_call_sync (proxy,
    *                           "TwoStrings",
    *                           g_variant_new ("(ss)",
    *                                          "Thing One",
    *                                          "Thing Two"),
    *                           G_DBUS_CALL_FLAGS_NONE,
    *                           -1,
    *                           NULL,
    *                           &error);
    *  ]|
    *
    *  The calling thread is blocked until a reply is received. See
    *  g_dbus_proxy_call() for the asynchronous version of this
    *  method.
    *
    *  If @proxy has an expected interface (see
    *  #GDBusProxy:g-interface-info) and @method_name is referenced by it,
    *  then the return value is checked against the return type.
    */
  def callSync(
      method_name: String | CString,
      parameters: Ptr[GVariant],
      flags: GDBusCallFlags,
      timeout_msec: Int,
      cancellable: Cancellable
  )(using Zone): GResult[Ptr[GVariant]] = GResult.wrap(__errorPtr =>
    g_dbus_proxy_call_sync(
      this.raw.asInstanceOf,
      __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]],
      parameters,
      flags,
      gint(timeout_msec),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_proxy_call() but also takes a #GUnixFDList object.
    *
    * This method is only available on UNIX.
    */
  def callWithUnixFdList(
      method_name: String | CString,
      parameters: Ptr[GVariant],
      flags: GDBusCallFlags,
      timeout_msec: Int,
      fd_list: UnixFDList,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_dbus_proxy_call_with_unix_fd_list(
    this.raw.asInstanceOf,
    __sn_extract_string(method_name).asInstanceOf[Ptr[gchar]],
    parameters,
    flags,
    gint(timeout_msec),
    fd_list.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  @annotation.compileTimeOnly(
    "Method call_with_unix_fd_list_finish contains an OUT parameter, which is not supported yet"
  )
  def callWithUnixFdListFinish() = ???

  @annotation.compileTimeOnly(
    "Method call_with_unix_fd_list_sync contains an OUT parameter, which is not supported yet"
  )
  def callWithUnixFdListSync() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the value for a property from the cache. This call does no
    * blocking IO.
    *
    * If @proxy has an expected interface (see #GDBusProxy:g-interface-info) and @property_name
    * is referenced by it, then @value is checked against the type of the
    * property.
    */
  def getCachedProperty(
      property_name: String | CString
  )(using Zone): Ptr[GVariant] = g_dbus_proxy_get_cached_property(
    this.raw.asInstanceOf,
    __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the connection @proxy is for.
    */
  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_proxy_get_connection(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the timeout to use if -1 (specifying default timeout) is passed as @timeout_msec
    * in the g_dbus_proxy_call() and g_dbus_proxy_call_sync() functions.
    *
    * See the #GDBusProxy:g-default-timeout property for more details.
    */
  def getDefaultTimeout(): Int = g_dbus_proxy_get_default_timeout(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the flags that @proxy was constructed with.
    */
  def getFlags(): GDBusProxyFlags = g_dbus_proxy_get_flags(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the #GDBusInterfaceInfo, if any, specifying the interface that @proxy
    * conforms to. See the #GDBusProxy:g-interface-info property for more
    * details.
    */
  def getInterfaceInfo(): Ptr[GDBusInterfaceInfo] =
    g_dbus_proxy_get_interface_info(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the D-Bus interface name @proxy is for.
    */
  def getInterfaceName()(using Zone): String = fromCString(
    g_dbus_proxy_get_interface_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name that @proxy was constructed for.
    *
    * When connected to a message bus, this will usually be non-%NULL. However,
    * it may be %NULL for a proxy that communicates using a peer-to-peer
    * pattern.
    */
  def getName()(using Zone): String = fromCString(
    g_dbus_proxy_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The unique name that owns the name that @proxy is for or %NULL if no-one
    * currently owns that name. You may connect to the #GObject::notify signal
    * to track changes to the #GDBusProxy:g-name-owner property.
    */
  def getNameOwner()(using Zone): String = fromCString(
    g_dbus_proxy_get_name_owner(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the object path @proxy is for.
    */
  def getObjectPath()(using Zone): String = fromCString(
    g_dbus_proxy_get_object_path(this.raw.asInstanceOf).asInstanceOf
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  If @value is not %NULL, sets the cached value for the property with
    *  name @property_name to the value in @value.
    *
    *  If @value is %NULL, then the cached value is removed from the
    *  property cache.
    *
    *  If @proxy has an expected interface (see
    *  #GDBusProxy:g-interface-info) and @property_name is referenced by
    *  it, then @value is checked against the type of the property.
    *
    *  If the @value #GVariant is floating, it is consumed. This allows
    *  convenient 'inline' use of g_variant_new(), e.g.
    *  |[<!-- language="C" -->
    *   g_dbus_proxy_set_cached_property (proxy,
    *                                     "SomeProperty",
    *                                     g_variant_new ("(si)",
    *                                                   "A String",
    *                                                   42));
    *  ]|
    *
    *  Normally you will not need to use this method since @proxy
    *  is tracking changes using the
    *  `org.freedesktop.DBus.Properties.PropertiesChanged`
    *  D-Bus signal. However, for performance reasons an object may
    *  decide to not use this signal for some properties and instead
    *  use a proprietary out-of-band mechanism to transmit changes.
    *
    *  As a concrete example, consider an object with a property
    *  `ChatroomParticipants` which is an array of strings. Instead of
    *  transmitting the same (long) array every time the property changes,
    *  it is more efficient to only transmit the delta using e.g. signals
    *  `ChatroomParticipantJoined(String name)` and
    *  `ChatroomParticipantParted(String name)`.
    */
  def setCachedProperty(property_name: String | CString, value: Ptr[GVariant])(
      using Zone
  ): Unit = g_dbus_proxy_set_cached_property(
    this.raw.asInstanceOf,
    __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]],
    value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the timeout to use if -1 (specifying default timeout) is passed as @timeout_msec
    * in the g_dbus_proxy_call() and g_dbus_proxy_call_sync() functions.
    *
    * See the #GDBusProxy:g-default-timeout property for more details.
    */
  def setDefaultTimeout(timeout_msec: Int): Unit =
    g_dbus_proxy_set_default_timeout(this.raw.asInstanceOf, gint(timeout_msec))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ensure that interactions with @proxy conform to the given interface. See
    * the #GDBusProxy:g-interface-info property for more details.
    */
  def setInterfaceInfo(info: Ptr[GDBusInterfaceInfo]): Unit =
    g_dbus_proxy_set_interface_info(this.raw.asInstanceOf, info)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusProxy

object DBusProxy:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes creating a #GDBusProxy.
    */
  def finish(res: AsyncResult): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes creating a #GDBusProxy.
    */
  def forBusFinish(res: AsyncResult): GResult[DBusProxy] =
    GResult.wrap(__errorPtr =>
      new DBusProxy(
        g_dbus_proxy_new_for_bus_finish(
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_proxy_new_sync() but takes a #GBusType instead of a
    * #GDBusConnection.
    *
    * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
    */
  def forBusSync(
      bus_type: GBusType,
      flags: GDBusProxyFlags,
      info: Ptr[GDBusInterfaceInfo],
      name: String | CString,
      object_path: String | CString,
      interface_name: String | CString,
      cancellable: Cancellable
  )(using Zone): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_for_bus_sync(
        bus_type,
        flags,
        info,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]],
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a proxy for accessing @interface_name on the remote object at @object_path
    * owned by @name at @connection and synchronously loads D-Bus properties
    * unless the %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES flag is used.
    *
    * If the %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS flag is not set, also
    * sets up match rules for signals. Connect to the #GDBusProxy::g-signal
    * signal to handle signals from the remote object.
    *
    * If both %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES and
    * %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS are set, this constructor is
    * guaranteed to return immediately without blocking.
    *
    * If @name is a well-known name and the
    * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START and
    * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION flags aren't set and
    * no name owner currently exists, the message bus will be requested to
    * launch a name owner for the name.
    *
    * This is a synchronous failable constructor. See g_dbus_proxy_new() and
    * g_dbus_proxy_new_finish() for the asynchronous version.
    *
    * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
    */
  def sync(
      connection: DBusConnection,
      flags: GDBusProxyFlags,
      info: Ptr[GDBusInterfaceInfo],
      name: String | CString,
      object_path: String | CString,
      interface_name: String | CString,
      cancellable: Cancellable
  )(using Zone): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_sync(
        connection.getUnsafeRawPointer().asInstanceOf,
        flags,
        info,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(interface_name).asInstanceOf[Ptr[gchar]],
        cancellable.getUnsafeRawPointer().asInstanceOf,
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
end DBusProxy
