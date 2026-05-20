package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GProxyAddressEnumeratorClass

/** Class structure for #GProxyAddressEnumerator.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProxyAddressEnumeratorClass private[gnome] (
    raw: Ptr[GProxyAddressEnumeratorClass]
):

  def getUnsafeRawPointer(): Ptr[GProxyAddressEnumeratorClass] = this.raw

  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
  @annotation.compileTimeOnly("[field _g_reserved5]: Field is missing <type>")
  private def GReserved5__ = ???
  @annotation.compileTimeOnly("[field _g_reserved6]: Field is missing <type>")
  private def GReserved6__ = ???
  @annotation.compileTimeOnly("[field _g_reserved7]: Field is missing <type>")
  private def GReserved7__ = ???
end ProxyAddressEnumeratorClass

object ProxyAddressEnumeratorClass:
  def fromRaw(
      ptr: Ptr[GProxyAddressEnumeratorClass]
  ): ProxyAddressEnumeratorClass = new ProxyAddressEnumeratorClass(ptr)
end ProxyAddressEnumeratorClass
