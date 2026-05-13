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
class MaskNode private[gnome] (raw: Ptr[GskMaskNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the mask `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMask()(using Runtime): sn.gnome.gsk4.fluent.RenderNode /* None */ =
    sn.gnome.gsk4.fluent.RenderNode.applyUnsafe(
      gsk_mask_node_get_mask(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getMask

  /** Retrieves the mask mode used by @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaskMode(): MaskMode /* None */ =
    MaskMode.fromRaw(
      gsk_mask_node_get_mask_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getMaskMode

  /** Retrieves the source `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSource()(using Runtime): sn.gnome.gsk4.fluent.RenderNode /* None */ =
    sn.gnome.gsk4.fluent.RenderNode.applyUnsafe(
      gsk_mask_node_get_source(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getSource

end MaskNode

object MaskNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskMaskNode])(using Runtime) = summon[Runtime]
    .getOrCreate[MaskNode](ptr.asInstanceOf[Ptr[Byte]], p => new MaskNode(ptr))

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
      source: sn.gnome.gsk4.fluent.RenderNode /* Some(Ptr[GskRenderNode]) */,
      mask: sn.gnome.gsk4.fluent.RenderNode /* Some(Ptr[GskRenderNode]) */,
      mask_mode: MaskMode /* Some(GskMaskMode) */
  )(using Runtime): MaskNode =
    val raw: Ptr[Byte] = gsk_mask_node_new(
      source.getUnsafeRawPointer().asInstanceOf,
      mask.getUnsafeRawPointer().asInstanceOf,
      mask_mode.raw
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MaskNode](raw, r => MaskNode.applyUnsafe(r.asInstanceOf))
  end apply
end MaskNode
