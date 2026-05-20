package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectManagerServerClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GDBusObjectManagerServer.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectManagerServerClass private[gnome] (
    raw: Ptr[GDBusObjectManagerServerClass]
):

  def getUnsafeRawPointer(): Ptr[GDBusObjectManagerServerClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]

end DBusObjectManagerServerClass

object DBusObjectManagerServerClass:
  def fromRaw(
      ptr: Ptr[GDBusObjectManagerServerClass]
  ): DBusObjectManagerServerClass = new DBusObjectManagerServerClass(ptr)
end DBusObjectManagerServerClass
