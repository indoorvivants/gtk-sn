package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  AsyncResult,
  Cancellable,
  SocketConnectable,
  TlsCertificate,
  TlsCertificateFlags,
  TlsDatabaseLookupFlags,
  TlsDatabaseVerifyFlags,
  TlsInteraction
}
import sn.gnome.gio.internal.GTlsDatabase
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GTlsDatabase is used to look up certificates and other information from a
  * certificate or key store. It is an abstract base class which TLS library
  * specific subtypes override.
  *
  * A #GTlsDatabase may be accessed from multiple threads by the TLS backend.
  * All implementations are required to be fully thread-safe.
  *
  * Most common client applications will not directly interact with
  * #GTlsDatabase. It is used internally by #GTlsConnection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsDatabase private[gnome] (raw: Ptr[GTlsDatabase])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Create a handle string for the certificate. The database will only be able
    * to create a handle for certificates that originate from the database. In
    * cases where the database cannot create a handle for a certificate, %NULL
    * will be returned.
    *
    * This handle should be stable across various instances of the application,
    * and between applications. If a certificate is modified in the database,
    * then it is not guaranteed that this handle will continue to point to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createCertificateHandle(
      certificate: sn.gnome.gio.TlsCertificate /* Some(Ptr[GTlsCertificate]) */
  )(using Zone, Runtime): String /* None */ =
    fromCString(
      g_tls_database_create_certificate_handle(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsDatabase]],
        certificate.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end createCertificateHandle

  /** Look up a certificate by its handle.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupCertificateForHandle(
      handle: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      interaction: Option[
        sn.gnome.gio.TlsInteraction /* Some(Ptr[GTlsInteraction]) */
      ],
      flags: TlsDatabaseLookupFlags /* Some(GTlsDatabaseLookupFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Zone, Runtime): GResult[sn.gnome.gio.TlsCertificate /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.TlsCertificate.applyUnsafe(
        g_tls_database_lookup_certificate_for_handle(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsDatabase]],
          toCString(handle).asInstanceOf[Ptr[gchar]],
          interaction
            .map[Ptr[GTlsInteraction]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GTlsInteraction]]),
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end lookupCertificateForHandle

  /** Asynchronously look up a certificate by its handle in the database. See
    * g_tls_database_lookup_certificate_for_handle() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_certificate_for_handle_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupCertificateForHandleAsync__ = ???

  /** Finish an asynchronous lookup of a certificate by its handle. See
    * g_tls_database_lookup_certificate_for_handle() for more information.
    *
    * If the handle is no longer valid, or does not point to a certificate in
    * this database, then %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupCertificateForHandleFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.TlsCertificate /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.TlsCertificate.applyUnsafe(
        g_tls_database_lookup_certificate_for_handle_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsDatabase]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end lookupCertificateForHandleFinish

  /** Look up the issuer of @certificate in the database. The
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupCertificateIssuer(
      certificate: sn.gnome.gio.TlsCertificate /* Some(Ptr[GTlsCertificate]) */,
      interaction: Option[
        sn.gnome.gio.TlsInteraction /* Some(Ptr[GTlsInteraction]) */
      ],
      flags: TlsDatabaseLookupFlags /* Some(GTlsDatabaseLookupFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.TlsCertificate /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.TlsCertificate.applyUnsafe(
        g_tls_database_lookup_certificate_issuer(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsDatabase]],
          certificate.getUnsafeRawPointer().asInstanceOf,
          interaction
            .map[Ptr[GTlsInteraction]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GTlsInteraction]]),
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end lookupCertificateIssuer

  /** Asynchronously look up the issuer of @certificate in the database. See
    * g_tls_database_lookup_certificate_issuer() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_certificate_issuer_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupCertificateIssuerAsync__ = ???

  /** Finish an asynchronous lookup issuer operation. See
    * g_tls_database_lookup_certificate_issuer() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupCertificateIssuerFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.TlsCertificate /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.TlsCertificate.applyUnsafe(
        g_tls_database_lookup_certificate_issuer_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsDatabase]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end lookupCertificateIssuerFinish

  /** Look up certificates issued by this issuer in the database.
    *
    * This function can block, use
    * g_tls_database_lookup_certificates_issued_by_async() to perform the lookup
    * operation asynchronously.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_certificates_issued_by/<method parameters>/issuer_raw_dn]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))"
  )
  private def lookupCertificatesIssuedBy__ = ???

  /** Asynchronously look up certificates issued by this issuer in the database.
    * See g_tls_database_lookup_certificates_issued_by() for more information.
    *
    * The database may choose to hold a reference to the issuer byte array for
    * the duration of this asynchronous operation. The byte array should not be
    * modified during this time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_certificates_issued_by_async/<method parameters>/issuer_raw_dn]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))"
  )
  private def lookupCertificatesIssuedByAsync__ = ???

  /** Finish an asynchronous lookup of certificates. See
    * g_tls_database_lookup_certificates_issued_by() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_certificates_issued_by_finish/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(TlsCertificate))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupCertificatesIssuedByFinish__ = ???

  /** Determines the validity of a certificate chain, outside the context of a
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def verifyChain(
      chain: sn.gnome.gio.TlsCertificate /* Some(Ptr[GTlsCertificate]) */,
      purpose: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      identity: Option[SocketConnectable /* Some(Ptr[GSocketConnectable]) */ ],
      interaction: Option[
        sn.gnome.gio.TlsInteraction /* Some(Ptr[GTlsInteraction]) */
      ],
      flags: TlsDatabaseVerifyFlags /* Some(GTlsDatabaseVerifyFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Zone, Runtime): GResult[TlsCertificateFlags /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsCertificateFlags.fromRaw(
        g_tls_database_verify_chain(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsDatabase]],
          chain.getUnsafeRawPointer().asInstanceOf,
          toCString(purpose).asInstanceOf[Ptr[gchar]],
          identity
            .map[Ptr[GSocketConnectable]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GSocketConnectable]]),
          interaction
            .map[Ptr[GTlsInteraction]](o =>
              o.getUnsafeRawPointer().asInstanceOf
            )
            .getOrElse(null.asInstanceOf[Ptr[GTlsInteraction]]),
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        )
      )
    )
  end verifyChain

  /** Asynchronously determines the validity of a certificate chain after
    * looking up and adding any missing certificates to the chain. See
    * g_tls_database_verify_chain() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method verify_chain_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def verifyChainAsync__ = ???

  /** Finish an asynchronous verify chain operation. See
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def verifyChainFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[TlsCertificateFlags /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsCertificateFlags.fromRaw(
        g_tls_database_verify_chain_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsDatabase]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        )
      )
    )
  end verifyChainFinish

end TlsDatabase

object TlsDatabase:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GTlsDatabase])(using Runtime) =
    summon[Runtime].getOrCreate[TlsDatabase](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TlsDatabase(ptr)
    )

end TlsDatabase
