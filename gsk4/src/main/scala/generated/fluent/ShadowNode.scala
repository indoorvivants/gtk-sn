package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gsk4.fluent.RenderNode
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(const GskShadow*)))"
  )
  def getShadow__ = ???

end ShadowNode

object ShadowNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will draw a @child with the given
    * @shadows
    *   below it.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(GskShadow)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GskShadow*)))"
  )
  def `new`() = ???

end ShadowNode
