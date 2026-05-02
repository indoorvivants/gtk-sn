package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_surface_t
import sn.gnome.cairo.internal.cairo_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskCairoNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a Cairo surface.
  */
class CairoNode(raw: Ptr[GskCairoNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a Cairo context for drawing using the surface associated to the
    * render node.
    *
    * If no surface exists yet, a surface will be created optimized for
    * rendering to @renderer.
    */
  def getDrawContext(): Ptr[cairo_t] /* None */ =
    gsk_cairo_node_get_draw_context(this.raw.asInstanceOf[Ptr[GskRenderNode]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the Cairo surface used by the render node.
    */
  def getSurface(): Ptr[cairo_surface_t] /* None */ =
    gsk_cairo_node_get_surface(this.raw.asInstanceOf[Ptr[GskRenderNode]])

end CairoNode

object CairoNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will render a cairo surface into the area
    * given by @bounds.
    *
    * You can draw to the cairo surface using
    * [method@Gsk.CairoNode.get_draw_context].
    */
  def apply(
      bounds: Ptr[
        graphene_rect_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): CairoNode = new CairoNode(gsk_cairo_node_new(bounds).asInstanceOf)
end CairoNode
