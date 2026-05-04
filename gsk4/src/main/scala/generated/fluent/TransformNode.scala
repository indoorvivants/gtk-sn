package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTransformNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node applying a `GskTransform` to its single child node.
  */
class TransformNode(raw: Ptr[GskTransformNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child node that is getting transformed by the given @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_transform_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GskTransform` used by the @node.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Transform), @type -> DataRecord(GskTransform*)))"
  )
  def getTransform__ = ???

end TransformNode

object TransformNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will transform the given @child with the
    * given @transform.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Transform), @type -> DataRecord(GskTransform*)))"
  )
  def `new`() = ???

end TransformNode
