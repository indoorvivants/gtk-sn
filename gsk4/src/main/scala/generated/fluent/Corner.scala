package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskCorner

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The corner indices used by `GskRoundedRect`.
  */
enum Corner(val raw: GskCorner):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The top left corner
    */
  case TOP_LEFT extends Corner(GskCorner.GSK_CORNER_TOP_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The top right corner
    */
  case TOP_RIGHT extends Corner(GskCorner.GSK_CORNER_TOP_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The bottom right corner
    */
  case BOTTOM_RIGHT extends Corner(GskCorner.GSK_CORNER_BOTTOM_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The bottom left corner
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
