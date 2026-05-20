package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  DBusConnection,
  DBusInterface,
  DBusInterfaceInfo,
  DBusInterfaceSkeletonFlags,
  DBusInterfaceVTable,
  DBusMethodInvocation
}
import sn.gnome.gio.internal.{GDBusInterfaceSkeleton, GDBusMethodInvocation}
import sn.gnome.glib.{GResult, List, Variant}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** Abstract base class for D-Bus interfaces on the service side.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusInterfaceSkeleton private[gnome] (raw: Ptr[GDBusInterfaceSkeleton])
    extends Object(raw.asInstanceOf),
      DBusInterface:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Exports @interface_ at @object_path on @connection.
    *
    * This can be called multiple times to export the same @interface_ onto
    * multiple connections however the @object_path provided must be the same
    * for all connections.
    *
    * Use g_dbus_interface_skeleton_unexport() to unexport the object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `export`(
      connection: sn.gnome.gio.DBusConnection /* Some(Ptr[GDBusConnection]) */,
      object_path: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dbus_interface_skeleton_export(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
        connection.getUnsafeRawPointer().asInstanceOf,
        summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end `export`

  /** If @interface_ has outstanding changes, request for these changes to be
    * emitted immediately.
    *
    * For example, an exported D-Bus interface may queue up property changes and
    * emit the `org.freedesktop.DBus.Properties.PropertiesChanged` signal later
    * (e.g. in an idle handler). This technique is useful for collapsing
    * multiple property changes into one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flush(): Unit /* None */ =
    g_dbus_interface_skeleton_flush(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
    )
  end flush

  /** Gets the first connection that @interface_ is exported on, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection()(using Runtime): sn.gnome.gio.DBusConnection /* None */ =
    sn.gnome.gio.DBusConnection.applyUnsafe(
      g_dbus_interface_skeleton_get_connection(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      ).asInstanceOf
    )
  end getConnection

  /** Gets a list of the connections that @interface_ is exported on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnections(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_dbus_interface_skeleton_get_connections(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      )
    )
  end getConnections

  /** Gets the #GDBusInterfaceSkeletonFlags that describes what the behavior of @interface_
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): sn.gnome.gio.DBusInterfaceSkeletonFlags /* None */ =
    sn.gnome.gio.DBusInterfaceSkeletonFlags.fromRaw(
      g_dbus_interface_skeleton_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      )
    )
  end getFlags

  /** Gets D-Bus introspection information for the D-Bus interface implemented
    * by @interface_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getInfo(): sn.gnome.gio.DBusInterfaceInfo /* None */ =
    sn.gnome.gio.DBusInterfaceInfo.fromRaw(
      g_dbus_interface_skeleton_get_info(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      )
    )
  end getInfo

  /** Gets the object path that @interface_ is exported on, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath(): scala.Predef.String /* None */ =
    fromCString(
      g_dbus_interface_skeleton_get_object_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      ).asInstanceOf
    )
  end getObjectPath

  /** Gets all D-Bus properties for @interface_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProperties(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_dbus_interface_skeleton_get_properties(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      )
    )
  end getProperties

  /** Gets the interface vtable for the D-Bus interface implemented by
    * @interface_.
    *   The returned function pointers should expect @interface_ itself to be
    *   passed as @user_data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVtable(): sn.gnome.gio.DBusInterfaceVTable /* None */ =
    sn.gnome.gio.DBusInterfaceVTable.fromRaw(
      g_dbus_interface_skeleton_get_vtable(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      )
    )
  end getVtable

  /** Checks if @interface_ is exported on @connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasConnection(
      connection: sn.gnome.gio.DBusConnection /* Some(Ptr[GDBusConnection]) */
  )(using Runtime): Boolean /* None */ =
    g_dbus_interface_skeleton_has_connection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
      connection.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end hasConnection

  /** Sets flags describing what the behavior of @skeleton should be.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: sn.gnome.gio.DBusInterfaceSkeletonFlags /* Some(GDBusInterfaceSkeletonFlags) */
  ): Unit /* None */ =
    g_dbus_interface_skeleton_set_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
      flags.raw
    )
  end setFlags

  /** Stops exporting @interface_ on all connections it is exported on.
    *
    * To unexport @interface_ from only a single connection, use
    * g_dbus_interface_skeleton_unexport_from_connection()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexport(): Unit /* None */ =
    g_dbus_interface_skeleton_unexport(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
    )
  end unexport

  /** Stops exporting @interface_ on @connection.
    *
    * To stop exporting on all connections the interface is exported on, use
    * g_dbus_interface_skeleton_unexport().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexportFromConnection(
      connection: sn.gnome.gio.DBusConnection /* Some(Ptr[GDBusConnection]) */
  )(using Runtime): Unit /* None */ =
    g_dbus_interface_skeleton_unexport_from_connection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
      connection.getUnsafeRawPointer().asInstanceOf
    )
  end unexportFromConnection

  /** Emitted when a method is invoked by a remote caller and used to determine
    * if the method call is authorized.
    *
    * Note that this signal is emitted in a thread dedicated to handling the
    * method call so handlers are allowed to perform blocking IO. This means
    * that it is appropriate to call e.g.
    * [polkit_authority_check_authorization_sync()](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#polkit-authority-check-authorization-sync)
    * with the
    * [POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#POLKIT-CHECK-AUTHORIZATION-FLAGS-ALLOW-USER-INTERACTION:CAPS)
    * flag set.
    *
    * If %FALSE is returned then no further handlers are run and the signal
    * handler must take a reference to @invocation and finish handling the call
    * (e.g. return an error via g_dbus_method_invocation_return_error()).
    *
    * Otherwise, if %TRUE is returned, signal emission continues. If no handlers
    * return %FALSE, then the method is dispatched. If
    * @interface
    *   has an enclosing #GDBusObjectSkeleton, then the
    *   #GDBusObjectSkeleton::authorize-method signal handlers run before the
    *   handlers for this signal.
    *
    * The default class handler just returns %TRUE.
    *
    * Please note that the common case is optimized: if no signals handlers are
    * connected and the default class handler isn't overridden (for both @interface
    * and the enclosing #GDBusObjectSkeleton, if any) and
    * #GDBusInterfaceSkeleton:g-flags does not have the
    * %G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD flags
    * set, no dedicated thread is ever used and the call will be handled in the
    * same thread as the object that @interface belongs to was exported in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onGAuthorizeMethod(
      handler: ((invocation: DBusMethodInvocation)) => Boolean
  )(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (invocation: DBusMethodInvocation), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GDBusInterfaceSkeleton],
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
    val signal = c"g-authorize-method"
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
  end onGAuthorizeMethod
end DBusInterfaceSkeleton

object DBusInterfaceSkeleton:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusInterfaceSkeleton])(using Runtime) =
    summon[Runtime].getOrCreate[DBusInterfaceSkeleton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusInterfaceSkeleton(ptr)
    )

end DBusInterfaceSkeleton
