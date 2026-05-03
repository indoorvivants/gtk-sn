package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskLineJoin

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies how to render the junction of two lines when stroking.
  *
  * The default line join style is `GSK_LINE_JOIN_MITER`.
  *
  * New entries may be added in future versions.
  *
  * <figure> <picture> <source srcset="join-dark.png"
  * media="(prefers-color-scheme: dark)"> <img alt="Line Join Styles"
  * src="join-light.png"> </picture> <figcaption>GSK_LINE_JOINT_MITER,
  * GSK_LINE_JOINT_ROUND, GSK_LINE_JOIN_BEVEL</figcaption> </figure>
  */
enum LineJoin(val raw: GskLineJoin):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use a sharp angled corner
    */
  case MITER extends LineJoin(GskLineJoin.GSK_LINE_JOIN_MITER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use a round join, the center of the circle is the join point
    */
  case ROUND extends LineJoin(GskLineJoin.GSK_LINE_JOIN_ROUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * use a cut-off join, the join is cut off at half the line width from the
    * joint point
    */
  case BEVEL extends LineJoin(GskLineJoin.GSK_LINE_JOIN_BEVEL)
end LineJoin

object LineJoin:
  def fromRaw(raw: GskLineJoin): LineJoin =
    raw match
      case GskLineJoin.GSK_LINE_JOIN_MITER => LineJoin.MITER
      case GskLineJoin.GSK_LINE_JOIN_ROUND => LineJoin.ROUND
      case GskLineJoin.GSK_LINE_JOIN_BEVEL => LineJoin.BEVEL
  end fromRaw
end LineJoin
