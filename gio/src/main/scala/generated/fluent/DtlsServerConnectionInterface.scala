package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDtlsServerConnectionInterface
import sn.gnome.gobject.TypeInterface

/** vtable for a #GDtlsServerConnection implementation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DtlsServerConnectionInterface private[gnome] (
    raw: Ptr[GDtlsServerConnectionInterface]
):

  def getUnsafeRawPointer(): Ptr[GDtlsServerConnectionInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
end DtlsServerConnectionInterface

object DtlsServerConnectionInterface:
  def fromRaw(
      ptr: Ptr[GDtlsServerConnectionInterface]
  ): DtlsServerConnectionInterface = new DtlsServerConnectionInterface(ptr)
end DtlsServerConnectionInterface
