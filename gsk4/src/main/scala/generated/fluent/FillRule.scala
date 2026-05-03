package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskFillRule

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GskFillRule` is used to select how paths are filled.
  *
  * Whether or not a point is included in the fill is determined by taking a ray
  * from that point to infinity and looking at intersections with the path. The
  * ray can be in any direction, as long as it doesn't pass through the end
  * point of a segment or have a tricky intersection such as intersecting
  * tangent to the path.
  *
  * (Note that filling is not actually implemented in this way. This is just a
  * description of the rule that is applied.)
  *
  * New entries may be added in future versions.
  */
enum FillRule(val raw: GskFillRule):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If the path crosses the ray from left-to-right, counts +1. If the path
    * crosses the ray from right to left, counts -1. (Left and right are
    * determined from the perspective of looking along the ray from the starting
    * point.) If the total count is non-zero, the point will be filled.
    */
  case WINDING extends FillRule(GskFillRule.GSK_FILL_RULE_WINDING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Counts the total number of intersections, without regard to the
    * orientation of the contour. If the total number of intersections is odd,
    * the point will be filled.
    */
  case EVEN_ODD extends FillRule(GskFillRule.GSK_FILL_RULE_EVEN_ODD)
end FillRule

object FillRule:
  def fromRaw(raw: GskFillRule): FillRule =
    raw match
      case GskFillRule.GSK_FILL_RULE_WINDING  => FillRule.WINDING
      case GskFillRule.GSK_FILL_RULE_EVEN_ODD => FillRule.EVEN_ODD
  end fromRaw
end FillRule
