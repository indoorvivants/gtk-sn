package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.{Path, PathMeasure}
import sn.gnome.gsk4.internal.GskPathMeasure

/** `GskPathMeasure` is an object that allows measurements on `GskPath`s such as
  * determining the length of the path.
  *
  * Many measuring operations require sampling the path length at intermediate
  * points. Therefore, a `GskPathMeasure` has a tolerance that determines what
  * precision is required for such approximations.
  *
  * A `GskPathMeasure` struct is a reference counted struct and should be
  * treated as opaque.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PathMeasure private[gnome] (raw: Ptr[GskPathMeasure]):

  def getUnsafeRawPointer(): Ptr[GskPathMeasure] = this.raw

  /** Gets the length of the path being measured.
    *
    * The length is cached, so this function does not do any work.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): Float /* None */ =
    gsk_path_measure_get_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathMeasure]]
    )
  end getLength

  /** Returns the path that the measure was created for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath(): sn.gnome.gsk4.Path /* None */ =
    sn.gnome.gsk4.Path.fromRaw(
      gsk_path_measure_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathMeasure]]
      )
    )
  end getPath

  /** Sets @result to the point at the given distance into the path.
    *
    * An empty path has no points, so `FALSE` is returned in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_point]: Method get_point contains an OUT parameter, which is not supported yet"
  )
  private def getPoint__ = ???

  /** Returns the tolerance that the measure was created with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTolerance(): Float /* None */ =
    gsk_path_measure_get_tolerance(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathMeasure]]
    )
  end getTolerance

  /** Increases the reference count of a `GskPathMeasure` by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gsk4.PathMeasure /* None */ =
    sn.gnome.gsk4.PathMeasure.fromRaw(
      gsk_path_measure_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathMeasure]]
      )
    )
  end ref

  /** Decreases the reference count of a `GskPathMeasure` by one.
    *
    * If the resulting reference count is zero, frees the object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gsk_path_measure_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathMeasure]]
    )
  end unref

end PathMeasure

object PathMeasure:
  def fromRaw(ptr: Ptr[GskPathMeasure]): PathMeasure = new PathMeasure(ptr)
end PathMeasure
