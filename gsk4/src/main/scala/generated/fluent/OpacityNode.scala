package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskOpacityNode

/** A render node controlling the opacity of its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OpacityNode private[gnome] (raw: Ptr[GskOpacityNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting opacityed by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.fluent.RenderNode /* None */ =
    sn.gnome.gsk4.fluent.RenderNode.applyUnsafe(
      gsk_opacity_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Gets the transparency factor for an opacity node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOpacity(): Float /* None */ =
    gsk_opacity_node_get_opacity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getOpacity

end OpacityNode

object OpacityNode:
  def applyUnsafe(ptr: Ptr[GskOpacityNode])(using Runtime) =
    summon[Runtime].getOrCreate[OpacityNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new OpacityNode(ptr)
    )

  /** Creates a `GskRenderNode` that will drawn the @child with reduced
    * @opacity.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: sn.gnome.gsk4.fluent.RenderNode /* Some(Ptr[GskRenderNode]) */,
      opacity: Float /* Some(Float) */
  )(using Runtime): OpacityNode =
    val raw: Ptr[Byte] = gsk_opacity_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      opacity.asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[OpacityNode](
      raw,
      r => OpacityNode.applyUnsafe(r.asInstanceOf)
    )
  end apply
end OpacityNode
