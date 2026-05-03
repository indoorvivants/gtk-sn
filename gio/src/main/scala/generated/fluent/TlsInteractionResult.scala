package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsInteractionResult

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GTlsInteractionResult is returned by various functions in #GTlsInteraction
  * when finishing an interaction request.
  */
enum TlsInteractionResult(val raw: GTlsInteractionResult):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The interaction was unhandled (i.e. not implemented).
    */
  case UNHANDLED
      extends TlsInteractionResult(
        GTlsInteractionResult.G_TLS_INTERACTION_UNHANDLED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The interaction completed, and resulting data is available.
    */
  case HANDLED
      extends TlsInteractionResult(
        GTlsInteractionResult.G_TLS_INTERACTION_HANDLED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The interaction has failed, or was cancelled. and the operation should be
    * aborted.
    */
  case FAILED
      extends TlsInteractionResult(
        GTlsInteractionResult.G_TLS_INTERACTION_FAILED
      )
end TlsInteractionResult

object TlsInteractionResult:
  def fromRaw(raw: GTlsInteractionResult): TlsInteractionResult =
    raw match
      case GTlsInteractionResult.G_TLS_INTERACTION_UNHANDLED =>
        TlsInteractionResult.UNHANDLED
      case GTlsInteractionResult.G_TLS_INTERACTION_HANDLED =>
        TlsInteractionResult.HANDLED
      case GTlsInteractionResult.G_TLS_INTERACTION_FAILED =>
        TlsInteractionResult.FAILED
  end fromRaw
end TlsInteractionResult
