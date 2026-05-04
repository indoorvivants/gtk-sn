package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskOutsetShadowNode

/** A render node for an outset shadow.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OutsetShadowNode(raw: Ptr[GskOutsetShadowNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the blur radius of the shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBlurRadius(): Float /* None */ =
    gsk_outset_shadow_node_get_blur_radius(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    )

  /** Retrieves the color of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_color/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def getColor__ = ???

  /** Retrieves the horizontal offset of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDx(): Float /* None */ = gsk_outset_shadow_node_get_dx(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** Retrieves the vertical offset of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDy(): Float /* None */ = gsk_outset_shadow_node_get_dy(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

  /** Retrieves the outline rectangle of the outset shadow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_outline/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def getOutline__ = ???

  /** Retrieves how much the shadow spreads outwards.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpread(): Float /* None */ = gsk_outset_shadow_node_get_spread(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  )

end OutsetShadowNode

object OutsetShadowNode:
  /** Creates a `GskRenderNode` that will render an outset shadow around the box
    * given by @outline.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[outline]: Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def `new`() = ???

end OutsetShadowNode
