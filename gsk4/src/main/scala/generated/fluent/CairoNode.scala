package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.{Context, Surface}
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Rect
import sn.gnome.gsk4.RenderNode
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
  def getDrawContext(): sn.gnome.cairo.Context /* None */ =
    sn.gnome.cairo.Context.fromRaw(
      gsk_cairo_node_get_draw_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getDrawContext

  /** Retrieves the Cairo surface used by the render node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurface(): sn.gnome.cairo.Surface /* None */ =
    sn.gnome.cairo.Surface.fromRaw(
      gsk_cairo_node_get_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getSurface

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
  def apply(
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  )(using Runtime): CairoNode =
    val raw: Ptr[Byte] = gsk_cairo_node_new(
      bounds.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[CairoNode](raw, r => CairoNode.applyUnsafe(r.asInstanceOf))
  end apply
end CairoNode
