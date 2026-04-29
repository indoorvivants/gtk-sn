package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Texture
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTextureNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a `GdkTexture`.
  */
class TextureNode(raw: Ptr[GskTextureNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
    */
  def getTexture(): Texture = new Texture(
    gsk_texture_node_get_texture(this.raw.asInstanceOf).asInstanceOf
  )

end TextureNode

object TextureNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will render the given
    * @texture
    *   into the area given by @bounds.
    *
    * Note that GSK applies linear filtering when textures are scaled and
    * transformed. See [class@Gsk.TextureScaleNode] for a way to influence
    * filtering.
    */
  def apply(texture: Texture, bounds: Ptr[graphene_rect_t]): TextureNode =
    new TextureNode(
      gsk_texture_node_new(
        texture.getUnsafeRawPointer().asInstanceOf,
        bounds
      ).asInstanceOf
    )
end TextureNode
