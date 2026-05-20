package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusInterfaceIface
import sn.gnome.gobject.TypeInterface

/** Base type for D-Bus interfaces.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusInterfaceIface private[gnome] (raw: Ptr[GDBusInterfaceIface]):

  def getUnsafeRawPointer(): Ptr[GDBusInterfaceIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).parent_iface
      .asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field get_info]: Field is missing <type>")
  private def getInfo__ = ???
  @annotation.compileTimeOnly("[field get_object]: Field is missing <type>")
  private def getObject__ = ???
  @annotation.compileTimeOnly("[field set_object]: Field is missing <type>")
  private def setObject__ = ???
  @annotation.compileTimeOnly("[field dup_object]: Field is missing <type>")
  private def dupObject__ = ???
end DBusInterfaceIface

object DBusInterfaceIface:
  def fromRaw(ptr: Ptr[GDBusInterfaceIface]): DBusInterfaceIface =
    new DBusInterfaceIface(ptr)
end DBusInterfaceIface
