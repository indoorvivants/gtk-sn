package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBlurNode

/** A render node applying a blur effect to its single child.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BlurNode(raw: Ptr[GskBlurNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the child `GskRenderNode` of the blur @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_blur_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the blur radius of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRadius(): Float /* None */ = gsk_blur_node_get_radius(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

end BlurNode

object BlurNode:
  /** Creates a render node that blurs the child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      radius: Float /* Some(Float) */
  )(using Runtime): BlurNode =
    val raw: Ptr[Byte] = gsk_blur_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      radius.asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[BlurNode](raw, r => new BlurNode(r.asInstanceOf))
  end apply
end BlurNode
