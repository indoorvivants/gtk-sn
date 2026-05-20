package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.{RenderNode, RoundedRect}
import sn.gnome.gsk4.internal.GskRoundedClipNode

/** A render node applying a rounded rectangle clip to its single child.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RoundedClipNode private[gnome] (raw: Ptr[GskRoundedClipNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting clipped by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_rounded_clip_node_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getChild

  /** Retrieves the rounded rectangle used to clip the contents of the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClip(): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_rounded_clip_node_get_clip(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getClip

end RoundedClipNode

object RoundedClipNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskRoundedClipNode])(using Runtime) =
    summon[Runtime].getOrCreate[RoundedClipNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new RoundedClipNode(ptr)
    )

  /** Creates a `GskRenderNode` that will clip the @child to the area given by @clip.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      child: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      clip: sn.gnome.gsk4.RoundedRect /* Some(Ptr[GskRoundedRect]) */
  )(using Runtime): RoundedClipNode =
    val raw: Ptr[Byte] = gsk_rounded_clip_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      clip.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[RoundedClipNode](
      raw,
      r => RoundedClipNode.applyUnsafe(r.asInstanceOf)
    )
  end apply
end RoundedClipNode
