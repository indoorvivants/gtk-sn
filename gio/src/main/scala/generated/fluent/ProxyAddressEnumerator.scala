package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketAddressEnumerator
import sn.gnome.gio.internal.GProxyAddressEnumerator

/** #GProxyAddressEnumerator is a wrapper around #GSocketAddressEnumerator which
  * takes the #GSocketAddress instances returned by the
  * #GSocketAddressEnumerator and wraps them in #GProxyAddress instances, using
  * the given #GProxyAddressEnumerator:proxy-resolver.
  *
  * This enumerator will be returned (for example, by
  * g_socket_connectable_enumerate()) as appropriate when a proxy is configured;
  * there should be no need to manually wrap a #GSocketAddressEnumerator
  * instance with one.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProxyAddressEnumerator(raw: Ptr[GProxyAddressEnumerator])
    extends SocketAddressEnumerator(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ProxyAddressEnumerator
