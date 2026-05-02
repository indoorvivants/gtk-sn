package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskShadow
import sn.gnome.gsk4.internal.GskShadowNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node drawing one or more shadows behind its single child node.
  */
class ShadowNode(raw: Ptr[GskShadowNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the child `GskRenderNode` of the shadow @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_shadow_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of shadows in the @node.
    */
  def getNShadows(): CUnsignedLongInt /* None */ =
    gsk_shadow_node_get_n_shadows(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the shadow data at the given index @i.
    */
  def getShadow(
      i: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): Ptr[GskShadow] /* None */ = gsk_shadow_node_get_shadow(
    this.raw.asInstanceOf[Ptr[GskRenderNode]],
    gsize(i)
  )

end ShadowNode

object ShadowNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will draw a @child with the given
    * @shadows
    *   below it.
    */
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      shadows: Ptr[GskShadow /* None */ ] /* Some(Ptr[GskShadow]) */,
      n_shadows: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): ShadowNode = new ShadowNode(
    gsk_shadow_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      shadows,
      gsize(n_shadows)
    ).asInstanceOf
  )
end ShadowNode
