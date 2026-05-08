package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.{BlendMode, RenderNode}
import sn.gnome.gsk4.internal.GskBlendNode

/** A render node applying a blending function between its two child nodes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BlendNode(raw: Ptr[GskBlendNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the blend mode used by @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBlendMode(): BlendMode /* None */ = BlendMode.fromRaw(
    gsk_blend_node_get_blend_mode(this.raw.asInstanceOf[Ptr[GskRenderNode]])
  )

  /** Retrieves the bottom `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBottomChild(): RenderNode /* None */ = new RenderNode(
    gsk_blend_node_get_bottom_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the top `GskRenderNode` child of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTopChild(): RenderNode /* None */ = new RenderNode(
    gsk_blend_node_get_top_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

end BlendNode

object BlendNode:
  /** Creates a `GskRenderNode` that will use @blend_mode to blend the @top node
    * onto the @bottom node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      bottom: RenderNode /* Some(Ptr[GskRenderNode]) */,
      top: RenderNode /* Some(Ptr[GskRenderNode]) */,
      blend_mode: BlendMode /* Some(GskBlendMode) */
  )(using Runtime): BlendNode =
    val raw: Ptr[Byte] = gsk_blend_node_new(
      bottom.getUnsafeRawPointer().asInstanceOf,
      top.getUnsafeRawPointer().asInstanceOf,
      blend_mode.raw
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[BlendNode](raw, r => new BlendNode(r.asInstanceOf))
  end apply
end BlendNode
