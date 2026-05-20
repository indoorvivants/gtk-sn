package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.Matrix
import sn.gnome.pango.internal.PangoMatrix

/** A `PangoMatrix` specifies a transformation between user-space and device
  * coordinates.
  *
  * The transformation is given by
  *
  * ```
  * x_device = x_user * matrix->xx + y_user * matrix->xy + matrix->x0;
  * y_device = x_user * matrix->yx + y_user * matrix->yy + matrix->y0;
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Matrix private[gnome] (raw: Ptr[PangoMatrix]):

  def getUnsafeRawPointer(): Ptr[PangoMatrix] = this.raw

  /** 1st component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def xx: Double /* None */ = (!raw).xx.asInstanceOf[Double]

  /** 1st component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def xx_=(value: Double /* None */ ): Unit =
    (!raw).xx_=(value.asInstanceOf[Double])

  /** 2nd component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def xy: Double /* None */ = (!raw).xy.asInstanceOf[Double]

  /** 2nd component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def xy_=(value: Double /* None */ ): Unit =
    (!raw).xy_=(value.asInstanceOf[Double])

  /** 3rd component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def yx: Double /* None */ = (!raw).yx.asInstanceOf[Double]

  /** 3rd component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def yx_=(value: Double /* None */ ): Unit =
    (!raw).yx_=(value.asInstanceOf[Double])

  /** 4th component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def yy: Double /* None */ = (!raw).yy.asInstanceOf[Double]

  /** 4th component of the transformation matrix
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def yy_=(value: Double /* None */ ): Unit =
    (!raw).yy_=(value.asInstanceOf[Double])

  /** x translation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def x0: Double /* None */ = (!raw).x0.asInstanceOf[Double]

  /** x translation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def x0_=(value: Double /* None */ ): Unit =
    (!raw).x0_=(value.asInstanceOf[Double])

  /** y translation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def y0: Double /* None */ = (!raw).y0.asInstanceOf[Double]

  /** y translation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def y0_=(value: Double /* None */ ): Unit =
    (!raw).y0_=(value.asInstanceOf[Double])

  /** Changes the transformation represented by @matrix to be the transformation
    * given by first applying transformation given by @new_matrix then applying
    * the original transformation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def concat(
      new_matrix: sn.gnome.pango.Matrix /* Some(Ptr[PangoMatrix]) */
  ): Unit /* None */ =
    pango_matrix_concat(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]],
      new_matrix.getUnsafeRawPointer().asInstanceOf
    )
  end concat

  /** Copies a `PangoMatrix`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.Matrix /* None */ =
    sn.gnome.pango.Matrix.fromRaw(
      pango_matrix_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]]
      )
    )
  end copy

  /** Free a `PangoMatrix`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_matrix_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]])
  end free

  /** Returns the scale factor of a matrix on the height of the font.
    *
    * That is, the scale factor in the direction perpendicular to the vector
    * that the X coordinate is mapped to. If the scale in the X coordinate is
    * needed as well, use [method@Pango.Matrix.get_font_scale_factors].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontScaleFactor(): Double /* None */ =
    pango_matrix_get_font_scale_factor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]]
    )
  end getFontScaleFactor

  /** Calculates the scale factor of a matrix on the width and height of the
    * font.
    *
    * That is, @xscale is the scale factor in the direction of the X coordinate,
    * and @yscale is the scale factor in the direction perpendicular to the
    * vector that the X coordinate is mapped to.
    *
    * Note that output numbers will always be non-negative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_font_scale_factors]: Method get_font_scale_factors contains an OUT parameter, which is not supported yet"
  )
  private def getFontScaleFactors__ = ???

  /** Gets the slant ratio of a matrix.
    *
    * For a simple shear matrix in the form:
    *
    * 1 λ 0 1
    *
    * this is simply λ.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSlantRatio(): Double /* None */ =
    pango_matrix_get_slant_ratio(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]]
    )
  end getSlantRatio

  /** Changes the transformation represented by @matrix to be the transformation
    * given by first rotating by @degrees degrees counter-clockwise then
    * applying the original transformation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rotate(degrees: Double /* Some(Double) */ ): Unit /* None */ =
    pango_matrix_rotate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]],
      degrees
    )
  end rotate

  /** Changes the transformation represented by @matrix to be the transformation
    * given by first scaling by @sx in the X direction and @sy in the Y
    * direction then applying the original transformation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scale(
      scale_x: Double /* Some(Double) */,
      scale_y: Double /* Some(Double) */
  ): Unit /* None */ =
    pango_matrix_scale(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]],
      scale_x,
      scale_y
    )
  end scale

  /** Transforms the distance vector (@dx,@dy) by @matrix.
    *
    * This is similar to [method@Pango.Matrix.transform_point], except that the
    * translation components of the transformation are ignored. The calculation
    * of the returned vector is as follows:
    *
    * ```
    * dx2 = dx1 * xx + dy1 * xy;
    * dy2 = dx1 * yx + dy1 * yy;
    * ```
    *
    * Affine transformations are position invariant, so the same vector always
    * transforms to the same vector. If (@x1,@y1) transforms to (@x2,@y2) then
    * (@x1+@dx1,@y1+@dy1) will transform to (@x1+@dx2,@y1+@dy2) for all values
    * of @x1 and @x2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform_distance]: Method transform_distance contains an INOUT parameter, which is not supported yet"
  )
  private def transformDistance__ = ???

  /** First transforms the @rect using @matrix, then calculates the bounding box
    * of the transformed rectangle.
    *
    * This function is useful for example when you want to draw a rotated
    * @PangoLayout
    *   to an image buffer, and want to know how large the image should be and
    *   how much you should shift the layout when rendering.
    *
    * For better accuracy, you should use
    * [method@Pango.Matrix.transform_rectangle] on original rectangle in Pango
    * units and convert to pixels afterward using [func@extents_to_pixels]'s
    * first argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform_pixel_rectangle]: Method transform_pixel_rectangle contains an INOUT parameter, which is not supported yet"
  )
  private def transformPixelRectangle__ = ???

  /** Transforms the point (@x, @y) by @matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform_point]: Method transform_point contains an INOUT parameter, which is not supported yet"
  )
  private def transformPoint__ = ???

  /** First transforms @rect using @matrix, then calculates the bounding box of
    * the transformed rectangle.
    *
    * This function is useful for example when you want to draw a rotated
    * @PangoLayout
    *   to an image buffer, and want to know how large the image should be and
    *   how much you should shift the layout when rendering.
    *
    * If you have a rectangle in device units (pixels), use
    * [method@Pango.Matrix.transform_pixel_rectangle].
    *
    * If you have the rectangle in Pango units and want to convert to
    * transformed pixel bounding box, it is more accurate to transform it first
    * (using this function) and pass the result to pango_extents_to_pixels(),
    * first argument, for an inclusive rounded rectangle. However, there are
    * valid reasons that you may want to convert to pixels first and then
    * transform, for example when the transformed coordinates may overflow in
    * Pango units (large matrix translation for example).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform_rectangle]: Method transform_rectangle contains an INOUT parameter, which is not supported yet"
  )
  private def transformRectangle__ = ???

  /** Changes the transformation represented by @matrix to be the transformation
    * given by first translating by (@tx, @ty) then applying the original
    * transformation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def translate(
      tx: Double /* Some(Double) */,
      ty: Double /* Some(Double) */
  ): Unit /* None */ =
    pango_matrix_translate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoMatrix]],
      tx,
      ty
    )
  end translate

end Matrix

object Matrix:
  def fromRaw(ptr: Ptr[PangoMatrix]): Matrix = new Matrix(ptr)
end Matrix
