package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskCairoNode

/** A render node for a Cairo surface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CairoNode private[gnome] (raw: Ptr[GskCairoNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Creates a Cairo context for drawing using the surface associated to the
    * render node.
    *
    * If no surface exists yet, a surface will be created optimized for
    * rendering to @renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_draw_context/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  private def getDrawContext__ = ???

  /** Retrieves the Cairo surface used by the render node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_surface/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))"
  )
  private def getSurface__ = ???

end CairoNode

object CairoNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskCairoNode])(using Runtime) =
    summon[Runtime].getOrCreate[CairoNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CairoNode(ptr)
    )

  /** Creates a `GskRenderNode` that will render a cairo surface into the area
    * given by @bounds.
    *
    * You can draw to the cairo surface using
    * [method@Gsk.CairoNode.get_draw_context].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def apply() = ???

end CairoNode
