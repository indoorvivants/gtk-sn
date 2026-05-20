package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.String
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.graphene.{Matrix, Point, Point3D, Vec3}
import sn.gnome.gsk4.{Transform, TransformCategory}
import sn.gnome.gsk4.internal.GskTransform

/** `GskTransform` is an object to describe transform matrices.
  *
  * Unlike `graphene_matrix_t`, `GskTransform` retains the steps in how a
  * transform was constructed, and allows inspecting them. It is modeled after
  * the way CSS describes transforms.
  *
  * `GskTransform` objects are immutable and cannot be changed after creation.
  * This means code can safely expose them as properties of objects without
  * having to worry about others changing them.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Transform private[gnome] (raw: Ptr[GskTransform]):

  def getUnsafeRawPointer(): Ptr[GskTransform] = this.raw

  /** Checks two transforms for equality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      second: Option[sn.gnome.gsk4.Transform /* Some(Ptr[GskTransform]) */ ]
  ): Boolean /* None */ =
    gsk_transform_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
      second
        .map[Ptr[GskTransform]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GskTransform]])
    ).value.!=(0)
  end equal

  /** Returns the category this transform belongs to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCategory(): sn.gnome.gsk4.TransformCategory /* None */ =
    sn.gnome.gsk4.TransformCategory.fromRaw(
      gsk_transform_get_category(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]]
      )
    )
  end getCategory

  /** Inverts the given transform.
    *
    * If @self is not invertible, %NULL is returned. Note that inverting %NULL
    * also returns %NULL, which is the correct inverse of %NULL. If you need to
    * differentiate between those cases, you should check @self is not %NULL
    * before calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invert(): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_invert(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]]
      )
    )
  end invert

  /** Multiplies @next with the given @matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matrix(
      matrix: sn.gnome.graphene.Matrix /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_matrix_t]) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_matrix(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        matrix.getUnsafeRawPointer().asInstanceOf
      )
    )
  end matrix

  /** Applies a perspective projection transform.
    *
    * This transform scales points in X and Y based on their Z value, scaling
    * points with positive Z values away from the origin, and those with
    * negative Z values towards the origin. Points on the z=0 plane are
    * unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def perspective(
      depth: Float /* Some(Float) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_perspective(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        depth.asInstanceOf
      )
    )
  end perspective

  /** Converts @self into a human-readable string representation suitable for
    * printing.
    *
    * The result of this function can later be parsed with
    * [func@Gsk.Transform.parse].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def print(
      string: sn.gnome.glib.String /* Some(Ptr[_root_.sn.gnome.glib.internal.GString]) */
  ): Unit /* None */ =
    gsk_transform_print(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
      string.getUnsafeRawPointer().asInstanceOf
    )
  end print

  /** Acquires a reference on the given `GskTransform`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]]
      )
    )
  end ref

  /** Rotates @next @angle degrees in 2D - or in 3D-speak, around the Z axis.
    * The rotation happens around the origin point of (0, 0).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rotate(
      angle: Float /* Some(Float) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_rotate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        angle.asInstanceOf
      )
    )
  end rotate

  /** Rotates @next @angle degrees around @axis.
    *
    * For a rotation in 2D space, use [method@Gsk.Transform.rotate]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rotate3d(
      angle: Float /* Some(Float) */,
      axis: sn.gnome.graphene.Vec3 /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec3_t]) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_rotate_3d(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        angle.asInstanceOf,
        axis.getUnsafeRawPointer().asInstanceOf
      )
    )
  end rotate3d

  /** Scales @next in 2-dimensional space by the given factors.
    *
    * Use [method@Gsk.Transform.scale_3d] to scale in all 3 dimensions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scale(
      factor_x: Float /* Some(Float) */,
      factor_y: Float /* Some(Float) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_scale(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        factor_x.asInstanceOf,
        factor_y.asInstanceOf
      )
    )
  end scale

  /** Scales @next by the given factors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scale3d(
      factor_x: Float /* Some(Float) */,
      factor_y: Float /* Some(Float) */,
      factor_z: Float /* Some(Float) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_scale_3d(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        factor_x.asInstanceOf,
        factor_y.asInstanceOf,
        factor_z.asInstanceOf
      )
    )
  end scale3d

  /** Applies a skew transform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def skew(
      skew_x: Float /* Some(Float) */,
      skew_y: Float /* Some(Float) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_skew(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        skew_x.asInstanceOf,
        skew_y.asInstanceOf
      )
    )
  end skew

  /** Converts a `GskTransform` to a 2D transformation matrix.
    *
    * @self
    *   must be a 2D transformation. If you are not sure, use
    *   gsk_transform_get_category() >= %GSK_TRANSFORM_CATEGORY_2D to check.
    *
    * The returned values have the following layout:
    *
    * ```
    *   | xx yx |   |  a  b  0 |
    *   | xy yy | = |  c  d  0 |
    *   | dx dy |   | tx ty  1 |
    * ```
    *
    * This function can be used to convert between a `GskTransform` and a matrix
    * type from other 2D drawing libraries, in particular Cairo.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_2d]: Method to_2d contains an OUT parameter, which is not supported yet"
  )
  private def to2d__ = ???

  /** Converts a `GskTransform` to 2D transformation factors.
    *
    * To recreate an equivalent transform from the factors returned by this
    * function, use
    *
    * gsk_transform_skew ( gsk_transform_scale ( gsk_transform_rotate (
    * gsk_transform_translate (NULL, &GRAPHENE_POINT_T (dx, dy)), angle),
    * scale_x, scale_y), skew_x, skew_y)
    *
    * @self
    *   must be a 2D transformation. If you are not sure, use
    *
    * gsk_transform_get_category() >= %GSK_TRANSFORM_CATEGORY_2D
    *
    * to check.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_2d_components]: Method to_2d_components contains an OUT parameter, which is not supported yet"
  )
  private def to2dComponents__ = ???

  /** Converts a `GskTransform` to 2D affine transformation factors.
    *
    * To recreate an equivalent transform from the factors returned by this
    * function, use
    *
    * gsk_transform_scale (gsk_transform_translate (NULL, &GRAPHENE_POINT_T (dx,
    * dy)), sx, sy)
    *
    * @self
    *   must be a 2D affine transformation. If you are not sure, use
    *
    * gsk_transform_get_category() >= %GSK_TRANSFORM_CATEGORY_2D_AFFINE
    *
    * to check.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_affine]: Method to_affine contains an OUT parameter, which is not supported yet"
  )
  private def toAffine__ = ???

  /** Computes the actual value of @self and stores it in @out_matrix.
    *
    * The previous value of @out_matrix will be ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_matrix]: Method to_matrix contains an OUT parameter, which is not supported yet"
  )
  private def toMatrix__ = ???

  /** Converts a matrix into a string that is suitable for printing.
    *
    * The resulting string can be parsed with [func@Gsk.Transform.parse].
    *
    * This is a wrapper around [method@Gsk.Transform.print].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      gsk_transform_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]]
      ).asInstanceOf
    )
  end _toString

  /** Converts a `GskTransform` to a translation operation.
    *
    * @self
    *   must be a 2D transformation. If you are not sure, use
    *
    * gsk_transform_get_category() >= %GSK_TRANSFORM_CATEGORY_2D_TRANSLATE
    *
    * to check.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_translate]: Method to_translate contains an OUT parameter, which is not supported yet"
  )
  private def toTranslate__ = ???

  /** Applies all the operations from @other to @next.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def transform(
      other: Option[sn.gnome.gsk4.Transform /* Some(Ptr[GskTransform]) */ ]
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_transform(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        other
          .map[Ptr[GskTransform]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GskTransform]])
      )
    )
  end transform

  /** Transforms a `graphene_rect_t` using the given transform @self.
    *
    * The result is the bounding box containing the coplanar quad.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform_bounds]: Method transform_bounds contains an OUT parameter, which is not supported yet"
  )
  private def transformBounds__ = ???

  /** Transforms a `graphene_point_t` using the given transform @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform_point]: Method transform_point contains an OUT parameter, which is not supported yet"
  )
  private def transformPoint__ = ???

  /** Translates @next in 2-dimensional space by @point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def translate(
      point: sn.gnome.graphene.Point /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_translate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        point.getUnsafeRawPointer().asInstanceOf
      )
    )
  end translate

  /** Translates @next by @point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def translate3d(
      point: sn.gnome.graphene.Point3D /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point3d_t]) */
  ): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_translate_3d(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]],
        point.getUnsafeRawPointer().asInstanceOf
      )
    )
  end translate3d

  /** Releases a reference on the given `GskTransform`.
    *
    * If the reference was the last, the resources associated to the @self are
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gsk_transform_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskTransform]]
    )
  end unref

end Transform

object Transform:
  def fromRaw(ptr: Ptr[GskTransform]): Transform = new Transform(ptr)
end Transform
