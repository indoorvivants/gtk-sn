package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsServerConnectionInterface
import sn.gnome.gobject.TypeInterface

/** vtable for a #GTlsServerConnection implementation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsServerConnectionInterface private[gnome] (
    raw: Ptr[GTlsServerConnectionInterface]
):

  def getUnsafeRawPointer(): Ptr[GTlsServerConnectionInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
end TlsServerConnectionInterface

object TlsServerConnectionInterface:
  def fromRaw(
      ptr: Ptr[GTlsServerConnectionInterface]
  ): TlsServerConnectionInterface = new TlsServerConnectionInterface(ptr)
end TlsServerConnectionInterface
