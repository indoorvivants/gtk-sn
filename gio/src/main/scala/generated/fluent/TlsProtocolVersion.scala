package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsProtocolVersion

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The TLS or DTLS protocol version used by a #GTlsConnection or
  * #GDtlsConnection. The integer values of these versions are sequential to
  * ensure newer known protocol versions compare greater than older known
  * versions. Any known DTLS protocol version will compare greater than any SSL
  * or TLS protocol version. The protocol version may be
  * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the TLS backend supports a newer protocol
  * version that GLib does not yet know about. This means that it's possible for
  * an unknown DTLS protocol version to compare less than the TLS protocol
  * versions.
  */
enum TlsProtocolVersion(val raw: GTlsProtocolVersion):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No protocol version or unknown protocol version
    */
  case UNKNOWN
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_UNKNOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * SSL 3.0, which is insecure and should not be used
    */
  case SSL_3_0
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_SSL_3_0
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * TLS 1.0, which is insecure and should not be used
    */
  case TLS_1_0
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_0
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * TLS 1.1, which is insecure and should not be used
    */
  case TLS_1_1
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_1
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * TLS 1.2, defined by [RFC
    * 5246](https://datatracker.ietf.org/doc/html/rfc5246)
    */
  case TLS_1_2
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_2
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * TLS 1.3, defined by [RFC
    * 8446](https://datatracker.ietf.org/doc/html/rfc8446)
    */
  case TLS_1_3
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_3
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * DTLS 1.0, which is insecure and should not be used
    */
  case DTLS_1_0
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_0
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * DTLS 1.2, defined by [RFC
    * 6347](https://datatracker.ietf.org/doc/html/rfc6347)
    */
  case DTLS_1_2
      extends TlsProtocolVersion(
        GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_2
      )
end TlsProtocolVersion

object TlsProtocolVersion:
  def fromRaw(raw: GTlsProtocolVersion): TlsProtocolVersion =
    raw match
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_UNKNOWN =>
        TlsProtocolVersion.UNKNOWN
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_SSL_3_0 =>
        TlsProtocolVersion.SSL_3_0
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_0 =>
        TlsProtocolVersion.TLS_1_0
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_1 =>
        TlsProtocolVersion.TLS_1_1
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_2 =>
        TlsProtocolVersion.TLS_1_2
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_3 =>
        TlsProtocolVersion.TLS_1_3
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_0 =>
        TlsProtocolVersion.DTLS_1_0
      case GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_2 =>
        TlsProtocolVersion.DTLS_1_2
  end fromRaw
end TlsProtocolVersion
