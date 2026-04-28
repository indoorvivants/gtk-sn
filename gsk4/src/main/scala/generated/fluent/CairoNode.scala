package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_surface_t
import sn.gnome.cairo.internal.cairo_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskCairoNode

class CairoNode(raw: Ptr[GskCairoNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDrawContext(): Ptr[cairo_t] = gsk_cairo_node_get_draw_context(
    this.raw.asInstanceOf
  )

  def getSurface(): Ptr[cairo_surface_t] = gsk_cairo_node_get_surface(
    this.raw.asInstanceOf
  )

end CairoNode

object CairoNode:
  def apply(bounds: Ptr[graphene_rect_t]): CairoNode = new CairoNode(
    gsk_cairo_node_new(bounds).asInstanceOf
  )
end CairoNode
