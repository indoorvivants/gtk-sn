package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_region_t
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRenderer

class Renderer(raw: Ptr[GskRenderer]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getSurface(): Surface = new Surface(
    gsk_renderer_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  def isRealized(): Boolean =
    gsk_renderer_is_realized(this.raw.asInstanceOf).value.!=(0)

  def realize(surface: Surface): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gsk_renderer_realize(
      this.raw.asInstanceOf,
      surface.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def render(root: RenderNode, region: Ptr[cairo_region_t]): Unit =
    gsk_renderer_render(
      this.raw.asInstanceOf,
      root.getUnsafeRawPointer().asInstanceOf,
      region
    )

  def renderTexture(root: RenderNode, viewport: Ptr[graphene_rect_t]): Texture =
    new Texture(
      gsk_renderer_render_texture(
        this.raw.asInstanceOf,
        root.getUnsafeRawPointer().asInstanceOf,
        viewport
      ).asInstanceOf
    )

  def unrealize(): Unit = gsk_renderer_unrealize(this.raw.asInstanceOf)

end Renderer

object Renderer:
  def forSurface(surface: Surface): Renderer = new Renderer(
    gsk_renderer_new_for_surface(
      surface.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end Renderer
