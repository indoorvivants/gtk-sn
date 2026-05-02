package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskOpacityNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node controlling the opacity of its single child node.
  */
class OpacityNode(raw: Ptr[GskOpacityNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child node that is getting opacityed by the given @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_opacity_node_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the transparency factor for an opacity node.
    */
  def getOpacity(): Float /* None */ = gsk_opacity_node_get_opacity(
    this.raw.asInstanceOf
  )

end OpacityNode

object OpacityNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will drawn the @child with reduced
    * @opacity.
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      opacity: Float /* Some(Float) */
  ): OpacityNode = new OpacityNode(
    gsk_opacity_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      opacity.asInstanceOf
    ).asInstanceOf
  )
end OpacityNode
