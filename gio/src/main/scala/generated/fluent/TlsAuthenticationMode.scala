package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsAuthenticationMode

/** The client authentication mode for a #GTlsServerConnection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsAuthenticationMode(val raw: GTlsAuthenticationMode):
  /** client authentication not required
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends TlsAuthenticationMode(
        GTlsAuthenticationMode.G_TLS_AUTHENTICATION_NONE
      )

  /** client authentication is requested
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REQUESTED
      extends TlsAuthenticationMode(
        GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUESTED
      )

  /** client authentication is required
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
