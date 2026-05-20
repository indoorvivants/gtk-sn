package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.{RenderNode, Transform}
import sn.gnome.gsk4.internal.GskTransformNode

/** A render node applying a `GskTransform` to its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TransformNode private[gnome] (raw: Ptr[GskTransformNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting transformed by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_transform_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the `GskTransform` used by the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransform(): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gsk_transform_node_get_transform(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getTransform

end TransformNode

object TransformNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskTransformNode])(using Runtime) =
    summon[Runtime].getOrCreate[TransformNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TransformNode(ptr)
    )

  /** Creates a `GskRenderNode` that will transform the given @child with the
    * given @transform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      transform: sn.gnome.gsk4.Transform /* Some(Ptr[GskTransform]) */
  )(using Runtime): TransformNode =
    val raw: Ptr[Byte] = gsk_transform_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      transform.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[TransformNode](
      raw,
      r => TransformNode.applyUnsafe(r.asInstanceOf)
    )
  end apply
end TransformNode
