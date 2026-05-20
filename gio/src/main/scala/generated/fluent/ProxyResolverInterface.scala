package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GProxyResolverInterface
import sn.gnome.gobject.TypeInterface

/** The virtual function table for #GProxyResolver.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProxyResolverInterface private[gnome] (raw: Ptr[GProxyResolverInterface]):

  def getUnsafeRawPointer(): Ptr[GProxyResolverInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field is_supported]: Field is missing <type>")
  private def isSupported__ = ???
  @annotation.compileTimeOnly("[field lookup]: Field is missing <type>")
  private def lookup__ = ???
  @annotation.compileTimeOnly("[field lookup_async]: Field is missing <type>")
  private def lookupAsync__ = ???
  @annotation.compileTimeOnly("[field lookup_finish]: Field is missing <type>")
  private def lookupFinish__ = ???
end ProxyResolverInterface

object ProxyResolverInterface:
  def fromRaw(ptr: Ptr[GProxyResolverInterface]): ProxyResolverInterface =
    new ProxyResolverInterface(ptr)
end ProxyResolverInterface
