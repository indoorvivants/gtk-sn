package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.{BlendMode, RenderNode}
import sn.gnome.gsk4.internal.GskBlendNode

/** A render node applying a blending function between its two child nodes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BlendNode private[gnome] (raw: Ptr[GskBlendNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the blend mode used by @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBlendMode(): sn.gnome.gsk4.BlendMode /* None */ =
    sn.gnome.gsk4.BlendMode.fromRaw(
      gsk_blend_node_get_blend_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getBlendMode

  /** Retrieves the bottom `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBottomChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_blend_node_get_bottom_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getBottomChild

  /** Retrieves the top `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTopChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_blend_node_get_top_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getTopChild

end BlendNode

object BlendNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskBlendNode])(using Runtime) =
    summon[Runtime].getOrCreate[BlendNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BlendNode(ptr)
    )

  /** Creates a `GskRenderNode` that will use @blend_mode to blend the @top node
    * onto the @bottom node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      bottom: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      top: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      blend_mode: sn.gnome.gsk4.BlendMode /* Some(GskBlendMode) */
  )(using Runtime): BlendNode =
    val raw: Ptr[Byte] = gsk_blend_node_new(
      bottom.getUnsafeRawPointer().asInstanceOf,
      top.getUnsafeRawPointer().asInstanceOf,
      blend_mode.raw
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[BlendNode](raw, r => BlendNode.applyUnsafe(r.asInstanceOf))
  end apply
end BlendNode
