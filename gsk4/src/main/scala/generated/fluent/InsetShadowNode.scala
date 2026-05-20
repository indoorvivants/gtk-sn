package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.RGBA
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.{RenderNode, RoundedRect}
import sn.gnome.gsk4.internal.GskInsetShadowNode

/** A render node for an inset shadow.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InsetShadowNode private[gnome] (raw: Ptr[GskInsetShadowNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the blur radius to apply to the shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBlurRadius(): Float /* None */ =
    gsk_inset_shadow_node_get_blur_radius(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getBlurRadius

  /** Retrieves the color of the inset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColor(): sn.gnome.gdk4.RGBA /* None */ =
    sn.gnome.gdk4.RGBA.fromRaw(
      gsk_inset_shadow_node_get_color(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getColor

  /** Retrieves the horizontal offset of the inset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDx(): Float /* None */ =
    gsk_inset_shadow_node_get_dx(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getDx

  /** Retrieves the vertical offset of the inset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDy(): Float /* None */ =
    gsk_inset_shadow_node_get_dy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getDy

  /** Retrieves the outline rectangle of the inset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOutline(): sn.gnome.gsk4.RoundedRect /* None */ =
    sn.gnome.gsk4.RoundedRect.fromRaw(
      gsk_inset_shadow_node_get_outline(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getOutline

  /** Retrieves how much the shadow spreads inwards.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpread(): Float /* None */ =
    gsk_inset_shadow_node_get_spread(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    )
  end getSpread

end InsetShadowNode

object InsetShadowNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskInsetShadowNode])(using Runtime) =
    summon[Runtime].getOrCreate[InsetShadowNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new InsetShadowNode(ptr)
    )

  /** Creates a `GskRenderNode` that will render an inset shadow into the box
    * given by @outline.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      outline: sn.gnome.gsk4.RoundedRect /* Some(Ptr[GskRoundedRect]) */,
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      dx: Float /* Some(Float) */,
      dy: Float /* Some(Float) */,
      spread: Float /* Some(Float) */,
      blur_radius: Float /* Some(Float) */
  )(using Runtime): InsetShadowNode =
    val raw: Ptr[Byte] = gsk_inset_shadow_node_new(
      outline.getUnsafeRawPointer().asInstanceOf,
      color.getUnsafeRawPointer().asInstanceOf,
      dx.asInstanceOf,
      dy.asInstanceOf,
      spread.asInstanceOf,
      blur_radius.asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[InsetShadowNode](
      raw,
      r => InsetShadowNode.applyUnsafe(r.asInstanceOf)
    )
  end apply
end InsetShadowNode
