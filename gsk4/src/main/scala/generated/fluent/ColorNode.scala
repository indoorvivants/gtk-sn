package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a solid color.
  */
class ColorNode(raw: Ptr[GskColorNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color of the given @node.
    */
  def getColor(): Ptr[GdkRGBA] /* None */ = gsk_color_node_get_color(
    this.raw.asInstanceOf
  )

end ColorNode

object ColorNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will render the color specified by @rgba
    * into the area given by @bounds.
    */
  def apply(
      rgba: Ptr[GdkRGBA] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      bounds: Ptr[
        graphene_rect_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): ColorNode = new ColorNode(gsk_color_node_new(rgba, bounds).asInstanceOf)
end ColorNode
