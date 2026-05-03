package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsRehandshakeMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * When to allow rehandshaking. See g_tls_connection_set_rehandshake_mode().
  */
enum TlsRehandshakeMode(val raw: GTlsRehandshakeMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Never allow rehandshaking
    */
  case NEVER
      extends TlsRehandshakeMode(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_NEVER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow safe rehandshaking only
    */
  case SAFELY
      extends TlsRehandshakeMode(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_SAFELY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow unsafe rehandshaking
    */
  case UNSAFELY
      extends TlsRehandshakeMode(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_UNSAFELY)
end TlsRehandshakeMode

object TlsRehandshakeMode:
  def fromRaw(raw: GTlsRehandshakeMode): TlsRehandshakeMode =
    raw match
      case GTlsRehandshakeMode.G_TLS_REHANDSHAKE_NEVER =>
        TlsRehandshakeMode.NEVER
      case GTlsRehandshakeMode.G_TLS_REHANDSHAKE_SAFELY =>
        TlsRehandshakeMode.SAFELY
      case GTlsRehandshakeMode.G_TLS_REHANDSHAKE_UNSAFELY =>
        TlsRehandshakeMode.UNSAFELY
  end fromRaw
end TlsRehandshakeMode
