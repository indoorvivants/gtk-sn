package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsChannelBindingError

/** An error code used with %G_TLS_CHANNEL_BINDING_ERROR in a #GError to
  * indicate a TLS channel binding retrieval error.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsChannelBindingError(val raw: GTlsChannelBindingError):
  /** Either entire binding retrieval facility or specific binding type is not
    * implemented in the TLS backend.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_IMPLEMENTED
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED
      )

  /** The handshake is not yet complete on the connection which is a strong
    * requirement for any existing binding type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_STATE
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE
      )

  /** Handshake is complete but binding data is not available. That normally
    * indicates the TLS implementation failed to provide the binding data. For
    * example, some implementations do not provide a peer certificate for
    * resumed connections.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_AVAILABLE
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE
      )

  /** Binding type is not supported on the current connection. This error could
    * be triggered when requesting `tls-server-end-point` binding data for a
    * certificate which has no hash function or uses multiple hash functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_SUPPORTED
      extends TlsChannelBindingError(
        GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED
      )

  /** Any other backend error preventing binding data retrieval.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
