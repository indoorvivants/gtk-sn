package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsAuthenticationMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The client authentication mode for a #GTlsServerConnection.
  */
enum TlsAuthenticationMode(val raw: GTlsAuthenticationMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * client authentication not required
    */
  case NONE
      extends TlsAuthenticationMode(
        GTlsAuthenticationMode.G_TLS_AUTHENTICATION_NONE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * client authentication is requested
    */
  case REQUESTED
      extends TlsAuthenticationMode(
        GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUESTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * client authentication is required
    */
  case REQUIRED
      extends TlsAuthenticationMode(
        GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUIRED
      )
end TlsAuthenticationMode

object TlsAuthenticationMode:
  def fromRaw(raw: GTlsAuthenticationMode): TlsAuthenticationMode =
    raw match
      case GTlsAuthenticationMode.G_TLS_AUTHENTICATION_NONE =>
        TlsAuthenticationMode.NONE
      case GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUESTED =>
        TlsAuthenticationMode.REQUESTED
      case GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUIRED =>
        TlsAuthenticationMode.REQUIRED
  end fromRaw
end TlsAuthenticationMode
