package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{DBusInterfaceSkeleton, DBusMethodInvocation, DBusObject}
import sn.gnome.gio.internal.{
  GDBusInterfaceSkeleton,
  GDBusMethodInvocation,
  GDBusObjectSkeleton
}
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A #GDBusObjectSkeleton instance is essentially a group of D-Bus interfaces.
  * The set of exported interfaces on the object may be dynamic and change at
  * runtime.
  *
  * This type is intended to be used with #GDBusObjectManager.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectSkeleton private[gnome] (raw: Ptr[GDBusObjectSkeleton])
    extends Object(raw.asInstanceOf),
      DBusObject:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds @interface_ to @object.
    *
    * If @object already contains a #GDBusInterfaceSkeleton with the same
    * interface name, it is removed before @interface_ is added.
    *
    * Note that @object takes its own reference on @interface_ and holds it
    * until removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addInterface(
      `interface_`: sn.gnome.gio.DBusInterfaceSkeleton /* Some(Ptr[GDBusInterfaceSkeleton]) */
  )(using Runtime): Unit /* None */ =
    g_dbus_object_skeleton_add_interface(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectSkeleton]],
      `interface_`.getUnsafeRawPointer().asInstanceOf
    )
  end addInterface

  /** This method simply calls g_dbus_interface_skeleton_flush() on all
    * interfaces belonging to @object. See that method for when flushing is
    * useful.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flush(): Unit /* None */ =
    g_dbus_object_skeleton_flush(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectSkeleton]]
    )
  end flush

  /** Removes @interface_ from @object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeInterface(
      `interface_`: sn.gnome.gio.DBusInterfaceSkeleton /* Some(Ptr[GDBusInterfaceSkeleton]) */
  )(using Runtime): Unit /* None */ =
    g_dbus_object_skeleton_remove_interface(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectSkeleton]],
      `interface_`.getUnsafeRawPointer().asInstanceOf
    )
  end removeInterface

  /** Removes the #GDBusInterface with @interface_name from @object.
    *
    * If no D-Bus interface of the given interface exists, this function does
    * nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeInterfaceByName(
      interface_name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): Unit /* None */ =
    g_dbus_object_skeleton_remove_interface_by_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectSkeleton]],
      summon[Runtime].inZone(toCString(interface_name)).asInstanceOf[Ptr[gchar]]
    )
  end removeInterfaceByName

  /** Sets the object path for @object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setObjectPath(
      object_path: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): Unit /* None */ =
    g_dbus_object_skeleton_set_object_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusObjectSkeleton]],
      summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]]
    )
  end setObjectPath

  /** Emitted when a method is invoked by a remote caller and used to determine
    * if the method call is authorized.
    *
    * This signal is like #GDBusInterfaceSkeleton's
    * #GDBusInterfaceSkeleton::g-authorize-method signal, except that it is for
    * the enclosing object.
    *
    * The default class handler just returns %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAuthorizeMethod(
      handler: (
          (interface: DBusInterfaceSkeleton, invocation: DBusMethodInvocation)
      ) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (interface: DBusInterfaceSkeleton, invocation: DBusMethodInvocation),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GDBusObjectSkeleton],
          interface: Ptr[GDBusInterfaceSkeleton] /* param */,
          invocation: Ptr[GDBusMethodInvocation] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            interface = sr.runtime
              .get[DBusInterfaceSkeleton](interface.asInstanceOf[Ptr[Byte]]),
            invocation = sr.runtime.get[DBusMethodInvocation](
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
    val signal = c"authorize-method"
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
  end onAuthorizeMethod
end DBusObjectSkeleton

object DBusObjectSkeleton:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusObjectSkeleton])(using Runtime) =
    summon[Runtime].getOrCreate[DBusObjectSkeleton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusObjectSkeleton(ptr)
    )

  /** Creates a new #GDBusObjectSkeleton.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      object_path: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): DBusObjectSkeleton =
    val raw: Ptr[Byte] = g_dbus_object_skeleton_new(
      summon[Runtime].inZone(toCString(object_path)).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[DBusObjectSkeleton](
      raw,
      r => DBusObjectSkeleton.applyUnsafe(r.asInstanceOf)
    )
  end apply
end DBusObjectSkeleton
