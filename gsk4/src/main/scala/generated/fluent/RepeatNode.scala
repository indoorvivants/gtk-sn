package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRepeatNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node repeating its single child node.
  */
class RepeatNode(raw: Ptr[GskRepeatNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the child of @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_repeat_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the bounding rectangle of the child of @node.
    */
  def getChildBounds(): Ptr[graphene_rect_t] /* None */ =
    gsk_repeat_node_get_child_bounds(this.raw.asInstanceOf[Ptr[GskRenderNode]])

end RepeatNode

object RepeatNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will repeat the drawing of @child across
    * the given @bounds.
    */
  def apply(
      bounds: Ptr[
        graphene_rect_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      child_bounds: Option[Ptr[
        graphene_rect_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */ ]
  ): RepeatNode = new RepeatNode(
    gsk_repeat_node_new(
      bounds,
      child.getUnsafeRawPointer().asInstanceOf,
      child_bounds
        .map[Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]](o => o)
        .getOrElse(
          null.asInstanceOf[Ptr[
            _root_.sn.gnome.graphene.internal.graphene_rect_t
          ]]
        )
    ).asInstanceOf
  )
end RepeatNode
