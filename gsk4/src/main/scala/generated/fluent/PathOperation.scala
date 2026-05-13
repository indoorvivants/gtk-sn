package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.GskPathOperation

/** Path operations are used to describe the segments of a `GskPath`.
  *
  * More values may be added in the future.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PathOperation(val raw: GskPathOperation):
  /** A move-to operation, with 1 point describing the target point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MOVE extends PathOperation(GskPathOperation.GSK_PATH_MOVE)

  /** A close operation ending the current contour with a line back to the
    * starting point. Two points describe the start and end of the line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE extends PathOperation(GskPathOperation.GSK_PATH_CLOSE)

  /** A line-to operation, with 2 points describing the start and end point of a
    * straight line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINE extends PathOperation(GskPathOperation.GSK_PATH_LINE)

  /** A curve-to operation describing a quadratic Bézier curve with 3 points
    * describing the start point, the control point and the end point of the
    * curve.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case QUAD extends PathOperation(GskPathOperation.GSK_PATH_QUAD)

  /** A curve-to operation describing a cubic Bézier curve with 4 points
    * describing the start point, the two control points and the end point of
    * the curve.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CUBIC extends PathOperation(GskPathOperation.GSK_PATH_CUBIC)

  /** A rational quadratic Bézier curve with 3 points describing the start
    * point, control point and end point of the curve. A weight for the curve
    * will be passed, too.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONIC extends PathOperation(GskPathOperation.GSK_PATH_CONIC)
end PathOperation

object PathOperation:
  def fromRaw(raw: GskPathOperation): PathOperation =
    raw match
      case GskPathOperation.GSK_PATH_MOVE  => PathOperation.MOVE
      case GskPathOperation.GSK_PATH_CLOSE => PathOperation.CLOSE
      case GskPathOperation.GSK_PATH_LINE  => PathOperation.LINE
      case GskPathOperation.GSK_PATH_QUAD  => PathOperation.QUAD
      case GskPathOperation.GSK_PATH_CUBIC => PathOperation.CUBIC
      case GskPathOperation.GSK_PATH_CONIC => PathOperation.CONIC
  end fromRaw
end PathOperation
