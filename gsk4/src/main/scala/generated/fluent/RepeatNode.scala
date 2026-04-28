package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRepeatNode

class RepeatNode(raw: Ptr[GskRepeatNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_repeat_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getChildBounds(): Ptr[graphene_rect_t] = gsk_repeat_node_get_child_bounds(
    this.raw.asInstanceOf
  )

end RepeatNode

object RepeatNode:
  def apply(
      bounds: Ptr[graphene_rect_t],
      child: RenderNode,
      child_bounds: Ptr[graphene_rect_t]
  ): RepeatNode = new RepeatNode(
    gsk_repeat_node_new(
      bounds,
      child.getUnsafeRawPointer().asInstanceOf,
      child_bounds
    ).asInstanceOf
  )
end RepeatNode
