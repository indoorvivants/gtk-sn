package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskCrossFadeNode

/** A render node cross fading between two child nodes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CrossFadeNode private[gnome] (raw: Ptr[GskCrossFadeNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the child `GskRenderNode` at the end of the cross-fade.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEndChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_cross_fade_node_get_end_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getEndChild

  /** Retrieves the progress value of the cross fade.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProgress(): Float /* None */ =
    gsk_cross_fade_node_get_progress(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getProgress

  /** Retrieves the child `GskRenderNode` at the beginning of the cross-fade.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartChild()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_cross_fade_node_get_start_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getStartChild

end CrossFadeNode

object CrossFadeNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskCrossFadeNode])(using Runtime) =
    summon[Runtime].getOrCreate[CrossFadeNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CrossFadeNode(ptr)
    )

  /** Creates a `GskRenderNode` that will do a cross-fade between @start and @end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      start: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      end: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */,
      progress: Float /* Some(Float) */
  )(using Runtime): CrossFadeNode =
    val raw: Ptr[Byte] = gsk_cross_fade_node_new(
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf,
      progress.asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[CrossFadeNode](
      raw,
      r => CrossFadeNode.applyUnsafe(r.asInstanceOf)
    )
  end apply
end CrossFadeNode
