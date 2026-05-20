package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{SocketConnectable, TlsCertificateFlags}
import sn.gnome.glib.List

trait DtlsClientConnection:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the list of distinguished names of the Certificate Authorities that
    * the server will accept certificates from. This will be set during the TLS
    * handshake if the server requests a certificate. Otherwise, it will be
    * %NULL.
    *
    * Each item in the list is a #GByteArray which contains the complete subject
    * DN of the certificate authority.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAcceptedCas(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_dtls_client_connection_get_accepted_cas(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsClientConnection]]
      )
    )
  end getAcceptedCas

  /** Gets @conn's expected server identity
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getServerIdentity(): sn.gnome.gio.SocketConnectable /* None */ =
    new SocketConnectable.Abstract(
      g_dtls_client_connection_get_server_identity(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsClientConnection]]
      ).asInstanceOf
    )
  end getServerIdentity

  /** Gets @conn's validation flags
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GDtlsClientConnection:validation-flags for more
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValidationFlags(): sn.gnome.gio.TlsCertificateFlags /* None */ =
    sn.gnome.gio.TlsCertificateFlags.fromRaw(
      g_dtls_client_connection_get_validation_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsClientConnection]]
      )
    )
  end getValidationFlags

  /** Sets @conn's expected server identity, which is used both to tell servers
    * on virtual hosts which certificate to present, and also to let @conn know
    * what name to look for in the certificate when performing
    * %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setServerIdentity(
      identity: sn.gnome.gio.SocketConnectable /* Some(Ptr[GSocketConnectable]) */
  ): Unit /* None */ =
    g_dtls_client_connection_set_server_identity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsClientConnection]],
      identity.getUnsafeRawPointer().asInstanceOf
    )
  end setServerIdentity

  /** Sets @conn's validation flags, to override the default set of checks
    * performed when validating a server certificate. By default,
    * %G_TLS_CERTIFICATE_VALIDATE_ALL is used.
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GDtlsClientConnection:validation-flags for more
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValidationFlags(
      flags: sn.gnome.gio.TlsCertificateFlags /* Some(GTlsCertificateFlags) */
  ): Unit /* None */ =
    g_dtls_client_connection_set_validation_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsClientConnection]],
      flags.raw
    )
  end setValidationFlags

end DtlsClientConnection

object DtlsClientConnection:
  class Abstract(raw: Ptr[Byte]) extends DtlsClientConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DtlsClientConnection
