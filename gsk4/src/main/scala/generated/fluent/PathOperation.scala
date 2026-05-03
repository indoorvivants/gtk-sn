package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskPathOperation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Path operations are used to describe the segments of a `GskPath`.
  *
  * More values may be added in the future.
  */
enum PathOperation(val raw: GskPathOperation):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A move-to operation, with 1 point describing the target point.
    */
  case MOVE extends PathOperation(GskPathOperation.GSK_PATH_MOVE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A close operation ending the current contour with a line back to the
    * starting point. Two points describe the start and end of the line.
    */
  case CLOSE extends PathOperation(GskPathOperation.GSK_PATH_CLOSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A line-to operation, with 2 points describing the start and end point of a
    * straight line.
    */
  case LINE extends PathOperation(GskPathOperation.GSK_PATH_LINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A curve-to operation describing a quadratic Bézier curve with 3 points
    * describing the start point, the control point and the end point of the
    * curve.
    */
  case QUAD extends PathOperation(GskPathOperation.GSK_PATH_QUAD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A curve-to operation describing a cubic Bézier curve with 4 points
    * describing the start point, the two control points and the end point of
    * the curve.
    */
  case CUBIC extends PathOperation(GskPathOperation.GSK_PATH_CUBIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A rational quadratic Bézier curve with 3 points describing the start
    * point, control point and end point of the curve. A weight for the curve
    * will be passed, too.
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
