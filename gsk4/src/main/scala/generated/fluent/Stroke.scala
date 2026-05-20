package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.Context
import sn.gnome.gsk4.{LineCap, LineJoin, Stroke}
import sn.gnome.gsk4.internal.GskStroke

/** A `GskStroke` struct collects the parameters that influence the operation of
  * stroking a path.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Stroke private[gnome] (raw: Ptr[GskStroke]):

  def getUnsafeRawPointer(): Ptr[GskStroke] = this.raw

  /** Creates a copy of the given @other stroke.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gsk4.Stroke /* None */ =
    sn.gnome.gsk4.Stroke.fromRaw(
      gsk_stroke_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]])
    )
  end copy

  /** Frees a `GskStroke`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gsk_stroke_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]])
  end free

  /** Gets the dash array in use or `NULL` if dashing is disabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_dash]: Method get_dash contains an OUT parameter, which is not supported yet"
  )
  private def getDash__ = ???

  /** Returns the dash_offset of a `GskStroke`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDashOffset(): Float /* None */ =
    gsk_stroke_get_dash_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]]
    )
  end getDashOffset

  /** Gets the line cap used.
    *
    * See [enum@Gsk.LineCap] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineCap(): sn.gnome.gsk4.LineCap /* None */ =
    sn.gnome.gsk4.LineCap.fromRaw(
      gsk_stroke_get_line_cap(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]]
      )
    )
  end getLineCap

  /** Gets the line join used.
    *
    * See [enum@Gsk.LineJoin] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineJoin(): sn.gnome.gsk4.LineJoin /* None */ =
    sn.gnome.gsk4.LineJoin.fromRaw(
      gsk_stroke_get_line_join(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]]
      )
    )
  end getLineJoin

  /** Gets the line width used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineWidth(): Float /* None */ =
    gsk_stroke_get_line_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]]
    )
  end getLineWidth

  /** Returns the miter limit of a `GskStroke`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMiterLimit(): Float /* None */ =
    gsk_stroke_get_miter_limit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]]
    )
  end getMiterLimit

  /** Sets the dash pattern to use by this stroke.
    *
    * A dash pattern is specified by an array of alternating non-negative
    * values. Each value provides the length of alternate "on" and "off"
    * portions of the stroke.
    *
    * Each "on" segment will have caps applied as if the segment were a separate
    * contour. In particular, it is valid to use an "on" length of 0 with
    * `GSK_LINE_CAP_ROUND` or `GSK_LINE_CAP_SQUARE` to draw dots or squares
    * along a path.
    *
    * If @n_dash is 0, if all elements in @dash are 0, or if there are negative
    * values in @dash, then dashing is disabled.
    *
    * If @n_dash is 1, an alternating "on" and "off" pattern with the single
    * dash length provided is assumed.
    *
    * If @n_dash is uneven, the dash array will be used with the first element
    * in @dash defining an "on" or "off" in alternating passes through the
    * array.
    *
    * You can specify a starting offset into the dash with
    * [method@Gsk.Stroke.set_dash_offset].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_dash/<method parameters>/dash]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gfloat), @type -> DataRecord(float)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const float*)))"
  )
  private def setDash__ = ???

  /** Sets the offset into the dash pattern where dashing should begin.
    *
    * This is an offset into the length of the path, not an index into the array
    * values of the dash array.
    *
    * See [method@Gsk.Stroke.set_dash] for more details on dashing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDashOffset(offset: Float /* Some(Float) */ ): Unit /* None */ =
    gsk_stroke_set_dash_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]],
      offset.asInstanceOf
    )
  end setDashOffset

  /** Sets the line cap to be used when stroking.
    *
    * See [enum@Gsk.LineCap] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLineCap(
      line_cap: sn.gnome.gsk4.LineCap /* Some(GskLineCap) */
  ): Unit /* None */ =
    gsk_stroke_set_line_cap(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]],
      line_cap.raw
    )
  end setLineCap

  /** Sets the line join to be used when stroking.
    *
    * See [enum@Gsk.LineJoin] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLineJoin(
      line_join: sn.gnome.gsk4.LineJoin /* Some(GskLineJoin) */
  ): Unit /* None */ =
    gsk_stroke_set_line_join(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]],
      line_join.raw
    )
  end setLineJoin

  /** Sets the line width to be used when stroking.
    *
    * The line width must be > 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLineWidth(line_width: Float /* Some(Float) */ ): Unit /* None */ =
    gsk_stroke_set_line_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]],
      line_width.asInstanceOf
    )
  end setLineWidth

  /** Sets the limit for the distance from the corner where sharp turns of joins
    * get cut off.
    *
    * The miter limit is in units of line width and must be non-negative.
    *
    * For joins of type `GSK_LINE_JOIN_MITER` that exceed the miter limit, the
    * join gets rendered as if it was of type `GSK_LINE_JOIN_BEVEL`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMiterLimit(limit: Float /* Some(Float) */ ): Unit /* None */ =
    gsk_stroke_set_miter_limit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]],
      limit.asInstanceOf
    )
  end setMiterLimit

  /** A helper function that sets the stroke parameters of @cr from the values
    * found in @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toCairo(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */
  ): Unit /* None */ =
    gsk_stroke_to_cairo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskStroke]],
      cr.getUnsafeRawPointer().asInstanceOf
    )
  end toCairo

end Stroke

object Stroke:
  def fromRaw(ptr: Ptr[GskStroke]): Stroke = new Stroke(ptr)
end Stroke
