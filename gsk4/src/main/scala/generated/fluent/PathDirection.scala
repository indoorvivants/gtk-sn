package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.GskPathDirection

/** The values of the `GskPathDirection` enum are used to pick one of the four
  * tangents at a given point on the path.
  *
  * Note that the directions for @GSK_PATH_FROM_START/@GSK_PATH_TO_END and
  * @GSK_PATH_TO_START/@GSK_PATH_FROM_END
  *   will coincide for smooth points. Only sharp turns will exhibit four
  *   different directions.
  *
  * <picture> <source srcset="directions-dark.png" media="(prefers-color-scheme:
  * dark)"> <img alt="Path Tangents" src="directions-light.png"> </picture>
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PathDirection(val raw: GskPathDirection):
  /** The tangent in path direction of the incoming side of the path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FROM_START extends PathDirection(GskPathDirection.GSK_PATH_FROM_START)

  /** The tangent against path direction of the incoming side of the path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TO_START extends PathDirection(GskPathDirection.GSK_PATH_TO_START)

  /** The tangent in path direction of the outgoing side of the path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TO_END extends PathDirection(GskPathDirection.GSK_PATH_TO_END)

  /** The tangent against path direction of the outgoing side of the path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FROM_END extends PathDirection(GskPathDirection.GSK_PATH_FROM_END)
end PathDirection

object PathDirection:
  def fromRaw(raw: GskPathDirection): PathDirection =
    raw match
      case GskPathDirection.GSK_PATH_FROM_START => PathDirection.FROM_START
      case GskPathDirection.GSK_PATH_TO_START   => PathDirection.TO_START
      case GskPathDirection.GSK_PATH_TO_END     => PathDirection.TO_END
      case GskPathDirection.GSK_PATH_FROM_END   => PathDirection.FROM_END
  end fromRaw
end PathDirection
