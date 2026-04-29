package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskCrossFadeNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node cross fading between two child nodes.
  */
class CrossFadeNode(raw: Ptr[GskCrossFadeNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the child `GskRenderNode` at the end of the cross-fade.
    */
  def getEndChild(): RenderNode = new RenderNode(
    gsk_cross_fade_node_get_end_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the progress value of the cross fade.
    */
  def getProgress(): Float = gsk_cross_fade_node_get_progress(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the child `GskRenderNode` at the beginning of the cross-fade.
    */
  def getStartChild(): RenderNode = new RenderNode(
    gsk_cross_fade_node_get_start_child(this.raw.asInstanceOf).asInstanceOf
  )

end CrossFadeNode

object CrossFadeNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will do a cross-fade between @start and @end.
    */
  def apply(
      start: RenderNode,
      end: RenderNode,
      progress: Float
  ): CrossFadeNode = new CrossFadeNode(
    gsk_cross_fade_node_new(
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf,
      progress.asInstanceOf
    ).asInstanceOf
  )
end CrossFadeNode
