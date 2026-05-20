package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Rect
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskClipNode

/** A render node applying a rectangular clip to its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ClipNode private[gnome] (raw: Ptr[GskClipNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting clipped by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_clip_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the clip rectangle for @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClip(): sn.gnome.graphene.Rect /* None */ =
    sn.gnome.graphene.Rect.fromRaw(
      gsk_clip_node_get_clip(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getClip

end ClipNode

object ClipNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskClipNode])(using Runtime) = summon[Runtime]
    .getOrCreate[ClipNode](ptr.asInstanceOf[Ptr[Byte]], p => new ClipNode(ptr))

  /** Creates a `GskRenderNode` that will clip the @child to the area given by @clip.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      clip: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  )(using Runtime): ClipNode =
    val raw: Ptr[Byte] = gsk_clip_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      clip.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ClipNode](raw, r => ClipNode.applyUnsafe(r.asInstanceOf))
  end apply
end ClipNode
