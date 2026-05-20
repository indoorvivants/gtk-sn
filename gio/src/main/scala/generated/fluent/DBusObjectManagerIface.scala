package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectManagerIface
import sn.gnome.gobject.TypeInterface

/** Base type for D-Bus object managers.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectManagerIface private[gnome] (raw: Ptr[GDBusObjectManagerIface]):

  def getUnsafeRawPointer(): Ptr[GDBusObjectManagerIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).parent_iface
      .asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field get_object_path]: Field is missing <type>"
  )
  private def getObjectPath__ = ???
  @annotation.compileTimeOnly("[field get_objects]: Field is missing <type>")
  private def getObjects__ = ???
  @annotation.compileTimeOnly("[field get_object]: Field is missing <type>")
  private def getObject__ = ???
  @annotation.compileTimeOnly("[field get_interface]: Field is missing <type>")
  private def getInterface__ = ???
  @annotation.compileTimeOnly("[field object_added]: Field is missing <type>")
  private def objectAdded__ = ???
  @annotation.compileTimeOnly("[field object_removed]: Field is missing <type>")
  private def objectRemoved__ = ???
  @annotation.compileTimeOnly(
    "[field interface_added]: Field is missing <type>"
  )
  private def interfaceAdded__ = ???
  @annotation.compileTimeOnly(
    "[field interface_removed]: Field is missing <type>"
  )
  private def interfaceRemoved__ = ???
end DBusObjectManagerIface

object DBusObjectManagerIface:
  def fromRaw(ptr: Ptr[GDBusObjectManagerIface]): DBusObjectManagerIface =
    new DBusObjectManagerIface(ptr)
end DBusObjectManagerIface
