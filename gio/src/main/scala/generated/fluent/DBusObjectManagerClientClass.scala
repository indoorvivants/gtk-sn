package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectManagerClientClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GDBusObjectManagerClient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectManagerClientClass private[gnome] (
    raw: Ptr[GDBusObjectManagerClientClass]
):

  def getUnsafeRawPointer(): Ptr[GDBusObjectManagerClientClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly(
    "[field interface_proxy_signal]: Field is missing <type>"
  )
  private def interfaceProxySignal__ = ???
  @annotation.compileTimeOnly(
    "[field interface_proxy_properties_changed]: Field is missing <type>"
  )
  private def interfaceProxyPropertiesChanged__ = ???

end DBusObjectManagerClientClass

object DBusObjectManagerClientClass:
  def fromRaw(
      ptr: Ptr[GDBusObjectManagerClientClass]
  ): DBusObjectManagerClientClass = new DBusObjectManagerClientClass(ptr)
end DBusObjectManagerClientClass
