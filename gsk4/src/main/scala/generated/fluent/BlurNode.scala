package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBlurNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node applying a blur effect to its single child.
  */
class BlurNode(raw: Ptr[GskBlurNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the child `GskRenderNode` of the blur @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_blur_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the blur radius of the @node.
    */
  def getRadius(): Float /* None */ = gsk_blur_node_get_radius(
    this.raw.asInstanceOf
  )

end BlurNode

object BlurNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node that blurs the child.
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      radius: Float /* Some(Float) */
  ): BlurNode = new BlurNode(
    gsk_blur_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      radius.asInstanceOf
    ).asInstanceOf
  )
end BlurNode
