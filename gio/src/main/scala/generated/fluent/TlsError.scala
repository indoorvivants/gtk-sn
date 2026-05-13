package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsError

/** An error code used with %G_TLS_ERROR in a #GError returned from a
  * TLS-related routine.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsError(val raw: GTlsError):
  /** No TLS provider is available
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNAVAILABLE extends TlsError(GTlsError.G_TLS_ERROR_UNAVAILABLE)

  /** Miscellaneous TLS error
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISC extends TlsError(GTlsError.G_TLS_ERROR_MISC)

  /** The certificate presented could not be parsed or failed validation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_CERTIFICATE extends TlsError(GTlsError.G_TLS_ERROR_BAD_CERTIFICATE)

  /** The TLS handshake failed because the peer does not seem to be a TLS
    * server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_TLS extends TlsError(GTlsError.G_TLS_ERROR_NOT_TLS)

  /** The TLS handshake failed because the peer's certificate was not
    * acceptable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANDSHAKE extends TlsError(GTlsError.G_TLS_ERROR_HANDSHAKE)

  /** The TLS handshake failed because the server requested a client-side
    * certificate, but none was provided. See
    * g_tls_connection_set_certificate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CERTIFICATE_REQUIRED
      extends TlsError(GTlsError.G_TLS_ERROR_CERTIFICATE_REQUIRED)

  /** The TLS connection was closed without proper notice, which may indicate an
    * attack. See g_tls_connection_set_require_close_notify().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EOF extends TlsError(GTlsError.G_TLS_ERROR_EOF)

  /** The TLS handshake failed because the client sent the fallback SCSV,
    * indicating a protocol downgrade attack. Since: 2.60
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INAPPROPRIATE_FALLBACK
      extends TlsError(GTlsError.G_TLS_ERROR_INAPPROPRIATE_FALLBACK)

  /** The certificate failed to load because a password was incorrect. Since:
    * 2.72
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_CERTIFICATE_PASSWORD
      extends TlsError(GTlsError.G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD)
end TlsError

object TlsError:
  def fromRaw(raw: GTlsError): TlsError =
    raw match
      case GTlsError.G_TLS_ERROR_UNAVAILABLE     => TlsError.UNAVAILABLE
      case GTlsError.G_TLS_ERROR_MISC            => TlsError.MISC
      case GTlsError.G_TLS_ERROR_BAD_CERTIFICATE => TlsError.BAD_CERTIFICATE
      case GTlsError.G_TLS_ERROR_NOT_TLS         => TlsError.NOT_TLS
      case GTlsError.G_TLS_ERROR_HANDSHAKE       => TlsError.HANDSHAKE
      case GTlsError.G_TLS_ERROR_CERTIFICATE_REQUIRED =>
        TlsError.CERTIFICATE_REQUIRED
      case GTlsError.G_TLS_ERROR_EOF                    => TlsError.EOF
      case GTlsError.G_TLS_ERROR_INAPPROPRIATE_FALLBACK =>
        TlsError.INAPPROPRIATE_FALLBACK
      case GTlsError.G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD =>
        TlsError.BAD_CERTIFICATE_PASSWORD
  end fromRaw
end TlsError
