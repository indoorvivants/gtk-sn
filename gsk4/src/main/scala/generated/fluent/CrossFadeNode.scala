package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskCrossFadeNode

class CrossFadeNode(raw: Ptr[GskCrossFadeNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEndChild(): RenderNode = new RenderNode(
    gsk_cross_fade_node_get_end_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getProgress(): Float = gsk_cross_fade_node_get_progress(
    this.raw.asInstanceOf
  )

  def getStartChild(): RenderNode = new RenderNode(
    gsk_cross_fade_node_get_start_child(this.raw.asInstanceOf).asInstanceOf
  )

end CrossFadeNode

object CrossFadeNode:
  def apply(
      start: RenderNode,
      end: RenderNode,
      progress: Float
  ): CrossFadeNode = new CrossFadeNode(
    gsk_cross_fade_node_new(
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf,
      progress.asInstanceOf
    ).asInstanceOf
  )
end CrossFadeNode
