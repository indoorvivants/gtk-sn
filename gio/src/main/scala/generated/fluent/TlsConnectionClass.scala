package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.IOStreamClass
import sn.gnome.gio.internal.GTlsConnectionClass

/** The class structure for the #GTlsConnection type.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsConnectionClass private[gnome] (raw: Ptr[GTlsConnectionClass]):

  def getUnsafeRawPointer(): Ptr[GTlsConnectionClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gio.IOStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GIOStreamClass]
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
  @annotation.compileTimeOnly(
    "[field get_binding_data]: Field is missing <type>"
  )
  private def getBindingData__ = ???
  @annotation.compileTimeOnly(
    "[field get_negotiated_protocol]: Field is missing <type>"
  )
  private def getNegotiatedProtocol__ = ???

end TlsConnectionClass

object TlsConnectionClass:
  def fromRaw(ptr: Ptr[GTlsConnectionClass]): TlsConnectionClass =
    new TlsConnectionClass(ptr)
end TlsConnectionClass
