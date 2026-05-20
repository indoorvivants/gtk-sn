package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.InetSocketAddressClass
import sn.gnome.gio.internal.GProxyAddressClass

/** Class structure for #GProxyAddress.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProxyAddressClass private[gnome] (raw: Ptr[GProxyAddressClass]):

  def getUnsafeRawPointer(): Ptr[GProxyAddressClass] = this.raw

  def parentClass: sn.gnome.gio.InetSocketAddressClass /* None */ =
    (!raw).parent_class.asInstanceOf[GInetSocketAddressClass]
end ProxyAddressClass

object ProxyAddressClass:
  def fromRaw(ptr: Ptr[GProxyAddressClass]): ProxyAddressClass =
    new ProxyAddressClass(ptr)
end ProxyAddressClass
