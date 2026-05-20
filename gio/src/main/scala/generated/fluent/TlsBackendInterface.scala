package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsBackendInterface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for describing TLS-related types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsBackendInterface private[gnome] (raw: Ptr[GTlsBackendInterface]):

  def getUnsafeRawPointer(): Ptr[GTlsBackendInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field supports_tls]: Field is missing <type>")
  private def supportsTls__ = ???
  @annotation.compileTimeOnly(
    "[field get_certificate_type]: Field is missing <type>"
  )
  private def getCertificateType__ = ???
  @annotation.compileTimeOnly(
    "[field get_client_connection_type]: Field is missing <type>"
  )
  private def getClientConnectionType__ = ???
  @annotation.compileTimeOnly(
    "[field get_server_connection_type]: Field is missing <type>"
  )
  private def getServerConnectionType__ = ???
  @annotation.compileTimeOnly(
    "[field get_file_database_type]: Field is missing <type>"
  )
  private def getFileDatabaseType__ = ???
  @annotation.compileTimeOnly(
    "[field get_default_database]: Field is missing <type>"
  )
  private def getDefaultDatabase__ = ???
  @annotation.compileTimeOnly("[field supports_dtls]: Field is missing <type>")
  private def supportsDtls__ = ???
  @annotation.compileTimeOnly(
    "[field get_dtls_client_connection_type]: Field is missing <type>"
  )
  private def getDtlsClientConnectionType__ = ???
  @annotation.compileTimeOnly(
    "[field get_dtls_server_connection_type]: Field is missing <type>"
  )
  private def getDtlsServerConnectionType__ = ???
end TlsBackendInterface

object TlsBackendInterface:
  def fromRaw(ptr: Ptr[GTlsBackendInterface]): TlsBackendInterface =
    new TlsBackendInterface(ptr)
end TlsBackendInterface
