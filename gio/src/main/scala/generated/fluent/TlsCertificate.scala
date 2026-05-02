package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.fluent.TlsCertificate
import sn.gnome.gio.internal.GTlsCertificate
import sn.gnome.gio.internal.GTlsCertificateFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GDateTime
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.glib.internal.guint8
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A certificate used for TLS authentication and encryption. This can represent
  * either a certificate only (eg, the certificate received by a client from a
  * server), or the combination of a certificate and a private key (which is
  * needed when acting as a #GTlsServerConnection).
  */
class TlsCertificate(raw: Ptr[GTlsCertificate])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GTlsCertificate representing @cert's issuer, if known
    */
  def getIssuer(): TlsCertificate /* None */ = new TlsCertificate(
    g_tls_certificate_get_issuer(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the issuer name from the certificate.
    */
  def getIssuerName()(using Zone): String /* None */ = fromCString(
    g_tls_certificate_get_issuer_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the time at which the certificate became or will become invalid.
    */
  def getNotValidAfter(): Ptr[GDateTime] /* None */ =
    g_tls_certificate_get_not_valid_after(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the time at which the certificate became or will become valid.
    */
  def getNotValidBefore(): Ptr[GDateTime] /* None */ =
    g_tls_certificate_get_not_valid_before(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the subject name from the certificate.
    */
  def getSubjectName()(using Zone): String /* None */ = fromCString(
    g_tls_certificate_get_subject_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check if two #GTlsCertificate objects represent the same certificate. The
    * raw DER byte data of the two certificates are checked for equality. This
    * has the effect that two certificates may compare equal even if their
    * #GTlsCertificate:issuer, #GTlsCertificate:private-key, or
    * #GTlsCertificate:private-key-pem properties differ.
    */
  def isSame(
      cert_two: TlsCertificate /* Some(Ptr[GTlsCertificate]) */
  ): Boolean /* None */ = g_tls_certificate_is_same(
    this.raw.asInstanceOf,
    cert_two.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This verifies @cert and returns a set of #GTlsCertificateFlags indicating
    * any problems found with it. This can be used to verify a certificate
    * outside the context of making a connection, or to check a certificate
    * against a CA that is not part of the system CA database.
    *
    * If @cert is valid, %G_TLS_CERTIFICATE_NO_FLAGS is returned.
    *
    * If @identity is not %NULL, @cert's name(s) will be compared against it,
    * and %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the return value if it
    * does not match. If @identity is %NULL, that bit will never be set in the
    * return value.
    *
    * If @trusted_ca is not %NULL, then @cert (or one of the certificates in its
    * chain) must be signed by it, or else %G_TLS_CERTIFICATE_UNKNOWN_CA will be
    * set in the return value. If
    * @trusted_ca
    *   is %NULL, that bit will never be set in the return value.
    *
    * GLib guarantees that if certificate verification fails, at least one error
    * will be set in the return value, but it does not guarantee that all
    * possible errors will be set. Accordingly, you may not safely decide to
    * ignore any particular type of error. For example, it would be incorrect to
    * mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow expired certificates,
    * because this could potentially be the only error flag set even if other
    * problems exist with the certificate.
    *
    * Because TLS session context is not used, #GTlsCertificate may not perform
    * as many checks on the certificates as #GTlsConnection would. For example,
    * certificate constraints may not be honored, and revocation checks may not
    * be performed. The best way to verify TLS certificates used by a TLS
    * connection is to let #GTlsConnection handle the verification.
    */
  def verify(
      identity: Option[SocketConnectable /* Some(Ptr[GSocketConnectable]) */ ],
      trusted_ca: Option[TlsCertificate /* Some(Ptr[GTlsCertificate]) */ ]
  ): GTlsCertificateFlags /* None */ = g_tls_certificate_verify(
    this.raw.asInstanceOf,
    identity
      .map[Ptr[GSocketConnectable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GSocketConnectable]]),
    trusted_ca
      .map[Ptr[GTlsCertificate]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GTlsCertificate]])
  )

end TlsCertificate

object TlsCertificate:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GTlsCertificate from the data in @file.
    *
    * As of 2.72, if the filename ends in `.p12` or `.pfx` the data is loaded by
    * g_tls_certificate_new_from_pkcs12() otherwise it is loaded by
    * g_tls_certificate_new_from_pem(). See those functions for exact details.
    *
    * If @file cannot be read or parsed, the function will return %NULL and set @error.
    */
  def fromFile(
      file: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_file(
        __sn_extract_string(file).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GTlsCertificate from the data in @file.
    *
    * If @file cannot be read or parsed, the function will return %NULL and set @error.
    *
    * Any unknown file types will error with %G_IO_ERROR_NOT_SUPPORTED.
    * Currently only `.p12` and `.pfx` files are supported. See
    * g_tls_certificate_new_from_pkcs12() for more details.
    */
  def fromFileWithPassword(
      file: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      password: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_file_with_password(
        __sn_extract_string(file).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(password).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GTlsCertificate from the PEM-encoded data in @cert_file and @key_file.
    * The returned certificate will be the first certificate found in @cert_file.
    * As of GLib 2.44, if @cert_file contains more certificates it will try to
    * load a certificate chain. All certificates will be verified in the order
    * found (top-level certificate should be the last one in the file) and the
    * #GTlsCertificate:issuer property of each certificate will be set
    * accordingly if the verification succeeds. If any certificate in the chain
    * cannot be verified, the first certificate in the file will still be
    * returned.
    *
    * If either file cannot be read or parsed, the function will return %NULL
    * and set @error. Otherwise, this behaves like
    * g_tls_certificate_new_from_pem().
    */
  def fromFiles(
      cert_file: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      key_file: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_files(
        __sn_extract_string(cert_file).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(key_file).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GTlsCertificate from the PEM-encoded data in @data. If
    * @data
    *   includes both a certificate and a private key, then the returned
    *   certificate will include the private key data as well. (See the
    *   #GTlsCertificate:private-key-pem property for information about
    *   supported formats.)
    *
    * The returned certificate will be the first certificate found in
    * @data.
    *   As of GLib 2.44, if @data contains more certificates it will try to load
    *   a certificate chain. All certificates will be verified in the order
    *   found (top-level certificate should be the last one in the file) and the
    *   #GTlsCertificate:issuer property of each certificate will be set
    *   accordingly if the verification succeeds. If any certificate in the
    *   chain cannot be verified, the first certificate in the file will still
    *   be returned.
    */
  def fromPem(
      data: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      length: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_pem(
        __sn_extract_string(data).asInstanceOf[Ptr[gchar]],
        gssize(length),
        __errorPtr
      ).asInstanceOf
    )
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a #GTlsCertificate from a
    *  [PKCS \#11](https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html) URI.
    *
    *  An example @pkcs11_uri would be `pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01`
    *
    *  Where the token’s layout is:
    *
    *  |[
    *  Object 0:
    *    URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=private%20key;type=private
    *    Type: Private key (RSA-2048)
    *    ID: 01
    *
    *  Object 1:
    *    URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=Certificate%20for%20Authentication;type=cert
    *    Type: X.509 Certificate (RSA-2048)
    *    ID: 01
    *  ]|
    *
    *  In this case the certificate and private key would both be detected and used as expected.
    *  @pkcs_uri may also just reference an X.509 certificate object and then optionally
    *  @private_key_pkcs11_uri allows using a private key exposed under a different URI.
    *
    *  Note that the private key is not accessed until usage and may fail or require a PIN later.
    */
  def fromPkcs11Uris(
      pkcs11_uri: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      private_key_pkcs11_uri: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_pkcs11_uris(
        __sn_extract_string(pkcs11_uri).asInstanceOf[Ptr[gchar]],
        private_key_pkcs11_uri
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GTlsCertificate from the data in @data. It must contain a
    * certificate and matching private key.
    *
    * If extra certificates are included they will be verified as a chain and
    * the #GTlsCertificate:issuer property will be set. All other data will be
    * ignored.
    *
    * You can pass as single password for all of the data which will be used
    * both for the PKCS #12 container as well as encrypted private keys. If
    * decryption fails it will error with %G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD.
    *
    * This constructor requires support in the current #GTlsBackend. If support
    * is missing it will error with %G_IO_ERROR_NOT_SUPPORTED.
    *
    * Other parsing failures will error with %G_TLS_ERROR_BAD_CERTIFICATE.
    */
  def fromPkcs12(
      data: Ptr[guint8] /* Some(Ptr[_root_.sn.gnome.glib.internal.guint8]) */,
      length: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */,
      password: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_pkcs12(
        data.asInstanceOf,
        gsize(length),
        password
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        __errorPtr
      ).asInstanceOf
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
end TlsCertificate
