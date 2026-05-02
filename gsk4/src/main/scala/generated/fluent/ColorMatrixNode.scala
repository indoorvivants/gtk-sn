package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.graphene.internal.graphene_matrix_t
import sn.gnome.graphene.internal.graphene_vec4_t
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
  def getColorMatrix(): Ptr[graphene_matrix_t] /* None */ =
    gsk_color_matrix_node_get_color_matrix(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color offset used by the @node.
    */
  def getColorOffset(): Ptr[graphene_vec4_t] /* None */ =
    gsk_color_matrix_node_get_color_offset(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    )

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
  def apply(
      child: RenderNode /* Some(Ptr[GskRenderNode]) */,
      color_matrix: Ptr[
        graphene_matrix_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_matrix_t]) */,
      color_offset: Ptr[
        graphene_vec4_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec4_t]) */
  ): ColorMatrixNode = new ColorMatrixNode(
    gsk_color_matrix_node_new(
      child.getUnsafeRawPointer().asInstanceOf,
      color_matrix,
      color_offset
    ).asInstanceOf
  )
end ColorMatrixNode
