package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorStop
import sn.gnome.gsk4.internal.GskConicGradientNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a conic gradient.
  */
class ConicGradientNode(raw: Ptr[GskConicGradientNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the angle for the gradient in radians, normalized in [0, 2 *
    * PI].
    *
    * The angle is starting at the top and going clockwise, as expressed in the
    * css specification:
    *
    * angle = 90 - gsk_conic_gradient_node_get_rotation()
    */
  def getAngle(): Float = gsk_conic_gradient_node_get_angle(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the center pointer for the gradient.
    */
  def getCenter(): Ptr[graphene_point_t] = gsk_conic_gradient_node_get_center(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color stops in the gradient.
    */
  @annotation.compileTimeOnly(
    "Method get_color_stops contains an OUT parameter, which is not supported yet"
  )
  def getColorStops(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of color stops in the gradient.
    */
  def getNColorStops(): CUnsignedLongInt =
    gsk_conic_gradient_node_get_n_color_stops(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the rotation for the gradient in degrees.
    */
  def getRotation(): Float = gsk_conic_gradient_node_get_rotation(
    this.raw.asInstanceOf
  )

end ConicGradientNode

object ConicGradientNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that draws a conic gradient.
    *
    * The conic gradient starts around @center in the direction of @rotation. A
    * rotation of 0 means that the gradient points up. Color stops are then
    * added clockwise.
    */
  def apply(
      bounds: Ptr[graphene_rect_t],
      center: Ptr[graphene_point_t],
      rotation: Float,
      color_stops: Ptr[GskColorStop],
      n_color_stops: CUnsignedLongInt
  ): ConicGradientNode = new ConicGradientNode(
    gsk_conic_gradient_node_new(
      bounds,
      center,
      rotation.asInstanceOf,
      color_stops,
      gsize(n_color_stops)
    ).asInstanceOf
  )
end ConicGradientNode
