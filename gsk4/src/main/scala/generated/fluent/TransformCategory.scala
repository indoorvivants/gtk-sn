package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.GskTransformCategory

/** The categories of matrices relevant for GSK and GTK.
  *
  * Note that any category includes matrices of all later categories. So if you
  * want to for example check if a matrix is a 2D matrix,
  * `category >= GSK_TRANSFORM_CATEGORY_2D` is the way to do this.
  *
  * Also keep in mind that rounding errors may cause matrices to not conform to
  * their categories. Otherwise, matrix operations done via multiplication will
  * not worsen categories. So for the matrix multiplication `C = A * B`,
  * `category(C) = MIN (category(A), category(B))`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TransformCategory(val raw: GskTransformCategory):
  /** The category of the matrix has not been determined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN
      extends TransformCategory(
        GskTransformCategory.GSK_TRANSFORM_CATEGORY_UNKNOWN
      )

  /** Analyzing the matrix concluded that it does not fit in any other category.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ANY
      extends TransformCategory(GskTransformCategory.GSK_TRANSFORM_CATEGORY_ANY)

  /** The matrix is a 3D matrix. This means that the w column (the last column)
    * has the values (0, 0, 0, 1).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case `3D`
      extends TransformCategory(GskTransformCategory.GSK_TRANSFORM_CATEGORY_3D)

  /** The matrix is a 2D matrix. This is equivalent to graphene_matrix_is_2d()
    * returning %TRUE. In particular, this means that Cairo can deal with the
    * matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case `2D`
      extends TransformCategory(GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D)

  /** The matrix is a combination of 2D scale and 2D translation operations. In
    * particular, this means that any rectangle can be transformed exactly using
    * this matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case `2D_AFFINE`
      extends TransformCategory(
        GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D_AFFINE
      )

  /** The matrix is a 2D translation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case `2D_TRANSLATE`
      extends TransformCategory(
        GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D_TRANSLATE
      )

  /** The matrix is the identity matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IDENTITY
      extends TransformCategory(
        GskTransformCategory.GSK_TRANSFORM_CATEGORY_IDENTITY
      )
end TransformCategory

object TransformCategory:
  def fromRaw(raw: GskTransformCategory): TransformCategory =
    raw match
      case GskTransformCategory.GSK_TRANSFORM_CATEGORY_UNKNOWN =>
        TransformCategory.UNKNOWN
      case GskTransformCategory.GSK_TRANSFORM_CATEGORY_ANY =>
        TransformCategory.ANY
      case GskTransformCategory.GSK_TRANSFORM_CATEGORY_3D =>
        TransformCategory.`3D`
      case GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D =>
        TransformCategory.`2D`
      case GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D_AFFINE =>
        TransformCategory.`2D_AFFINE`
      case GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D_TRANSLATE =>
        TransformCategory.`2D_TRANSLATE`
      case GskTransformCategory.GSK_TRANSFORM_CATEGORY_IDENTITY =>
        TransformCategory.IDENTITY
  end fromRaw
end TransformCategory
