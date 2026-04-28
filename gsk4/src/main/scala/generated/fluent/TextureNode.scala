package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Texture
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTextureNode

class TextureNode(raw: Ptr[GskTextureNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getTexture(): Texture = new Texture(
    gsk_texture_node_get_texture(this.raw.asInstanceOf).asInstanceOf
  )

end TextureNode

object TextureNode:
  def apply(texture: Texture, bounds: Ptr[graphene_rect_t]): TextureNode =
    new TextureNode(
      gsk_texture_node_new(
        texture.getUnsafeRawPointer().asInstanceOf,
        bounds
      ).asInstanceOf
    )
end TextureNode
