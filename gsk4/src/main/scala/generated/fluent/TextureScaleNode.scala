package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Texture
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskScalingFilter
import sn.gnome.gsk4.internal.GskTextureScaleNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a `GdkTexture`.
  */
class TextureScaleNode(raw: Ptr[GskTextureScaleNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GskScalingFilter` used when creating this `GskRenderNode`.
    */
  def getFilter(): GskScalingFilter /* None */ =
    gsk_texture_scale_node_get_filter(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
    */
  def getTexture(): Texture /* None */ = new Texture(
    gsk_texture_scale_node_get_texture(this.raw.asInstanceOf).asInstanceOf
  )

end TextureScaleNode

object TextureScaleNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a node that scales the texture to the size given by the bounds
    * using the filter and then places it at the bounds' position.
    *
    * Note that further scaling and other transformations which are applied to
    * the node will apply linear filtering to the resulting texture, as usual.
    *
    * This node is intended for tight control over scaling applied to a texture,
    * such as in image editors and requires the application to be aware of the
    * whole render tree as further transforms may be applied that conflict with
    * the desired effect of this node.
    */
  def apply(
      texture: Texture /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkTexture]) */,
      bounds: Ptr[
        graphene_rect_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      filter: GskScalingFilter /* Some(GskScalingFilter) */
  ): TextureScaleNode = new TextureScaleNode(
    gsk_texture_scale_node_new(
      texture.getUnsafeRawPointer().asInstanceOf,
      bounds,
      filter
    ).asInstanceOf
  )
end TextureScaleNode
