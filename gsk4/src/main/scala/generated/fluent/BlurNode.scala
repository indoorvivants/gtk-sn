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
class BlurNode private[gnome] (raw: Ptr[GskBlurNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the child `GskRenderNode` of the blur @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.fluent.RenderNode /* None */ =
    sn.gnome.gsk4.fluent.RenderNode.applyUnsafe(
      gsk_blur_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the blur radius of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRadius(): Float /* None */ =
    gsk_blur_node_get_radius(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getRadius

end BlurNode

object BlurNode:
  def applyUnsafe(ptr: Ptr[GskBlurNode])(using Runtime) = summon[Runtime]
    .getOrCreate[BlurNode](ptr.asInstanceOf[Ptr[Byte]], p => new BlurNode(ptr))

  /** Creates a render node that blurs the child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: sn.gnome.gsk4.fluent.RenderNode /* Some(Ptr[GskRenderNode]) */,
      radius: Float /* Some(Float) */
  )(using Runtime): BlurNode =
    val raw: Ptr[Byte] = gsk_blur_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      radius.asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[BlurNode](raw, r => BlurNode.applyUnsafe(r.asInstanceOf))
  end apply
end BlurNode
