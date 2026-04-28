package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskOpacityNode

class OpacityNode(raw: Ptr[GskOpacityNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_opacity_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getOpacity(): Float = gsk_opacity_node_get_opacity(this.raw.asInstanceOf)

end OpacityNode

object OpacityNode:
  def apply(child: RenderNode, opacity: Float): OpacityNode = new OpacityNode(
    gsk_opacity_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      opacity.asInstanceOf
    ).asInstanceOf
  )
end OpacityNode
