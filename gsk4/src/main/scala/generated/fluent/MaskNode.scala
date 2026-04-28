package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskMaskMode
import sn.gnome.gsk4.internal.GskMaskNode

class MaskNode(raw: Ptr[GskMaskNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getMask(): RenderNode = new RenderNode(
    gsk_mask_node_get_mask(this.raw.asInstanceOf).asInstanceOf
  )

  def getMaskMode(): GskMaskMode = gsk_mask_node_get_mask_mode(
    this.raw.asInstanceOf
  )

  def getSource(): RenderNode = new RenderNode(
    gsk_mask_node_get_source(this.raw.asInstanceOf).asInstanceOf
  )

end MaskNode

object MaskNode:
  def apply(
      source: RenderNode,
      mask: RenderNode,
      mask_mode: GskMaskMode
  ): MaskNode = new MaskNode(
    gsk_mask_node_new(
      source.getUnsafeRawPointer().asInstanceOf,
      mask.getUnsafeRawPointer().asInstanceOf,
      mask_mode
    ).asInstanceOf
  )
end MaskNode
