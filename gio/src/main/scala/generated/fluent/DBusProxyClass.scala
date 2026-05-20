package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusProxyClass

/** Class structure for #GDBusProxy.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusProxyClass private[gnome] (raw: Ptr[GDBusProxyClass]):

  def getUnsafeRawPointer(): Ptr[GDBusProxyClass] = this.raw

  @annotation.compileTimeOnly(
    "[field g_properties_changed]: Field is missing <type>"
  )
  private def gPropertiesChanged__ = ???
  @annotation.compileTimeOnly("[field g_signal]: Field is missing <type>")
  private def gSignal__ = ???

end DBusProxyClass

object DBusProxyClass:
  def fromRaw(ptr: Ptr[GDBusProxyClass]): DBusProxyClass = new DBusProxyClass(
    ptr
  )
end DBusProxyClass
