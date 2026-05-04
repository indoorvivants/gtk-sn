package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoGravityHint

/** `PangoGravityHint` defines how horizontal scripts should behave in a
  * vertical context.
  *
  * That is, English excerpts in a vertical paragraph for example.
  *
  * See also [enum@Pango.Gravity]
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum GravityHint(val raw: PangoGravityHint):
  /** scripts will take their natural gravity based on the base gravity and the
    * script. This is the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NATURAL extends GravityHint(PangoGravityHint.PANGO_GRAVITY_HINT_NATURAL)

  /** always use the base gravity set, regardless of the script.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRONG extends GravityHint(PangoGravityHint.PANGO_GRAVITY_HINT_STRONG)

  /** for scripts not in their natural direction (eg. Latin in East gravity),
    * choose per-script gravity such that every script respects the line
    * progression. This means, Latin and Arabic will take opposite gravities and
    * both flow top-to-bottom for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINE extends GravityHint(PangoGravityHint.PANGO_GRAVITY_HINT_LINE)
end GravityHint

object GravityHint:
  def fromRaw(raw: PangoGravityHint): GravityHint =
    raw match
      case PangoGravityHint.PANGO_GRAVITY_HINT_NATURAL => GravityHint.NATURAL
      case PangoGravityHint.PANGO_GRAVITY_HINT_STRONG  => GravityHint.STRONG
      case PangoGravityHint.PANGO_GRAVITY_HINT_LINE    => GravityHint.LINE
  end fromRaw
end GravityHint
