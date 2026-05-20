package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsFileDatabaseInterface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for #GTlsFileDatabase implementations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsFileDatabaseInterface private[gnome] (
    raw: Ptr[GTlsFileDatabaseInterface]
):

  def getUnsafeRawPointer(): Ptr[GTlsFileDatabaseInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]

end TlsFileDatabaseInterface

object TlsFileDatabaseInterface:
  def fromRaw(ptr: Ptr[GTlsFileDatabaseInterface]): TlsFileDatabaseInterface =
    new TlsFileDatabaseInterface(ptr)
end TlsFileDatabaseInterface
