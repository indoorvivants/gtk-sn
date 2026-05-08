package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.{MaskMode, RenderNode}
import sn.gnome.gsk4.internal.GskMaskNode

/** A render node masking one child node with another.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MaskNode(raw: Ptr[GskMaskNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the mask `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMask(): RenderNode /* None */ = new RenderNode(
    gsk_mask_node_get_mask(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the mask mode used by @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaskMode(): MaskMode /* None */ = MaskMode.fromRaw(
    gsk_mask_node_get_mask_mode(this.raw.asInstanceOf[Ptr[GskRenderNode]])
  )

  /** Retrieves the source `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSource(): RenderNode /* None */ = new RenderNode(
    gsk_mask_node_get_source(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

end MaskNode

object MaskNode:
  /** Creates a `GskRenderNode` that will mask a given node by another.
    *
    * The @mask_mode determines how the 'mask values' are derived from the
    * colors of the @mask. Applying the mask consists of multiplying the 'mask
    * value' with the alpha of the source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      source: RenderNode /* Some(Ptr[GskRenderNode]) */,
      mask: RenderNode /* Some(Ptr[GskRenderNode]) */,
      mask_mode: MaskMode /* Some(GskMaskMode) */
  )(using Runtime): MaskNode =
    val raw: Ptr[Byte] = gsk_mask_node_new(
      source.getUnsafeRawPointer().asInstanceOf,
      mask.getUnsafeRawPointer().asInstanceOf,
      mask_mode.raw
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MaskNode](raw, r => new MaskNode(r.asInstanceOf))
  end apply
end MaskNode
