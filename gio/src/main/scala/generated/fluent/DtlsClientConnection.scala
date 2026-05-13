package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{SocketConnectable, TlsCertificateFlags}

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
  @annotation.compileTimeOnly(
    "[method get_accepted_cas/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}array,ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getAcceptedCas__ = ???

  /** Gets @conn's expected server identity
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getServerIdentity(): SocketConnectable /* None */ =
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
  def getValidationFlags(): TlsCertificateFlags /* None */ =
    TlsCertificateFlags.fromRaw(
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
      identity: SocketConnectable /* Some(Ptr[GSocketConnectable]) */
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
      flags: TlsCertificateFlags /* Some(GTlsCertificateFlags) */
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
