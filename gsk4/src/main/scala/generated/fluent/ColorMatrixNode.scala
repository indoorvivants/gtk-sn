package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorMatrixNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node controlling the color matrix of its single child node.
  */
class ColorMatrixNode(raw: Ptr[GskColorMatrixNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child node that is getting its colors modified by the given @node.
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_color_matrix_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color matrix used by the @node.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  def getColorMatrix__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color offset used by the @node.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Vec4), @type -> DataRecord(const graphene_vec4_t*)))"
  )
  def getColorOffset__ = ???

end ColorMatrixNode

object ColorMatrixNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will drawn the @child with
    * @color_matrix.
    *
    * In particular, the node will transform colors by applying
    *
    * pixel = transpose(color_matrix) * pixel + color_offset
    *
    * for every pixel. The transformation operates on unpremultiplied colors,
    * with color components ordered R, G, B, A.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  def `new`() = ???

end ColorMatrixNode
