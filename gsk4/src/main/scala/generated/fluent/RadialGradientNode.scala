package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorStop
import sn.gnome.gsk4.internal.GskRadialGradientNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a radial gradient.
  */
class RadialGradientNode(raw: Ptr[GskRadialGradientNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the center pointer for the gradient.
    */
  def getCenter(): Ptr[graphene_point_t] /* None */ =
    gsk_radial_gradient_node_get_center(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color stops in the gradient.
    */
  @annotation.compileTimeOnly(
    "Method get_color_stops contains an OUT parameter, which is not supported yet"
  )
  private def getColorStops__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the end value for the gradient.
    */
  def getEnd(): Float /* None */ = gsk_radial_gradient_node_get_end(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the horizontal radius for the gradient.
    */
  def getHradius(): Float /* None */ = gsk_radial_gradient_node_get_hradius(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of color stops in the gradient.
    */
  def getNColorStops(): CUnsignedLongInt /* None */ =
    gsk_radial_gradient_node_get_n_color_stops(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the start value for the gradient.
    */
  def getStart(): Float /* None */ = gsk_radial_gradient_node_get_start(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the vertical radius for the gradient.
    */
  def getVradius(): Float /* None */ = gsk_radial_gradient_node_get_vradius(
    this.raw.asInstanceOf
  )

end RadialGradientNode

object RadialGradientNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that draws a radial gradient.
    *
    * The radial gradient starts around @center. The size of the gradient is
    * dictated by @hradius in horizontal orientation and by @vradius in vertical
    * orientation.
    */
  def apply(
      bounds: Ptr[
        graphene_rect_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      center: Ptr[
        graphene_point_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */,
      hradius: Float /* Some(Float) */,
      vradius: Float /* Some(Float) */,
      start: Float /* Some(Float) */,
      end: Float /* Some(Float) */,
      color_stops: Ptr[GskColorStop /* None */ ] /* Some(Ptr[GskColorStop]) */,
      n_color_stops: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): RadialGradientNode = new RadialGradientNode(
    gsk_radial_gradient_node_new(
      bounds,
      center,
      hradius.asInstanceOf,
      vradius.asInstanceOf,
      start.asInstanceOf,
      end.asInstanceOf,
      color_stops,
      gsize(n_color_stops)
    ).asInstanceOf
  )
end RadialGradientNode
