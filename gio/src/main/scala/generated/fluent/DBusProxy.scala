package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  AsyncInitable,
  AsyncResult,
  DBusConnection,
  DBusInterface,
  DBusProxyFlags,
  Initable
}
import sn.gnome.gio.internal.GDBusProxy
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gchar, gint}
import sn.gnome.gobject.fluent.Object

/** #GDBusProxy is a base class used for proxies to access a D-Bus interface on
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusProxy(raw: Ptr[GDBusProxy])
    extends Object(raw.asInstanceOf),
      AsyncInitable,
      DBusInterface,
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /**  Asynchronously invokes the @method_name method on @proxy.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[call/<method parameters>/parameters]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def call__ = ???

  /** Finishes an operation started with g_dbus_proxy_call().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[call_finish/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def callFinish__ = ???

  /**  Synchronously invokes the @method_name method on @proxy.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[call_sync/<method parameters>/parameters]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def callSync__ = ???

  /** Like g_dbus_proxy_call() but also takes a #GUnixFDList object.
    *
    * This method is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[call_with_unix_fd_list/<method parameters>/parameters]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def callWithUnixFdList__ = ???

  /** Finishes an operation started with g_dbus_proxy_call_with_unix_fd_list().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[call_with_unix_fd_list_finish]: Method call_with_unix_fd_list_finish contains an OUT parameter, which is not supported yet"
  )
  private def callWithUnixFdListFinish__ = ???

  /** Like g_dbus_proxy_call_sync() but also takes and returns #GUnixFDList
    * objects.
    *
    * This method is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[call_with_unix_fd_list_sync]: Method call_with_unix_fd_list_sync contains an OUT parameter, which is not supported yet"
  )
  private def callWithUnixFdListSync__ = ???

  /** Looks up the value for a property from the cache. This call does no
    * blocking IO.
    *
    * If @proxy has an expected interface (see #GDBusProxy:g-interface-info) and @property_name
    * is referenced by it, then @value is checked against the type of the
    * property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_cached_property/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getCachedProperty__ = ???

  /** Gets the names of all cached properties on @proxy.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_cached_property_names/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def getCachedPropertyNames__ = ???

  /** Gets the connection @proxy is for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection(): DBusConnection /* None */ = new DBusConnection(
    g_dbus_proxy_get_connection(
      this.raw.asInstanceOf[Ptr[GDBusProxy]]
    ).asInstanceOf
  )

  /** Gets the timeout to use if -1 (specifying default timeout) is passed as @timeout_msec
    * in the g_dbus_proxy_call() and g_dbus_proxy_call_sync() functions.
    *
    * See the #GDBusProxy:g-default-timeout property for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultTimeout(): Int /* None */ = g_dbus_proxy_get_default_timeout(
    this.raw.asInstanceOf[Ptr[GDBusProxy]]
  ).value

  /** Gets the flags that @proxy was constructed with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): DBusProxyFlags /* None */ = DBusProxyFlags.fromRaw(
    g_dbus_proxy_get_flags(this.raw.asInstanceOf[Ptr[GDBusProxy]])
  )

  /** Returns the #GDBusInterfaceInfo, if any, specifying the interface that @proxy
    * conforms to. See the #GDBusProxy:g-interface-info property for more
    * details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_interface_info/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def getInterfaceInfo__ = ???

  /** Gets the D-Bus interface name @proxy is for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterfaceName()(using Zone): String /* None */ = fromCString(
    g_dbus_proxy_get_interface_name(
      this.raw.asInstanceOf[Ptr[GDBusProxy]]
    ).asInstanceOf
  )

  /** Gets the name that @proxy was constructed for.
    *
    * When connected to a message bus, this will usually be non-%NULL. However,
    * it may be %NULL for a proxy that communicates using a peer-to-peer
    * pattern.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ = fromCString(
    g_dbus_proxy_get_name(this.raw.asInstanceOf[Ptr[GDBusProxy]]).asInstanceOf
  )

  /** The unique name that owns the name that @proxy is for or %NULL if no-one
    * currently owns that name. You may connect to the #GObject::notify signal
    * to track changes to the #GDBusProxy:g-name-owner property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNameOwner()(using Zone): String /* None */ = fromCString(
    g_dbus_proxy_get_name_owner(
      this.raw.asInstanceOf[Ptr[GDBusProxy]]
    ).asInstanceOf
  )

  /** Gets the object path @proxy is for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath()(using Zone): String /* None */ = fromCString(
    g_dbus_proxy_get_object_path(
      this.raw.asInstanceOf[Ptr[GDBusProxy]]
    ).asInstanceOf
  )

  /**  If @value is not %NULL, sets the cached value for the property with
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_cached_property/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setCachedProperty__ = ???

  /** Sets the timeout to use if -1 (specifying default timeout) is passed as @timeout_msec
    * in the g_dbus_proxy_call() and g_dbus_proxy_call_sync() functions.
    *
    * See the #GDBusProxy:g-default-timeout property for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultTimeout(
      timeout_msec: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ = g_dbus_proxy_set_default_timeout(
    this.raw.asInstanceOf[Ptr[GDBusProxy]],
    gint(timeout_msec)
  )

  /** Ensure that interactions with @proxy conform to the given interface. See
    * the #GDBusProxy:g-interface-info property for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_interface_info/<method parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def setInterfaceInfo__ = ???

end DBusProxy

object DBusProxy:
  /** Finishes creating a #GDBusProxy.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def finish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Finishes creating a #GDBusProxy.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forBusFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[DBusProxy] = GResult.wrap(__errorPtr =>
    new DBusProxy(
      g_dbus_proxy_new_for_bus_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Like g_dbus_proxy_new_sync() but takes a #GBusType instead of a
    * #GDBusConnection.
    *
    * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def new_for_bus_sync() = ???

  /** Creates a proxy for accessing @interface_name on the remote object at @object_path
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def new_sync() = ???

  /** Creates a proxy for accessing @interface_name on the remote object at @object_path
    * owned by @name at @connection and asynchronously loads D-Bus properties
    * unless the %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES flag is used.
    * Connect to the #GDBusProxy::g-properties-changed signal to get notified
    * about property changes.
    *
    * If the %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS flag is not set, also
    * sets up match rules for signals. Connect to the #GDBusProxy::g-signal
    * signal to handle signals from the remote object.
    *
    * If both %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES and
    * %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS are set, this constructor is
    * guaranteed to complete immediately without blocking.
    *
    * If @name is a well-known name and the
    * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START and
    * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION flags aren't set and
    * no name owner currently exists, the message bus will be requested to
    * launch a name owner for the name.
    *
    * This is a failable asynchronous constructor - when the proxy is ready, @callback
    * will be invoked and you can use g_dbus_proxy_new_finish() to get the
    * result.
    *
    * See g_dbus_proxy_new_sync() and for a synchronous version of this
    * constructor.
    *
    * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<function parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def `new`() = ???

  /** Like g_dbus_proxy_new() but takes a #GBusType instead of a
    * #GDBusConnection.
    *
    * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<function parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def newForBus() = ???

end DBusProxy
