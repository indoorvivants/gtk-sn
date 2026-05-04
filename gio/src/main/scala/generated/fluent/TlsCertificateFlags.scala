package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsCertificateFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A set of flags describing TLS certification validation. This can be used to
  * describe why a particular certificate was rejected (for example, in
  * #GTlsConnection::accept-certificate).
  *
  * GLib guarantees that if certificate verification fails, at least one flag
  * will be set, but it does not guarantee that all possible flags will be set.
  * Accordingly, you may not safely decide to ignore any particular type of
  * error. For example, it would be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED
  * if you want to allow expired certificates, because this could potentially be
  * the only error flag set even if other problems exist with the certificate.
  */
class TlsCertificateFlags private (val raw: GTlsCertificateFlags):
  def is(kv: TlsCertificateFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TlsCertificateFlags.KnownValue]
    TlsCertificateFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TlsCertificateFlags(${sb.result().mkString(", ")})"
end TlsCertificateFlags

object TlsCertificateFlags:
  export KnownValue.*

  def fromRaw(raw: GTlsCertificateFlags) = new TlsCertificateFlags(raw)

  extension (af: TlsCertificateFlags)
    def &(other: TlsCertificateFlags) =
      TlsCertificateFlags(af.raw & other.raw)
    def |(other: TlsCertificateFlags) =
      TlsCertificateFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A set of flags describing TLS certification validation. This can be used
    * to describe why a particular certificate was rejected (for example, in
    * #GTlsConnection::accept-certificate).
    *
    * GLib guarantees that if certificate verification fails, at least one flag
    * will be set, but it does not guarantee that all possible flags will be
    * set. Accordingly, you may not safely decide to ignore any particular type
    * of error. For example, it would be incorrect to mask
    * %G_TLS_CERTIFICATE_EXPIRED if you want to allow expired certificates,
    * because this could potentially be the only error flag set even if other
    * problems exist with the certificate.
    */
  enum KnownValue(override val raw: GTlsCertificateFlags, name: String)
      extends TlsCertificateFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set. Since: 2.74
      */
    case NO_FLAGS
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_NO_FLAGS,
          "NO_FLAGS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The signing certificate authority is not known.
      */
    case UNKNOWN_CA
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_UNKNOWN_CA,
          "UNKNOWN_CA"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The certificate does not match the expected identity of the site that it
      * was retrieved from.
      */
    case BAD_IDENTITY
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_BAD_IDENTITY,
          "BAD_IDENTITY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The certificate's activation time is still in the future
      */
    case NOT_ACTIVATED
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_NOT_ACTIVATED,
          "NOT_ACTIVATED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The certificate has expired
      */
    case EXPIRED
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_EXPIRED,
          "EXPIRED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The certificate has been revoked according to the #GTlsConnection's
      * certificate revocation list.
      */
    case REVOKED
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_REVOKED,
          "REVOKED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The certificate's algorithm is considered insecure.
      */
    case INSECURE
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_INSECURE,
          "INSECURE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Some other error occurred validating the certificate
      */
    case GENERIC_ERROR
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_GENERIC_ERROR,
          "GENERIC_ERROR"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the combination of all of the above flags
      */
    case VALIDATE_ALL
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_VALIDATE_ALL,
          "VALIDATE_ALL"
        )
  end KnownValue
end TlsCertificateFlags
