package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskCorner

/** The corner indices used by `GskRoundedRect`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Corner(val raw: GskCorner):
  /** The top left corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOP_LEFT extends Corner(GskCorner.GSK_CORNER_TOP_LEFT)

  /** The top right corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOP_RIGHT extends Corner(GskCorner.GSK_CORNER_TOP_RIGHT)

  /** The bottom right corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOTTOM_RIGHT extends Corner(GskCorner.GSK_CORNER_BOTTOM_RIGHT)

  /** The bottom left corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOTTOM_LEFT extends Corner(GskCorner.GSK_CORNER_BOTTOM_LEFT)
end Corner

object Corner:
  def fromRaw(raw: GskCorner): Corner =
    raw match
      case GskCorner.GSK_CORNER_TOP_LEFT     => Corner.TOP_LEFT
      case GskCorner.GSK_CORNER_TOP_RIGHT    => Corner.TOP_RIGHT
      case GskCorner.GSK_CORNER_BOTTOM_RIGHT => Corner.BOTTOM_RIGHT
      case GskCorner.GSK_CORNER_BOTTOM_LEFT  => Corner.BOTTOM_LEFT
  end fromRaw
end Corner
