package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsCertificateRequestFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags for g_tls_interaction_request_certificate(),
  * g_tls_interaction_request_certificate_async(), and
  * g_tls_interaction_invoke_request_certificate().
  */
enum TlsCertificateRequestFlags(val raw: GTlsCertificateRequestFlags):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No flags
    */
  case NONE
      extends TlsCertificateRequestFlags(
        GTlsCertificateRequestFlags.G_TLS_CERTIFICATE_REQUEST_NONE
      )
end TlsCertificateRequestFlags

object TlsCertificateRequestFlags:
  def fromRaw(raw: GTlsCertificateRequestFlags): TlsCertificateRequestFlags =
    raw match
      case GTlsCertificateRequestFlags.G_TLS_CERTIFICATE_REQUEST_NONE =>
        TlsCertificateRequestFlags.NONE
  end fromRaw
end TlsCertificateRequestFlags
