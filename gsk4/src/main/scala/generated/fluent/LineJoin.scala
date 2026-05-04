package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskLineJoin

/** Specifies how to render the junction of two lines when stroking.
  *
  * The default line join style is `GSK_LINE_JOIN_MITER`.
  *
  * New entries may be added in future versions.
  *
  * <figure> <picture> <source srcset="join-dark.png"
  * media="(prefers-color-scheme: dark)"> <img alt="Line Join Styles"
  * src="join-light.png"> </picture> <figcaption>GSK_LINE_JOINT_MITER,
  * GSK_LINE_JOINT_ROUND, GSK_LINE_JOIN_BEVEL</figcaption> </figure>
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum LineJoin(val raw: GskLineJoin):
  /** Use a sharp angled corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MITER extends LineJoin(GskLineJoin.GSK_LINE_JOIN_MITER)

  /** Use a round join, the center of the circle is the join point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROUND extends LineJoin(GskLineJoin.GSK_LINE_JOIN_ROUND)

  /** use a cut-off join, the join is cut off at half the line width from the
    * joint point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
