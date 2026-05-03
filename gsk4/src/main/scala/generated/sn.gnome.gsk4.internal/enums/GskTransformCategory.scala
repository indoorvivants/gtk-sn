package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskTransformCategory: _TRANSFORM_CATEGORY_UNKNOWN: The category of the matrix has not been determined. _TRANSFORM_CATEGORY_ANY: Analyzing the matrix concluded that it does not fit in any other category. _TRANSFORM_CATEGORY_3D: The matrix is a 3D matrix. This means that the w column (the last column) has the values (0, 0, 0, 1). _TRANSFORM_CATEGORY_2D: The matrix is a 2D matrix. This is equivalent to graphene_matrix_is_2d() returning %TRUE. In particular, this means that Cairo can deal with the matrix. _TRANSFORM_CATEGORY_2D_AFFINE: The matrix is a combination of 2D scale and 2D translation operations. In particular, this means that any rectangle can be transformed exactly using this matrix. _TRANSFORM_CATEGORY_2D_TRANSLATE: The matrix is a 2D translation. _TRANSFORM_CATEGORY_IDENTITY: The matrix is the identity matrix.
*/
opaque type GskTransformCategory = CUnsignedInt
object GskTransformCategory extends _BindgenEnumCUnsignedInt[GskTransformCategory]:
  given _tag: Tag[GskTransformCategory] = Tag.UInt
  inline def define(inline a: Long): GskTransformCategory = a.toUInt
  val GSK_TRANSFORM_CATEGORY_UNKNOWN = define(0)
  val GSK_TRANSFORM_CATEGORY_ANY = define(1)
  val GSK_TRANSFORM_CATEGORY_3D = define(2)
  val GSK_TRANSFORM_CATEGORY_2D = define(3)
  val GSK_TRANSFORM_CATEGORY_2D_AFFINE = define(4)
  val GSK_TRANSFORM_CATEGORY_2D_TRANSLATE = define(5)
  val GSK_TRANSFORM_CATEGORY_IDENTITY = define(6)
  def getName(value: GskTransformCategory): Option[String] =
    value match
      case `GSK_TRANSFORM_CATEGORY_UNKNOWN` => Some("GSK_TRANSFORM_CATEGORY_UNKNOWN")
      case `GSK_TRANSFORM_CATEGORY_ANY` => Some("GSK_TRANSFORM_CATEGORY_ANY")
      case `GSK_TRANSFORM_CATEGORY_3D` => Some("GSK_TRANSFORM_CATEGORY_3D")
      case `GSK_TRANSFORM_CATEGORY_2D` => Some("GSK_TRANSFORM_CATEGORY_2D")
      case `GSK_TRANSFORM_CATEGORY_2D_AFFINE` => Some("GSK_TRANSFORM_CATEGORY_2D_AFFINE")
      case `GSK_TRANSFORM_CATEGORY_2D_TRANSLATE` => Some("GSK_TRANSFORM_CATEGORY_2D_TRANSLATE")
      case `GSK_TRANSFORM_CATEGORY_IDENTITY` => Some("GSK_TRANSFORM_CATEGORY_IDENTITY")
      case _ => _root_.scala.None
  extension (a: GskTransformCategory)
    inline def &(b: GskTransformCategory): GskTransformCategory = a & b
    inline def |(b: GskTransformCategory): GskTransformCategory = a | b
    inline def is(b: GskTransformCategory): Boolean = (a & b) == b