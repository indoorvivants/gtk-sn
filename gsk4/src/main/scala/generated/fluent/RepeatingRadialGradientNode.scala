package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorStop
import sn.gnome.gsk4.internal.GskRepeatingRadialGradientNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a repeating radial gradient.
  */
class RepeatingRadialGradientNode(raw: Ptr[GskRepeatingRadialGradientNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end RepeatingRadialGradientNode

object RepeatingRadialGradientNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that draws a repeating radial gradient.
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
  ): RepeatingRadialGradientNode = new RepeatingRadialGradientNode(
    gsk_repeating_radial_gradient_node_new(
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
end RepeatingRadialGradientNode
