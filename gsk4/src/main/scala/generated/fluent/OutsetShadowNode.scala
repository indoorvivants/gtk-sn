package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskOutsetShadowNode

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  def getColor__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def getOutline__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def `new`() = ???

end OutsetShadowNode
