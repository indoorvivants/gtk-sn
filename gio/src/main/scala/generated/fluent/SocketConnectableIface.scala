package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketConnectableIface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for returning a #GSocketAddressEnumerator and
  * #GProxyAddressEnumerator
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketConnectableIface private[gnome] (raw: Ptr[GSocketConnectableIface]):

  def getUnsafeRawPointer(): Ptr[GSocketConnectableIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field enumerate]: Field is missing <type>")
  private def enumerate__ = ???
  @annotation.compileTimeOnly(
    "[field proxy_enumerate]: Field is missing <type>"
  )
  private def proxyEnumerate__ = ???
  @annotation.compileTimeOnly("[field to_string]: Field is missing <type>")
  private def toString__ = ???
end SocketConnectableIface

object SocketConnectableIface:
  def fromRaw(ptr: Ptr[GSocketConnectableIface]): SocketConnectableIface =
    new SocketConnectableIface(ptr)
end SocketConnectableIface
