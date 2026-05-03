package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An error code used with %G_TLS_ERROR in a #GError returned from a
  * TLS-related routine.
  */
enum TlsError(val raw: GTlsError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No TLS provider is available
    */
  case UNAVAILABLE extends TlsError(GTlsError.G_TLS_ERROR_UNAVAILABLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Miscellaneous TLS error
    */
  case MISC extends TlsError(GTlsError.G_TLS_ERROR_MISC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The certificate presented could not be parsed or failed validation.
    */
  case BAD_CERTIFICATE extends TlsError(GTlsError.G_TLS_ERROR_BAD_CERTIFICATE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The TLS handshake failed because the peer does not seem to be a TLS
    * server.
    */
  case NOT_TLS extends TlsError(GTlsError.G_TLS_ERROR_NOT_TLS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The TLS handshake failed because the peer's certificate was not
    * acceptable.
    */
  case HANDSHAKE extends TlsError(GTlsError.G_TLS_ERROR_HANDSHAKE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The TLS handshake failed because the server requested a client-side
    * certificate, but none was provided. See
    * g_tls_connection_set_certificate().
    */
  case CERTIFICATE_REQUIRED
      extends TlsError(GTlsError.G_TLS_ERROR_CERTIFICATE_REQUIRED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The TLS connection was closed without proper notice, which may indicate an
    * attack. See g_tls_connection_set_require_close_notify().
    */
  case EOF extends TlsError(GTlsError.G_TLS_ERROR_EOF)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The TLS handshake failed because the client sent the fallback SCSV,
    * indicating a protocol downgrade attack. Since: 2.60
    */
  case INAPPROPRIATE_FALLBACK
      extends TlsError(GTlsError.G_TLS_ERROR_INAPPROPRIATE_FALLBACK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The certificate failed to load because a password was incorrect. Since:
    * 2.72
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
