package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskCrossFadeNode

/** A render node cross fading between two child nodes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CrossFadeNode(raw: Ptr[GskCrossFadeNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the child `GskRenderNode` at the end of the cross-fade.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEndChild(): RenderNode /* None */ = new RenderNode(
    gsk_cross_fade_node_get_end_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the progress value of the cross fade.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProgress(): Float /* None */ = gsk_cross_fade_node_get_progress(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** Retrieves the child `GskRenderNode` at the beginning of the cross-fade.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartChild(): RenderNode /* None */ = new RenderNode(
    gsk_cross_fade_node_get_start_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

end CrossFadeNode

object CrossFadeNode:
  /** Creates a `GskRenderNode` that will do a cross-fade between @start and @end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      start: RenderNode /* Some(Ptr[GskRenderNode]) */,
      end: RenderNode /* Some(Ptr[GskRenderNode]) */,
      progress: Float /* Some(Float) */
  )(using Runtime): CrossFadeNode =
    val raw: Ptr[Byte] = gsk_cross_fade_node_new(
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf,
      progress.asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[CrossFadeNode](raw, r => new CrossFadeNode(r.asInstanceOf))
  end apply
end CrossFadeNode
