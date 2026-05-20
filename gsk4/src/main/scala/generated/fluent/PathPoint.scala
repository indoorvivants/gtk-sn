package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gsk4.{Path, PathDirection, PathMeasure, PathPoint}
import sn.gnome.gsk4.internal.GskPathPoint

/** `GskPathPoint` is an opaque type representing a point on a path.
  *
  * It can be queried for properties of the path at that point, such as its
  * tangent or its curvature.
  *
  * To obtain a `GskPathPoint`, use [method@Gsk.Path.get_closest_point],
  * [method@Gsk.Path.get_start_point], [method@Gsk.Path.get_end_point] or
  * [method@Gsk.PathMeasure.get_point].
  *
  * Note that `GskPathPoint` structs are meant to be stack-allocated, and don't
  * hold a reference to the path object they are obtained from. It is the
  * callers responsibility to keep a reference to the path as long as the
  * `GskPathPoint` is used.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PathPoint private[gnome] (raw: Ptr[GskPathPoint]):

  def getUnsafeRawPointer(): Ptr[GskPathPoint] = this.raw

  /** Returns whether @point1 is before or after @point2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      point2: sn.gnome.gsk4.PathPoint /* Some(Ptr[GskPathPoint]) */
  ): Int /* None */ =
    gsk_path_point_compare(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathPoint]],
      point2.getUnsafeRawPointer().asInstanceOf
    )
  end compare

  def copy(): sn.gnome.gsk4.PathPoint /* None */ =
    sn.gnome.gsk4.PathPoint.fromRaw(
      gsk_path_point_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathPoint]]
      )
    )
  end copy

  /** Returns whether the two path points refer to the same location on all
    * paths.
    *
    * Note that the start- and endpoint of a closed contour will compare
    * nonequal according to this definition. Use [method@Gsk.Path.is_closed] to
    * find out if the start- and endpoint of a concrete path refer to the same
    * location.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      point2: sn.gnome.gsk4.PathPoint /* Some(Ptr[GskPathPoint]) */
  ): Boolean /* None */ =
    gsk_path_point_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathPoint]],
      point2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  def free(): Unit /* None */ =
    gsk_path_point_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathPoint]]
    )
  end free

  /** Calculates the curvature of the path at the point.
    *
    * Optionally, returns the center of the osculating circle as well. The
    * curvature is the inverse of the radius of the osculating circle.
    *
    * Lines have a curvature of zero (indicating an osculating circle of
    * infinite radius. In this case, the @center is not modified.
    *
    * Circles with a radius of zero have `INFINITY` as curvature
    *
    * Note that certain points on a path may not have a single curvature, such
    * as sharp turns. At such points, there are two curvatures -- the (limit of)
    * the curvature of the path going into the point, and the (limit of) the
    * curvature of the path coming out of it. The @direction argument lets you
    * choose which one to get.
    *
    * <picture> <source srcset="curvature-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Osculating circle"
    * src="curvature-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_curvature]: Method get_curvature contains an OUT parameter, which is not supported yet"
  )
  private def getCurvature__ = ???

  /** Returns the distance from the beginning of the path to @point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDistance(
      measure: sn.gnome.gsk4.PathMeasure /* Some(Ptr[GskPathMeasure]) */
  ): Float /* None */ =
    gsk_path_point_get_distance(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathPoint]],
      measure.getUnsafeRawPointer().asInstanceOf
    )
  end getDistance

  /** Gets the position of the point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_position]: Method get_position contains an OUT parameter, which is not supported yet"
  )
  private def getPosition__ = ???

  /** Gets the direction of the tangent at a given point.
    *
    * This is a convenience variant of [method@Gsk.PathPoint.get_tangent] that
    * returns the angle between the tangent and the X axis. The angle can e.g.
    * be used in [gtk_snapshot_rotate()](../gtk4/method.Snapshot.rotate.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRotation(
      path: sn.gnome.gsk4.Path /* Some(Ptr[GskPath]) */,
      direction: sn.gnome.gsk4.PathDirection /* Some(GskPathDirection) */
  ): Float /* None */ =
    gsk_path_point_get_rotation(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathPoint]],
      path.getUnsafeRawPointer().asInstanceOf,
      direction.raw
    )
  end getRotation

  /** Gets the tangent of the path at the point.
    *
    * Note that certain points on a path may not have a single tangent, such as
    * sharp turns. At such points, there are two tangents -- the direction of
    * the path going into the point, and the direction coming out of it. The @direction
    * argument lets you choose which one to get.
    *
    * If the path is just a single point (e.g. a circle with radius zero), then @tangent
    * is set to `0, 0`.
    *
    * If you want to orient something in the direction of the path,
    * [method@Gsk.PathPoint.get_rotation] may be more convenient to use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tangent]: Method get_tangent contains an OUT parameter, which is not supported yet"
  )
  private def getTangent__ = ???

end PathPoint

object PathPoint:
  def fromRaw(ptr: Ptr[GskPathPoint]): PathPoint = new PathPoint(ptr)
end PathPoint
