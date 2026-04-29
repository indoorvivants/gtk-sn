package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorStop
import sn.gnome.gsk4.internal.GskLinearGradientNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a linear gradient.
  */
class LinearGradientNode(raw: Ptr[GskLinearGradientNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

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
    * Retrieves the final point of the linear gradient.
    */
  def getEnd(): Ptr[graphene_point_t] = gsk_linear_gradient_node_get_end(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of color stops in the gradient.
    */
  def getNColorStops(): CUnsignedLongInt =
    gsk_linear_gradient_node_get_n_color_stops(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the initial point of the linear gradient.
    */
  def getStart(): Ptr[graphene_point_t] = gsk_linear_gradient_node_get_start(
    this.raw.asInstanceOf
  )

end LinearGradientNode

object LinearGradientNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will create a linear gradient from the
    * given points and color stops, and render that into the area given by @bounds.
    */
  def apply(
      bounds: Ptr[graphene_rect_t],
      start: Ptr[graphene_point_t],
      end: Ptr[graphene_point_t],
      color_stops: Ptr[GskColorStop],
      n_color_stops: CUnsignedLongInt
  ): LinearGradientNode = new LinearGradientNode(
    gsk_linear_gradient_node_new(
      bounds,
      start,
      end,
      color_stops,
      gsize(n_color_stops)
    ).asInstanceOf
  )
end LinearGradientNode
