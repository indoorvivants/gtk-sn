package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def getDrawContext__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the Cairo surface used by the render node.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))"
  )
  def getSurface__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def `new`() = ???

end CairoNode
