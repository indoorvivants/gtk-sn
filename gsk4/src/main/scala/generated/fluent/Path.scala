package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.Context
import sn.gnome.glib.String
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.graphene.Point
import sn.gnome.gsk4.{FillRule, Path}
import sn.gnome.gsk4.internal.GskPath

/** A `GskPath` describes lines and curves that are more complex than simple
  * rectangles.
  *
  * Paths can used for rendering (filling or stroking) and for animations (e.g.
  * as trajectories).
  *
  * `GskPath` is an immutable, opaque, reference-counted struct. After creation,
  * you cannot change the types it represents. Instead, new `GskPath` objects
  * have to be created. The [struct@Gsk.PathBuilder] structure is meant to help
  * in this endeavor.
  *
  * Conceptually, a path consists of zero or more contours (continous, connected
  * curves), each of which may or may not be closed. Contours are typically
  * constructed from Bézier segments.
  *
  * <picture> <source srcset="path-dark.png" media="(prefers-color-scheme:
  * dark)"> <img alt="A Path" src="path-light.png"> </picture>
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Path private[gnome] (raw: Ptr[GskPath]):

  def getUnsafeRawPointer(): Ptr[GskPath] = this.raw

  /** Calls @func for every operation of the path.
    *
    * Note that this may only approximate @self, because paths can contain
    * optimizations for various specialized contours, and depending on the
    * @flags,
    *   the path may be decomposed into simpler curves than the ones that it
    *   contained originally.
    *
    * This function serves two purposes:
    *
    *   - When the @flags allow everything, it provides access to the raw,
    *     unmodified data of the path.
    *   - When the @flags disallow certain operations, it provides an
    *     approximation of the path using just the allowed operations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PathForeachFunc), @type -> DataRecord(GskPathForeachFunc)))"
  )
  private def foreach__ = ???

  /** Computes the bounds of the given path.
    *
    * The returned bounds may be larger than necessary, because this function
    * aims to be fast, not accurate. The bounds are guaranteed to contain the
    * path.
    *
    * It is possible that the returned rectangle has 0 width and/or height. This
    * can happen when the path only describes a point or an axis-aligned line.
    *
    * If the path is empty, `FALSE` is returned and @bounds are set to
    * graphene_rect_zero(). This is different from the case where the path is a
    * single point at the origin, where the @bounds will also be set to the zero
    * rectangle but `TRUE` will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getBounds__ = ???

  /** Computes the closest point on the path to the given point and sets the @result
    * to it.
    *
    * If there is no point closer than the given threshold, `FALSE` is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_closest_point]: Method get_closest_point contains an OUT parameter, which is not supported yet"
  )
  private def getClosestPoint__ = ???

  /** Gets the end point of the path.
    *
    * An empty path has no points, so `FALSE` is returned in this case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_end_point]: Method get_end_point contains an OUT parameter, which is not supported yet"
  )
  private def getEndPoint__ = ???

  /** Gets the start point of the path.
    *
    * An empty path has no points, so `FALSE` is returned in this case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_start_point]: Method get_start_point contains an OUT parameter, which is not supported yet"
  )
  private def getStartPoint__ = ???

  /** Computes the bounds for stroking the given path with the parameters in @stroke.
    *
    * The returned bounds may be larger than necessary, because this function
    * aims to be fast, not accurate. The bounds are guaranteed to contain the
    * area affected by the stroke, including protrusions like miters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_stroke_bounds]: Method get_stroke_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getStrokeBounds__ = ???

  /** Returns whether the given point is inside the area that would be affected
    * if the path was filled according to @fill_rule.
    *
    * Note that this function assumes that filling a contour implicitly closes
    * it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inFill(
      point: sn.gnome.graphene.Point /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */,
      fill_rule: sn.gnome.gsk4.FillRule /* Some(GskFillRule) */
  ): Boolean /* None */ =
    gsk_path_in_fill(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]],
      point.getUnsafeRawPointer().asInstanceOf,
      fill_rule.raw
    ).value.!=(0)
  end inFill

  /** Returns if the path represents a single closed contour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClosed(): Boolean /* None */ =
    gsk_path_is_closed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]]
    ).value.!=(0)
  end isClosed

  /** Checks if the path is empty, i.e. contains no lines or curves.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEmpty(): Boolean /* None */ =
    gsk_path_is_empty(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]]
    ).value.!=(0)
  end isEmpty

  /** Converts @self into a human-readable string representation suitable for
    * printing.
    *
    * The string is compatible with (a superset of) [SVG path
    * syntax](https://www.w3.org/TR/SVG11/paths.html#PathData), see
    * [func@Gsk.Path.parse] for a summary of the syntax.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def print(
      string: sn.gnome.glib.String /* Some(Ptr[_root_.sn.gnome.glib.internal.GString]) */
  ): Unit /* None */ =
    gsk_path_print(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]],
      string.getUnsafeRawPointer().asInstanceOf
    )
  end print

  /** Increases the reference count of a `GskPath` by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gsk4.Path /* None */ =
    sn.gnome.gsk4.Path.fromRaw(
      gsk_path_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]])
    )
  end ref

  /** Appends the given @path to the given cairo context for drawing with Cairo.
    *
    * This may cause some suboptimal conversions to be performed as Cairo does
    * not support all features of `GskPath`.
    *
    * This function does not clear the existing Cairo path. Call
    * cairo_new_path() if you want this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toCairo(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */
  ): Unit /* None */ =
    gsk_path_to_cairo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]],
      cr.getUnsafeRawPointer().asInstanceOf
    )
  end toCairo

  /** Converts the path into a string that is suitable for printing.
    *
    * You can use this function in a debugger to get a quick overview of the
    * path.
    *
    * This is a wrapper around [method@Gsk.Path.print], see that function for
    * details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      gsk_path_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]]
      ).asInstanceOf
    )
  end _toString

  /** Decreases the reference count of a `GskPath` by one.
    *
    * If the resulting reference count is zero, frees the path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gsk_path_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPath]])
  end unref

end Path

object Path:
  def fromRaw(ptr: Ptr[GskPath]): Path = new Path(ptr)
end Path
