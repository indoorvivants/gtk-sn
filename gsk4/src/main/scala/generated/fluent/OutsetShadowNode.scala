package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskOutsetShadowNode
import sn.gnome.gsk4.internal.GskRoundedRect

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for an outset shadow.
  */
class OutsetShadowNode(raw: Ptr[GskOutsetShadowNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the blur radius of the shadow.
    */
  def getBlurRadius(): Float /* None */ =
    gsk_outset_shadow_node_get_blur_radius(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color of the outset shadow.
    */
  def getColor(): Ptr[GdkRGBA] /* None */ = gsk_outset_shadow_node_get_color(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the horizontal offset of the outset shadow.
    */
  def getDx(): Float /* None */ = gsk_outset_shadow_node_get_dx(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the vertical offset of the outset shadow.
    */
  def getDy(): Float /* None */ = gsk_outset_shadow_node_get_dy(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the outline rectangle of the outset shadow.
    */
  def getOutline(): Ptr[GskRoundedRect] /* None */ =
    gsk_outset_shadow_node_get_outline(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves how much the shadow spreads outwards.
    */
  def getSpread(): Float /* None */ = gsk_outset_shadow_node_get_spread(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

end OutsetShadowNode

object OutsetShadowNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will render an outset shadow around the box
    * given by @outline.
    */
  def apply(
      outline: Ptr[GskRoundedRect] /* Some(Ptr[GskRoundedRect]) */,
      color: Ptr[
        GdkRGBA
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      dx: Float /* Some(Float) */,
      dy: Float /* Some(Float) */,
      spread: Float /* Some(Float) */,
      blur_radius: Float /* Some(Float) */
  ): OutsetShadowNode = new OutsetShadowNode(
    gsk_outset_shadow_node_new(
      outline,
      color,
      dx.asInstanceOf,
      dy.asInstanceOf,
      spread.asInstanceOf,
      blur_radius.asInstanceOf
    ).asInstanceOf
  )
end OutsetShadowNode
