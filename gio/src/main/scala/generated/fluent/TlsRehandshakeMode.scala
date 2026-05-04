package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsRehandshakeMode

/** When to allow rehandshaking. See g_tls_connection_set_rehandshake_mode().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsRehandshakeMode(val raw: GTlsRehandshakeMode):
  /** Never allow rehandshaking
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEVER
      extends TlsRehandshakeMode(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_NEVER)

  /** Allow safe rehandshaking only
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SAFELY
      extends TlsRehandshakeMode(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_SAFELY)

  /** Allow unsafe rehandshaking
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
