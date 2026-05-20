package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDtlsClientConnectionInterface
import sn.gnome.gobject.TypeInterface

/** vtable for a #GDtlsClientConnection implementation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DtlsClientConnectionInterface private[gnome] (
    raw: Ptr[GDtlsClientConnectionInterface]
):

  def getUnsafeRawPointer(): Ptr[GDtlsClientConnectionInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
end DtlsClientConnectionInterface

object DtlsClientConnectionInterface:
  def fromRaw(
      ptr: Ptr[GDtlsClientConnectionInterface]
  ): DtlsClientConnectionInterface = new DtlsClientConnectionInterface(ptr)
end DtlsClientConnectionInterface
