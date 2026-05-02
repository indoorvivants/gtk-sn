package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskClipNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node applying a rectangular clip to its single child node.
  */
class ClipNode(raw: Ptr[GskClipNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child node that is getting clipped by the given @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_clip_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the clip rectangle for @node.
    */
  def getClip(): Ptr[graphene_rect_t] /* None */ = gsk_clip_node_get_clip(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

end ClipNode

object ClipNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will clip the @child to the area given by @clip.
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      clip: Ptr[
        graphene_rect_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): ClipNode = new ClipNode(
    gsk_clip_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      clip
    ).asInstanceOf
  )
end ClipNode
