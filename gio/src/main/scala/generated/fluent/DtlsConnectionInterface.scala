package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDtlsConnectionInterface
import sn.gnome.gobject.TypeInterface

/** Virtual method table for a #GDtlsConnection implementation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DtlsConnectionInterface private[gnome] (
    raw: Ptr[GDtlsConnectionInterface]
):

  def getUnsafeRawPointer(): Ptr[GDtlsConnectionInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field accept_certificate]: Field is missing <type>"
  )
  private def acceptCertificate__ = ???
  @annotation.compileTimeOnly("[field handshake]: Field is missing <type>")
  private def handshake__ = ???
  @annotation.compileTimeOnly(
    "[field handshake_async]: Field is missing <type>"
  )
  private def handshakeAsync__ = ???
  @annotation.compileTimeOnly(
    "[field handshake_finish]: Field is missing <type>"
  )
  private def handshakeFinish__ = ???
  @annotation.compileTimeOnly("[field shutdown]: Field is missing <type>")
  private def shutdown__ = ???
  @annotation.compileTimeOnly("[field shutdown_async]: Field is missing <type>")
  private def shutdownAsync__ = ???
  @annotation.compileTimeOnly(
    "[field shutdown_finish]: Field is missing <type>"
  )
  private def shutdownFinish__ = ???
  @annotation.compileTimeOnly(
    "[field set_advertised_protocols]: Field is missing <type>"
  )
  private def setAdvertisedProtocols__ = ???
  @annotation.compileTimeOnly(
    "[field get_negotiated_protocol]: Field is missing <type>"
  )
  private def getNegotiatedProtocol__ = ???
  @annotation.compileTimeOnly(
    "[field get_binding_data]: Field is missing <type>"
  )
  private def getBindingData__ = ???
end DtlsConnectionInterface

object DtlsConnectionInterface:
  def fromRaw(ptr: Ptr[GDtlsConnectionInterface]): DtlsConnectionInterface =
    new DtlsConnectionInterface(ptr)
end DtlsConnectionInterface
