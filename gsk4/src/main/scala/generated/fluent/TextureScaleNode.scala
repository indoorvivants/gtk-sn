package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gsk4.fluent.{RenderNode, ScalingFilter}
import sn.gnome.gsk4.internal.GskTextureScaleNode

/** A render node for a `GdkTexture`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextureScaleNode(raw: Ptr[GskTextureScaleNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the `GskScalingFilter` used when creating this `GskRenderNode`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilter(): ScalingFilter /* None */ = ScalingFilter.fromRaw(
    gsk_texture_scale_node_get_filter(this.raw.asInstanceOf[Ptr[GskRenderNode]])
  )

  /** Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTexture(): Texture /* None */ = new Texture(
    gsk_texture_scale_node_get_texture(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

end TextureScaleNode

object TextureScaleNode:
  /** Creates a node that scales the texture to the size given by the bounds
    * using the filter and then places it at the bounds' position.
    *
    * Note that further scaling and other transformations which are applied to
    * the node will apply linear filtering to the resulting texture, as usual.
    *
    * This node is intended for tight control over scaling applied to a texture,
    * such as in image editors and requires the application to be aware of the
    * whole render tree as further transforms may be applied that conflict with
    * the desired effect of this node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def `new`() = ???

end TextureScaleNode
