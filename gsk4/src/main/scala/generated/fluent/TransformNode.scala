package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTransformNode

/** A render node applying a `GskTransform` to its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TransformNode(raw: Ptr[GskTransformNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting transformed by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_transform_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the `GskTransform` used by the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_transform/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def getTransform__ = ???

end TransformNode

object TransformNode:
  /** Creates a `GskRenderNode` that will transform the given @child with the
    * given @transform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[transform]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def `new`() = ???

end TransformNode
