package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskColorMatrixNode

/** A render node controlling the color matrix of its single child node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorMatrixNode(raw: Ptr[GskColorMatrixNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child node that is getting its colors modified by the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): RenderNode /* None */ = new RenderNode(
    gsk_color_matrix_node_get_child(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** Retrieves the color matrix used by the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color_matrix/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  private def getColorMatrix__ = ???

  /** Retrieves the color offset used by the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color_offset/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Vec4), @type -> DataRecord(const graphene_vec4_t*)))"
  )
  private def getColorOffset__ = ???

end ColorMatrixNode

object ColorMatrixNode:
  /** Creates a `GskRenderNode` that will drawn the @child with
    * @color_matrix.
    *
    * In particular, the node will transform colors by applying
    *
    * pixel = transpose(color_matrix) * pixel + color_offset
    *
    * for every pixel. The transformation operates on unpremultiplied colors,
    * with color components ordered R, G, B, A.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[color_matrix]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  private def `new`() = ???

end ColorMatrixNode
