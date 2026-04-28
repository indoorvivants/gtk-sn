package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskInsetShadowNode
import sn.gnome.gsk4.internal.GskRoundedRect

class InsetShadowNode(raw: Ptr[GskInsetShadowNode])
    extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBlurRadius(): Float = gsk_inset_shadow_node_get_blur_radius(
    this.raw.asInstanceOf
  )

  def getColor(): Ptr[GdkRGBA] = gsk_inset_shadow_node_get_color(
    this.raw.asInstanceOf
  )

  def getDx(): Float = gsk_inset_shadow_node_get_dx(this.raw.asInstanceOf)

  def getDy(): Float = gsk_inset_shadow_node_get_dy(this.raw.asInstanceOf)

  def getOutline(): Ptr[GskRoundedRect] = gsk_inset_shadow_node_get_outline(
    this.raw.asInstanceOf
  )

  def getSpread(): Float = gsk_inset_shadow_node_get_spread(
    this.raw.asInstanceOf
  )

end InsetShadowNode

object InsetShadowNode:
  def apply(
      outline: Ptr[GskRoundedRect],
      color: Ptr[GdkRGBA],
      dx: Float,
      dy: Float,
      spread: Float,
      blur_radius: Float
  ): InsetShadowNode = new InsetShadowNode(
    gsk_inset_shadow_node_new(
      outline,
      color,
      dx.asInstanceOf,
      dy.asInstanceOf,
      spread.asInstanceOf,
      blur_radius.asInstanceOf
    ).asInstanceOf
  )
end InsetShadowNode
