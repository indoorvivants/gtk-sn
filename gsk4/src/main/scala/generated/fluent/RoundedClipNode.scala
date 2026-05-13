package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
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
  def getChild()(using Runtime): sn.gnome.gsk4.fluent.RenderNode /* None */ =
    sn.gnome.gsk4.fluent.RenderNode.applyUnsafe(
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
  @annotation.compileTimeOnly(
    "[method get_clip/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def getClip__ = ???

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
  @annotation.compileTimeOnly(
    "[clip]: Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def apply() = ???

end RoundedClipNode
