package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTransform
import sn.gnome.gsk4.internal.GskTransformNode

class TransformNode(raw: Ptr[GskTransformNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): RenderNode = new RenderNode(
    gsk_transform_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getTransform(): Ptr[GskTransform] = gsk_transform_node_get_transform(
    this.raw.asInstanceOf
  )

end TransformNode

object TransformNode:
  def apply(child: RenderNode, transform: Ptr[GskTransform]): TransformNode =
    new TransformNode(
      gsk_transform_node_new(
        child.getUnsafeRawPointer().asInstanceOf,
        transform
      ).asInstanceOf
    )
end TransformNode
