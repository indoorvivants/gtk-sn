package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.RGBA
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Rect
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskColorNode

/** A render node for a solid color.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorNode private[gnome] (raw: Ptr[GskColorNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the color of the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColor(): sn.gnome.gdk4.RGBA /* None */ =
    sn.gnome.gdk4.RGBA.fromRaw(
      gsk_color_node_get_color(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getColor

end ColorNode

object ColorNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskColorNode])(using Runtime) =
    summon[Runtime].getOrCreate[ColorNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColorNode(ptr)
    )

  /** Creates a `GskRenderNode` that will render the color specified by @rgba
    * into the area given by @bounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      rgba: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  )(using Runtime): ColorNode =
    val raw: Ptr[Byte] = gsk_color_node_new(
      rgba.getUnsafeRawPointer().asInstanceOf,
      bounds.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ColorNode](raw, r => ColorNode.applyUnsafe(r.asInstanceOf))
  end apply
end ColorNode
