package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Rect
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskRepeatNode

/** A render node repeating its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RepeatNode private[gnome] (raw: Ptr[GskRepeatNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the child of @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_repeat_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the bounding rectangle of the child of @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildBounds(): sn.gnome.graphene.Rect /* None */ =
    sn.gnome.graphene.Rect.fromRaw(
      gsk_repeat_node_get_child_bounds(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getChildBounds

end RepeatNode

object RepeatNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskRepeatNode])(using Runtime) =
    summon[Runtime].getOrCreate[RepeatNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new RepeatNode(ptr)
    )

  /** Creates a `GskRenderNode` that will repeat the drawing of @child across
    * the given @bounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      child: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      child_bounds: Option[
        sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
      ]
  )(using Runtime): RepeatNode =
    val raw: Ptr[Byte] = gsk_repeat_node_new(
      bounds.getUnsafeRawPointer().asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      child_bounds
        .map[Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[
            _root_.sn.gnome.graphene.internal.graphene_rect_t
          ]]
        )
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[RepeatNode](raw, r => RepeatNode.applyUnsafe(r.asInstanceOf))
  end apply
end RepeatNode
