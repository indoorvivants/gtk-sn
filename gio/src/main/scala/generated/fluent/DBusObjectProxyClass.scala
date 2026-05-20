package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectProxyClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GDBusObjectProxy.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectProxyClass private[gnome] (raw: Ptr[GDBusObjectProxyClass]):

  def getUnsafeRawPointer(): Ptr[GDBusObjectProxyClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]

end DBusObjectProxyClass

object DBusObjectProxyClass:
  def fromRaw(ptr: Ptr[GDBusObjectProxyClass]): DBusObjectProxyClass =
    new DBusObjectProxyClass(ptr)
end DBusObjectProxyClass
