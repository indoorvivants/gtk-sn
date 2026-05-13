package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoDirection

/** `PangoDirection` represents a direction in the Unicode bidirectional
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Direction(val raw: PangoDirection):
  /** A strong left-to-right direction
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LTR extends Direction(PangoDirection.PANGO_DIRECTION_LTR)

  /** A strong right-to-left direction
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RTL extends Direction(PangoDirection.PANGO_DIRECTION_RTL)

  /** Deprecated value; treated the same as `PANGO_DIRECTION_RTL`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TTB_LTR extends Direction(PangoDirection.PANGO_DIRECTION_TTB_LTR)

  /** Deprecated value; treated the same as `PANGO_DIRECTION_LTR`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TTB_RTL extends Direction(PangoDirection.PANGO_DIRECTION_TTB_RTL)

  /** A weak left-to-right direction
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WEAK_LTR extends Direction(PangoDirection.PANGO_DIRECTION_WEAK_LTR)

  /** A weak right-to-left direction
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WEAK_RTL extends Direction(PangoDirection.PANGO_DIRECTION_WEAK_RTL)

  /** No direction specified
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
