package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectIface
import sn.gnome.gobject.TypeInterface

/** Base object type for D-Bus objects.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectIface private[gnome] (raw: Ptr[GDBusObjectIface]):

  def getUnsafeRawPointer(): Ptr[GDBusObjectIface] = this.raw

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
  @annotation.compileTimeOnly("[field get_interfaces]: Field is missing <type>")
  private def getInterfaces__ = ???
  @annotation.compileTimeOnly("[field get_interface]: Field is missing <type>")
  private def getInterface__ = ???
  @annotation.compileTimeOnly(
    "[field interface_added]: Field is missing <type>"
  )
  private def interfaceAdded__ = ???
  @annotation.compileTimeOnly(
    "[field interface_removed]: Field is missing <type>"
  )
  private def interfaceRemoved__ = ???
end DBusObjectIface

object DBusObjectIface:
  def fromRaw(ptr: Ptr[GDBusObjectIface]): DBusObjectIface =
    new DBusObjectIface(ptr)
end DBusObjectIface
