package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRoundedClipNode
import sn.gnome.gsk4.internal.GskRoundedRect

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node applying a rounded rectangle clip to its single child.
  */
class RoundedClipNode(raw: Ptr[GskRoundedClipNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child node that is getting clipped by the given @node.
    */
  def getChild(): RenderNode = new RenderNode(
    gsk_rounded_clip_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the rounded rectangle used to clip the contents of the @node.
    */
  def getClip(): Ptr[GskRoundedRect] = gsk_rounded_clip_node_get_clip(
    this.raw.asInstanceOf
  )

end RoundedClipNode

object RoundedClipNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will clip the @child to the area given by @clip.
    */
  def apply(child: RenderNode, clip: Ptr[GskRoundedRect]): RoundedClipNode =
    new RoundedClipNode(
      gsk_rounded_clip_node_new(
        child.getUnsafeRawPointer().asInstanceOf,
        clip
      ).asInstanceOf
    )
end RoundedClipNode
