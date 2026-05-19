package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{
  ActionGroup,
  AsyncInitable,
  AsyncResult,
  Cancellable,
  Credentials,
  DBusAuthObserver,
  DBusCapabilityFlags,
  DBusConnectionFlags,
  DBusMessage,
  IOStream,
  Initable,
  MenuModel
}
import sn.gnome.gio.internal.GDBusConnection
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint, guint32}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** The #GDBusConnection type is used for D-Bus connections to remote peers such
  * as a message buses. It is a low-level API that offers a lot of flexibility.
  * For instance, it lets you establish a connection over any transport that can
  * by represented as a #GIOStream.
  *
  * This class is rarely used directly in D-Bus clients. If you are writing a
  * D-Bus client, it is often easier to use the g_bus_own_name(),
  * g_bus_watch_name() or g_dbus_proxy_new_for_bus() APIs.
  *
  * As an exception to the usual GLib rule that a particular object must not be
  * used by two threads at the same time, #GDBusConnection's methods may be
  * called from any thread. This is so that g_bus_get() and g_bus_get_sync() can
  * safely return the same #GDBusConnection when called from any thread.
  *
  * Most of the ways to obtain a #GDBusConnection automatically initialize it
  * (i.e. connect to D-Bus): for instance, g_dbus_connection_new() and
  * g_bus_get(), and the synchronous versions of those methods, give you an
  * initialized connection. Language bindings for GIO should use
  * g_initable_new() or g_async_initable_new_async(), which also initialize the
  * connection.
  *
  * If you construct an uninitialized #GDBusConnection, such as via
  * g_object_new(), you must initialize it via g_initable_init() or
  * g_async_initable_init_async() before using its methods or properties.
  * Calling methods or accessing properties on a #GDBusConnection that has not
  * completed initialization successfully is considered to be invalid, and leads
  * to undefined behaviour. In particular, if initialization fails with a
  * #GError, the only valid thing you can do with that #GDBusConnection is to
  * free it with g_object_unref().
  *
  * ## An example D-Bus server # {#gdbus-server}
  *
  * Here is an example for a D-Bus server:
  * [gdbus-example-server.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-server.c)
  *
  * ## An example for exporting a subtree # {#gdbus-subtree-server}
  *
  * Here is an example for exporting a subtree:
  * [gdbus-example-subtree.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-subtree.c)
  *
  * ## An example for file descriptor passing # {#gdbus-unix-fd-client}
  *
  * Here is an example for passing UNIX file descriptors:
  * [gdbus-unix-fd-client.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-unix-fd-client.c)
  *
  * ## An example for exporting a GObject # {#gdbus-export}
  *
  * Here is an example for exporting a #GObject:
  * [gdbus-example-export.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-export.c)
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusConnection private[gnome] (raw: Ptr[GDBusConnection])
    extends Object(raw.asInstanceOf),
      AsyncInitable,
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a message filter. Filters are handlers that are run on all incoming
    * and outgoing messages, prior to standard dispatch. Filters are run in the
    * order that they were added. The same handler can be added as a filter more
    * than once, in which case it will be run more than once. Filters added
    * during a filter callback won't be run on the message being processed.
    * Filter functions are allowed to modify and even drop messages.
    *
    * Note that filters are run in a dedicated message handling thread so they
    * can't block and, generally, can't do anything but signal a worker thread.
    * Also note that filters are rarely needed - use API such as
    * g_dbus_connection_send_message_with_reply(),
    * g_dbus_connection_signal_subscribe() or g_dbus_connection_call() instead.
    *
    * If a filter consumes an incoming message the message is not dispatched
    * anywhere else - not even the standard dispatch machinery (that API such as
    * g_dbus_connection_signal_subscribe() and
    * g_dbus_connection_send_message_with_reply() relies on) will see the
    * message. Similarly, if a filter consumes an outgoing message, the message
    * will not be sent to the other peer.
    *
    * If @user_data_free_func is non-%NULL, it will be called (in the
    * thread-default main context of the thread you are calling this method
    * from) at some point after @user_data is no longer needed. (It is not
    * guaranteed to be called synchronously when the filter is removed, and may
    * be called after @connection has been destroyed.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_filter/<method parameters>/filter_function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusMessageFilterFunction), @type -> DataRecord(GDBusMessageFilterFunction)))"
  )
  private def addFilter__ = ???

  /**  Asynchronously invokes the @method_name method on the
    *  @interface_name D-Bus interface on the remote object at
    *  @object_path owned by @bus_name.
    *
    *  If @connection is closed then the operation will fail with
    *  %G_IO_ERROR_CLOSED. If @cancellable is canceled, the operation will
    *  fail with %G_IO_ERROR_CANCELLED. If @parameters contains a value
    *  not compatible with the D-Bus protocol, the operation fails with
    *  %G_IO_ERROR_INVALID_ARGUMENT.
    *
    *  If @reply_type is non-%NULL then the reply will be checked for having this type and an
    *  error will be raised if it does not match.  Said another way, if you give a @reply_type
    *  then any non-%NULL return value will be of this type. Unless it’s
    *  %G_VARIANT_TYPE_UNIT, the @reply_type will be a tuple containing one or more
    *  values.
    *
    *  If the @parameters #GVariant is floating, it is consumed. This allows
    *  convenient 'inline' use of g_variant_new(), e.g.:
    *  |[<!-- language="C" -->
    *   g_dbus_connection_call (connection,
    *                           "org.freedesktop.StringThings",
    *                           "/org/freedesktop/StringThings",
    *                           "org.freedesktop.StringThings",
    *                           "TwoStrings",
    *                           g_variant_new ("(ss)",
    *                                          "Thing One",
    *                                          "Thing Two"),
    *                           NULL,
    *                           G_DBUS_CALL_FLAGS_NONE,
    *                           -1,
    *                           NULL,
    *                           (GAsyncReadyCallback) two_strings_done,
    *                           NULL);
    *  ]|
    *
    *  This is an asynchronous method. When the operation is finished,
    *  @callback will be invoked in the
    *  [thread-default main context][g-main-context-push-thread-default]
    *  of the thread you are calling this method from. You can then call
    *  g_dbus_connection_call_finish() to get the result of the operation.
    *  See g_dbus_connection_call_sync() for the synchronous version of this
    *  function.
    *
    *  If @callback is %NULL then the D-Bus method call message will be sent with
    *  the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method call/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def call__ = ???

  /** Finishes an operation started with g_dbus_connection_call().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method call_finish/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def callFinish__ = ???

  /**  Synchronously invokes the @method_name method on the
    *  @interface_name D-Bus interface on the remote object at
    *  @object_path owned by @bus_name.
    *
    *  If @connection is closed then the operation will fail with
    *  %G_IO_ERROR_CLOSED. If @cancellable is canceled, the
    *  operation will fail with %G_IO_ERROR_CANCELLED. If @parameters
    *  contains a value not compatible with the D-Bus protocol, the operation
    *  fails with %G_IO_ERROR_INVALID_ARGUMENT.
    *
    *  If @reply_type is non-%NULL then the reply will be checked for having
    *  this type and an error will be raised if it does not match.  Said
    *  another way, if you give a @reply_type then any non-%NULL return
    *  value will be of this type.
    *
    *  If the @parameters #GVariant is floating, it is consumed.
    *  This allows convenient 'inline' use of g_variant_new(), e.g.:
    *  |[<!-- language="C" -->
    *   g_dbus_connection_call_sync (connection,
    *                                "org.freedesktop.StringThings",
    *                                "/org/freedesktop/StringThings",
    *                                "org.freedesktop.StringThings",
    *                                "TwoStrings",
    *                                g_variant_new ("(ss)",
    *                                               "Thing One",
    *                                               "Thing Two"),
    *                                NULL,
    *                                G_DBUS_CALL_FLAGS_NONE,
    *                                -1,
    *                                NULL,
    *                                &error);
    *  ]|
    *
    *  The calling thread is blocked until a reply is received. See
    *  g_dbus_connection_call() for the asynchronous version of
    *  this method.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method call_sync/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def callSync__ = ???

  /** Like g_dbus_connection_call() but also takes a #GUnixFDList object.
    *
    * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE values
    * in the body of the message. For example, if a message contains two file
    * descriptors, @fd_list would have length 2, and `g_variant_new_handle (0)`
    * and `g_variant_new_handle (1)` would appear somewhere in the body of the
    * message (not necessarily in that order!) to represent the file descriptors
    * at indexes 0 and 1 respectively.
    *
    * When designing D-Bus APIs that are intended to be interoperable, please
    * note that non-GDBus implementations of D-Bus can usually only access file
    * descriptors if they are referenced in this way by a value of type
    * %G_VARIANT_TYPE_HANDLE in the body of the message.
    *
    * This method is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method call_with_unix_fd_list/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def callWithUnixFdList__ = ???

  /** Finishes an operation started with
    * g_dbus_connection_call_with_unix_fd_list().
    *
    * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE values
    * in the body of the message. For example, if g_variant_get_handle() returns
    * 5, that is intended to be a reference to the file descriptor that can be
    * accessed by `g_unix_fd_list_get (*out_fd_list, 5, ...)`.
    *
    * When designing D-Bus APIs that are intended to be interoperable, please
    * note that non-GDBus implementations of D-Bus can usually only access file
    * descriptors if they are referenced in this way by a value of type
    * %G_VARIANT_TYPE_HANDLE in the body of the message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method call_with_unix_fd_list_finish]: Method call_with_unix_fd_list_finish contains an OUT parameter, which is not supported yet"
  )
  private def callWithUnixFdListFinish__ = ???

  /** Like g_dbus_connection_call_sync() but also takes and returns #GUnixFDList
    * objects. See g_dbus_connection_call_with_unix_fd_list() and
    * g_dbus_connection_call_with_unix_fd_list_finish() for more details.
    *
    * This method is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method call_with_unix_fd_list_sync]: Method call_with_unix_fd_list_sync contains an OUT parameter, which is not supported yet"
  )
  private def callWithUnixFdListSync__ = ???

  /** Closes @connection. Note that this never causes the process to exit (this
    * might only happen if the other end of a shared message bus connection
    * disconnects, see #GDBusConnection:exit-on-close).
    *
    * Once the connection is closed, operations such as sending a message will
    * return with the error %G_IO_ERROR_CLOSED. Closing a connection will not
    * automatically flush the connection so queued messages may be lost. Use
    * g_dbus_connection_flush() if you need such guarantees.
    *
    * If @connection is already closed, this method fails with
    * %G_IO_ERROR_CLOSED.
    *
    * When @connection has been closed, the #GDBusConnection::closed signal is
    * emitted in the [thread-default main
    * context][g-main-context-push-thread-default] of the thread that @connection
    * was constructed in.
    *
    * This is an asynchronous method. When the operation is finished,
    * @callback
    *   will be invoked in the [thread-default main
    *   context][g-main-context-push-thread-default] of the thread you are
    *   calling this method from. You can then call
    *   g_dbus_connection_close_finish() to get the result of the operation. See
    *   g_dbus_connection_close_sync() for the synchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method close/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def close__ = ???

  /** Finishes an operation started with g_dbus_connection_close().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def closeFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_connection_close_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end closeFinish

  /** Synchronously closes @connection. The calling thread is blocked until this
    * is done. See g_dbus_connection_close() for the asynchronous version of
    * this method and more details about what it does.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def closeSync(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_connection_close_sync(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end closeSync

  /** Emits a signal.
    *
    * If the parameters GVariant is floating, it is consumed.
    *
    * This can only fail if @parameters is not compatible with the D-Bus
    * protocol (%G_IO_ERROR_INVALID_ARGUMENT), or if @connection has been closed
    * (%G_IO_ERROR_CLOSED).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method emit_signal/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def emitSignal__ = ???

  /** Exports @action_group on @connection at @object_path.
    *
    * The implemented D-Bus API should be considered private. It is subject to
    * change in the future.
    *
    * A given object path can only have one action group exported on it. If this
    * constraint is violated, the export will fail and 0 will be returned (with @error
    * set accordingly).
    *
    * You can unexport the action group using
    * g_dbus_connection_unexport_action_group() with the return value of this
    * function.
    *
    * The thread default main context is taken at the time of this call. All
    * incoming action activations and state change requests are reported from
    * this context. Any changes on the action group that cause it to emit
    * signals must also come from this same context. Since incoming action
    * activations and state change requests are rather likely to cause changes
    * on the action group, this effectively limits a given action group to being
    * exported from only one main context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def exportActionGroup(
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      action_group: ActionGroup /* Some(Ptr[GActionGroup]) */
  )(using Runtime): GResult[UInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_connection_export_action_group(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
        summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]],
        action_group.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )
  end exportActionGroup

  /** Exports @menu on @connection at @object_path.
    *
    * The implemented D-Bus API should be considered private. It is subject to
    * change in the future.
    *
    * An object path can only have one menu model exported on it. If this
    * constraint is violated, the export will fail and 0 will be returned (with @error
    * set accordingly).
    *
    * Exporting menus with sections containing more than
    * %G_MENU_EXPORTER_MAX_SECTION_SIZE items is not supported and results in
    * undefined behavior.
    *
    * You can unexport the menu model using
    * g_dbus_connection_unexport_menu_model() with the return value of this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def exportMenuModel(
      object_path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      menu: sn.gnome.gio.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Runtime): GResult[UInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_connection_export_menu_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
        summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]],
        menu.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )
  end exportMenuModel

  /** Asynchronously flushes @connection, that is, writes all queued outgoing
    * message to the transport and then flushes the transport (using
    * g_output_stream_flush_async()). This is useful in programs that wants to
    * emit a D-Bus signal and then exit immediately. Without flushing the
    * connection, there is no guaranteed that the message has been sent to the
    * networking buffers in the OS kernel.
    *
    * This is an asynchronous method. When the operation is finished,
    * @callback
    *   will be invoked in the [thread-default main
    *   context][g-main-context-push-thread-default] of the thread you are
    *   calling this method from. You can then call
    *   g_dbus_connection_flush_finish() to get the result of the operation. See
    *   g_dbus_connection_flush_sync() for the synchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method flush/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def flush__ = ???

  /** Finishes an operation started with g_dbus_connection_flush().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flushFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_connection_flush_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end flushFinish

  /** Synchronously flushes @connection. The calling thread is blocked until
    * this is done. See g_dbus_connection_flush() for the asynchronous version
    * of this method and more details about what it does.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flushSync(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_connection_flush_sync(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end flushSync

  /** Gets the capabilities negotiated with the remote peer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCapabilities(): DBusCapabilityFlags /* None */ =
    DBusCapabilityFlags.fromRaw(
      g_dbus_connection_get_capabilities(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
      )
    )
  end getCapabilities

  /** Gets whether the process is terminated when @connection is closed by the
    * remote peer. See #GDBusConnection:exit-on-close for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExitOnClose(): Boolean /* None */ =
    g_dbus_connection_get_exit_on_close(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
    ).value.!=(0)
  end getExitOnClose

  /** Gets the flags used to construct this connection
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): DBusConnectionFlags /* None */ =
    DBusConnectionFlags.fromRaw(
      g_dbus_connection_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
      )
    )
  end getFlags

  /** The GUID of the peer performing the role of server when authenticating.
    * See #GDBusConnection:guid for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGuid(): String /* None */ =
    fromCString(
      g_dbus_connection_get_guid(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
      ).asInstanceOf
    )
  end getGuid

  /** Retrieves the last serial number assigned to a #GDBusMessage on the
    * current thread. This includes messages sent via both low-level API such as
    * g_dbus_connection_send_message() as well as high-level API such as
    * g_dbus_connection_emit_signal(), g_dbus_connection_call() or
    * g_dbus_proxy_call().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLastSerial(): UInt /* None */ =
    g_dbus_connection_get_last_serial(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
    ).value
  end getLastSerial

  /** Gets the credentials of the authenticated peer. This will always return
    * %NULL unless @connection acted as a server (e.g.
    * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER was passed) when set up and
    * the client passed credentials as part of the authentication process.
    *
    * In a message bus setup, the message bus is always the server and each
    * application is a client. So this method will always return %NULL for
    * message bus clients.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPeerCredentials()(using Runtime): sn.gnome.gio.Credentials /* None */ =
    sn.gnome.gio.Credentials.applyUnsafe(
      g_dbus_connection_get_peer_credentials(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
      ).asInstanceOf
    )
  end getPeerCredentials

  /** Gets the underlying stream used for IO.
    *
    * While the #GDBusConnection is active, it will interact with this stream
    * from a worker thread, so it is not safe to interact with the stream
    * directly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStream()(using Runtime): sn.gnome.gio.IOStream /* None */ =
    sn.gnome.gio.IOStream.applyUnsafe(
      g_dbus_connection_get_stream(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
      ).asInstanceOf
    )
  end getStream

  /** Gets the unique name of @connection as assigned by the message bus. This
    * can also be used to figure out if @connection is a message bus connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUniqueName(): String /* None */ =
    fromCString(
      g_dbus_connection_get_unique_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
      ).asInstanceOf
    )
  end getUniqueName

  /** Gets whether @connection is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClosed(): Boolean /* None */ =
    g_dbus_connection_is_closed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
    ).value.!=(0)
  end isClosed

  /** Registers callbacks for exported objects at @object_path with the D-Bus
    * interface that is described in @interface_info.
    *
    * Calls to functions in @vtable (and @user_data_free_func) will happen in
    * the [thread-default main context][g-main-context-push-thread-default] of
    * the thread you are calling this method from.
    *
    * Note that all #GVariant values passed to functions in @vtable will match
    * the signature given in @interface_info - if a remote caller passes
    * incorrect values, the `org.freedesktop.DBus.Error.InvalidArgs` is returned
    * to the remote caller.
    *
    * Additionally, if the remote caller attempts to invoke methods or access
    * properties not mentioned in @interface_info the
    * `org.freedesktop.DBus.Error.UnknownMethod` resp.
    * `org.freedesktop.DBus.Error.InvalidArgs` errors are returned to the
    * caller.
    *
    * It is considered a programming error if the #GDBusInterfaceGetPropertyFunc
    * function in @vtable returns a #GVariant of incorrect type.
    *
    * If an existing callback is already registered at @object_path and
    * @interface_name,
    *   then @error is set to %G_IO_ERROR_EXISTS.
    *
    * GDBus automatically implements the standard D-Bus interfaces
    * org.freedesktop.DBus.Properties, org.freedesktop.DBus.Introspectable and
    * org.freedesktop.Peer, so you don't have to implement those for the objects
    * you export. You can implement org.freedesktop.DBus.Properties yourself,
    * e.g. to handle getting and setting of properties asynchronously.
    *
    * Note that the reference count on @interface_info will be incremented by 1
    * (unless allocated statically, e.g. if the reference count is -1, see
    * g_dbus_interface_info_ref()) for as long as the object is exported. Also
    * note that @vtable will be copied.
    *
    * See this [server][gdbus-server] for an example of how to use this method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method register_object/<method parameters>/interface_info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def registerObject__ = ???

  /** Version of g_dbus_connection_register_object() using closures instead of a
    * #GDBusInterfaceVTable for easier binding in other languages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method register_object_with_closures/<method parameters>/interface_info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def registerObjectWithClosures__ = ???

  /** Registers a whole subtree of dynamic objects.
    *
    * The @enumerate and @introspection functions in @vtable are used to convey,
    * to remote callers, what nodes exist in the subtree rooted by @object_path.
    *
    * When handling remote calls into any node in the subtree, first the
    * @enumerate
    *   function is used to check if the node exists. If the node exists or the
    *   %G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES flag is set the @introspection
    *   function is used to check if the node supports the requested method. If
    *   so, the @dispatch function is used to determine where to dispatch the
    *   call. The collected #GDBusInterfaceVTable and #gpointer will be used to
    *   call into the interface vtable for processing the request.
    *
    * All calls into user-provided code will be invoked in the [thread-default
    * main context][g-main-context-push-thread-default] of the thread you are
    * calling this method from.
    *
    * If an existing subtree is already registered at @object_path or then @error
    * is set to %G_IO_ERROR_EXISTS.
    *
    * Note that it is valid to register regular objects (using
    * g_dbus_connection_register_object()) in a subtree registered with
    * g_dbus_connection_register_subtree() - if so, the subtree handler is tried
    * as the last resort. One way to think about a subtree handler is to
    * consider it a fallback handler for object paths not registered via
    * g_dbus_connection_register_object() or other bindings.
    *
    * Note that @vtable will be copied so you cannot change it after
    * registration.
    *
    * See this [server][gdbus-subtree-server] for an example of how to use this
    * method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method register_subtree/<method parameters>/vtable]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusSubtreeVTable), @type -> DataRecord(const GDBusSubtreeVTable*)))"
  )
  private def registerSubtree__ = ???

  /** Removes a filter.
    *
    * Note that since filters run in a different thread, there is a race
    * condition where it is possible that the filter will be running even after
    * calling g_dbus_connection_remove_filter(), so you cannot just free data
    * that the filter might be using. Instead, you should pass a #GDestroyNotify
    * to g_dbus_connection_add_filter(), which will be called when it is
    * guaranteed that the data is no longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeFilter(
      filter_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_dbus_connection_remove_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
      guint(filter_id)
    )
  end removeFilter

  /** Asynchronously sends @message to the peer represented by @connection.
    *
    * Unless @flags contain the %G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL flag,
    * the serial number will be assigned by @connection and set on @message via
    * g_dbus_message_set_serial(). If @out_serial is not %NULL, then the serial
    * number used will be written to this location prior to submitting the
    * message to the underlying transport. While it has a `volatile` qualifier,
    * this is a historical artifact and the argument passed to it should not be
    * `volatile`.
    *
    * If @connection is closed then the operation will fail with
    * %G_IO_ERROR_CLOSED. If @message is not well-formed, the operation fails
    * with %G_IO_ERROR_INVALID_ARGUMENT.
    *
    * See this [server][gdbus-server] and [client][gdbus-unix-fd-client] for an
    * example of how to use this low-level API to send and receive UNIX file
    * descriptors.
    *
    * Note that @message must be unlocked, unless @flags contain the
    * %G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL flag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method send_message]: Method send_message contains an OUT parameter, which is not supported yet"
  )
  private def sendMessage__ = ???

  /** Asynchronously sends @message to the peer represented by @connection.
    *
    * Unless @flags contain the %G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL flag,
    * the serial number will be assigned by @connection and set on @message via
    * g_dbus_message_set_serial(). If @out_serial is not %NULL, then the serial
    * number used will be written to this location prior to submitting the
    * message to the underlying transport. While it has a `volatile` qualifier,
    * this is a historical artifact and the argument passed to it should not be
    * `volatile`.
    *
    * If @connection is closed then the operation will fail with
    * %G_IO_ERROR_CLOSED. If @cancellable is canceled, the operation will fail
    * with %G_IO_ERROR_CANCELLED. If @message is not well-formed, the operation
    * fails with %G_IO_ERROR_INVALID_ARGUMENT.
    *
    * This is an asynchronous method. When the operation is finished, @callback
    * will be invoked in the [thread-default main
    * context][g-main-context-push-thread-default] of the thread you are calling
    * this method from. You can then call
    * g_dbus_connection_send_message_with_reply_finish() to get the result of
    * the operation. See g_dbus_connection_send_message_with_reply_sync() for
    * the synchronous version.
    *
    * Note that @message must be unlocked, unless @flags contain the
    * %G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL flag.
    *
    * See this [server][gdbus-server] and [client][gdbus-unix-fd-client] for an
    * example of how to use this low-level API to send and receive UNIX file
    * descriptors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method send_message_with_reply]: Method send_message_with_reply contains an OUT parameter, which is not supported yet"
  )
  private def sendMessageWithReply__ = ???

  /** Finishes an operation started with
    * g_dbus_connection_send_message_with_reply().
    *
    * Note that @error is only set if a local in-process error occurred. That is
    * to say that the returned #GDBusMessage object may be of type
    * %G_DBUS_MESSAGE_TYPE_ERROR. Use g_dbus_message_to_gerror() to transcode
    * this to a #GError.
    *
    * See this [server][gdbus-server] and [client][gdbus-unix-fd-client] for an
    * example of how to use this low-level API to send and receive UNIX file
    * descriptors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sendMessageWithReplyFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.DBusMessage /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.DBusMessage.applyUnsafe(
        g_dbus_connection_send_message_with_reply_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end sendMessageWithReplyFinish

  /** Synchronously sends @message to the peer represented by @connection and
    * blocks the calling thread until a reply is received or the timeout is
    * reached. See g_dbus_connection_send_message_with_reply() for the
    * asynchronous version of this method.
    *
    * Unless @flags contain the %G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL flag,
    * the serial number will be assigned by @connection and set on @message via
    * g_dbus_message_set_serial(). If @out_serial is not %NULL, then the serial
    * number used will be written to this location prior to submitting the
    * message to the underlying transport. While it has a `volatile` qualifier,
    * this is a historical artifact and the argument passed to it should not be
    * `volatile`.
    *
    * If @connection is closed then the operation will fail with
    * %G_IO_ERROR_CLOSED. If @cancellable is canceled, the operation will fail
    * with %G_IO_ERROR_CANCELLED. If @message is not well-formed, the operation
    * fails with %G_IO_ERROR_INVALID_ARGUMENT.
    *
    * Note that @error is only set if a local in-process error occurred. That is
    * to say that the returned #GDBusMessage object may be of type
    * %G_DBUS_MESSAGE_TYPE_ERROR. Use g_dbus_message_to_gerror() to transcode
    * this to a #GError.
    *
    * See this [server][gdbus-server] and [client][gdbus-unix-fd-client] for an
    * example of how to use this low-level API to send and receive UNIX file
    * descriptors.
    *
    * Note that @message must be unlocked, unless @flags contain the
    * %G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL flag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method send_message_with_reply_sync]: Method send_message_with_reply_sync contains an OUT parameter, which is not supported yet"
  )
  private def sendMessageWithReplySync__ = ???

  /** Sets whether the process should be terminated when @connection is closed
    * by the remote peer. See #GDBusConnection:exit-on-close for more details.
    *
    * Note that this function should be used with care. Most modern UNIX
    * desktops tie the notion of a user session with the session bus, and expect
    * all of a user's applications to quit when their bus connection goes away.
    * If you are setting @exit_on_close to %FALSE for the shared session bus
    * connection, you should make sure that your application exits when the user
    * session ends.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExitOnClose(
      exit_on_close: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_dbus_connection_set_exit_on_close(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
      gboolean(gint((if exit_on_close == true then 1 else 0)))
    )
  end setExitOnClose

  /** Subscribes to signals on @connection and invokes @callback whenever the
    * signal is received. Note that @callback will be invoked in the
    * [thread-default main context][g-main-context-push-thread-default] of the
    * thread you are calling this method from.
    *
    * If @connection is not a message bus connection, @sender must be %NULL.
    *
    * If @sender is a well-known name note that @callback is invoked with the
    * unique name for the owner of @sender, not the well-known name as one would
    * expect. This is because the message bus rewrites the name. As such, to
    * avoid certain race conditions, users should be tracking the name owner of
    * the well-known name and use that when processing the received signal.
    *
    * If one of %G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE or
    * %G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH are given, @arg0 is interpreted as
    * part of a namespace or path. The first argument of a signal is matched
    * against that part as specified by D-Bus.
    *
    * If @user_data_free_func is non-%NULL, it will be called (in the
    * thread-default main context of the thread you are calling this method
    * from) at some point after @user_data is no longer needed. (It is not
    * guaranteed to be called synchronously when the signal is unsubscribed
    * from, and may be called after @connection has been destroyed.)
    *
    * As @callback is potentially invoked in a different thread from where it’s
    * emitted, it’s possible for this to happen after
    * g_dbus_connection_signal_unsubscribe() has been called in another thread.
    * Due to this, @user_data should have a strong reference which is freed with
    * @user_data_free_func,
    *   rather than pointing to data whose lifecycle is tied to the signal
    *   subscription. For example, if a #GObject is used to store the
    *   subscription ID from g_dbus_connection_signal_subscribe(), a strong
    *   reference to that #GObject must be passed to @user_data, and
    *   g_object_unref() passed to
    * @user_data_free_func.
    *   You are responsible for breaking the resulting reference count cycle by
    *   explicitly unsubscribing from the signal when dropping the last external
    *   reference to the #GObject. Alternatively, a weak reference may be used.
    *
    * It is guaranteed that if you unsubscribe from a signal using
    * g_dbus_connection_signal_unsubscribe() from the same thread which made the
    * corresponding g_dbus_connection_signal_subscribe() call, @callback will
    * not be invoked after g_dbus_connection_signal_unsubscribe() returns.
    *
    * The returned subscription identifier is an opaque value which is
    * guaranteed to never be zero.
    *
    * This function can never fail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method signal_subscribe/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusSignalCallback), @type -> DataRecord(GDBusSignalCallback)))"
  )
  private def signalSubscribe__ = ???

  /** Unsubscribes from signals.
    *
    * Note that there may still be D-Bus traffic to process (relating to this
    * signal subscription) in the current thread-default #GMainContext after
    * this function has returned. You should continue to iterate the
    * #GMainContext until the #GDestroyNotify function passed to
    * g_dbus_connection_signal_subscribe() is called, in order to avoid memory
    * leaks through callbacks queued on the #GMainContext after it’s stopped
    * being iterated. Alternatively, any idle source with a priority lower than
    * %G_PRIORITY_DEFAULT that was scheduled after unsubscription, also
    * indicates that all resources of this subscription are released.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalUnsubscribe(
      subscription_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_dbus_connection_signal_unsubscribe(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
      guint(subscription_id)
    )
  end signalUnsubscribe

  /** If @connection was created with
    * %G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING, this method starts
    * processing messages. Does nothing on if @connection wasn't created with
    * this flag or if the method has already been called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startMessageProcessing(): Unit /* None */ =
    g_dbus_connection_start_message_processing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]]
    )
  end startMessageProcessing

  /** Reverses the effect of a previous call to
    * g_dbus_connection_export_action_group().
    *
    * It is an error to call this function with an ID that wasn't returned from
    * g_dbus_connection_export_action_group() or to call it with the same ID
    * more than once.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexportActionGroup(
      export_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_dbus_connection_unexport_action_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
      guint(export_id)
    )
  end unexportActionGroup

  /** Reverses the effect of a previous call to
    * g_dbus_connection_export_menu_model().
    *
    * It is an error to call this function with an ID that wasn't returned from
    * g_dbus_connection_export_menu_model() or to call it with the same ID more
    * than once.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexportMenuModel(
      export_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_dbus_connection_unexport_menu_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
      guint(export_id)
    )
  end unexportMenuModel

  /** Unregisters an object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unregisterObject(
      registration_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    g_dbus_connection_unregister_object(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
      guint(registration_id)
    ).value.!=(0)
  end unregisterObject

  /** Unregisters a subtree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unregisterSubtree(
      registration_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    g_dbus_connection_unregister_subtree(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusConnection]],
      guint(registration_id)
    ).value.!=(0)
  end unregisterSubtree

  /** Emitted when the connection is closed.
    *
    * The cause of this event can be
    *
    *   - If g_dbus_connection_close() is called. In this case
    * @remote_peer_vanished
    *   is set to %FALSE and @error is %NULL.
    *
    *   - If the remote peer closes the connection. In this case
    * @remote_peer_vanished
    *   is set to %TRUE and @error is set.
    *
    *   - If the remote peer sends invalid or malformed data. In this case @remote_peer_vanished
    *     is set to %FALSE and @error is set.
    *
    * Upon receiving this signal, you should give up your reference to
    * @connection.
    *   You are guaranteed that this signal is emitted only once.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal closed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Error)))"
  )
  private def onClosed = ???

end DBusConnection

object DBusConnection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusConnection])(using Runtime) =
    summon[Runtime].getOrCreate[DBusConnection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusConnection(ptr)
    )

  /** Finishes an operation started with g_dbus_connection_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def finish(res: AsyncResult /* Some(Ptr[GAsyncResult]) */ )(using
      Runtime
  ): GResult[DBusConnection] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_dbus_connection_new_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[DBusConnection](
          raw,
          r => DBusConnection.applyUnsafe(r.asInstanceOf)
        )

  end finish

  /** Finishes an operation started with g_dbus_connection_new_for_address().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forAddressFinish(res: AsyncResult /* Some(Ptr[GAsyncResult]) */ )(using
      Runtime
  ): GResult[DBusConnection] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_dbus_connection_new_for_address_finish(
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[DBusConnection](
          raw,
          r => DBusConnection.applyUnsafe(r.asInstanceOf)
        )

  end forAddressFinish

  /** Synchronously connects and sets up a D-Bus client connection for
    * exchanging D-Bus messages with an endpoint specified by @address which
    * must be in the [D-Bus address
    * format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
    *
    * This constructor can only be used to initiate client-side connections -
    * use g_dbus_connection_new_sync() if you need to act as the server. In
    * particular, @flags cannot contain the
    * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
    * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS or
    * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flags.
    *
    * This is a synchronous failable constructor. See
    * g_dbus_connection_new_for_address() for the asynchronous version.
    *
    * If @observer is not %NULL it may be used to control the authentication
    * process.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forAddressSync(
      address: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: DBusConnectionFlags /* Some(GDBusConnectionFlags) */,
      observer: Option[
        sn.gnome.gio.DBusAuthObserver /* Some(Ptr[GDBusAuthObserver]) */
      ],
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[DBusConnection] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_dbus_connection_new_for_address_sync(
        summon[Runtime].inZone(toCString(address)).asInstanceOf[Ptr[gchar]],
        flags.raw,
        observer
          .map[Ptr[GDBusAuthObserver]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[GDBusAuthObserver]]),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[DBusConnection](
          raw,
          r => DBusConnection.applyUnsafe(r.asInstanceOf)
        )

  end forAddressSync

  /** Synchronously sets up a D-Bus connection for exchanging D-Bus messages
    * with the end represented by @stream.
    *
    * If @stream is a #GSocketConnection, then the corresponding #GSocket will
    * be put into non-blocking mode.
    *
    * The D-Bus connection will interact with @stream from a worker thread. As a
    * result, the caller should not interact with @stream after this method has
    * been called, except by calling g_object_unref() on it.
    *
    * If @observer is not %NULL it may be used to control the authentication
    * process.
    *
    * This is a synchronous failable constructor. See g_dbus_connection_new()
    * for the asynchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sync(
      stream: sn.gnome.gio.IOStream /* Some(Ptr[GIOStream]) */,
      guid: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags: DBusConnectionFlags /* Some(GDBusConnectionFlags) */,
      observer: Option[
        sn.gnome.gio.DBusAuthObserver /* Some(Ptr[GDBusAuthObserver]) */
      ],
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[DBusConnection] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_dbus_connection_new_sync(
        stream.getUnsafeRawPointer().asInstanceOf,
        guid
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            summon[Runtime].inZone(toCString(o)).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        flags.raw,
        observer
          .map[Ptr[GDBusAuthObserver]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[GDBusAuthObserver]]),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[DBusConnection](
          raw,
          r => DBusConnection.applyUnsafe(r.asInstanceOf)
        )

  end sync

  /** Asynchronously sets up a D-Bus connection for exchanging D-Bus messages
    * with the end represented by @stream.
    *
    * If @stream is a #GSocketConnection, then the corresponding #GSocket will
    * be put into non-blocking mode.
    *
    * The D-Bus connection will interact with @stream from a worker thread. As a
    * result, the caller should not interact with @stream after this method has
    * been called, except by calling g_object_unref() on it.
    *
    * If @observer is not %NULL it may be used to control the authentication
    * process.
    *
    * When the operation is finished, @callback will be invoked. You can then
    * call g_dbus_connection_new_finish() to get the result of the operation.
    *
    * This is an asynchronous failable constructor. See
    * g_dbus_connection_new_sync() for the synchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function new/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def `new`() = ???

  /** Asynchronously connects and sets up a D-Bus client connection for
    * exchanging D-Bus messages with an endpoint specified by @address which
    * must be in the [D-Bus address
    * format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
    *
    * This constructor can only be used to initiate client-side connections -
    * use g_dbus_connection_new() if you need to act as the server. In
    * particular, @flags cannot contain the
    * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
    * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS or
    * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flags.
    *
    * When the operation is finished, @callback will be invoked. You can then
    * call g_dbus_connection_new_for_address_finish() to get the result of the
    * operation.
    *
    * If @observer is not %NULL it may be used to control the authentication
    * process.
    *
    * This is an asynchronous failable constructor. See
    * g_dbus_connection_new_for_address_sync() for the synchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function new_for_address/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def newForAddress() = ???

end DBusConnection
