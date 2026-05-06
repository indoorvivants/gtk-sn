package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskConicGradientNode

/** A render node for a conic gradient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConicGradientNode(raw: Ptr[GskConicGradientNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the angle for the gradient in radians, normalized in [0, 2 *
    * PI].
    *
    * The angle is starting at the top and going clockwise, as expressed in the
    * css specification:
    *
    * angle = 90 - gsk_conic_gradient_node_get_rotation()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAngle(): Float /* None */ = gsk_conic_gradient_node_get_angle(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** Retrieves the center pointer for the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_center/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))"
  )
  private def getCenter__ = ???

  /** Retrieves the color stops in the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color_stops]: Method get_color_stops contains an OUT parameter, which is not supported yet"
  )
  private def getColorStops__ = ???

  /** Retrieves the number of color stops in the gradient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNColorStops(): CUnsignedLongInt /* None */ =
    gsk_conic_gradient_node_get_n_color_stops(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).value

  /** Retrieves the rotation for the gradient in degrees.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRotation(): Float /* None */ = gsk_conic_gradient_node_get_rotation(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

end ConicGradientNode

object ConicGradientNode:
  /** Creates a `GskRenderNode` that draws a conic gradient.
    *
    * The conic gradient starts around @center in the direction of @rotation. A
    * rotation of 0 means that the gradient points up. Color stops are then
    * added clockwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def `new`() = ???

end ConicGradientNode
