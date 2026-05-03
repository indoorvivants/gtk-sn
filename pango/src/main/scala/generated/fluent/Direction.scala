package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoDirection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoDirection` represents a direction in the Unicode bidirectional
  * algorithm.
  *
  * Not every value in this enumeration makes sense for every usage of
  * `PangoDirection`; for example, the return value of [func@unichar_direction]
  * and [func@find_base_dir] cannot be `PANGO_DIRECTION_WEAK_LTR` or
  * `PANGO_DIRECTION_WEAK_RTL`, since every character is either neutral or has a
  * strong direction; on the other hand `PANGO_DIRECTION_NEUTRAL` doesn't make
  * sense to pass to [func@itemize_with_base_dir].
  *
  * The `PANGO_DIRECTION_TTB_LTR`, `PANGO_DIRECTION_TTB_RTL` values come from an
  * earlier interpretation of this enumeration as the writing direction of a
  * block of text and are no longer used. See `PangoGravity` for how vertical
  * text is handled in Pango.
  *
  * If you are interested in text direction, you should really use fribidi
  * directly. `PangoDirection` is only retained because it is used in some
  * public apis.
  */
enum Direction(val raw: PangoDirection):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A strong left-to-right direction
    */
  case LTR extends Direction(PangoDirection.PANGO_DIRECTION_LTR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A strong right-to-left direction
    */
  case RTL extends Direction(PangoDirection.PANGO_DIRECTION_RTL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deprecated value; treated the same as `PANGO_DIRECTION_RTL`.
    */
  case TTB_LTR extends Direction(PangoDirection.PANGO_DIRECTION_TTB_LTR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deprecated value; treated the same as `PANGO_DIRECTION_LTR`
    */
  case TTB_RTL extends Direction(PangoDirection.PANGO_DIRECTION_TTB_RTL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A weak left-to-right direction
    */
  case WEAK_LTR extends Direction(PangoDirection.PANGO_DIRECTION_WEAK_LTR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A weak right-to-left direction
    */
  case WEAK_RTL extends Direction(PangoDirection.PANGO_DIRECTION_WEAK_RTL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No direction specified
    */
  case NEUTRAL extends Direction(PangoDirection.PANGO_DIRECTION_NEUTRAL)
end Direction

object Direction:
  def fromRaw(raw: PangoDirection): Direction =
    raw match
      case PangoDirection.PANGO_DIRECTION_LTR      => Direction.LTR
      case PangoDirection.PANGO_DIRECTION_RTL      => Direction.RTL
      case PangoDirection.PANGO_DIRECTION_TTB_LTR  => Direction.TTB_LTR
      case PangoDirection.PANGO_DIRECTION_TTB_RTL  => Direction.TTB_RTL
      case PangoDirection.PANGO_DIRECTION_WEAK_LTR => Direction.WEAK_LTR
      case PangoDirection.PANGO_DIRECTION_WEAK_RTL => Direction.WEAK_RTL
      case PangoDirection.PANGO_DIRECTION_NEUTRAL  => Direction.NEUTRAL
  end fromRaw
end Direction
