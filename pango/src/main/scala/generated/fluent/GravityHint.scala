package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoGravityHint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoGravityHint` defines how horizontal scripts should behave in a
  * vertical context.
  *
  * That is, English excerpts in a vertical paragraph for example.
  *
  * See also [enum@Pango.Gravity]
  */
enum GravityHint(val raw: PangoGravityHint):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * scripts will take their natural gravity based on the base gravity and the
    * script. This is the default.
    */
  case NATURAL extends GravityHint(PangoGravityHint.PANGO_GRAVITY_HINT_NATURAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * always use the base gravity set, regardless of the script.
    */
  case STRONG extends GravityHint(PangoGravityHint.PANGO_GRAVITY_HINT_STRONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * for scripts not in their natural direction (eg. Latin in East gravity),
    * choose per-script gravity such that every script respects the line
    * progression. This means, Latin and Arabic will take opposite gravities and
    * both flow top-to-bottom for example.
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
