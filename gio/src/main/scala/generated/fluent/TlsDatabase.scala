package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.fluent.TlsCertificate
import sn.gnome.gio.fluent.TlsInteraction
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GTlsCertificateFlags
import sn.gnome.gio.internal.GTlsDatabase
import sn.gnome.gio.internal.GTlsDatabaseLookupFlags
import sn.gnome.gio.internal.GTlsDatabaseVerifyFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint8
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GTlsDatabase is used to look up certificates and other information from a
  * certificate or key store. It is an abstract base class which TLS library
  * specific subtypes override.
  *
  * A #GTlsDatabase may be accessed from multiple threads by the TLS backend.
  * All implementations are required to be fully thread-safe.
  *
  * Most common client applications will not directly interact with
  * #GTlsDatabase. It is used internally by #GTlsConnection.
  */
class TlsDatabase(raw: Ptr[GTlsDatabase]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a handle string for the certificate. The database will only be able
    * to create a handle for certificates that originate from the database. In
    * cases where the database cannot create a handle for a certificate, %NULL
    * will be returned.
    *
    * This handle should be stable across various instances of the application,
    * and between applications. If a certificate is modified in the database,
    * then it is not guaranteed that this handle will continue to point to it.
    */
  def createCertificateHandle(certificate: TlsCertificate)(using Zone): String =
    fromCString(
      g_tls_database_create_certificate_handle(
        this.raw.asInstanceOf,
        certificate.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Look up a certificate by its handle.
    *
    * The handle should have been created by calling
    * g_tls_database_create_certificate_handle() on a #GTlsDatabase object of
    * the same TLS backend. The handle is designed to remain valid across
    * instantiations of the database.
    *
    * If the handle is no longer valid, or does not point to a certificate in
    * this database, then %NULL will be returned.
    *
    * This function can block, use
    * g_tls_database_lookup_certificate_for_handle_async() to perform the lookup
    * operation asynchronously.
    */
  def lookupCertificateForHandle(
      handle: String | CString,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_for_handle(
        this.raw.asInstanceOf,
        __sn_extract_string(handle).asInstanceOf[Ptr[gchar]],
        interaction.getUnsafeRawPointer().asInstanceOf,
        flags,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously look up a certificate by its handle in the database. See
    * g_tls_database_lookup_certificate_for_handle() for more information.
    */
  def lookupCertificateForHandleAsync(
      handle: String | CString,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_tls_database_lookup_certificate_for_handle_async(
    this.raw.asInstanceOf,
    __sn_extract_string(handle).asInstanceOf[Ptr[gchar]],
    interaction.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous lookup of a certificate by its handle. See
    * g_tls_database_lookup_certificate_for_handle() for more information.
    *
    * If the handle is no longer valid, or does not point to a certificate in
    * this database, then %NULL will be returned.
    */
  def lookupCertificateForHandleFinish(
      result: AsyncResult
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_for_handle_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Look up the issuer of @certificate in the database. The
    * #GTlsCertificate:issuer property of @certificate is not modified, and the
    * two certificates are not hooked into a chain.
    *
    * This function can block. Use
    * g_tls_database_lookup_certificate_issuer_async() to perform the lookup
    * operation asynchronously.
    *
    * Beware this function cannot be used to build certification paths. The
    * issuer certificate returned by this function may not be the same as the
    * certificate that would actually be used to construct a valid certification
    * path during certificate verification. [RFC
    * 4158](https://datatracker.ietf.org/doc/html/rfc4158) explains why an
    * issuer certificate cannot be naively assumed to be part of the the
    * certification path (though GLib's TLS backends may not follow the path
    * building strategies outlined in this RFC). Due to the complexity of
    * certification path building, GLib does not provide any way to know which
    * certification path will actually be used when verifying a TLS certificate.
    * Accordingly, this function cannot be used to make security-related
    * decisions. Only GLib itself should make security decisions about TLS
    * certificates.
    */
  def lookupCertificateIssuer(
      certificate: TlsCertificate,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_issuer(
        this.raw.asInstanceOf,
        certificate.getUnsafeRawPointer().asInstanceOf,
        interaction.getUnsafeRawPointer().asInstanceOf,
        flags,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously look up the issuer of @certificate in the database. See
    * g_tls_database_lookup_certificate_issuer() for more information.
    */
  def lookupCertificateIssuerAsync(
      certificate: TlsCertificate,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_tls_database_lookup_certificate_issuer_async(
    this.raw.asInstanceOf,
    certificate.getUnsafeRawPointer().asInstanceOf,
    interaction.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous lookup issuer operation. See
    * g_tls_database_lookup_certificate_issuer() for more information.
    */
  def lookupCertificateIssuerFinish(
      result: AsyncResult
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_issuer_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Look up certificates issued by this issuer in the database.
    *
    * This function can block, use
    * g_tls_database_lookup_certificates_issued_by_async() to perform the lookup
    * operation asynchronously.
    */
  def lookupCertificatesIssuedBy(
      issuer_raw_dn: Ptr[guint8],
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable
  ): GResult[Ptr[GList]] = GResult.wrap(__errorPtr =>
    g_tls_database_lookup_certificates_issued_by(
      this.raw.asInstanceOf,
      issuer_raw_dn.asInstanceOf,
      interaction.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously look up certificates issued by this issuer in the database.
    * See g_tls_database_lookup_certificates_issued_by() for more information.
    *
    * The database may choose to hold a reference to the issuer byte array for
    * the duration of this asynchronous operation. The byte array should not be
    * modified during this time.
    */
  def lookupCertificatesIssuedByAsync(
      issuer_raw_dn: Ptr[guint8],
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_tls_database_lookup_certificates_issued_by_async(
    this.raw.asInstanceOf,
    issuer_raw_dn.asInstanceOf,
    interaction.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous lookup of certificates. See
    * g_tls_database_lookup_certificates_issued_by() for more information.
    */
  def lookupCertificatesIssuedByFinish(
      result: AsyncResult
  ): GResult[Ptr[GList]] = GResult.wrap(__errorPtr =>
    g_tls_database_lookup_certificates_issued_by_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the validity of a certificate chain, outside the context of a
    * TLS session.
    *
    * @chain
    *   is a chain of #GTlsCertificate objects each pointing to the next
    *   certificate in the chain by its #GTlsCertificate:issuer property.
    *
    * @purpose
    *   describes the purpose (or usage) for which the certificate is being
    *   used. Typically @purpose will be set to
    *   %G_TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER which means that the
    *   certificate is being used to authenticate a server (and we are acting as
    *   the client).
    *
    * The @identity is used to ensure the server certificate is valid for the
    * expected peer identity. If the identity does not match the certificate,
    * %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the return value. If @identity
    * is %NULL, that bit will never be set in the return value. The peer
    * identity may also be used to check for pinned certificates (trust
    * exceptions) in the database. These may override the normal verification
    * process on a host-by-host basis.
    *
    * Currently there are no @flags, and %G_TLS_DATABASE_VERIFY_NONE should be
    * used.
    *
    * If @chain is found to be valid, then the return value will be 0. If
    * @chain
    *   is found to be invalid, then the return value will indicate at least one
    *   problem found. If the function is unable to determine whether @chain is
    *   valid (for example, because @cancellable is triggered before it
    *   completes) then the return value will be
    *   %G_TLS_CERTIFICATE_GENERIC_ERROR and @error will be set accordingly.
    * @error
    *   is not set when @chain is successfully analyzed but found to be invalid.
    *
    * GLib guarantees that if certificate verification fails, at least one error
    * will be set in the return value, but it does not guarantee that all
    * possible errors will be set. Accordingly, you may not safely decide to
    * ignore any particular type of error. For example, it would be incorrect to
    * mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow expired certificates,
    * because this could potentially be the only error flag set even if other
    * problems exist with the certificate.
    *
    * Prior to GLib 2.48, GLib's default TLS backend modified @chain to
    * represent the certification path built by #GTlsDatabase during certificate
    * verification by adjusting the #GTlsCertificate:issuer property of each
    * certificate in @chain. Since GLib 2.48, this no longer occurs, so you
    * cannot rely on #GTlsCertificate:issuer to represent the actual
    * certification path used during certificate verification.
    *
    * Because TLS session context is not used, #GTlsDatabase may not perform as
    * many checks on the certificates as #GTlsConnection would. For example,
    * certificate constraints may not be honored, and revocation checks may not
    * be performed. The best way to verify TLS certificates used by a TLS
    * connection is to let #GTlsConnection handle the verification.
    *
    * The TLS backend may attempt to look up and add missing certificates to the
    * chain. This may involve HTTP requests to download missing certificates.
    *
    * This function can block. Use g_tls_database_verify_chain_async() to
    * perform the verification operation asynchronously.
    */
  def verifyChain(
      chain: TlsCertificate,
      purpose: String | CString,
      identity: SocketConnectable,
      interaction: TlsInteraction,
      flags: GTlsDatabaseVerifyFlags,
      cancellable: Cancellable
  )(using Zone): GResult[GTlsCertificateFlags] = GResult.wrap(__errorPtr =>
    g_tls_database_verify_chain(
      this.raw.asInstanceOf,
      chain.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(purpose).asInstanceOf[Ptr[gchar]],
      identity.getUnsafeRawPointer().asInstanceOf,
      interaction.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously determines the validity of a certificate chain after
    * looking up and adding any missing certificates to the chain. See
    * g_tls_database_verify_chain() for more information.
    */
  def verifyChainAsync(
      chain: TlsCertificate,
      purpose: String | CString,
      identity: SocketConnectable,
      interaction: TlsInteraction,
      flags: GTlsDatabaseVerifyFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_tls_database_verify_chain_async(
    this.raw.asInstanceOf,
    chain.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(purpose).asInstanceOf[Ptr[gchar]],
    identity.getUnsafeRawPointer().asInstanceOf,
    interaction.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous verify chain operation. See
    * g_tls_database_verify_chain() for more information.
    *
    * If @chain is found to be valid, then the return value will be 0. If
    * @chain
    *   is found to be invalid, then the return value will indicate the problems
    *   found. If the function is unable to determine whether
    * @chain
    *   is valid or not (eg, because @cancellable is triggered before it
    *   completes) then the return value will be
    *   %G_TLS_CERTIFICATE_GENERIC_ERROR and @error will be set accordingly. @error
    *   is not set when @chain is successfully analyzed but found to be invalid.
    */
  def verifyChainFinish(result: AsyncResult): GResult[GTlsCertificateFlags] =
    GResult.wrap(__errorPtr =>
      g_tls_database_verify_chain_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TlsDatabase
