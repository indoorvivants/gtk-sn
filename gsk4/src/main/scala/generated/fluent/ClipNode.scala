package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskClipNode

class ClipNode(raw: Ptr[GskClipNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_clip_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getClip(): Ptr[graphene_rect_t] = gsk_clip_node_get_clip(
    this.raw.asInstanceOf
  )

end ClipNode

object ClipNode:
  def apply(child: RenderNode, clip: Ptr[graphene_rect_t]): ClipNode =
    new ClipNode(
      gsk_clip_node_new(
        child.getUnsafeRawPointer().asInstanceOf,
        clip
      ).asInstanceOf
    )
end ClipNode
