package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBlendMode
import sn.gnome.gsk4.internal.GskBlendNode

class BlendNode(raw: Ptr[GskBlendNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBlendMode(): GskBlendMode = gsk_blend_node_get_blend_mode(
    this.raw.asInstanceOf
  )

  def getBottomChild(): RenderNode = new RenderNode(
    gsk_blend_node_get_bottom_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getTopChild(): RenderNode = new RenderNode(
    gsk_blend_node_get_top_child(this.raw.asInstanceOf).asInstanceOf
  )

end BlendNode

object BlendNode:
  def apply(
      bottom: RenderNode,
      top: RenderNode,
      blend_mode: GskBlendMode
  ): BlendNode = new BlendNode(
    gsk_blend_node_new(
      bottom.getUnsafeRawPointer().asInstanceOf,
      top.getUnsafeRawPointer().asInstanceOf,
      blend_mode
    ).asInstanceOf
  )
end BlendNode
