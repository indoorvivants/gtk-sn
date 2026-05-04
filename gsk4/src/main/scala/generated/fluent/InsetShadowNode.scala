package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskInsetShadowNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for an inset shadow.
  */
class InsetShadowNode(raw: Ptr[GskInsetShadowNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the blur radius to apply to the shadow.
    */
  def getBlurRadius(): Float /* None */ = gsk_inset_shadow_node_get_blur_radius(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color of the inset shadow.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  def getColor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the horizontal offset of the inset shadow.
    */
  def getDx(): Float /* None */ = gsk_inset_shadow_node_get_dx(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the vertical offset of the inset shadow.
    */
  def getDy(): Float /* None */ = gsk_inset_shadow_node_get_dy(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the outline rectangle of the inset shadow.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def getOutline__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves how much the shadow spreads inwards.
    */
  def getSpread(): Float /* None */ = gsk_inset_shadow_node_get_spread(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

end InsetShadowNode

object InsetShadowNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will render an inset shadow into the box
    * given by @outline.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def `new`() = ???

end InsetShadowNode
