package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsCertificateRequestFlags

/** Flags for g_tls_interaction_request_certificate(),
  * g_tls_interaction_request_certificate_async(), and
  * g_tls_interaction_invoke_request_certificate().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsCertificateRequestFlags(val raw: GTlsCertificateRequestFlags):
  /** No flags
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
