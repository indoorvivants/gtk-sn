package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketAddressEnumerator
import sn.gnome.gio.internal.GProxyAddressEnumerator

class ProxyAddressEnumerator(raw: Ptr[GProxyAddressEnumerator])
    extends SocketAddressEnumerator(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ProxyAddressEnumerator
