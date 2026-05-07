package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  Cancellable,
  DBusConnection,
  DBusMethodInvocation,
  DebugController,
  Initable
}
import sn.gnome.gio.internal.{GDBusMethodInvocation, GDebugControllerDBus}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/**  #GDebugControllerDBus is an implementation of #GDebugController which exposes
  *  debug settings as a D-Bus object.
  *
  *  It is a #GInitable object, and will register an object at
  *  `/org/gtk/Debugging` on the bus given as
  *  #GDebugControllerDBus:connection once it’s initialized. The object will be
  *  unregistered when the last reference to the #GDebugControllerDBus is dropped.
  *
  *  This D-Bus object can be used by remote processes to enable or disable debug
  *  output in this process. Remote processes calling
  *  `org.gtk.Debugging.SetDebugEnabled()` will affect the value of
  *  #GDebugController:debug-enabled and, by default, g_log_get_debug_enabled().
  *  default.
  *
  *  By default, no processes are allowed to call `SetDebugEnabled()` unless a
  *  #GDebugControllerDBus::authorize signal handler is installed. This is because
  *  the process may be privileged, or might expose sensitive information in its
  *  debug output. You may want to restrict the ability to enable debug output to
  *  privileged users or processes.
  *
  *  One option is to install a D-Bus security policy which restricts access to
  *  `SetDebugEnabled()`, installing something like the following in
  *  `$datadir/dbus-1/system.d/`:
  *  |[<!-- language="XML" -->
  *  <?xml version="1.0"?> <!--*-nxml-*-->
  *  <!DOCTYPE busconfig PUBLIC "-//freedesktop//DTD D-BUS Bus Configuration 1.0//EN"
  *       "http://www.freedesktop.org/standards/dbus/1.0/busconfig.dtd">
  *  <busconfig>
  *    <policy user="root">
  *      <allow send_destination="com.example.MyService" send_interface="org.gtk.Debugging"/>
  *    </policy>
  *    <policy context="default">
  *      <deny send_destination="com.example.MyService" send_interface="org.gtk.Debugging"/>
  *    </policy>
  *  </busconfig>
  *  ]|
  *
  *  This will prevent the `SetDebugEnabled()` method from being called by all
  *  except root. It will not prevent the `DebugEnabled` property from being read,
  *  as it’s accessed through the `org.freedesktop.DBus.Properties` interface.
  *
  *  Another option is to use polkit to allow or deny requests on a case-by-case
  *  basis, allowing for the possibility of dynamic authorisation. To do this,
  *  connect to the #GDebugControllerDBus::authorize signal and query polkit in
  *  it:
  *  |[<!-- language="C" -->
  *    g_autoptr(GError) child_error = NULL;
  *    g_autoptr(GDBusConnection) connection = g_bus_get_sync (G_BUS_TYPE_SYSTEM, NULL, NULL);
  *    gulong debug_controller_authorize_id = 0;
  *
  *    // Set up the debug controller.
  *    debug_controller = G_DEBUG_CONTROLLER (g_debug_controller_dbus_new (priv->connection, NULL, &child_error));
  *    if (debug_controller == NULL)
  *      {
  *        g_error ("Could not register debug controller on bus: %s"),
  *                 child_error->message);
  *      }
  *
  *    debug_controller_authorize_id = g_signal_connect (debug_controller,
  *                                                      "authorize",
  *                                                      G_CALLBACK (debug_controller_authorize_cb),
  *                                                      self);
  *
  *    static gboolean
  *    debug_controller_authorize_cb (GDebugControllerDBus  *debug_controller,
  *                                   GDBusMethodInvocation *invocation,
  *                                   gpointer               user_data)
  *    {
  *      g_autoptr(PolkitAuthority) authority = NULL;
  *      g_autoptr(PolkitSubject) subject = NULL;
  *      g_autoptr(PolkitAuthorizationResult) auth_result = NULL;
  *      g_autoptr(GError) local_error = NULL;
  *      GDBusMessage *message;
  *      GDBusMessageFlags message_flags;
  *      PolkitCheckAuthorizationFlags flags = POLKIT_CHECK_AUTHORIZATION_FLAGS_NONE;
  *
  *      message = g_dbus_method_invocation_get_message (invocation);
  *      message_flags = g_dbus_message_get_flags (message);
  *
  *      authority = polkit_authority_get_sync (NULL, &local_error);
  *      if (authority == NULL)
  *        {
  *          g_warning ("Failed to get polkit authority: %s", local_error->message);
  *          return FALSE;
  *        }
  *
  *      if (message_flags & G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION)
  *        flags |= POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION;
  *
  *      subject = polkit_system_bus_name_new (g_dbus_method_invocation_get_sender (invocation));
  *
  *      auth_result = polkit_authority_check_authorization_sync (authority,
  *                                                               subject,
  *                                                               "com.example.MyService.set-debug-enabled",
  *                                                               NULL,
  *                                                               flags,
  *                                                               NULL,
  *                                                               &local_error);
  *      if (auth_result == NULL)
  *        {
  *          g_warning ("Failed to get check polkit authorization: %s", local_error->message);
  *          return FALSE;
  *        }
  *
  *      return polkit_authorization_result_get_is_authorized (auth_result);
  *    }
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class DebugControllerDBus(raw: Ptr[GDebugControllerDBus])
    extends Object(raw.asInstanceOf),
      DebugController,
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Stop the debug controller, unregistering its object from the bus.
    *
    * Any pending method calls to the object will complete successfully, but new
    * ones will return an error. This method will block until all pending
    * #GDebugControllerDBus::authorize signals have been handled. This is
    * expected to not take long, as it will just be waiting for threads to join.
    * If any #GDebugControllerDBus::authorize signal handlers are still
    * executing in other threads, this will block until after they have
    * returned.
    *
    * This method will be called automatically when the final reference to the
    * #GDebugControllerDBus is dropped. You may want to call it explicitly to
    * know when the controller has been fully removed from the bus, or to break
    * reference count cycles.
    *
    * Calling this method from within a #GDebugControllerDBus::authorize signal
    * handler will cause a deadlock and must not be done.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stop(): Unit /* None */ = g_debug_controller_dbus_stop(
    this.raw.asInstanceOf[Ptr[GDebugControllerDBus]]
  )

  /** Emitted when a D-Bus peer is trying to change the debug settings and used
    * to determine if that is authorized.
    *
    * This signal is emitted in a dedicated worker thread, so handlers are
    * allowed to perform blocking I/O. This means that, for example, it is
    * appropriate to call `polkit_authority_check_authorization_sync()` to check
    * authorization using polkit.
    *
    * If %FALSE is returned then no further handlers are run and the request to
    * change the debug settings is rejected.
    *
    * Otherwise, if %TRUE is returned, signal emission continues. If no handlers
    * return %FALSE, then the debug settings are allowed to be changed.
    *
    * Signal handlers must not modify @invocation, or cause it to return a
    * value.
    *
    * The default class handler just returns %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAuthorize(handler: ((invocation: DBusMethodInvocation)) => Boolean)(
      using Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (invocation: DBusMethodInvocation), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GDebugControllerDBus],
          invocation: Ptr[GDBusMethodInvocation] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (invocation =
            sr.runtime.get[DBusMethodInvocation](
              invocation.asInstanceOf[Ptr[Byte]]
            )
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"authorize"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAuthorize
end DebugControllerDBus

object DebugControllerDBus:
  /** Create a new #GDebugControllerDBus and synchronously initialize it.
    *
    * Initializing the object will export the debug object on @connection. The
    * object will remain registered until the last reference to the
    * #GDebugControllerDBus is dropped.
    *
    * Initialization may fail if registering the object on @connection fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[DebugControllerDBus] = GResult.wrap(__errorPtr =>
    new DebugControllerDBus(
      g_debug_controller_dbus_new(
        connection.getUnsafeRawPointer().asInstanceOf,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf
    )
  )
end DebugControllerDBus
