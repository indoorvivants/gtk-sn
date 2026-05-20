package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GProxyInterface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for handling proxy connection and payload.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProxyInterface private[gnome] (raw: Ptr[GProxyInterface]):

  def getUnsafeRawPointer(): Ptr[GProxyInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field connect]: Field is missing <type>")
  private def connect__ = ???
  @annotation.compileTimeOnly("[field connect_async]: Field is missing <type>")
  private def connectAsync__ = ???
  @annotation.compileTimeOnly("[field connect_finish]: Field is missing <type>")
  private def connectFinish__ = ???
  @annotation.compileTimeOnly(
    "[field supports_hostname]: Field is missing <type>"
  )
  private def supportsHostname__ = ???
end ProxyInterface

object ProxyInterface:
  def fromRaw(ptr: Ptr[GProxyInterface]): ProxyInterface = new ProxyInterface(
    ptr
  )
end ProxyInterface
