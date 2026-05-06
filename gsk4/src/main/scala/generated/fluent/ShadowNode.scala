package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskShadowNode

/** A render node drawing one or more shadows behind its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShadowNode(raw: Ptr[GskShadowNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the child `GskRenderNode` of the shadow @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_shadow_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the number of shadows in the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNShadows(): CUnsignedLongInt /* None */ =
    gsk_shadow_node_get_n_shadows(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).value

  /** Retrieves the shadow data at the given index @i.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_shadow/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(const GskShadow*)))"
  )
  private def getShadow__ = ???

end ShadowNode

object ShadowNode:
  /** Creates a `GskRenderNode` that will draw a @child with the given
    * @shadows
    *   below it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shadows]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(GskShadow)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GskShadow*)))"
  )
  private def `new`() = ???

end ShadowNode
