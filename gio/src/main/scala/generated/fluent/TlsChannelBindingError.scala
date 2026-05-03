package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsChannelBindingError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An error code used with %G_TLS_CHANNEL_BINDING_ERROR in a #GError to
  * indicate a TLS channel binding retrieval error.
  */
enum TlsChannelBindingError(val raw: GTlsChannelBindingError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Either entire binding retrieval facility or specific binding type is not
    * implemented in the TLS backend.
    */
  case NOT_IMPLEMENTED
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The handshake is not yet complete on the connection which is a strong
    * requirement for any existing binding type.
    */
  case INVALID_STATE
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Handshake is complete but binding data is not available. That normally
    * indicates the TLS implementation failed to provide the binding data. For
    * example, some implementations do not provide a peer certificate for
    * resumed connections.
    */
  case NOT_AVAILABLE
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Binding type is not supported on the current connection. This error could
    * be triggered when requesting `tls-server-end-point` binding data for a
    * certificate which has no hash function or uses multiple hash functions.
    */
  case NOT_SUPPORTED
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Any other backend error preventing binding data retrieval.
    */
  case GENERAL_ERROR
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR
      )
end TlsChannelBindingError

object TlsChannelBindingError:
  def fromRaw(raw: GTlsChannelBindingError): TlsChannelBindingError =
    raw match
      case GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED =>
        TlsChannelBindingError.NOT_IMPLEMENTED
      case GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE =>
        TlsChannelBindingError.INVALID_STATE
      case GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE =>
        TlsChannelBindingError.NOT_AVAILABLE
      case GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED =>
        TlsChannelBindingError.NOT_SUPPORTED
      case GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR =>
        TlsChannelBindingError.GENERAL_ERROR
  end fromRaw
end TlsChannelBindingError
