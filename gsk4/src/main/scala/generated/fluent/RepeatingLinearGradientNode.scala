package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorStop
import sn.gnome.gsk4.internal.GskRepeatingLinearGradientNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a repeating linear gradient.
  */
class RepeatingLinearGradientNode(raw: Ptr[GskRepeatingLinearGradientNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end RepeatingLinearGradientNode

object RepeatingLinearGradientNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will create a repeating linear gradient
    * from the given points and color stops, and render that into the area given
    * by @bounds.
    */
  def apply(
      bounds: Ptr[graphene_rect_t],
      start: Ptr[graphene_point_t],
      end: Ptr[graphene_point_t],
      color_stops: Ptr[GskColorStop],
      n_color_stops: CUnsignedLongInt
  ): RepeatingLinearGradientNode = new RepeatingLinearGradientNode(
    gsk_repeating_linear_gradient_node_new(
      bounds,
      start,
      end,
      color_stops,
      gsize(n_color_stops)
    ).asInstanceOf
  )
end RepeatingLinearGradientNode
