package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBlurNode

class BlurNode(raw: Ptr[GskBlurNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_blur_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getRadius(): Float = gsk_blur_node_get_radius(this.raw.asInstanceOf)

end BlurNode

object BlurNode:
  def apply(child: RenderNode, radius: Float): BlurNode = new BlurNode(
    gsk_blur_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      radius.asInstanceOf
    ).asInstanceOf
  )
end BlurNode
