package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsClientConnectionInterface
import sn.gnome.gobject.TypeInterface

/** vtable for a #GTlsClientConnection implementation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsClientConnectionInterface private[gnome] (
    raw: Ptr[GTlsClientConnectionInterface]
):

  def getUnsafeRawPointer(): Ptr[GTlsClientConnectionInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field copy_session_state]: Field is missing <type>"
  )
  private def copySessionState__ = ???
end TlsClientConnectionInterface

object TlsClientConnectionInterface:
  def fromRaw(
      ptr: Ptr[GTlsClientConnectionInterface]
  ): TlsClientConnectionInterface = new TlsClientConnectionInterface(ptr)
end TlsClientConnectionInterface
