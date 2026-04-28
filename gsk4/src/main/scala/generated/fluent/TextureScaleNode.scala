package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Texture
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskScalingFilter
import sn.gnome.gsk4.internal.GskTextureScaleNode

class TextureScaleNode(raw: Ptr[GskTextureScaleNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFilter(): GskScalingFilter = gsk_texture_scale_node_get_filter(
    this.raw.asInstanceOf
  )

  def getTexture(): Texture = new Texture(
    gsk_texture_scale_node_get_texture(this.raw.asInstanceOf).asInstanceOf
  )

end TextureScaleNode

object TextureScaleNode:
  def apply(
      texture: Texture,
      bounds: Ptr[graphene_rect_t],
      filter: GskScalingFilter
  ): TextureScaleNode = new TextureScaleNode(
    gsk_texture_scale_node_new(
      texture.getUnsafeRawPointer().asInstanceOf,
      bounds,
      filter
    ).asInstanceOf
  )
end TextureScaleNode
