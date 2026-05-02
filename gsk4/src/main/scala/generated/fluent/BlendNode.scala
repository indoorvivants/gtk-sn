package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBlendMode
import sn.gnome.gsk4.internal.GskBlendNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node applying a blending function between its two child nodes.
  */
class BlendNode(raw: Ptr[GskBlendNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the blend mode used by @node.
    */
  def getBlendMode(): GskBlendMode /* None */ = gsk_blend_node_get_blend_mode(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the bottom `GskRenderNode` child of the @node.
    */
  def getBottomChild(): RenderNode /* None */ = new RenderNode(
    gsk_blend_node_get_bottom_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the top `GskRenderNode` child of the @node.
    */
  def getTopChild(): RenderNode /* None */ = new RenderNode(
    gsk_blend_node_get_top_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

end BlendNode

object BlendNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will use @blend_mode to blend the @top node
    * onto the @bottom node.
    */
  def apply(
      bottom: RenderNode /* Some(Ptr[GskRenderNode]) */,
      top: RenderNode /* Some(Ptr[GskRenderNode]) */,
      blend_mode: GskBlendMode /* Some(GskBlendMode) */
  ): BlendNode = new BlendNode(
    gsk_blend_node_new(
      bottom.getUnsafeRawPointer().asInstanceOf,
      top.getUnsafeRawPointer().asInstanceOf,
      blend_mode
    ).asInstanceOf
  )
end BlendNode
