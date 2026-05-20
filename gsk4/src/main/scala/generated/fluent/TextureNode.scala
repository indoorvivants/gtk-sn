package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Texture
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Rect
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskTextureNode

/** A render node for a `GdkTexture`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextureNode private[gnome] (raw: Ptr[GskTextureNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTexture()(using Runtime): sn.gnome.gdk4.Texture /* None */ =
    sn.gnome.gdk4.Texture.applyUnsafe(
      gsk_texture_node_get_texture(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getTexture

end TextureNode

object TextureNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskTextureNode])(using Runtime) =
    summon[Runtime].getOrCreate[TextureNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TextureNode(ptr)
    )

  /** Creates a `GskRenderNode` that will render the given
    * @texture
    *   into the area given by @bounds.
    *
    * Note that GSK applies linear filtering when textures are scaled and
    * transformed. See [class@Gsk.TextureScaleNode] for a way to influence
    * filtering.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      texture: sn.gnome.gdk4.Texture /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkTexture]) */,
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  )(using Runtime): TextureNode =
    val raw: Ptr[Byte] = gsk_texture_node_new(
      texture.getUnsafeRawPointer().asInstanceOf,
      bounds.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[TextureNode](
      raw,
      r => TextureNode.applyUnsafe(r.asInstanceOf)
    )
  end apply
end TextureNode
