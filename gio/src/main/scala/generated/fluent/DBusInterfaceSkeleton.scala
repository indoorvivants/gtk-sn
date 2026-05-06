package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  DBusConnection,
  DBusInterface,
  DBusInterfaceSkeletonFlags,
  DBusMethodInvocation
}
import sn.gnome.gio.internal.{GDBusInterfaceSkeleton, GDBusMethodInvocation}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*

/** Abstract base class for D-Bus interfaces on the service side.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusInterfaceSkeleton(raw: Ptr[GDBusInterfaceSkeleton])
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
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */,
      object_path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_dbus_interface_skeleton_export(
      this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
      connection.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(object_path).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

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
  def flush(): Unit /* None */ = g_dbus_interface_skeleton_flush(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
  )

  /** Gets the first connection that @interface_ is exported on, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection(): DBusConnection /* None */ = new DBusConnection(
    g_dbus_interface_skeleton_get_connection(
      this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
    ).asInstanceOf
  )

  /** Gets a list of the connections that @interface_ is exported on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_connections/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusConnection))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getConnections__ = ???

  /** Gets the #GDBusInterfaceSkeletonFlags that describes what the behavior of @interface_
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): DBusInterfaceSkeletonFlags /* None */ =
    DBusInterfaceSkeletonFlags.fromRaw(
      g_dbus_interface_skeleton_get_flags(
        this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
      )
    )

  /** Gets D-Bus introspection information for the D-Bus interface implemented
    * by @interface_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_info/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))"
  )
  private def getInfo__ = ???

  /** Gets the object path that @interface_ is exported on, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath()(using Zone): String /* None */ = fromCString(
    g_dbus_interface_skeleton_get_object_path(
      this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
    ).asInstanceOf
  )

  /** Gets all D-Bus properties for @interface_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_properties/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getProperties__ = ???

  /** Gets the interface vtable for the D-Bus interface implemented by
    * @interface_.
    *   The returned function pointers should expect @interface_ itself to be
    *   passed as @user_data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_vtable/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusInterfaceVTable), @type -> DataRecord(GDBusInterfaceVTable*)))"
  )
  private def getVtable__ = ???

  /** Checks if @interface_ is exported on @connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasConnection(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */
  ): Boolean /* None */ = g_dbus_interface_skeleton_has_connection(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
    connection.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Sets flags describing what the behavior of @skeleton should be.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: DBusInterfaceSkeletonFlags /* Some(GDBusInterfaceSkeletonFlags) */
  ): Unit /* None */ = g_dbus_interface_skeleton_set_flags(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
    flags.raw
  )

  /** Stops exporting @interface_ on all connections it is exported on.
    *
    * To unexport @interface_ from only a single connection, use
    * g_dbus_interface_skeleton_unexport_from_connection()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexport(): Unit /* None */ = g_dbus_interface_skeleton_unexport(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]]
  )

  /** Stops exporting @interface_ on @connection.
    *
    * To stop exporting on all connections the interface is exported on, use
    * g_dbus_interface_skeleton_unexport().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexportFromConnection(
      connection: DBusConnection /* Some(Ptr[GDBusConnection]) */
  ): Unit /* None */ = g_dbus_interface_skeleton_unexport_from_connection(
    this.raw.asInstanceOf[Ptr[GDBusInterfaceSkeleton]],
    connection.getUnsafeRawPointer().asInstanceOf
  )

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

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusInterfaceSkeleton
