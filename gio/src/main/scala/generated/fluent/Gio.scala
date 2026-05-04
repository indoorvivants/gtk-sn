package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  AppInfo,
  AppInfoCreateFlags,
  AppLaunchContext,
  AsyncResult,
  BusType,
  Cancellable,
  DBusConnection,
  DatagramBased,
  DtlsClientConnection,
  DtlsServerConnection,
  File,
  IOErrorEnum,
  IOStream,
  Icon,
  InputStream,
  MemoryMonitor,
  NetworkMonitor,
  PowerProfileMonitor,
  Proxy,
  ProxyResolver,
  ResourceLookupFlags,
  SocketConnectable,
  TlsBackend,
  TlsCertificate,
  TlsClientConnection,
  TlsFileDatabase,
  TlsServerConnection
}
import sn.gnome.glib.fluent.{FileError, GResult}
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint}

object Gio:
  /** Checks if @action_name is valid.
    *
    * @action_name
    *   is valid if it consists only of alphanumeric characters, plus '-' and
    *   '.'. The empty string is not a valid action name.
    *
    * It is an error to call this function with a non-utf8 @action_name.
    * @action_name
    *   must not be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def actionNameIsValid(
      action_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_action_name_is_valid(
      __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Parses a detailed action name into its separate name and target
    * components.
    *
    * Detailed action names can have three formats.
    *
    * The first format is used to represent an action name with no target value
    * and consists of just an action name containing no whitespace nor the
    * characters `:`, `(` or `)`. For example: `app.action`.
    *
    * The second format is used to represent an action with a target value that
    * is a non-empty string consisting only of alphanumerics, plus `-` and `.`.
    * In that case, the action name and target value are separated by a double
    * colon (`::`). For example: `app.action::target`.
    *
    * The third format is used to represent an action with any type of target
    * value, including strings. The target value follows the action name,
    * surrounded in parens. For example: `app.action(42)`. The target value is
    * parsed using g_variant_parse(). If a tuple-typed value is desired, it must
    * be specified in the same way, resulting in two sets of parens, for
    * example: `app.action((1,2,3))`. A string target can be specified this way
    * as well: `app.action('target')`. For strings, this third format must be
    * used if target value is empty or contains characters other than
    * alphanumerics, `-` and `.`.
    *
    * If this function returns %TRUE, a non-%NULL value is guaranteed to be
    * returned in @action_name (if a pointer is passed in). A %NULL value may
    * still be returned in @target_value, as the @detailed_name may not contain
    * a target.
    *
    * If returned, the #GVariant in @target_value is guaranteed to not be
    * floating.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[action_parse_detailed_name:]: Function action_parse_detailed_name contains an OUT parameter, which is not supported yet"
  )
  private def actionParseDetailedName() = ???

  /** Formats a detailed action name from @action_name and @target_value.
    *
    * It is an error to call this function with an invalid action name.
    *
    * This function is the opposite of g_action_parse_detailed_name(). It will
    * produce a string that can be parsed back to the @action_name and @target_value
    * by that function.
    *
    * See that function for the types of strings that will be printed by this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[action_print_detailed_name:/<function parameters>/target_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def actionPrintDetailedName() = ???

  /** Creates a new #GAppInfo from the given information.
    *
    * Note that for @commandline, the quoting rules of the Exec key of the
    * [freedesktop.org Desktop Entry
    * Specification](http://freedesktop.org/Standards/desktop-entry-spec) are
    * applied. For example, if the @commandline contains percent-encoded URIs,
    * the percent-character must be doubled in order to prevent it from being
    * swallowed by Exec key unquoting. See the specification for exact quoting
    * rules.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoCreateFromCommandline(
      commandline: String | CString /* Some(CString) */,
      application_name: Option[String | CString /* Some(CString) */ ],
      flags: AppInfoCreateFlags /* Some(GAppInfoCreateFlags) */
  )(using Zone): GResult[AppInfo /* Some(Ptr[GAppInfo]) */ ] =
    GResult.wrap(__errorPtr =>
      new AppInfo.Abstract(
        g_app_info_create_from_commandline(
          __sn_extract_string(commandline),
          application_name
            .map[CString](o => __sn_extract_string(o))
            .getOrElse(null.asInstanceOf[CString]),
          flags.raw,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Gets a list of all of the applications currently registered on this
    * system.
    *
    * For desktop files, this includes applications that have `NoDisplay=true`
    * set or are excluded from display by means of `OnlyShowIn` or `NotShowIn`.
    * See g_app_info_should_show(). The returned list does not include
    * applications which have the `Hidden` key set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[app_info_get_all:/<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AppInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def appInfoGetAll() = ???

  /** Gets a list of all #GAppInfos for a given content type, including the
    * recommended and fallback #GAppInfos. See
    * g_app_info_get_recommended_for_type() and
    * g_app_info_get_fallback_for_type().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[app_info_get_all_for_type:/<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AppInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def appInfoGetAllForType() = ???

  /** Gets the default #GAppInfo for a given content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoGetDefaultForType(
      content_type: String | CString /* Some(CString) */,
      must_support_uris: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): AppInfo /* Some(Ptr[GAppInfo]) */ = new AppInfo.Abstract(
    g_app_info_get_default_for_type(
      __sn_extract_string(content_type),
      gboolean(gint((if must_support_uris == true then 1 else 0)))
    ).asInstanceOf
  )

  /** Asynchronously gets the default #GAppInfo for a given content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[app_info_get_default_for_type_async:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def appInfoGetDefaultForTypeAsync() = ???

  /** Finishes a default #GAppInfo lookup started by
    * g_app_info_get_default_for_type_async().
    *
    * If no #GAppInfo is found, then @error will be set to
    * %G_IO_ERROR_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoGetDefaultForTypeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[AppInfo /* Some(Ptr[GAppInfo]) */ ] = GResult.wrap(__errorPtr =>
    new AppInfo.Abstract(
      g_app_info_get_default_for_type_finish(
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Gets the default application for handling URIs with the given URI scheme.
    * A URI scheme is the initial part of the URI, up to but not including the
    * ':', e.g. "http", "ftp" or "sip".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoGetDefaultForUriScheme(
      uri_scheme: String | CString /* Some(CString) */
  )(using Zone): AppInfo /* Some(Ptr[GAppInfo]) */ = new AppInfo.Abstract(
    g_app_info_get_default_for_uri_scheme(
      __sn_extract_string(uri_scheme)
    ).asInstanceOf
  )

  /** Asynchronously gets the default application for handling URIs with the
    * given URI scheme. A URI scheme is the initial part of the URI, up to but
    * not including the ':', e.g. "http", "ftp" or "sip".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[app_info_get_default_for_uri_scheme_async:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def appInfoGetDefaultForUriSchemeAsync() = ???

  /** Finishes a default #GAppInfo lookup started by
    * g_app_info_get_default_for_uri_scheme_async().
    *
    * If no #GAppInfo is found, then @error will be set to
    * %G_IO_ERROR_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoGetDefaultForUriSchemeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[AppInfo /* Some(Ptr[GAppInfo]) */ ] = GResult.wrap(__errorPtr =>
    new AppInfo.Abstract(
      g_app_info_get_default_for_uri_scheme_finish(
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Gets a list of fallback #GAppInfos for a given content type, i.e. those
    * applications which claim to support the given content type by MIME type
    * subclassing and not directly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[app_info_get_fallback_for_type:/<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AppInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def appInfoGetFallbackForType() = ???

  /** Gets a list of recommended #GAppInfos for a given content type, i.e. those
    * applications which claim to support the given content type exactly, and
    * not by MIME type subclassing. Note that the first application of the list
    * is the last used one, i.e. the last one for which
    * g_app_info_set_as_last_used_for_type() has been called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[app_info_get_recommended_for_type:/<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AppInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def appInfoGetRecommendedForType() = ???

  /** Utility function that launches the default application registered to
    * handle the specified uri. Synchronous I/O is done on the uri to detect the
    * type of the file if required.
    *
    * The D-Bus–activated applications don't have to be started if your
    * application terminates too soon after this function. To prevent this, use
    * g_app_info_launch_default_for_uri_async() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoLaunchDefaultForUri(
      uri: String | CString /* Some(CString) */,
      context: Option[AppLaunchContext /* Some(Ptr[GAppLaunchContext]) */ ]
  )(using
      Zone
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_launch_default_for_uri(
        __sn_extract_string(uri),
        context
          .map[Ptr[GAppLaunchContext]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[GAppLaunchContext]]),
        __errorPtr
      ).value.!=(0)
    )

  /** Async version of g_app_info_launch_default_for_uri().
    *
    * This version is useful if you are interested in receiving error
    * information in the case where the application is sandboxed and the portal
    * may present an application chooser dialog to the user.
    *
    * This is also useful if you want to be sure that the D-Bus–activated
    * applications are really started before termination and if you are
    * interested in receiving error information from their activation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[app_info_launch_default_for_uri_async:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def appInfoLaunchDefaultForUriAsync() = ???

  /** Finishes an asynchronous launch-default-for-uri operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoLaunchDefaultForUriFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_launch_default_for_uri_finish(
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** Removes all changes to the type associations done by
    * g_app_info_set_as_default_for_type(),
    * g_app_info_set_as_default_for_extension(), g_app_info_add_supports_type()
    * or g_app_info_remove_supports_type().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appInfoResetTypeAssociations(
      content_type: String | CString /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = g_app_info_reset_type_associations(
    __sn_extract_string(content_type)
  )

  /** Helper function for constructing #GAsyncInitable object. This is similar
    * to g_object_newv() but also initializes the object asynchronously.
    *
    * When the initialization is finished, @callback will be called. You can
    * then call g_async_initable_new_finish() to get the new object and check
    * for any errors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[async_initable_newv_async:/<function parameters>/parameters]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Parameter), @type -> DataRecord(GParameter*)))"
  )
  private def asyncInitableNewvAsync() = ???

  /** Asynchronously connects to the message bus specified by @bus_type.
    *
    * When the operation is finished, @callback will be invoked. You can then
    * call g_bus_get_finish() to get the result of the operation.
    *
    * This is an asynchronous failable function. See g_bus_get_sync() for the
    * synchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_get:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def busGet() = ???

  /** Finishes an operation started with g_bus_get().
    *
    * The returned object is a singleton, that is, shared with other callers of
    * g_bus_get() and g_bus_get_sync() for @bus_type. In the event that you need
    * a private message bus connection, use g_dbus_address_get_for_bus_sync()
    * and g_dbus_connection_new_for_address() with
    * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
    * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
    *
    * Note that the returned #GDBusConnection object will (usually) have the
    * #GDBusConnection:exit-on-close property set to %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def busGetFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[DBusConnection /* Some(Ptr[GDBusConnection]) */ ] =
    GResult.wrap(__errorPtr =>
      new DBusConnection(
        g_bus_get_finish(
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Synchronously connects to the message bus specified by @bus_type. Note
    * that the returned object may shared with other callers, e.g. if two
    * separate parts of a process calls this function with the same @bus_type,
    * they will share the same object.
    *
    * This is a synchronous failable function. See g_bus_get() and
    * g_bus_get_finish() for the asynchronous version.
    *
    * The returned object is a singleton, that is, shared with other callers of
    * g_bus_get() and g_bus_get_sync() for @bus_type. In the event that you need
    * a private message bus connection, use g_dbus_address_get_for_bus_sync()
    * and g_dbus_connection_new_for_address() with
    * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
    * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
    *
    * Note that the returned #GDBusConnection object will (usually) have the
    * #GDBusConnection:exit-on-close property set to %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def busGetSync(
      bus_type: BusType /* Some(GBusType) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[DBusConnection /* Some(Ptr[GDBusConnection]) */ ] =
    GResult.wrap(__errorPtr =>
      new DBusConnection(
        g_bus_get_sync(
          bus_type.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )

  /**  Starts acquiring @name on the bus specified by @bus_type and calls
    *  @name_acquired_handler and @name_lost_handler when the name is
    *  acquired respectively lost. Callbacks will be invoked in the
    *  [thread-default main context][g-main-context-push-thread-default]
    *  of the thread you are calling this function from.
    *
    *  You are guaranteed that one of the @name_acquired_handler and @name_lost_handler
    *  callbacks will be invoked after calling this function - there are three
    *  possible cases:
    *
    *  - @name_lost_handler with a %NULL connection (if a connection to the bus
    *    can't be made).
    *
    *  - @bus_acquired_handler then @name_lost_handler (if the name can't be
    *    obtained)
    *
    *  - @bus_acquired_handler then @name_acquired_handler (if the name was
    *    obtained).
    *
    *  When you are done owning the name, just call g_bus_unown_name()
    *  with the owner id this function returns.
    *
    *  If the name is acquired or lost (for example another application
    *  could acquire the name if you allow replacement or the application
    *  currently owning the name exits), the handlers are also invoked.
    *  If the #GDBusConnection that is used for attempting to own the name
    *  closes, then @name_lost_handler is invoked since it is no longer
    *  possible for other processes to access the process.
    *
    *  You cannot use g_bus_own_name() several times for the same name (unless
    *  interleaved with calls to g_bus_unown_name()) - only the first call
    *  will work.
    *
    *  Another guarantee is that invocations of @name_acquired_handler
    *  and @name_lost_handler are guaranteed to alternate; that
    *  is, if @name_acquired_handler is invoked then you are
    *  guaranteed that the next time one of the handlers is invoked, it
    *  will be @name_lost_handler. The reverse is also true.
    *
    *  If you plan on exporting objects (using e.g.
    *  g_dbus_connection_register_object()), note that it is generally too late
    *  to export the objects in @name_acquired_handler. Instead, you can do this
    *  in @bus_acquired_handler since you are guaranteed that this will run
    *  before @name is requested from the bus.
    *
    *  This behavior makes it very simple to write applications that wants
    *  to [own names][gdbus-owning-names] and export objects.
    *  Simply register objects to be exported in @bus_acquired_handler and
    *  unregister the objects (if any) in @name_lost_handler.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_own_name:/<function parameters>/bus_acquired_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BusAcquiredCallback), @type -> DataRecord(GBusAcquiredCallback)))"
  )
  private def busOwnName() = ???

  /** Like g_bus_own_name() but takes a #GDBusConnection instead of a #GBusType.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_own_name_on_connection:/<function parameters>/name_acquired_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BusNameAcquiredCallback), @type -> DataRecord(GBusNameAcquiredCallback)))"
  )
  private def busOwnNameOnConnection() = ???

  /** Version of g_bus_own_name_on_connection() using closures instead of
    * callbacks for easier binding in other languages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_own_name_on_connection_with_closures:/<function parameters>/name_acquired_closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Closure), @type -> DataRecord(GClosure*)))"
  )
  private def busOwnNameOnConnectionWithClosures() = ???

  /** Version of g_bus_own_name() using closures instead of callbacks for easier
    * binding in other languages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_own_name_with_closures:/<function parameters>/bus_acquired_closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Closure), @type -> DataRecord(GClosure*)))"
  )
  private def busOwnNameWithClosures() = ???

  /** Stops owning a name.
    *
    * Note that there may still be D-Bus traffic to process (relating to owning
    * and unowning the name) in the current thread-default #GMainContext after
    * this function has returned. You should continue to iterate the
    * #GMainContext until the #GDestroyNotify function passed to
    * g_bus_own_name() is called, in order to avoid memory leaks through
    * callbacks queued on the #GMainContext after it’s stopped being iterated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def busUnownName(
      owner_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* Some(Unit) */ = g_bus_unown_name(guint(owner_id))

  /** Stops watching a name.
    *
    * Note that there may still be D-Bus traffic to process (relating to
    * watching and unwatching the name) in the current thread-default
    * #GMainContext after this function has returned. You should continue to
    * iterate the #GMainContext until the #GDestroyNotify function passed to
    * g_bus_watch_name() is called, in order to avoid memory leaks through
    * callbacks queued on the #GMainContext after it’s stopped being iterated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def busUnwatchName(
      watcher_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* Some(Unit) */ = g_bus_unwatch_name(guint(watcher_id))

  /** Starts watching @name on the bus specified by @bus_type and calls
    * @name_appeared_handler
    *   and @name_vanished_handler when the name is known to have an owner
    *   respectively known to lose its owner. Callbacks will be invoked in the
    *   [thread-default main context][g-main-context-push-thread-default] of the
    *   thread you are calling this function from.
    *
    * You are guaranteed that one of the handlers will be invoked after calling
    * this function. When you are done watching the name, just call
    * g_bus_unwatch_name() with the watcher id this function returns.
    *
    * If the name vanishes or appears (for example the application owning the
    * name could restart), the handlers are also invoked. If the
    * #GDBusConnection that is used for watching the name disconnects, then
    * @name_vanished_handler
    *   is invoked since it is no longer possible to access the name.
    *
    * Another guarantee is that invocations of @name_appeared_handler and @name_vanished_handler
    * are guaranteed to alternate; that is, if @name_appeared_handler is invoked
    * then you are guaranteed that the next time one of the handlers is invoked,
    * it will be @name_vanished_handler. The reverse is also true.
    *
    * This behavior makes it very simple to write applications that want to take
    * action when a certain [name exists][gdbus-watching-names]. Basically, the
    * application should create object proxies in
    * @name_appeared_handler
    *   and destroy them again (if any) in
    * @name_vanished_handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_watch_name:/<function parameters>/name_appeared_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BusNameAppearedCallback), @type -> DataRecord(GBusNameAppearedCallback)))"
  )
  private def busWatchName() = ???

  /** Like g_bus_watch_name() but takes a #GDBusConnection instead of a
    * #GBusType.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_watch_name_on_connection:/<function parameters>/name_appeared_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BusNameAppearedCallback), @type -> DataRecord(GBusNameAppearedCallback)))"
  )
  private def busWatchNameOnConnection() = ???

  /** Version of g_bus_watch_name_on_connection() using closures instead of
    * callbacks for easier binding in other languages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_watch_name_on_connection_with_closures:/<function parameters>/name_appeared_closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Closure), @type -> DataRecord(GClosure*)))"
  )
  private def busWatchNameOnConnectionWithClosures() = ???

  /** Version of g_bus_watch_name() using closures instead of callbacks for
    * easier binding in other languages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bus_watch_name_with_closures:/<function parameters>/name_appeared_closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Closure), @type -> DataRecord(GClosure*)))"
  )
  private def busWatchNameWithClosures() = ???

  /** Checks if a content type can be executable. Note that for instance things
    * like text files can be executables (i.e. scripts and batch files).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeCanBeExecutable(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_content_type_can_be_executable(
      __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Compares two content types for equality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeEquals(
      type1: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      type2: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_content_type_equals(
      __sn_extract_string(type1).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(type2).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Tries to find a content type based on the mime type name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeFromMimeType(
      mime_type: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(
      g_content_type_from_mime_type(
        __sn_extract_string(mime_type).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  /** Gets the human readable description of the content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeGetDescription(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(
      g_content_type_get_description(
        __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  /** Gets the generic icon name for a content type.
    *
    * See the
    * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
    * specification for more on the generic icon name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeGetGenericIconName(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(
      g_content_type_get_generic_icon_name(
        __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  /** Gets the icon for a content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeGetIcon(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Icon /* Some(Ptr[GIcon]) */ = new Icon.Abstract(
    g_content_type_get_icon(
      __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Get the list of directories which MIME data is loaded from. See
    * g_content_type_set_mime_dirs() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_type_get_mime_dirs:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def contentTypeGetMimeDirs() = ???

  /** Gets the mime type for the content type, if one is registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeGetMimeType(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(
      g_content_type_get_mime_type(
        __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  /** Gets the symbolic icon for a content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeGetSymbolicIcon(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Icon /* Some(Ptr[GIcon]) */ = new Icon.Abstract(
    g_content_type_get_symbolic_icon(
      __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Guesses the content type based on example data. If the function is
    * uncertain, @result_uncertain will be set to %TRUE. Either @filename or @data
    * may be %NULL, in which case the guess will be based solely on the other
    * argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_type_guess:]: Function content_type_guess contains an OUT parameter, which is not supported yet"
  )
  private def contentTypeGuess() = ???

  /** Tries to guess the type of the tree with root @root, by looking at the
    * files it contains. The result is an array of content types, with the best
    * guess coming first.
    *
    * The types returned all have the form x-content/foo, e.g.
    * x-content/audio-cdda (for audio CDs) or x-content/image-dcf (for a camera
    * memory card). See the
    * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
    * specification for more on x-content types.
    *
    * This function is useful in the implementation of
    * g_mount_guess_content_type().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_type_guess_for_tree:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def contentTypeGuessForTree() = ???

  /** Determines if @type is a subset of @supertype.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeIsA(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      supertype: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_content_type_is_a(
      __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(supertype).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Determines if @type is a subset of @mime_type. Convenience wrapper around
    * g_content_type_is_a().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeIsMimeType(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      mime_type: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_content_type_is_mime_type(
      __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(mime_type).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Checks if the content type is the generic "unknown" type. On UNIX this is
    * the "application/octet-stream" mimetype, while on win32 it is "*" and on
    * OSX it is a dynamic type or octet-stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentTypeIsUnknown(
      `type`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_content_type_is_unknown(
      __sn_extract_string(`type`).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /**  Set the list of directories used by GIO to load the MIME database.
    *  If @dirs is %NULL, the directories used are the default:
    *
    *   - the `mime` subdirectory of the directory in `$XDG_DATA_HOME`
    *   - the `mime` subdirectory of every directory in `$XDG_DATA_DIRS`
    *
    *  This function is intended to be used when writing tests that depend on
    *  information stored in the MIME database, in order to control the data.
    *
    *  Typically, in case your tests use %G_TEST_OPTION_ISOLATE_DIRS, but they
    *  depend on the system’s MIME database, you should call this function
    *  with @dirs set to %NULL before calling g_test_init(), for instance:
    *
    *  |[<!-- language="C" -->
    *    // Load MIME data from the system
    *    g_content_type_set_mime_dirs (NULL);
    *    // Isolate the environment
    *    g_test_init (&argc, &argv, G_TEST_OPTION_ISOLATE_DIRS, NULL);
    *
    *    …
    *
    *    return g_test_run ();
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_type_set_mime_dirs:/<function parameters>/dirs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def contentTypeSetMimeDirs() = ???

  /** Gets a list of strings containing all the registered content types known
    * to the system. The list and its data should be freed using
    * `g_list_free_full (list, g_free)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_types_get_registered:/<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def contentTypesGetRegistered() = ???

  /** Escape @string so it can appear in a D-Bus address as the value part of a
    * key-value pair.
    *
    * For instance, if @string is `/run/bus-for-:0`, this function would return
    * `/run/bus-for-%3A0`, which could be used in a D-Bus address like
    * `unix:nonce-tcp:host=127.0.0.1,port=42,noncefile=/run/bus-for-%3A0`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusAddressEscapeValue(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(
      g_dbus_address_escape_value(
        __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  /** Synchronously looks up the D-Bus address for the well-known message bus
    * instance specified by @bus_type. This may involve using various platform
    * specific mechanisms.
    *
    * The returned address will be in the [D-Bus address
    * format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusAddressGetForBusSync(
      bus_type: BusType /* Some(GBusType) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using
      Zone
  ): GResult[String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_dbus_address_get_for_bus_sync(
          bus_type.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Asynchronously connects to an endpoint specified by @address and sets up
    * the connection so it is in a state to run the client-side of the D-Bus
    * authentication conversation. @address must be in the [D-Bus address
    * format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
    *
    * When the operation is finished, @callback will be invoked. You can then
    * call g_dbus_address_get_stream_finish() to get the result of the
    * operation.
    *
    * This is an asynchronous failable function. See
    * g_dbus_address_get_stream_sync() for the synchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_address_get_stream:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def dbusAddressGetStream() = ???

  /** Finishes an operation started with g_dbus_address_get_stream().
    *
    * A server is not required to set a GUID, so @out_guid may be set to %NULL
    * even on success.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_address_get_stream_finish:]: Function dbus_address_get_stream_finish contains an OUT parameter, which is not supported yet"
  )
  private def dbusAddressGetStreamFinish() = ???

  /** Synchronously connects to an endpoint specified by @address and sets up
    * the connection so it is in a state to run the client-side of the D-Bus
    * authentication conversation. @address must be in the [D-Bus address
    * format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
    *
    * A server is not required to set a GUID, so @out_guid may be set to %NULL
    * even on success.
    *
    * This is a synchronous failable function. See g_dbus_address_get_stream()
    * for the asynchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_address_get_stream_sync:]: Function dbus_address_get_stream_sync contains an OUT parameter, which is not supported yet"
  )
  private def dbusAddressGetStreamSync() = ???

  /** Looks up the value of an annotation.
    *
    * The cost of this function is O(n) in number of annotations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_annotation_info_lookup:/<function parameters>/annotations]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusAnnotationInfo), @type -> DataRecord(GDBusAnnotationInfo*)))),ListMap(@type -> DataRecord(GDBusAnnotationInfo**)))"
  )
  private def dbusAnnotationInfoLookup() = ???

  /** Creates a D-Bus error name to use for @error. If @error matches a
    * registered error (cf. g_dbus_error_register_error()), the corresponding
    * D-Bus error name will be returned.
    *
    * Otherwise the a name of the form
    * `org.gtk.GDBus.UnmappedGError.Quark._ESCAPED_QUARK_NAME.Code_ERROR_CODE`
    * will be used. This allows other GDBus applications to map the error on the
    * wire back to a #GError using g_dbus_error_new_for_dbus_error().
    *
    * This function is typically only used in object mappings to put a #GError
    * on the wire. Regular applications should not use it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_encode_gerror:/<function parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  private def dbusErrorEncodeGerror() = ???

  /** Gets the D-Bus error name used for @error, if any.
    *
    * This function is guaranteed to return a D-Bus error name for all #GErrors
    * returned from functions handling remote method calls (e.g.
    * g_dbus_connection_call_finish()) unless g_dbus_error_strip_remote_error()
    * has been used on @error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_get_remote_error:/<function parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  private def dbusErrorGetRemoteError() = ???

  /** Checks if @error represents an error received via D-Bus from a remote
    * peer. If so, use g_dbus_error_get_remote_error() to get the name of the
    * error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_is_remote_error:/<function parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  private def dbusErrorIsRemoteError() = ???

  /** Creates a #GError based on the contents of @dbus_error_name and
    * @dbus_error_message.
    *
    * Errors registered with g_dbus_error_register_error() will be looked up
    * using @dbus_error_name and if a match is found, the error domain and code
    * is used. Applications can use g_dbus_error_get_remote_error() to recover @dbus_error_name.
    *
    * If a match against a registered error is not found and the D-Bus error
    * name is in a form as returned by g_dbus_error_encode_gerror() the error
    * domain and code encoded in the name is used to create the #GError. Also, @dbus_error_name
    * is added to the error message such that it can be recovered with
    * g_dbus_error_get_remote_error().
    *
    * Otherwise, a #GError with the error code %G_IO_ERROR_DBUS_ERROR in the
    * %G_IO_ERROR error domain is returned. Also, @dbus_error_name is added to
    * the error message such that it can be recovered with
    * g_dbus_error_get_remote_error().
    *
    * In all three cases, @dbus_error_name can always be recovered from the
    * returned #GError using the g_dbus_error_get_remote_error() function
    * (unless g_dbus_error_strip_remote_error() hasn't been used on the returned
    * error).
    *
    * This function is typically only used in object mappings to prepare #GError
    * instances for applications. Regular applications should not use it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_new_for_dbus_error:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))"
  )
  private def dbusErrorNewForDbusError() = ???

  @annotation.compileTimeOnly(
    "[dbus_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def dbusErrorQuark() = ???

  /** Creates an association to map between @dbus_error_name and #GErrors
    * specified by @error_domain and @error_code.
    *
    * This is typically done in the routine that returns the #GQuark for an
    * error domain.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_register_error:/<function parameters>/error_domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def dbusErrorRegisterError() = ???

  /** Helper function for associating a #GError error domain with D-Bus error
    * names.
    *
    * While @quark_volatile has a `volatile` qualifier, this is a historical
    * artifact and the argument passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_register_error_domain:/<function parameters>/quark_volatile]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gsize), @type -> DataRecord(volatile gsize*)))"
  )
  private def dbusErrorRegisterErrorDomain() = ???

  /** Looks for extra information in the error message used to recover the D-Bus
    * error name and strips it if found. If stripped, the message field in @error
    * will correspond exactly to what was received on the wire.
    *
    * This is typically used when presenting errors to the end user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_strip_remote_error:/<function parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))"
  )
  private def dbusErrorStripRemoteError() = ???

  /** Destroys an association previously set up with
    * g_dbus_error_register_error().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_error_unregister_error:/<function parameters>/error_domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def dbusErrorUnregisterError() = ???

  /** This is a language binding friendly version of
    * g_dbus_escape_object_path_bytestring().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusEscapeObjectPath(
      s: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(
      g_dbus_escape_object_path(
        __sn_extract_string(s).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  /** Escapes @bytes for use in a D-Bus object path component.
    * @bytes
    *   is an array of zero or more nonzero bytes in an unspecified encoding,
    *   followed by a single zero byte.
    *
    * The escaping method consists of replacing all non-alphanumeric characters
    * (see g_ascii_isalnum()) with their hexadecimal value preceded by an
    * underscore (`_`). For example: `foo.bar.baz` will become
    * `foo_2ebar_2ebaz`.
    *
    * This method is appropriate to use when the input is nearly a valid object
    * path component but is not when your input is far from being a valid object
    * path component. Other escaping algorithms are also valid to use with D-Bus
    * object paths.
    *
    * This can be reversed with g_dbus_unescape_object_path().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_escape_object_path_bytestring:/<function parameters>/bytes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@type -> DataRecord(const guint8*)))"
  )
  private def dbusEscapeObjectPathBytestring() = ???

  /** Generate a D-Bus GUID that can be used with e.g. g_dbus_connection_new().
    *
    * See the [D-Bus
    * specification](https://dbus.freedesktop.org/doc/dbus-specification.html#uuids)
    * regarding what strings are valid D-Bus GUIDs. The specification refers to
    * these as ‘UUIDs’ whereas GLib (for historical reasons) refers to them as
    * ‘GUIDs’. The terms are interchangeable.
    *
    * Note that D-Bus GUIDs do not follow [RFC
    * 4122](https://datatracker.ietf.org/doc/html/rfc4122).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusGenerateGuid()(using
      Zone
  ): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ = fromCString(
    g_dbus_generate_guid().asInstanceOf
  )

  /** Converts a #GValue to a #GVariant of the type indicated by the @type
    * parameter.
    *
    * The conversion is using the following rules:
    *
    *   - `G_TYPE_STRING`: 's', 'o', 'g' or 'ay'
    *   - `G_TYPE_STRV`: 'as', 'ao' or 'aay'
    *   - `G_TYPE_BOOLEAN`: 'b'
    *   - `G_TYPE_UCHAR`: 'y'
    *   - `G_TYPE_INT`: 'i', 'n'
    *   - `G_TYPE_UINT`: 'u', 'q'
    *   - `G_TYPE_INT64`: 'x'
    *   - `G_TYPE_UINT64`: 't'
    *   - `G_TYPE_DOUBLE`: 'd'
    *   - `G_TYPE_VARIANT`: Any #GVariantType
    *
    * This can fail if e.g. @gvalue is of type %G_TYPE_STRING and @type is 'i',
    * i.e. %G_VARIANT_TYPE_INT32. It will also fail for any #GType (including
    * e.g. %G_TYPE_OBJECT and %G_TYPE_BOXED derived-types) not in the table
    * above.
    *
    * Note that if @gvalue is of type %G_TYPE_VARIANT and its value is %NULL,
    * the empty #GVariant instance (never %NULL) for @type is returned (e.g. 0
    * for scalar types, the empty string for string types, '/' for object path
    * types, the empty array for any array type and so on).
    *
    * See the g_dbus_gvariant_to_gvalue() function for how to convert a
    * #GVariant to a #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_gvalue_to_gvariant:/<function parameters>/gvalue]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def dbusGvalueToGvariant() = ???

  /** Converts a #GVariant to a #GValue. If @value is floating, it is consumed.
    *
    * The rules specified in the g_dbus_gvalue_to_gvariant() function are used -
    * this function is essentially its reverse form. So, a #GVariant containing
    * any basic or string array type will be converted to a #GValue containing a
    * basic value or string array. Any other #GVariant (handle, variant, tuple,
    * dict entry) will be converted to a #GValue containing that #GVariant.
    *
    * The conversion never fails - a valid #GValue is always returned in
    * @out_gvalue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_gvariant_to_gvalue:]: Function dbus_gvariant_to_gvalue contains an OUT parameter, which is not supported yet"
  )
  private def dbusGvariantToGvalue() = ???

  /** Checks if @string is a [D-Bus
    * address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
    *
    * This doesn't check if @string is actually supported by #GDBusServer or
    * #GDBusConnection - use g_dbus_is_supported_address() to do more checks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsAddress(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_dbus_is_address(
      __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Check whether @string is a valid D-Bus error name.
    *
    * This function returns the same result as g_dbus_is_interface_name(),
    * because D-Bus error names are defined to have exactly the same syntax as
    * interface names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsErrorName(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_dbus_is_error_name(
      __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Checks if @string is a D-Bus GUID.
    *
    * See the documentation for g_dbus_generate_guid() for more information
    * about the format of a GUID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsGuid(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_dbus_is_guid(__sn_extract_string(string).asInstanceOf[Ptr[gchar]]).value
      .!=(0)

  /** Checks if @string is a valid D-Bus interface name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsInterfaceName(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_dbus_is_interface_name(
      __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Checks if @string is a valid D-Bus member (e.g. signal or method) name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsMemberName(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_dbus_is_member_name(
      __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Checks if @string is a valid D-Bus bus name (either unique or well-known).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsName(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_dbus_is_name(__sn_extract_string(string).asInstanceOf[Ptr[gchar]]).value
      .!=(0)

  /** Like g_dbus_is_address() but also checks if the library supports the
    * transports in @string and that key/value pairs for each transport are
    * valid. See the specification of the [D-Bus address
    * format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsSupportedAddress(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using
      Zone
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_is_supported_address(
        __sn_extract_string(string).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )

  /** Checks if @string is a valid D-Bus unique bus name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusIsUniqueName(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_dbus_is_unique_name(
      __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** Unescapes an string that was previously escaped with
    * g_dbus_escape_object_path(). If the string is in a format that could not
    * have been returned by g_dbus_escape_object_path(), this function returns
    * %NULL.
    *
    * Encoding alphanumeric characters which do not need to be encoded is not
    * allowed (e.g `_63` is not valid, the string should contain `c` instead).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dbus_unescape_object_path:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@type -> DataRecord(guint8*)))"
  )
  private def dbusUnescapeObjectPath() = ???

  /** Creates a new #GDtlsClientConnection wrapping @base_socket which is
    * assumed to communicate with the server identified by @server_identity.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dtlsClientConnectionNew(
      base_socket: DatagramBased /* Some(Ptr[GDatagramBased]) */,
      server_identity: Option[
        SocketConnectable /* Some(Ptr[GSocketConnectable]) */
      ]
  ): GResult[DtlsClientConnection /* Some(Ptr[GDatagramBased]) */ ] =
    GResult.wrap(__errorPtr =>
      new DtlsClientConnection.Abstract(
        g_dtls_client_connection_new(
          base_socket.getUnsafeRawPointer().asInstanceOf,
          server_identity
            .map[Ptr[GSocketConnectable]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GSocketConnectable]]),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Creates a new #GDtlsServerConnection wrapping @base_socket.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dtlsServerConnectionNew(
      base_socket: DatagramBased /* Some(Ptr[GDatagramBased]) */,
      certificate: Option[TlsCertificate /* Some(Ptr[GTlsCertificate]) */ ]
  ): GResult[DtlsServerConnection /* Some(Ptr[GDatagramBased]) */ ] =
    GResult.wrap(__errorPtr =>
      new DtlsServerConnection.Abstract(
        g_dtls_server_connection_new(
          base_socket.getUnsafeRawPointer().asInstanceOf,
          certificate
            .map[Ptr[GTlsCertificate]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GTlsCertificate]]),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Constructs a #GFile from a vector of elements using the correct separator
    * for filenames.
    *
    * Using this function is equivalent to calling g_build_filenamev(), followed
    * by g_file_new_for_path() on the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_new_build_filenamev:/<function parameters>/args]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def fileNewBuildFilenamev() = ???

  /** Creates a #GFile with the given argument from the command line. The value
    * of @arg can be either a URI, an absolute path or a relative path resolved
    * relative to the current working directory. This operation never fails, but
    * the returned object might not support any I/O operation if @arg points to
    * a malformed path.
    *
    * Note that on Windows, this function expects its argument to be in UTF-8 --
    * not the system code page. This means that you should not use this function
    * with string from argv as it is passed to main().
    * g_win32_get_command_line() will return a UTF-8 version of the commandline.
    * #GApplication also uses UTF-8 but
    * g_application_command_line_create_file_for_arg() may be more useful for
    * you there. It is also always possible to use this function with
    * #GOptionContext arguments of type %G_OPTION_ARG_FILENAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fileNewForCommandlineArg(
      arg: String | CString /* Some(CString) */
  )(using Zone): File /* Some(Ptr[GFile]) */ = new File.Abstract(
    g_file_new_for_commandline_arg(__sn_extract_string(arg)).asInstanceOf
  )

  /** Creates a #GFile with the given argument from the command line.
    *
    * This function is similar to g_file_new_for_commandline_arg() except that
    * it allows for passing the current working directory as an argument instead
    * of using the current working directory of the process.
    *
    * This is useful if the commandline argument was given in a context other
    * than the invocation of the current process.
    *
    * See also g_application_command_line_create_file_for_arg().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fileNewForCommandlineArgAndCwd(
      arg: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      cwd: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): File /* Some(Ptr[GFile]) */ = new File.Abstract(
    g_file_new_for_commandline_arg_and_cwd(
      __sn_extract_string(arg).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(cwd).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Constructs a #GFile for a given path. This operation never fails, but the
    * returned object might not support any I/O operation if @path is malformed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fileNewForPath(
      path: String | CString /* Some(CString) */
  )(using Zone): File /* Some(Ptr[GFile]) */ = new File.Abstract(
    g_file_new_for_path(__sn_extract_string(path)).asInstanceOf
  )

  /** Constructs a #GFile for a given URI. This operation never fails, but the
    * returned object might not support any I/O operation if @uri is malformed
    * or if the uri type is not supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fileNewForUri(
      uri: String | CString /* Some(CString) */
  )(using Zone): File /* Some(Ptr[GFile]) */ =
    new File.Abstract(g_file_new_for_uri(__sn_extract_string(uri)).asInstanceOf)

  /** Opens a file in the preferred directory for temporary files (as returned
    * by g_get_tmp_dir()) and returns a #GFile and #GFileIOStream pointing to
    * it.
    *
    * @tmpl
    *   should be a string in the GLib file name encoding containing a sequence
    *   of six 'X' characters, and containing no directory components. If it is
    *   %NULL, a default template is used.
    *
    * Unlike the other #GFile constructors, this will return %NULL if a
    * temporary file could not be created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_new_tmp:]: Function file_new_tmp contains an OUT parameter, which is not supported yet"
  )
  private def fileNewTmp() = ???

  /** Asynchronously opens a file in the preferred directory for temporary files
    * (as returned by g_get_tmp_dir()) as g_file_new_tmp().
    *
    * @tmpl
    *   should be a string in the GLib file name encoding containing a sequence
    *   of six 'X' characters, and containing no directory components. If it is
    *   %NULL, a default template is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_new_tmp_async:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def fileNewTmpAsync() = ???

  /** Asynchronously creates a directory in the preferred directory for
    * temporary files (as returned by g_get_tmp_dir()) as g_dir_make_tmp().
    *
    * @tmpl
    *   should be a string in the GLib file name encoding containing a sequence
    *   of six 'X' characters, and containing no directory components. If it is
    *   %NULL, a default template is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_new_tmp_dir_async:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def fileNewTmpDirAsync() = ???

  /** Finishes a temporary directory creation started by
    * g_file_new_tmp_dir_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fileNewTmpDirFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[File /* Some(Ptr[GFile]) */ ] = GResult.wrap(__errorPtr =>
    new File.Abstract(
      g_file_new_tmp_dir_finish(
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Finishes a temporary file creation started by g_file_new_tmp_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_new_tmp_finish:]: Function file_new_tmp_finish contains an OUT parameter, which is not supported yet"
  )
  private def fileNewTmpFinish() = ???

  /** Constructs a #GFile with the given @parse_name (i.e. something given by
    * g_file_get_parse_name()). This operation never fails, but the returned
    * object might not support any I/O operation if the @parse_name cannot be
    * parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fileParseName(
      parse_name: String | CString /* Some(CString) */
  )(using Zone): File /* Some(Ptr[GFile]) */ = new File.Abstract(
    g_file_parse_name(__sn_extract_string(parse_name)).asInstanceOf
  )

  /** Deserializes a #GIcon previously serialized using g_icon_serialize().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[icon_deserialize:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def iconDeserialize() = ???

  /** Generate a #GIcon instance from @str. This function can fail if
    * @str
    *   is not valid - see g_icon_to_string() for discussion.
    *
    * If your application or library provides one or more #GIcon implementations
    * you need to ensure that each #GType is registered with the type system
    * prior to calling g_icon_new_for_string().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def iconNewForString(
      str: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[Icon /* Some(Ptr[GIcon]) */ ] =
    GResult.wrap(__errorPtr =>
      new Icon.Abstract(
        g_icon_new_for_string(
          __sn_extract_string(str).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Helper function for constructing #GInitable object. This is similar to
    * g_object_newv() but also initializes the object and returns %NULL, setting
    * an error on failure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[initable_newv:/<function parameters>/parameters]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GObject.Parameter), @type -> DataRecord(GParameter)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GParameter*)))"
  )
  private def initableNewv() = ???

  /** Converts errno.h error codes into GIO error codes. The fallback value
    * %G_IO_ERROR_FAILED is returned for error codes not currently handled (but
    * note that future GLib releases may return a more specific value instead).
    *
    * As %errno is global and may be modified by intermediate function calls,
    * you should save its value as soon as the call which sets it
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ioErrorFromErrno(
      err_no: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): IOErrorEnum /* Some(GIOErrorEnum) */ =
    IOErrorEnum.fromRaw(g_io_error_from_errno(gint(err_no)))

  /** Converts #GFileError error codes into GIO error codes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ioErrorFromFileError(
      file_error: FileError /* Some(_root_.sn.gnome.glib.internal.GFileError) */
  ): IOErrorEnum /* Some(GIOErrorEnum) */ =
    IOErrorEnum.fromRaw(g_io_error_from_file_error(file_error.raw))

  /** Gets the GIO Error Quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def ioErrorQuark() = ???

  /** Registers @type as extension for the extension point with name
    * @extension_point_name.
    *
    * If @type has already been registered as an extension for this extension
    * point, the existing #GIOExtension object is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_extension_point_implement:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOExtension), @type -> DataRecord(GIOExtension*)))"
  )
  private def ioExtensionPointImplement() = ???

  /** Looks up an existing extension point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_extension_point_lookup:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOExtensionPoint), @type -> DataRecord(GIOExtensionPoint*)))"
  )
  private def ioExtensionPointLookup() = ???

  /** Registers an extension point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_extension_point_register:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOExtensionPoint), @type -> DataRecord(GIOExtensionPoint*)))"
  )
  private def ioExtensionPointRegister() = ???

  /** Loads all the modules in the specified directory.
    *
    * If don't require all modules to be initialized (and thus registering all
    * gtypes) then you can use g_io_modules_scan_all_in_directory() which allows
    * delayed/lazy loading of modules.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_modules_load_all_in_directory:/<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(IOModule))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def ioModulesLoadAllInDirectory() = ???

  /** Loads all the modules in the specified directory.
    *
    * If don't require all modules to be initialized (and thus registering all
    * gtypes) then you can use g_io_modules_scan_all_in_directory() which allows
    * delayed/lazy loading of modules.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_modules_load_all_in_directory_with_scope:/<function parameters>/scope]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOModuleScope), @type -> DataRecord(GIOModuleScope*)))"
  )
  private def ioModulesLoadAllInDirectoryWithScope() = ???

  /** Scans all the modules in the specified directory, ensuring that any
    * extension point implemented by a module is registered.
    *
    * This may not actually load and initialize all the types in each module,
    * some modules may be lazily loaded and initialized when an extension point
    * it implements is used with e.g. g_io_extension_point_get_extensions() or
    * g_io_extension_point_get_extension_by_name().
    *
    * If you need to guarantee that all types are loaded in all the modules, use
    * g_io_modules_load_all_in_directory().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ioModulesScanAllInDirectory(
      dirname: String | CString /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = g_io_modules_scan_all_in_directory(
    __sn_extract_string(dirname)
  )

  /** Scans all the modules in the specified directory, ensuring that any
    * extension point implemented by a module is registered.
    *
    * This may not actually load and initialize all the types in each module,
    * some modules may be lazily loaded and initialized when an extension point
    * it implements is used with e.g. g_io_extension_point_get_extensions() or
    * g_io_extension_point_get_extension_by_name().
    *
    * If you need to guarantee that all types are loaded in all the modules, use
    * g_io_modules_load_all_in_directory().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_modules_scan_all_in_directory_with_scope:/<function parameters>/scope]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOModuleScope), @type -> DataRecord(GIOModuleScope*)))"
  )
  private def ioModulesScanAllInDirectoryWithScope() = ???

  /** Cancels all cancellable I/O jobs.
    *
    * A job is cancellable if a #GCancellable was passed into
    * g_io_scheduler_push_job().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ioSchedulerCancelAllJobs(): Unit /* Some(Unit) */ =
    g_io_scheduler_cancel_all_jobs()

  /** Schedules the I/O job to run in another thread.
    *
    * @notify
    *   will be called on @user_data after @job_func has returned, regardless
    *   whether the job was cancelled or has run to completion.
    *
    * If @cancellable is not %NULL, it can be used to cancel the I/O job by
    * calling g_cancellable_cancel() or by calling
    * g_io_scheduler_cancel_all_jobs().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_scheduler_push_job:/<function parameters>/job_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOSchedulerJobFunc), @type -> DataRecord(GIOSchedulerJobFunc)))"
  )
  private def ioSchedulerPushJob() = ???

  /**  Creates a keyfile-backed #GSettingsBackend.
    *
    *  The filename of the keyfile to use is given by @filename.
    *
    *  All settings read to or written from the backend must fall under the
    *  path given in @root_path (which must start and end with a slash and
    *  not contain two consecutive slashes).  @root_path may be "/".
    *
    *  If @root_group is non-%NULL then it specifies the name of the keyfile
    *  group used for keys that are written directly below @root_path.  For
    *  example, if @root_path is "/apps/example/" and @root_group is
    *  "toplevel", then settings the key "/apps/example/enabled" to a value
    *  of %TRUE will cause the following to appear in the keyfile:
    *
    *  |[
    *    [toplevel]
    *    enabled=true
    *  ]|
    *
    *  If @root_group is %NULL then it is not permitted to store keys
    *  directly below the @root_path.
    *
    *  For keys not stored directly below @root_path (ie: in a sub-path),
    *  the name of the subpath (with the final slash stripped) is used as
    *  the name of the keyfile group.  To continue the example, if
    *  "/apps/example/profiles/default/font-size" were set to
    *  12 then the following would appear in the keyfile:
    *
    *  |[
    *    [profiles/default]
    *    font-size=12
    *  ]|
    *
    *  The backend will refuse writes (and return writability as being
    *  %FALSE) for keys outside of @root_path and, in the event that
    *  @root_group is %NULL, also for keys directly under @root_path.
    *  Writes will also be refused if the backend detects that it has the
    *  inability to rewrite the keyfile (ie: the containing directory is not
    *  writable).
    *
    *  There is no checking done for your key namespace clashing with the
    *  syntax of the key file format.  For example, if you have '[' or ']'
    *  characters in your path names or '=' in your key names you may be in
    *  trouble.
    *
    *  The backend reads default values from a keyfile called `defaults` in
    *  the directory specified by the #GKeyfileSettingsBackend:defaults-dir property,
    *  and a list of locked keys from a text file with the name `locks` in
    *  the same location.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[keyfile_settings_backend_new:]: Method g_keyfile_settings_backend_new has no target types"
  )
  private def keyfileSettingsBackendNew() = ???

  /** Gets a reference to the default #GMemoryMonitor for the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def memoryMonitorDupDefault(): MemoryMonitor /* Some(Ptr[GMemoryMonitor]) */ =
    new MemoryMonitor.Abstract(g_memory_monitor_dup_default().asInstanceOf)

  /** Creates a memory-backed #GSettingsBackend.
    *
    * This backend allows changes to settings, but does not write them to any
    * backing storage, so the next time you run your application, the memory
    * backend will start out with the default values again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[memory_settings_backend_new:]: Method g_memory_settings_backend_new has no target types"
  )
  private def memorySettingsBackendNew() = ???

  /** Gets the default #GNetworkMonitor for the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def networkMonitorGetDefault()
      : NetworkMonitor /* Some(Ptr[GNetworkMonitor]) */ =
    new NetworkMonitor.Abstract(g_network_monitor_get_default().asInstanceOf)

  /** Initializes the platform networking libraries (eg, on Windows, this calls
    * WSAStartup()). GLib will call this itself if it is needed, so you only
    * need to call it if you directly call system networking functions (without
    * calling any GLib networking functions first).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[networking_init:]: Method g_networking_init has no target types"
  )
  private def networkingInit() = ???

  /** Creates a readonly #GSettingsBackend.
    *
    * This backend does not allow changes to settings, so all settings will
    * always have their default values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[null_settings_backend_new:]: Method g_null_settings_backend_new has no target types"
  )
  private def nullSettingsBackendNew() = ???

  /** Utility method for #GPollableInputStream and #GPollableOutputStream
    * implementations. Creates a new #GSource that expects a callback of type
    * #GPollableSourceFunc. The new source does not actually do anything on its
    * own; use g_source_add_child_source() to add other sources to it to cause
    * it to trigger.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pollable_source_new:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  private def pollableSourceNew() = ???

  /** Utility method for #GPollableInputStream and #GPollableOutputStream
    * implementations. Creates a new #GSource, as with g_pollable_source_new(),
    * but also attaching @child_source (with a dummy callback), and @cancellable,
    * if they are non-%NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pollable_source_new_full:/<function parameters>/child_source]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  private def pollableSourceNewFull() = ???

  /** Tries to read from @stream, as with g_input_stream_read() (if
    * @blocking
    *   is %TRUE) or g_pollable_input_stream_read_nonblocking() (if @blocking is
    *   %FALSE). This can be used to more easily share code between blocking and
    *   non-blocking implementations of a method.
    *
    * If @blocking is %FALSE, then @stream must be a #GPollableInputStream for
    * which g_pollable_input_stream_can_poll() returns %TRUE, or else the
    * behavior is undefined. If @blocking is %TRUE, then @stream does not need
    * to be a #GPollableInputStream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pollable_stream_read:/<function parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(void*)))"
  )
  private def pollableStreamRead() = ???

  /** Tries to write to @stream, as with g_output_stream_write() (if
    * @blocking
    *   is %TRUE) or g_pollable_output_stream_write_nonblocking() (if @blocking
    *   is %FALSE). This can be used to more easily share code between blocking
    *   and non-blocking implementations of a method.
    *
    * If @blocking is %FALSE, then @stream must be a #GPollableOutputStream for
    * which g_pollable_output_stream_can_poll() returns %TRUE or else the
    * behavior is undefined. If @blocking is %TRUE, then @stream does not need
    * to be a #GPollableOutputStream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pollable_stream_write:/<function parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(void*)))"
  )
  private def pollableStreamWrite() = ???

  /** Tries to write @count bytes to @stream, as with
    * g_output_stream_write_all(), but using g_pollable_stream_write() rather
    * than g_output_stream_write().
    *
    * On a successful write of @count bytes, %TRUE is returned, and
    * @bytes_written
    *   is set to @count.
    *
    * If there is an error during the operation (including
    * %G_IO_ERROR_WOULD_BLOCK in the non-blocking case), %FALSE is returned and @error
    * is set to indicate the error status,
    * @bytes_written
    *   is updated to contain the number of bytes written into the stream before
    *   the error occurred.
    *
    * As with g_pollable_stream_write(), if @blocking is %FALSE, then
    * @stream
    *   must be a #GPollableOutputStream for which
    *   g_pollable_output_stream_can_poll() returns %TRUE or else the behavior
    *   is undefined. If @blocking is %TRUE, then @stream does not need to be a
    *   #GPollableOutputStream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pollable_stream_write_all:]: Function pollable_stream_write_all contains an OUT parameter, which is not supported yet"
  )
  private def pollableStreamWriteAll() = ???

  /** Gets a reference to the default #GPowerProfileMonitor for the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def powerProfileMonitorDupDefault()
      : PowerProfileMonitor /* Some(Ptr[GPowerProfileMonitor]) */ =
    new PowerProfileMonitor.Abstract(
      g_power_profile_monitor_dup_default().asInstanceOf
    )

  /** Find the `gio-proxy` extension point for a proxy implementation that
    * supports the specified protocol.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def proxyGetDefaultForProtocol(
      protocol: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Proxy /* Some(Ptr[GProxy]) */ = new Proxy.Abstract(
    g_proxy_get_default_for_protocol(
      __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Gets the default #GProxyResolver for the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def proxyResolverGetDefault(): ProxyResolver /* Some(Ptr[GProxyResolver]) */ =
    new ProxyResolver.Abstract(g_proxy_resolver_get_default().asInstanceOf)

  /** Gets the #GResolver Error Quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[resolver_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def resolverErrorQuark() = ???

  /** Gets the #GResource Error Quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[resource_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def resourceErrorQuark() = ???

  /** Loads a binary resource bundle and creates a #GResource representation of
    * it, allowing you to query it for data.
    *
    * If you want to use this resource in the global resource namespace you need
    * to register it with g_resources_register().
    *
    * If @filename is empty or the data in it is corrupt,
    * %G_RESOURCE_ERROR_INTERNAL will be returned. If @filename doesn’t exist,
    * or there is an error in reading it, an error from g_mapped_file_new() will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[resource_load:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Resource), @type -> DataRecord(GResource*)))"
  )
  private def resourceLoad() = ???

  /** Returns all the names of children at the specified @path in the set of
    * globally registered resources. The return result is a %NULL terminated
    * list of strings which should be released with g_strfreev().
    *
    * @lookup_flags
    *   controls the behaviour of the lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resourcesEnumerateChildren(
      path: String | CString /* Some(CString) */,
      lookup_flags: ResourceLookupFlags /* Some(GResourceLookupFlags) */
  )(using Zone): GResult[Array[String] /* Some(Ptr[CString]) */ ] =
    GResult.wrap(__errorPtr =>
      __decode_nullable_ptrs(
        g_resources_enumerate_children(
          __sn_extract_string(path),
          lookup_flags.raw,
          __errorPtr
        )
      ).map(fromCString(_))
    )

  /** Looks for a file at the specified @path in the set of globally registered
    * resources and if found returns information about it.
    *
    * @lookup_flags
    *   controls the behaviour of the lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[resources_get_info:]: Function resources_get_info contains an OUT parameter, which is not supported yet"
  )
  private def resourcesGetInfo() = ???

  /** Looks for a file at the specified @path in the set of globally registered
    * resources and returns a #GBytes that lets you directly access the data in
    * memory.
    *
    * The data is always followed by a zero byte, so you can safely use the data
    * as a C string. However, that byte is not included in the size of the
    * GBytes.
    *
    * For uncompressed resource files this is a pointer directly into the
    * resource bundle, which is typically in some readonly data section in the
    * program binary. For compressed files we allocate memory on the heap and
    * automatically uncompress the data.
    *
    * @lookup_flags
    *   controls the behaviour of the lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[resources_lookup_data:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def resourcesLookupData() = ???

  /** Looks for a file at the specified @path in the set of globally registered
    * resources and returns a #GInputStream that lets you read the data.
    *
    * @lookup_flags
    *   controls the behaviour of the lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resourcesOpenStream(
      path: String | CString /* Some(CString) */,
      lookup_flags: ResourceLookupFlags /* Some(GResourceLookupFlags) */
  )(using Zone): GResult[InputStream /* Some(Ptr[GInputStream]) */ ] =
    GResult.wrap(__errorPtr =>
      new InputStream(
        g_resources_open_stream(
          __sn_extract_string(path),
          lookup_flags.raw,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Registers the resource with the process-global set of resources. Once a
    * resource is registered the files in it can be accessed with the global
    * resource lookup functions like g_resources_lookup_data().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[resources_register:/<function parameters>/resource]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Resource), @type -> DataRecord(GResource*)))"
  )
  private def resourcesRegister() = ???

  /** Unregisters the resource from the process-global set of resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[resources_unregister:/<function parameters>/resource]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Resource), @type -> DataRecord(GResource*)))"
  )
  private def resourcesUnregister() = ???

  /** Gets the default system schema source.
    *
    * This function is not required for normal uses of #GSettings but it may be
    * useful to authors of plugin management systems or to those who want to
    * introspect the content of schemas.
    *
    * If no schemas are installed, %NULL will be returned.
    *
    * The returned source may actually consist of multiple schema sources from
    * different directories, depending on which directories were given in
    * `XDG_DATA_DIRS` and `GSETTINGS_SCHEMA_DIR`. For this reason, all lookups
    * performed against the default source should probably be done recursively.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[settings_schema_source_get_default:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SettingsSchemaSource), @type -> DataRecord(GSettingsSchemaSource*)))"
  )
  private def settingsSchemaSourceGetDefault() = ???

  /** Reports an error in an asynchronous function in an idle function by
    * directly setting the contents of the #GAsyncResult with the given error
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[simple_async_report_error_in_idle:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def simpleAsyncReportErrorInIdle() = ???

  /** Reports an error in an idle function. Similar to
    * g_simple_async_report_error_in_idle(), but takes a #GError rather than
    * building a new one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[simple_async_report_gerror_in_idle:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def simpleAsyncReportGerrorInIdle() = ???

  /** Reports an error in an idle function. Similar to
    * g_simple_async_report_gerror_in_idle(), but takes over the caller's
    * ownership of @error, so the caller does not have to free it any more.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[simple_async_report_take_gerror_in_idle:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def simpleAsyncReportTakeGerrorInIdle() = ???

  /** Sorts @targets in place according to the algorithm in RFC 2782.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[srv_target_list_sort:/<function parameters>/targets]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def srvTargetListSort() = ???

  /** Gets the default #GTlsBackend for the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tlsBackendGetDefault(): TlsBackend /* Some(Ptr[GTlsBackend]) */ =
    new TlsBackend.Abstract(g_tls_backend_get_default().asInstanceOf)

  /** Gets the TLS channel binding error quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[tls_channel_binding_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def tlsChannelBindingErrorQuark() = ???

  /** Creates a new #GTlsClientConnection wrapping @base_io_stream (which must
    * have pollable input and output streams) which is assumed to communicate
    * with the server identified by @server_identity.
    *
    * See the documentation for #GTlsConnection:base-io-stream for restrictions
    * on when application code can run operations on the @base_io_stream after
    * this function has returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tlsClientConnectionNew(
      base_io_stream: IOStream /* Some(Ptr[GIOStream]) */,
      server_identity: Option[
        SocketConnectable /* Some(Ptr[GSocketConnectable]) */
      ]
  ): GResult[TlsClientConnection /* Some(Ptr[GIOStream]) */ ] =
    GResult.wrap(__errorPtr =>
      new TlsClientConnection.Abstract(
        g_tls_client_connection_new(
          base_io_stream.getUnsafeRawPointer().asInstanceOf,
          server_identity
            .map[Ptr[GSocketConnectable]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GSocketConnectable]]),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Gets the TLS error quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[tls_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def tlsErrorQuark() = ???

  /** Creates a new #GTlsFileDatabase which uses anchor certificate authorities
    * in @anchors to verify certificate chains.
    *
    * The certificates in @anchors must be PEM encoded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tlsFileDatabaseNew(
      anchors: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[TlsFileDatabase /* Some(Ptr[GTlsDatabase]) */ ] =
    GResult.wrap(__errorPtr =>
      new TlsFileDatabase.Abstract(
        g_tls_file_database_new(
          __sn_extract_string(anchors).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Creates a new #GTlsServerConnection wrapping @base_io_stream (which must
    * have pollable input and output streams).
    *
    * See the documentation for #GTlsConnection:base-io-stream for restrictions
    * on when application code can run operations on the @base_io_stream after
    * this function has returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tlsServerConnectionNew(
      base_io_stream: IOStream /* Some(Ptr[GIOStream]) */,
      certificate: Option[TlsCertificate /* Some(Ptr[GTlsCertificate]) */ ]
  ): GResult[TlsServerConnection /* Some(Ptr[GIOStream]) */ ] =
    GResult.wrap(__errorPtr =>
      new TlsServerConnection.Abstract(
        g_tls_server_connection_new(
          base_io_stream.getUnsafeRawPointer().asInstanceOf,
          certificate
            .map[Ptr[GTlsCertificate]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GTlsCertificate]]),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Determines if @mount_path is considered an implementation of the OS. This
    * is primarily used for hiding mountable and mounted volumes that only are
    * used in the OS and has little to no relevance to the casual user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_is_mount_path_system_internal:]: Method g_unix_is_mount_path_system_internal has no target types"
  )
  private def unixIsMountPathSystemInternal() = ???

  /** Determines if @device_path is considered a block device path which is only
    * used in implementation of the OS. This is primarily used for hiding
    * mounted volumes that are intended as APIs for programs to read, and system
    * administrators at a shell; rather than something that should, for example,
    * appear in a GUI. For example, the Linux `/proc` filesystem.
    *
    * The list of device paths considered ‘system’ ones may change over time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_is_system_device_path:]: Method g_unix_is_system_device_path has no target types"
  )
  private def unixIsSystemDevicePath() = ???

  /** Determines if @fs_type is considered a type of file system which is only
    * used in implementation of the OS. This is primarily used for hiding
    * mounted volumes that are intended as APIs for programs to read, and system
    * administrators at a shell; rather than something that should, for example,
    * appear in a GUI. For example, the Linux `/proc` filesystem.
    *
    * The list of file system types considered ‘system’ ones may change over
    * time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_is_system_fs_type:]: Method g_unix_is_system_fs_type has no target types"
  )
  private def unixIsSystemFsType() = ???

  /** Gets a #GUnixMountEntry for a given mount path. If @time_read is set, it
    * will be filled with a unix timestamp for checking if the mounts have
    * changed since with g_unix_mounts_changed_since().
    *
    * If more mounts have the same mount path, the last matching mount is
    * returned.
    *
    * This will return %NULL if there is no mount point at @mount_path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_at:]: Function unix_mount_at contains an OUT parameter, which is not supported yet"
  )
  private def unixMountAt() = ???

  /** Compares two unix mounts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_compare:]: Method g_unix_mount_compare has no target types"
  )
  private def unixMountCompare() = ???

  /** Makes a copy of @mount_entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_copy:]: Method g_unix_mount_copy has no target types"
  )
  private def unixMountCopy() = ???

  /** Gets a #GUnixMountEntry for a given file path. If @time_read is set, it
    * will be filled with a unix timestamp for checking if the mounts have
    * changed since with g_unix_mounts_changed_since().
    *
    * If more mounts have the same mount path, the last matching mount is
    * returned.
    *
    * This will return %NULL if looking up the mount entry fails, if
    * @file_path
    *   doesn’t exist or there is an I/O error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_for:]: Function unix_mount_for contains an OUT parameter, which is not supported yet"
  )
  private def unixMountFor() = ???

  /** Frees a unix mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_free:]: Method g_unix_mount_free has no target types"
  )
  private def unixMountFree() = ???

  /** Gets the device path for a unix mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_get_device_path:]: Method g_unix_mount_get_device_path has no target types"
  )
  private def unixMountGetDevicePath() = ???

  /** Gets the filesystem type for the unix mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_get_fs_type:]: Method g_unix_mount_get_fs_type has no target types"
  )
  private def unixMountGetFsType() = ???

  /** Gets the mount path for a unix mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_get_mount_path:]: Method g_unix_mount_get_mount_path has no target types"
  )
  private def unixMountGetMountPath() = ???

  /** Gets a comma-separated list of mount options for the unix mount. For
    * example, `rw,relatime,seclabel,data=ordered`.
    *
    * This is similar to g_unix_mount_point_get_options(), but it takes a
    * #GUnixMountEntry as an argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_get_options:]: Method g_unix_mount_get_options has no target types"
  )
  private def unixMountGetOptions() = ???

  /** Gets the root of the mount within the filesystem. This is useful e.g. for
    * mounts created by bind operation, or btrfs subvolumes.
    *
    * For example, the root path is equal to "/" for mount created by "mount
    * /dev/sda1 /mnt/foo" and "/bar" for "mount --bind /mnt/foo/bar /mnt/bar".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_get_root_path:]: Method g_unix_mount_get_root_path has no target types"
  )
  private def unixMountGetRootPath() = ???

  /** Guesses whether a Unix mount can be ejected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_guess_can_eject:]: Method g_unix_mount_guess_can_eject has no target types"
  )
  private def unixMountGuessCanEject() = ???

  /** Guesses the icon of a Unix mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_guess_icon:]: Method g_unix_mount_guess_icon has no target types"
  )
  private def unixMountGuessIcon() = ???

  /** Guesses the name of a Unix mount. The result is a translated string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_guess_name:]: Method g_unix_mount_guess_name has no target types"
  )
  private def unixMountGuessName() = ???

  /** Guesses whether a Unix mount should be displayed in the UI.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_guess_should_display:]: Method g_unix_mount_guess_should_display has no target types"
  )
  private def unixMountGuessShouldDisplay() = ???

  /** Guesses the symbolic icon of a Unix mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_guess_symbolic_icon:]: Method g_unix_mount_guess_symbolic_icon has no target types"
  )
  private def unixMountGuessSymbolicIcon() = ???

  /** Checks if a unix mount is mounted read only.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_is_readonly:]: Method g_unix_mount_is_readonly has no target types"
  )
  private def unixMountIsReadonly() = ???

  /** Checks if a Unix mount is a system mount. This is the Boolean OR of
    * g_unix_is_system_fs_type(), g_unix_is_system_device_path() and
    * g_unix_is_mount_path_system_internal() on @mount_entry’s properties.
    *
    * The definition of what a ‘system’ mount entry is may change over time as
    * new file system types and device paths are ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_is_system_internal:]: Method g_unix_mount_is_system_internal has no target types"
  )
  private def unixMountIsSystemInternal() = ???

  /** Gets a #GUnixMountPoint for a given mount path. If @time_read is set, it
    * will be filled with a unix timestamp for checking if the mount points have
    * changed since with g_unix_mount_points_changed_since().
    *
    * If more mount points have the same mount path, the last matching mount
    * point is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_point_at:]: Function unix_mount_point_at contains an OUT parameter, which is not supported yet"
  )
  private def unixMountPointAt() = ???

  /** Checks if the unix mount points have changed since a given unix time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_points_changed_since:]: Method g_unix_mount_points_changed_since has no target types"
  )
  private def unixMountPointsChangedSince() = ???

  /** Gets a #GList of #GUnixMountPoint containing the unix mount points. If @time_read
    * is set, it will be filled with the mount timestamp, allowing for checking
    * if the mounts have changed with g_unix_mount_points_changed_since().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mount_points_get:]: Function unix_mount_points_get contains an OUT parameter, which is not supported yet"
  )
  private def unixMountPointsGet() = ???

  /** Checks if the unix mounts have changed since a given unix time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mounts_changed_since:]: Method g_unix_mounts_changed_since has no target types"
  )
  private def unixMountsChangedSince() = ???

  /** Gets a #GList of #GUnixMountEntry containing the unix mounts. If @time_read
    * is set, it will be filled with the mount timestamp, allowing for checking
    * if the mounts have changed with g_unix_mounts_changed_since().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_mounts_get:]: Function unix_mounts_get contains an OUT parameter, which is not supported yet"
  )
  private def unixMountsGet() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(using ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs
end Gio
