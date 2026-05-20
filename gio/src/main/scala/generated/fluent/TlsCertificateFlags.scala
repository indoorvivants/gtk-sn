package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsCertificateFlags

/** A set of flags describing TLS certification validation. This can be used to
  * describe why a particular certificate was rejected (for example, in
  * #GTlsConnection::accept-certificate).
  *
  * GLib guarantees that if certificate verification fails, at least one flag
  * will be set, but it does not guarantee that all possible flags will be set.
  * Accordingly, you may not safely decide to ignore any particular type of
  * error. For example, it would be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED
  * if you want to allow expired certificates, because this could potentially be
  * the only error flag set even if other problems exist with the certificate.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsCertificateFlags private (val raw: GTlsCertificateFlags):
  def is(kv: TlsCertificateFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[TlsCertificateFlags.KnownValue]
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

  /** A set of flags describing TLS certification validation. This can be used
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GTlsCertificateFlags,
      name: scala.Predef.String
  ) extends TlsCertificateFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_FLAGS
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_NO_FLAGS,
          "NO_FLAGS"
        )

    /** The signing certificate authority is not known.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case UNKNOWN_CA
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_UNKNOWN_CA,
          "UNKNOWN_CA"
        )

    /** The certificate does not match the expected identity of the site that it
      * was retrieved from.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BAD_IDENTITY
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_BAD_IDENTITY,
          "BAD_IDENTITY"
        )

    /** The certificate's activation time is still in the future
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NOT_ACTIVATED
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_NOT_ACTIVATED,
          "NOT_ACTIVATED"
        )

    /** The certificate has expired
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EXPIRED
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_EXPIRED,
          "EXPIRED"
        )

    /** The certificate has been revoked according to the #GTlsConnection's
      * certificate revocation list.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case REVOKED
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_REVOKED,
          "REVOKED"
        )

    /** The certificate's algorithm is considered insecure.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INSECURE
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_INSECURE,
          "INSECURE"
        )

    /** Some other error occurred validating the certificate
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case GENERIC_ERROR
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_GENERIC_ERROR,
          "GENERIC_ERROR"
        )

    /** the combination of all of the above flags
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VALIDATE_ALL
        extends KnownValue(
          GTlsCertificateFlags.G_TLS_CERTIFICATE_VALIDATE_ALL,
          "VALIDATE_ALL"
        )
  end KnownValue
end TlsCertificateFlags
