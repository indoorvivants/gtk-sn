package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskMaskMode
import sn.gnome.gsk4.internal.GskMaskNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node masking one child node with another.
  */
class MaskNode(raw: Ptr[GskMaskNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the mask `GskRenderNode` child of the @node.
    */
  def getMask(): RenderNode = new RenderNode(
    gsk_mask_node_get_mask(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the mask mode used by @node.
    */
  def getMaskMode(): GskMaskMode = gsk_mask_node_get_mask_mode(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the source `GskRenderNode` child of the @node.
    */
  def getSource(): RenderNode = new RenderNode(
    gsk_mask_node_get_source(this.raw.asInstanceOf).asInstanceOf
  )

end MaskNode

object MaskNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will mask a given node by another.
    *
    * The @mask_mode determines how the 'mask values' are derived from the
    * colors of the @mask. Applying the mask consists of multiplying the 'mask
    * value' with the alpha of the source.
    */
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
