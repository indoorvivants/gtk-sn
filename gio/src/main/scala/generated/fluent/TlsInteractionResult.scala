package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsInteractionResult

/** #GTlsInteractionResult is returned by various functions in #GTlsInteraction
  * when finishing an interaction request.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsInteractionResult(val raw: GTlsInteractionResult):
  /** The interaction was unhandled (i.e. not implemented).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNHANDLED
      extends TlsInteractionResult(
        GTlsInteractionResult.G_TLS_INTERACTION_UNHANDLED
      )

  /** The interaction completed, and resulting data is available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANDLED
      extends TlsInteractionResult(
        GTlsInteractionResult.G_TLS_INTERACTION_HANDLED
      )

  /** The interaction has failed, or was cancelled. and the operation should be
    * aborted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
